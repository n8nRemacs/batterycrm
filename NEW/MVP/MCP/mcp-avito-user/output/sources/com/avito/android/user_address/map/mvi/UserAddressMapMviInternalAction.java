package com.avito.android.user_address.map.mvi;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.component.toast.f;
import com.avito.android.geo_common.model.location_picker.LocationPickerAddressType;
import com.avito.android.user_address.map.domain.SellerAddNewAddressData;
import com.avito.android.user_address.map.domain.UserAddressMultiGeoData;
import com.avito.android.user_address.model.ValidateByCoordsResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAddressMapMviInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u0003\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddAddressInternalActionMap", "CommonMapInternalActionMap", "EditAddressInternalActionMap", "MapIsMoving", "MoveMapToCoordinates", "MoveMapToPreviousCoordinates", "NavigateToSuggestScreen", "OpenConfidenceDataPolicy", "ProceedDeleteAddressSuccessMap", "ProceedSellerAddAddressSuccess", "ProceedSuccessSave", "ProceedUpdateAddressSuccessMap", "SaveButtonEnable", "SetAddressIdMap", "SetAddressMap", "SetAddressTypeMap", "SetApartment", "SetComment", "SetEntrance", "SetFloor", "SetMultiGeoData", "SetScreenState", "SetSellerNewAddressData", "ShowDeleteAddresDialog", "ShowInputAddressErrorTextMap", "ShowLoaderOnSaveButton", "ShowToastBar", "UpdatePreviousCoordinates", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$AddAddressInternalActionMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface UserAddressMapMviInternalAction extends com.avito.android.analytics.screens.mvi.n {

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$AddAddressInternalActionMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedSellerAddAddressSuccess;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetMultiGeoData;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetSellerNewAddressData;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface AddAddressInternalActionMap extends UserAddressMapMviInternalAction {
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$MapIsMoving;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$MoveMapToCoordinates;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$MoveMapToPreviousCoordinates;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$NavigateToSuggestScreen;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$OpenConfidenceDataPolicy;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedSuccessSave;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SaveButtonEnable;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetAddressMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetScreenState;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ShowInputAddressErrorTextMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ShowLoaderOnSaveButton;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ShowToastBar;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$UpdatePreviousCoordinates;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CommonMapInternalActionMap extends UserAddressMapMviInternalAction {
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedDeleteAddressSuccessMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedUpdateAddressSuccessMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetAddressIdMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetAddressTypeMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetApartment;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetComment;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetEntrance;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetFloor;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ShowDeleteAddresDialog;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface EditAddressInternalActionMap extends UserAddressMapMviInternalAction {
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$MapIsMoving;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MapIsMoving implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final MapIsMoving f307741b = new MapIsMoving();

        private MapIsMoving() {
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$MoveMapToCoordinates;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MoveMapToCoordinates implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AvitoMapCameraPosition f307742b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f307743c;

        public MoveMapToCoordinates(AvitoMapCameraPosition avitoMapCameraPosition, boolean z12, int i12, C42822w c42822w) {
            z12 = (i12 & 2) != 0 ? false : z12;
            this.f307742b = avitoMapCameraPosition;
            this.f307743c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoveMapToCoordinates)) {
                return false;
            }
            MoveMapToCoordinates moveMapToCoordinates = (MoveMapToCoordinates) obj;
            return kotlin.jvm.internal.L.f(this.f307742b, moveMapToCoordinates.f307742b) && this.f307743c == moveMapToCoordinates.f307743c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f307743c) + (this.f307742b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MoveMapToCoordinates(cameraPosition=");
            sb2.append(this.f307742b);
            sb2.append(", moveWithAnimation=");
            return androidx.appcompat.app.r.x(sb2, this.f307743c, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$MoveMapToPreviousCoordinates;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MoveMapToPreviousCoordinates implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f307744b;

        public MoveMapToPreviousCoordinates() {
            this(false, 1, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MoveMapToPreviousCoordinates) && this.f307744b == ((MoveMapToPreviousCoordinates) obj).f307744b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f307744b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("MoveMapToPreviousCoordinates(moveWithAnimation="), this.f307744b, ')');
        }

        public MoveMapToPreviousCoordinates(boolean z12) {
            this.f307744b = z12;
        }

        public /* synthetic */ MoveMapToPreviousCoordinates(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$NavigateToSuggestScreen;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToSuggestScreen implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f307745b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f307746c;

        public NavigateToSuggestScreen(@Y61.k String str, @Y61.k String str2) {
            this.f307745b = str;
            this.f307746c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToSuggestScreen)) {
                return false;
            }
            NavigateToSuggestScreen navigateToSuggestScreen = (NavigateToSuggestScreen) obj;
            return kotlin.jvm.internal.L.f(this.f307745b, navigateToSuggestScreen.f307745b) && kotlin.jvm.internal.L.f(this.f307746c, navigateToSuggestScreen.f307746c);
        }

        public final int hashCode() {
            return this.f307746c.hashCode() + (this.f307745b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateToSuggestScreen(geoX=");
            sb2.append(this.f307745b);
            sb2.append(", address=");
            return C22026a.c(sb2, this.f307746c, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$OpenConfidenceDataPolicy;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenConfidenceDataPolicy implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final OpenConfidenceDataPolicy f307747b = new OpenConfidenceDataPolicy();

        private OpenConfidenceDataPolicy() {
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedDeleteAddressSuccessMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProceedDeleteAddressSuccessMap implements EditAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        public final int f307748b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f307749c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f307750d;

        public ProceedDeleteAddressSuccessMap(int i12, @Y61.k String str, @Y61.l String str2) {
            this.f307748b = i12;
            this.f307749c = str;
            this.f307750d = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProceedDeleteAddressSuccessMap)) {
                return false;
            }
            ProceedDeleteAddressSuccessMap proceedDeleteAddressSuccessMap = (ProceedDeleteAddressSuccessMap) obj;
            return this.f307748b == proceedDeleteAddressSuccessMap.f307748b && kotlin.jvm.internal.L.f(this.f307749c, proceedDeleteAddressSuccessMap.f307749c) && kotlin.jvm.internal.L.f(this.f307750d, proceedDeleteAddressSuccessMap.f307750d);
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(Integer.hashCode(this.f307748b) * 31, 31, this.f307749c);
            String str = this.f307750d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProceedDeleteAddressSuccessMap(addressId=");
            sb2.append(this.f307748b);
            sb2.append(", address=");
            sb2.append(this.f307749c);
            sb2.append(", addressKind=");
            return C22026a.c(sb2, this.f307750d, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedSellerAddAddressSuccess;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$AddAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProceedSellerAddAddressSuccess implements AddAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SellerAddNewAddressData f307751b;

        public ProceedSellerAddAddressSuccess(@Y61.k SellerAddNewAddressData sellerAddNewAddressData) {
            this.f307751b = sellerAddNewAddressData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProceedSellerAddAddressSuccess) && kotlin.jvm.internal.L.f(this.f307751b, ((ProceedSellerAddAddressSuccess) obj).f307751b);
        }

        public final int hashCode() {
            return this.f307751b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ProceedSellerAddAddressSuccess(data=" + this.f307751b + ')';
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedSuccessSave;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProceedSuccessSave implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        public final int f307752b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f307753c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f307754d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f307755e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f307756f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Double f307757g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Double f307758h;

        public ProceedSuccessSave(int i12, @Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Double d12, @Y61.l Double d13) {
            this.f307752b = i12;
            this.f307753c = num;
            this.f307754d = str;
            this.f307755e = str2;
            this.f307756f = str3;
            this.f307757g = d12;
            this.f307758h = d13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProceedSuccessSave)) {
                return false;
            }
            ProceedSuccessSave proceedSuccessSave = (ProceedSuccessSave) obj;
            return this.f307752b == proceedSuccessSave.f307752b && kotlin.jvm.internal.L.f(this.f307753c, proceedSuccessSave.f307753c) && kotlin.jvm.internal.L.f(this.f307754d, proceedSuccessSave.f307754d) && kotlin.jvm.internal.L.f(this.f307755e, proceedSuccessSave.f307755e) && kotlin.jvm.internal.L.f(this.f307756f, proceedSuccessSave.f307756f) && kotlin.jvm.internal.L.f(this.f307757g, proceedSuccessSave.f307757g) && kotlin.jvm.internal.L.f(this.f307758h, proceedSuccessSave.f307758h);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f307752b) * 31;
            Integer num = this.f307753c;
            int iD2 = androidx.compose.foundation.H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f307754d);
            String str = this.f307755e;
            int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f307756f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d12 = this.f307757g;
            int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f307758h;
            return iHashCode4 + (d13 != null ? d13.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProceedSuccessSave(addressId=");
            sb2.append(this.f307752b);
            sb2.append(", locationId=");
            sb2.append(this.f307753c);
            sb2.append(", address=");
            sb2.append(this.f307754d);
            sb2.append(", addressKind=");
            sb2.append(this.f307755e);
            sb2.append(", jwt=");
            sb2.append(this.f307756f);
            sb2.append(", longitude=");
            sb2.append(this.f307757g);
            sb2.append(", latitude=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f307758h, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ProceedUpdateAddressSuccessMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProceedUpdateAddressSuccessMap implements EditAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        public final int f307759b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f307760c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f307761d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f307762e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f307763f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Double f307764g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Double f307765h;

        public ProceedUpdateAddressSuccessMap(int i12, @Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Double d12, @Y61.l Double d13) {
            this.f307759b = i12;
            this.f307760c = num;
            this.f307761d = str;
            this.f307762e = str2;
            this.f307763f = str3;
            this.f307764g = d12;
            this.f307765h = d13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProceedUpdateAddressSuccessMap)) {
                return false;
            }
            ProceedUpdateAddressSuccessMap proceedUpdateAddressSuccessMap = (ProceedUpdateAddressSuccessMap) obj;
            return this.f307759b == proceedUpdateAddressSuccessMap.f307759b && kotlin.jvm.internal.L.f(this.f307760c, proceedUpdateAddressSuccessMap.f307760c) && kotlin.jvm.internal.L.f(this.f307761d, proceedUpdateAddressSuccessMap.f307761d) && kotlin.jvm.internal.L.f(this.f307762e, proceedUpdateAddressSuccessMap.f307762e) && kotlin.jvm.internal.L.f(this.f307763f, proceedUpdateAddressSuccessMap.f307763f) && kotlin.jvm.internal.L.f(this.f307764g, proceedUpdateAddressSuccessMap.f307764g) && kotlin.jvm.internal.L.f(this.f307765h, proceedUpdateAddressSuccessMap.f307765h);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f307759b) * 31;
            Integer num = this.f307760c;
            int iD2 = androidx.compose.foundation.H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f307761d);
            String str = this.f307762e;
            int iHashCode2 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f307763f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d12 = this.f307764g;
            int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.f307765h;
            return iHashCode4 + (d13 != null ? d13.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProceedUpdateAddressSuccessMap(addressId=");
            sb2.append(this.f307759b);
            sb2.append(", locationId=");
            sb2.append(this.f307760c);
            sb2.append(", address=");
            sb2.append(this.f307761d);
            sb2.append(", addressKind=");
            sb2.append(this.f307762e);
            sb2.append(", jwt=");
            sb2.append(this.f307763f);
            sb2.append(", longitude=");
            sb2.append(this.f307764g);
            sb2.append(", latitude=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f307765h, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SaveButtonEnable;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveButtonEnable implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f307766b;

        public SaveButtonEnable(boolean z12) {
            this.f307766b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveButtonEnable) && this.f307766b == ((SaveButtonEnable) obj).f307766b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f307766b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("SaveButtonEnable(isEnable="), this.f307766b, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetAddressIdMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAddressIdMap implements EditAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        public final int f307767b;

        public SetAddressIdMap(int i12) {
            this.f307767b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetAddressIdMap) && this.f307767b == ((SetAddressIdMap) obj).f307767b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f307767b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("SetAddressIdMap(addressId="), this.f307767b, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetAddressMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAddressMap implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ValidateByCoordsResult.Address f307768b;

        public SetAddressMap(@Y61.k ValidateByCoordsResult.Address address) {
            this.f307768b = address;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetAddressMap) && kotlin.jvm.internal.L.f(this.f307768b, ((SetAddressMap) obj).f307768b);
        }

        public final int hashCode() {
            return this.f307768b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SetAddressMap(address=" + this.f307768b + ')';
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetAddressTypeMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetAddressTypeMap implements EditAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocationPickerAddressType f307769b;

        public SetAddressTypeMap(@Y61.k LocationPickerAddressType locationPickerAddressType) {
            this.f307769b = locationPickerAddressType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetAddressTypeMap) && this.f307769b == ((SetAddressTypeMap) obj).f307769b;
        }

        public final int hashCode() {
            return this.f307769b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SetAddressTypeMap(addressType=" + this.f307769b + ')';
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetApartment;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetApartment implements EditAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f307770b;

        public SetApartment(@Y61.k String str) {
            this.f307770b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetApartment) && kotlin.jvm.internal.L.f(this.f307770b, ((SetApartment) obj).f307770b);
        }

        public final int hashCode() {
            return this.f307770b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetApartment(apartment="), this.f307770b, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetComment;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetComment implements EditAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f307771b;

        public SetComment(@Y61.k String str) {
            this.f307771b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetComment) && kotlin.jvm.internal.L.f(this.f307771b, ((SetComment) obj).f307771b);
        }

        public final int hashCode() {
            return this.f307771b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetComment(comment="), this.f307771b, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetEntrance;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetEntrance implements EditAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f307772b;

        public SetEntrance(@Y61.k String str) {
            this.f307772b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetEntrance) && kotlin.jvm.internal.L.f(this.f307772b, ((SetEntrance) obj).f307772b);
        }

        public final int hashCode() {
            return this.f307772b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetEntrance(entrance="), this.f307772b, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetFloor;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetFloor implements EditAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f307773b;

        public SetFloor(@Y61.k String str) {
            this.f307773b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetFloor) && kotlin.jvm.internal.L.f(this.f307773b, ((SetFloor) obj).f307773b);
        }

        public final int hashCode() {
            return this.f307773b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetFloor(floor="), this.f307773b, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetMultiGeoData;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$AddAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetMultiGeoData implements AddAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UserAddressMultiGeoData f307774b;

        public SetMultiGeoData(@Y61.k UserAddressMultiGeoData userAddressMultiGeoData) {
            this.f307774b = userAddressMultiGeoData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetMultiGeoData) && kotlin.jvm.internal.L.f(this.f307774b, ((SetMultiGeoData) obj).f307774b);
        }

        public final int hashCode() {
            return this.f307774b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SetMultiGeoData(data=" + this.f307774b + ')';
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetScreenState;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetScreenState implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ScreenState f307775b;

        public SetScreenState(@Y61.k ScreenState screenState) {
            this.f307775b = screenState;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetScreenState) && kotlin.jvm.internal.L.f(this.f307775b, ((SetScreenState) obj).f307775b);
        }

        public final int hashCode() {
            return this.f307775b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SetScreenState(screenState=" + this.f307775b + ')';
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$SetSellerNewAddressData;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$AddAddressInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSellerNewAddressData implements AddAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SellerAddNewAddressData f307776b;

        public SetSellerNewAddressData(@Y61.k SellerAddNewAddressData sellerAddNewAddressData) {
            this.f307776b = sellerAddNewAddressData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetSellerNewAddressData) && kotlin.jvm.internal.L.f(this.f307776b, ((SetSellerNewAddressData) obj).f307776b);
        }

        public final int hashCode() {
            return this.f307776b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SetSellerNewAddressData(data=" + this.f307776b + ')';
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ShowDeleteAddresDialog;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$EditAddressInternalActionMap;", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowDeleteAddresDialog implements EditAddressInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final ShowDeleteAddresDialog f307777b = new ShowDeleteAddresDialog();

        private ShowDeleteAddresDialog() {
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ShowInputAddressErrorTextMap;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowInputAddressErrorTextMap implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f307778b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f307779c;

        public ShowInputAddressErrorTextMap(boolean z12, @Y61.l String str) {
            this.f307778b = z12;
            this.f307779c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowInputAddressErrorTextMap)) {
                return false;
            }
            ShowInputAddressErrorTextMap showInputAddressErrorTextMap = (ShowInputAddressErrorTextMap) obj;
            return this.f307778b == showInputAddressErrorTextMap.f307778b && kotlin.jvm.internal.L.f(this.f307779c, showInputAddressErrorTextMap.f307779c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f307778b) * 31;
            String str = this.f307779c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowInputAddressErrorTextMap(show=");
            sb2.append(this.f307778b);
            sb2.append(", errorText=");
            return C22026a.c(sb2, this.f307779c, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ShowLoaderOnSaveButton;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoaderOnSaveButton extends TrackableLoadingStarted implements CommonMapInternalActionMap {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f307780d;

        public ShowLoaderOnSaveButton(boolean z12) {
            this.f307780d = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLoaderOnSaveButton) && this.f307780d == ((ShowLoaderOnSaveButton) obj).f307780d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f307780d);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ShowLoaderOnSaveButton(showLoader="), this.f307780d, ')');
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$UpdatePreviousCoordinates;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePreviousCoordinates implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AvitoMapPoint f307784b;

        public UpdatePreviousCoordinates(@Y61.k AvitoMapPoint avitoMapPoint) {
            this.f307784b = avitoMapPoint;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePreviousCoordinates) && kotlin.jvm.internal.L.f(this.f307784b, ((UpdatePreviousCoordinates) obj).f307784b);
        }

        public final int hashCode() {
            return this.f307784b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdatePreviousCoordinates(lastCoordinates=" + this.f307784b + ')';
        }
    }

    /* compiled from: UserAddressMapMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$ShowToastBar;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction$CommonMapInternalActionMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastBar implements CommonMapInternalActionMap {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f307781b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f307782c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f307783d;

        public ShowToastBar(@Y61.k com.avito.android.component.toast.f fVar, @Y61.k String str, boolean z12) {
            this.f307781b = str;
            this.f307782c = z12;
            this.f307783d = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToastBar)) {
                return false;
            }
            ShowToastBar showToastBar = (ShowToastBar) obj;
            return kotlin.jvm.internal.L.f(this.f307781b, showToastBar.f307781b) && this.f307782c == showToastBar.f307782c && kotlin.jvm.internal.L.f(this.f307783d, showToastBar.f307783d);
        }

        public final int hashCode() {
            return this.f307783d.hashCode() + androidx.appcompat.app.r.i(this.f307781b.hashCode() * 31, 31, this.f307782c);
        }

        @Y61.k
        public final String toString() {
            return "ShowToastBar(text=" + this.f307781b + ", anchorToBottom=" + this.f307782c + ", toastBarType=" + this.f307783d + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ShowToastBar(String str, boolean z12, com.avito.android.component.toast.f fVar, int i12, C42822w c42822w) {
            z12 = (i12 & 2) != 0 ? false : z12;
            if ((i12 & 4) != 0) {
                f.c.f125255c.getClass();
                fVar = f.c.a.b();
            }
            this(fVar, str, z12);
        }
    }
}
