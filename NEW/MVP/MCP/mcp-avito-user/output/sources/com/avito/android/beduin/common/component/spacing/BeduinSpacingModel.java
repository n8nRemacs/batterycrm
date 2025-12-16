package com.avito.android.beduin.common.component.spacing;

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
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSpacingModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0016¨\u0006/"}, d2 = {"Lcom/avito/android/beduin/common/component/spacing/BeduinSpacingModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "", "width", "height", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/spacing/BeduinSpacingModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getWidth", "getHeight", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSpacingModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinSpacingModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final Integer height;

    @k
    private final String id;

    @l
    private final Integer width;

    /* compiled from: BeduinSpacingModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSpacingModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSpacingModel createFromParcel(Parcel parcel) {
            return new BeduinSpacingModel(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (DisplayingPredicate) parcel.readParcelable(BeduinSpacingModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSpacingModel[] newArray(int i12) {
            return new BeduinSpacingModel[i12];
        }
    }

    public /* synthetic */ BeduinSpacingModel(String str, Integer num, Integer num2, DisplayingPredicate displayingPredicate, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? null : displayingPredicate);
    }

    public static /* synthetic */ BeduinSpacingModel copy$default(BeduinSpacingModel beduinSpacingModel, String str, Integer num, Integer num2, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinSpacingModel.id;
        }
        if ((i12 & 2) != 0) {
            num = beduinSpacingModel.width;
        }
        if ((i12 & 4) != 0) {
            num2 = beduinSpacingModel.height;
        }
        if ((i12 & 8) != 0) {
            displayingPredicate = beduinSpacingModel.displayingPredicate;
        }
        return beduinSpacingModel.copy(str, num, num2, displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 7, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinSpacingModel copy(@k String id2, @l Integer width, @l Integer height, @l DisplayingPredicate displayingPredicate) {
        return new BeduinSpacingModel(id2, width, height, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSpacingModel)) {
            return false;
        }
        BeduinSpacingModel beduinSpacingModel = (BeduinSpacingModel) other;
        return L.f(this.id, beduinSpacingModel.id) && L.f(this.width, beduinSpacingModel.width) && L.f(this.height, beduinSpacingModel.height) && L.f(this.displayingPredicate, beduinSpacingModel.displayingPredicate);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final Integer getHeight() {
        return this.height;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode3 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSpacingModel(id=");
        sb2.append(this.id);
        sb2.append(", width=");
        sb2.append(this.width);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
    }

    public BeduinSpacingModel(@k String str, @l Integer num, @l Integer num2, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.width = num;
        this.height = num2;
        this.displayingPredicate = displayingPredicate;
    }
}
