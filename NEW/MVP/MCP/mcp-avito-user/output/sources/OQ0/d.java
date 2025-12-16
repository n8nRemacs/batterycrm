package Oq0;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerPromotionsAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"LOq0/d;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "LOq0/a;", "LOq0/d$b;", "LOq0/d$c;", "LOq0/d$e;", "LOq0/d$f;", "LOq0/d$g;", "LOq0/d$h;", "LOq0/d$i;", "LOq0/d$j;", "LOq0/d$k;", "LOq0/d$l;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/d$a;", "LOq0/a;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements InterfaceC14727a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f12570a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12571b;

        public a(@Y61.k String str, int i12) {
            this.f12570a = str;
            this.f12571b = i12;
        }

        @Override // Oq0.InterfaceC14727a
        /* renamed from: Q */
        public final int getF12580b() {
            return 0;
        }

        @Override // Oq0.InterfaceC14727a
        /* renamed from: R */
        public final int getF12581c() {
            return 1;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f12570a, aVar.f12570a) && this.f12571b == aVar.f12571b;
        }

        @Override // Oq0.InterfaceC14727a
        @Y61.k
        /* renamed from: getItemId, reason: from getter */
        public final String getF12579a() {
            return this.f12570a;
        }

        @Override // Oq0.InterfaceC14727a
        /* renamed from: getMaxQuantity, reason: from getter */
        public final int getF12582d() {
            return this.f12571b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12571b) + (this.f12570a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddItemToCart(itemId=");
            sb2.append(this.f12570a);
            sb2.append(", maxQuantity=");
            return r.t(sb2, this.f12571b, ')');
        }
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/d$b;", "LOq0/d;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f12572a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f12573b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f12574c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final DeepLink f12575d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Image f12576e;

        /* renamed from: f, reason: collision with root package name */
        public final long f12577f;

        public b(long j12, @Y61.l Image image, @Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.l String str3) {
            this.f12572a = str;
            this.f12573b = str2;
            this.f12574c = str3;
            this.f12575d = deepLink;
            this.f12576e = image;
            this.f12577f = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f12572a, bVar.f12572a) && L.f(this.f12573b, bVar.f12573b) && L.f(this.f12574c, bVar.f12574c) && L.f(this.f12575d, bVar.f12575d) && L.f(this.f12576e, bVar.f12576e) && this.f12577f == bVar.f12577f;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f12572a.hashCode() * 31, 31, this.f12573b);
            String str = this.f12574c;
            int iE2 = com.avito.android.actions_sheet.a.e(this.f12575d, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31);
            Image image = this.f12576e;
            return Long.hashCode(this.f12577f) + ((iE2 + (image != null ? image.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertClick(itemId=");
            sb2.append(this.f12572a);
            sb2.append(", title=");
            sb2.append(this.f12573b);
            sb2.append(", price=");
            sb2.append(this.f12574c);
            sb2.append(", onTapDeepLink=");
            sb2.append(this.f12575d);
            sb2.append(", image=");
            sb2.append(this.f12576e);
            sb2.append(", clickTime=");
            return r.u(sb2, this.f12577f, ')');
        }
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOq0/d$c;", "LOq0/d;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f12578a = new c();
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/d$d;", "LOq0/a;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Oq0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0811d implements InterfaceC14727a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f12579a;

        /* renamed from: b, reason: collision with root package name */
        public final int f12580b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12581c;

        /* renamed from: d, reason: collision with root package name */
        public final int f12582d;

        public C0811d(@Y61.k String str, int i12, int i13, int i14) {
            this.f12579a = str;
            this.f12580b = i12;
            this.f12581c = i13;
            this.f12582d = i14;
        }

        @Override // Oq0.InterfaceC14727a
        /* renamed from: Q, reason: from getter */
        public final int getF12580b() {
            return this.f12580b;
        }

        @Override // Oq0.InterfaceC14727a
        /* renamed from: R, reason: from getter */
        public final int getF12581c() {
            return this.f12581c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0811d)) {
                return false;
            }
            C0811d c0811d = (C0811d) obj;
            return L.f(this.f12579a, c0811d.f12579a) && this.f12580b == c0811d.f12580b && this.f12581c == c0811d.f12581c && this.f12582d == c0811d.f12582d;
        }

        @Override // Oq0.InterfaceC14727a
        @Y61.k
        /* renamed from: getItemId, reason: from getter */
        public final String getF12579a() {
            return this.f12579a;
        }

        @Override // Oq0.InterfaceC14727a
        /* renamed from: getMaxQuantity, reason: from getter */
        public final int getF12582d() {
            return this.f12582d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f12582d) + r.e(this.f12581c, r.e(this.f12580b, this.f12579a.hashCode() * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeItemQuantity(itemId=");
            sb2.append(this.f12579a);
            sb2.append(", oldQuantity=");
            sb2.append(this.f12580b);
            sb2.append(", newQuantity=");
            sb2.append(this.f12581c);
            sb2.append(", maxQuantity=");
            return r.t(sb2, this.f12582d, ')');
        }
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOq0/d$e;", "LOq0/d;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f12583a = new e();
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOq0/d$f;", "LOq0/d;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f12584a = new f();
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOq0/d$g;", "LOq0/d;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f12585a = new g();
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOq0/d$h;", "LOq0/d;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f12586a = new h();
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOq0/d$i;", "LOq0/d;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f12587a = new i();
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOq0/d$j;", "LOq0/d;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f12588a = new j();
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/d$k;", "LOq0/d;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f12589a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f12590b;

        public k(@Y61.k String str, boolean z12) {
            this.f12589a = str;
            this.f12590b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f12589a, kVar.f12589a) && this.f12590b == kVar.f12590b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12590b) + (this.f12589a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleFavorite(itemId=");
            sb2.append(this.f12589a);
            sb2.append(", isFavoriteOnBack=");
            return r.x(sb2, this.f12590b, ')');
        }
    }

    /* compiled from: SellerPromotionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/d$l;", "LOq0/d;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC31171n f12591a;

        public l(@Y61.k InterfaceC31171n interfaceC31171n) {
            this.f12591a = interfaceC31171n;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f12591a, ((l) obj).f12591a);
        }

        public final int hashCode() {
            return this.f12591a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateCartIconState(state=" + this.f12591a + ')';
        }
    }
}
