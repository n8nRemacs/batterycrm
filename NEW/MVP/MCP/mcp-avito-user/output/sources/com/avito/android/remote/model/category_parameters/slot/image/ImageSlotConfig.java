package com.avito.android.remote.model.category_parameters.slot.image;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImageSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlotConfig$ContentInsets;", "contentInsets", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlotConfig$ContentInsets;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlotConfig$ContentInsets;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlotConfig$ContentInsets;)Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlotConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalImage", "Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlotConfig$ContentInsets;", "getContentInsets", "ContentInsets", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ImageSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<ImageSlotConfig> CREATOR = new Creator();

    @c("contentInsets")
    @l
    private final ContentInsets contentInsets;

    @c("universalImage")
    @k
    private final UniversalImage universalImage;

    /* compiled from: ImageSlotConfig.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\n¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlotConfig$ContentInsets;", "Landroid/os/Parcelable;", "", "left", "top", "right", "bottom", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/category_parameters/slot/image/ImageSlotConfig$ContentInsets;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getLeft", "getTop", "getRight", "getBottom", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentInsets implements Parcelable {

        @k
        public static final Parcelable.Creator<ContentInsets> CREATOR = new Creator();

        @c("bottom")
        @l
        private final Integer bottom;

        @c("left")
        @l
        private final Integer left;

        @c("right")
        @l
        private final Integer right;

        @c("top")
        @l
        private final Integer top;

        /* compiled from: ImageSlotConfig.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ContentInsets> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContentInsets createFromParcel(@k Parcel parcel) {
                return new ContentInsets(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContentInsets[] newArray(int i12) {
                return new ContentInsets[i12];
            }
        }

        public ContentInsets(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4) {
            this.left = num;
            this.top = num2;
            this.right = num3;
            this.bottom = num4;
        }

        public static /* synthetic */ ContentInsets copy$default(ContentInsets contentInsets, Integer num, Integer num2, Integer num3, Integer num4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = contentInsets.left;
            }
            if ((i12 & 2) != 0) {
                num2 = contentInsets.top;
            }
            if ((i12 & 4) != 0) {
                num3 = contentInsets.right;
            }
            if ((i12 & 8) != 0) {
                num4 = contentInsets.bottom;
            }
            return contentInsets.copy(num, num2, num3, num4);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getLeft() {
            return this.left;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getTop() {
            return this.top;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Integer getRight() {
            return this.right;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Integer getBottom() {
            return this.bottom;
        }

        @k
        public final ContentInsets copy(@l Integer left, @l Integer top, @l Integer right, @l Integer bottom) {
            return new ContentInsets(left, top, right, bottom);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentInsets)) {
                return false;
            }
            ContentInsets contentInsets = (ContentInsets) other;
            return L.f(this.left, contentInsets.left) && L.f(this.top, contentInsets.top) && L.f(this.right, contentInsets.right) && L.f(this.bottom, contentInsets.bottom);
        }

        @l
        public final Integer getBottom() {
            return this.bottom;
        }

        @l
        public final Integer getLeft() {
            return this.left;
        }

        @l
        public final Integer getRight() {
            return this.right;
        }

        @l
        public final Integer getTop() {
            return this.top;
        }

        public int hashCode() {
            Integer num = this.left;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.top;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.right;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.bottom;
            return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ContentInsets(left=");
            sb2.append(this.left);
            sb2.append(", top=");
            sb2.append(this.top);
            sb2.append(", right=");
            sb2.append(this.right);
            sb2.append(", bottom=");
            return s.j(sb2, this.bottom, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.left;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Integer num2 = this.top;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            Integer num3 = this.right;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num3);
            }
            Integer num4 = this.bottom;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num4);
            }
        }
    }

    /* compiled from: ImageSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImageSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageSlotConfig createFromParcel(@k Parcel parcel) {
            return new ImageSlotConfig((UniversalImage) parcel.readParcelable(ImageSlotConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : ContentInsets.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ImageSlotConfig[] newArray(int i12) {
            return new ImageSlotConfig[i12];
        }
    }

    public ImageSlotConfig(@k UniversalImage universalImage, @l ContentInsets contentInsets) {
        this.universalImage = universalImage;
        this.contentInsets = contentInsets;
    }

    public static /* synthetic */ ImageSlotConfig copy$default(ImageSlotConfig imageSlotConfig, UniversalImage universalImage, ContentInsets contentInsets, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalImage = imageSlotConfig.universalImage;
        }
        if ((i12 & 2) != 0) {
            contentInsets = imageSlotConfig.contentInsets;
        }
        return imageSlotConfig.copy(universalImage, contentInsets);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ContentInsets getContentInsets() {
        return this.contentInsets;
    }

    @k
    public final ImageSlotConfig copy(@k UniversalImage universalImage, @l ContentInsets contentInsets) {
        return new ImageSlotConfig(universalImage, contentInsets);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSlotConfig)) {
            return false;
        }
        ImageSlotConfig imageSlotConfig = (ImageSlotConfig) other;
        return L.f(this.universalImage, imageSlotConfig.universalImage) && L.f(this.contentInsets, imageSlotConfig.contentInsets);
    }

    @l
    public final ContentInsets getContentInsets() {
        return this.contentInsets;
    }

    @k
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    public int hashCode() {
        int iHashCode = this.universalImage.hashCode() * 31;
        ContentInsets contentInsets = this.contentInsets;
        return iHashCode + (contentInsets == null ? 0 : contentInsets.hashCode());
    }

    @k
    public String toString() {
        return "ImageSlotConfig(universalImage=" + this.universalImage + ", contentInsets=" + this.contentInsets + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.universalImage, flags);
        ContentInsets contentInsets = this.contentInsets;
        if (contentInsets == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentInsets.writeToParcel(parcel, flags);
        }
    }
}
