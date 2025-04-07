package kadai_018;

public abstract  class Kato_Chapter18 {//abstract処理内容が確定していないクラスのこと。
	public String familyName;//姓を表すフィールド（情報）
    public String givenName;//名を表すフィールド
    public String address;//住所を表すフィールド

    public Kato_Chapter18(String familyName, String givenName, String address) {//コンストラクタ有効な値が入っている状態にすること。
        this.familyName = familyName;
        this.givenName = givenName;
        this.address = address;
    }

    public void commonIntroduce() {//共通の紹介を出力するためのコード
        System.out.println("私の名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    abstract public void eachIntroduce();//個別の紹介を出力するためのコード

    public void execIntroduce() {//紹介を実行するためのコード
        commonIntroduce();//共通の紹介
        eachIntroduce();//個別の紹介
        System.out.println();//↑出力するためのコード
	
    }
	}


