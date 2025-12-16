package mn;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSimilarItemsAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lmn/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Lmn/a$b;", "Lmn/a$c;", "Lmn/a$e;", "Lmn/a$f;", "Lmn/a$g;", "Lmn/a$h;", "Lmn/a$i;", "Lmn/a$j;", "Lmn/a$k;", "Lmn/e;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44101a {

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/a$a;", "Lmn/e;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11839a implements InterfaceC44105e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f414669a;

        /* renamed from: b, reason: collision with root package name */
        public final int f414670b;

        public C11839a(@Y61.k String str, int i12) {
            this.f414669a = str;
            this.f414670b = i12;
        }

        @Override // mn.InterfaceC44105e
        /* renamed from: Q */
        public final int getF414678b() {
            return 0;
        }

        @Override // mn.InterfaceC44105e
        /* renamed from: R */
        public final int getF414679c() {
            return 1;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11839a)) {
                return false;
            }
            C11839a c11839a = (C11839a) obj;
            return L.f(this.f414669a, c11839a.f414669a) && this.f414670b == c11839a.f414670b;
        }

        @Override // mn.InterfaceC44105e
        @Y61.k
        /* renamed from: getItemId, reason: from getter */
        public final String getF414677a() {
            return this.f414669a;
        }

        @Override // mn.InterfaceC44105e
        /* renamed from: getMaxQuantity, reason: from getter */
        public final int getF414680d() {
            return this.f414670b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f414670b) + (this.f414669a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddItemToCart(itemId=");
            sb2.append(this.f414669a);
            sb2.append(", maxQuantity=");
            return r.t(sb2, this.f414670b, ')');
        }
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/a$b;", "Lmn/a;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$b */
    public static final /* data */ class b implements InterfaceC44101a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f414671a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f414672b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f414673c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Image f414674d;

        /* renamed from: e, reason: collision with root package name */
        public final long f414675e;

        public b(@Y61.k String str, @Y61.k String str2, @l String str3, @l Image image, long j12) {
            this.f414671a = str;
            this.f414672b = str2;
            this.f414673c = str3;
            this.f414674d = image;
            this.f414675e = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f414671a, bVar.f414671a) && L.f(this.f414672b, bVar.f414672b) && L.f(this.f414673c, bVar.f414673c) && L.f(this.f414674d, bVar.f414674d) && this.f414675e == bVar.f414675e;
        }

        public final int hashCode() {
            int iD2 = H.d(this.f414671a.hashCode() * 31, 31, this.f414672b);
            String str = this.f414673c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Image image = this.f414674d;
            return Long.hashCode(this.f414675e) + ((iHashCode + (image != null ? image.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertClick(itemId=");
            sb2.append(this.f414671a);
            sb2.append(", title=");
            sb2.append(this.f414672b);
            sb2.append(", price=");
            sb2.append(this.f414673c);
            sb2.append(", image=");
            sb2.append(this.f414674d);
            sb2.append(", clickTime=");
            return r.u(sb2, this.f414675e, ')');
        }
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/a$c;", "Lmn/a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$c */
    public static final class c implements InterfaceC44101a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f414676a = new c();
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/a$d;", "Lmn/e;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$d */
    public static final /* data */ class d implements InterfaceC44105e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f414677a;

        /* renamed from: b, reason: collision with root package name */
        public final int f414678b;

        /* renamed from: c, reason: collision with root package name */
        public final int f414679c;

        /* renamed from: d, reason: collision with root package name */
        public final int f414680d;

        public d(@Y61.k String str, int i12, int i13, int i14) {
            this.f414677a = str;
            this.f414678b = i12;
            this.f414679c = i13;
            this.f414680d = i14;
        }

        @Override // mn.InterfaceC44105e
        /* renamed from: Q, reason: from getter */
        public final int getF414678b() {
            return this.f414678b;
        }

        @Override // mn.InterfaceC44105e
        /* renamed from: R, reason: from getter */
        public final int getF414679c() {
            return this.f414679c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f414677a, dVar.f414677a) && this.f414678b == dVar.f414678b && this.f414679c == dVar.f414679c && this.f414680d == dVar.f414680d;
        }

        @Override // mn.InterfaceC44105e
        @Y61.k
        /* renamed from: getItemId, reason: from getter */
        public final String getF414677a() {
            return this.f414677a;
        }

        @Override // mn.InterfaceC44105e
        /* renamed from: getMaxQuantity, reason: from getter */
        public final int getF414680d() {
            return this.f414680d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f414680d) + r.e(this.f414679c, r.e(this.f414678b, this.f414677a.hashCode() * 31, 31), 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeItemQuantity(itemId=");
            sb2.append(this.f414677a);
            sb2.append(", oldQuantity=");
            sb2.append(this.f414678b);
            sb2.append(", newQuantity=");
            sb2.append(this.f414679c);
            sb2.append(", maxQuantity=");
            return r.t(sb2, this.f414680d, ')');
        }
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/a$e;", "Lmn/a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$e */
    public static final class e implements InterfaceC44101a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f414681a = new e();
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/a$f;", "Lmn/a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$f */
    public static final class f implements InterfaceC44101a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f414682a = new f();
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/a$g;", "Lmn/a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$g */
    public static final class g implements InterfaceC44101a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f414683a = new g();
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/a$h;", "Lmn/a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$h */
    public static final class h implements InterfaceC44101a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f414684a = new h();
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/a$i;", "Lmn/a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$i */
    public static final class i implements InterfaceC44101a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f414685a = new i();
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/a$j;", "Lmn/a;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$j */
    public static final /* data */ class j implements InterfaceC44101a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f414686a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f414687b;

        public j(@Y61.k String str, boolean z12) {
            this.f414686a = str;
            this.f414687b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f414686a, jVar.f414686a) && this.f414687b == jVar.f414687b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f414687b) + (this.f414686a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleFavorite(itemId=");
            sb2.append(this.f414686a);
            sb2.append(", isFavoriteOnBack=");
            return r.x(sb2, this.f414687b, ')');
        }
    }

    /* compiled from: CartSimilarItemsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/a$k;", "Lmn/a;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.a$k */
    public static final /* data */ class k implements InterfaceC44101a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC31171n f414688a;

        public k(@Y61.k InterfaceC31171n interfaceC31171n) {
            this.f414688a = interfaceC31171n;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f414688a, ((k) obj).f414688a);
        }

        public final int hashCode() {
            return this.f414688a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateCartIconState(state=" + this.f414688a + ')';
        }
    }
}
