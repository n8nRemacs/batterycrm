package com.avito.android.remote.model.universal_promo_banner;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.universal_promo_banner.HorizontalAlignment;
import com.avito.android.remote.model.universal_promo_banner.VerticalAlignment;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImageLayout.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0011\u0010*\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010\fR\u0011\u0010,\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\u000e¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/universal_promo_banner/ImageLayout;", "Landroid/os/Parcelable;", "", "width", "height", "Lcom/avito/android/remote/model/universal_promo_banner/VerticalAlignment;", "_verticalAlignment", "Lcom/avito/android/remote/model/universal_promo_banner/HorizontalAlignment;", "_horizontalAlignment", "<init>", "(IILcom/avito/android/remote/model/universal_promo_banner/VerticalAlignment;Lcom/avito/android/remote/model/universal_promo_banner/HorizontalAlignment;)V", "component3", "()Lcom/avito/android/remote/model/universal_promo_banner/VerticalAlignment;", "component4", "()Lcom/avito/android/remote/model/universal_promo_banner/HorizontalAlignment;", "component1", "()I", "component2", "copy", "(IILcom/avito/android/remote/model/universal_promo_banner/VerticalAlignment;Lcom/avito/android/remote/model/universal_promo_banner/HorizontalAlignment;)Lcom/avito/android/remote/model/universal_promo_banner/ImageLayout;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getWidth", "getHeight", "Lcom/avito/android/remote/model/universal_promo_banner/VerticalAlignment;", "Lcom/avito/android/remote/model/universal_promo_banner/HorizontalAlignment;", "getVerticalAlignment", "verticalAlignment", "getHorizontalAlignment", "horizontalAlignment", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImageLayout implements Parcelable {

    @k
    public static final Parcelable.Creator<ImageLayout> CREATOR = new Creator();

    @c("horizontalAlignment")
    @l
    private final HorizontalAlignment _horizontalAlignment;

    @c("verticalAlignment")
    @l
    private final VerticalAlignment _verticalAlignment;

    @c("height")
    private final int height;

    @c("width")
    private final int width;

    /* compiled from: ImageLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageLayout> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageLayout createFromParcel(@k Parcel parcel) {
            return new ImageLayout(parcel.readInt(), parcel.readInt(), (VerticalAlignment) parcel.readParcelable(ImageLayout.class.getClassLoader()), (HorizontalAlignment) parcel.readParcelable(ImageLayout.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageLayout[] newArray(int i12) {
            return new ImageLayout[i12];
        }
    }

    public ImageLayout(int i12, int i13, @l VerticalAlignment verticalAlignment, @l HorizontalAlignment horizontalAlignment) {
        this.width = i12;
        this.height = i13;
        this._verticalAlignment = verticalAlignment;
        this._horizontalAlignment = horizontalAlignment;
    }

    /* renamed from: component3, reason: from getter */
    private final VerticalAlignment get_verticalAlignment() {
        return this._verticalAlignment;
    }

    /* renamed from: component4, reason: from getter */
    private final HorizontalAlignment get_horizontalAlignment() {
        return this._horizontalAlignment;
    }

    public static /* synthetic */ ImageLayout copy$default(ImageLayout imageLayout, int i12, int i13, VerticalAlignment verticalAlignment, HorizontalAlignment horizontalAlignment, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = imageLayout.width;
        }
        if ((i14 & 2) != 0) {
            i13 = imageLayout.height;
        }
        if ((i14 & 4) != 0) {
            verticalAlignment = imageLayout._verticalAlignment;
        }
        if ((i14 & 8) != 0) {
            horizontalAlignment = imageLayout._horizontalAlignment;
        }
        return imageLayout.copy(i12, i13, verticalAlignment, horizontalAlignment);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @k
    public final ImageLayout copy(int width, int height, @l VerticalAlignment _verticalAlignment, @l HorizontalAlignment _horizontalAlignment) {
        return new ImageLayout(width, height, _verticalAlignment, _horizontalAlignment);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLayout)) {
            return false;
        }
        ImageLayout imageLayout = (ImageLayout) other;
        return this.width == imageLayout.width && this.height == imageLayout.height && L.f(this._verticalAlignment, imageLayout._verticalAlignment) && L.f(this._horizontalAlignment, imageLayout._horizontalAlignment);
    }

    public final int getHeight() {
        return this.height;
    }

    @k
    public final HorizontalAlignment getHorizontalAlignment() {
        HorizontalAlignment horizontalAlignment = this._horizontalAlignment;
        return horizontalAlignment == null ? new HorizontalAlignment.Right(0) : horizontalAlignment;
    }

    @k
    public final VerticalAlignment getVerticalAlignment() {
        VerticalAlignment verticalAlignment = this._verticalAlignment;
        return verticalAlignment == null ? new VerticalAlignment.Bottom(0) : verticalAlignment;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iE2 = r.e(this.height, Integer.hashCode(this.width) * 31, 31);
        VerticalAlignment verticalAlignment = this._verticalAlignment;
        int iHashCode = (iE2 + (verticalAlignment == null ? 0 : verticalAlignment.hashCode())) * 31;
        HorizontalAlignment horizontalAlignment = this._horizontalAlignment;
        return iHashCode + (horizontalAlignment != null ? horizontalAlignment.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ImageLayout(width=" + this.width + ", height=" + this.height + ", _verticalAlignment=" + this._verticalAlignment + ", _horizontalAlignment=" + this._horizontalAlignment + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeParcelable(this._verticalAlignment, flags);
        parcel.writeParcelable(this._horizontalAlignment, flags);
    }

    public /* synthetic */ ImageLayout(int i12, int i13, VerticalAlignment verticalAlignment, HorizontalAlignment horizontalAlignment, int i14, C42822w c42822w) {
        this(i12, i13, (i14 & 4) != 0 ? null : verticalAlignment, (i14 & 8) != 0 ? null : horizontalAlignment);
    }
}
