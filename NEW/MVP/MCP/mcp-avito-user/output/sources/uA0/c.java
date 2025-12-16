package UA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectAddressListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LUA0/c;", "", "a", "b", "c", "d", "e", "LUA0/c$a;", "LUA0/c$b;", "LUA0/c$c;", "LUA0/c$d;", "LUA0/c$e;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: SelectAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUA0/c$a;", "LUA0/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f16259a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2124432107;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SelectAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUA0/c$b;", "LUA0/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f16260a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 356561767;
        }

        @k
        public final String toString() {
            return "FirstListLoad";
        }
    }

    /* compiled from: SelectAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUA0/c$c;", "LUA0/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UA0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1106c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressListViewItem f16261a;

        public C1106c(@k AddressListViewItem addressListViewItem) {
            this.f16261a = addressListViewItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1106c) && L.f(this.f16261a, ((C1106c) obj).f16261a);
        }

        public final int hashCode() {
            return this.f16261a.hashCode();
        }

        @k
        public final String toString() {
            return "ProcessSelectedAddress(address=" + this.f16261a + ')';
        }
    }

    /* compiled from: SelectAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUA0/c$d;", "LUA0/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f16262a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 205515972;
        }

        @k
        public final String toString() {
            return "ReloadList";
        }
    }

    /* compiled from: SelectAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUA0/c$e;", "LUA0/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16263a;

        public e(@k DeepLink deepLink) {
            this.f16263a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f16263a, ((e) obj).f16263a);
        }

        public final int hashCode() {
            return this.f16263a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("StartAddMoreProcess(link="), this.f16263a, ')');
        }
    }
}
