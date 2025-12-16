package com.avito.android.beduin.common.component.progress_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinProgressBarModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\\\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b9\u0010\u001a¨\u0006:"}, d2 = {"Lcom/avito/android/beduin/common/component/progress_bar/BeduinProgressBarModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/remote/model/UniversalColor;", "passedColor", "remainedColor", "", "progress", "", "height", "spacingWidth", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;FLjava/lang/Double;Ljava/lang/Double;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "component4", "component5", "()F", "component6", "()Ljava/lang/Double;", "component7", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;FLjava/lang/Double;Ljava/lang/Double;)Lcom/avito/android/beduin/common/component/progress_bar/BeduinProgressBarModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/remote/model/UniversalColor;", "getPassedColor", "getRemainedColor", "F", "getProgress", "Ljava/lang/Double;", "getHeight", "getSpacingWidth", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinProgressBarModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinProgressBarModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final Double height;

    @k
    private final String id;

    @k
    private final UniversalColor passedColor;
    private final float progress;

    @k
    private final UniversalColor remainedColor;

    @l
    private final Double spacingWidth;

    /* compiled from: BeduinProgressBarModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinProgressBarModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinProgressBarModel createFromParcel(Parcel parcel) {
            return new BeduinProgressBarModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinProgressBarModel.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BeduinProgressBarModel.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BeduinProgressBarModel.class.getClassLoader()), parcel.readFloat(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinProgressBarModel[] newArray(int i12) {
            return new BeduinProgressBarModel[i12];
        }
    }

    public BeduinProgressBarModel(@k String str, @l DisplayingPredicate displayingPredicate, @k UniversalColor universalColor, @k UniversalColor universalColor2, float f12, @l Double d12, @l Double d13) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.passedColor = universalColor;
        this.remainedColor = universalColor2;
        this.progress = f12;
        this.height = d12;
        this.spacingWidth = d13;
    }

    public static /* synthetic */ BeduinProgressBarModel copy$default(BeduinProgressBarModel beduinProgressBarModel, String str, DisplayingPredicate displayingPredicate, UniversalColor universalColor, UniversalColor universalColor2, float f12, Double d12, Double d13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinProgressBarModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinProgressBarModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            universalColor = beduinProgressBarModel.passedColor;
        }
        UniversalColor universalColor3 = universalColor;
        if ((i12 & 8) != 0) {
            universalColor2 = beduinProgressBarModel.remainedColor;
        }
        UniversalColor universalColor4 = universalColor2;
        if ((i12 & 16) != 0) {
            f12 = beduinProgressBarModel.progress;
        }
        float f13 = f12;
        if ((i12 & 32) != 0) {
            d12 = beduinProgressBarModel.height;
        }
        Double d14 = d12;
        if ((i12 & 64) != 0) {
            d13 = beduinProgressBarModel.spacingWidth;
        }
        return beduinProgressBarModel.copy(str, displayingPredicate2, universalColor3, universalColor4, f13, d14, d13);
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
    public final UniversalColor getPassedColor() {
        return this.passedColor;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getRemainedColor() {
        return this.remainedColor;
    }

    /* renamed from: component5, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Double getHeight() {
        return this.height;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Double getSpacingWidth() {
        return this.spacingWidth;
    }

    @k
    public final BeduinProgressBarModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k UniversalColor passedColor, @k UniversalColor remainedColor, float progress, @l Double height, @l Double spacingWidth) {
        return new BeduinProgressBarModel(id2, displayingPredicate, passedColor, remainedColor, progress, height, spacingWidth);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinProgressBarModel)) {
            return false;
        }
        BeduinProgressBarModel beduinProgressBarModel = (BeduinProgressBarModel) other;
        return L.f(this.id, beduinProgressBarModel.id) && L.f(this.displayingPredicate, beduinProgressBarModel.displayingPredicate) && L.f(this.passedColor, beduinProgressBarModel.passedColor) && L.f(this.remainedColor, beduinProgressBarModel.remainedColor) && Float.compare(this.progress, beduinProgressBarModel.progress) == 0 && L.f(this.height, beduinProgressBarModel.height) && L.f(this.spacingWidth, beduinProgressBarModel.spacingWidth);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final Double getHeight() {
        return this.height;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @k
    public final UniversalColor getPassedColor() {
        return this.passedColor;
    }

    public final float getProgress() {
        return this.progress;
    }

    @k
    public final UniversalColor getRemainedColor() {
        return this.remainedColor;
    }

    @l
    public final Double getSpacingWidth() {
        return this.spacingWidth;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iD2 = r.d(this.progress, com.avito.android.actions_sheet.a.i(this.remainedColor, com.avito.android.actions_sheet.a.i(this.passedColor, (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31), 31), 31);
        Double d12 = this.height;
        int iHashCode2 = (iD2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.spacingWidth;
        return iHashCode2 + (d13 != null ? d13.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinProgressBarModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", passedColor=");
        sb2.append(this.passedColor);
        sb2.append(", remainedColor=");
        sb2.append(this.remainedColor);
        sb2.append(", progress=");
        sb2.append(this.progress);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", spacingWidth=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.spacingWidth, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeParcelable(this.passedColor, flags);
        parcel.writeParcelable(this.remainedColor, flags);
        parcel.writeFloat(this.progress);
        Double d12 = this.height;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Double d13 = this.spacingWidth;
        if (d13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
        }
    }
}
