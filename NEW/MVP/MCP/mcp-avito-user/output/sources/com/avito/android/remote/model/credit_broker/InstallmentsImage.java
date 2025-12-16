package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: InstallmentsFloatingView.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/InstallmentsImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/Size;", "size", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/Size;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/Size;", "getSize", "()Lcom/avito/android/remote/model/Size;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InstallmentsImage implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsImage> CREATOR = new Creator();

    @c("image")
    @l
    private final UniversalImage image;

    @c("size")
    @l
    private final com.avito.android.remote.model.Size size;

    /* compiled from: InstallmentsFloatingView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentsImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsImage createFromParcel(@k Parcel parcel) {
            return new InstallmentsImage((UniversalImage) parcel.readParcelable(InstallmentsImage.class.getClassLoader()), (com.avito.android.remote.model.Size) parcel.readParcelable(InstallmentsImage.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsImage[] newArray(int i12) {
            return new InstallmentsImage[i12];
        }
    }

    public InstallmentsImage(@l UniversalImage universalImage, @l com.avito.android.remote.model.Size size) {
        this.image = universalImage;
        this.size = size;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final com.avito.android.remote.model.Size getSize() {
        return this.size;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.size, flags);
    }
}
