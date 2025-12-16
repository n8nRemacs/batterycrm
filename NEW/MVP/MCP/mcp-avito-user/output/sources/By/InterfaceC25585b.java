package bY;

import Y61.k;
import android.location.Location;
import androidx.compose.runtime.C22026a;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.marker.MarkerWithIdAndContext;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.map.analytics.ParentType;
import com.avito.android.map_core.utils.SnackBarCallbackType;
import com.avito.android.remote.model.MapOnboarding;
import com.avito.android.serp.adapter.S;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: MapAction.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:%\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\u0082\u0001%'()*+,-./0123456789:;<=>?@ABCDEFGHIJK¨\u0006L"}, d2 = {"LbY/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "LbY/b$a;", "LbY/b$b;", "LbY/b$c;", "LbY/b$d;", "LbY/b$e;", "LbY/b$f;", "LbY/b$g;", "LbY/b$h;", "LbY/b$i;", "LbY/b$j;", "LbY/b$k;", "LbY/b$l;", "LbY/b$m;", "LbY/b$n;", "LbY/b$o;", "LbY/b$p;", "LbY/b$q;", "LbY/b$r;", "LbY/b$s;", "LbY/b$t;", "LbY/b$u;", "LbY/b$v;", "LbY/b$w;", "LbY/b$x;", "LbY/b$y;", "LbY/b$z;", "LbY/b$A;", "LbY/b$B;", "LbY/b$C;", "LbY/b$D;", "LbY/b$E;", "LbY/b$F;", "LbY/b$G;", "LbY/b$H;", "LbY/b$I;", "LbY/b$J;", "LbY/b$K;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bY.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC25585b {

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$A;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$A */
    public static final /* data */ class A implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final A f57116a = new A();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof A);
        }

        public final int hashCode() {
            return -2109470477;
        }

        @k
        public final String toString() {
            return "ScrollPinsToTop";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$B;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$B */
    public static final /* data */ class B implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InlineAction.Predefined.State f57117a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f57118b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f57119c;

        public B(@k InlineAction.Predefined.State state, @Y61.l String str, boolean z12) {
            this.f57117a = state;
            this.f57118b = str;
            this.f57119c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof B)) {
                return false;
            }
            B b12 = (B) obj;
            return this.f57117a == b12.f57117a && L.f(this.f57118b, b12.f57118b) && this.f57119c == b12.f57119c;
        }

        public final int hashCode() {
            int iHashCode = this.f57117a.hashCode() * 31;
            String str = this.f57118b;
            return Boolean.hashCode(this.f57119c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchSubscriptionStateChanged(state=");
            sb2.append(this.f57117a);
            sb2.append(", filterId=");
            sb2.append(this.f57118b);
            sb2.append(", isSubscribed=");
            return androidx.appcompat.app.r.x(sb2, this.f57119c, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$C;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$C */
    public static final /* data */ class C implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C f57120a = new C();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C);
        }

        public final int hashCode() {
            return -1458267920;
        }

        @k
        public final String toString() {
            return "SendExitFromMap";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$D;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$D */
    public static final /* data */ class D implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        public final int f57121a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57122b;

        public D(int i12, int i13) {
            this.f57121a = i12;
            this.f57122b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof D)) {
                return false;
            }
            D d12 = (D) obj;
            return this.f57121a == d12.f57121a && this.f57122b == d12.f57122b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57122b) + (Integer.hashCode(this.f57121a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShortcutsLayoutChange(top=");
            sb2.append(this.f57121a);
            sb2.append(", bottom=");
            return androidx.appcompat.app.r.t(sb2, this.f57122b, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$E;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$E */
    public static final /* data */ class E implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final E f57123a = new E();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof E);
        }

        public final int hashCode() {
            return -1296601680;
        }

        @k
        public final String toString() {
            return "ShowListClicked";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$F;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$F */
    public static final /* data */ class F implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final F f57124a = new F();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof F);
        }

        public final int hashCode() {
            return -1409559547;
        }

        @k
        public final String toString() {
            return "ShowScreen";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$G;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$G */
    public static final /* data */ class G implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final G f57125a = new G();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof G);
        }

        public final int hashCode() {
            return 1339376825;
        }

        @k
        public final String toString() {
            return "SubscribeClicked";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$H;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$H */
    public static final /* data */ class H implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f57126a;

        public H(@Y61.l String str) {
            this.f57126a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof H) && L.f(this.f57126a, ((H) obj).f57126a);
        }

        public final int hashCode() {
            String str = this.f57126a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateNewSerpMapInteraction(newSerpMapInteraction="), this.f57126a, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$I;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$I */
    public static final /* data */ class I implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f57127a;

        public I(boolean z12) {
            this.f57127a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof I) && this.f57127a == ((I) obj).f57127a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57127a);
        }

        @k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("UpdateScrollToTopButtonVisibility(isVisible="), this.f57127a, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$J;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$J */
    public static final /* data */ class J implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Float f57128a;

        public J(@Y61.l Float f12) {
            this.f57128a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof J) && L.f(this.f57128a, ((J) obj).f57128a);
        }

        public final int hashCode() {
            Float f12 = this.f57128a;
            if (f12 == null) {
                return 0;
            }
            return f12.hashCode();
        }

        @k
        public final String toString() {
            return h.d(new StringBuilder("ZoomInButtonClicked(zoom="), this.f57128a, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$K;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$K */
    public static final /* data */ class K implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Float f57129a;

        public K(@Y61.l Float f12) {
            this.f57129a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof K) && L.f(this.f57129a, ((K) obj).f57129a);
        }

        public final int hashCode() {
            Float f12 = this.f57129a;
            if (f12 == null) {
                return 0;
            }
            return f12.hashCode();
        }

        @k
        public final String toString() {
            return h.d(new StringBuilder("ZoomOutButtonClicked(zoom="), this.f57129a, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$a;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$a, reason: case insensitive filesystem */
    public static final /* data */ class C25586a implements InterfaceC25585b {
        public C25586a() {
            ParentType parentType = ParentType.f184821b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25586a)) {
                return false;
            }
            ParentType parentType = ParentType.f184821b;
            ((C25586a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return ParentType.f184824e.hashCode();
        }

        @k
        public final String toString() {
            return "AnalyticsParentTypeUpdated(parentType=" + ParentType.f184824e + ')';
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$b;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2004b implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        public final int f57130a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57131b;

        public C2004b(int i12, boolean z12) {
            this.f57130a = i12;
            this.f57131b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2004b)) {
                return false;
            }
            C2004b c2004b = (C2004b) obj;
            return this.f57130a == c2004b.f57130a && this.f57131b == c2004b.f57131b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57131b) + (Integer.hashCode(this.f57130a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetStateChanged(newState=");
            sb2.append(this.f57130a);
            sb2.append(", isGesture=");
            return androidx.appcompat.app.r.x(sb2, this.f57131b, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$c;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$c, reason: case insensitive filesystem */
    public static final /* data */ class C25587c implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final S f57132a;

        public C25587c(@k S s5) {
            this.f57132a = s5;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25587c) && L.f(this.f57132a, ((C25587c) obj).f57132a);
        }

        public final int hashCode() {
            return this.f57132a.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeFavoritePin(item=" + this.f57132a + ')';
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$d;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$d, reason: case insensitive filesystem */
    public static final /* data */ class C25588d implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C25588d f57133a = new C25588d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C25588d);
        }

        public final int hashCode() {
            return -1058464549;
        }

        @k
        public final String toString() {
            return "ClearGeoFilters";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$e;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$e, reason: case insensitive filesystem */
    public static final /* data */ class C25589e implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AvitoMapPoint f57134a;

        public C25589e(@k AvitoMapPoint avitoMapPoint) {
            this.f57134a = avitoMapPoint;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25589e) && L.f(this.f57134a, ((C25589e) obj).f57134a);
        }

        public final int hashCode() {
            return this.f57134a.hashCode();
        }

        @k
        public final String toString() {
            return "Draw(point=" + this.f57134a + ')';
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$f;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$f, reason: case insensitive filesystem */
    public static final /* data */ class C25590f implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C25590f f57135a = new C25590f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C25590f);
        }

        public final int hashCode() {
            return 1647173939;
        }

        @k
        public final String toString() {
            return "DrawFinish";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$g;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$g, reason: case insensitive filesystem */
    public static final /* data */ class C25591g implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C25591g f57136a = new C25591g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C25591g);
        }

        public final int hashCode() {
            return -1082141140;
        }

        @k
        public final String toString() {
            return "DrawMapClick";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$i;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$i, reason: case insensitive filesystem */
    public static final /* data */ class C25593i implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C25593i f57139a = new C25593i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C25593i);
        }

        public final int hashCode() {
            return -618701784;
        }

        @k
        public final String toString() {
            return "FindMeButtonClicked";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$k;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$k, reason: case insensitive filesystem */
    public static final /* data */ class C25595k implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f57142a;

        public C25595k(@k DeepLink deepLink) {
            this.f57142a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25595k) && L.f(this.f57142a, ((C25595k) obj).f57142a);
        }

        public final int hashCode() {
            return this.f57142a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeepLink(deepLink="), this.f57142a, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$l;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$l */
    public static final /* data */ class l implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final l f57143a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 594903876;
        }

        @k
        public final String toString() {
            return "LoadNextPageOfAdverts";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$m;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$m */
    public static final /* data */ class m implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Location f57144a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57145b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f57146c;

        public m(@k Location location, boolean z12, boolean z13) {
            this.f57144a = location;
            this.f57145b = z12;
            this.f57146c = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return L.f(this.f57144a, mVar.f57144a) && this.f57145b == mVar.f57145b && this.f57146c == mVar.f57146c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57146c) + androidx.appcompat.app.r.i(this.f57144a.hashCode() * 31, 31, this.f57145b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LocationReceived(location=");
            sb2.append(this.f57144a);
            sb2.append(", isFirstTime=");
            sb2.append(this.f57145b);
            sb2.append(", isApproximateLocation=");
            return androidx.appcompat.app.r.x(sb2, this.f57146c, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$n;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$n */
    public static final /* data */ class n implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SnackBarCallbackType f57147a;

        public n(@k SnackBarCallbackType snackBarCallbackType) {
            this.f57147a = snackBarCallbackType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f57147a == ((n) obj).f57147a;
        }

        public final int hashCode() {
            return this.f57147a.hashCode();
        }

        @k
        public final String toString() {
            return "LocationSnackBarCallback(type=" + this.f57147a + ')';
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$o;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$o */
    public static final /* data */ class o implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final o f57148a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -1938800670;
        }

        @k
        public final String toString() {
            return "LocationToastBarCallback";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$p;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$p */
    public static final /* data */ class p implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final p f57149a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -1200078489;
        }

        @k
        public final String toString() {
            return "MapClicked";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$q;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$q */
    public static final /* data */ class q implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f57150a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57151b;

        public q(boolean z12, boolean z13) {
            this.f57150a = z12;
            this.f57151b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.f57150a == qVar.f57150a && this.f57151b == qVar.f57151b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57151b) + (Boolean.hashCode(this.f57150a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MapMoveStarted(isZoom=");
            sb2.append(this.f57150a);
            sb2.append(", isGesture=");
            return androidx.appcompat.app.r.x(sb2, this.f57151b, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$r;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$r */
    public static final /* data */ class r implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LatLngBounds f57152a;

        /* renamed from: b, reason: collision with root package name */
        public final float f57153b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f57154c;

        public r(@k LatLngBounds latLngBounds, float f12, boolean z12) {
            this.f57152a = latLngBounds;
            this.f57153b = f12;
            this.f57154c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f57152a, rVar.f57152a) && Float.compare(this.f57153b, rVar.f57153b) == 0 && this.f57154c == rVar.f57154c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57154c) + androidx.appcompat.app.r.d(this.f57153b, this.f57152a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MapMoved(bounds=");
            sb2.append(this.f57152a);
            sb2.append(", zoom=");
            sb2.append(this.f57153b);
            sb2.append(", isAfterGesture=");
            return androidx.appcompat.app.r.x(sb2, this.f57154c, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$s;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$s */
    public static final /* data */ class s implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MapOnboarding f57155a;

        public s(@k MapOnboarding mapOnboarding) {
            this.f57155a = mapOnboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f57155a, ((s) obj).f57155a);
        }

        public final int hashCode() {
            return this.f57155a.hashCode();
        }

        @k
        public final String toString() {
            return "MapOnboardingClicked(onboarding=" + this.f57155a + ')';
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$t;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$t */
    public static final /* data */ class t implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MarkerWithIdAndContext f57156a;

        public t(@k MarkerWithIdAndContext markerWithIdAndContext) {
            this.f57156a = markerWithIdAndContext;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && L.f(this.f57156a, ((t) obj).f57156a);
        }

        public final int hashCode() {
            return this.f57156a.hashCode();
        }

        @k
        public final String toString() {
            return "MarkerClicked(item=" + this.f57156a + ')';
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$u;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$u */
    public static final /* data */ class u implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        public final float f57157a;

        public u(float f12) {
            this.f57157a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && Float.compare(this.f57157a, ((u) obj).f57157a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f57157a);
        }

        @k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f57157a, new StringBuilder("PanelOffsetChanged(offset="));
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$v;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$v */
    public static final /* data */ class v implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57158a;

        public v(@k String str) {
            this.f57158a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && L.f(this.f57158a, ((v) obj).f57158a);
        }

        public final int hashCode() {
            return this.f57158a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PanelStateChanged(newState="), this.f57158a, ')');
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$w;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$w */
    public static final /* data */ class w implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final w f57159a = new w();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return 769351199;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$x;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$x */
    public static final /* data */ class x implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final com.avito.android.remote.model.Location f57160a;

        /* JADX WARN: Multi-variable type inference failed */
        public x() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && L.f(this.f57160a, ((x) obj).f57160a);
        }

        public final int hashCode() {
            com.avito.android.remote.model.Location location = this.f57160a;
            if (location == null) {
                return 0;
            }
            return location.hashCode();
        }

        @k
        public final String toString() {
            return "ReloadAll(location=" + this.f57160a + ')';
        }

        public x(@Y61.l com.avito.android.remote.model.Location location) {
            this.f57160a = location;
        }

        public /* synthetic */ x(com.avito.android.remote.model.Location location, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : location);
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$y;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$y */
    public static final /* data */ class y implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final y f57161a = new y();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 1931538156;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbY/b$z;", "LbY/b;", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$z */
    public static final /* data */ class z implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final z f57162a = new z();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return 264505743;
        }

        @k
        public final String toString() {
            return "ScreenOnPause";
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$h;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$h, reason: case insensitive filesystem */
    public static final /* data */ class C25592h implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f57137a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57138b;

        public C25592h(@k DeepLink deepLink, boolean z12) {
            this.f57137a = deepLink;
            this.f57138b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25592h)) {
                return false;
            }
            C25592h c25592h = (C25592h) obj;
            return L.f(this.f57137a, c25592h.f57137a) && this.f57138b == c25592h.f57138b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57138b) + (this.f57137a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FiltersUpdated(link=");
            sb2.append(this.f57137a);
            sb2.append(", resetArea=");
            return androidx.appcompat.app.r.x(sb2, this.f57138b, ')');
        }

        public /* synthetic */ C25592h(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: MapAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbY/b$j;", "LbY/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bY.b$j, reason: case insensitive filesystem */
    public static final /* data */ class C25594j implements InterfaceC25585b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final FloatingViewsPresenter.Subscriber.b f57140a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57141b;

        public C25594j(@k FloatingViewsPresenter.Subscriber.b bVar, boolean z12) {
            this.f57140a = bVar;
            this.f57141b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25594j)) {
                return false;
            }
            C25594j c25594j = (C25594j) obj;
            return L.f(this.f57140a, c25594j.f57140a) && this.f57141b == c25594j.f57141b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57141b) + (this.f57140a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FloatingViewsStateUpdate(state=");
            sb2.append(this.f57140a);
            sb2.append(", hideInlineAction=");
            return androidx.appcompat.app.r.x(sb2, this.f57141b, ')');
        }

        public /* synthetic */ C25594j(FloatingViewsPresenter.Subscriber.b bVar, boolean z12, int i12, C42822w c42822w) {
            this(bVar, (i12 & 2) != 0 ? false : z12);
        }
    }
}
