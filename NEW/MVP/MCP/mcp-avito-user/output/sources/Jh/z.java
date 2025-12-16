package jh;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: BbipPrivateForecastResult.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b%\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b'\u0010!R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b(\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b)\u0010$R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b*\u0010!R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b4\u0010!R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b5\u0010!¨\u00066"}, d2 = {"Ljh/z;", "", "", "selected", "", "price", "", "priceFormatted", "budget", "budgetFormatted", "discountPct", "discountPctFormatted", "dailyPrice", "dailyBudget", "forecast", "", "id", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "contact", "Ljh/B;", "widget", "dailyPriceFormatted", "dailyBudgetFormatted", "<init>", "(ZJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/String;ILcom/avito/android/mnz_common/data/MnzFloatingFooterContact;Ljh/B;Ljava/lang/String;Ljava/lang/String;)V", "Z", "n", "()Z", "J", "l", "()J", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "b", "h", "i", "f", "d", "j", "I", "k", "()I", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "c", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "Ljh/B;", "o", "()Ljh/B;", "g", "e", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class z {

    @com.google.gson.annotations.c("budget")
    @Y61.l
    private final Long budget;

    @com.google.gson.annotations.c("budgetFormatted")
    @Y61.l
    private final String budgetFormatted;

    @com.google.gson.annotations.c("bblContacts")
    @Y61.l
    private final MnzFloatingFooterContact contact;

    @com.google.gson.annotations.c("dailyBudget")
    @Y61.l
    private final Long dailyBudget;

    @com.google.gson.annotations.c("dailyBudgetFormatted")
    @Y61.l
    private final String dailyBudgetFormatted;

    @com.google.gson.annotations.c("dailyPrice")
    private final long dailyPrice;

    @com.google.gson.annotations.c("dailyPriceFormatted")
    @Y61.l
    private final String dailyPriceFormatted;

    @com.google.gson.annotations.c("discountPct")
    @Y61.l
    private final Long discountPct;

    @com.google.gson.annotations.c("discountPctFormatted")
    @Y61.l
    private final String discountPctFormatted;

    @com.google.gson.annotations.c("forecast")
    @Y61.k
    private final String forecast;

    @com.google.gson.annotations.c("id")
    private final int id;

    @com.google.gson.annotations.c("price")
    private final long price;

    @com.google.gson.annotations.c("priceFormatted")
    @Y61.k
    private final String priceFormatted;

    @com.google.gson.annotations.c("selected")
    private final boolean selected;

    @com.google.gson.annotations.c("widget")
    @Y61.l
    private final C42377B widget;

    static {
        Parcelable.Creator<MnzFloatingFooterContact> creator = MnzFloatingFooterContact.CREATOR;
    }

    public z(boolean z12, long j12, @Y61.k String str, @Y61.l Long l12, @Y61.l String str2, @Y61.l Long l13, @Y61.l String str3, long j13, @Y61.l Long l14, @Y61.k String str4, int i12, @Y61.l MnzFloatingFooterContact mnzFloatingFooterContact, @Y61.l C42377B c42377b, @Y61.l String str5, @Y61.l String str6) {
        this.selected = z12;
        this.price = j12;
        this.priceFormatted = str;
        this.budget = l12;
        this.budgetFormatted = str2;
        this.discountPct = l13;
        this.discountPctFormatted = str3;
        this.dailyPrice = j13;
        this.dailyBudget = l14;
        this.forecast = str4;
        this.id = i12;
        this.contact = mnzFloatingFooterContact;
        this.widget = c42377b;
        this.dailyPriceFormatted = str5;
        this.dailyBudgetFormatted = str6;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getBudget() {
        return this.budget;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getBudgetFormatted() {
        return this.budgetFormatted;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final MnzFloatingFooterContact getContact() {
        return this.contact;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Long getDailyBudget() {
        return this.dailyBudget;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getDailyBudgetFormatted() {
        return this.dailyBudgetFormatted;
    }

    /* renamed from: f, reason: from getter */
    public final long getDailyPrice() {
        return this.dailyPrice;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getDailyPriceFormatted() {
        return this.dailyPriceFormatted;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final Long getDiscountPct() {
        return this.discountPct;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getDiscountPctFormatted() {
        return this.discountPctFormatted;
    }

    @Y61.k
    /* renamed from: j, reason: from getter */
    public final String getForecast() {
        return this.forecast;
    }

    /* renamed from: k, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: l, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    @Y61.k
    /* renamed from: m, reason: from getter */
    public final String getPriceFormatted() {
        return this.priceFormatted;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @Y61.l
    /* renamed from: o, reason: from getter */
    public final C42377B getWidget() {
        return this.widget;
    }

    public /* synthetic */ z(boolean z12, long j12, String str, Long l12, String str2, Long l13, String str3, long j13, Long l14, String str4, int i12, MnzFloatingFooterContact mnzFloatingFooterContact, C42377B c42377b, String str5, String str6, int i13, C42822w c42822w) {
        this(z12, j12, str, l12, str2, l13, str3, j13, l14, str4, i12, mnzFloatingFooterContact, (i13 & 4096) != 0 ? null : c42377b, (i13 & 8192) != 0 ? null : str5, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str6);
    }
}
