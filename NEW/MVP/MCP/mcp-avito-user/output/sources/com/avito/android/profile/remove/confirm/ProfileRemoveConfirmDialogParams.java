package com.avito.android.profile.remove.confirm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveConfirmDialog.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/confirm/ProfileRemoveConfirmDialogParams;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileRemoveConfirmDialogParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ProfileRemoveConfirmDialogParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f223781b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f223782c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f223783d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f223784e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f223785f;

    /* compiled from: ProfileRemoveConfirmDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileRemoveConfirmDialogParams> {
        @Override // android.os.Parcelable.Creator
        public final ProfileRemoveConfirmDialogParams createFromParcel(Parcel parcel) {
            return new ProfileRemoveConfirmDialogParams((DeepLink) parcel.readParcelable(ProfileRemoveConfirmDialogParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileRemoveConfirmDialogParams[] newArray(int i12) {
            return new ProfileRemoveConfirmDialogParams[i12];
        }
    }

    public ProfileRemoveConfirmDialogParams(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.l String str2, @Y61.k String str3, boolean z12) {
        this.f223781b = str;
        this.f223782c = str2;
        this.f223783d = str3;
        this.f223784e = z12;
        this.f223785f = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileRemoveConfirmDialogParams)) {
            return false;
        }
        ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams = (ProfileRemoveConfirmDialogParams) obj;
        return L.f(this.f223781b, profileRemoveConfirmDialogParams.f223781b) && L.f(this.f223782c, profileRemoveConfirmDialogParams.f223782c) && L.f(this.f223783d, profileRemoveConfirmDialogParams.f223783d) && this.f223784e == profileRemoveConfirmDialogParams.f223784e && L.f(this.f223785f, profileRemoveConfirmDialogParams.f223785f);
    }

    public final int hashCode() {
        int iHashCode = this.f223781b.hashCode() * 31;
        String str = this.f223782c;
        int i12 = r.i(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f223783d), 31, this.f223784e);
        DeepLink deepLink = this.f223785f;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileRemoveConfirmDialogParams(title=");
        sb2.append(this.f223781b);
        sb2.append(", description=");
        sb2.append(this.f223782c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f223783d);
        sb2.append(", hasPassword=");
        sb2.append(this.f223784e);
        sb2.append(", restoreDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f223785f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f223781b);
        parcel.writeString(this.f223782c);
        parcel.writeString(this.f223783d);
        parcel.writeInt(this.f223784e ? 1 : 0);
        parcel.writeParcelable(this.f223785f, i12);
    }
}
