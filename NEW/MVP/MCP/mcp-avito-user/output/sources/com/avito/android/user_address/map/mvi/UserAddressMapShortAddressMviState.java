package com.avito.android.user_address.map.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.user_address.map.domain.SellerAddNewAddressData;
import com.avito.android.user_address.map.domain.UserAddressMultiGeoData;
import com.avito.android.user_address.map.mvi.ScreenState;
import com.avito.android.user_address.model.ValidateByCoordsResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressMapMviState.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapShortAddressMviState;", "Lcom/avito/android/user_address/map/mvi/UserAddressAddNewAddressMviState;", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserAddressMapShortAddressMviState extends UserAddressAddNewAddressMviState {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final UserAddressMapShortAddressMviState f307786n = new UserAddressMapShortAddressMviState(ScreenState.CommonState.f307715b, new AvitoMapCameraPosition(new AvitoMapPoint(55.7522d, 37.6156d, null, 4, null), 17.0f, 0.0f, null, null, 28, null), false, false, new ValidateByCoordsResult.Address("", ""), false, null, false, false, null, null, 2024, null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScreenState f307787b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AvitoMapCameraPosition f307788c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f307789d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f307790e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ValidateByCoordsResult.Address f307791f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f307792g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f307793h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f307794i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f307795j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final UserAddressMultiGeoData f307796k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final SellerAddNewAddressData f307797l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f307785m = new a(null);

    @Y61.k
    public static final Parcelable.Creator<UserAddressMapShortAddressMviState> CREATOR = new b();

    /* compiled from: UserAddressMapMviState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapShortAddressMviState$a;", "", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserAddressMapMviState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UserAddressMapShortAddressMviState> {
        @Override // android.os.Parcelable.Creator
        public final UserAddressMapShortAddressMviState createFromParcel(Parcel parcel) {
            return new UserAddressMapShortAddressMviState((ScreenState) parcel.readParcelable(UserAddressMapShortAddressMviState.class.getClassLoader()), (AvitoMapCameraPosition) parcel.readParcelable(UserAddressMapShortAddressMviState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, ValidateByCoordsResult.Address.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : UserAddressMultiGeoData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SellerAddNewAddressData.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAddressMapShortAddressMviState[] newArray(int i12) {
            return new UserAddressMapShortAddressMviState[i12];
        }
    }

    public UserAddressMapShortAddressMviState(@Y61.k ScreenState screenState, @Y61.k AvitoMapCameraPosition avitoMapCameraPosition, boolean z12, boolean z13, @Y61.k ValidateByCoordsResult.Address address, boolean z14, @Y61.k String str, boolean z15, boolean z16, @Y61.l UserAddressMultiGeoData userAddressMultiGeoData, @Y61.l SellerAddNewAddressData sellerAddNewAddressData) {
        super(null);
        this.f307787b = screenState;
        this.f307788c = avitoMapCameraPosition;
        this.f307789d = z12;
        this.f307790e = z13;
        this.f307791f = address;
        this.f307792g = z14;
        this.f307793h = str;
        this.f307794i = z15;
        this.f307795j = z16;
        this.f307796k = userAddressMultiGeoData;
        this.f307797l = sellerAddNewAddressData;
    }

    public static UserAddressMapShortAddressMviState l(UserAddressMapShortAddressMviState userAddressMapShortAddressMviState, ScreenState screenState, AvitoMapCameraPosition avitoMapCameraPosition, boolean z12, boolean z13, ValidateByCoordsResult.Address address, boolean z14, String str, boolean z15, boolean z16, UserAddressMultiGeoData userAddressMultiGeoData, SellerAddNewAddressData sellerAddNewAddressData, int i12) {
        ScreenState screenState2 = (i12 & 1) != 0 ? userAddressMapShortAddressMviState.f307787b : screenState;
        AvitoMapCameraPosition avitoMapCameraPosition2 = (i12 & 2) != 0 ? userAddressMapShortAddressMviState.f307788c : avitoMapCameraPosition;
        boolean z17 = (i12 & 4) != 0 ? userAddressMapShortAddressMviState.f307789d : z12;
        boolean z18 = (i12 & 8) != 0 ? userAddressMapShortAddressMviState.f307790e : z13;
        ValidateByCoordsResult.Address address2 = (i12 & 16) != 0 ? userAddressMapShortAddressMviState.f307791f : address;
        boolean z19 = (i12 & 32) != 0 ? userAddressMapShortAddressMviState.f307792g : z14;
        String str2 = (i12 & 64) != 0 ? userAddressMapShortAddressMviState.f307793h : str;
        boolean z22 = (i12 & 128) != 0 ? userAddressMapShortAddressMviState.f307794i : z15;
        boolean z23 = (i12 & 256) != 0 ? userAddressMapShortAddressMviState.f307795j : z16;
        UserAddressMultiGeoData userAddressMultiGeoData2 = (i12 & 512) != 0 ? userAddressMapShortAddressMviState.f307796k : userAddressMultiGeoData;
        SellerAddNewAddressData sellerAddNewAddressData2 = (i12 & 1024) != 0 ? userAddressMapShortAddressMviState.f307797l : sellerAddNewAddressData;
        userAddressMapShortAddressMviState.getClass();
        return new UserAddressMapShortAddressMviState(screenState2, avitoMapCameraPosition2, z17, z18, address2, z19, str2, z22, z23, userAddressMultiGeoData2, sellerAddNewAddressData2);
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    public final UserAddressAddNewAddressMviState a(@Y61.l ScreenState screenState, @Y61.l AvitoMapCameraPosition avitoMapCameraPosition, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l ValidateByCoordsResult.Address address, @Y61.l Boolean bool3, @Y61.l String str, @Y61.l Boolean bool4, boolean z12) {
        return l(this, screenState == null ? this.f307787b : screenState, avitoMapCameraPosition == null ? this.f307788c : avitoMapCameraPosition, bool != null ? bool.booleanValue() : this.f307789d, bool2 != null ? bool2.booleanValue() : this.f307790e, address == null ? this.f307791f : address, bool3 != null ? bool3.booleanValue() : this.f307792g, str == null ? this.f307793h : str, bool4 != null ? bool4.booleanValue() : this.f307794i, z12, null, null, 1536);
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final ValidateByCoordsResult.Address getF307791f() {
        return this.f307791f;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AvitoMapCameraPosition getF307788c() {
        return this.f307788c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getF307793h() {
        return this.f307793h;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAddressMapShortAddressMviState)) {
            return false;
        }
        UserAddressMapShortAddressMviState userAddressMapShortAddressMviState = (UserAddressMapShortAddressMviState) obj;
        return kotlin.jvm.internal.L.f(this.f307787b, userAddressMapShortAddressMviState.f307787b) && kotlin.jvm.internal.L.f(this.f307788c, userAddressMapShortAddressMviState.f307788c) && this.f307789d == userAddressMapShortAddressMviState.f307789d && this.f307790e == userAddressMapShortAddressMviState.f307790e && kotlin.jvm.internal.L.f(this.f307791f, userAddressMapShortAddressMviState.f307791f) && this.f307792g == userAddressMapShortAddressMviState.f307792g && kotlin.jvm.internal.L.f(this.f307793h, userAddressMapShortAddressMviState.f307793h) && this.f307794i == userAddressMapShortAddressMviState.f307794i && this.f307795j == userAddressMapShortAddressMviState.f307795j && kotlin.jvm.internal.L.f(this.f307796k, userAddressMapShortAddressMviState.f307796k) && kotlin.jvm.internal.L.f(this.f307797l, userAddressMapShortAddressMviState.f307797l);
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: f, reason: from getter */
    public final boolean getF307789d() {
        return this.f307789d;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: g, reason: from getter */
    public final boolean getF307795j() {
        return this.f307795j;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: h, reason: from getter */
    public final boolean getF307794i() {
        return this.f307794i;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.compose.foundation.H.d(androidx.appcompat.app.r.i((this.f307791f.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f307788c.hashCode() + (this.f307787b.hashCode() * 31)) * 31, 31, this.f307789d), 31, this.f307790e)) * 31, 31, this.f307792g), 31, this.f307793h), 31, this.f307794i), 31, this.f307795j);
        UserAddressMultiGeoData userAddressMultiGeoData = this.f307796k;
        int iHashCode = (i12 + (userAddressMultiGeoData == null ? 0 : userAddressMultiGeoData.hashCode())) * 31;
        SellerAddNewAddressData sellerAddNewAddressData = this.f307797l;
        return iHashCode + (sellerAddNewAddressData != null ? sellerAddNewAddressData.hashCode() : 0);
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final ScreenState getF307787b() {
        return this.f307787b;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: j, reason: from getter */
    public final boolean getF307790e() {
        return this.f307790e;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: k, reason: from getter */
    public final boolean getF307792g() {
        return this.f307792g;
    }

    @Y61.k
    public final String toString() {
        return "UserAddressMapShortAddressMviState(screenState=" + this.f307787b + ", avitoMapCameraPosition=" + this.f307788c + ", mapIsMoving=" + this.f307789d + ", setCameraPositionWithAnimation=" + this.f307790e + ", address=" + this.f307791f + ", showAddressFieldErrorState=" + this.f307792g + ", errorText=" + this.f307793h + ", saveButtonShowLoader=" + this.f307794i + ", saveButtonEnable=" + this.f307795j + ", multiGeoData=" + this.f307796k + ", sellerAddNewAddress=" + this.f307797l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f307787b, i12);
        parcel.writeParcelable(this.f307788c, i12);
        parcel.writeInt(this.f307789d ? 1 : 0);
        parcel.writeInt(this.f307790e ? 1 : 0);
        this.f307791f.writeToParcel(parcel, i12);
        parcel.writeInt(this.f307792g ? 1 : 0);
        parcel.writeString(this.f307793h);
        parcel.writeInt(this.f307794i ? 1 : 0);
        parcel.writeInt(this.f307795j ? 1 : 0);
        UserAddressMultiGeoData userAddressMultiGeoData = this.f307796k;
        if (userAddressMultiGeoData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userAddressMultiGeoData.writeToParcel(parcel, i12);
        }
        SellerAddNewAddressData sellerAddNewAddressData = this.f307797l;
        if (sellerAddNewAddressData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerAddNewAddressData.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ UserAddressMapShortAddressMviState(ScreenState screenState, AvitoMapCameraPosition avitoMapCameraPosition, boolean z12, boolean z13, ValidateByCoordsResult.Address address, boolean z14, String str, boolean z15, boolean z16, UserAddressMultiGeoData userAddressMultiGeoData, SellerAddNewAddressData sellerAddNewAddressData, int i12, C42822w c42822w) {
        this(screenState, avitoMapCameraPosition, z12, (i12 & 8) != 0 ? false : z13, address, (i12 & 32) != 0 ? false : z14, (i12 & 64) != 0 ? "" : str, (i12 & 128) != 0 ? false : z15, (i12 & 256) != 0 ? true : z16, (i12 & 512) != 0 ? null : userAddressMultiGeoData, (i12 & 1024) != 0 ? null : sellerAddNewAddressData);
    }
}
