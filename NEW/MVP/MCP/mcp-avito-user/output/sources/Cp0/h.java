package cp0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.generated.api.api_create_dispatch_vas_v_1.Offer;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiCreateDispatchVasV1Response.kt */
@P
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b,\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b0\u0010\u001aR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcp0/h;", "", "", "availableAudienceCount", "Lcp0/d;", "descriptions", "discountValue", "id", "Lcp0/f;", "itemInfo", "", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_vas_v_1/Offer;", "offers", "", "previewMessage", "price", "status", "Lcp0/j;", "tariff", "totalAmount", "Lcp0/k;", "vas", "<init>", "(JLcp0/d;Ljava/lang/Long;JLcp0/f;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Lcp0/j;JLcp0/k;)V", "J", "a", "()J", "Lcp0/d;", "b", "()Lcp0/d;", "Ljava/lang/Long;", "getDiscountValue", "()Ljava/lang/Long;", "c", "Lcp0/f;", "d", "()Lcp0/f;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "h", "Lcp0/j;", "i", "()Lcp0/j;", "getTotalAmount", "Lcp0/k;", "j", "()Lcp0/k;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    @com.google.gson.annotations.c("availableAudienceCount")
    private final long availableAudienceCount;

    @com.google.gson.annotations.c("descriptions")
    @Y61.k
    private final C39393d descriptions;

    @com.google.gson.annotations.c("discountValue")
    @l
    private final Long discountValue;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("itemInfo")
    @Y61.k
    private final C39395f itemInfo;

    @com.google.gson.annotations.c("offers")
    @Y61.k
    private final List<Offer> offers;

    @com.google.gson.annotations.c("previewMessage")
    @Y61.k
    private final String previewMessage;

    @com.google.gson.annotations.c("price")
    private final long price;

    @com.google.gson.annotations.c("status")
    @Y61.k
    private final String status;

    @com.google.gson.annotations.c("tariff")
    @l
    private final j tariff;

    @com.google.gson.annotations.c("totalAmount")
    private final long totalAmount;

    @com.google.gson.annotations.c("vas")
    @l
    private final k vas;

    public h(long j12, @Y61.k C39393d c39393d, @l Long l12, long j13, @Y61.k C39395f c39395f, @Y61.k List<Offer> list, @Y61.k String str, long j14, @Y61.k String str2, @l j jVar, long j15, @l k kVar) {
        this.availableAudienceCount = j12;
        this.descriptions = c39393d;
        this.discountValue = l12;
        this.id = j13;
        this.itemInfo = c39395f;
        this.offers = list;
        this.previewMessage = str;
        this.price = j14;
        this.status = str2;
        this.tariff = jVar;
        this.totalAmount = j15;
        this.vas = kVar;
    }

    /* renamed from: a, reason: from getter */
    public final long getAvailableAudienceCount() {
        return this.availableAudienceCount;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C39393d getDescriptions() {
        return this.descriptions;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final C39395f getItemInfo() {
        return this.itemInfo;
    }

    @Y61.k
    public final List<Offer> e() {
        return this.offers;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getPreviewMessage() {
        return this.previewMessage;
    }

    /* renamed from: g, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final j getTariff() {
        return this.tariff;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final k getVas() {
        return this.vas;
    }
}
