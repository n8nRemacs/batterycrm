package com.avito.android.beduin.common.container.layered;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.BeduinContainerModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.BackgroundTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinLayeredContainerModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000b0\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001a0\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b2\u0010-J\u0082\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010$J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\u001a2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000206HÖ\u0001¢\u0006\u0004\b=\u00108J \u0010A\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u000206HÖ\u0001¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bH\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bI\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010+R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010L\u001a\u0004\bM\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bO\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u00101R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bR\u0010-¨\u0006S"}, d2 = {"Lcom/avito/android/beduin/common/container/layered/BeduinLayeredContainerModel;", "Lcom/avito/android/beduin/common/container/BeduinContainerModel;", "", "id", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/container/layered/LayeredContainerLayoutMode;", "layoutMode", "Lcom/avito/android/beduin_models/BeduinModel;", "backgroundChild", "Lcom/avito/android/beduin/common/container/layered/BeduinLayeredContainerChild;", "foregroundChildren", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/beduin/common/container/layered/LayeredContainerLayoutMode;Lcom/avito/android/beduin_models/BeduinModel;Ljava/util/List;)V", "Lkotlin/Function1;", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component4", "component5", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component6", "()Ljava/util/List;", "component7", "()Lcom/avito/android/beduin/common/container/layered/LayeredContainerLayoutMode;", "component8", "()Lcom/avito/android/beduin_models/BeduinModel;", "component9", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/beduin/common/container/layered/LayeredContainerLayoutMode;Lcom/avito/android/beduin_models/BeduinModel;Ljava/util/List;)Lcom/avito/android/beduin/common/container/layered/BeduinLayeredContainerModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getMargin", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin/common/container/layered/LayeredContainerLayoutMode;", "getLayoutMode", "Lcom/avito/android/beduin_models/BeduinModel;", "getBackgroundChild", "getForegroundChildren", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinLayeredContainerModel implements BeduinContainerModel {

    @Y61.k
    public static final Parcelable.Creator<BeduinLayeredContainerModel> CREATOR = new a();

    @Y61.l
    private final List<BeduinAction> actions;

    @Y61.l
    private final BeduinContainerBackground background;

    @Y61.k
    private final BeduinModel backgroundChild;

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.l
    private final List<BeduinLayeredContainerChild> foregroundChildren;

    @Y61.k
    private final String id;

    @Y61.k
    private final LayeredContainerLayoutMode layoutMode;

    @Y61.l
    private final BeduinContainerIndent margin;

    @Y61.l
    private final BeduinContainerIndent padding;

    /* compiled from: BeduinLayeredContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinLayeredContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinLayeredContainerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            BeduinContainerBackground beduinContainerBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinLayeredContainerModel.class.getClassLoader());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinLayeredContainerModel.class, parcel, arrayList, iL2, 1);
                }
            }
            LayeredContainerLayoutMode layeredContainerLayoutModeValueOf = LayeredContainerLayoutMode.valueOf(parcel.readString());
            BeduinModel beduinModel = (BeduinModel) parcel.readParcelable(BeduinLayeredContainerModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(BeduinLayeredContainerChild.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new BeduinLayeredContainerModel(string, beduinContainerBackgroundCreateFromParcel, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, displayingPredicate, arrayList, layeredContainerLayoutModeValueOf, beduinModel, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinLayeredContainerModel[] newArray(int i12) {
            return new BeduinLayeredContainerModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinLayeredContainerModel(@Y61.k String str, @Y61.l BeduinContainerBackground beduinContainerBackground, @Y61.l BeduinContainerIndent beduinContainerIndent, @Y61.l BeduinContainerIndent beduinContainerIndent2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l List<? extends BeduinAction> list, @Y61.k LayeredContainerLayoutMode layeredContainerLayoutMode, @Y61.k BeduinModel beduinModel, @Y61.l List<BeduinLayeredContainerChild> list2) {
        this.id = str;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
        this.layoutMode = layeredContainerLayoutMode;
        this.backgroundChild = beduinModel;
        this.foregroundChildren = list2;
    }

    public static /* synthetic */ BeduinLayeredContainerModel copy$default(BeduinLayeredContainerModel beduinLayeredContainerModel, String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, List list, LayeredContainerLayoutMode layeredContainerLayoutMode, BeduinModel beduinModel, List list2, int i12, Object obj) {
        return beduinLayeredContainerModel.copy((i12 & 1) != 0 ? beduinLayeredContainerModel.id : str, (i12 & 2) != 0 ? beduinLayeredContainerModel.background : beduinContainerBackground, (i12 & 4) != 0 ? beduinLayeredContainerModel.padding : beduinContainerIndent, (i12 & 8) != 0 ? beduinLayeredContainerModel.margin : beduinContainerIndent2, (i12 & 16) != 0 ? beduinLayeredContainerModel.displayingPredicate : displayingPredicate, (i12 & 32) != 0 ? beduinLayeredContainerModel.actions : list, (i12 & 64) != 0 ? beduinLayeredContainerModel.layoutMode : layeredContainerLayoutMode, (i12 & 128) != 0 ? beduinLayeredContainerModel.backgroundChild : beduinModel, (i12 & 256) != 0 ? beduinLayeredContainerModel.foregroundChildren : list2);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, 495, null) : transform instanceof BackgroundTransform ? copy$default(this, null, ((BackgroundTransform) transform).getBackground(), null, null, null, null, null, null, null, 509, null) : this;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final List<BeduinAction> component6() {
        return this.actions;
    }

    @Y61.k
    /* renamed from: component7, reason: from getter */
    public final LayeredContainerLayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @Y61.k
    /* renamed from: component8, reason: from getter */
    public final BeduinModel getBackgroundChild() {
        return this.backgroundChild;
    }

    @Y61.l
    public final List<BeduinLayeredContainerChild> component9() {
        return this.foregroundChildren;
    }

    @Y61.k
    public final BeduinLayeredContainerModel copy(@Y61.k String id2, @Y61.l BeduinContainerBackground background, @Y61.l BeduinContainerIndent padding, @Y61.l BeduinContainerIndent margin, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l List<? extends BeduinAction> actions, @Y61.k LayeredContainerLayoutMode layoutMode, @Y61.k BeduinModel backgroundChild, @Y61.l List<BeduinLayeredContainerChild> foregroundChildren) {
        return new BeduinLayeredContainerModel(id2, background, padding, margin, displayingPredicate, actions, layoutMode, backgroundChild, foregroundChildren);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinLayeredContainerModel)) {
            return false;
        }
        BeduinLayeredContainerModel beduinLayeredContainerModel = (BeduinLayeredContainerModel) other;
        return L.f(this.id, beduinLayeredContainerModel.id) && L.f(this.background, beduinLayeredContainerModel.background) && L.f(this.padding, beduinLayeredContainerModel.padding) && L.f(this.margin, beduinLayeredContainerModel.margin) && L.f(this.displayingPredicate, beduinLayeredContainerModel.displayingPredicate) && L.f(this.actions, beduinLayeredContainerModel.actions) && this.layoutMode == beduinLayeredContainerModel.layoutMode && L.f(this.backgroundChild, beduinLayeredContainerModel.backgroundChild) && L.f(this.foregroundChildren, beduinLayeredContainerModel.foregroundChildren);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public List<BeduinModel> flatMap(@Y61.k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        ArrayList arrayList;
        BeduinModel beduinModel = (BeduinModel) C42745f0.G(this.backgroundChild.flatMap(mapper));
        List<BeduinLayeredContainerChild> list = this.foregroundChildren;
        BeduinLayeredContainerModel beduinLayeredContainerModelCopy$default = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (BeduinLayeredContainerChild beduinLayeredContainerChild : list) {
                List<BeduinModel> listFlatMap = beduinLayeredContainerChild.getChild().flatMap(mapper);
                ArrayList arrayList3 = new ArrayList(C42745f0.q(listFlatMap, 10));
                Iterator<T> it = listFlatMap.iterator();
                while (it.hasNext()) {
                    arrayList3.add(BeduinLayeredContainerChild.copy$default(beduinLayeredContainerChild, null, null, (BeduinModel) it.next(), 3, null));
                }
                C42745f0.h(arrayList3, arrayList2);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (beduinModel == null) {
            return C42784z0.f406748b;
        }
        if (beduinModel.equals(this.backgroundChild) && L.f(arrayList, this.foregroundChildren)) {
            beduinLayeredContainerModelCopy$default = this;
        }
        if (beduinLayeredContainerModelCopy$default == null) {
            beduinLayeredContainerModelCopy$default = copy$default(this, null, null, null, null, null, null, null, beduinModel, arrayList, 127, null);
        }
        return (List) mapper.invoke(beduinLayeredContainerModelCopy$default);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public void forEach(@Y61.k Y41.l<? super BeduinModel, Boolean> action) {
        if (action.invoke(this).booleanValue()) {
            return;
        }
        this.backgroundChild.forEach(action);
        List<BeduinLayeredContainerChild> list = this.foregroundChildren;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((BeduinLayeredContainerChild) it.next()).getChild().forEach(action);
            }
        }
    }

    @Y61.l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Y61.l
    public BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Y61.k
    public final BeduinModel getBackgroundChild() {
        return this.backgroundChild;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102397d() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final List<BeduinLayeredContainerChild> getForegroundChildren() {
        return this.foregroundChildren;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @Y61.k
    public final LayeredContainerLayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @Y61.l
    public BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.l
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
        List<BeduinAction> list = this.actions;
        int iHashCode6 = (this.backgroundChild.hashCode() + ((this.layoutMode.hashCode() + ((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        List<BeduinLayeredContainerChild> list2 = this.foregroundChildren;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        return true;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinLayeredContainerModel(id=");
        sb2.append(this.id);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", layoutMode=");
        sb2.append(this.layoutMode);
        sb2.append(", backgroundChild=");
        sb2.append(this.backgroundChild);
        sb2.append(", foregroundChildren=");
        return H.p(sb2, this.foregroundChildren, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
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
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.layoutMode.name());
        parcel.writeParcelable(this.backgroundChild, flags);
        List<BeduinLayeredContainerChild> list2 = this.foregroundChildren;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((BeduinLayeredContainerChild) itA2.next()).writeToParcel(parcel, flags);
        }
    }
}
