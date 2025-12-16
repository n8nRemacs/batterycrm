package com.avito.android.beduin.common.component.imagesRow;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinImagesRowModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/imagesRow/Image;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/beduin/common/component/image/ImageStyle;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Lcom/avito/android/beduin/common/component/image/ImageStyle;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/beduin/common/component/image/ImageStyle;)Lcom/avito/android/beduin/common/component/imagesRow/Image;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalImage", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", "getStyle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Image implements Parcelable {

    @k
    public static final Parcelable.Creator<Image> CREATOR = new a();

    @l
    private final ImageStyle style;

    @k
    private final UniversalImage universalImage;

    /* compiled from: BeduinImagesRowModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Image> {
        @Override // android.os.Parcelable.Creator
        public final Image createFromParcel(Parcel parcel) {
            return new Image((UniversalImage) parcel.readParcelable(Image.class.getClassLoader()), parcel.readInt() == 0 ? null : ImageStyle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Image[] newArray(int i12) {
            return new Image[i12];
        }
    }

    public Image(@k UniversalImage universalImage, @l ImageStyle imageStyle) {
        this.universalImage = universalImage;
        this.style = imageStyle;
    }

    public static /* synthetic */ Image copy$default(Image image, UniversalImage universalImage, ImageStyle imageStyle, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalImage = image.universalImage;
        }
        if ((i12 & 2) != 0) {
            imageStyle = image.style;
        }
        return image.copy(universalImage, imageStyle);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ImageStyle getStyle() {
        return this.style;
    }

    @k
    public final Image copy(@k UniversalImage universalImage, @l ImageStyle style) {
        return new Image(universalImage, style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Image)) {
            return false;
        }
        Image image = (Image) other;
        return L.f(this.universalImage, image.universalImage) && L.f(this.style, image.style);
    }

    @l
    public final ImageStyle getStyle() {
        return this.style;
    }

    @k
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    public int hashCode() {
        int iHashCode = this.universalImage.hashCode() * 31;
        ImageStyle imageStyle = this.style;
        return iHashCode + (imageStyle == null ? 0 : imageStyle.hashCode());
    }

    @k
    public String toString() {
        return "Image(universalImage=" + this.universalImage + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.universalImage, flags);
        ImageStyle imageStyle = this.style;
        if (imageStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStyle.writeToParcel(parcel, flags);
        }
    }
}
