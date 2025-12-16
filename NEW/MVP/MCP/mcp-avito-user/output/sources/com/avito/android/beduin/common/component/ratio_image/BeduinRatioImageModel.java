package com.avito.android.beduin.common.component.ratio_image;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.image.BeduinImageScaleType;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRatioImageModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b'\u0010(J~\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0018J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020,HÖ\u0001¢\u0006\u0004\b4\u0010.J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020,HÖ\u0001¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001aR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010(¨\u0006M"}, d2 = {"Lcom/avito/android/beduin/common/component/ratio_image/BeduinRatioImageModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "Lcom/avito/android/remote/model/Image;", "image", "", "ratio", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "scaleType", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/Image;FLcom/avito/android/beduin/common/component/image/ImageStyle;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Lcom/avito/android/remote/model/Image;", "component6", "()F", "component7", "()Lcom/avito/android/beduin/common/component/image/ImageStyle;", "component8", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component9", "()Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/Image;FLcom/avito/android/beduin/common/component/image/ImageStyle;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;)Lcom/avito/android/beduin/common/component/ratio_image/BeduinRatioImageModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalImage", "Lcom/avito/android/remote/model/Image;", "getImage", "F", "getRatio", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", "getStyle", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getMargin", "Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "getScaleType", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinRatioImageModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinRatioImageModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Image image;

    @l
    private final BeduinContainerIndent margin;
    private final float ratio;

    @l
    private final BeduinImageScaleType scaleType;

    @l
    private final ImageStyle style;

    @l
    private final UniversalImage universalImage;

    /* compiled from: BeduinRatioImageModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinRatioImageModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRatioImageModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinRatioImageModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinRatioImageModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinRatioImageModel(string, displayingPredicate, arrayList, (UniversalImage) parcel.readParcelable(BeduinRatioImageModel.class.getClassLoader()), (Image) parcel.readParcelable(BeduinRatioImageModel.class.getClassLoader()), parcel.readFloat(), parcel.readInt() == 0 ? null : ImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BeduinImageScaleType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRatioImageModel[] newArray(int i12) {
            return new BeduinRatioImageModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinRatioImageModel(@k String str, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @l UniversalImage universalImage, @l Image image, float f12, @l ImageStyle imageStyle, @l BeduinContainerIndent beduinContainerIndent, @l BeduinImageScaleType beduinImageScaleType) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
        this.universalImage = universalImage;
        this.image = image;
        this.ratio = f12;
        this.style = imageStyle;
        this.margin = beduinContainerIndent;
        this.scaleType = beduinImageScaleType;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.actions;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    /* renamed from: component6, reason: from getter */
    public final float getRatio() {
        return this.ratio;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final ImageStyle getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final BeduinImageScaleType getScaleType() {
        return this.scaleType;
    }

    @k
    public final BeduinRatioImageModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions, @l UniversalImage universalImage, @l Image image, float ratio, @l ImageStyle style, @l BeduinContainerIndent margin, @l BeduinImageScaleType scaleType) {
        return new BeduinRatioImageModel(id2, displayingPredicate, actions, universalImage, image, ratio, style, margin, scaleType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRatioImageModel)) {
            return false;
        }
        BeduinRatioImageModel beduinRatioImageModel = (BeduinRatioImageModel) other;
        return L.f(this.id, beduinRatioImageModel.id) && L.f(this.displayingPredicate, beduinRatioImageModel.displayingPredicate) && L.f(this.actions, beduinRatioImageModel.actions) && L.f(this.universalImage, beduinRatioImageModel.universalImage) && L.f(this.image, beduinRatioImageModel.image) && Float.compare(this.ratio, beduinRatioImageModel.ratio) == 0 && L.f(this.style, beduinRatioImageModel.style) && L.f(this.margin, beduinRatioImageModel.margin) && this.scaleType == beduinRatioImageModel.scaleType;
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    public final float getRatio() {
        return this.ratio;
    }

    @l
    public final BeduinImageScaleType getScaleType() {
        return this.scaleType;
    }

    @l
    public final ImageStyle getStyle() {
        return this.style;
    }

    @l
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        UniversalImage universalImage = this.universalImage;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Image image = this.image;
        int iD2 = r.d(this.ratio, (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31, 31);
        ImageStyle imageStyle = this.style;
        int iHashCode5 = (iD2 + (imageStyle == null ? 0 : imageStyle.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.margin;
        int iHashCode6 = (iHashCode5 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinImageScaleType beduinImageScaleType = this.scaleType;
        return iHashCode6 + (beduinImageScaleType != null ? beduinImageScaleType.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinRatioImageModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", actions=" + this.actions + ", universalImage=" + this.universalImage + ", image=" + this.image + ", ratio=" + this.ratio + ", style=" + this.style + ", margin=" + this.margin + ", scaleType=" + this.scaleType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.universalImage, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeFloat(this.ratio);
        ImageStyle imageStyle = this.style;
        if (imageStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStyle.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent = this.margin;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        BeduinImageScaleType beduinImageScaleType = this.scaleType;
        if (beduinImageScaleType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinImageScaleType.name());
        }
    }
}
