package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DimmedImage.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/DimmedImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "", "dimming", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/avito/android/remote/model/Image;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/DimmedImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/lang/Boolean;", "getDimming", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DimmedImage implements Parcelable {

    @k
    public static final Parcelable.Creator<DimmedImage> CREATOR = new Creator();

    @l
    private final Boolean dimming;

    @k
    private final Image image;

    /* compiled from: DimmedImage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DimmedImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DimmedImage createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Image imageCreateFromParcel = Image.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DimmedImage(imageCreateFromParcel, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DimmedImage[] newArray(int i12) {
            return new DimmedImage[i12];
        }
    }

    public DimmedImage(@k Image image, @l Boolean bool) {
        this.image = image;
        this.dimming = bool;
    }

    public static /* synthetic */ DimmedImage copy$default(DimmedImage dimmedImage, Image image, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            image = dimmedImage.image;
        }
        if ((i12 & 2) != 0) {
            bool = dimmedImage.dimming;
        }
        return dimmedImage.copy(image, bool);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getDimming() {
        return this.dimming;
    }

    @k
    public final DimmedImage copy(@k Image image, @l Boolean dimming) {
        return new DimmedImage(image, dimming);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DimmedImage)) {
            return false;
        }
        DimmedImage dimmedImage = (DimmedImage) other;
        return L.f(this.image, dimmedImage.image) && L.f(this.dimming, dimmedImage.dimming);
    }

    @l
    public final Boolean getDimming() {
        return this.dimming;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    public int hashCode() {
        int iHashCode = this.image.hashCode() * 31;
        Boolean bool = this.dimming;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DimmedImage(image=");
        sb2.append(this.image);
        sb2.append(", dimming=");
        return C0.g(sb2, this.dimming, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.image.writeToParcel(parcel, flags);
        Boolean bool = this.dimming;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ DimmedImage(Image image, Boolean bool, int i12, C42822w c42822w) {
        this(image, (i12 & 2) != 0 ? null : bool);
    }
}
