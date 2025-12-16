package XG0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.UserAddressLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAddressListMviOneTimeEvent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LXG0/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LXG0/c$a;", "LXG0/c$b;", "LXG0/c$c;", "LXG0/c$d;", "LXG0/c$e;", "LXG0/c$f;", "LXG0/c$g;", "LXG0/c$h;", "LXG0/c$i;", "LXG0/c$j;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXG0/c$a;", "LXG0/c;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f18790a;

        public a(@k Throwable th2) {
            this.f18790a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f18790a, ((a) obj).f18790a);
        }

        public final int hashCode() {
            return this.f18790a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ChangeDefaultError(error="), this.f18790a, ')');
        }
    }

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/c$b;", "LXG0/c;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f18791a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1332662041;
        }

        @k
        public final String toString() {
            return "ChangeDefaultLoad";
        }
    }

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/c$c;", "LXG0/c;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: XG0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1325c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1325c f18792a = new C1325c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1325c);
        }

        public final int hashCode() {
            return 748430576;
        }

        @k
        public final String toString() {
            return "ChangeDefaultSuccess";
        }
    }

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXG0/c$d;", "LXG0/c;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final UserAddressLink.Result.Success f18793a;

        public d(@l UserAddressLink.Result.Success success) {
            this.f18793a = success;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f18793a, ((d) obj).f18793a);
        }

        public final int hashCode() {
            UserAddressLink.Result.Success success = this.f18793a;
            if (success == null) {
                return 0;
            }
            return success.hashCode();
        }

        @k
        public final String toString() {
            return "Close(toastInfo=" + this.f18793a + ')';
        }
    }

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/c$e;", "LXG0/c;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f18794a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1326146947;
        }

        @k
        public final String toString() {
            return "ConfirmNewDefault";
        }
    }

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXG0/c$f;", "LXG0/c;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f18795a;

        public f(int i12) {
            this.f18795a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f18795a == ((f) obj).f18795a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18795a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("NavigateToEditAddress(addressId="), this.f18795a, ')');
        }
    }

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/c$g;", "LXG0/c;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f18796a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1490987974;
        }

        @k
        public final String toString() {
            return "NavigateToSuggest";
        }
    }

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXG0/c$h;", "LXG0/c;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f18797a;

        public h(int i12) {
            this.f18797a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f18797a == ((h) obj).f18797a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18797a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OpenBottomLayout(addressId="), this.f18797a, ')');
        }
    }

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/c$i;", "LXG0/c;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f18798a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -752611058;
        }

        @k
        public final String toString() {
            return "OpenFAQ";
        }
    }

    /* compiled from: UserAddressListMviOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXG0/c$j;", "LXG0/c;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAddressLink.Result.Success f18799a;

        public j(@k UserAddressLink.Result.Success success) {
            this.f18799a = success;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f18799a, ((j) obj).f18799a);
        }

        public final int hashCode() {
            return this.f18799a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowActionToast(toastInfo=" + this.f18799a + ')';
        }
    }
}
