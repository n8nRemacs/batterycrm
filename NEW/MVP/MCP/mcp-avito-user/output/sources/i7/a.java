package I7;

import android.net.Uri;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.OrderEntity;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.select.item_with_iconbutton.ItemWithIconButtonRightEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: AdvertCollectionAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"LI7/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "LI7/a$a;", "LI7/a$b;", "LI7/a$c;", "LI7/a$d;", "LI7/a$e;", "LI7/a$f;", "LI7/a$g;", "LI7/a$h;", "LI7/a$i;", "LI7/a$j;", "LI7/a$k;", "LI7/a$l;", "LI7/a$m;", "LI7/a$n;", "LI7/a$o;", "LI7/a$p;", "LI7/a$q;", "LI7/a$r;", "LI7/a$s;", "LI7/a$t;", "LI7/a$u;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$a;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: I7.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0448a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0448a f7954a = new C0448a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0448a);
        }

        public final int hashCode() {
            return 376517432;
        }

        @Y61.k
        public final String toString() {
            return "AddItems";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$b;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f7955a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1670519221;
        }

        @Y61.k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$c;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f7956a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1151400638;
        }

        @Y61.k
        public final String toString() {
            return "DeleteCollection";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$d;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f7957a;

        public d(@Y61.k Uri uri) {
            this.f7957a = uri;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f7957a, ((d) obj).f7957a);
        }

        public final int hashCode() {
            return this.f7957a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("LoadNextPage(page="), this.f7957a, ')');
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$e;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f7958a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1711345452;
        }

        @Y61.k
        public final String toString() {
            return "LocationFound";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$f;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f7959a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -438102563;
        }

        @Y61.k
        public final String toString() {
            return "LocationNotFound";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$g;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ItemWithIconButtonRightEntity f7960a;

        public g(@Y61.l ItemWithIconButtonRightEntity itemWithIconButtonRightEntity) {
            this.f7960a = itemWithIconButtonRightEntity;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f7960a, ((g) obj).f7960a);
        }

        public final int hashCode() {
            ItemWithIconButtonRightEntity itemWithIconButtonRightEntity = this.f7960a;
            if (itemWithIconButtonRightEntity == null) {
                return 0;
            }
            return itemWithIconButtonRightEntity.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MenuActionSelected(selectedAction=" + this.f7960a + ')';
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$h;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f7961a;

        public h(@Y61.k DeepLink deepLink) {
            this.f7961a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f7961a, ((h) obj).f7961a);
        }

        public final int hashCode() {
            return this.f7961a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnAuthorClick(deepLink="), this.f7961a, ')');
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$i;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AutotekaPurchaseAction f7962a;

        public i(@Y61.k AutotekaPurchaseAction autotekaPurchaseAction) {
            this.f7962a = autotekaPurchaseAction;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f7962a, ((i) obj).f7962a);
        }

        public final int hashCode() {
            return this.f7962a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnAutotekaButtonClick(autotekaAction=" + this.f7962a + ')';
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$j;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f7963a;

        public j(@Y61.k DeepLink deepLink) {
            this.f7963a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f7963a, ((j) obj).f7963a);
        }

        public final int hashCode() {
            return this.f7963a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplink(deeplink="), this.f7963a, ')');
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$k;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C43501a f7964a;

        public k(@Y61.k C43501a c43501a) {
            this.f7964a = c43501a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f7964a, ((k) obj).f7964a);
        }

        public final int hashCode() {
            return this.f7964a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnDeeplinkResult(result=" + this.f7964a + ')';
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$l;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FavoriteAdvertItem f7965a;

        public l(@Y61.k FavoriteAdvertItem favoriteAdvertItem) {
            this.f7965a = favoriteAdvertItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f7965a, ((l) obj).f7965a);
        }

        public final int hashCode() {
            return this.f7965a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnFavoriteButtonClick(item=" + this.f7965a + ')';
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$m;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f7966a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -2048311591;
        }

        @Y61.k
        public final String toString() {
            return "OnLikeClick";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$n;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f7967a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 883504657;
        }

        @Y61.k
        public final String toString() {
            return "OnMenuClick";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$o;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final o f7968a = new o();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return -2021998176;
        }

        @Y61.k
        public final String toString() {
            return "OnOrderButtonClick";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$p;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final FavoriteAdvertItem f7969a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Image f7970b;

        public p(@Y61.k FavoriteAdvertItem favoriteAdvertItem, @Y61.l Image image) {
            this.f7969a = favoriteAdvertItem;
            this.f7970b = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.f7969a, pVar.f7969a) && L.f(this.f7970b, pVar.f7970b);
        }

        public final int hashCode() {
            int iHashCode = this.f7969a.hashCode() * 31;
            Image image = this.f7970b;
            return iHashCode + (image == null ? 0 : image.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenAdvert(item=");
            sb2.append(this.f7969a);
            sb2.append(", image=");
            return AK.c.o(sb2, this.f7970b, ')');
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$q;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final OrderEntity f7971a;

        public q(@Y61.l OrderEntity orderEntity) {
            this.f7971a = orderEntity;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f7971a, ((q) obj).f7971a);
        }

        public final int hashCode() {
            OrderEntity orderEntity = this.f7971a;
            if (orderEntity == null) {
                return 0;
            }
            return orderEntity.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OrderSelected(orderEntity=" + this.f7971a + ')';
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$r;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f7972a = new r();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return 1079720401;
        }

        @Y61.k
        public final String toString() {
            return "RefreshPage";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$s;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f7973a;

        public s(@Y61.k String str) {
            this.f7973a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f7973a, ((s) obj).f7973a);
        }

        public final int hashCode() {
            return this.f7973a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("RetryLoadNextPage(page="), this.f7973a, ')');
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LI7/a$t;", "LI7/a;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f7974a = new t();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof t);
        }

        public final int hashCode() {
            return 1714928702;
        }

        @Y61.k
        public final String toString() {
            return "ShareCollectionLink";
        }
    }

    /* compiled from: AdvertCollectionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI7/a$u;", "LI7/a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f7975a;

        public u(@Y61.k String str) {
            this.f7975a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && L.f(this.f7975a, ((u) obj).f7975a);
        }

        public final int hashCode() {
            return this.f7975a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSimilarAdverts(itemId="), this.f7975a, ')');
        }
    }
}
