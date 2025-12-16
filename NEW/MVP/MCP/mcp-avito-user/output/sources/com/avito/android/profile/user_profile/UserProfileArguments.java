package com.avito.android.profile.user_profile;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserProfileFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/UserProfileArguments;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserProfileArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<UserProfileArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CardToOpenFromProfile f224213b;

    /* compiled from: UserProfileFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserProfileArguments> {
        @Override // android.os.Parcelable.Creator
        public final UserProfileArguments createFromParcel(Parcel parcel) {
            return new UserProfileArguments(CardToOpenFromProfile.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final UserProfileArguments[] newArray(int i12) {
            return new UserProfileArguments[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileArguments() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserProfileArguments) && this.f224213b == ((UserProfileArguments) obj).f224213b;
    }

    public final int hashCode() {
        return this.f224213b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "UserProfileArguments(cardToOpenFromProfile=" + this.f224213b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f224213b.name());
    }

    public UserProfileArguments(@Y61.k CardToOpenFromProfile cardToOpenFromProfile) {
        this.f224213b = cardToOpenFromProfile;
    }

    public /* synthetic */ UserProfileArguments(CardToOpenFromProfile cardToOpenFromProfile, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? CardToOpenFromProfile.f224194b : cardToOpenFromProfile);
    }
}
