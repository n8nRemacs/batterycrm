package PO0;

import kotlin.Metadata;

/* compiled from: GetWalletServiceInfoResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, d2 = {"LPO0/d;", "", "", "bonus", "bonuses", "bonusesInfoLink", "bonusesTextStyle", "bonusesTitle", "money", "moneyTextStyle", "moneyTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getBonus", "()Ljava/lang/String;", "a", "b", "c", "d", "e", "f", "g", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d {

    @com.google.gson.annotations.c("bonus")
    @Y61.l
    private final String bonus;

    @com.google.gson.annotations.c("bonuses")
    @Y61.l
    private final String bonuses;

    @com.google.gson.annotations.c("bonusesInfoLink")
    @Y61.l
    private final String bonusesInfoLink;

    @com.google.gson.annotations.c("bonusesTextStyle")
    @Y61.l
    private final String bonusesTextStyle;

    @com.google.gson.annotations.c("bonusesTitle")
    @Y61.l
    private final String bonusesTitle;

    @com.google.gson.annotations.c("money")
    @Y61.k
    private final String money;

    @com.google.gson.annotations.c("moneyTextStyle")
    @Y61.l
    private final String moneyTextStyle;

    @com.google.gson.annotations.c("moneyTitle")
    @Y61.l
    private final String moneyTitle;

    public d(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k String str6, @Y61.l String str7, @Y61.l String str8) {
        this.bonus = str;
        this.bonuses = str2;
        this.bonusesInfoLink = str3;
        this.bonusesTextStyle = str4;
        this.bonusesTitle = str5;
        this.money = str6;
        this.moneyTextStyle = str7;
        this.moneyTitle = str8;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getBonuses() {
        return this.bonuses;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getBonusesInfoLink() {
        return this.bonusesInfoLink;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getBonusesTextStyle() {
        return this.bonusesTextStyle;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getBonusesTitle() {
        return this.bonusesTitle;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getMoney() {
        return this.money;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final String getMoneyTextStyle() {
        return this.moneyTextStyle;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getMoneyTitle() {
        return this.moneyTitle;
    }
}
