package nw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.short_term_rent.common.entity.PromoCode;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSoftBookingPromoCodesState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnw0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f419237m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final c f419238n = new c(null, null, null, null, C42784z0.f406748b, false, false, false, null, null, StrSoftBookingPromoCodesDialogResult.Dismiss.f282509b);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f419239b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f419240c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f419241d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f419242e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<PromoCode> f419243f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f419244g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f419245h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f419246i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f419247j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final PromoCode f419248k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final StrSoftBookingPromoCodesDialogResult f419249l;

    /* compiled from: StrSoftBookingPromoCodesState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnw0/c$a;", "", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l String str, @l String str2, @l String str3, @l String str4, @k List list, boolean z12, boolean z13, boolean z14, @l String str5, @l PromoCode promoCode, @k StrSoftBookingPromoCodesDialogResult strSoftBookingPromoCodesDialogResult) {
        this.f419239b = str;
        this.f419240c = str2;
        this.f419241d = str3;
        this.f419242e = str4;
        this.f419243f = list;
        this.f419244g = z12;
        this.f419245h = z13;
        this.f419246i = z14;
        this.f419247j = str5;
        this.f419248k = promoCode;
        this.f419249l = strSoftBookingPromoCodesDialogResult;
    }

    public static c a(c cVar, String str, String str2, String str3, String str4, List list, boolean z12, boolean z13, boolean z14, String str5, PromoCode promoCode, StrSoftBookingPromoCodesDialogResult strSoftBookingPromoCodesDialogResult, int i12) {
        String str6 = (i12 & 1) != 0 ? cVar.f419239b : str;
        String str7 = (i12 & 2) != 0 ? cVar.f419240c : str2;
        String str8 = (i12 & 4) != 0 ? cVar.f419241d : str3;
        String str9 = (i12 & 8) != 0 ? cVar.f419242e : str4;
        List list2 = (i12 & 16) != 0 ? cVar.f419243f : list;
        boolean z15 = (i12 & 32) != 0 ? cVar.f419244g : z12;
        cVar.getClass();
        boolean z16 = (i12 & 128) != 0 ? cVar.f419245h : z13;
        boolean z17 = (i12 & 256) != 0 ? cVar.f419246i : z14;
        String str10 = (i12 & 512) != 0 ? cVar.f419247j : str5;
        PromoCode promoCode2 = (i12 & 1024) != 0 ? cVar.f419248k : promoCode;
        StrSoftBookingPromoCodesDialogResult strSoftBookingPromoCodesDialogResult2 = (i12 & 2048) != 0 ? cVar.f419249l : strSoftBookingPromoCodesDialogResult;
        cVar.getClass();
        return new c(str6, str7, str8, str9, list2, z15, z16, z17, str10, promoCode2, strSoftBookingPromoCodesDialogResult2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f419239b, cVar.f419239b) && L.f(this.f419240c, cVar.f419240c) && L.f(this.f419241d, cVar.f419241d) && L.f(this.f419242e, cVar.f419242e) && L.f(this.f419243f, cVar.f419243f) && this.f419244g == cVar.f419244g && this.f419245h == cVar.f419245h && this.f419246i == cVar.f419246i && L.f(this.f419247j, cVar.f419247j) && L.f(this.f419248k, cVar.f419248k) && L.f(this.f419249l, cVar.f419249l);
    }

    public final int hashCode() {
        String str = this.f419239b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f419240c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f419241d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f419242e;
        int i12 = r.i(r.i(r.i(r.i(H.e((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f419243f), 31, this.f419244g), 31, false), 31, this.f419245h), 31, this.f419246i);
        String str5 = this.f419247j;
        int iHashCode4 = (i12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PromoCode promoCode = this.f419248k;
        return this.f419249l.hashCode() + ((iHashCode4 + (promoCode != null ? promoCode.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "StrSoftBookingPromoCodesState(title=" + this.f419239b + ", buttonTitle=" + this.f419240c + ", inputPlaceHolder=" + this.f419241d + ", inputPromoCodeValue=" + this.f419242e + ", promoCodes=" + this.f419243f + ", isApplyButtonEnabled=" + this.f419244g + ", isKeyboardVisible=false, isLoading=" + this.f419245h + ", isValidationErrorVisible=" + this.f419246i + ", validationErrorMessage=" + this.f419247j + ", selectedPromoCode=" + this.f419248k + ", closeResult=" + this.f419249l + ')';
    }
}
