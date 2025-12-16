package com.avito.android.remote.notification;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: NotificationImages.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/notification/NotificationImages;", "Landroid/os/Parcelable;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationImages implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<NotificationImages> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Bitmap f253963b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Bitmap f253964c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Bitmap f253965d;

    /* compiled from: NotificationImages.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotificationImages> {
        @Override // android.os.Parcelable.Creator
        public final NotificationImages createFromParcel(Parcel parcel) {
            return new NotificationImages((Bitmap) parcel.readParcelable(NotificationImages.class.getClassLoader()), (Bitmap) parcel.readParcelable(NotificationImages.class.getClassLoader()), (Bitmap) parcel.readParcelable(NotificationImages.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationImages[] newArray(int i12) {
            return new NotificationImages[i12];
        }
    }

    public NotificationImages(@Y61.k Bitmap bitmap, @Y61.k Bitmap bitmap2, @Y61.k Bitmap bitmap3) {
        this.f253963b = bitmap;
        this.f253964c = bitmap2;
        this.f253965d = bitmap3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f253963b, i12);
        parcel.writeParcelable(this.f253964c, i12);
        parcel.writeParcelable(this.f253965d, i12);
    }
}
