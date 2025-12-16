package com.avito.android.beduin.common.component.spinner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSpinnerModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0016¨\u00060"}, d2 = {"Lcom/avito/android/beduin/common/component/spinner/BeduinSpinnerModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)Lcom/avito/android/beduin/common/component/spinner/BeduinSpinnerModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getStyle", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSpinnerModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinSpinnerModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final String style;

    @l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinSpinnerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSpinnerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSpinnerModel createFromParcel(Parcel parcel) {
            return new BeduinSpinnerModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinSpinnerModel.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSpinnerModel[] newArray(int i12) {
            return new BeduinSpinnerModel[i12];
        }
    }

    public BeduinSpinnerModel(@k String str, @l DisplayingPredicate displayingPredicate, @l String str2, @l BeduinComponentTheme beduinComponentTheme) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.style = str2;
        this.theme = beduinComponentTheme;
    }

    public static /* synthetic */ BeduinSpinnerModel copy$default(BeduinSpinnerModel beduinSpinnerModel, String str, DisplayingPredicate displayingPredicate, String str2, BeduinComponentTheme beduinComponentTheme, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinSpinnerModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinSpinnerModel.displayingPredicate;
        }
        if ((i12 & 4) != 0) {
            str2 = beduinSpinnerModel.style;
        }
        if ((i12 & 8) != 0) {
            beduinComponentTheme = beduinSpinnerModel.theme;
        }
        return beduinSpinnerModel.copy(str, displayingPredicate, str2, beduinComponentTheme);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, 13, null) : this;
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
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    public final BeduinSpinnerModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l String style, @l BeduinComponentTheme theme) {
        return new BeduinSpinnerModel(id2, displayingPredicate, style, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSpinnerModel)) {
            return false;
        }
        BeduinSpinnerModel beduinSpinnerModel = (BeduinSpinnerModel) other;
        return L.f(this.id, beduinSpinnerModel.id) && L.f(this.displayingPredicate, beduinSpinnerModel.displayingPredicate) && L.f(this.style, beduinSpinnerModel.style) && this.theme == beduinSpinnerModel.theme;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        String str = this.style;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return iHashCode3 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinSpinnerModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", style=" + this.style + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.style);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
    }
}
