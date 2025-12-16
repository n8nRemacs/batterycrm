package com.avito.android.profile.edit.refactoring.avatar;

import K51.d;
import Y61.k;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.image_loader.p;
import kotlin.Metadata;

/* compiled from: UriAvatar.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/avatar/UriAvatar;", "Lcom/avito/android/profile/edit/refactoring/avatar/ProfileAvatar;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UriAvatar implements ProfileAvatar {

    @k
    public static final Parcelable.Creator<UriAvatar> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f222289b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f222290c;

    /* compiled from: UriAvatar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UriAvatar> {
        @Override // android.os.Parcelable.Creator
        public final UriAvatar createFromParcel(Parcel parcel) {
            return new UriAvatar((Uri) parcel.readParcelable(UriAvatar.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UriAvatar[] newArray(int i12) {
            return new UriAvatar[i12];
        }
    }

    public UriAvatar(@k Uri uri) {
        this.f222289b = uri;
        this.f222290c = new p(uri);
    }

    @Override // com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar
    @k
    public final com.avito.android.image_loader.k Y() {
        return this.f222290c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f222289b, i12);
    }
}
