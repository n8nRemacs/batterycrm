package com.avito.android.remote.model.fmp.util;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Icons.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JR\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/fmp/util/Icons;", "Landroid/os/Parcelable;", "", "textImage", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "", "overlaidImagesUrls", "Lcom/avito/android/remote/model/fmp/util/IconBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/fmp/util/Size;", "size", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/IconBackground;Lcom/avito/android/remote/model/fmp/util/Size;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/fmp/util/IconBackground;", "component5", "()Lcom/avito/android/remote/model/fmp/util/Size;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/IconBackground;Lcom/avito/android/remote/model/fmp/util/Size;)Lcom/avito/android/remote/model/fmp/util/Icons;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTextImage", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalImage", "Ljava/util/List;", "getOverlaidImagesUrls", "Lcom/avito/android/remote/model/fmp/util/IconBackground;", "getBackground", "Lcom/avito/android/remote/model/fmp/util/Size;", "getSize", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Icons implements Parcelable {

    @k
    public static final Parcelable.Creator<Icons> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final IconBackground background;

    @c("overlaidImagesUrls")
    @l
    private final List<UniversalImage> overlaidImagesUrls;

    @c("size")
    @l
    private final Size size;

    @c("textImage")
    @l
    private final String textImage;

    @c("universalImage")
    @l
    private final UniversalImage universalImage;

    /* compiled from: Icons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Icons> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Icons createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Icons.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(Icons.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new Icons(string, universalImage, arrayList, parcel.readInt() == 0 ? null : IconBackground.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Size.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Icons[] newArray(int i12) {
            return new Icons[i12];
        }
    }

    public Icons(@l String str, @l UniversalImage universalImage, @l List<UniversalImage> list, @l IconBackground iconBackground, @l Size size) {
        this.textImage = str;
        this.universalImage = universalImage;
        this.overlaidImagesUrls = list;
        this.background = iconBackground;
        this.size = size;
    }

    public static /* synthetic */ Icons copy$default(Icons icons, String str, UniversalImage universalImage, List list, IconBackground iconBackground, Size size, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = icons.textImage;
        }
        if ((i12 & 2) != 0) {
            universalImage = icons.universalImage;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 4) != 0) {
            list = icons.overlaidImagesUrls;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            iconBackground = icons.background;
        }
        IconBackground iconBackground2 = iconBackground;
        if ((i12 & 16) != 0) {
            size = icons.size;
        }
        return icons.copy(str, universalImage2, list2, iconBackground2, size);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTextImage() {
        return this.textImage;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @l
    public final List<UniversalImage> component3() {
        return this.overlaidImagesUrls;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final IconBackground getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @k
    public final Icons copy(@l String textImage, @l UniversalImage universalImage, @l List<UniversalImage> overlaidImagesUrls, @l IconBackground background, @l Size size) {
        return new Icons(textImage, universalImage, overlaidImagesUrls, background, size);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Icons)) {
            return false;
        }
        Icons icons = (Icons) other;
        return L.f(this.textImage, icons.textImage) && L.f(this.universalImage, icons.universalImage) && L.f(this.overlaidImagesUrls, icons.overlaidImagesUrls) && L.f(this.background, icons.background) && L.f(this.size, icons.size);
    }

    @l
    public final IconBackground getBackground() {
        return this.background;
    }

    @l
    public final List<UniversalImage> getOverlaidImagesUrls() {
        return this.overlaidImagesUrls;
    }

    @l
    public final Size getSize() {
        return this.size;
    }

    @l
    public final String getTextImage() {
        return this.textImage;
    }

    @l
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    public int hashCode() {
        String str = this.textImage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalImage universalImage = this.universalImage;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        List<UniversalImage> list = this.overlaidImagesUrls;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        IconBackground iconBackground = this.background;
        int iHashCode4 = (iHashCode3 + (iconBackground == null ? 0 : iconBackground.hashCode())) * 31;
        Size size = this.size;
        return iHashCode4 + (size != null ? size.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Icons(textImage=" + this.textImage + ", universalImage=" + this.universalImage + ", overlaidImagesUrls=" + this.overlaidImagesUrls + ", background=" + this.background + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.textImage);
        parcel.writeParcelable(this.universalImage, flags);
        List<UniversalImage> list = this.overlaidImagesUrls;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        IconBackground iconBackground = this.background;
        if (iconBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconBackground.writeToParcel(parcel, flags);
        }
        Size size = this.size;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, flags);
        }
    }
}
