package com.avito.android.beduin.common.component.separator;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSeparatorModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0014¨\u0006-"}, d2 = {"Lcom/avito/android/beduin/common/component/separator/BeduinSeparatorModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/separator/SeparatorStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/separator/SeparatorStyle;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/separator/SeparatorStyle;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/separator/SeparatorStyle;)Lcom/avito/android/beduin/common/component/separator/BeduinSeparatorModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/separator/SeparatorStyle;", "getStyle", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSeparatorModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinSeparatorModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @k
    private final SeparatorStyle style;

    /* compiled from: BeduinSeparatorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSeparatorModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSeparatorModel createFromParcel(Parcel parcel) {
            return new BeduinSeparatorModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinSeparatorModel.class.getClassLoader()), SeparatorStyle.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSeparatorModel[] newArray(int i12) {
            return new BeduinSeparatorModel[i12];
        }
    }

    public BeduinSeparatorModel(@k String str, @l DisplayingPredicate displayingPredicate, @k SeparatorStyle separatorStyle) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.style = separatorStyle;
    }

    public static /* synthetic */ BeduinSeparatorModel copy$default(BeduinSeparatorModel beduinSeparatorModel, String str, DisplayingPredicate displayingPredicate, SeparatorStyle separatorStyle, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinSeparatorModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinSeparatorModel.displayingPredicate;
        }
        if ((i12 & 4) != 0) {
            separatorStyle = beduinSeparatorModel.style;
        }
        return beduinSeparatorModel.copy(str, displayingPredicate, separatorStyle);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, 5, null) : this;
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
    public final SeparatorStyle getStyle() {
        return this.style;
    }

    @k
    public final BeduinSeparatorModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k SeparatorStyle style) {
        return new BeduinSeparatorModel(id2, displayingPredicate, style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSeparatorModel)) {
            return false;
        }
        BeduinSeparatorModel beduinSeparatorModel = (BeduinSeparatorModel) other;
        return L.f(this.id, beduinSeparatorModel.id) && L.f(this.displayingPredicate, beduinSeparatorModel.displayingPredicate) && this.style == beduinSeparatorModel.style;
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

    @k
    public final SeparatorStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return this.style.hashCode() + ((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "BeduinSeparatorModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.style.name());
    }
}
