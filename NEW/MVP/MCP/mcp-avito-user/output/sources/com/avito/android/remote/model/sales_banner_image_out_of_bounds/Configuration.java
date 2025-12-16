package com.avito.android.remote.model.sales_banner_image_out_of_bounds;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SalesBannerImageOutOfBounds.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u0012¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/WidthLayout;", "textWidth", "buttonWidth", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration$ImageData;", "imageData", "", "titleMaxLines", "subtitleMaxLines", "<init>", "(Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/WidthLayout;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/WidthLayout;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration$ImageData;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/WidthLayout;", "component2", "component3", "()Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration$ImageData;", "component4", "()Ljava/lang/Integer;", "component5", "copy", "(Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/WidthLayout;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/WidthLayout;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration$ImageData;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/WidthLayout;", "getTextWidth", "getButtonWidth", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration$ImageData;", "getImageData", "Ljava/lang/Integer;", "getTitleMaxLines", "getSubtitleMaxLines", "ImageData", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Configuration implements Parcelable {

    @k
    public static final Parcelable.Creator<Configuration> CREATOR = new Creator();

    @c("buttonWidth")
    @k
    private final WidthLayout buttonWidth;

    @c("imageData")
    @l
    private final ImageData imageData;

    @c("subtitleMaxLines")
    @l
    private final Integer subtitleMaxLines;

    @c("textWidth")
    @k
    private final WidthLayout textWidth;

    @c("titleMaxLines")
    @l
    private final Integer titleMaxLines;

    /* compiled from: SalesBannerImageOutOfBounds.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Configuration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Configuration createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<WidthLayout> creator = WidthLayout.CREATOR;
            return new Configuration(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImageData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Configuration[] newArray(int i12) {
            return new Configuration[i12];
        }
    }

    /* compiled from: SalesBannerImageOutOfBounds.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration$ImageData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings;", "layout", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings;)Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/Configuration$ImageData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/sales_banner_image_out_of_bounds/ImageLayoutSettings;", "getLayout", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ImageData implements Parcelable {

        @k
        public static final Parcelable.Creator<ImageData> CREATOR = new Creator();

        @c("image")
        @k
        private final UniversalImage image;

        @c("layout")
        @k
        private final ImageLayoutSettings layout;

        /* compiled from: SalesBannerImageOutOfBounds.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ImageData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageData createFromParcel(@k Parcel parcel) {
                return new ImageData((UniversalImage) parcel.readParcelable(ImageData.class.getClassLoader()), ImageLayoutSettings.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ImageData[] newArray(int i12) {
                return new ImageData[i12];
            }
        }

        public ImageData(@k UniversalImage universalImage, @k ImageLayoutSettings imageLayoutSettings) {
            this.image = universalImage;
            this.layout = imageLayoutSettings;
        }

        public static /* synthetic */ ImageData copy$default(ImageData imageData, UniversalImage universalImage, ImageLayoutSettings imageLayoutSettings, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = imageData.image;
            }
            if ((i12 & 2) != 0) {
                imageLayoutSettings = imageData.layout;
            }
            return imageData.copy(universalImage, imageLayoutSettings);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final ImageLayoutSettings getLayout() {
            return this.layout;
        }

        @k
        public final ImageData copy(@k UniversalImage image, @k ImageLayoutSettings layout) {
            return new ImageData(image, layout);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageData)) {
                return false;
            }
            ImageData imageData = (ImageData) other;
            return L.f(this.image, imageData.image) && L.f(this.layout, imageData.layout);
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final ImageLayoutSettings getLayout() {
            return this.layout;
        }

        public int hashCode() {
            return this.layout.hashCode() + (this.image.hashCode() * 31);
        }

        @k
        public String toString() {
            return "ImageData(image=" + this.image + ", layout=" + this.layout + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            this.layout.writeToParcel(parcel, flags);
        }
    }

    public Configuration(@k WidthLayout widthLayout, @k WidthLayout widthLayout2, @l ImageData imageData, @l Integer num, @l Integer num2) {
        this.textWidth = widthLayout;
        this.buttonWidth = widthLayout2;
        this.imageData = imageData;
        this.titleMaxLines = num;
        this.subtitleMaxLines = num2;
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, WidthLayout widthLayout, WidthLayout widthLayout2, ImageData imageData, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            widthLayout = configuration.textWidth;
        }
        if ((i12 & 2) != 0) {
            widthLayout2 = configuration.buttonWidth;
        }
        WidthLayout widthLayout3 = widthLayout2;
        if ((i12 & 4) != 0) {
            imageData = configuration.imageData;
        }
        ImageData imageData2 = imageData;
        if ((i12 & 8) != 0) {
            num = configuration.titleMaxLines;
        }
        Integer num3 = num;
        if ((i12 & 16) != 0) {
            num2 = configuration.subtitleMaxLines;
        }
        return configuration.copy(widthLayout, widthLayout3, imageData2, num3, num2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final WidthLayout getTextWidth() {
        return this.textWidth;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final WidthLayout getButtonWidth() {
        return this.buttonWidth;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ImageData getImageData() {
        return this.imageData;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getTitleMaxLines() {
        return this.titleMaxLines;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    @k
    public final Configuration copy(@k WidthLayout textWidth, @k WidthLayout buttonWidth, @l ImageData imageData, @l Integer titleMaxLines, @l Integer subtitleMaxLines) {
        return new Configuration(textWidth, buttonWidth, imageData, titleMaxLines, subtitleMaxLines);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return L.f(this.textWidth, configuration.textWidth) && L.f(this.buttonWidth, configuration.buttonWidth) && L.f(this.imageData, configuration.imageData) && L.f(this.titleMaxLines, configuration.titleMaxLines) && L.f(this.subtitleMaxLines, configuration.subtitleMaxLines);
    }

    @k
    public final WidthLayout getButtonWidth() {
        return this.buttonWidth;
    }

    @l
    public final ImageData getImageData() {
        return this.imageData;
    }

    @l
    public final Integer getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    @k
    public final WidthLayout getTextWidth() {
        return this.textWidth;
    }

    @l
    public final Integer getTitleMaxLines() {
        return this.titleMaxLines;
    }

    public int hashCode() {
        int iHashCode = (this.buttonWidth.hashCode() + (this.textWidth.hashCode() * 31)) * 31;
        ImageData imageData = this.imageData;
        int iHashCode2 = (iHashCode + (imageData == null ? 0 : imageData.hashCode())) * 31;
        Integer num = this.titleMaxLines;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.subtitleMaxLines;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Configuration(textWidth=");
        sb2.append(this.textWidth);
        sb2.append(", buttonWidth=");
        sb2.append(this.buttonWidth);
        sb2.append(", imageData=");
        sb2.append(this.imageData);
        sb2.append(", titleMaxLines=");
        sb2.append(this.titleMaxLines);
        sb2.append(", subtitleMaxLines=");
        return s.j(sb2, this.subtitleMaxLines, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.textWidth.writeToParcel(parcel, flags);
        this.buttonWidth.writeToParcel(parcel, flags);
        ImageData imageData = this.imageData;
        if (imageData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageData.writeToParcel(parcel, flags);
        }
        Integer num = this.titleMaxLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.subtitleMaxLines;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
    }
}
