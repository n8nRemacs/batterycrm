package xo;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lxo/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "Lxo/a$a;", "Lxo/a$b;", "Lxo/a$c;", "Lxo/a$d;", "Lxo/a$e;", "Lxo/a$f;", "Lxo/a$g;", "Lxo/a$h;", "Lxo/a$i;", "Lxo/a$j;", "Lxo/a$k;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC49972a {

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxo/a$a;", "Lxo/a;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12879a implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12879a f442623a = new C12879a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12879a);
        }

        public final int hashCode() {
            return 1466412934;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/a$b;", "Lxo/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$b */
    public static final /* data */ class b implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f442624a;

        public b(@Y61.k DeepLink deepLink) {
            this.f442624a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f442624a, ((b) obj).f442624a);
        }

        public final int hashCode() {
            return this.f442624a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClicked(deeplink="), this.f442624a, ')');
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxo/a$c;", "Lxo/a;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$c */
    public static final /* data */ class c implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f442625a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -783838221;
        }

        @Y61.k
        public final String toString() {
            return "Help";
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxo/a$d;", "Lxo/a;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$d */
    public static final /* data */ class d implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f442626a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -468077181;
        }

        @Y61.k
        public final String toString() {
            return "KeyboardOpen";
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/a$e;", "Lxo/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$e */
    public static final /* data */ class e implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f442627a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f442628b;

        public /* synthetic */ e(DeepLink deepLink, Integer num, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : num, deepLink);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f442627a, eVar.f442627a) && L.f(this.f442628b, eVar.f442628b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f442627a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Integer num = this.f442628b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnButtonClicked(deeplink=");
            sb2.append(this.f442627a);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f442628b, ')');
        }

        public e(@l Integer num, @l DeepLink deepLink) {
            this.f442627a = deepLink;
            this.f442628b = num;
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/a$f;", "Lxo/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$f */
    public static final /* data */ class f implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f442629a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f442630b;

        public f(@Y61.k DeepLink deepLink, @l String str) {
            this.f442629a = deepLink;
            this.f442630b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f442629a, fVar.f442629a) && L.f(this.f442630b, fVar.f442630b);
        }

        public final int hashCode() {
            int iHashCode = this.f442629a.hashCode() * 31;
            String str = this.f442630b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PromoCodeClicked(deeplink=");
            sb2.append(this.f442629a);
            sb2.append(", promoCode=");
            return C22026a.c(sb2, this.f442630b, ')');
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/a$g;", "Lxo/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$g */
    public static final /* data */ class g implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f442631a;

        public g(@Y61.k String str) {
            this.f442631a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f442631a, ((g) obj).f442631a);
        }

        public final int hashCode() {
            return this.f442631a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PromoCodeInput(text="), this.f442631a, ')');
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/a$h;", "Lxo/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$h */
    public static final /* data */ class h implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f442632a;

        public h(boolean z12) {
            this.f442632a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f442632a == ((h) obj).f442632a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f442632a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("PromoCodeLoadState(isLoading="), this.f442632a, ')');
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxo/a$i;", "Lxo/a;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$i */
    public static final /* data */ class i implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f442633a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 1480062006;
        }

        @Y61.k
        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/a$j;", "Lxo/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$j */
    public static final /* data */ class j implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f442634a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f442635b;

        public j(boolean z12, @l Integer num) {
            this.f442634a = z12;
            this.f442635b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f442634a == jVar.f442634a && L.f(this.f442635b, jVar.f442635b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f442634a) * 31;
            Integer num = this.f442635b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScreenLoadState(isLoading=");
            sb2.append(this.f442634a);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f442635b, ')');
        }
    }

    /* compiled from: CheckoutAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/a$k;", "Lxo/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.a$k */
    public static final /* data */ class k implements InterfaceC49972a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f442636a;

        public k(@Y61.k DeepLink deepLink) {
            this.f442636a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f442636a, ((k) obj).f442636a);
        }

        public final int hashCode() {
            return this.f442636a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ServiceClicked(deeplink="), this.f442636a, ')');
        }
    }
}
