package bY;

import androidx.appcompat.app.r;
import com.avito.android.bxcontent.InterfaceC28963b;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.map.mvi.entity.MapErrorType;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MapOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"LbY/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "LbY/c$g;", "LbY/c$h;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC25596c {

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/c$a;", "LbY/c$g;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$a */
    public static final /* data */ class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FloatingViewsPresenter.Subscriber.b f57163a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57164b;

        public a(@Y61.k FloatingViewsPresenter.Subscriber.b bVar, boolean z12) {
            this.f57163a = bVar;
            this.f57164b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f57163a, aVar.f57163a) && this.f57164b == aVar.f57164b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57164b) + (this.f57163a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FloatingViewsStateUpdate(state=");
            sb2.append(this.f57163a);
            sb2.append(", hideInlineAction=");
            return r.x(sb2, this.f57164b, ')');
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/c$b;", "LbY/c$h;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$b */
    public static final /* data */ class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f57165a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57166b;

        public b(boolean z12, boolean z13) {
            this.f57165a = z12;
            this.f57166b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f57165a == bVar.f57165a && this.f57166b == bVar.f57166b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57166b) + (Boolean.hashCode(this.f57165a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GetUserCoords(isFirstTime=");
            sb2.append(this.f57165a);
            sb2.append(", isApproximateLocation=");
            return r.x(sb2, this.f57166b, ')');
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/c$c;", "LbY/c$h;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$c, reason: collision with other inner class name */
    public static final /* data */ class C2005c implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C2005c f57167a = new C2005c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C2005c);
        }

        public final int hashCode() {
            return 1672264913;
        }

        @Y61.k
        public final String toString() {
            return "GoToSettings";
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/c$d;", "LbY/c$g;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$d */
    public static final /* data */ class d implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InlineAction.Predefined.State f57168a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f57169b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f57170c;

        public d(@Y61.k InlineAction.Predefined.State state, @Y61.l String str, boolean z12) {
            this.f57168a = state;
            this.f57169b = str;
            this.f57170c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f57168a == dVar.f57168a && L.f(this.f57169b, dVar.f57169b) && this.f57170c == dVar.f57170c;
        }

        public final int hashCode() {
            int iHashCode = this.f57168a.hashCode() * 31;
            String str = this.f57169b;
            return Boolean.hashCode(this.f57170c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyFeaturesAboutSubscriptionsState(state=");
            sb2.append(this.f57168a);
            sb2.append(", filterId=");
            sb2.append(this.f57169b);
            sb2.append(", isSubscribed=");
            return r.x(sb2, this.f57170c, ')');
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/c$e;", "LbY/c$g;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$e */
    public static final /* data */ class e implements g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f57171a;

        public e(boolean z12) {
            this.f57171a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f57171a == ((e) obj).f57171a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57171a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("NotifyFeaturesRefresh(shouldCollapseBottomSheet="), this.f57171a, ')');
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/c$f;", "LbY/c$g;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$f */
    public static final /* data */ class f implements g {

        /* renamed from: a, reason: collision with root package name */
        public final float f57172a;

        public f(float f12) {
            this.f57172a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Float.compare(this.f57172a, ((f) obj).f57172a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f57172a);
        }

        @Y61.k
        public final String toString() {
            return r.k(')', this.f57172a, new StringBuilder("PanelOffsetChanged(offset="));
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"LbY/c$g;", "LbY/c;", "Lcom/avito/android/bxcontent/b$a;", "LbY/c$a;", "LbY/c$d;", "LbY/c$e;", "LbY/c$f;", "LbY/c$l;", "LbY/c$n;", "LbY/c$o;", "LbY/c$p;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$g */
    public interface g extends InterfaceC25596c, InterfaceC28963b.a {
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"LbY/c$h;", "LbY/c;", "Lcom/avito/android/bxcontent/b$b;", "LbY/c$b;", "LbY/c$c;", "LbY/c$i;", "LbY/c$j;", "LbY/c$k;", "LbY/c$m;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$h */
    public interface h extends InterfaceC25596c, InterfaceC28963b.InterfaceC3268b {
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/c$i;", "LbY/c$h;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$i */
    public static final /* data */ class i implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LatLngBounds f57173a;

        public i(@Y61.k LatLngBounds latLngBounds) {
            this.f57173a = latLngBounds;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f57173a, ((i) obj).f57173a);
        }

        public final int hashCode() {
            return this.f57173a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReloadInlines(mapBounds=" + this.f57173a + ')';
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/c$j;", "LbY/c$h;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$j */
    public static final /* data */ class j implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f57174a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -840093756;
        }

        @Y61.k
        public final String toString() {
            return "ScrollPinsToTop";
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/c$k;", "LbY/c$h;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$k */
    public static final /* data */ class k implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f57175a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final MapErrorType f57176b;

        public k(@Y61.k Throwable th2, @Y61.k MapErrorType mapErrorType) {
            this.f57175a = th2;
            this.f57176b = mapErrorType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f57175a, kVar.f57175a) && this.f57176b == kVar.f57176b;
        }

        public final int hashCode() {
            return this.f57176b.hashCode() + (this.f57175a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowError(error=" + this.f57175a + ", type=" + this.f57176b + ')';
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/c$l;", "LbY/c$g;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$l */
    public static final /* data */ class l implements g {

        /* renamed from: a, reason: collision with root package name */
        public final int f57177a;

        public l(int i12) {
            this.f57177a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f57177a == ((l) obj).f57177a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57177a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("ShowListClicked(state="), this.f57177a, ')');
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/c$m;", "LbY/c$h;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$m */
    public static final /* data */ class m implements h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f57178a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -941023306;
        }

        @Y61.k
        public final String toString() {
            return "SubscribeButtonClicked";
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/c$n;", "LbY/c$g;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$n */
    public static final /* data */ class n implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f57179a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -114769494;
        }

        @Y61.k
        public final String toString() {
            return "UserClickMap";
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/c$o;", "LbY/c$g;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$o */
    public static final /* data */ class o implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f57180a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -303862484;
        }

        @Y61.k
        public final String toString() {
            return "UserClickMarker";
        }
    }

    /* compiled from: MapOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/c$p;", "LbY/c$g;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.c$p */
    public static final /* data */ class p implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LatLngBounds f57181a;

        public p(@Y61.k LatLngBounds latLngBounds) {
            this.f57181a = latLngBounds;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f57181a, ((p) obj).f57181a);
        }

        public final int hashCode() {
            return this.f57181a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UserMoveMap(mapBounds=" + this.f57181a + ')';
        }
    }
}
