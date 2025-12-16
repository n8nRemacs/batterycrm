package com.avito.android.photo_permission;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: PhotoPermissionResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermissionResult;", "Landroid/os/Parcelable;", "Allow", "Disallow", "Lcom/avito/android/photo_permission/PhotoPermissionResult$Allow;", "Lcom/avito/android/photo_permission/PhotoPermissionResult$Disallow;", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PhotoPermissionResult extends Parcelable {

    /* compiled from: PhotoPermissionResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermissionResult$Allow;", "Lcom/avito/android/photo_permission/PhotoPermissionResult;", "<init>", "()V", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Allow implements PhotoPermissionResult {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Allow f218723b = new Allow();

        @Y61.k
        public static final Parcelable.Creator<Allow> CREATOR = new a();

        /* compiled from: PhotoPermissionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Allow> {
            @Override // android.os.Parcelable.Creator
            public final Allow createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Allow.f218723b;
            }

            @Override // android.os.Parcelable.Creator
            public final Allow[] newArray(int i12) {
                return new Allow[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PhotoPermissionResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermissionResult$Disallow;", "Lcom/avito/android/photo_permission/PhotoPermissionResult;", "<init>", "()V", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Disallow implements PhotoPermissionResult {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Disallow f218724b = new Disallow();

        @Y61.k
        public static final Parcelable.Creator<Disallow> CREATOR = new a();

        /* compiled from: PhotoPermissionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Disallow> {
            @Override // android.os.Parcelable.Creator
            public final Disallow createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Disallow.f218724b;
            }

            @Override // android.os.Parcelable.Creator
            public final Disallow[] newArray(int i12) {
                return new Disallow[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
