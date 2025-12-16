package com.avito.android.beduin.common.component.master_plan;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.lib.design.master_plan_view.MasterPlanPin;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinMasterPlanComponentModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$Jp\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010(\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b/\u0010)J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u001dR+\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b>\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010$¨\u0006C"}, d2 = {"Lcom/avito/android/beduin/common/component/master_plan/BeduinMasterPlanComponentModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/remote/model/Image;", "image", "Ljava/util/ArrayList;", "Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin;", "Lkotlin/collections/ArrayList;", "pins", "developmentId", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "", "cornerRadius", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/Image;Ljava/util/ArrayList;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/lang/Integer;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/remote/model/Image;", "component4", "()Ljava/util/ArrayList;", "component5", "component6", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component7", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/Image;Ljava/util/ArrayList;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/master_plan/BeduinMasterPlanComponentModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/util/ArrayList;", "getPins", "getDevelopmentId", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "Ljava/lang/Integer;", "getCornerRadius", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinMasterPlanComponentModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinMasterPlanComponentModel> CREATOR = new a();

    @l
    private final Integer cornerRadius;

    @k
    private final String developmentId;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @k
    private final Image image;

    @l
    private final BeduinContainerIndent padding;

    @l
    private final ArrayList<MasterPlanPin> pins;

    /* compiled from: BeduinMasterPlanComponentModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinMasterPlanComponentModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinMasterPlanComponentModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinMasterPlanComponentModel.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(BeduinMasterPlanComponentModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinMasterPlanComponentModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinMasterPlanComponentModel(string, displayingPredicate, image, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinMasterPlanComponentModel[] newArray(int i12) {
            return new BeduinMasterPlanComponentModel[i12];
        }
    }

    public BeduinMasterPlanComponentModel(@k String str, @l DisplayingPredicate displayingPredicate, @k Image image, @l ArrayList<MasterPlanPin> arrayList, @k String str2, @l BeduinContainerIndent beduinContainerIndent, @l Integer num) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.image = image;
        this.pins = arrayList;
        this.developmentId = str2;
        this.padding = beduinContainerIndent;
        this.cornerRadius = num;
    }

    public static /* synthetic */ BeduinMasterPlanComponentModel copy$default(BeduinMasterPlanComponentModel beduinMasterPlanComponentModel, String str, DisplayingPredicate displayingPredicate, Image image, ArrayList arrayList, String str2, BeduinContainerIndent beduinContainerIndent, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinMasterPlanComponentModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinMasterPlanComponentModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            image = beduinMasterPlanComponentModel.image;
        }
        Image image2 = image;
        if ((i12 & 8) != 0) {
            arrayList = beduinMasterPlanComponentModel.pins;
        }
        ArrayList arrayList2 = arrayList;
        if ((i12 & 16) != 0) {
            str2 = beduinMasterPlanComponentModel.developmentId;
        }
        String str3 = str2;
        if ((i12 & 32) != 0) {
            beduinContainerIndent = beduinMasterPlanComponentModel.padding;
        }
        BeduinContainerIndent beduinContainerIndent2 = beduinContainerIndent;
        if ((i12 & 64) != 0) {
            num = beduinMasterPlanComponentModel.cornerRadius;
        }
        return beduinMasterPlanComponentModel.copy(str, displayingPredicate2, image2, arrayList2, str3, beduinContainerIndent2, num);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, 125, null) : this;
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
    public final Image getImage() {
        return this.image;
    }

    @l
    public final ArrayList<MasterPlanPin> component4() {
        return this.pins;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getDevelopmentId() {
        return this.developmentId;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @k
    public final BeduinMasterPlanComponentModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k Image image, @l ArrayList<MasterPlanPin> pins, @k String developmentId, @l BeduinContainerIndent padding, @l Integer cornerRadius) {
        return new BeduinMasterPlanComponentModel(id2, displayingPredicate, image, pins, developmentId, padding, cornerRadius);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinMasterPlanComponentModel)) {
            return false;
        }
        BeduinMasterPlanComponentModel beduinMasterPlanComponentModel = (BeduinMasterPlanComponentModel) other;
        return L.f(this.id, beduinMasterPlanComponentModel.id) && L.f(this.displayingPredicate, beduinMasterPlanComponentModel.displayingPredicate) && L.f(this.image, beduinMasterPlanComponentModel.image) && L.f(this.pins, beduinMasterPlanComponentModel.pins) && L.f(this.developmentId, beduinMasterPlanComponentModel.developmentId) && L.f(this.padding, beduinMasterPlanComponentModel.padding) && L.f(this.cornerRadius, beduinMasterPlanComponentModel.cornerRadius);
    }

    @l
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @k
    public final String getDevelopmentId() {
        return this.developmentId;
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

    @k
    public final Image getImage() {
        return this.image;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final ArrayList<MasterPlanPin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iG2 = com.avito.android.actions_sheet.a.g(this.image, (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31);
        ArrayList<MasterPlanPin> arrayList = this.pins;
        int iD2 = H.d((iG2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31, this.developmentId);
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode2 = (iD2 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        Integer num = this.cornerRadius;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinMasterPlanComponentModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", pins=");
        sb2.append(this.pins);
        sb2.append(", developmentId=");
        sb2.append(this.developmentId);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", cornerRadius=");
        return s.j(sb2, this.cornerRadius, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeParcelable(this.image, flags);
        ArrayList<MasterPlanPin> arrayList = this.pins;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<MasterPlanPin> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
        parcel.writeString(this.developmentId);
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        Integer num = this.cornerRadius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
