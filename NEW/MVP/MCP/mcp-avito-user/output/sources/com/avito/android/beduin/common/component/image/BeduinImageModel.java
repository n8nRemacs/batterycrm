package com.avito.android.beduin.common.component.image;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.LocalIconTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinImageModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b0\u00101J\u008a\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u001fJ\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000205HÖ\u0001¢\u0006\u0004\b=\u00107J \u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u000205HÖ\u0001¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010H\u001a\u0004\bI\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bM\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bO\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bQ\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bS\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\bU\u0010/R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bW\u00101¨\u0006X"}, d2 = {"Lcom/avito/android/beduin/common/component/image/BeduinImageModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localImage", "Lcom/avito/android/beduin/common/component/image/Size;", "size", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "scaleType", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/Image;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/image/Size;Lcom/avito/android/beduin/common/component/image/ImageStyle;Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Lcom/avito/android/remote/model/Image;", "component6", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component7", "()Lcom/avito/android/beduin/common/component/image/Size;", "component8", "()Lcom/avito/android/beduin/common/component/image/ImageStyle;", "component9", "()Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "component10", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/Image;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/image/Size;Lcom/avito/android/beduin/common/component/image/ImageStyle;Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)Lcom/avito/android/beduin/common/component/image/BeduinImageModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalImage", "Lcom/avito/android/remote/model/Image;", "getImage", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalImage", "Lcom/avito/android/beduin/common/component/image/Size;", "getSize", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", "getStyle", "Lcom/avito/android/beduin/common/component/image/BeduinImageScaleType;", "getScaleType", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinImageModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinImageModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Image image;

    @l
    private final LocalIcon localImage;

    @l
    private final BeduinImageScaleType scaleType;

    @k
    private final Size size;

    @l
    private final ImageStyle style;

    @l
    private final BeduinComponentTheme theme;

    @l
    private final UniversalImage universalImage;

    /* compiled from: BeduinImageModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinImageModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinImageModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinImageModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinImageModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinImageModel(string, displayingPredicate, arrayList, (UniversalImage) parcel.readParcelable(BeduinImageModel.class.getClassLoader()), (Image) parcel.readParcelable(BeduinImageModel.class.getClassLoader()), parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel), Size.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BeduinImageScaleType.valueOf(parcel.readString()), parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinImageModel[] newArray(int i12) {
            return new BeduinImageModel[i12];
        }
    }

    public /* synthetic */ BeduinImageModel(String str, DisplayingPredicate displayingPredicate, List list, UniversalImage universalImage, Image image, LocalIcon localIcon, Size size, ImageStyle imageStyle, BeduinImageScaleType beduinImageScaleType, BeduinComponentTheme beduinComponentTheme, int i12, C42822w c42822w) {
        this(str, displayingPredicate, list, universalImage, image, localIcon, size, imageStyle, beduinImageScaleType, (i12 & 512) != 0 ? null : beduinComponentTheme);
    }

    public static /* synthetic */ BeduinImageModel copy$default(BeduinImageModel beduinImageModel, String str, DisplayingPredicate displayingPredicate, List list, UniversalImage universalImage, Image image, LocalIcon localIcon, Size size, ImageStyle imageStyle, BeduinImageScaleType beduinImageScaleType, BeduinComponentTheme beduinComponentTheme, int i12, Object obj) {
        return beduinImageModel.copy((i12 & 1) != 0 ? beduinImageModel.id : str, (i12 & 2) != 0 ? beduinImageModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinImageModel.actions : list, (i12 & 8) != 0 ? beduinImageModel.universalImage : universalImage, (i12 & 16) != 0 ? beduinImageModel.image : image, (i12 & 32) != 0 ? beduinImageModel.localImage : localIcon, (i12 & 64) != 0 ? beduinImageModel.size : size, (i12 & 128) != 0 ? beduinImageModel.style : imageStyle, (i12 & 256) != 0 ? beduinImageModel.scaleType : beduinImageScaleType, (i12 & 512) != 0 ? beduinImageModel.theme : beduinComponentTheme);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, 1021, null) : transform instanceof LocalIconTransform ? copy$default(this, null, null, null, null, null, ((LocalIconTransform) transform).getLocalIcon(), null, null, null, null, 991, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
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

    @l
    /* renamed from: component6, reason: from getter */
    public final LocalIcon getLocalImage() {
        return this.localImage;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final ImageStyle getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final BeduinImageScaleType getScaleType() {
        return this.scaleType;
    }

    @k
    public final BeduinImageModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions, @l UniversalImage universalImage, @l Image image, @l LocalIcon localImage, @k Size size, @l ImageStyle style, @l BeduinImageScaleType scaleType, @l BeduinComponentTheme theme) {
        return new BeduinImageModel(id2, displayingPredicate, actions, universalImage, image, localImage, size, style, scaleType, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinImageModel)) {
            return false;
        }
        BeduinImageModel beduinImageModel = (BeduinImageModel) other;
        return L.f(this.id, beduinImageModel.id) && L.f(this.displayingPredicate, beduinImageModel.displayingPredicate) && L.f(this.actions, beduinImageModel.actions) && L.f(this.universalImage, beduinImageModel.universalImage) && L.f(this.image, beduinImageModel.image) && L.f(this.localImage, beduinImageModel.localImage) && L.f(this.size, beduinImageModel.size) && L.f(this.style, beduinImageModel.style) && this.scaleType == beduinImageModel.scaleType && this.theme == beduinImageModel.theme;
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
    public final LocalIcon getLocalImage() {
        return this.localImage;
    }

    @l
    public final BeduinImageScaleType getScaleType() {
        return this.scaleType;
    }

    @k
    public final Size getSize() {
        return this.size;
    }

    @l
    public final ImageStyle getStyle() {
        return this.style;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
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
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        LocalIcon localIcon = this.localImage;
        int iHashCode6 = (this.size.hashCode() + ((iHashCode5 + (localIcon == null ? 0 : localIcon.hashCode())) * 31)) * 31;
        ImageStyle imageStyle = this.style;
        int iHashCode7 = (iHashCode6 + (imageStyle == null ? 0 : imageStyle.hashCode())) * 31;
        BeduinImageScaleType beduinImageScaleType = this.scaleType;
        int iHashCode8 = (iHashCode7 + (beduinImageScaleType == null ? 0 : beduinImageScaleType.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return iHashCode8 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinImageModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", actions=" + this.actions + ", universalImage=" + this.universalImage + ", image=" + this.image + ", localImage=" + this.localImage + ", size=" + this.size + ", style=" + this.style + ", scaleType=" + this.scaleType + ", theme=" + this.theme + ')';
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
        LocalIcon localIcon = this.localImage;
        if (localIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localIcon.writeToParcel(parcel, flags);
        }
        this.size.writeToParcel(parcel, flags);
        ImageStyle imageStyle = this.style;
        if (imageStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStyle.writeToParcel(parcel, flags);
        }
        BeduinImageScaleType beduinImageScaleType = this.scaleType;
        if (beduinImageScaleType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinImageScaleType.name());
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinImageModel(@k String str, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @l UniversalImage universalImage, @l Image image, @l LocalIcon localIcon, @k Size size, @l ImageStyle imageStyle, @l BeduinImageScaleType beduinImageScaleType, @l BeduinComponentTheme beduinComponentTheme) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
        this.universalImage = universalImage;
        this.image = image;
        this.localImage = localIcon;
        this.size = size;
        this.style = imageStyle;
        this.scaleType = beduinImageScaleType;
        this.theme = beduinComponentTheme;
    }
}
