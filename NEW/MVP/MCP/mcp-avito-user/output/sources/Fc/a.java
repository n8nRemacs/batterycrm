package FC;

import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite_sellers.SubscribableItem;
import com.avito.android.favorite_sellers.X;
import com.avito.android.favorite_sellers.adapter.seller.SellerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteSellersAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"LFC/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "LFC/a$a;", "LFC/a$b;", "LFC/a$c;", "LFC/a$d;", "LFC/a$e;", "LFC/a$f;", "LFC/a$g;", "LFC/a$h;", "LFC/a$i;", "LFC/a$j;", "LFC/a$k;", "LFC/a$l;", "LFC/a$m;", "LFC/a$n;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$a;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: FC.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0280a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SubscribableItem f4599a;

        public C0280a(@Y61.k SubscribableItem subscribableItem) {
            this.f4599a = subscribableItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0280a) && L.f(this.f4599a, ((C0280a) obj).f4599a);
        }

        public final int hashCode() {
            return this.f4599a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangeNotification(item=" + this.f4599a + ')';
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFC/a$b;", "LFC/a;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {
        static {
            new b();
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$c;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f4600a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Bundle f4601b;

        public c(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
            this.f4600a = deepLink;
            this.f4601b = bundle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f4600a, cVar.f4600a) && L.f(this.f4601b, cVar.f4601b);
        }

        public final int hashCode() {
            int iHashCode = this.f4600a.hashCode() * 31;
            Bundle bundle = this.f4601b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeepLinkAction(deeplink=");
            sb2.append(this.f4600a);
            sb2.append(", args=");
            return H.m(sb2, this.f4601b, ')');
        }

        public /* synthetic */ c(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$d;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4602a;

        public d(boolean z12) {
            this.f4602a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f4602a == ((d) obj).f4602a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4602a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("LoadData(isRefresh="), this.f4602a, ')');
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$e;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f4603a;

        public e(@Y61.k Uri uri) {
            this.f4603a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f4603a, ((e) obj).f4603a);
        }

        public final int hashCode() {
            return this.f4603a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("LoadNextPage(nextPageUri="), this.f4603a, ')');
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$f;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f4604a;

        public f(@Y61.k Uri uri) {
            this.f4604a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f4604a, ((f) obj).f4604a);
        }

        public final int hashCode() {
            return this.f4604a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("LoadNextPageRetry(nextPageUri="), this.f4604a, ')');
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$g;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4605a;

        public g(boolean z12) {
            this.f4605a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f4605a == ((g) obj).f4605a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4605a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("OnScreenVisibilityChanged(isVisible="), this.f4605a, ')');
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFC/a$h;", "LFC/a;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f4606a = new h();
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$i;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SellerItem f4607a;

        public i(@Y61.k SellerItem sellerItem) {
            this.f4607a = sellerItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f4607a, ((i) obj).f4607a);
        }

        public final int hashCode() {
            return this.f4607a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenSubscriptionSettings(item=" + this.f4607a + ')';
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFC/a$j;", "LFC/a;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f4608a = new j();
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$k;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SubscribableItem f4609a;

        public k(@Y61.k SubscribableItem subscribableItem) {
            this.f4609a = subscribableItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f4609a, ((k) obj).f4609a);
        }

        public final int hashCode() {
            return this.f4609a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SubscribeTo(item=" + this.f4609a + ')';
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFC/a$l;", "LFC/a;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f4610a = new l();
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$m;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SubscribableItem f4611a;

        public m(@Y61.k SubscribableItem subscribableItem) {
            this.f4611a = subscribableItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f4611a, ((m) obj).f4611a);
        }

        public final int hashCode() {
            return this.f4611a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UnsubscribeFrom(item=" + this.f4611a + ')';
        }
    }

    /* compiled from: FavoriteSellersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFC/a$n;", "LFC/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final X f4612a;

        public n(@Y61.k X x12) {
            this.f4612a = x12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f4612a, ((n) obj).f4612a);
        }

        public final int hashCode() {
            return this.f4612a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ViewPortUpdate(state=" + this.f4612a + ')';
        }
    }
}
