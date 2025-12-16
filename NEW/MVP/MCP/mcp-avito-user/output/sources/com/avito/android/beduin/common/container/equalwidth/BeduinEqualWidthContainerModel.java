package com.avito.android.beduin.common.container.equalwidth;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.BeduinContainerModel;
import com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.BackgroundTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinEqualWidthContainerModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0086\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b7\u00101J \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bD\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010%R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010'R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bI\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010J\u001a\u0004\bK\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010L\u001a\u0004\bM\u0010,¨\u0006N"}, d2 = {"Lcom/avito/android/beduin/common/container/equalwidth/BeduinEqualWidthContainerModel;", "Lcom/avito/android/beduin/common/container/BeduinSingleChildOwnerModel;", "Lcom/avito/android/beduin/common/container/BeduinContainerModel;", "", "id", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "", "interItemSpacing", "Lcom/avito/android/beduin/common/container/equalwidth/LayoutMode;", "layoutMode", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/equalwidth/LayoutMode;)V", "create", "(Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component4", "component5", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component6", "()Ljava/util/List;", "component7", "component8", "()Ljava/lang/Integer;", "component9", "()Lcom/avito/android/beduin/common/container/equalwidth/LayoutMode;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/equalwidth/LayoutMode;)Lcom/avito/android/beduin/common/container/equalwidth/BeduinEqualWidthContainerModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getMargin", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getChildren", "getActions", "Ljava/lang/Integer;", "getInterItemSpacing", "Lcom/avito/android/beduin/common/container/equalwidth/LayoutMode;", "getLayoutMode", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinEqualWidthContainerModel extends BeduinSingleChildOwnerModel implements BeduinContainerModel {

    @k
    public static final Parcelable.Creator<BeduinEqualWidthContainerModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final BeduinContainerBackground background;

    @l
    private final List<BeduinModel> children;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Integer interItemSpacing;

    @l
    private final LayoutMode layoutMode;

    @l
    private final BeduinContainerIndent margin;

    @l
    private final BeduinContainerIndent padding;

    /* compiled from: BeduinEqualWidthContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinEqualWidthContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinEqualWidthContainerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            BeduinContainerBackground beduinContainerBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinEqualWidthContainerModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinEqualWidthContainerModel.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinEqualWidthContainerModel.class, parcel, arrayList3, iL2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new BeduinEqualWidthContainerModel(string, beduinContainerBackgroundCreateFromParcel, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, displayingPredicate, arrayList, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : LayoutMode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinEqualWidthContainerModel[] newArray(int i12) {
            return new BeduinEqualWidthContainerModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinEqualWidthContainerModel(@k String str, @l BeduinContainerBackground beduinContainerBackground, @l BeduinContainerIndent beduinContainerIndent, @l BeduinContainerIndent beduinContainerIndent2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinModel> list, @l List<? extends BeduinAction> list2, @l Integer num, @l LayoutMode layoutMode) {
        this.id = str;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.displayingPredicate = displayingPredicate;
        this.children = list;
        this.actions = list2;
        this.interItemSpacing = num;
        this.layoutMode = layoutMode;
    }

    public static /* synthetic */ BeduinEqualWidthContainerModel copy$default(BeduinEqualWidthContainerModel beduinEqualWidthContainerModel, String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, List list, List list2, Integer num, LayoutMode layoutMode, int i12, Object obj) {
        return beduinEqualWidthContainerModel.copy((i12 & 1) != 0 ? beduinEqualWidthContainerModel.id : str, (i12 & 2) != 0 ? beduinEqualWidthContainerModel.background : beduinContainerBackground, (i12 & 4) != 0 ? beduinEqualWidthContainerModel.padding : beduinContainerIndent, (i12 & 8) != 0 ? beduinEqualWidthContainerModel.margin : beduinContainerIndent2, (i12 & 16) != 0 ? beduinEqualWidthContainerModel.displayingPredicate : displayingPredicate, (i12 & 32) != 0 ? beduinEqualWidthContainerModel.children : list, (i12 & 64) != 0 ? beduinEqualWidthContainerModel.actions : list2, (i12 & 128) != 0 ? beduinEqualWidthContainerModel.interItemSpacing : num, (i12 & 256) != 0 ? beduinEqualWidthContainerModel.layoutMode : layoutMode);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof BackgroundTransform ? copy$default(this, null, ((BackgroundTransform) transform).getBackground(), null, null, null, null, null, null, null, 509, null) : super.apply(transform);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final List<BeduinModel> component6() {
        return this.children;
    }

    @l
    public final List<BeduinAction> component7() {
        return this.actions;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @k
    public final BeduinEqualWidthContainerModel copy(@k String id2, @l BeduinContainerBackground background, @l BeduinContainerIndent padding, @l BeduinContainerIndent margin, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinModel> children, @l List<? extends BeduinAction> actions, @l Integer interItemSpacing, @l LayoutMode layoutMode) {
        return new BeduinEqualWidthContainerModel(id2, background, padding, margin, displayingPredicate, children, actions, interItemSpacing, layoutMode);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public BeduinModel create(@l List<? extends BeduinModel> children, @l DisplayingPredicate displayingPredicate) {
        return copy$default(this, null, null, null, null, displayingPredicate, children, null, null, null, 463, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinEqualWidthContainerModel)) {
            return false;
        }
        BeduinEqualWidthContainerModel beduinEqualWidthContainerModel = (BeduinEqualWidthContainerModel) other;
        return L.f(this.id, beduinEqualWidthContainerModel.id) && L.f(this.background, beduinEqualWidthContainerModel.background) && L.f(this.padding, beduinEqualWidthContainerModel.padding) && L.f(this.margin, beduinEqualWidthContainerModel.margin) && L.f(this.displayingPredicate, beduinEqualWidthContainerModel.displayingPredicate) && L.f(this.children, beduinEqualWidthContainerModel.children) && L.f(this.actions, beduinEqualWidthContainerModel.actions) && L.f(this.interItemSpacing, beduinEqualWidthContainerModel.interItemSpacing) && this.layoutMode == beduinEqualWidthContainerModel.layoutMode;
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @l
    public List<BeduinModel> getChildren() {
        return this.children;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100948c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100947b() {
        return this.id;
    }

    @l
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    public BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public BeduinContainerIndent getPadding() {
        return this.padding;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        BeduinContainerBackground beduinContainerBackground = this.background;
        int iHashCode2 = (iHashCode + (beduinContainerBackground == null ? 0 : beduinContainerBackground.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode3 = (iHashCode2 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        int iHashCode4 = (iHashCode3 + (beduinContainerIndent2 == null ? 0 : beduinContainerIndent2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode5 = (iHashCode4 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinModel> list = this.children;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.actions;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.interItemSpacing;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        LayoutMode layoutMode = this.layoutMode;
        return iHashCode8 + (layoutMode != null ? layoutMode.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinEqualWidthContainerModel(id=" + this.id + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", displayingPredicate=" + this.displayingPredicate + ", children=" + this.children + ", actions=" + this.actions + ", interItemSpacing=" + this.interItemSpacing + ", layoutMode=" + this.layoutMode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        BeduinContainerBackground beduinContainerBackground = this.background;
        if (beduinContainerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerBackground.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        if (beduinContainerIndent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent2.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
        List<BeduinModel> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        Integer num = this.interItemSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        LayoutMode layoutMode = this.layoutMode;
        if (layoutMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(layoutMode.name());
        }
    }
}
