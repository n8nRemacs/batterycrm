package o30;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NewCarsBrandModelFilterState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lo30/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f419348m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final c f419349n;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f419350b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f419351c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<TV0.a> f419352d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a> f419353e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a> f419354f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<Long> f419355g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f419356h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f419357i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f419358j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f419359k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f419360l;

    /* compiled from: NewCarsBrandModelFilterState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo30/c$a;", "", "<init>", "()V", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f419349n = new c("", "", c42784z0, c42784z0, c42784z0, null, "", true, true, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l String str, @l String str2, @k List<? extends TV0.a> list, @k List<com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.a> list2, @k List<com.avito.android.newcars_mark_model_filter.presentation.recycler.model.a> list3, @l List<Long> list4, @k String str3, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f419350b = str;
        this.f419351c = str2;
        this.f419352d = list;
        this.f419353e = list2;
        this.f419354f = list3;
        this.f419355g = list4;
        this.f419356h = str3;
        this.f419357i = z12;
        this.f419358j = z13;
        this.f419359k = z14;
        this.f419360l = z15;
    }

    public static c a(c cVar, List list, List list2, List list3, List list4, String str, boolean z12, boolean z13, boolean z14, boolean z15, int i12) {
        String str2 = cVar.f419350b;
        String str3 = cVar.f419351c;
        List list5 = (i12 & 4) != 0 ? cVar.f419352d : list;
        List list6 = (i12 & 8) != 0 ? cVar.f419353e : list2;
        List list7 = (i12 & 16) != 0 ? cVar.f419354f : list3;
        List list8 = (i12 & 32) != 0 ? cVar.f419355g : list4;
        String str4 = (i12 & 64) != 0 ? cVar.f419356h : str;
        boolean z16 = (i12 & 128) != 0 ? cVar.f419357i : z12;
        boolean z17 = (i12 & 256) != 0 ? cVar.f419358j : z13;
        boolean z18 = (i12 & 512) != 0 ? cVar.f419359k : z14;
        boolean z19 = (i12 & 1024) != 0 ? cVar.f419360l : z15;
        cVar.getClass();
        return new c(str2, str3, list5, list6, list7, list8, str4, z16, z17, z18, z19);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f419350b, cVar.f419350b) && L.f(this.f419351c, cVar.f419351c) && L.f(this.f419352d, cVar.f419352d) && L.f(this.f419353e, cVar.f419353e) && L.f(this.f419354f, cVar.f419354f) && L.f(this.f419355g, cVar.f419355g) && L.f(this.f419356h, cVar.f419356h) && this.f419357i == cVar.f419357i && this.f419358j == cVar.f419358j && this.f419359k == cVar.f419359k && this.f419360l == cVar.f419360l;
    }

    public final int hashCode() {
        String str = this.f419350b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f419351c;
        int iE2 = H.e(H.e(H.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f419352d), 31, this.f419353e), 31, this.f419354f);
        List<Long> list = this.f419355g;
        return Boolean.hashCode(this.f419360l) + r.i(r.i(r.i(H.d((iE2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f419356h), 31, this.f419357i), 31, this.f419358j), 31, this.f419359k);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewCarsBrandModelFilterState(title=");
        sb2.append(this.f419350b);
        sb2.append(", placeholder=");
        sb2.append(this.f419351c);
        sb2.append(", visibleItems=");
        sb2.append(this.f419352d);
        sb2.append(", savedBrandsList=");
        sb2.append(this.f419353e);
        sb2.append(", savedModelsList=");
        sb2.append(this.f419354f);
        sb2.append(", selectedBrandIds=");
        sb2.append(this.f419355g);
        sb2.append(", searchString=");
        sb2.append(this.f419356h);
        sb2.append(", showLoader=");
        sb2.append(this.f419357i);
        sb2.append(", isInitialLoad=");
        sb2.append(this.f419358j);
        sb2.append(", isBrand=");
        sb2.append(this.f419359k);
        sb2.append(", isResetEnabled=");
        return r.x(sb2, this.f419360l, ')');
    }
}
