package com.avito.android.user_address.list.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.UserAddressLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAddressListMviInternalAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeDefaultError", "ChangeDefaultLoad", "ChangeDefaultSuccess", "Close", "ConfirmNewDefault", "Error", "Load", "NavigateToEditAddress", "NavigateToSuggest", "OpenFAQ", "RenderData", "ShowActionToast", "StartChangeDefault", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ChangeDefaultError;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ChangeDefaultLoad;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ChangeDefaultSuccess;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$Close;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ConfirmNewDefault;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$Error;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$Load;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$NavigateToEditAddress;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$NavigateToSuggest;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$OpenFAQ;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$RenderData;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ShowActionToast;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$StartChangeDefault;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface UserAddressListMviInternalAction extends n {

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ChangeDefaultError;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeDefaultError implements UserAddressListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f307399b;

        public ChangeDefaultError(@k Throwable th2) {
            this.f307399b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeDefaultError) && L.f(this.f307399b, ((ChangeDefaultError) obj).f307399b);
        }

        public final int hashCode() {
            return this.f307399b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ChangeDefaultError(error="), this.f307399b, ')');
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ChangeDefaultLoad;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChangeDefaultLoad extends TrackableLoadingStarted implements UserAddressListMviInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f307400d = "user_address_list_change_default_loading";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF267993e() {
            return this.f307400d;
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ChangeDefaultSuccess;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeDefaultSuccess implements UserAddressListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ChangeDefaultSuccess f307401b = new ChangeDefaultSuccess();

        private ChangeDefaultSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ChangeDefaultSuccess);
        }

        public final int hashCode() {
            return 176572260;
        }

        @k
        public final String toString() {
            return "ChangeDefaultSuccess";
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$Close;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements UserAddressListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UserAddressLink.Result.Success f307402b;

        public Close(@l UserAddressLink.Result.Success success) {
            this.f307402b = success;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Close) && L.f(this.f307402b, ((Close) obj).f307402b);
        }

        public final int hashCode() {
            UserAddressLink.Result.Success success = this.f307402b;
            if (success == null) {
                return 0;
            }
            return success.hashCode();
        }

        @k
        public final String toString() {
            return "Close(toastInfo=" + this.f307402b + ')';
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ConfirmNewDefault;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfirmNewDefault implements UserAddressListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ConfirmNewDefault f307403b = new ConfirmNewDefault();

        private ConfirmNewDefault() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ConfirmNewDefault);
        }

        public final int hashCode() {
            return 1159034767;
        }

        @k
        public final String toString() {
            return "ConfirmNewDefault";
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$Error;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements UserAddressListMviInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f307404b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f307405c;

        public Error(@k Throwable th2) {
            this.f307404b = th2;
            this.f307405c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF267993e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f307404b, ((Error) obj).f307404b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF267995c() {
            return this.f307405c;
        }

        public final int hashCode() {
            return this.f307404b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f307404b, ')');
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$Load;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Load extends TrackableLoadingStarted implements UserAddressListMviInternalAction {
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$NavigateToEditAddress;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToEditAddress implements UserAddressListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f307406b;

        public NavigateToEditAddress(int i12) {
            this.f307406b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToEditAddress) && this.f307406b == ((NavigateToEditAddress) obj).f307406b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f307406b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("NavigateToEditAddress(addressId="), this.f307406b, ')');
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$NavigateToSuggest;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToSuggest implements UserAddressListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateToSuggest f307407b = new NavigateToSuggest();

        private NavigateToSuggest() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateToSuggest);
        }

        public final int hashCode() {
            return -1658100154;
        }

        @k
        public final String toString() {
            return "NavigateToSuggest";
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$OpenFAQ;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFAQ implements UserAddressListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenFAQ f307408b = new OpenFAQ();

        private OpenFAQ() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenFAQ);
        }

        public final int hashCode() {
            return -424738278;
        }

        @k
        public final String toString() {
            return "OpenFAQ";
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$RenderData;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RenderData implements UserAddressListMviInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f307409b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f307410c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f307411d;

        public RenderData(@k ArrayList arrayList, @l Boolean bool, @l String str) {
            this.f307409b = arrayList;
            this.f307410c = bool;
            this.f307411d = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF267993e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RenderData)) {
                return false;
            }
            RenderData renderData = (RenderData) obj;
            return this.f307409b.equals(renderData.f307409b) && L.f(this.f307410c, renderData.f307410c) && L.f(this.f307411d, renderData.f307411d);
        }

        public final int hashCode() {
            int iHashCode = this.f307409b.hashCode() * 31;
            Boolean bool = this.f307410c;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.f307411d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RenderData(data=");
            sb2.append(this.f307409b);
            sb2.append(", isAddAvailable=");
            sb2.append(this.f307410c);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f307411d, ')');
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$ShowActionToast;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowActionToast implements UserAddressListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAddressLink.Result.Success f307412b;

        public ShowActionToast(@k UserAddressLink.Result.Success success) {
            this.f307412b = success;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowActionToast) && L.f(this.f307412b, ((ShowActionToast) obj).f307412b);
        }

        public final int hashCode() {
            return this.f307412b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowActionToast(toastInfo=" + this.f307412b + ')';
        }
    }

    /* compiled from: UserAddressListMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction$StartChangeDefault;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartChangeDefault implements UserAddressListMviInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f307413b;

        public StartChangeDefault(int i12) {
            this.f307413b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartChangeDefault) && this.f307413b == ((StartChangeDefault) obj).f307413b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f307413b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("StartChangeDefault(addressId="), this.f307413b, ')');
        }
    }
}
