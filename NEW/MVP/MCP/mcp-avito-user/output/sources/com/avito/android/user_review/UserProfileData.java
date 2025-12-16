package com.avito.android.user_review;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: UserProfileData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_review/UserProfileData;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserProfileData implements Parcelable {

    @k
    public static final Parcelable.Creator<UserProfileData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f316953b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f316954c;

    /* compiled from: UserProfileData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserProfileData> {
        @Override // android.os.Parcelable.Creator
        public final UserProfileData createFromParcel(Parcel parcel) {
            return new UserProfileData(parcel.readString(), (Image) parcel.readParcelable(UserProfileData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UserProfileData[] newArray(int i12) {
            return new UserProfileData[i12];
        }
    }

    public UserProfileData(@k String str, @l Image image) {
        this.f316953b = str;
        this.f316954c = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f316953b);
        parcel.writeParcelable(this.f316954c, i12);
    }
}
