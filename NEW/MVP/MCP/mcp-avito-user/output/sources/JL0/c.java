package JL0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.media3.common.C23088b;
import com.akita.compose.component.chips.C27332a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.util.ApiException;
import j.InterfaceC42165v;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.C49582f;
import wZ.g;

/* compiled from: CompetitiveVasV2State.kt */
@H0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LJL0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final b f8893n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final c f8894o;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8895b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8896c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Throwable f8897d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8898e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f8899f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<C27332a> f8900g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<a> f8901h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<String> f8902i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final a f8903j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final C0525c f8904k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final g f8905l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f8906m;

    /* compiled from: CompetitiveVasV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJL0/c$a;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8907a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8908b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8909c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f8910d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f8911e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f8912f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f8913g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f8914h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Image f8915i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final Object f8916j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final DeepLink f8917k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f8918l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f8919m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final C49582f f8920n;

        public a(@k String str, int i12, int i13, @k String str2, @l String str3, @l String str4, @l String str5, boolean z12, @l Image image, @k List<wZ.l> list, @l DeepLink deepLink, boolean z13, boolean z14, @l C49582f c49582f) {
            this.f8907a = str;
            this.f8908b = i12;
            this.f8909c = i13;
            this.f8910d = str2;
            this.f8911e = str3;
            this.f8912f = str4;
            this.f8913g = str5;
            this.f8914h = z12;
            this.f8915i = image;
            this.f8916j = list;
            this.f8917k = deepLink;
            this.f8918l = z13;
            this.f8919m = z14;
            this.f8920n = c49582f;
        }

        /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
        public static a a(a aVar, boolean z12) {
            String str = aVar.f8907a;
            int i12 = aVar.f8908b;
            int i13 = aVar.f8909c;
            String str2 = aVar.f8910d;
            String str3 = aVar.f8911e;
            String str4 = aVar.f8912f;
            String str5 = aVar.f8913g;
            Image image = aVar.f8915i;
            ?? r102 = aVar.f8916j;
            DeepLink deepLink = aVar.f8917k;
            boolean z13 = aVar.f8918l;
            boolean z14 = aVar.f8919m;
            C49582f c49582f = aVar.f8920n;
            aVar.getClass();
            return new a(str, i12, i13, str2, str3, str4, str5, z12, image, r102, deepLink, z13, z14, c49582f);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f8907a, aVar.f8907a) && this.f8908b == aVar.f8908b && this.f8909c == aVar.f8909c && L.f(this.f8910d, aVar.f8910d) && L.f(this.f8911e, aVar.f8911e) && L.f(this.f8912f, aVar.f8912f) && L.f(this.f8913g, aVar.f8913g) && this.f8914h == aVar.f8914h && L.f(this.f8915i, aVar.f8915i) && L.f(this.f8916j, aVar.f8916j) && L.f(this.f8917k, aVar.f8917k) && this.f8918l == aVar.f8918l && this.f8919m == aVar.f8919m && L.f(this.f8920n, aVar.f8920n);
        }

        public final int hashCode() {
            int iD2 = H.d(r.e(this.f8909c, r.e(this.f8908b, this.f8907a.hashCode() * 31, 31), 31), 31, this.f8910d);
            String str = this.f8911e;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8912f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f8913g;
            int i12 = r.i((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f8914h);
            Image image = this.f8915i;
            int iA2 = C23088b.a((i12 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f8916j);
            DeepLink deepLink = this.f8917k;
            int i13 = r.i(r.i((iA2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f8918l), 31, this.f8919m);
            C49582f c49582f = this.f8920n;
            return i13 + (c49582f != null ? c49582f.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "CardItem(id=" + this.f8907a + ", tabIndex=" + this.f8908b + ", cardIndex=" + this.f8909c + ", title=" + this.f8910d + ", subtitle=" + this.f8911e + ", oldPrice=" + this.f8912f + ", description=" + this.f8913g + ", selected=" + this.f8914h + ", icon=" + this.f8915i + ", icons=" + this.f8916j + ", deepLink=" + this.f8917k + ", isPrevActive=" + this.f8918l + ", isNextActive=" + this.f8919m + ", contact=" + this.f8920n + ')';
        }
    }

    /* compiled from: CompetitiveVasV2State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJL0/c$b;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CompetitiveVasV2State.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJL0/c$c;", "", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: JL0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0525c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8921a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f8922b;

        public C0525c(@k String str, @k DeepLink deepLink) {
            this.f8921a = str;
            this.f8922b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0525c)) {
                return false;
            }
            C0525c c0525c = (C0525c) obj;
            return L.f(this.f8921a, c0525c.f8921a) && L.f(this.f8922b, c0525c.f8922b);
        }

        public final int hashCode() {
            return this.f8922b.hashCode() + (this.f8921a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoActionItem(title=");
            sb2.append(this.f8921a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f8922b, ')');
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f8894o = new c(false, true, null, -1, null, c42784z0, c42784z0, c42784z0, null, null, null, null);
    }

    public c(boolean z12, boolean z13, @l Throwable th2, @InterfaceC42165v int i12, @l String str, @k List<C27332a> list, @k List<a> list2, @k List<String> list3, @l a aVar, @l C0525c c0525c, @l g gVar, @l String str2) {
        this.f8895b = z12;
        this.f8896c = z13;
        this.f8897d = th2;
        this.f8898e = i12;
        this.f8899f = str;
        this.f8900g = list;
        this.f8901h = list2;
        this.f8902i = list3;
        this.f8903j = aVar;
        this.f8904k = c0525c;
        this.f8905l = gVar;
        this.f8906m = str2;
    }

    public static c a(c cVar, boolean z12, boolean z13, ApiException apiException, int i12, String str, List list, List list2, List list3, a aVar, C0525c c0525c, g gVar, String str2, int i13) {
        boolean z14 = (i13 & 1) != 0 ? cVar.f8895b : z12;
        boolean z15 = (i13 & 2) != 0 ? cVar.f8896c : z13;
        Throwable th2 = (i13 & 4) != 0 ? cVar.f8897d : apiException;
        int i14 = (i13 & 8) != 0 ? cVar.f8898e : i12;
        String str3 = (i13 & 16) != 0 ? cVar.f8899f : str;
        List list4 = (i13 & 32) != 0 ? cVar.f8900g : list;
        List list5 = (i13 & 64) != 0 ? cVar.f8901h : list2;
        List list6 = (i13 & 128) != 0 ? cVar.f8902i : list3;
        a aVar2 = (i13 & 256) != 0 ? cVar.f8903j : aVar;
        C0525c c0525c2 = (i13 & 512) != 0 ? cVar.f8904k : c0525c;
        g gVar2 = (i13 & 1024) != 0 ? cVar.f8905l : gVar;
        String str4 = (i13 & 2048) != 0 ? cVar.f8906m : str2;
        cVar.getClass();
        return new c(z14, z15, th2, i14, str3, list4, list5, list6, aVar2, c0525c2, gVar2, str4);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8895b == cVar.f8895b && this.f8896c == cVar.f8896c && L.f(this.f8897d, cVar.f8897d) && this.f8898e == cVar.f8898e && L.f(this.f8899f, cVar.f8899f) && L.f(this.f8900g, cVar.f8900g) && L.f(this.f8901h, cVar.f8901h) && L.f(this.f8902i, cVar.f8902i) && L.f(this.f8903j, cVar.f8903j) && L.f(this.f8904k, cVar.f8904k) && L.f(this.f8905l, cVar.f8905l) && L.f(this.f8906m, cVar.f8906m);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f8895b) * 31, 31, this.f8896c);
        Throwable th2 = this.f8897d;
        int iE2 = r.e(this.f8898e, (i12 + (th2 == null ? 0 : th2.hashCode())) * 31, 31);
        String str = this.f8899f;
        int iE3 = H.e(H.e(H.e((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f8900g), 31, this.f8901h), 31, this.f8902i);
        a aVar = this.f8903j;
        int iHashCode = (iE3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C0525c c0525c = this.f8904k;
        int iHashCode2 = (iHashCode + (c0525c == null ? 0 : c0525c.hashCode())) * 31;
        g gVar = this.f8905l;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str2 = this.f8906m;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompetitiveVasV2State(isClosable=");
        sb2.append(this.f8895b);
        sb2.append(", isLoading=");
        sb2.append(this.f8896c);
        sb2.append(", error=");
        sb2.append(this.f8897d);
        sb2.append(", navigationIcon=");
        sb2.append(this.f8898e);
        sb2.append(", title=");
        sb2.append(this.f8899f);
        sb2.append(", tabs=");
        sb2.append(this.f8900g);
        sb2.append(", cards=");
        sb2.append(this.f8901h);
        sb2.append(", clickstreamVasIds=");
        sb2.append(this.f8902i);
        sb2.append(", selectedCard=");
        sb2.append(this.f8903j);
        sb2.append(", infoAction=");
        sb2.append(this.f8904k);
        sb2.append(", footer=");
        sb2.append(this.f8905l);
        sb2.append(", nextButtonTitle=");
        return C22026a.c(sb2, this.f8906m, ')');
    }
}
