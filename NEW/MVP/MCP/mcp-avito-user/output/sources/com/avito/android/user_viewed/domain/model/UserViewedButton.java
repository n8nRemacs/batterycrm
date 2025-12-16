package com.avito.android.user_viewed.domain.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: UserViewedButton.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_viewed/domain/model/UserViewedButton;", "Landroid/os/Parcelable;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class UserViewedButton implements Parcelable {

    @k
    public static final Parcelable.Creator<UserViewedButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318381b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f318382c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f318383d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f318384e;

    /* compiled from: UserViewedButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserViewedButton> {
        @Override // android.os.Parcelable.Creator
        public final UserViewedButton createFromParcel(Parcel parcel) {
            return new UserViewedButton(parcel.readString(), (DeepLink) parcel.readParcelable(UserViewedButton.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserViewedButton[] newArray(int i12) {
            return new UserViewedButton[i12];
        }
    }

    public UserViewedButton(@k String str, @k DeepLink deepLink, @k String str2, @k String str3) {
        this.f318381b = str;
        this.f318382c = deepLink;
        this.f318383d = str2;
        this.f318384e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318381b);
        parcel.writeParcelable(this.f318382c, i12);
        parcel.writeString(this.f318383d);
        parcel.writeString(this.f318384e);
    }
}
