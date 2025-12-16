package xo;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckoutOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lxo/b;", "", "a", "b", "c", "d", "e", "Lxo/b$a;", "Lxo/b$b;", "Lxo/b$c;", "Lxo/b$d;", "Lxo/b$e;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xo.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC49973b {

    /* compiled from: CheckoutOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxo/b$a;", "Lxo/b;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.b$a */
    public static final /* data */ class a implements InterfaceC49973b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f442637a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1573935127;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CheckoutOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/b$b;", "Lxo/b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12880b implements InterfaceC49973b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442638a;

        public C12880b(@k DeepLink deepLink) {
            this.f442638a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12880b) && L.f(this.f442638a, ((C12880b) obj).f442638a);
        }

        public final int hashCode() {
            return this.f442638a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FinishFlowWithDeepLink(deeplink="), this.f442638a, ')');
        }
    }

    /* compiled from: CheckoutOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/b$c;", "Lxo/b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.b$c */
    public static final /* data */ class c implements InterfaceC49973b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442639a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f442640b;

        public c(@l Integer num, @k DeepLink deepLink) {
            this.f442639a = deepLink;
            this.f442640b = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f442639a, cVar.f442639a) && L.f(this.f442640b, cVar.f442640b);
        }

        public final int hashCode() {
            int iHashCode = this.f442639a.hashCode() * 31;
            Integer num = this.f442640b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f442639a);
            sb2.append(", buttonId=");
            return s.j(sb2, this.f442640b, ')');
        }
    }

    /* compiled from: CheckoutOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/b$d;", "Lxo/b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.b$d */
    public static final /* data */ class d implements InterfaceC49973b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442641a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f442642b;

        public d(@k DeepLink deepLink, @l String str) {
            this.f442641a = deepLink;
            this.f442642b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f442641a, dVar.f442641a) && L.f(this.f442642b, dVar.f442642b);
        }

        public final int hashCode() {
            int iHashCode = this.f442641a.hashCode() * 31;
            String str = this.f442642b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandlePromoCodeDeeplink(deeplink=");
            sb2.append(this.f442641a);
            sb2.append(", promoCode=");
            return C22026a.c(sb2, this.f442642b, ')');
        }
    }

    /* compiled from: CheckoutOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxo/b$e;", "Lxo/b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xo.b$e */
    public static final /* data */ class e implements InterfaceC49973b {

        /* renamed from: a, reason: collision with root package name */
        public final int f442643a;

        public e(int i12) {
            this.f442643a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f442643a == ((e) obj).f442643a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f442643a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f442643a, ')');
        }
    }
}
