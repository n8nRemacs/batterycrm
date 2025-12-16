package bB;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import bB.InterfaceC25487a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FilterAnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSerpOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LbB/b;", "", "a", "b", "c", "d", "e", "f", "g", "LbB/b$a;", "LbB/b$b;", "LbB/b$c;", "LbB/b$d;", "LbB/b$e;", "LbB/b$f;", "LbB/b$g;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: ExtendedProfileSerpOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB/b$a;", "LbB/b;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56970a;

        public a(@k String str) {
            this.f56970a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f56970a, ((a) obj).f56970a);
        }

        public final int hashCode() {
            return this.f56970a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApplySuggest(text="), this.f56970a, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB/b$b;", "LbB/b;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bB.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1994b implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f56971a;

        public C1994b(@l DeepLink deepLink) {
            this.f56971a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1994b) && L.f(this.f56971a, ((C1994b) obj).f56971a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f56971a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("CloseScreen(backLink="), this.f56971a, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB/b$c;", "LbB/b;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SearchParams f56972a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f56973b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final FilterAnalyticsData f56974c;

        public c(@k SearchParams searchParams, @l String str, @k FilterAnalyticsData filterAnalyticsData) {
            this.f56972a = searchParams;
            this.f56973b = str;
            this.f56974c = filterAnalyticsData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f56972a, cVar.f56972a) && L.f(this.f56973b, cVar.f56973b) && L.f(this.f56974c, cVar.f56974c);
        }

        public final int hashCode() {
            int iHashCode = this.f56972a.hashCode() * 31;
            String str = this.f56973b;
            return this.f56974c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "OpenFiltersScreen(searchParams=" + this.f56972a + ", infoModelForm=" + this.f56973b + ", analyticsParams=" + this.f56974c + ')';
        }
    }

    /* compiled from: ExtendedProfileSerpOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB/b$d;", "LbB/b;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SearchParams f56975a;

        public d(@k SearchParams searchParams) {
            this.f56975a = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f56975a, ((d) obj).f56975a);
        }

        public final int hashCode() {
            return this.f56975a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.bxcontent.mvi.entity.f.m(new StringBuilder("OpenGeoFiltersScreen(searchParams="), this.f56975a, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB/b$e;", "LbB/b;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56976a;

        public e(@k String str) {
            this.f56976a = str;
        }
    }

    /* compiled from: ExtendedProfileSerpOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB/b$f;", "LbB/b;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f56977a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC25487a.l f56978b;

        public f(@k Throwable th2, @k InterfaceC25487a.l lVar) {
            this.f56977a = th2;
            this.f56978b = lVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f56977a, fVar.f56977a) && this.f56978b.equals(fVar.f56978b);
        }

        public final int hashCode() {
            return this.f56978b.hashCode() + (this.f56977a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f56977a + ", buttonAction=" + this.f56978b + ')';
        }
    }

    /* compiled from: ExtendedProfileSerpOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbB/b$g;", "LbB/b;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f56979a;

        public g(@k String str) {
            this.f56979a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f56979a, ((g) obj).f56979a);
        }

        public final int hashCode() {
            return this.f56979a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateSearchInputText(text="), this.f56979a, ')');
        }
    }
}
