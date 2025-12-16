package Pp0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchSuggestAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LPp0/b;", "", "a", "b", "c", "d", "e", "f", "g", "LPp0/b$a;", "LPp0/b$b;", "LPp0/b$c;", "LPp0/b$d;", "LPp0/b$e;", "LPp0/b$f;", "LPp0/b$g;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pp0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14824b {

    /* compiled from: SearchSuggestAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPp0/b$a;", "LPp0/b;", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.b$a */
    public static final /* data */ class a implements InterfaceC14824b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13306a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -578944182;
        }

        @k
        public final String toString() {
            return "CancelClicked";
        }
    }

    /* compiled from: SearchSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPp0/b$b;", "LPp0/b;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0869b implements InterfaceC14824b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<SuggestAction> f13307a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.search.l f13308b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0869b(@k List<? extends SuggestAction> list, @k com.avito.android.search.l lVar) {
            this.f13307a = list;
            this.f13308b = lVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0869b)) {
                return false;
            }
            C0869b c0869b = (C0869b) obj;
            return L.f(this.f13307a, c0869b.f13307a) && L.f(this.f13308b, c0869b.f13308b);
        }

        public final int hashCode() {
            return this.f13308b.hashCode() + (this.f13307a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "PerformSuggestActions(suggestActions=" + this.f13307a + ", sourceItem=" + this.f13308b + ')';
        }
    }

    /* compiled from: SearchSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPp0/b$c;", "LPp0/b;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.b$c */
    public static final /* data */ class c implements InterfaceC14824b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13309a;

        public c(@k String str) {
            this.f13309a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13309a, ((c) obj).f13309a);
        }

        public final int hashCode() {
            return this.f13309a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("QuerySubmitted(query="), this.f13309a, ')');
        }
    }

    /* compiled from: SearchSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPp0/b$d;", "LPp0/b;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.b$d */
    public static final /* data */ class d implements InterfaceC14824b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13310a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f13311b;

        public d(@k String str, @k String str2) {
            this.f13310a = str;
            this.f13311b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f13310a, dVar.f13310a) && L.f(this.f13311b, dVar.f13311b);
        }

        public final int hashCode() {
            return this.f13311b.hashCode() + (this.f13310a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RemoveSearchHistory(name=");
            sb2.append(this.f13310a);
            sb2.append(", url=");
            return C22026a.c(sb2, this.f13311b, ')');
        }
    }

    /* compiled from: SearchSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPp0/b$e;", "LPp0/b;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.b$e */
    public static final /* data */ class e implements InterfaceC14824b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13312a;

        public e(@k String str) {
            this.f13312a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13312a, ((e) obj).f13312a);
        }

        public final int hashCode() {
            return this.f13312a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SearchQueryChanged(query="), this.f13312a, ')');
        }
    }

    /* compiled from: SearchSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPp0/b$f;", "LPp0/b;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.b$f */
    public static final /* data */ class f implements InterfaceC14824b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13313a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13314b;

        public f(@k String str, boolean z12) {
            this.f13313a = str;
            this.f13314b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f13313a, fVar.f13313a) && this.f13314b == fVar.f13314b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13314b) + (this.f13313a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleItemChanged(toggleId=");
            sb2.append(this.f13313a);
            sb2.append(", state=");
            return r.x(sb2, this.f13314b, ')');
        }
    }

    /* compiled from: SearchSuggestAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPp0/b$g;", "LPp0/b;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pp0.b$g */
    public static final /* data */ class g implements InterfaceC14824b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ParametrizedClickStreamEvent f13315a;

        public g(@k ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
            this.f13315a = parametrizedClickStreamEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f13315a, ((g) obj).f13315a);
        }

        public final int hashCode() {
            return this.f13315a.hashCode();
        }

        @k
        public final String toString() {
            return "TrackClickstreamEvent(event=" + this.f13315a + ')';
        }
    }
}
