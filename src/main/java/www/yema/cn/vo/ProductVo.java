package www.yema.cn.vo;

public class ProductVo {
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 商品主图
	 */
	private String pictUrl;
	
    /**
         * 商品一口价格
     */
	private String reservePrice;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPictUrl() {
		return pictUrl;
	}

	public void setPictUrl(String pictUrl) {
		this.pictUrl = pictUrl;
	}

	public String getReservePrice() {
		return reservePrice;
	}

	public void setReservePrice(String reservePrice) {
		this.reservePrice = reservePrice;
	}
	
	

}
