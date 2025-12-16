package com.avito.android.remote.model.category_parameters.slot.vin_cropped_image;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import kotlin.Metadata;

/* compiled from: VinCroppedImageSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/vin_cropped_image/VinCroppedImageSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "id", "text", "linkText", "vinCroppedImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getText", "getLinkText", "getVinCroppedImage", "setVinCroppedImage", "(Ljava/lang/String;)V", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VinCroppedImageSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<VinCroppedImageSlotConfig> CREATOR = new Creator();

    @k
    private final String id;

    @l
    private final String linkText;

    @l
    private final String text;

    @l
    private String vinCroppedImage;

    /* compiled from: VinCroppedImageSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VinCroppedImageSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VinCroppedImageSlotConfig createFromParcel(@k Parcel parcel) {
            return new VinCroppedImageSlotConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VinCroppedImageSlotConfig[] newArray(int i12) {
            return new VinCroppedImageSlotConfig[i12];
        }
    }

    public VinCroppedImageSlotConfig(@k String str, @l String str2, @l String str3, @l String str4) {
        this.id = str;
        this.text = str2;
        this.linkText = str3;
        this.vinCroppedImage = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getLinkText() {
        return this.linkText;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final String getVinCroppedImage() {
        return this.vinCroppedImage;
    }

    public final void setVinCroppedImage(@l String str) {
        this.vinCroppedImage = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        parcel.writeString(this.linkText);
        parcel.writeString(this.vinCroppedImage);
    }
}
