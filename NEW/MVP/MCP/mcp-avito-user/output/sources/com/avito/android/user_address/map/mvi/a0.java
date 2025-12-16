package com.avito.android.user_address.map.mvi;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserAddressMapMviReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/map/mvi/a0;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lcom/avito/android/user_address/map/mvi/UserAddressAddNewAddressMviState;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a0 implements com.avito.android.arch.mvi.u<UserAddressMapMviInternalAction, UserAddressAddNewAddressMviState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public AvitoMapPoint f307846b;

    @Inject
    public a0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final UserAddressAddNewAddressMviState a(UserAddressMapMviInternalAction userAddressMapMviInternalAction, UserAddressAddNewAddressMviState userAddressAddNewAddressMviState) {
        UserAddressAddNewAddressMviState userAddressAddNewAddressMviStateL;
        UserAddressMapFullAddressMviState userAddressMapFullAddressMviState;
        UserAddressMapMviInternalAction userAddressMapMviInternalAction2 = userAddressMapMviInternalAction;
        UserAddressAddNewAddressMviState userAddressAddNewAddressMviState2 = userAddressAddNewAddressMviState;
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.CommonMapInternalActionMap) {
            UserAddressMapMviInternalAction.CommonMapInternalActionMap commonMapInternalActionMap = (UserAddressMapMviInternalAction.CommonMapInternalActionMap) userAddressMapMviInternalAction2;
            if (commonMapInternalActionMap instanceof UserAddressMapMviInternalAction.MoveMapToCoordinates) {
                UserAddressMapMviInternalAction.MoveMapToCoordinates moveMapToCoordinates = (UserAddressMapMviInternalAction.MoveMapToCoordinates) commonMapInternalActionMap;
                return UserAddressAddNewAddressMviState.b(userAddressAddNewAddressMviState2, null, moveMapToCoordinates.f307742b, Boolean.FALSE, Boolean.valueOf(moveMapToCoordinates.f307743c), null, null, null, null, false, 497);
            }
            if (commonMapInternalActionMap instanceof UserAddressMapMviInternalAction.MoveMapToPreviousCoordinates) {
                AvitoMapCameraPosition f307788c = userAddressAddNewAddressMviState2.getF307788c();
                AvitoMapPoint mapPoint = this.f307846b;
                if (mapPoint == null) {
                    mapPoint = userAddressAddNewAddressMviState2.getF307788c().getMapPoint();
                }
                return UserAddressAddNewAddressMviState.b(userAddressAddNewAddressMviState2, null, AvitoMapCameraPosition.copy$default(f307788c, mapPoint, 0.0f, 0.0f, null, null, 30, null), Boolean.FALSE, Boolean.valueOf(((UserAddressMapMviInternalAction.MoveMapToPreviousCoordinates) commonMapInternalActionMap).f307744b), null, null, null, null, false, 497);
            }
            if (commonMapInternalActionMap instanceof UserAddressMapMviInternalAction.UpdatePreviousCoordinates) {
                this.f307846b = ((UserAddressMapMviInternalAction.UpdatePreviousCoordinates) commonMapInternalActionMap).f307784b;
                return userAddressAddNewAddressMviState2;
            }
            if (commonMapInternalActionMap instanceof UserAddressMapMviInternalAction.MapIsMoving) {
                return UserAddressAddNewAddressMviState.b(userAddressAddNewAddressMviState2, null, null, Boolean.TRUE, null, null, null, null, null, false, 507);
            }
            if (commonMapInternalActionMap instanceof UserAddressMapMviInternalAction.SetAddressMap) {
                return UserAddressAddNewAddressMviState.b(userAddressAddNewAddressMviState2, null, null, null, null, ((UserAddressMapMviInternalAction.SetAddressMap) commonMapInternalActionMap).f307768b, null, null, null, false, 495);
            }
            if (!(commonMapInternalActionMap instanceof UserAddressMapMviInternalAction.ShowInputAddressErrorTextMap)) {
                return commonMapInternalActionMap instanceof UserAddressMapMviInternalAction.ShowLoaderOnSaveButton ? UserAddressAddNewAddressMviState.b(userAddressAddNewAddressMviState2, null, null, null, null, null, null, null, Boolean.valueOf(((UserAddressMapMviInternalAction.ShowLoaderOnSaveButton) commonMapInternalActionMap).f307780d), false, 383) : commonMapInternalActionMap instanceof UserAddressMapMviInternalAction.SaveButtonEnable ? UserAddressAddNewAddressMviState.b(userAddressAddNewAddressMviState2, null, null, null, null, null, null, null, null, ((UserAddressMapMviInternalAction.SaveButtonEnable) commonMapInternalActionMap).f307766b, 255) : commonMapInternalActionMap instanceof UserAddressMapMviInternalAction.SetScreenState ? UserAddressAddNewAddressMviState.b(userAddressAddNewAddressMviState2, ((UserAddressMapMviInternalAction.SetScreenState) commonMapInternalActionMap).f307775b, null, null, null, null, null, null, null, false, 510) : userAddressAddNewAddressMviState2;
            }
            UserAddressMapMviInternalAction.ShowInputAddressErrorTextMap showInputAddressErrorTextMap = (UserAddressMapMviInternalAction.ShowInputAddressErrorTextMap) commonMapInternalActionMap;
            return UserAddressAddNewAddressMviState.b(userAddressAddNewAddressMviState2, null, null, null, null, null, Boolean.valueOf(showInputAddressErrorTextMap.f307778b), showInputAddressErrorTextMap.f307779c, null, false, 415);
        }
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.AddAddressInternalActionMap) {
            if ((userAddressAddNewAddressMviState2 instanceof UserAddressMapShortAddressMviState ? (UserAddressMapShortAddressMviState) userAddressAddNewAddressMviState2 : null) == null) {
                return userAddressAddNewAddressMviState2;
            }
            UserAddressMapMviInternalAction.AddAddressInternalActionMap addAddressInternalActionMap = (UserAddressMapMviInternalAction.AddAddressInternalActionMap) userAddressMapMviInternalAction2;
            UserAddressMapShortAddressMviState userAddressMapShortAddressMviState = (UserAddressMapShortAddressMviState) userAddressAddNewAddressMviState2;
            if (!(addAddressInternalActionMap instanceof UserAddressMapMviInternalAction.SetMultiGeoData)) {
                userAddressMapFullAddressMviState = userAddressMapShortAddressMviState;
                if (addAddressInternalActionMap instanceof UserAddressMapMviInternalAction.SetSellerNewAddressData) {
                    userAddressAddNewAddressMviStateL = UserAddressMapShortAddressMviState.l(userAddressMapShortAddressMviState, null, null, false, false, null, false, null, false, false, null, ((UserAddressMapMviInternalAction.SetSellerNewAddressData) addAddressInternalActionMap).f307776b, 1023);
                }
                return userAddressMapFullAddressMviState;
            }
            userAddressAddNewAddressMviStateL = UserAddressMapShortAddressMviState.l(userAddressMapShortAddressMviState, null, null, false, false, null, false, null, false, false, ((UserAddressMapMviInternalAction.SetMultiGeoData) addAddressInternalActionMap).f307774b, null, 1535);
            return userAddressAddNewAddressMviStateL;
        }
        if (!(userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.EditAddressInternalActionMap)) {
            throw new NoWhenBranchMatchedException();
        }
        if ((userAddressAddNewAddressMviState2 instanceof UserAddressMapFullAddressMviState ? (UserAddressMapFullAddressMviState) userAddressAddNewAddressMviState2 : null) == null) {
            return userAddressAddNewAddressMviState2;
        }
        UserAddressMapMviInternalAction.EditAddressInternalActionMap editAddressInternalActionMap = (UserAddressMapMviInternalAction.EditAddressInternalActionMap) userAddressMapMviInternalAction2;
        UserAddressMapFullAddressMviState userAddressMapFullAddressMviState2 = (UserAddressMapFullAddressMviState) userAddressAddNewAddressMviState2;
        if (editAddressInternalActionMap instanceof UserAddressMapMviInternalAction.SetAddressTypeMap) {
            userAddressAddNewAddressMviStateL = UserAddressMapFullAddressMviState.l(userAddressMapFullAddressMviState2, null, null, false, false, null, false, null, false, false, 0, null, null, null, null, ((UserAddressMapMviInternalAction.SetAddressTypeMap) editAddressInternalActionMap).f307769b, 32767);
        } else if (editAddressInternalActionMap instanceof UserAddressMapMviInternalAction.SetApartment) {
            userAddressAddNewAddressMviStateL = UserAddressMapFullAddressMviState.l(userAddressMapFullAddressMviState2, null, null, false, false, null, false, null, false, false, 0, ((UserAddressMapMviInternalAction.SetApartment) editAddressInternalActionMap).f307770b, null, null, null, null, 63487);
        } else if (editAddressInternalActionMap instanceof UserAddressMapMviInternalAction.SetComment) {
            userAddressAddNewAddressMviStateL = UserAddressMapFullAddressMviState.l(userAddressMapFullAddressMviState2, null, null, false, false, null, false, null, false, false, 0, null, null, null, ((UserAddressMapMviInternalAction.SetComment) editAddressInternalActionMap).f307771b, null, 49151);
        } else if (editAddressInternalActionMap instanceof UserAddressMapMviInternalAction.SetEntrance) {
            userAddressAddNewAddressMviStateL = UserAddressMapFullAddressMviState.l(userAddressMapFullAddressMviState2, null, null, false, false, null, false, null, false, false, 0, null, ((UserAddressMapMviInternalAction.SetEntrance) editAddressInternalActionMap).f307772b, null, null, null, 61439);
        } else if (editAddressInternalActionMap instanceof UserAddressMapMviInternalAction.SetFloor) {
            userAddressAddNewAddressMviStateL = UserAddressMapFullAddressMviState.l(userAddressMapFullAddressMviState2, null, null, false, false, null, false, null, false, false, 0, null, null, ((UserAddressMapMviInternalAction.SetFloor) editAddressInternalActionMap).f307773b, null, null, 57343);
        } else {
            if (!(editAddressInternalActionMap instanceof UserAddressMapMviInternalAction.SetAddressIdMap)) {
                boolean z12 = editAddressInternalActionMap instanceof UserAddressMapMviInternalAction.ShowDeleteAddresDialog;
                userAddressMapFullAddressMviState = userAddressMapFullAddressMviState2;
                return userAddressMapFullAddressMviState;
            }
            userAddressAddNewAddressMviStateL = UserAddressMapFullAddressMviState.l(userAddressMapFullAddressMviState2, null, null, false, false, null, false, null, false, false, ((UserAddressMapMviInternalAction.SetAddressIdMap) editAddressInternalActionMap).f307767b, null, null, null, null, null, 64511);
        }
        return userAddressAddNewAddressMviStateL;
    }
}
