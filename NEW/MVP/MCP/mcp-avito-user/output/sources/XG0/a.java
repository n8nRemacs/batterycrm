package XG0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: UserAddressListMviAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LXG0/a;", "", "a", "b", "c", "d", "e", "f", "LXG0/a$a;", "LXG0/a$b;", "LXG0/a$c;", "LXG0/a$d;", "LXG0/a$e;", "LXG0/a$f;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: UserAddressListMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/a$a;", "LXG0/a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: XG0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1324a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1324a f18783a = new C1324a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1324a);
        }

        public final int hashCode() {
            return 730027340;
        }

        @k
        public final String toString() {
            return "ClickAddAddress";
        }
    }

    /* compiled from: UserAddressListMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXG0/a$b;", "LXG0/a;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f18784a;

        /* renamed from: b, reason: collision with root package name */
        public final int f18785b;

        public b(boolean z12, int i12) {
            this.f18784a = z12;
            this.f18785b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f18784a == bVar.f18784a && this.f18785b == bVar.f18785b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18785b) + (Boolean.hashCode(this.f18784a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClickConfirmNewDefault(result=");
            sb2.append(this.f18784a);
            sb2.append(", addressId=");
            return r.t(sb2, this.f18785b, ')');
        }
    }

    /* compiled from: UserAddressListMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXG0/a$c;", "LXG0/a;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f18786a;

        public c(int i12) {
            this.f18786a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f18786a == ((c) obj).f18786a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18786a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ClickEditAddress(addressId="), this.f18786a, ')');
        }
    }

    /* compiled from: UserAddressListMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/a$d;", "LXG0/a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f18787a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -736018394;
        }

        @k
        public final String toString() {
            return "ClickInfoBlock";
        }
    }

    /* compiled from: UserAddressListMviAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXG0/a$e;", "LXG0/a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f18788a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1313070641;
        }

        @k
        public final String toString() {
            return "ClickRetry";
        }
    }

    /* compiled from: UserAddressListMviAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXG0/a$f;", "LXG0/a;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f18789a;

        public f(int i12) {
            this.f18789a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f18789a == ((f) obj).f18789a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f18789a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ClickSetDefault(addressId="), this.f18789a, ')');
        }
    }
}
