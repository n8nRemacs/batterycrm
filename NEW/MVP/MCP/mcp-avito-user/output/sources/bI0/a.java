package BI0;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"LBI0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "LBI0/a$a;", "LBI0/a$b;", "LBI0/a$c;", "LBI0/a$d;", "LBI0/a$e;", "LBI0/a$f;", "LBI0/a$g;", "LBI0/a$h;", "LBI0/a$i;", "LBI0/a$j;", "LBI0/a$k;", "LBI0/a$l;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/a$a;", "LBI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BI0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0050a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<String, Object> f1288a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<String, Object> f1289b;

        public C0050a(@Y61.k Map<String, ? extends Object> map, @Y61.k Map<String, ? extends Object> map2) {
            this.f1288a = map;
            this.f1289b = map2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0050a)) {
                return false;
            }
            C0050a c0050a = (C0050a) obj;
            return L.f(this.f1288a, c0050a.f1288a) && L.f(this.f1289b, c0050a.f1289b);
        }

        public final int hashCode() {
            return this.f1289b.hashCode() + (this.f1288a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplyFilters(filtersParams=");
            sb2.append(this.f1288a);
            sb2.append(", defaultParams=");
            return r.w(sb2, this.f1289b, ')');
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/a$b;", "LBI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1290a;

        public b(boolean z12) {
            this.f1290a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f1290a == ((b) obj).f1290a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1290a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("ByTitleClicked(isChecked="), this.f1290a, ')');
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBI0/a$c;", "LBI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f1291a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -23590185;
        }

        @Y61.k
        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBI0/a$d;", "LBI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f1292a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -420987030;
        }

        @Y61.k
        public final String toString() {
            return "Clicked";
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBI0/a$e;", "LBI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f1293a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1877111583;
        }

        @Y61.k
        public final String toString() {
            return "Done";
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBI0/a$f;", "LBI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f1294a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1070968055;
        }

        @Y61.k
        public final String toString() {
            return "FiltersClicked";
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBI0/a$g;", "LBI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f1295a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1877224671;
        }

        @Y61.k
        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/a$h;", "LBI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f1296a;

        public h(@Y61.k String str) {
            this.f1296a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f1296a, ((h) obj).f1296a);
        }

        public final int hashCode() {
            return this.f1296a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShortcutChange(shortcut="), this.f1296a, ')');
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBI0/a$i;", "LBI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f1297a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1877551770;
        }

        @Y61.k
        public final String toString() {
            return "Show";
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/a$j;", "LBI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f1298a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1299b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f1300c;

        public j(@Y61.k String str, int i12, @Y61.k String str2) {
            this.f1298a = str;
            this.f1299b = i12;
            this.f1300c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f1298a, jVar.f1298a) && this.f1299b == jVar.f1299b && L.f(this.f1300c, jVar.f1300c);
        }

        public final int hashCode() {
            return this.f1300c.hashCode() + r.e(this.f1299b, this.f1298a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SuggestionClicked(suggestion=");
            sb2.append(this.f1298a);
            sb2.append(", suggestionIndex=");
            sb2.append(this.f1299b);
            sb2.append(", query=");
            return C22026a.c(sb2, this.f1300c, ')');
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/a$k;", "LBI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f1301a;

        public k(@Y61.k String str) {
            this.f1301a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f1301a, ((k) obj).f1301a);
        }

        public final int hashCode() {
            return this.f1301a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("TextChange(text="), this.f1301a, ')');
        }
    }

    /* compiled from: SearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/a$l;", "LBI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1302a;

        public l(boolean z12) {
            this.f1302a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f1302a == ((l) obj).f1302a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1302a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("TooltipVisibility(show="), this.f1302a, ')');
        }
    }
}
