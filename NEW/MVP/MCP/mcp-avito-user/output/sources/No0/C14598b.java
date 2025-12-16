package No0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.Offer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchResponse.kt */
@P
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001:\u00019By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u0016\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"LNo0/b;", "", "", "id", "availableAudienceCount", "", "previewMessage", "price", "status", "LNo0/d;", "itemInfo", "", "Lcom/avito/android/sbc/Offer;", "offers", "LNo0/g;", "tariff", "LNo0/h;", "vas", "LNo0/c;", "descriptions", "", "autoDispatchFeatureSupport", "autoDispatchEnabledByDefault", "<init>", "(JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;LNo0/d;Ljava/util/List;LNo0/g;LNo0/h;LNo0/c;Ljava/lang/Boolean;Z)V", "J", "getId", "()J", "getAvailableAudienceCount", "Ljava/lang/String;", "getPreviewMessage", "()Ljava/lang/String;", "Ljava/lang/Long;", "getPrice", "()Ljava/lang/Long;", "getStatus", "LNo0/d;", "getItemInfo", "()LNo0/d;", "Ljava/util/List;", "getOffers", "()Ljava/util/List;", "LNo0/g;", "getTariff", "()LNo0/g;", "LNo0/h;", "getVas", "()LNo0/h;", "LNo0/c;", "getDescriptions", "()LNo0/c;", "Ljava/lang/Boolean;", "getAutoDispatchFeatureSupport", "()Ljava/lang/Boolean;", "Z", "getAutoDispatchEnabledByDefault", "()Z", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: No0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C14598b {

    @com.google.gson.annotations.c("autoDispatchEnabledByDefault")
    private final boolean autoDispatchEnabledByDefault;

    @com.google.gson.annotations.c("autoDispatchFeatureSupport")
    @l
    private final Boolean autoDispatchFeatureSupport;

    @com.google.gson.annotations.c("availableAudienceCount")
    private final long availableAudienceCount;

    @com.google.gson.annotations.c("descriptions")
    @l
    private final C14599c descriptions;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("itemInfo")
    @k
    private final d itemInfo;

    @com.google.gson.annotations.c("offers")
    @k
    private final List<Offer> offers;

    @com.google.gson.annotations.c("previewMessage")
    @k
    private final String previewMessage;

    @com.google.gson.annotations.c("price")
    @l
    private final Long price;

    @com.google.gson.annotations.c("status")
    @l
    private final String status;

    @com.google.gson.annotations.c("tariff")
    @l
    private final g tariff;

    @com.google.gson.annotations.c("vas")
    @l
    private final h vas;

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"LNo0/b$a;", "", "<init>", "()V", "", "AUTO_DISPATCH_ENABLED_BY_DEFAULT", "Ljava/lang/String;", "AUTO_DISPATCH_FEATURE_SUPPORT", "AVAILABLE_AUDIENCE_COUNT", "DESCRIPTIONS", "ID", "ITEM_INFO", "OFFERS", "PREVIEW_MESSAGE", "PRICE", "STATUS", "TARIFF", "VAS", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: No0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14598b(long j12, long j13, @k String str, @l Long l12, @l String str2, @k d dVar, @k List<? extends Offer> list, @l g gVar, @l h hVar, @l C14599c c14599c, @l Boolean bool, boolean z12) {
        this.id = j12;
        this.availableAudienceCount = j13;
        this.previewMessage = str;
        this.price = l12;
        this.status = str2;
        this.itemInfo = dVar;
        this.offers = list;
        this.tariff = gVar;
        this.vas = hVar;
        this.descriptions = c14599c;
        this.autoDispatchFeatureSupport = bool;
        this.autoDispatchEnabledByDefault = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14598b)) {
            return false;
        }
        C14598b c14598b = (C14598b) obj;
        return this.id == c14598b.id && this.availableAudienceCount == c14598b.availableAudienceCount && L.f(this.previewMessage, c14598b.previewMessage) && L.f(this.price, c14598b.price) && L.f(this.status, c14598b.status) && L.f(this.itemInfo, c14598b.itemInfo) && L.f(this.offers, c14598b.offers) && L.f(this.tariff, c14598b.tariff) && L.f(this.vas, c14598b.vas) && L.f(this.descriptions, c14598b.descriptions) && L.f(this.autoDispatchFeatureSupport, c14598b.autoDispatchFeatureSupport) && this.autoDispatchEnabledByDefault == c14598b.autoDispatchEnabledByDefault;
    }

    public final int hashCode() {
        int iD2 = H.d(r.g(Long.hashCode(this.id) * 31, 31, this.availableAudienceCount), 31, this.previewMessage);
        Long l12 = this.price;
        int iHashCode = (iD2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.status;
        int iE2 = H.e((this.itemInfo.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.offers);
        g gVar = this.tariff;
        int iHashCode2 = (iE2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.vas;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        C14599c c14599c = this.descriptions;
        int iHashCode4 = (iHashCode3 + (c14599c == null ? 0 : c14599c.hashCode())) * 31;
        Boolean bool = this.autoDispatchFeatureSupport;
        return Boolean.hashCode(this.autoDispatchEnabledByDefault) + ((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateDiscountDispatchResponse(id=");
        sb2.append(this.id);
        sb2.append(", availableAudienceCount=");
        sb2.append(this.availableAudienceCount);
        sb2.append(", previewMessage=");
        sb2.append(this.previewMessage);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", itemInfo=");
        sb2.append(this.itemInfo);
        sb2.append(", offers=");
        sb2.append(this.offers);
        sb2.append(", tariff=");
        sb2.append(this.tariff);
        sb2.append(", vas=");
        sb2.append(this.vas);
        sb2.append(", descriptions=");
        sb2.append(this.descriptions);
        sb2.append(", autoDispatchFeatureSupport=");
        sb2.append(this.autoDispatchFeatureSupport);
        sb2.append(", autoDispatchEnabledByDefault=");
        return r.x(sb2, this.autoDispatchEnabledByDefault, ')');
    }
}
