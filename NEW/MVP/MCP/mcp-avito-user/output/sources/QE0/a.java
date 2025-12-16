package QE0;

import Dh0.InterfaceC13400a;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelGuestProfileAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"LQE0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "LQE0/a$a;", "LQE0/a$b;", "LQE0/a$c;", "LQE0/a$d;", "LQE0/a$e;", "LQE0/a$f;", "LQE0/a$g;", "LQE0/a$h;", "LQE0/a$i;", "LQE0/a$j;", "LQE0/a$k;", "LQE0/a$l;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/a$a;", "LQE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: QE0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0891a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f13600a;

        public C0891a(@Y61.k DeepLink deepLink) {
            this.f13600a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0891a) && L.f(this.f13600a, ((C0891a) obj).f13600a);
        }

        public final int hashCode() {
            return this.f13600a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("AttributedTextDeeplinkClick(deeplink="), this.f13600a, ')');
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/a$b;", "LQE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Image f13601a;

        public b(@Y61.k Image image) {
            this.f13601a = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f13601a, ((b) obj).f13601a);
        }

        public final int hashCode() {
            return this.f13601a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.o(new StringBuilder("AvatarPictureClick(image="), this.f13601a, ')');
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/a$c;", "LQE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final PE0.c f13602a;

        public c(@Y61.l PE0.c cVar) {
            this.f13602a = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13602a, ((c) obj).f13602a);
        }

        public final int hashCode() {
            PE0.c cVar = this.f13602a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "EmptyStateBannerButtonClick(buttonAction=" + this.f13602a + ')';
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/a$d;", "LQE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f13603a;

        public d(@Y61.l String str) {
            this.f13603a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13603a, ((d) obj).f13603a);
        }

        public final int hashCode() {
            String str = this.f13603a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("EmptyStateBannerShown(bannerType="), this.f13603a, ')');
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/a$e;", "LQE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f13604a;

        public e(@Y61.k DeepLink deepLink) {
            this.f13604a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13604a, ((e) obj).f13604a);
        }

        public final int hashCode() {
            return this.f13604a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ExtendedPlanButtonClick(deeplink="), this.f13604a, ')');
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQE0/a$f;", "LQE0/a;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f13605a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -639783397;
        }

        @Y61.k
        public final String toString() {
            return "LoadNextReviewsPage";
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/a$g;", "LQE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f13606a;

        public g(@Y61.k DeepLink deepLink) {
            this.f13606a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f13606a, ((g) obj).f13606a);
        }

        public final int hashCode() {
            return this.f13606a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ProfileHeaderBadgeClick(deeplink="), this.f13606a, ')');
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQE0/a$h;", "LQE0/a;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f13607a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -224736559;
        }

        @Y61.k
        public final String toString() {
            return "RefreshButtonClick";
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/a$i;", "LQE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f13608a;

        public i(boolean z12) {
            this.f13608a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f13608a == ((i) obj).f13608a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13608a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("RefreshReviewsClick(isPagination="), this.f13608a, ')');
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/a$j;", "LQE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC13400a f13609a;

        public j(@Y61.k InterfaceC13400a interfaceC13400a) {
            this.f13609a = interfaceC13400a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f13609a, ((j) obj).f13609a);
        }

        public final int hashCode() {
            return this.f13609a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReviewItemClick(clickedItemAction=" + this.f13609a + ')';
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQE0/a$k;", "LQE0/a;", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f13610a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -372661951;
        }

        @Y61.k
        public final String toString() {
            return "SortItemClick";
        }
    }

    /* compiled from: TravelGuestProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQE0/a$l;", "LQE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f13611a;

        public l(@Y61.k String str) {
            this.f13611a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f13611a, ((l) obj).f13611a);
        }

        public final int hashCode() {
            return this.f13611a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SortOptionClicked(value="), this.f13611a, ')');
        }
    }
}
