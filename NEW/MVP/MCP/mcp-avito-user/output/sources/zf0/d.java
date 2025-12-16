package ZF0;

import Y61.k;
import Y61.l;
import YF0.o;
import ZF0.e;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZF0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f20040m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final d f20041n;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20042b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20043c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ApiError f20044d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final o.b f20045e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f20046f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final b f20047g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20048h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final e f20049i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20050j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final LocalDate f20051k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final LocalDate f20052l;

    /* compiled from: TrxPromoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZF0/d$a;", "", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        b.f20028d.getClass();
        b bVar = b.f20029e;
        e.f20053a.getClass();
        e.d dVar = e.f20054b;
        com.avito.android.trx_promo_impl.b bVar2 = com.avito.android.trx_promo_impl.b.f303905a;
        bVar2.getClass();
        LocalDate localDate = com.avito.android.trx_promo_impl.b.f303906b;
        bVar2.getClass();
        f20041n = new d(false, false, null, null, bVar, null, false, dVar, 0, localDate, localDate);
    }

    public d(boolean z12, boolean z13, @l ApiError apiError, @l o.b bVar, @k b bVar2, @l b bVar3, boolean z14, @k e eVar, int i12, @k LocalDate localDate, @k LocalDate localDate2) {
        this.f20042b = z12;
        this.f20043c = z13;
        this.f20044d = apiError;
        this.f20045e = bVar;
        this.f20046f = bVar2;
        this.f20047g = bVar3;
        this.f20048h = z14;
        this.f20049i = eVar;
        this.f20050j = i12;
        this.f20051k = localDate;
        this.f20052l = localDate2;
    }

    public static d a(d dVar, boolean z12, boolean z13, ApiError apiError, o.b bVar, b bVar2, b bVar3, boolean z14, e eVar, int i12, LocalDate localDate, LocalDate localDate2, int i13) {
        boolean z15 = (i13 & 1) != 0 ? dVar.f20042b : z12;
        boolean z16 = (i13 & 2) != 0 ? dVar.f20043c : z13;
        ApiError apiError2 = (i13 & 4) != 0 ? dVar.f20044d : apiError;
        o.b bVar4 = (i13 & 8) != 0 ? dVar.f20045e : bVar;
        b bVar5 = (i13 & 16) != 0 ? dVar.f20046f : bVar2;
        b bVar6 = (i13 & 32) != 0 ? dVar.f20047g : bVar3;
        boolean z17 = (i13 & 64) != 0 ? dVar.f20048h : z14;
        e eVar2 = (i13 & 128) != 0 ? dVar.f20049i : eVar;
        int i14 = (i13 & 256) != 0 ? dVar.f20050j : i12;
        LocalDate localDate3 = (i13 & 512) != 0 ? dVar.f20051k : localDate;
        LocalDate localDate4 = (i13 & 1024) != 0 ? dVar.f20052l : localDate2;
        dVar.getClass();
        return new d(z15, z16, apiError2, bVar4, bVar5, bVar6, z17, eVar2, i14, localDate3, localDate4);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f20042b == dVar.f20042b && this.f20043c == dVar.f20043c && L.f(this.f20044d, dVar.f20044d) && L.f(this.f20045e, dVar.f20045e) && L.f(this.f20046f, dVar.f20046f) && L.f(this.f20047g, dVar.f20047g) && this.f20048h == dVar.f20048h && L.f(this.f20049i, dVar.f20049i) && this.f20050j == dVar.f20050j && L.f(this.f20051k, dVar.f20051k) && L.f(this.f20052l, dVar.f20052l);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f20042b) * 31, 31, this.f20043c);
        ApiError apiError = this.f20044d;
        int iHashCode = (i12 + (apiError == null ? 0 : apiError.hashCode())) * 31;
        o.b bVar = this.f20045e;
        int iHashCode2 = (this.f20046f.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        b bVar2 = this.f20047g;
        return this.f20052l.hashCode() + ((this.f20051k.hashCode() + r.e(this.f20050j, (this.f20049i.hashCode() + r.i((iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31, 31, this.f20048h)) * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoState(isClosable=");
        sb2.append(this.f20042b);
        sb2.append(", isLoading=");
        sb2.append(this.f20043c);
        sb2.append(", error=");
        sb2.append(this.f20044d);
        sb2.append(", lastResultV7=");
        sb2.append(this.f20045e);
        sb2.append(", initialInputState=");
        sb2.append(this.f20046f);
        sb2.append(", currentInputState=");
        sb2.append(this.f20047g);
        sb2.append(", isChanged=");
        sb2.append(this.f20048h);
        sb2.append(", viewState=");
        sb2.append(this.f20049i);
        sb2.append(", commission=");
        sb2.append(this.f20050j);
        sb2.append(", dateFrom=");
        sb2.append(this.f20051k);
        sb2.append(", dateTo=");
        return AK.c.t(sb2, this.f20052l, ')');
    }
}
