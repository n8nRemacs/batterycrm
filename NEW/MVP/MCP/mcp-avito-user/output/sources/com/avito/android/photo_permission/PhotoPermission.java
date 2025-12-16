package com.avito.android.photo_permission;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.permissions.t;
import kotlin.Metadata;

/* compiled from: PhotoPermission.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermission;", "Landroid/os/Parcelable;", "Camera", "Storage", "Strategy", "Lcom/avito/android/photo_permission/PhotoPermission$Camera;", "Lcom/avito/android/photo_permission/PhotoPermission$Storage;", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PhotoPermission extends Parcelable {

    /* compiled from: PhotoPermission.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermission$Camera;", "Lcom/avito/android/photo_permission/PhotoPermission;", "<init>", "()V", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Camera implements PhotoPermission {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Camera f218689b = new Camera();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f218690c = "android.permission.CAMERA";

        @Y61.k
        public static final Parcelable.Creator<Camera> CREATOR = new a();

        /* compiled from: PhotoPermission.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Camera> {
            @Override // android.os.Parcelable.Creator
            public final Camera createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Camera.f218689b;
            }

            @Override // android.os.Parcelable.Creator
            public final Camera[] newArray(int i12) {
                return new Camera[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.photo_permission.PhotoPermission
        @Y61.k
        public final String o3() {
            return f218690c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: PhotoPermission.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermission$Storage;", "Lcom/avito/android/photo_permission/PhotoPermission;", "<init>", "()V", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Storage implements PhotoPermission {

        @Y61.k
        public static final Parcelable.Creator<Storage> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Storage f218691b = new Storage();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f218692c;

        /* compiled from: PhotoPermission.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Storage> {
            @Override // android.os.Parcelable.Creator
            public final Storage createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Storage.f218691b;
            }

            @Override // android.os.Parcelable.Creator
            public final Storage[] newArray(int i12) {
                return new Storage[i12];
            }
        }

        static {
            t.f215141z.getClass();
            f218692c = t.a.f215144c;
            CREATOR = new a();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.photo_permission.PhotoPermission
        @Y61.k
        public final String o3() {
            return f218692c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhotoPermission.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_permission/PhotoPermission$Strategy;", "", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Strategy {

        /* renamed from: b, reason: collision with root package name */
        public static final Strategy f218693b;

        /* renamed from: c, reason: collision with root package name */
        public static final Strategy f218694c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Strategy[] f218695d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f218696e;

        static {
            Strategy strategy = new Strategy("SOFT", 0);
            f218693b = strategy;
            Strategy strategy2 = new Strategy("HARD", 1);
            f218694c = strategy2;
            Strategy[] strategyArr = {strategy, strategy2};
            f218695d = strategyArr;
            f218696e = kotlin.enums.c.a(strategyArr);
        }

        public Strategy() {
            throw null;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f218695d.clone();
        }
    }

    /* compiled from: PhotoPermission.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    String o3();
}
