package com.avito.android.profile.edit.refactoring.avatar;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.image_loader.b;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: ImageAvatar.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/refactoring/avatar/ImageAvatar;", "Lcom/avito/android/profile/edit/refactoring/avatar/ProfileAvatar;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ImageAvatar implements ProfileAvatar {

    @k
    public static final Parcelable.Creator<ImageAvatar> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Image f222287b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.image_loader.a f222288c;

    /* compiled from: ImageAvatar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageAvatar> {
        @Override // android.os.Parcelable.Creator
        public final ImageAvatar createFromParcel(Parcel parcel) {
            return new ImageAvatar((Image) parcel.readParcelable(ImageAvatar.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAvatar[] newArray(int i12) {
            return new ImageAvatar[i12];
        }
    }

    public ImageAvatar(@k Image image) {
        this.f222287b = image;
        this.f222288c = b.b(image);
    }

    @Override // com.avito.android.profile.edit.refactoring.avatar.ProfileAvatar
    @k
    public final com.avito.android.image_loader.k Y() {
        return this.f222288c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f222287b, i12);
    }
}
