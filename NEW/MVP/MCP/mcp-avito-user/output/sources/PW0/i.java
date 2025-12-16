package pw0;

import com.avito.android.short_term_rent.common.entity.PromoCode;
import com.avito.android.short_term_rent.common.entity.PromoCodesDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/i;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final PromoCode f428880a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final PromoCodesDialog f428881b;

    public i(@Y61.l PromoCode promoCode, @Y61.l PromoCodesDialog promoCodesDialog) {
        this.f428880a = promoCode;
        this.f428881b = promoCodesDialog;
    }

    public static i a(i iVar, PromoCode promoCode) {
        PromoCodesDialog promoCodesDialog = iVar.f428881b;
        iVar.getClass();
        return new i(promoCode, promoCodesDialog);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f428880a, iVar.f428880a) && L.f(this.f428881b, iVar.f428881b);
    }

    public final int hashCode() {
        PromoCode promoCode = this.f428880a;
        int iHashCode = (promoCode == null ? 0 : promoCode.hashCode()) * 31;
        PromoCodesDialog promoCodesDialog = this.f428881b;
        return iHashCode + (promoCodesDialog != null ? promoCodesDialog.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "PromoCodeData(selectedPromoCode=" + this.f428880a + ", promoCodesDialog=" + this.f428881b + ')';
    }
}
