package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PicTag extends SimpleTagSupport {
	private String reference;
	private int border = 0;
	private int height = 0;
	private int width = 0;
	private String label;
	
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public int getBorder() {
		return border;
	}
	
	public void setBorder(int border) {
		this.border = border;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		
		if (label != null) {
			out.println("<p>" + label + "</p>");
		} else {
			out.println("<p></p>");
		}
		
		out.print("<img src='" + reference + "' ");
		
		if (height > 0) {
			out.print("height='" + height + "' ");
		}
		
		if (width > 0) {
			out.print("width='" + width + "' ");
		}
		
		if (border > 0) {
			out.print("border='" + border + "px solid black'");
		}
		out.println(">");
	}
}
