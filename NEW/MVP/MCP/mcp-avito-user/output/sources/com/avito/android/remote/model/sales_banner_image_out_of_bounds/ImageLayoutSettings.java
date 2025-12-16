package com.avito.android.remote.model.sales_banner_image_out_of_bounds;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SalesBannerImageOutOfBounds.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Size;", "size", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Offset;", "offset", "<init>", "(Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Size;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Offset;)V", "component1", "()Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Size;", "component2", "()Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Offset;", "copy", "(Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Size;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Offset;)Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Size;", "getSize", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Offset;", "getOffset", "Offset", "Size", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImageLayoutSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<ImageLayoutSettings> CREATOR = new Creator();

    @c("offset")
    @l
    private final Offset offset;

    @c("size")
    @k
    private final Size size;

    /* compiled from: SalesBannerImageOutOfBounds.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageLayoutSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageLayoutSettings createFromParcel(@k Parcel parcel) {
            return new ImageLayoutSettings(Size.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Offset.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageLayoutSettings[] newArray(int i12) {
            return new ImageLayoutSettings[i12];
        }
    }

    /* compiled from: SalesBannerImageOutOfBounds.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Offset;", "Landroid/os/Parcelable;", "", "x", "y", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Offset;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getX", "getY", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Offset implements Parcelable {

        @k
        public static final Parcelable.Creator<Offset> CREATOR = new Creator();

        @c("x")
        private final int x;

        @c("y")
        private final int y;

        /* compiled from: SalesBannerImageOutOfBounds.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Offset> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Offset createFromParcel(@k Parcel parcel) {
                return new Offset(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Offset[] newArray(int i12) {
                return new Offset[i12];
            }
        }

        public Offset(int i12, int i13) {
            this.x = i12;
            this.y = i13;
        }

        public static /* synthetic */ Offset copy$default(Offset offset, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i12 = offset.x;
            }
            if ((i14 & 2) != 0) {
                i13 = offset.y;
            }
            return offset.copy(i12, i13);
        }

        /* renamed from: component1, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final int getY() {
            return this.y;
        }

        @k
        public final Offset copy(int x12, int y12) {
            return new Offset(x12, y12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Offset)) {
                return false;
            }
            Offset offset = (Offset) other;
            return this.x == offset.x && this.y == offset.y;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return Integer.hashCode(this.y) + (Integer.hashCode(this.x) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Offset(x=");
            sb2.append(this.x);
            sb2.append(", y=");
            return r.t(sb2, this.y, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.x);
            parcel.writeInt(this.y);
        }
    }

    /* compiled from: SalesBannerImageOutOfBounds.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Size;", "Landroid/os/Parcelable;", "", "width", "height", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings$Size;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getWidth", "getHeight", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Size implements Parcelable {

        @k
        public static final Parcelable.Creator<Size> CREATOR = new Creator();

        @c("height")
        private final int height;

        @c("width")
        private final int width;

        /* compiled from: SalesBannerImageOutOfBounds.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Size> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Size createFromParcel(@k Parcel parcel) {
                return new Size(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Size[] newArray(int i12) {
                return new Size[i12];
            }
        }

        public Size(int i12, int i13) {
            this.width = i12;
            this.height = i13;
        }

        public static /* synthetic */ Size copy$default(Size size, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i12 = size.width;
            }
            if ((i14 & 2) != 0) {
                i13 = size.height;
            }
            return size.copy(i12, i13);
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
        public final Size copy(int width, int height) {
            return new Size(width, height);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Size)) {
                return false;
            }
            Size size = (Size) other;
            return this.width == size.width && this.height == size.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Size(width=");
            sb2.append(this.width);
            sb2.append(", height=");
            return r.t(sb2, this.height, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    public ImageLayoutSettings(@k Size size, @l Offset offset) {
        this.size = size;
        this.offset = offset;
    }

    public static /* synthetic */ ImageLayoutSettings copy$default(ImageLayoutSettings imageLayoutSettings, Size size, Offset offset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            size = imageLayoutSettings.size;
        }
        if ((i12 & 2) != 0) {
            offset = imageLayoutSettings.offset;
        }
        return imageLayoutSettings.copy(size, offset);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Offset getOffset() {
        return this.offset;
    }

    @k
    public final ImageLayoutSettings copy(@k Size size, @l Offset offset) {
        return new ImageLayoutSettings(size, offset);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLayoutSettings)) {
            return false;
        }
        ImageLayoutSettings imageLayoutSettings = (ImageLayoutSettings) other;
        return L.f(this.size, imageLayoutSettings.size) && L.f(this.offset, imageLayoutSettings.offset);
    }

    @l
    public final Offset getOffset() {
        return this.offset;
    }

    @k
    public final Size getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = this.size.hashCode() * 31;
        Offset offset = this.offset;
        return iHashCode + (offset == null ? 0 : offset.hashCode());
    }

    @k
    public String toString() {
        return "ImageLayoutSettings(size=" + this.size + ", offset=" + this.offset + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.size.writeToParcel(parcel, flags);
        Offset offset = this.offset;
        if (offset == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offset.writeToParcel(parcel, flags);
        }
    }
}
