package BI0;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LBI0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LBI0/b$a;", "LBI0/b$b;", "LBI0/b$c;", "LBI0/b$d;", "LBI0/b$e;", "LBI0/b$f;", "LBI0/b$g;", "LBI0/b$h;", "LBI0/b$i;", "LBI0/b$j;", "LBI0/b$k;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$a;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1303a;

        public a(boolean z12) {
            this.f1303a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f1303a == ((a) obj).f1303a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1303a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("BlockChange(showSearch="), this.f1303a, ')');
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$b;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BI0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0051b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1304a;

        public C0051b(boolean z12) {
            this.f1304a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0051b) && this.f1304a == ((C0051b) obj).f1304a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1304a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("ByTitleChange(isChecked="), this.f1304a, ')');
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$c;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<String, Object> f1305a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f1306b;

        public c(@Y61.k Map<String, ? extends Object> map, @Y61.k String str) {
            this.f1305a = map;
            this.f1306b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f1305a, cVar.f1305a) && L.f(this.f1306b, cVar.f1306b);
        }

        public final int hashCode() {
            return this.f1306b.hashCode() + (this.f1305a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FiltersClick(filtersParams=");
            sb2.append(this.f1305a);
            sb2.append(", activeShortcut=");
            return C22026a.c(sb2, this.f1306b, ')');
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBI0/b$d;", "LBI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f1307a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 542514289;
        }

        @Y61.k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$e;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1308a;

        public e(boolean z12) {
            this.f1308a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f1308a == ((e) obj).f1308a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1308a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("SearchingStateChange(showSearchingState="), this.f1308a, ')');
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$f;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f1309a;

        public f(@Y61.k String str) {
            this.f1309a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f1309a, ((f) obj).f1309a);
        }

        public final int hashCode() {
            return this.f1309a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShortcutChange(activeShortcut="), this.f1309a, ')');
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$g;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<String, Object> f1310a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<String, Object> f1311b;

        public g(@Y61.k Map<String, ? extends Object> map, @Y61.k Map<String, ? extends Object> map2) {
            this.f1310a = map;
            this.f1311b = map2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f1310a, gVar.f1310a) && L.f(this.f1311b, gVar.f1311b);
        }

        public final int hashCode() {
            return this.f1311b.hashCode() + (this.f1310a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubmitFiltering(filterParams=");
            sb2.append(this.f1310a);
            sb2.append(", defaultFilterParams=");
            return r.w(sb2, this.f1311b, ')');
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$h;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f1312a;

        public h(@l String str) {
            this.f1312a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f1312a, ((h) obj).f1312a);
        }

        public final int hashCode() {
            String str = this.f1312a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SubmitSearching(selectedSuggestion="), this.f1312a, ')');
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$i;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f1313a;

        public i(@Y61.k List<String> list) {
            this.f1313a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f1313a, ((i) obj).f1313a);
        }

        public final int hashCode() {
            return this.f1313a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("SuggestionsChange(suggestions="), this.f1313a, ')');
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$j;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f1314a;

        public j(@Y61.k String str) {
            this.f1314a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f1314a, ((j) obj).f1314a);
        }

        public final int hashCode() {
            return this.f1314a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("TextChange(text="), this.f1314a, ')');
        }
    }

    /* compiled from: SearchInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBI0/b$k;", "LBI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1315a;

        public k(boolean z12) {
            this.f1315a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f1315a == ((k) obj).f1315a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1315a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("TooltipChange(show="), this.f1315a, ')');
        }
    }
}
