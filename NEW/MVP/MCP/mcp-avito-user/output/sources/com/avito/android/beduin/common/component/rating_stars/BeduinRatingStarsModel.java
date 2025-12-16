package com.avito.android.beduin.common.component.rating_stars;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.image.Size;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRatingStarsModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$Jt\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015J\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b/\u0010)J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b>\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010\u001eR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010$¨\u0006G"}, d2 = {"Lcom/avito/android/beduin/common/component/rating_stars/BeduinRatingStarsModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "icon", "Lcom/avito/android/remote/model/UniversalColor;", "onColor", "offColor", "", "interItemSpacing", "rating", "", "iconsAmount", "Lcom/avito/android/beduin/common/component/image/Size;", "size", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Double;DLjava/lang/Integer;Lcom/avito/android/beduin/common/component/image/Size;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "component5", "component6", "()Ljava/lang/Double;", "component7", "()D", "component8", "()Ljava/lang/Integer;", "component9", "()Lcom/avito/android/beduin/common/component/image/Size;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Double;DLjava/lang/Integer;Lcom/avito/android/beduin/common/component/image/Size;)Lcom/avito/android/beduin/common/component/rating_stars/BeduinRatingStarsModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getIcon", "Lcom/avito/android/remote/model/UniversalColor;", "getOnColor", "getOffColor", "Ljava/lang/Double;", "getInterItemSpacing", "D", "getRating", "Ljava/lang/Integer;", "getIconsAmount", "Lcom/avito/android/beduin/common/component/image/Size;", "getSize", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinRatingStarsModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinRatingStarsModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final LocalIcon icon;

    @l
    private final Integer iconsAmount;

    @k
    private final String id;

    @l
    private final Double interItemSpacing;

    @l
    private final UniversalColor offColor;

    @l
    private final UniversalColor onColor;
    private final double rating;

    @k
    private final Size size;

    /* compiled from: BeduinRatingStarsModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinRatingStarsModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRatingStarsModel createFromParcel(Parcel parcel) {
            return new BeduinRatingStarsModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinRatingStarsModel.class.getClassLoader()), LocalIcon.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(BeduinRatingStarsModel.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BeduinRatingStarsModel.class.getClassLoader()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readDouble(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), Size.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRatingStarsModel[] newArray(int i12) {
            return new BeduinRatingStarsModel[i12];
        }
    }

    public BeduinRatingStarsModel(@k String str, @l DisplayingPredicate displayingPredicate, @k LocalIcon localIcon, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l Double d12, double d13, @l Integer num, @k Size size) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.icon = localIcon;
        this.onColor = universalColor;
        this.offColor = universalColor2;
        this.interItemSpacing = d12;
        this.rating = d13;
        this.iconsAmount = num;
        this.size = size;
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

    @k
    /* renamed from: component3, reason: from getter */
    public final LocalIcon getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getOnColor() {
        return this.onColor;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getOffColor() {
        return this.offColor;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Double getInterItemSpacing() {
        return this.interItemSpacing;
    }

    /* renamed from: component7, reason: from getter */
    public final double getRating() {
        return this.rating;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Integer getIconsAmount() {
        return this.iconsAmount;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @k
    public final BeduinRatingStarsModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k LocalIcon icon, @l UniversalColor onColor, @l UniversalColor offColor, @l Double interItemSpacing, double rating, @l Integer iconsAmount, @k Size size) {
        return new BeduinRatingStarsModel(id2, displayingPredicate, icon, onColor, offColor, interItemSpacing, rating, iconsAmount, size);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRatingStarsModel)) {
            return false;
        }
        BeduinRatingStarsModel beduinRatingStarsModel = (BeduinRatingStarsModel) other;
        return L.f(this.id, beduinRatingStarsModel.id) && L.f(this.displayingPredicate, beduinRatingStarsModel.displayingPredicate) && L.f(this.icon, beduinRatingStarsModel.icon) && L.f(this.onColor, beduinRatingStarsModel.onColor) && L.f(this.offColor, beduinRatingStarsModel.offColor) && L.f(this.interItemSpacing, beduinRatingStarsModel.interItemSpacing) && Double.compare(this.rating, beduinRatingStarsModel.rating) == 0 && L.f(this.iconsAmount, beduinRatingStarsModel.iconsAmount) && L.f(this.size, beduinRatingStarsModel.size);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @k
    public final LocalIcon getIcon() {
        return this.icon;
    }

    @l
    public final Integer getIconsAmount() {
        return this.iconsAmount;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final Double getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public final UniversalColor getOffColor() {
        return this.offColor;
    }

    @l
    public final UniversalColor getOnColor() {
        return this.onColor;
    }

    public final double getRating() {
        return this.rating;
    }

    @k
    public final Size getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (this.icon.hashCode() + ((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31)) * 31;
        UniversalColor universalColor = this.onColor;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.offColor;
        int iHashCode4 = (iHashCode3 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        Double d12 = this.interItemSpacing;
        int iD2 = e.d((iHashCode4 + (d12 == null ? 0 : d12.hashCode())) * 31, 31, this.rating);
        Integer num = this.iconsAmount;
        return this.size.hashCode() + ((iD2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "BeduinRatingStarsModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", icon=" + this.icon + ", onColor=" + this.onColor + ", offColor=" + this.offColor + ", interItemSpacing=" + this.interItemSpacing + ", rating=" + this.rating + ", iconsAmount=" + this.iconsAmount + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        this.icon.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.onColor, flags);
        parcel.writeParcelable(this.offColor, flags);
        Double d12 = this.interItemSpacing;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        parcel.writeDouble(this.rating);
        Integer num = this.iconsAmount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        this.size.writeToParcel(parcel, flags);
    }
}
