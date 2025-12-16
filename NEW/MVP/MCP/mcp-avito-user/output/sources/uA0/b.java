package UA0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sx_address.SxAddressAddResult;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import com.avito.android.sx_address.selectaddresslist.domain.SelectListScreenData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectAddressListInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LUA0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LUA0/b$a;", "LUA0/b$b;", "LUA0/b$c;", "LUA0/b$d;", "LUA0/b$e;", "LUA0/b$f;", "LUA0/b$g;", "LUA0/b$h;", "LUA0/b$i;", "LUA0/b$j;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUA0/b$a;", "LUA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressListViewItem f16249a;

        public a(@k AddressListViewItem addressListViewItem) {
            this.f16249a = addressListViewItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f16249a, ((a) obj).f16249a);
        }

        public final int hashCode() {
            return this.f16249a.hashCode();
        }

        @k
        public final String toString() {
            return "AddressSelected(address=" + this.f16249a + ')';
        }
    }

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUA0/b$b;", "LUA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: UA0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1105b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Object f16250a;

        public C1105b(@k List<AddressListViewItem> list) {
            this.f16250a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1105b) && L.f(this.f16250a, ((C1105b) obj).f16250a);
        }

        public final int hashCode() {
            return this.f16250a.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("FilteredList(list="), this.f16250a, ')');
        }
    }

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUA0/b$c;", "LUA0/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f16251a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 509164339;
        }

        @k
        public final String toString() {
            return "FirstListLoad";
        }
    }

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUA0/b$d;", "LUA0/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f16252a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1251970800;
        }

        @k
        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUA0/b$e;", "LUA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SelectListScreenData f16253a;

        public e(@k SelectListScreenData selectListScreenData) {
            this.f16253a = selectListScreenData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f16253a, ((e) obj).f16253a);
        }

        public final int hashCode() {
            return this.f16253a.hashCode();
        }

        @k
        public final String toString() {
            return "LoadedList(screenData=" + this.f16253a + ')';
        }
    }

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUA0/b$f;", "LUA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressListViewItem f16254a;

        public f(@k AddressListViewItem addressListViewItem) {
            this.f16254a = addressListViewItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f16254a, ((f) obj).f16254a);
        }

        public final int hashCode() {
            return this.f16254a.hashCode();
        }

        @k
        public final String toString() {
            return "ProcessSelectedAddress(address=" + this.f16254a + ')';
        }
    }

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUA0/b$g;", "LUA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final SxAddressAddResult.Success.PublishValue f16255a;

        public g(@l SxAddressAddResult.Success.PublishValue publishValue) {
            this.f16255a = publishValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f16255a, ((g) obj).f16255a);
        }

        public final int hashCode() {
            SxAddressAddResult.Success.PublishValue publishValue = this.f16255a;
            if (publishValue == null) {
                return 0;
            }
            return publishValue.hashCode();
        }

        @k
        public final String toString() {
            return "ReceivedAddedAddress(value=" + this.f16255a + ')';
        }
    }

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUA0/b$h;", "LUA0/b;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f16256a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1905041846;
        }

        @k
        public final String toString() {
            return "ShowError";
        }
    }

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUA0/b$i;", "LUA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f16257a;

        public i(boolean z12) {
            this.f16257a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f16257a == ((i) obj).f16257a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16257a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowLoading(isLoading="), this.f16257a, ')');
        }
    }

    /* compiled from: SelectAddressListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUA0/b$j;", "LUA0/b;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16258a;

        public j(@k DeepLink deepLink) {
            this.f16258a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f16258a, ((j) obj).f16258a);
        }

        public final int hashCode() {
            return this.f16258a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("StartAddMoreProcess(link="), this.f16258a, ')');
        }
    }
}
