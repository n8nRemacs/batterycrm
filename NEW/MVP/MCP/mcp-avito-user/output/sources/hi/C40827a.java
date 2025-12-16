package hI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.guests_selector.io.Parameter;
import com.avito.android.guests_selector.mvi.entity.state.entity.ActivePageType;
import iI.C41289a;
import iI.C41290b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LhI/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C40827a extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final C11250a f397131n = new C11250a(null);

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final C40827a f397132o;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ActivePageType f397133b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397134c;

    /* renamed from: d, reason: collision with root package name */
    public final int f397135d;

    /* renamed from: e, reason: collision with root package name */
    public final int f397136e;

    /* renamed from: f, reason: collision with root package name */
    public final int f397137f;

    /* renamed from: g, reason: collision with root package name */
    public final int f397138g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f397139h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<C41290b> f397140i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<C41289a> f397141j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f397142k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final List<Parameter> f397143l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final C40828b f397144m;

    /* compiled from: GuestsSelectorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LhI/a$a;", "", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hI.a$a, reason: collision with other inner class name */
    public static final class C11250a {
        public /* synthetic */ C11250a(C42822w c42822w) {
            this();
        }

        public C11250a() {
        }
    }

    static {
        ActivePageType activePageType = ActivePageType.f161554b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        f397132o = new C40827a(activePageType, 1, 1, 0, 0, 1, null, c42784z0, c42784z0, true, c42784z0, new C40828b(activePageType, com.avito.android.printable_text.b.a(), null, new C40829c(P0.c()), c42784z0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40827a(@k ActivePageType activePageType, int i12, int i13, int i14, int i15, int i16, @l String str, @k List<C41290b> list, @k List<C41289a> list2, boolean z12, @k List<? extends Parameter> list3, @k C40828b c40828b) {
        this.f397133b = activePageType;
        this.f397134c = i12;
        this.f397135d = i13;
        this.f397136e = i14;
        this.f397137f = i15;
        this.f397138g = i16;
        this.f397139h = str;
        this.f397140i = list;
        this.f397141j = list2;
        this.f397142k = z12;
        this.f397143l = list3;
        this.f397144m = c40828b;
    }

    public static C40827a a(C40827a c40827a, ActivePageType activePageType, int i12, int i13, int i14, int i15, int i16, String str, ArrayList arrayList, ArrayList arrayList2, boolean z12, List list, C40828b c40828b, int i17) {
        ActivePageType activePageType2 = (i17 & 1) != 0 ? c40827a.f397133b : activePageType;
        int i18 = (i17 & 2) != 0 ? c40827a.f397134c : i12;
        int i19 = (i17 & 4) != 0 ? c40827a.f397135d : i13;
        int i22 = (i17 & 8) != 0 ? c40827a.f397136e : i14;
        int i23 = (i17 & 16) != 0 ? c40827a.f397137f : i15;
        int i24 = (i17 & 32) != 0 ? c40827a.f397138g : i16;
        String str2 = (i17 & 64) != 0 ? c40827a.f397139h : str;
        List<C41290b> list2 = (i17 & 128) != 0 ? c40827a.f397140i : arrayList;
        List<C41289a> list3 = (i17 & 256) != 0 ? c40827a.f397141j : arrayList2;
        boolean z13 = (i17 & 512) != 0 ? c40827a.f397142k : z12;
        List list4 = (i17 & 1024) != 0 ? c40827a.f397143l : list;
        C40828b c40828b2 = (i17 & 2048) != 0 ? c40827a.f397144m : c40828b;
        c40827a.getClass();
        return new C40827a(activePageType2, i18, i19, i22, i23, i24, str2, list2, list3, z13, list4, c40828b2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40827a)) {
            return false;
        }
        C40827a c40827a = (C40827a) obj;
        return this.f397133b == c40827a.f397133b && this.f397134c == c40827a.f397134c && this.f397135d == c40827a.f397135d && this.f397136e == c40827a.f397136e && this.f397137f == c40827a.f397137f && this.f397138g == c40827a.f397138g && L.f(this.f397139h, c40827a.f397139h) && L.f(this.f397140i, c40827a.f397140i) && L.f(this.f397141j, c40827a.f397141j) && this.f397142k == c40827a.f397142k && L.f(this.f397143l, c40827a.f397143l) && L.f(this.f397144m, c40827a.f397144m);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f397138g, r.e(this.f397137f, r.e(this.f397136e, r.e(this.f397135d, r.e(this.f397134c, this.f397133b.hashCode() * 31, 31), 31), 31), 31), 31);
        String str = this.f397139h;
        return this.f397144m.hashCode() + H.e(r.i(H.e(H.e((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f397140i), 31, this.f397141j), 31, this.f397142k), 31, this.f397143l);
    }

    @k
    public final String toString() {
        return "GuestsSelectorState(activePage=" + this.f397133b + ", minGuestsCount=" + this.f397134c + ", maxGuestsCount=" + this.f397135d + ", maxAdultCount=" + this.f397136e + ", maxChildrenCount=" + this.f397137f + ", currentGuestsStepperCount=" + this.f397138g + ", currentChildAgeIdSelected=" + this.f397139h + ", children=" + this.f397140i + ", availableAges=" + this.f397141j + ", withChildren=" + this.f397142k + ", parameters=" + this.f397143l + ", viewState=" + this.f397144m + ')';
    }
}
