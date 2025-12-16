package com.avito.android.user_address.map.mvi;

import android.os.Parcelable;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.user_address.model.ValidateByCoordsResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAddressMapMviState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressAddNewAddressMviState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/avito/android/user_address/map/mvi/UserAddressMapFullAddressMviState;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapShortAddressMviState;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UserAddressAddNewAddressMviState extends com.avito.android.analytics.screens.mvi.q implements Parcelable {
    public /* synthetic */ UserAddressAddNewAddressMviState(C42822w c42822w) {
        this();
    }

    public static /* synthetic */ UserAddressAddNewAddressMviState b(UserAddressAddNewAddressMviState userAddressAddNewAddressMviState, ScreenState screenState, AvitoMapCameraPosition avitoMapCameraPosition, Boolean bool, Boolean bool2, ValidateByCoordsResult.Address address, Boolean bool3, String str, Boolean bool4, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            screenState = null;
        }
        if ((i12 & 2) != 0) {
            avitoMapCameraPosition = null;
        }
        if ((i12 & 4) != 0) {
            bool = null;
        }
        if ((i12 & 8) != 0) {
            bool2 = null;
        }
        if ((i12 & 16) != 0) {
            address = null;
        }
        if ((i12 & 32) != 0) {
            bool3 = null;
        }
        if ((i12 & 64) != 0) {
            str = null;
        }
        if ((i12 & 128) != 0) {
            bool4 = null;
        }
        if ((i12 & 256) != 0) {
            z12 = true;
        }
        return userAddressAddNewAddressMviState.a(screenState, avitoMapCameraPosition, bool, bool2, address, bool3, str, bool4, z12);
    }

    @Y61.k
    public abstract UserAddressAddNewAddressMviState a(@Y61.l ScreenState screenState, @Y61.l AvitoMapCameraPosition avitoMapCameraPosition, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l ValidateByCoordsResult.Address address, @Y61.l Boolean bool3, @Y61.l String str, @Y61.l Boolean bool4, boolean z12);

    @Y61.k
    /* renamed from: c */
    public abstract ValidateByCoordsResult.Address getF307791f();

    @Y61.k
    /* renamed from: d */
    public abstract AvitoMapCameraPosition getF307788c();

    @Y61.k
    /* renamed from: e */
    public abstract String getF307793h();

    /* renamed from: f */
    public abstract boolean getF307789d();

    /* renamed from: g */
    public abstract boolean getF307795j();

    /* renamed from: h */
    public abstract boolean getF307794i();

    @Y61.k
    /* renamed from: i */
    public abstract ScreenState getF307787b();

    /* renamed from: j */
    public abstract boolean getF307790e();

    /* renamed from: k */
    public abstract boolean getF307792g();

    public UserAddressAddNewAddressMviState() {
    }
}
