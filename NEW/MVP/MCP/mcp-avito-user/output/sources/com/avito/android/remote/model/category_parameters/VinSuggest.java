package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: VinConfig.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/VinSuggest;", "Landroid/os/Parcelable;", "", "autoVINbyRegNumId", "vehicleNumberId", "vinByRegNumUserBackstepId", "regNumByPhotoRequest", "autoRegNumByPhoto", "photosId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAutoVINbyRegNumId", "()Ljava/lang/String;", "getVehicleNumberId", "getVinByRegNumUserBackstepId", "getRegNumByPhotoRequest", "getAutoRegNumByPhoto", "getPhotosId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VinSuggest implements Parcelable {

    @k
    public static final Parcelable.Creator<VinSuggest> CREATOR = new Creator();

    @c("autoRegNumByPhoto")
    @l
    private final String autoRegNumByPhoto;

    @c("autoVINbyRegNumId")
    @l
    private final String autoVINbyRegNumId;

    @c("photosId")
    @l
    private final String photosId;

    @c("regNumByPhotoRequest")
    @l
    private final String regNumByPhotoRequest;

    @c("vehicleNumberId")
    @l
    private final String vehicleNumberId;

    @c("vinByRegNumUserBackstepId")
    @l
    private final String vinByRegNumUserBackstepId;

    /* compiled from: VinConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VinSuggest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VinSuggest createFromParcel(@k Parcel parcel) {
            return new VinSuggest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VinSuggest[] newArray(int i12) {
            return new VinSuggest[i12];
        }
    }

    public VinSuggest(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6) {
        this.autoVINbyRegNumId = str;
        this.vehicleNumberId = str2;
        this.vinByRegNumUserBackstepId = str3;
        this.regNumByPhotoRequest = str4;
        this.autoRegNumByPhoto = str5;
        this.photosId = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getAutoRegNumByPhoto() {
        return this.autoRegNumByPhoto;
    }

    @l
    public final String getAutoVINbyRegNumId() {
        return this.autoVINbyRegNumId;
    }

    @l
    public final String getPhotosId() {
        return this.photosId;
    }

    @l
    public final String getRegNumByPhotoRequest() {
        return this.regNumByPhotoRequest;
    }

    @l
    public final String getVehicleNumberId() {
        return this.vehicleNumberId;
    }

    @l
    public final String getVinByRegNumUserBackstepId() {
        return this.vinByRegNumUserBackstepId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.autoVINbyRegNumId);
        parcel.writeString(this.vehicleNumberId);
        parcel.writeString(this.vinByRegNumUserBackstepId);
        parcel.writeString(this.regNumByPhotoRequest);
        parcel.writeString(this.autoRegNumByPhoto);
        parcel.writeString(this.photosId);
    }
}
