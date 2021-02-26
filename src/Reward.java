//Parent(s): LoyaltyProgram, LoyaltyTier
//Children: Points, Promotion

public class Reward {

	int rewardID;
	String name;
	int pointsCost;
	String description;
	
	public Reward(int rID, String n, int pC, String d) {
		rewardID = rID;
		name = n;
		pointsCost = pC;
		description = d;
	}

	//Getters and setters
	
	public int getRewardID() {
		return rewardID;
	}

	public void setRewardID(int rewardID) {
		this.rewardID = rewardID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPointsCost() {
		return pointsCost;
	}

	public void setPointsCost(int pointsCost) {
		this.pointsCost = pointsCost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	//Methods
	
	//void Reward
	
	void displayAllRewards(rewardList) {
		
	}
	
	Rewards, findRewards(Rewards) {
		
	}
}
