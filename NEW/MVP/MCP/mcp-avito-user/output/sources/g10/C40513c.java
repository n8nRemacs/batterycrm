package g10;

import KZ.C14285o;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import g10.InterfaceC40512b;
import g10.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MortgageRootState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lg10/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C40513c extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f396244l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final C40513c f396245m = new C40513c("", null, C42784z0.f406748b, null, null, null, false, false, InterfaceC40512b.d.f396239a, d.c.f396261a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396246b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final JZ.c f396247c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<C14285o> f396248d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final JZ.d f396249e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C40511a f396250f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f396251g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f396252h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f396253i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC40512b f396254j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final d f396255k;

    /* compiled from: MortgageRootState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg10/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g10.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40513c(@k String str, @l JZ.c cVar, @k List<C14285o> list, @l JZ.d dVar, @l C40511a c40511a, @l String str2, boolean z12, boolean z13, @k InterfaceC40512b interfaceC40512b, @k d dVar2) {
        this.f396246b = str;
        this.f396247c = cVar;
        this.f396248d = list;
        this.f396249e = dVar;
        this.f396250f = c40511a;
        this.f396251g = str2;
        this.f396252h = z12;
        this.f396253i = z13;
        this.f396254j = interfaceC40512b;
        this.f396255k = dVar2;
    }

    public static C40513c a(C40513c c40513c, String str, JZ.c cVar, List list, JZ.d dVar, C40511a c40511a, String str2, boolean z12, boolean z13, InterfaceC40512b interfaceC40512b, d dVar2, int i12) {
        String str3 = (i12 & 1) != 0 ? c40513c.f396246b : str;
        JZ.c cVar2 = (i12 & 2) != 0 ? c40513c.f396247c : cVar;
        List list2 = (i12 & 4) != 0 ? c40513c.f396248d : list;
        JZ.d dVar3 = (i12 & 8) != 0 ? c40513c.f396249e : dVar;
        C40511a c40511a2 = (i12 & 16) != 0 ? c40513c.f396250f : c40511a;
        String str4 = (i12 & 32) != 0 ? c40513c.f396251g : str2;
        boolean z14 = (i12 & 64) != 0 ? c40513c.f396252h : z12;
        boolean z15 = (i12 & 128) != 0 ? c40513c.f396253i : z13;
        InterfaceC40512b interfaceC40512b2 = (i12 & 256) != 0 ? c40513c.f396254j : interfaceC40512b;
        d dVar4 = (i12 & 512) != 0 ? c40513c.f396255k : dVar2;
        c40513c.getClass();
        return new C40513c(str3, cVar2, list2, dVar3, c40511a2, str4, z14, z15, interfaceC40512b2, dVar4);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40513c)) {
            return false;
        }
        C40513c c40513c = (C40513c) obj;
        return L.f(this.f396246b, c40513c.f396246b) && L.f(this.f396247c, c40513c.f396247c) && L.f(this.f396248d, c40513c.f396248d) && L.f(this.f396249e, c40513c.f396249e) && L.f(this.f396250f, c40513c.f396250f) && L.f(this.f396251g, c40513c.f396251g) && this.f396252h == c40513c.f396252h && this.f396253i == c40513c.f396253i && L.f(this.f396254j, c40513c.f396254j) && L.f(this.f396255k, c40513c.f396255k);
    }

    public final int hashCode() {
        int iHashCode = this.f396246b.hashCode() * 31;
        JZ.c cVar = this.f396247c;
        int iE2 = H.e((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f396248d);
        JZ.d dVar = this.f396249e;
        int iHashCode2 = (iE2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C40511a c40511a = this.f396250f;
        int iHashCode3 = (iHashCode2 + (c40511a == null ? 0 : c40511a.hashCode())) * 31;
        String str = this.f396251g;
        return this.f396255k.hashCode() + ((this.f396254j.hashCode() + r.i(r.i((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f396252h), 31, this.f396253i)) * 31);
    }

    @k
    public final String toString() {
        return "MortgageRootState(applicationId=" + this.f396246b + ", header=" + this.f396247c + ", content=" + this.f396248d + ", metaInfo=" + this.f396249e + ", floatingNavigationConfig=" + this.f396250f + ", selectedBanksState=" + this.f396251g + ", isRealtyObjectDetailsAddressFieldSimple=" + this.f396252h + ", needReload=" + this.f396253i + ", loadingState=" + this.f396254j + ", viewState=" + this.f396255k + ')';
    }
}
