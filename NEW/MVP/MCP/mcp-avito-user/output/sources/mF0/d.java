package MF0;

import JF0.e;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMF0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f10510m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final d f10511n;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10512b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10513c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Throwable f10514d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final e.b f10515e;

    /* renamed from: f, reason: collision with root package name */
    public final float f10516f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LocalDate f10517g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final b f10518h;

    /* renamed from: i, reason: collision with root package name */
    public final float f10519i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LocalDate f10520j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10521k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final e f10522l;

    /* compiled from: TrxPromoGoodsConfigureState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMF0/d$a;", "", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        GF0.b bVar = GF0.b.f6396a;
        bVar.getClass();
        LocalDate localDate = GF0.b.f6397b;
        bVar.getClass();
        e.f10523a.getClass();
        f10511n = new d(false, true, null, null, 0.0f, localDate, null, 0.0f, localDate, false, e.f10524b);
    }

    public d(boolean z12, boolean z13, @l Throwable th2, @l e.b bVar, float f12, @k LocalDate localDate, @l b bVar2, float f13, @k LocalDate localDate2, boolean z14, @k e eVar) {
        this.f10512b = z12;
        this.f10513c = z13;
        this.f10514d = th2;
        this.f10515e = bVar;
        this.f10516f = f12;
        this.f10517g = localDate;
        this.f10518h = bVar2;
        this.f10519i = f13;
        this.f10520j = localDate2;
        this.f10521k = z14;
        this.f10522l = eVar;
    }

    public static d a(d dVar, boolean z12, boolean z13, ApiException apiException, e.b bVar, float f12, LocalDate localDate, b bVar2, float f13, LocalDate localDate2, boolean z14, e eVar, int i12) {
        boolean z15 = (i12 & 1) != 0 ? dVar.f10512b : z12;
        boolean z16 = (i12 & 2) != 0 ? dVar.f10513c : z13;
        Throwable th2 = (i12 & 4) != 0 ? dVar.f10514d : apiException;
        e.b bVar3 = (i12 & 8) != 0 ? dVar.f10515e : bVar;
        float f14 = (i12 & 16) != 0 ? dVar.f10516f : f12;
        LocalDate localDate3 = (i12 & 32) != 0 ? dVar.f10517g : localDate;
        b bVar4 = (i12 & 64) != 0 ? dVar.f10518h : bVar2;
        float f15 = (i12 & 128) != 0 ? dVar.f10519i : f13;
        LocalDate localDate4 = (i12 & 256) != 0 ? dVar.f10520j : localDate2;
        boolean z17 = (i12 & 512) != 0 ? dVar.f10521k : z14;
        e eVar2 = (i12 & 1024) != 0 ? dVar.f10522l : eVar;
        dVar.getClass();
        return new d(z15, z16, th2, bVar3, f14, localDate3, bVar4, f15, localDate4, z17, eVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f10512b == dVar.f10512b && this.f10513c == dVar.f10513c && L.f(this.f10514d, dVar.f10514d) && L.f(this.f10515e, dVar.f10515e) && Float.compare(this.f10516f, dVar.f10516f) == 0 && L.f(this.f10517g, dVar.f10517g) && L.f(this.f10518h, dVar.f10518h) && Float.compare(this.f10519i, dVar.f10519i) == 0 && L.f(this.f10520j, dVar.f10520j) && this.f10521k == dVar.f10521k && L.f(this.f10522l, dVar.f10522l);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f10512b) * 31, 31, this.f10513c);
        Throwable th2 = this.f10514d;
        int iHashCode = (i12 + (th2 == null ? 0 : th2.hashCode())) * 31;
        e.b bVar = this.f10515e;
        int iHashCode2 = (this.f10517g.hashCode() + r.d(this.f10516f, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31)) * 31;
        b bVar2 = this.f10518h;
        return this.f10522l.hashCode() + r.i((this.f10520j.hashCode() + r.d(this.f10519i, (iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31, 31)) * 31, 31, this.f10521k);
    }

    @k
    public final String toString() {
        return "TrxPromoGoodsConfigureState(isClosable=" + this.f10512b + ", isLoading=" + this.f10513c + ", error=" + this.f10514d + ", lastResult=" + this.f10515e + ", lastCommission=" + this.f10516f + ", lastDate=" + this.f10517g + ", inputState=" + this.f10518h + ", commission=" + this.f10519i + ", date=" + this.f10520j + ", isChanged=" + this.f10521k + ", viewState=" + this.f10522l + ')';
    }
}
