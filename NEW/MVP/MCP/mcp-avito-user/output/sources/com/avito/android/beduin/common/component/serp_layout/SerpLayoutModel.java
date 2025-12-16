package com.avito.android.beduin.common.component.serp_layout;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SerpElementOptimizedParceler;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SerpLayoutModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJX\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u001aR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/avito/android/beduin/common/component/serp_layout/SerpLayoutModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/remote/model/SerpElement;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "interItemSpacing", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "displayStyle", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/lang/String;)V", "component6", "()Ljava/lang/String;", "component1", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/serp_layout/SerpLayoutModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getChildren", "Ljava/lang/Integer;", "getInterItemSpacing", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getMargin", "Lcom/avito/android/remote/model/SerpDisplayType;", "getSerpDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "serpDisplayType", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SerpLayoutModel extends LeafBeduinModel {

    @Y61.k
    public static final Parcelable.Creator<SerpLayoutModel> CREATOR = new a();

    @Y61.k
    private final List<SerpElement> children;

    @Y61.k
    private final String displayStyle;

    @l
    private final DisplayingPredicate displayingPredicate;

    @Y61.k
    private final String id;

    @l
    private final Integer interItemSpacing;

    @l
    private final BeduinContainerIndent margin;

    /* compiled from: SerpLayoutModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SerpLayoutModel> {
        @Override // android.os.Parcelable.Creator
        public final SerpLayoutModel createFromParcel(Parcel parcel) {
            return new SerpLayoutModel(parcel.readString(), (DisplayingPredicate) parcel.readParcelable(SerpLayoutModel.class.getClassLoader()), SerpElementOptimizedParceler.INSTANCE.create(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? BeduinContainerIndent.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SerpLayoutModel[] newArray(int i12) {
            return new SerpLayoutModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerpLayoutModel(@Y61.k String str, @l DisplayingPredicate displayingPredicate, @Y61.k List<? extends SerpElement> list, @l Integer num, @l BeduinContainerIndent beduinContainerIndent, @Y61.k String str2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.children = list;
        this.interItemSpacing = num;
        this.margin = beduinContainerIndent;
        this.displayStyle = str2;
    }

    /* renamed from: component6, reason: from getter */
    private final String getDisplayStyle() {
        return this.displayStyle;
    }

    public static /* synthetic */ SerpLayoutModel copy$default(SerpLayoutModel serpLayoutModel, String str, DisplayingPredicate displayingPredicate, List list, Integer num, BeduinContainerIndent beduinContainerIndent, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = serpLayoutModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = serpLayoutModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            list = serpLayoutModel.children;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            num = serpLayoutModel.interItemSpacing;
        }
        Integer num2 = num;
        if ((i12 & 16) != 0) {
            beduinContainerIndent = serpLayoutModel.margin;
        }
        BeduinContainerIndent beduinContainerIndent2 = beduinContainerIndent;
        if ((i12 & 32) != 0) {
            str2 = serpLayoutModel.displayStyle;
        }
        return serpLayoutModel.copy(str, displayingPredicate2, list2, num2, beduinContainerIndent2, str2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.k
    public final List<SerpElement> component3() {
        return this.children;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.k
    public final SerpLayoutModel copy(@Y61.k String id2, @l DisplayingPredicate displayingPredicate, @Y61.k List<? extends SerpElement> children, @l Integer interItemSpacing, @l BeduinContainerIndent margin, @Y61.k String displayStyle) {
        return new SerpLayoutModel(id2, displayingPredicate, children, interItemSpacing, margin, displayStyle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerpLayoutModel)) {
            return false;
        }
        SerpLayoutModel serpLayoutModel = (SerpLayoutModel) other;
        return L.f(this.id, serpLayoutModel.id) && L.f(this.displayingPredicate, serpLayoutModel.displayingPredicate) && L.f(this.children, serpLayoutModel.children) && L.f(this.interItemSpacing, serpLayoutModel.interItemSpacing) && L.f(this.margin, serpLayoutModel.margin) && L.f(this.displayStyle, serpLayoutModel.displayStyle);
    }

    @Y61.k
    public final List<SerpElement> getChildren() {
        return this.children;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100948c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF100947b() {
        return this.id;
    }

    @l
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.k
    public final SerpDisplayType getSerpDisplayType() {
        SerpDisplayType serpDisplayTypeFromString = SerpDisplayType.INSTANCE.fromString(this.displayStyle);
        return serpDisplayTypeFromString == null ? SerpDisplayType.Grid : serpDisplayTypeFromString;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iE2 = H.e((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31, this.children);
        Integer num = this.interItemSpacing;
        int iHashCode2 = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.margin;
        return this.displayStyle.hashCode() + ((iHashCode2 + (beduinContainerIndent != null ? beduinContainerIndent.hashCode() : 0)) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SerpLayoutModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", children=");
        sb2.append(this.children);
        sb2.append(", interItemSpacing=");
        sb2.append(this.interItemSpacing);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", displayStyle=");
        return C22026a.c(sb2, this.displayStyle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        SerpElementOptimizedParceler.INSTANCE.write((List<? extends SerpElement>) this.children, parcel, flags);
        Integer num = this.interItemSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        BeduinContainerIndent beduinContainerIndent = this.margin;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.displayStyle);
    }
}
