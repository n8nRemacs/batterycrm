package com.avito.android.photo_camera_view;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.photo_picker.FlashMode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CameraPresenterState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_camera_view/CameraPresenterState;", "Landroid/os/Parcelable;", "_avito_photo-camera-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CameraPresenterState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CameraPresenterState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final CameraType f216365b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FlashMode f216366c;

    /* compiled from: CameraPresenterState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CameraPresenterState> {
        @Override // android.os.Parcelable.Creator
        public final CameraPresenterState createFromParcel(Parcel parcel) {
            return new CameraPresenterState((CameraType) parcel.readParcelable(CameraPresenterState.class.getClassLoader()), (FlashMode) parcel.readParcelable(CameraPresenterState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CameraPresenterState[] newArray(int i12) {
            return new CameraPresenterState[i12];
        }
    }

    public CameraPresenterState(@Y61.l CameraType cameraType, @Y61.k FlashMode flashMode) {
        this.f216365b = cameraType;
        this.f216366c = flashMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPresenterState)) {
            return false;
        }
        CameraPresenterState cameraPresenterState = (CameraPresenterState) obj;
        return L.f(this.f216365b, cameraPresenterState.f216365b) && L.f(this.f216366c, cameraPresenterState.f216366c);
    }

    public final int hashCode() {
        CameraType cameraType = this.f216365b;
        return this.f216366c.hashCode() + ((cameraType == null ? 0 : cameraType.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        return "CameraPresenterState(cameraType=" + this.f216365b + ", flashMode=" + this.f216366c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f216365b, i12);
        parcel.writeParcelable(this.f216366c, i12);
    }
}
