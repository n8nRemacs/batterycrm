package com.avito.android.user_address.map.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.geo_common.model.location_picker.LocationPickerAddressType;
import com.avito.android.user_address.map.mvi.ScreenState;
import com.avito.android.user_address.model.ValidateByCoordsResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: UserAddressMapMviState.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapFullAddressMviState;", "Lcom/avito/android/user_address/map/mvi/UserAddressAddNewAddressMviState;", "a", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserAddressMapFullAddressMviState extends UserAddressAddNewAddressMviState {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScreenState f307725b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AvitoMapCameraPosition f307726c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f307727d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f307728e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ValidateByCoordsResult.Address f307729f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f307730g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f307731h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f307732i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f307733j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f307734k;

    /* renamed from: l, reason: collision with root package name */
    public final int f307735l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f307736m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f307737n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f307738o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f307739p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final LocationPickerAddressType f307740q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final a f307723r = new a(null);

    @Y61.k
    public static final Parcelable.Creator<UserAddressMapFullAddressMviState> CREATOR = new b();

    /* renamed from: s, reason: collision with root package name */
    public static final int f307724s = -1;

    /* compiled from: UserAddressMapMviState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_address/map/mvi/UserAddressMapFullAddressMviState$a;", "", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static UserAddressMapFullAddressMviState a(boolean z12) {
            return new UserAddressMapFullAddressMviState(ScreenState.CommonState.f307715b, new AvitoMapCameraPosition(new AvitoMapPoint(55.7522d, 37.6156d, null, 4, null), 17.0f, 0.0f, null, null, 28, null), false, false, new ValidateByCoordsResult.Address("", ""), false, null, false, false, z12, UserAddressMapFullAddressMviState.f307724s, null, null, null, null, LocationPickerAddressType.OTHER, 488, null);
        }

        public a() {
        }
    }

    /* compiled from: UserAddressMapMviState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UserAddressMapFullAddressMviState> {
        @Override // android.os.Parcelable.Creator
        public final UserAddressMapFullAddressMviState createFromParcel(Parcel parcel) {
            return new UserAddressMapFullAddressMviState((ScreenState) parcel.readParcelable(UserAddressMapFullAddressMviState.class.getClassLoader()), (AvitoMapCameraPosition) parcel.readParcelable(UserAddressMapFullAddressMviState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, ValidateByCoordsResult.Address.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), LocationPickerAddressType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final UserAddressMapFullAddressMviState[] newArray(int i12) {
            return new UserAddressMapFullAddressMviState[i12];
        }
    }

    public UserAddressMapFullAddressMviState(@Y61.k ScreenState screenState, @Y61.k AvitoMapCameraPosition avitoMapCameraPosition, boolean z12, boolean z13, @Y61.k ValidateByCoordsResult.Address address, boolean z14, @Y61.k String str, boolean z15, boolean z16, boolean z17, int i12, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k LocationPickerAddressType locationPickerAddressType) {
        super(null);
        this.f307725b = screenState;
        this.f307726c = avitoMapCameraPosition;
        this.f307727d = z12;
        this.f307728e = z13;
        this.f307729f = address;
        this.f307730g = z14;
        this.f307731h = str;
        this.f307732i = z15;
        this.f307733j = z16;
        this.f307734k = z17;
        this.f307735l = i12;
        this.f307736m = str2;
        this.f307737n = str3;
        this.f307738o = str4;
        this.f307739p = str5;
        this.f307740q = locationPickerAddressType;
    }

    public static UserAddressMapFullAddressMviState l(UserAddressMapFullAddressMviState userAddressMapFullAddressMviState, ScreenState screenState, AvitoMapCameraPosition avitoMapCameraPosition, boolean z12, boolean z13, ValidateByCoordsResult.Address address, boolean z14, String str, boolean z15, boolean z16, int i12, String str2, String str3, String str4, String str5, LocationPickerAddressType locationPickerAddressType, int i13) {
        ScreenState screenState2 = (i13 & 1) != 0 ? userAddressMapFullAddressMviState.f307725b : screenState;
        AvitoMapCameraPosition avitoMapCameraPosition2 = (i13 & 2) != 0 ? userAddressMapFullAddressMviState.f307726c : avitoMapCameraPosition;
        boolean z17 = (i13 & 4) != 0 ? userAddressMapFullAddressMviState.f307727d : z12;
        boolean z18 = (i13 & 8) != 0 ? userAddressMapFullAddressMviState.f307728e : z13;
        ValidateByCoordsResult.Address address2 = (i13 & 16) != 0 ? userAddressMapFullAddressMviState.f307729f : address;
        boolean z19 = (i13 & 32) != 0 ? userAddressMapFullAddressMviState.f307730g : z14;
        String str6 = (i13 & 64) != 0 ? userAddressMapFullAddressMviState.f307731h : str;
        boolean z22 = (i13 & 128) != 0 ? userAddressMapFullAddressMviState.f307732i : z15;
        boolean z23 = (i13 & 256) != 0 ? userAddressMapFullAddressMviState.f307733j : z16;
        boolean z24 = userAddressMapFullAddressMviState.f307734k;
        int i14 = (i13 & 1024) != 0 ? userAddressMapFullAddressMviState.f307735l : i12;
        String str7 = (i13 & 2048) != 0 ? userAddressMapFullAddressMviState.f307736m : str2;
        String str8 = (i13 & 4096) != 0 ? userAddressMapFullAddressMviState.f307737n : str3;
        String str9 = (i13 & 8192) != 0 ? userAddressMapFullAddressMviState.f307738o : str4;
        String str10 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? userAddressMapFullAddressMviState.f307739p : str5;
        LocationPickerAddressType locationPickerAddressType2 = (i13 & 32768) != 0 ? userAddressMapFullAddressMviState.f307740q : locationPickerAddressType;
        userAddressMapFullAddressMviState.getClass();
        return new UserAddressMapFullAddressMviState(screenState2, avitoMapCameraPosition2, z17, z18, address2, z19, str6, z22, z23, z24, i14, str7, str8, str9, str10, locationPickerAddressType2);
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    public final UserAddressAddNewAddressMviState a(@Y61.l ScreenState screenState, @Y61.l AvitoMapCameraPosition avitoMapCameraPosition, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l ValidateByCoordsResult.Address address, @Y61.l Boolean bool3, @Y61.l String str, @Y61.l Boolean bool4, boolean z12) {
        return l(this, screenState == null ? this.f307725b : screenState, avitoMapCameraPosition == null ? this.f307726c : avitoMapCameraPosition, bool != null ? bool.booleanValue() : this.f307727d, bool2 != null ? bool2.booleanValue() : this.f307728e, address == null ? this.f307729f : address, bool3 != null ? bool3.booleanValue() : this.f307730g, str == null ? this.f307731h : str, bool4 != null ? bool4.booleanValue() : this.f307732i, z12, 0, null, null, null, null, null, 65024);
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final ValidateByCoordsResult.Address getF307791f() {
        return this.f307729f;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final AvitoMapCameraPosition getF307788c() {
        return this.f307726c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getF307793h() {
        return this.f307731h;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAddressMapFullAddressMviState)) {
            return false;
        }
        UserAddressMapFullAddressMviState userAddressMapFullAddressMviState = (UserAddressMapFullAddressMviState) obj;
        return kotlin.jvm.internal.L.f(this.f307725b, userAddressMapFullAddressMviState.f307725b) && kotlin.jvm.internal.L.f(this.f307726c, userAddressMapFullAddressMviState.f307726c) && this.f307727d == userAddressMapFullAddressMviState.f307727d && this.f307728e == userAddressMapFullAddressMviState.f307728e && kotlin.jvm.internal.L.f(this.f307729f, userAddressMapFullAddressMviState.f307729f) && this.f307730g == userAddressMapFullAddressMviState.f307730g && kotlin.jvm.internal.L.f(this.f307731h, userAddressMapFullAddressMviState.f307731h) && this.f307732i == userAddressMapFullAddressMviState.f307732i && this.f307733j == userAddressMapFullAddressMviState.f307733j && this.f307734k == userAddressMapFullAddressMviState.f307734k && this.f307735l == userAddressMapFullAddressMviState.f307735l && kotlin.jvm.internal.L.f(this.f307736m, userAddressMapFullAddressMviState.f307736m) && kotlin.jvm.internal.L.f(this.f307737n, userAddressMapFullAddressMviState.f307737n) && kotlin.jvm.internal.L.f(this.f307738o, userAddressMapFullAddressMviState.f307738o) && kotlin.jvm.internal.L.f(this.f307739p, userAddressMapFullAddressMviState.f307739p) && this.f307740q == userAddressMapFullAddressMviState.f307740q;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: f, reason: from getter */
    public final boolean getF307789d() {
        return this.f307727d;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: g, reason: from getter */
    public final boolean getF307795j() {
        return this.f307733j;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: h, reason: from getter */
    public final boolean getF307794i() {
        return this.f307732i;
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f307735l, androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.compose.foundation.H.d(androidx.appcompat.app.r.i((this.f307729f.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f307726c.hashCode() + (this.f307725b.hashCode() * 31)) * 31, 31, this.f307727d), 31, this.f307728e)) * 31, 31, this.f307730g), 31, this.f307731h), 31, this.f307732i), 31, this.f307733j), 31, this.f307734k), 31);
        String str = this.f307736m;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f307737n;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f307738o;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f307739p;
        return this.f307740q.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final ScreenState getF307787b() {
        return this.f307725b;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: j, reason: from getter */
    public final boolean getF307790e() {
        return this.f307728e;
    }

    @Override // com.avito.android.user_address.map.mvi.UserAddressAddNewAddressMviState
    /* renamed from: k, reason: from getter */
    public final boolean getF307792g() {
        return this.f307730g;
    }

    @Y61.k
    public final String toString() {
        return "UserAddressMapFullAddressMviState(screenState=" + this.f307725b + ", avitoMapCameraPosition=" + this.f307726c + ", mapIsMoving=" + this.f307727d + ", setCameraPositionWithAnimation=" + this.f307728e + ", address=" + this.f307729f + ", showAddressFieldErrorState=" + this.f307730g + ", errorText=" + this.f307731h + ", saveButtonShowLoader=" + this.f307732i + ", saveButtonEnable=" + this.f307733j + ", enableDeleteAddress=" + this.f307734k + ", addressId=" + this.f307735l + ", apartment=" + this.f307736m + ", entrance=" + this.f307737n + ", floor=" + this.f307738o + ", comment=" + this.f307739p + ", addressType=" + this.f307740q + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f307725b, i12);
        parcel.writeParcelable(this.f307726c, i12);
        parcel.writeInt(this.f307727d ? 1 : 0);
        parcel.writeInt(this.f307728e ? 1 : 0);
        this.f307729f.writeToParcel(parcel, i12);
        parcel.writeInt(this.f307730g ? 1 : 0);
        parcel.writeString(this.f307731h);
        parcel.writeInt(this.f307732i ? 1 : 0);
        parcel.writeInt(this.f307733j ? 1 : 0);
        parcel.writeInt(this.f307734k ? 1 : 0);
        parcel.writeInt(this.f307735l);
        parcel.writeString(this.f307736m);
        parcel.writeString(this.f307737n);
        parcel.writeString(this.f307738o);
        parcel.writeString(this.f307739p);
        parcel.writeString(this.f307740q.name());
    }

    public /* synthetic */ UserAddressMapFullAddressMviState(ScreenState screenState, AvitoMapCameraPosition avitoMapCameraPosition, boolean z12, boolean z13, ValidateByCoordsResult.Address address, boolean z14, String str, boolean z15, boolean z16, boolean z17, int i12, String str2, String str3, String str4, String str5, LocationPickerAddressType locationPickerAddressType, int i13, C42822w c42822w) {
        this(screenState, avitoMapCameraPosition, z12, (i13 & 8) != 0 ? false : z13, address, (i13 & 32) != 0 ? false : z14, (i13 & 64) != 0 ? "" : str, (i13 & 128) != 0 ? false : z15, (i13 & 256) != 0 ? true : z16, z17, (i13 & 1024) != 0 ? -1 : i12, str2, str3, str4, str5, locationPickerAddressType);
    }
}
