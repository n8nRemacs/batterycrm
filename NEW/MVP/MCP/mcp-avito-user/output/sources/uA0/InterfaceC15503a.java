package Ua0;

import android.net.Uri;
import androidx.compose.runtime.C22026a;
import com.avito.android.active_orders_common.items.comfortable_deal.deeplink.CloseInternalBannerRotationDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.cards.recommendations.a;
import com.avito.android.remote.model.user_profile.items.PromoBanner;
import com.avito.android.silent_update.DownloadUpdateConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserProfileAction.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0019\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u0082\u0001\u0019\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"LUa0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "LUa0/a$a;", "LUa0/a$b;", "LUa0/a$c;", "LUa0/a$d;", "LUa0/a$e;", "LUa0/a$f;", "LUa0/a$g;", "LUa0/a$h;", "LUa0/a$i;", "LUa0/a$j;", "LUa0/a$k;", "LUa0/a$l;", "LUa0/a$m;", "LUa0/a$n;", "LUa0/a$o;", "LUa0/a$p;", "LUa0/a$q;", "LUa0/a$r;", "LUa0/a$s;", "LUa0/a$t;", "LUa0/a$u;", "LUa0/a$v;", "LUa0/a$w;", "LUa0/a$x;", "LUa0/a$y;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ua0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC15503a {

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$a;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1130a implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16447a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16448b;

        public C1130a(@Y61.k DeepLink deepLink, boolean z12) {
            this.f16447a = deepLink;
            this.f16448b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1130a)) {
                return false;
            }
            C1130a c1130a = (C1130a) obj;
            return L.f(this.f16447a, c1130a.f16447a) && this.f16448b == c1130a.f16448b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16448b) + (this.f16447a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeeplinkAction(deeplink=");
            sb2.append(this.f16447a);
            sb2.append(", reloadOnResult=");
            return androidx.appcompat.app.r.x(sb2, this.f16448b, ')');
        }

        public /* synthetic */ C1130a(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? true : z12);
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/a$b;", "LUa0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$b */
    public static final /* data */ class b implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f16449a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2063515686;
        }

        @Y61.k
        public final String toString() {
            return "HideSilentUpdateBanner";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$c;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$c */
    public static final /* data */ class c implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DownloadUpdateConfig.OneTimeDownloadRequest f16450a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DownloadUpdateConfig.PeriodicDownloadRequest f16451b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final CloseInternalBannerRotationDeepLink f16452c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f16453d;

        public c(@Y61.k DownloadUpdateConfig.OneTimeDownloadRequest oneTimeDownloadRequest, @Y61.k DownloadUpdateConfig.PeriodicDownloadRequest periodicDownloadRequest, @Y61.k CloseInternalBannerRotationDeepLink closeInternalBannerRotationDeepLink, @Y61.k String str) {
            this.f16450a = oneTimeDownloadRequest;
            this.f16451b = periodicDownloadRequest;
            this.f16452c = closeInternalBannerRotationDeepLink;
            this.f16453d = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f16450a.equals(cVar.f16450a) && this.f16451b.equals(cVar.f16451b) && this.f16452c.equals(cVar.f16452c) && L.f(this.f16453d, cVar.f16453d);
        }

        public final int hashCode() {
            return this.f16453d.hashCode() + ((this.f16452c.hashCode() + ((this.f16451b.hashCode() + (this.f16450a.hashCode() * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InitSilentUpdateObserver(oneTime=");
            sb2.append(this.f16450a);
            sb2.append(", periodic=");
            sb2.append(this.f16451b);
            sb2.append(", onSuccess=");
            sb2.append(this.f16452c);
            sb2.append(", confirmMessage=");
            return C22026a.c(sb2, this.f16453d, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/a$d;", "LUa0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$d */
    public static final /* data */ class d implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f16454a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1049860386;
        }

        @Y61.k
        public final String toString() {
            return "LoadData";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$e;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$e */
    public static final /* data */ class e implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16455a;

        public e(@Y61.k DeepLink deepLink) {
            this.f16455a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f16455a, ((e) obj).f16455a);
        }

        public final int hashCode() {
            return this.f16455a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnAddressCardDeeplinkClicked(deeplink="), this.f16455a, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/a$f;", "LUa0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$f */
    public static final /* data */ class f implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f16456a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 303379542;
        }

        @Y61.k
        public final String toString() {
            return "OnAvatarDeleteClicked";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$g;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$g */
    public static final /* data */ class g implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f16457a;

        public g(@Y61.k Uri uri) {
            this.f16457a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f16457a, ((g) obj).f16457a);
        }

        public final int hashCode() {
            return this.f16457a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("OnAvatarSelected(uri="), this.f16457a, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$h;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$h */
    public static final /* data */ class h implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16458a;

        public h(@Y61.k DeepLink deepLink) {
            this.f16458a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f16458a, ((h) obj).f16458a);
        }

        public final int hashCode() {
            return this.f16458a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnAvitoFinanceClicked(deeplink="), this.f16458a, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$i;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$i */
    public static final /* data */ class i implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16459a;

        public i(@Y61.k DeepLink deepLink) {
            this.f16459a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f16459a, ((i) obj).f16459a);
        }

        public final int hashCode() {
            return this.f16459a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnAvitoFinanceDynamicClicked(deeplink="), this.f16459a, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$j;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$j */
    public static final /* data */ class j implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16460a;

        public j(@Y61.k DeepLink deepLink) {
            this.f16460a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f16460a, ((j) obj).f16460a);
        }

        public final int hashCode() {
            return this.f16460a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnCardDeeplinkClicked(deeplink="), this.f16460a, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$k;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$k */
    public static final /* data */ class k implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CardItem f16461a;

        public k(@Y61.k CardItem cardItem) {
            this.f16461a = cardItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f16461a, ((k) obj).f16461a);
        }

        public final int hashCode() {
            return this.f16461a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnCardItemClicked(card=" + this.f16461a + ')';
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$l;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$l */
    public static final /* data */ class l implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16462a;

        public l(@Y61.k DeepLink deepLink) {
            this.f16462a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f16462a, ((l) obj).f16462a);
        }

        public final int hashCode() {
            return this.f16462a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnCardRatingClicked(deeplink="), this.f16462a, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$m;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$m */
    public static final /* data */ class m implements InterfaceC15503a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            ((m) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "OnDismissAddressClicked(geoSessionId=null, suggestAddressId=0)";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$n;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$n */
    public static final /* data */ class n implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16463a;

        public n(int i12) {
            this.f16463a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f16463a == ((n) obj).f16463a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16463a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("OnHeaderActionClicked(position="), this.f16463a, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/a$o;", "LUa0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$o */
    public static final /* data */ class o implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f16464a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 993284779;
        }

        @Y61.k
        public final String toString() {
            return "OnLoginClicked";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$p;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$p */
    public static final /* data */ class p implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16465a;

        public p(@Y61.k DeepLink deepLink) {
            this.f16465a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f16465a, ((p) obj).f16465a);
        }

        public final int hashCode() {
            return this.f16465a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnLoyaltyWidgetClicked(deeplink="), this.f16465a, ')');
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/a$q;", "LUa0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$q */
    public static final /* data */ class q implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f16466a = new q();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -1491889893;
        }

        @Y61.k
        public final String toString() {
            return "OnPaused";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$r;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$r */
    public static final /* data */ class r implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PromoBanner.ClickAction f16467a;

        public r(@Y61.k PromoBanner.ClickAction clickAction) {
            this.f16467a = clickAction;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && L.f(this.f16467a, ((r) obj).f16467a);
        }

        public final int hashCode() {
            return this.f16467a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnPromoBannerClicked(clickAction=" + this.f16467a + ')';
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$s;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$s */
    public static final /* data */ class s implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a.C6833a f16468a;

        public s(@Y61.k a.C6833a c6833a) {
            this.f16468a = c6833a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f16468a, ((s) obj).f16468a);
        }

        public final int hashCode() {
            this.f16468a.getClass();
            return 671660273;
        }

        @Y61.k
        public final String toString() {
            return "OnRecommendationEventWrapper(action=" + this.f16468a + ')';
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/a$t;", "LUa0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$t */
    public static final /* data */ class t implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f16469a = new t();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return -1411169398;
        }

        @Y61.k
        public final String toString() {
            return "OnResumed";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/a$u;", "LUa0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$u */
    public static final /* data */ class u implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final u f16470a = new u();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof u);
        }

        public final int hashCode() {
            return 346537951;
        }

        @Y61.k
        public final String toString() {
            return "OnShareActionClicked";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/a$v;", "LUa0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$v */
    public static final /* data */ class v implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final v f16471a = new v();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof v);
        }

        public final int hashCode() {
            return 2133104489;
        }

        @Y61.k
        public final String toString() {
            return "OnTakePhotoClicked";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$w;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$w */
    public static final /* data */ class w implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.user_hat.e f16472a;

        public w(@Y61.k com.avito.android.component.user_hat.e eVar) {
            this.f16472a = eVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && L.f(this.f16472a, ((w) obj).f16472a);
        }

        public final int hashCode() {
            return this.f16472a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PassportCardEventWrapper(event=" + this.f16472a + ')';
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUa0/a$x;", "LUa0/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$x */
    public static final /* data */ class x implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final x f16473a = new x();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return 1537947959;
        }

        @Y61.k
        public final String toString() {
            return "RefreshData";
        }
    }

    /* compiled from: UserProfileAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUa0/a$y;", "LUa0/a;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ua0.a$y */
    public static final /* data */ class y implements InterfaceC15503a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.promoblock.a f16474a;

        public y(@Y61.k com.avito.android.promoblock.a aVar) {
            this.f16474a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && L.f(this.f16474a, ((y) obj).f16474a);
        }

        public final int hashCode() {
            return this.f16474a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "TnsPromoBlockItemActionWrapper(action=" + this.f16474a + ')';
        }
    }
}
