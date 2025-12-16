package tn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: CartSnippetActionsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Ltn/a;", "", "a", "b", "c", "d", "e", "f", "g", "Ltn/a$c;", "Ltn/a$d;", "Ltn/a$e;", "Ltn/a$f;", "Ltn/a$g;", "Ltn/f;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC48692a {

    /* compiled from: CartSnippetActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/a$a;", "Ltn/f;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12678a implements tn.f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f439410a;

        /* renamed from: b, reason: collision with root package name */
        public final int f439411b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f439412c;

        public C12678a(@k String str, int i12, @l Integer num) {
            this.f439410a = str;
            this.f439411b = i12;
            this.f439412c = num;
        }

        @Override // tn.f
        /* renamed from: Q */
        public final int getF439414b() {
            return 0;
        }

        @Override // tn.f
        /* renamed from: R */
        public final int getF439415c() {
            return 1;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12678a)) {
                return false;
            }
            C12678a c12678a = (C12678a) obj;
            return L.f(this.f439410a, c12678a.f439410a) && this.f439411b == c12678a.f439411b && L.f(this.f439412c, c12678a.f439412c);
        }

        @Override // tn.f
        @k
        /* renamed from: getItemId, reason: from getter */
        public final String getF439413a() {
            return this.f439410a;
        }

        @Override // tn.f
        /* renamed from: getMaxQuantity, reason: from getter */
        public final int getF439416d() {
            return this.f439411b;
        }

        @Override // tn.f
        @l
        /* renamed from: getPosition, reason: from getter */
        public final Integer getF439417e() {
            return this.f439412c;
        }

        public final int hashCode() {
            int iE2 = r.e(this.f439411b, this.f439410a.hashCode() * 31, 31);
            Integer num = this.f439412c;
            return iE2 + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddItemToCart(itemId=");
            sb2.append(this.f439410a);
            sb2.append(", maxQuantity=");
            sb2.append(this.f439411b);
            sb2.append(", position=");
            return s.j(sb2, this.f439412c, ')');
        }
    }

    /* compiled from: CartSnippetActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/a$b;", "Ltn/f;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.a$b */
    public static final /* data */ class b implements tn.f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f439413a;

        /* renamed from: b, reason: collision with root package name */
        public final int f439414b;

        /* renamed from: c, reason: collision with root package name */
        public final int f439415c;

        /* renamed from: d, reason: collision with root package name */
        public final int f439416d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Integer f439417e;

        public b(@k String str, int i12, int i13, int i14, @l Integer num) {
            this.f439413a = str;
            this.f439414b = i12;
            this.f439415c = i13;
            this.f439416d = i14;
            this.f439417e = num;
        }

        @Override // tn.f
        /* renamed from: Q, reason: from getter */
        public final int getF439414b() {
            return this.f439414b;
        }

        @Override // tn.f
        /* renamed from: R, reason: from getter */
        public final int getF439415c() {
            return this.f439415c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f439413a, bVar.f439413a) && this.f439414b == bVar.f439414b && this.f439415c == bVar.f439415c && this.f439416d == bVar.f439416d && L.f(this.f439417e, bVar.f439417e);
        }

        @Override // tn.f
        @k
        /* renamed from: getItemId, reason: from getter */
        public final String getF439413a() {
            return this.f439413a;
        }

        @Override // tn.f
        /* renamed from: getMaxQuantity, reason: from getter */
        public final int getF439416d() {
            return this.f439416d;
        }

        @Override // tn.f
        @l
        /* renamed from: getPosition, reason: from getter */
        public final Integer getF439417e() {
            return this.f439417e;
        }

        public final int hashCode() {
            int iE2 = r.e(this.f439416d, r.e(this.f439415c, r.e(this.f439414b, this.f439413a.hashCode() * 31, 31), 31), 31);
            Integer num = this.f439417e;
            return iE2 + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeItemQuantity(itemId=");
            sb2.append(this.f439413a);
            sb2.append(", oldQuantity=");
            sb2.append(this.f439414b);
            sb2.append(", newQuantity=");
            sb2.append(this.f439415c);
            sb2.append(", maxQuantity=");
            sb2.append(this.f439416d);
            sb2.append(", position=");
            return s.j(sb2, this.f439417e, ')');
        }
    }

    /* compiled from: CartSnippetActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/a$c;", "Ltn/a;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.a$c */
    public static final /* data */ class c implements InterfaceC48692a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LinkedHashMap f439418a;

        public c(@k LinkedHashMap linkedHashMap) {
            this.f439418a = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f439418a.equals(((c) obj).f439418a);
        }

        public final int hashCode() {
            return this.f439418a.hashCode();
        }

        @k
        public final String toString() {
            return h.e(new StringBuilder("InitializeStocks(stocks="), this.f439418a, ')');
        }
    }

    /* compiled from: CartSnippetActionsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn/a$d;", "Ltn/a;", "<init>", "()V", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.a$d */
    public static final /* data */ class d implements InterfaceC48692a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f439419a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2066758203;
        }

        @k
        public final String toString() {
            return "RefreshStocksFromStorage";
        }
    }

    /* compiled from: CartSnippetActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/a$e;", "Ltn/a;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.a$e */
    public static final /* data */ class e implements InterfaceC48692a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Map<String, Object> f439420a;

        public e(@l Map<String, ? extends Object> map) {
            this.f439420a = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f439420a, ((e) obj).f439420a);
        }

        public final int hashCode() {
            Map<String, Object> map = this.f439420a;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("SetAnalyticsData(analyticsData="), this.f439420a, ')');
        }
    }

    /* compiled from: CartSnippetActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/a$f;", "Ltn/a;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.a$f */
    public static final /* data */ class f implements InterfaceC48692a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        @k
        public final String toString() {
            return "SetBundlesSupport(supportBundles=false)";
        }
    }

    /* compiled from: CartSnippetActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/a$g;", "Ltn/a;", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tn.a$g */
    public static final /* data */ class g implements InterfaceC48692a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f439421a;

        public g(boolean z12) {
            this.f439421a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f439421a == ((g) obj).f439421a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f439421a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetDiscountOnDeliverySupport(supportDiscountOnDelivery="), this.f439421a, ')');
        }
    }
}
