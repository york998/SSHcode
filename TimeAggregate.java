import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;. from: 1point3acres.com/bbs 
public class Solution {
	private static MyDate startDate;. 1point3acres.com/bbs
	private static MyDate endDate;
	private static List<Request> requstList = new ArrayList<>
	();
	private static List<OutputEntity> outputEntities = new
	ArrayList<>();
	public static void main(String args[] ) throws Exception
	{
		/* Enter your code here. Read input from STDIN. Print
		output to STDOUT */
		Scanner input = new Scanner(System.in);
		int index = 0;
		while(input.hasNextLine())
		{
			String newLine = input.nextLine();
			index ++;
			if(newLine.equalsIgnoreCase("stop"))
			{
				break;
			}
			if (1 == index)
			{
				createStartAndEndDate(newLine);
			}
			else if(3 <= index)
			{
				Request request = createRequestFromString(newLine);
				if (isValidRequest(request))
				{
					requstList.add(request);
				}
			}
			else
			{
		//do nothing
			}
		}
		sortRequestList();
		mergeRequestList(); 
		for(OutputEntity outputEntity : outputEntities)
		{
			System.out.println(outputEntity.toString());
		}
	}
	private static void createStartAndEndDate(String str)
	{
		String[] splitedStr = str.split(", *");
		startDate =
		createDateFromString(splitedStr[0].trim());
		endDate = createDateFromString(splitedStr[1].trim());
		. From 1point 3acres bbs
	}
	private static MyDate createDateFromString(String str)
	{
		MyDate date = null;
		String[] splitStr = str.split("-");
		if (2 == splitStr.length)
		{
			date = new 
			MyDate(Integer.parseInt(splitStr[0].trim()),
				Integer.parseInt(splitStr[1].trim()), 1);
		}.鐣欏璁哄潧-涓€浜�-涓夊垎鍦�
		else if (3 == splitStr.length).鐣欏璁哄潧-涓€浜�-涓夊垎鍦�
		{
			date = new MyDate(Integer.parseInt(splitStr[0].trim()),
				Integer.parseInt(splitStr[1].trim()),
				Integer.parseInt(splitStr[2].trim()));
		}
		return date;
	}
	private static Request createRequestFromString(String str)
	{
		String[] splitStr = str.split(", *");
		MyDate date =
		createDateFromString(splitStr[0].trim());
		Engagement engagement = new Engagement(splitStr[1].trim(), Integer.parseInt(splitStr[2].trim()));
		Request request = new Request(date, engagement);
		return request;
	}
	private static boolean isValidRequest(Request request)
	{
		MyDate date = request.getDate();
		return date.compareTo(startDate) <= 0 &&
		date.compareTo(endDate) > 0;
	}
	private static void sortRequestList()
	{
		RequestComparator requestComparator = new
		RequestComparator();
		Collections.sort(requstList, requestComparator);. Waral 鍗氬鏈夋洿澶氭枃绔�,
	}
	private static void mergeRequestList()
	{
		if (requstList.size() <= 1)
		{
			return;-google 1point3acres
		}
		List<Request> tempList = new ArrayList<>();. 鐗涗汉浜戦泦,涓€浜╀笁鍒嗗湴
		OutputEntity last = new. 鍥磋鎴戜滑@1point 3 acres
		OutputEntity(requstList.get(0));
		for(int i = 1; i < requstList.size(); i ++)
		{
			Request current = requstList.get(i);-google 1point3acres
			if
				(last.getDate().isInSameMonth(current.getDate())). 1point 3acres 璁哄潧
			{
				last.addEngagement(current.getEngagement());
			}. From 1point 3acres bbs
			else
			{
				outputEntities.add(last);
				last = new OutputEntity(current);
			}
		}
		outputEntities.add(last);
	}
}c
lass Engagement {
	private String type;
	private int count;
	public Engagement(String type, int count) {
		this.type = type;
		this.count = count;-google 1point3acres
	}. 鍥磋鎴戜滑@1point 3 acres
	public String getType() {
		return type;
	}.鏈枃鍘熷垱鑷�1point3acres璁哄潧
	public void setType(String type) {
		this.type = type;
	}. 1point 3acres 璁哄潧
	public int getCount() {
		return count;
	}
	public void setCount(int count) {. Waral 鍗氬鏈夋洿澶氭枃绔�,
		this.count = count; 鏉ユ簮涓€浜�.涓夊垎鍦拌鍧�. 
	}
	@Override
	public String toString() {
		return this.type + ", " + this.count;
	}. From 1point 3acres bbs
}c
lass MyDate {
	private int year;
	private int month;. from: 1point3acres.com/bbs 
	private int day;
	public MyDate(int year, int month, int day) {
		
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {. 1point3acres.com/bbs
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.year);
		sb.append('-');
		if (this.month < 10)
			{. visit 1point3acres.com for more.
				sb.append('0');
			}
			sb.append(this.month);
			return sb.toString();
		}
		public boolean isInSameMonth(MyDate another)
		{
			return this.year == another.getYear() && this.month
			== another.getMonth();
		}
		public int compareTo(MyDate another)
		{
			if (this.year > another.getYear())
			{
				return -1;. 1point3acres.com/bbs
			}
			else if (this.year == another.getYear())
			{
				if (this.month > another.getMonth())
				{
					return -1;. 1point 3acres 璁哄潧
				}. visit 1point3acres.com for more.
				else if (this.month == another.getMonth())
				{
						if (this.day > another.getDay())
						{
							return -1;
						}
						else if (this.day == another.getDay())
						{
							return 0;
						}
						else
						{
							return 1;
						}
					}
					else
					{
						return 1;
					}
				}
				else
					{
						return 1;
					}
				}
			}

			class OutputEntity {
				private MyDate date;
				private Map<String, Integer> map;
				public OutputEntity(Request request) {. From 1point 3acres bbs
					this.date = request.getDate();
					map = new TreeMap<>();
					map.put(request.getEngagement().getType(),. from: 1point3acres.com/bbs 
						request.getEngagement().getCount());
				}
				public MyDate getDate() {
					return date;
				}
				public void setDate(MyDate date) {
					this.date = date;
				}. visit 1point3acres.com for more.
				public Map<String, Integer> getMap() {
					return map;
				}
				public void setMap(Map<String, Integer> map) {
					this.map = map;
				}
				public void addEngagement(Engagement engagement)
				{
					String type = engagement.getType();. 1point 3acres 璁哄潧
					int count = engagement.getCount();
					if (map.containsKey(type))
					{
						Integer newValue = map.get(type) + count;
						map.replace(type, newValue);. 涓€浜�-涓夊垎-鍦帮紝鐙鍙戝竷
					}
					else
					{
						map.put(type, count);
					}
				}
				@Override
				public String toString() {-google 1point3acres
					StringBuilder sb = new StringBuilder();
					sb.append(this.date.toString());
					for(Map.Entry<String, Integer> entry :
						map.entrySet())
					{
						sb.append(", ");. more info on 1point3acres.com
						sb.append(entry.getKey());
						sb.append(", ");.鏈枃鍘熷垱鑷�1point3acres璁哄潧
						sb.append(entry.getValue().toString());
					}
					return sb.toString();
				}
			}

			class Request {
				private MyDate date;
				private Engagement engagement;
				public Request(MyDate date, Engagement engagements) {
					this.date = date;
					this.engagement = engagements;
				}
				public MyDate getDate() {
					return date;
				}
				public void setDate(MyDate date) {
					this.date = date;
				}
				public Engagement getEngagement() {
					return engagement;
				}
				public void setEngagements(Engagement engagements) {
					this.engagement = engagements;
				}
			}

			class RequestComparator implements Comparator {
				@Override
				public int compare(Object o1, Object o2) {
					if (null == o1)
					{
						return 1;
					}
					if (null == o2)
					{
						return -1;
					}
					Request r1 = (Request)o1;
					Request r2 = (Request)o2;
					return r1.getDate().compareTo(r2.getDate());
				}
			}