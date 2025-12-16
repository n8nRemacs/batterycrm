package BI0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SearchState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LBI0/d;", "", "a", "b", "c", "d", "e", "LBI0/d$b;", "LBI0/d$c;", "LBI0/d$d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: SearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LBI0/d$a;", "T", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1318a;

        /* renamed from: b, reason: collision with root package name */
        public final T f1319b;

        /* renamed from: c, reason: collision with root package name */
        public final T f1320c;

        /* renamed from: d, reason: collision with root package name */
        public final T f1321d;

        public a(boolean z12, T t12, T t13, T t14) {
            this.f1318a = z12;
            this.f1319b = t12;
            this.f1320c = t13;
            this.f1321d = t14;
        }

        public static a a(a aVar, boolean z12, Object obj, Object obj2, int i12) {
            if ((i12 & 2) != 0) {
                obj = aVar.f1319b;
            }
            T t12 = aVar.f1320c;
            if ((i12 & 8) != 0) {
                obj2 = aVar.f1321d;
            }
            aVar.getClass();
            return new a(z12, obj, t12, obj2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1318a == aVar.f1318a && L.f(this.f1319b, aVar.f1319b) && this.f1320c.equals(aVar.f1320c) && L.f(this.f1321d, aVar.f1321d);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f1318a) * 31;
            T t12 = this.f1319b;
            int iA2 = C23088b.a((iHashCode + (t12 == null ? 0 : t12.hashCode())) * 31, 31, this.f1320c);
            T t13 = this.f1321d;
            return iA2 + (t13 != null ? t13.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FieldState(forceUpdate=");
            sb2.append(this.f1318a);
            sb2.append(", initialValue=");
            sb2.append(this.f1319b);
            sb2.append(", disabledValue=");
            sb2.append(this.f1320c);
            sb2.append(", currentValue=");
            return H.n(sb2, this.f1321d, ')');
        }
    }

    /* compiled from: SearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBI0/d$b;", "LBI0/d;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f1322a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 845208890;
        }

        @k
        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: SearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBI0/d$c;", "LBI0/d;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f1323a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 845393712;
        }

        @k
        public final String toString() {
            return "None";
        }
    }

    /* compiled from: SearchState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/d$d;", "LBI0/d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BI0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0052d implements d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1324a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1325b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f1326c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1327d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final a<String> f1328e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final a<Boolean> f1329f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final Map<String, Object> f1330g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final Map<String, Object> f1331h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final UserAdvertsSearchStartFromType f1332i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final String f1333j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final e f1334k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final List<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.a> f1335l;

        /* renamed from: m, reason: collision with root package name */
        @k
        public final List<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.a> f1336m;

        /* renamed from: n, reason: collision with root package name */
        @k
        public final String f1337n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f1338o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f1339p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f1340q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f1341r;

        public C0052d() {
            this(false, false, false, false, null, null, null, null, null, null, null, null, 4095, null);
        }

        public static C0052d a(C0052d c0052d, boolean z12, boolean z13, boolean z14, boolean z15, a aVar, a aVar2, Map map, Map map2, UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, String str, e eVar, List list, int i12) {
            boolean z16 = (i12 & 1) != 0 ? c0052d.f1324a : z12;
            boolean z17 = (i12 & 2) != 0 ? c0052d.f1325b : z13;
            boolean z18 = (i12 & 4) != 0 ? c0052d.f1326c : z14;
            boolean z19 = (i12 & 8) != 0 ? c0052d.f1327d : z15;
            a aVar3 = (i12 & 16) != 0 ? c0052d.f1328e : aVar;
            a aVar4 = (i12 & 32) != 0 ? c0052d.f1329f : aVar2;
            Map map3 = (i12 & 64) != 0 ? c0052d.f1330g : map;
            Map map4 = (i12 & 128) != 0 ? c0052d.f1331h : map2;
            UserAdvertsSearchStartFromType userAdvertsSearchStartFromType2 = (i12 & 256) != 0 ? c0052d.f1332i : userAdvertsSearchStartFromType;
            String str2 = (i12 & 512) != 0 ? c0052d.f1333j : str;
            e eVar2 = (i12 & 1024) != 0 ? c0052d.f1334k : eVar;
            List list2 = (i12 & 2048) != 0 ? c0052d.f1335l : list;
            c0052d.getClass();
            return new C0052d(z16, z17, z18, z19, aVar3, aVar4, map3, map4, userAdvertsSearchStartFromType2, str2, eVar2, list2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0052d)) {
                return false;
            }
            C0052d c0052d = (C0052d) obj;
            return this.f1324a == c0052d.f1324a && this.f1325b == c0052d.f1325b && this.f1326c == c0052d.f1326c && this.f1327d == c0052d.f1327d && L.f(this.f1328e, c0052d.f1328e) && L.f(this.f1329f, c0052d.f1329f) && L.f(this.f1330g, c0052d.f1330g) && L.f(this.f1331h, c0052d.f1331h) && this.f1332i == c0052d.f1332i && L.f(this.f1333j, c0052d.f1333j) && L.f(this.f1334k, c0052d.f1334k) && L.f(this.f1335l, c0052d.f1335l);
        }

        public final int hashCode() {
            return this.f1335l.hashCode() + ((this.f1334k.hashCode() + H.d((this.f1332i.hashCode() + AK.c.c(AK.c.c((this.f1329f.hashCode() + ((this.f1328e.hashCode() + r.i(r.i(r.i(Boolean.hashCode(this.f1324a) * 31, 31, this.f1325b), 31, this.f1326c), 31, this.f1327d)) * 31)) * 31, 31, this.f1330g), 31, this.f1331h)) * 31, 31, this.f1333j)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Show(showSearchingState=");
            sb2.append(this.f1324a);
            sb2.append(", showFiltersTooltip=");
            sb2.append(this.f1325b);
            sb2.append(", searchEnabled=");
            sb2.append(this.f1326c);
            sb2.append(", searchSubmitted=");
            sb2.append(this.f1327d);
            sb2.append(", textState=");
            sb2.append(this.f1328e);
            sb2.append(", searchByTitleState=");
            sb2.append(this.f1329f);
            sb2.append(", filterParams=");
            sb2.append(this.f1330g);
            sb2.append(", filterParamsDefault=");
            sb2.append(this.f1331h);
            sb2.append(", searchStartFromType=");
            sb2.append(this.f1332i);
            sb2.append(", activeShortcut=");
            sb2.append(this.f1333j);
            sb2.append(", submittedSearch=");
            sb2.append(this.f1334k);
            sb2.append(", suggestionItems=");
            return H.p(sb2, this.f1335l, ')');
        }

        public C0052d(boolean z12, boolean z13, boolean z14, boolean z15, @k a<String> aVar, @k a<Boolean> aVar2, @k Map<String, ? extends Object> map, @k Map<String, ? extends Object> map2, @k UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, @k String str, @k e eVar, @k List<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion.a> list) {
            this.f1324a = z12;
            this.f1325b = z13;
            this.f1326c = z14;
            this.f1327d = z15;
            this.f1328e = aVar;
            this.f1329f = aVar2;
            this.f1330g = map;
            this.f1331h = map2;
            this.f1332i = userAdvertsSearchStartFromType;
            this.f1333j = str;
            this.f1334k = eVar;
            this.f1335l = list;
            boolean zF2 = L.f(map, map2);
            this.f1336m = z14 ? list : C42784z0.f406748b;
            this.f1337n = z14 ? aVar.f1321d : aVar.f1320c;
            this.f1338o = (z14 ? aVar2.f1321d : aVar2.f1320c).booleanValue();
            this.f1339p = !z12;
            this.f1340q = (!z14 || z12 || zF2) ? false : true;
            this.f1341r = z13 && !z12 && z14;
        }

        public C0052d(boolean z12, boolean z13, boolean z14, boolean z15, a aVar, a aVar2, Map map, Map map2, UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, String str, e eVar, List list, int i12, C42822w c42822w) {
            a aVar3;
            boolean z16 = (i12 & 1) != 0 ? false : z12;
            boolean z17 = (i12 & 2) != 0 ? false : z13;
            boolean z18 = (i12 & 4) != 0 ? true : z14;
            boolean z19 = (i12 & 8) != 0 ? false : z15;
            a aVar4 = (i12 & 16) != 0 ? new a(false, "", "", "") : aVar;
            if ((i12 & 32) != 0) {
                Boolean bool = Boolean.FALSE;
                aVar3 = new a(false, bool, bool, bool);
            } else {
                aVar3 = aVar2;
            }
            this(z16, z17, z18, z19, aVar4, aVar3, (i12 & 64) != 0 ? P0.c() : map, (i12 & 128) != 0 ? P0.c() : map2, (i12 & 256) != 0 ? UserAdvertsSearchStartFromType.f312778b : userAdvertsSearchStartFromType, (i12 & 512) == 0 ? str : "", (i12 & 1024) != 0 ? new e(null, false, null, null, null, 31, null) : eVar, (i12 & 2048) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: SearchState.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/d$e;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f1342a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1343b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, Object> f1344c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Map<String, Object> f1345d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final UserAdvertsSearchStartFromType f1346e;

        public e() {
            this(null, false, null, null, null, 31, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f1342a, eVar.f1342a) && this.f1343b == eVar.f1343b && L.f(this.f1344c, eVar.f1344c) && L.f(this.f1345d, eVar.f1345d) && this.f1346e == eVar.f1346e;
        }

        public final int hashCode() {
            return this.f1346e.hashCode() + AK.c.c(AK.c.c(r.i(this.f1342a.hashCode() * 31, 31, this.f1343b), 31, this.f1344c), 31, this.f1345d);
        }

        @k
        public final String toString() {
            return "SubmittedSearch(query=" + this.f1342a + ", queryByTitle=" + this.f1343b + ", filterParams=" + this.f1344c + ", defaultFilterParams=" + this.f1345d + ", startType=" + this.f1346e + ')';
        }

        public e(@k UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, @k String str, @k Map map, @k Map map2, boolean z12) {
            this.f1342a = str;
            this.f1343b = z12;
            this.f1344c = map;
            this.f1345d = map2;
            this.f1346e = userAdvertsSearchStartFromType;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ e(String str, boolean z12, Map map, Map map2, UserAdvertsSearchStartFromType userAdvertsSearchStartFromType, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? "" : str;
            boolean z13 = (i12 & 2) != 0 ? false : z12;
            this((i12 & 16) != 0 ? UserAdvertsSearchStartFromType.f312778b : userAdvertsSearchStartFromType, str, (i12 & 4) != 0 ? P0.c() : map, (i12 & 8) != 0 ? P0.c() : map2, z13);
        }
    }
}
