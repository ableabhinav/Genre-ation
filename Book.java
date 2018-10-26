//This class saves book details, and makes a arraylist of those books
import java.util.*;
import java.io.*;
public class Book implements Serializable 
{
	public String name;
	public String author;
	public String publication;
	public String category;
	public float price;
	public int quantity;
	Book()
	{
		name = NULL;
		author = NULL;
		publication = NULL;
		category = NULL;
		price = 0;
		quantity = 0;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setPub(String publication)
	{
		this.publication = publication;
	}
	public void setCategory(String category)
	{
		this.category = category;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	public void setQuantity(String quantity)
	{
		this.quantity = quantity;
	}
	public String getName()
	{
		return name;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getPub()
	{
		return publication;
	}
	public String getCategory()
	{
		return category;
	}
	public float setPrice(String price)
	{
		return price;
	}
	public int setQuantity(String quantity)
	{
		return quantity;
	}
}

public class bookInventory
{
	ArrayList<Book> bookList = new ArrayList<>();
	int functionOf()
	{
		Book B = new Book();
		B.setName();
		B.setAuthor();
		B.setPub();
		B.setCategory();
		B.setPrice();
		B.setQuantity();
		ListIterator lt = bookList.listIterator();
		
		while(lt.hasnext())
		{

			if(bookList[i].name==B.getName())
		}
	}
}