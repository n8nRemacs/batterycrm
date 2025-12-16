package com.avito.android.sx_address.list.mvi.entity;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.ActionModalDialogContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sx_address.SxAddressAddResult;
import com.avito.android.sx_address.SxAddressDeleteResult;
import com.avito.android.sx_address.SxAddressEditResult;
import com.avito.android.sx_address.SxAddressRevalidateResult;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.domain.Filter;
import com.avito.android.sx_address.list.domain.InfoBannerData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "Lcom/avito/android/sx_address/list/mvi/entity/c$a;", "Lcom/avito/android/sx_address/list/mvi/entity/c$b;", "Lcom/avito/android/sx_address/list/mvi/entity/c$c;", "Lcom/avito/android/sx_address/list/mvi/entity/c$d;", "Lcom/avito/android/sx_address/list/mvi/entity/c$e;", "Lcom/avito/android/sx_address/list/mvi/entity/c$f;", "Lcom/avito/android/sx_address/list/mvi/entity/c$g;", "Lcom/avito/android/sx_address/list/mvi/entity/c$h;", "Lcom/avito/android/sx_address/list/mvi/entity/c$i;", "Lcom/avito/android/sx_address/list/mvi/entity/c$j;", "Lcom/avito/android/sx_address/list/mvi/entity/c$k;", "Lcom/avito/android/sx_address/list/mvi/entity/c$l;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$a;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f293301a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1326535835;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$b;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293302a;

        public b(@Y61.k String str) {
            this.f293302a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f293302a, ((b) obj).f293302a);
        }

        public final int hashCode() {
            return this.f293302a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("CloseInfoBanner(type="), this.f293302a, ')');
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$c;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sx_address.list.mvi.entity.c$c, reason: collision with other inner class name */
    public static final /* data */ class C8905c implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C8905c f293303a = new C8905c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C8905c);
        }

        public final int hashCode() {
            return 1217535792;
        }

        @Y61.k
        public final String toString() {
            return "OpenAddAddress";
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$d;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressAddResult f293304a;

        public d(@Y61.k SxAddressAddResult sxAddressAddResult) {
            this.f293304a = sxAddressAddResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f293304a, ((d) obj).f293304a);
        }

        public final int hashCode() {
            return this.f293304a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedAddResult(value=" + this.f293304a + ')';
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$e;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressDeleteResult f293305a;

        public e(@Y61.k SxAddressDeleteResult sxAddressDeleteResult) {
            this.f293305a = sxAddressDeleteResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f293305a, ((e) obj).f293305a);
        }

        public final int hashCode() {
            return this.f293305a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedDeleteResult(value=" + this.f293305a + ')';
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$f;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressEditResult f293306a;

        public f(@Y61.k SxAddressEditResult sxAddressEditResult) {
            this.f293306a = sxAddressEditResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f293306a, ((f) obj).f293306a);
        }

        public final int hashCode() {
            return this.f293306a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedEditResult(value=" + this.f293306a + ')';
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$g;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SxAddressRevalidateResult f293307a;

        public g(@Y61.k SxAddressRevalidateResult sxAddressRevalidateResult) {
            this.f293307a = sxAddressRevalidateResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f293307a, ((g) obj).f293307a);
        }

        public final int hashCode() {
            return this.f293307a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ReceivedRevalidateResult(value=" + this.f293307a + ')';
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$h;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AddressItem f293308a;

        public h(@Y61.k AddressItem addressItem) {
            this.f293308a = addressItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f293308a, ((h) obj).f293308a);
        }

        public final int hashCode() {
            return this.f293308a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowActionMenu(item=" + this.f293308a + ')';
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$i;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f293309a;

        public i(@Y61.k String str) {
            this.f293309a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f293309a, ((i) obj).f293309a);
        }

        public final int hashCode() {
            return this.f293309a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowAddAddressError(error="), this.f293309a, ')');
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$j;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Filter f293310a;

        public j(@Y61.k Filter filter) {
            this.f293310a = filter;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f293310a == ((j) obj).f293310a;
        }

        public final int hashCode() {
            return this.f293310a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowFilterMenu(selectedFilter=" + this.f293310a + ')';
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$k;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ActionModalDialogContent f293311a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f293312b;

        public k(@Y61.k ActionModalDialogContent actionModalDialogContent, @Y61.k DeepLink deepLink) {
            this.f293311a = actionModalDialogContent;
            this.f293312b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f293311a, kVar.f293311a) && L.f(this.f293312b, kVar.f293312b);
        }

        public final int hashCode() {
            return this.f293312b.hashCode() + (this.f293311a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowModalActionDialogClick(content=");
            sb2.append(this.f293311a);
            sb2.append(", link=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f293312b, ')');
        }
    }

    /* compiled from: SxAddressListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/entity/c$l;", "Lcom/avito/android/sx_address/list/mvi/entity/c;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InfoBannerData f293313a;

        public l(@Y61.k InfoBannerData infoBannerData) {
            this.f293313a = infoBannerData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f293313a, ((l) obj).f293313a);
        }

        public final int hashCode() {
            return this.f293313a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowRestrictionBottomSheet(content=" + this.f293313a + ')';
        }
    }
}
