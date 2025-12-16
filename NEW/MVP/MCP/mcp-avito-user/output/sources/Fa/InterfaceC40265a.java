package fA;

import androidx.compose.runtime.C22026a;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_ui_components.search_input.suggest.SuggestItem;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.S;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileAction.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f\u0082\u0001\u001e !\"#$%&'()*+,-./0123456789:;<=¨\u0006>"}, d2 = {"LfA/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "LfA/a$a;", "LfA/a$b;", "LfA/a$c;", "LfA/a$d;", "LfA/a$e;", "LfA/a$f;", "LfA/a$g;", "LfA/a$h;", "LfA/a$i;", "LfA/a$j;", "LfA/a$k;", "LfA/a$l;", "LfA/a$m;", "LfA/a$n;", "LfA/a$o;", "LfA/a$p;", "LfA/a$q;", "LfA/a$r;", "LfA/a$s;", "LfA/a$t;", "LfA/a$u;", "LfA/a$v;", "LfA/a$w;", "LfA/a$x;", "LfA/a$y;", "LfA/a$z;", "LfA/a$A;", "LfA/a$B;", "LfA/a$C;", "LfA/a$D;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fA.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC40265a {

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$A;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$A */
    public static final /* data */ class A implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f395710a;

        public A(@Y61.k String str) {
            this.f395710a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof A) && L.f(this.f395710a, ((A) obj).f395710a);
        }

        public final int hashCode() {
            return this.f395710a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("TopSearchSubmittedAction(text="), this.f395710a, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$B;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$B */
    public static final /* data */ class B implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final B f395711a = new B();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof B);
        }

        public final int hashCode() {
            return 1074472597;
        }

        @Y61.k
        public final String toString() {
            return "TriggerAvitoForBusinessUxFeedback";
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$C;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$C */
    public static final /* data */ class C implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f395712a;

        public C(boolean z12) {
            this.f395712a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C) && this.f395712a == ((C) obj).f395712a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f395712a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("UpdateInlineFiltersHeader(hasInlineFiltersHeader="), this.f395712a, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$D;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$D */
    public static final /* data */ class D implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final oB.k f395713a;

        public D(@Y61.k oB.k kVar) {
            this.f395713a = kVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof D) && L.f(this.f395713a, ((D) obj).f395713a);
        }

        public final int hashCode() {
            return this.f395713a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "WidgetActionWrapper(action=" + this.f395713a + ')';
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$a;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11131a implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C11131a f395714a = new C11131a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C11131a);
        }

        public final int hashCode() {
            return 1407188758;
        }

        @Y61.k
        public final String toString() {
            return "ExtendedProfileLazyColumnComponentBound";
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$b;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$b, reason: case insensitive filesystem */
    public static final /* data */ class C40266b implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C40266b f395715a = new C40266b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C40266b);
        }

        public final int hashCode() {
            return 351944320;
        }

        @Y61.k
        public final String toString() {
            return "ExtendedProfileLazyColumnComponentCreated";
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$c;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$c, reason: case insensitive filesystem */
    public static final /* data */ class C40267c implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f395716a;

        public C40267c(@Y61.k DeepLink deepLink) {
            this.f395716a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C40267c) && L.f(this.f395716a, ((C40267c) obj).f395716a);
        }

        public final int hashCode() {
            return this.f395716a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f395716a, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$d;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$d, reason: case insensitive filesystem */
    public static final /* data */ class C40268d implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f395717a;

        public C40268d(boolean z12) {
            this.f395717a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C40268d) && this.f395717a == ((C40268d) obj).f395717a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f395717a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("LoadData(isRefreshing="), this.f395717a, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$e;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$e */
    public static final /* data */ class e implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BannerInfo f395718a;

        /* renamed from: b, reason: collision with root package name */
        public final int f395719b;

        public e(@Y61.k BannerInfo bannerInfo, int i12) {
            this.f395718a = bannerInfo;
            this.f395719b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f395718a, eVar.f395718a) && this.f395719b == eVar.f395719b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395719b) + (this.f395718a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LogCommercialOnScreen(bannerInfo=");
            sb2.append(this.f395718a);
            sb2.append(", position=");
            return androidx.appcompat.app.r.t(sb2, this.f395719b, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$f;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$f */
    public static final /* data */ class f implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AdvertItem f395720a;

        public f(@Y61.k AdvertItem advertItem) {
            this.f395720a = advertItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f395720a, ((f) obj).f395720a);
        }

        public final int hashCode() {
            return this.f395720a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnAdvertItemClicked(advert=" + this.f395720a + ')';
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$g;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$g */
    public static final /* data */ class g implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        public final int f395721a;

        public g(int i12) {
            this.f395721a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f395721a == ((g) obj).f395721a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395721a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("OnAdvertsTabSelected(position="), this.f395721a, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$h;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$h */
    public static final class h implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f395722a = new h();
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$i;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$i */
    public static final /* data */ class i implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f395723a;

        public i(@Y61.k DeepLink deepLink) {
            this.f395723a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f395723a, ((i) obj).f395723a);
        }

        public final int hashCode() {
            return this.f395723a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnContactBarItemClicked(deepLink="), this.f395723a, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$j;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$j */
    public static final class j implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f395724a = new j();
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$k;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$k */
    public static final /* data */ class k implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final S f395725a;

        public k(@Y61.k S s5) {
            this.f395725a = s5;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f395725a, ((k) obj).f395725a);
        }

        public final int hashCode() {
            return this.f395725a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnFavoriteClicked(advert=" + this.f395725a + ')';
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$l;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$l */
    public static final /* data */ class l implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f395726a;

        public l(@Y61.k DeepLink deepLink) {
            this.f395726a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f395726a, ((l) obj).f395726a);
        }

        public final int hashCode() {
            return this.f395726a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnFloatingBuyBlockClicked(deepLink="), this.f395726a, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$m;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$m */
    public static final class m implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f395727a = new m();
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$n;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$n */
    public static final class n implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f395728a = new n();
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$o;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$o */
    public static final /* data */ class o implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f395729a;

        public o(@Y61.k Throwable th2) {
            this.f395729a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f395729a, ((o) obj).f395729a);
        }

        public final int hashCode() {
            return this.f395729a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("OnInlineFiltersError(error="), this.f395729a, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$p;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$p */
    public static final class p implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f395730a = new p();
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$q;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$q */
    public static final /* data */ class q implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f395731a;

        public q(@Y61.k DeepLink deepLink) {
            this.f395731a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f395731a, ((q) obj).f395731a);
        }

        public final int hashCode() {
            return this.f395731a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnSearchClarified(deeplink="), this.f395731a, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$r;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$r */
    public static final class r implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f395732a = new r();
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$s;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$s */
    public static final class s implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final s f395733a = new s();
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$t;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$t */
    public static final /* data */ class t implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SuggestItem f395734a;

        public t(@Y61.k SuggestItem suggestItem) {
            this.f395734a = suggestItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && L.f(this.f395734a, ((t) obj).f395734a);
        }

        public final int hashCode() {
            return this.f395734a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnSuggestClick(item=" + this.f395734a + ')';
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$u;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$u */
    public static final class u implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final u f395735a = new u();
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$v;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$v */
    public static final /* data */ class v implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BannerInfo f395736a;

        /* renamed from: b, reason: collision with root package name */
        public final int f395737b;

        public v(@Y61.k BannerInfo bannerInfo, int i12) {
            this.f395736a = bannerInfo;
            this.f395737b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return L.f(this.f395736a, vVar.f395736a) && this.f395737b == vVar.f395737b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395737b) + (this.f395736a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenCommercial(bannerInfo=");
            sb2.append(this.f395736a);
            sb2.append(", position=");
            return androidx.appcompat.app.r.t(sb2, this.f395737b, ')');
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$w;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$w */
    public static final class w implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final w f395738a = new w();
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$x;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$x */
    public static final /* data */ class x implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.deeplink_handler.handler.bundle.a f395739a;

        public x(@Y61.k com.avito.android.deeplink_handler.handler.bundle.a aVar) {
            this.f395739a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && L.f(this.f395739a, ((x) obj).f395739a);
        }

        public final int hashCode() {
            return this.f395739a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PhoneRequestLinkCancel(deeplinkBundle=" + this.f395739a + ')';
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfA/a$y;", "LfA/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$y */
    public static final /* data */ class y implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final y f395740a = new y();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 1712590610;
        }

        @Y61.k
        public final String toString() {
            return "TopSearchDismiss";
        }
    }

    /* compiled from: ExtendedProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfA/a$z;", "LfA/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fA.a$z */
    public static final /* data */ class z implements InterfaceC40265a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f395741a;

        public z(@Y61.k String str) {
            this.f395741a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && L.f(this.f395741a, ((z) obj).f395741a);
        }

        public final int hashCode() {
            return this.f395741a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("TopSearchInputAction(text="), this.f395741a, ')');
        }
    }
}
