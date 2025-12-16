package com.avito.android.user_address.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: UserAddressAddNewRealtyAddressLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_address/deeplink/UserAddressAddNewRealtyAddressLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class UserAddressAddNewRealtyAddressLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<UserAddressAddNewRealtyAddressLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f307213b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f307214c;

    /* compiled from: UserAddressAddNewRealtyAddressLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAddressAddNewRealtyAddressLink> {
        @Override // android.os.Parcelable.Creator
        public final UserAddressAddNewRealtyAddressLink createFromParcel(Parcel parcel) {
            return new UserAddressAddNewRealtyAddressLink(parcel.readString(), (DeepLink) parcel.readParcelable(UserAddressAddNewRealtyAddressLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UserAddressAddNewRealtyAddressLink[] newArray(int i12) {
            return new UserAddressAddNewRealtyAddressLink[i12];
        }
    }

    public UserAddressAddNewRealtyAddressLink(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f307213b = str;
        this.f307214c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAddressAddNewRealtyAddressLink)) {
            return false;
        }
        UserAddressAddNewRealtyAddressLink userAddressAddNewRealtyAddressLink = (UserAddressAddNewRealtyAddressLink) obj;
        return L.f(this.f307213b, userAddressAddNewRealtyAddressLink.f307213b) && L.f(this.f307214c, userAddressAddNewRealtyAddressLink.f307214c);
    }

    public final int hashCode() {
        return this.f307214c.hashCode() + (this.f307213b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAddressAddNewRealtyAddressLink(xGeoSession=");
        sb2.append(this.f307213b);
        sb2.append(", successUrl=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f307214c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f307213b);
        parcel.writeParcelable(this.f307214c, i12);
    }
}
