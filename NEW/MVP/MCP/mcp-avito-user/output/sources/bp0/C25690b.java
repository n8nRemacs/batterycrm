package bp0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.generated.api.api_create_dispatch_v_1.Offer;
import kotlin.Metadata;

/* compiled from: ApiCreateDispatchV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lbp0/b;", "", "", "discountValue", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer;", "offer", "", "slug", "title", "<init>", "(Ljava/lang/Long;Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer;", "b", "()Lcom/avito/android/sbc/generated/api/api_create_dispatch_v_1/Offer;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bp0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C25690b {

    @com.google.gson.annotations.c("discountValue")
    @l
    private final Long discountValue;

    @com.google.gson.annotations.c("offer")
    @k
    private final Offer offer;

    @com.google.gson.annotations.c("slug")
    @k
    private final String slug;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C25690b(@l Long l12, @k Offer offer, @k String str, @k String str2) {
        this.discountValue = l12;
        this.offer = offer;
        this.slug = str;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getDiscountValue() {
        return this.discountValue;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Offer getOffer() {
        return this.offer;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
