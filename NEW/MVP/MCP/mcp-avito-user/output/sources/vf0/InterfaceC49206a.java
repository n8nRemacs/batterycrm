package vF0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.serp.adapter.S;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelSearchAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LvF0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LvF0/a$a;", "LvF0/a$b;", "LvF0/a$c;", "LvF0/a$d;", "LvF0/a$e;", "LvF0/a$f;", "LvF0/a$g;", "LvF0/a$h;", "LvF0/a$i;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC49206a {

    /* compiled from: TravelSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/a$a;", "LvF0/a;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12753a implements InterfaceC49206a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final S f440557a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AbstractC30567a f440558b;

        public C12753a(@k S s5, @l AbstractC30567a abstractC30567a) {
            this.f440557a = s5;
            this.f440558b = abstractC30567a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12753a)) {
                return false;
            }
            C12753a c12753a = (C12753a) obj;
            return L.f(this.f440557a, c12753a.f440557a) && L.f(this.f440558b, c12753a.f440558b);
        }

        public final int hashCode() {
            int iHashCode = this.f440557a.hashCode() * 31;
            AbstractC30567a abstractC30567a = this.f440558b;
            return iHashCode + (abstractC30567a == null ? 0 : abstractC30567a.hashCode());
        }

        @k
        public final String toString() {
            return "FavoriteButtonClick(favorableItem=" + this.f440557a + ", src=" + this.f440558b + ')';
        }
    }

    /* compiled from: TravelSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/a$b;", "LvF0/a;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.a$b */
    public static final /* data */ class b implements InterfaceC49206a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f440559a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f440560b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f440561c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f440562d;

        public b(@l DeepLink deepLink, @l Bundle bundle, @l Boolean bool, @l String str) {
            this.f440559a = deepLink;
            this.f440560b = bundle;
            this.f440561c = bool;
            this.f440562d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f440559a, bVar.f440559a) && L.f(this.f440560b, bVar.f440560b) && L.f(this.f440561c, bVar.f440561c) && L.f(this.f440562d, bVar.f440562d);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f440559a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Bundle bundle = this.f440560b;
            int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
            Boolean bool = this.f440561c;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.f440562d;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FollowAdvertDeepLink(deepLink=");
            sb2.append(this.f440559a);
            sb2.append(", args=");
            sb2.append(this.f440560b);
            sb2.append(", addInfoFromScreen=");
            sb2.append(this.f440561c);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f440562d, ')');
        }
    }

    /* compiled from: TravelSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/a$c;", "LvF0/a;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.a$c */
    public static final /* data */ class c implements InterfaceC49206a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Filter f440563a;

        public c(@l Filter filter) {
            this.f440563a = filter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f440563a, ((c) obj).f440563a);
        }

        public final int hashCode() {
            Filter filter = this.f440563a;
            if (filter == null) {
                return 0;
            }
            return filter.hashCode();
        }

        @k
        public final String toString() {
            return "InlineFilterClick(filter=" + this.f440563a + ')';
        }
    }

    /* compiled from: TravelSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/a$d;", "LvF0/a;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.a$d */
    public static final /* data */ class d implements InterfaceC49206a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440564a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<String> f440565b;

        public d(@k DeepLink deepLink, @l List<String> list) {
            this.f440564a = deepLink;
            this.f440565b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f440564a, dVar.f440564a) && L.f(this.f440565b, dVar.f440565b);
        }

        public final int hashCode() {
            int iHashCode = this.f440564a.hashCode() * 31;
            List<String> list = this.f440565b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFilterSelected(deepLink=");
            sb2.append(this.f440564a);
            sb2.append(", inlinesOrder=");
            return H.p(sb2, this.f440565b, ')');
        }
    }

    /* compiled from: TravelSearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/a$e;", "LvF0/a;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.a$e */
    public static final /* data */ class e implements InterfaceC49206a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f440566a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -360243939;
        }

        @k
        public final String toString() {
            return "NavigationButtonClick";
        }
    }

    /* compiled from: TravelSearchAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/a$f;", "LvF0/a;", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.a$f */
    public static final /* data */ class f implements InterfaceC49206a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f440567a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 240707187;
        }

        @k
        public final String toString() {
            return "RetryButtonClick";
        }
    }

    /* compiled from: TravelSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/a$g;", "LvF0/a;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.a$g */
    public static final /* data */ class g implements InterfaceC49206a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f440568a;

        public g(@k Throwable th2) {
            this.f440568a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f440568a, ((g) obj).f440568a);
        }

        public final int hashCode() {
            return this.f440568a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("SetInlineFiltersError(error="), this.f440568a, ')');
        }
    }

    /* compiled from: TravelSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/a$h;", "LvF0/a;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.a$h */
    public static final /* data */ class h implements InterfaceC49206a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final InlineFilters f440569a;

        public h(@l InlineFilters inlineFilters) {
            this.f440569a = inlineFilters;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f440569a, ((h) obj).f440569a);
        }

        public final int hashCode() {
            InlineFilters inlineFilters = this.f440569a;
            if (inlineFilters == null) {
                return 0;
            }
            return inlineFilters.hashCode();
        }

        @k
        public final String toString() {
            return "SetInlineFiltersLoaded(filters=" + this.f440569a + ')';
        }
    }

    /* compiled from: TravelSearchAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvF0/a$i;", "LvF0/a;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vF0.a$i */
    public static final /* data */ class i implements InterfaceC49206a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f440570a;

        public i(boolean z12) {
            this.f440570a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f440570a == ((i) obj).f440570a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440570a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetInlineFiltersLoading(isLoading="), this.f440570a, ')');
        }
    }
}
