package com.avito.android.beduin.common.component.grid_layout;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.ChildrenAppendTransform;
import com.avito.android.beduin.common.form.transforms.ChildrenUpdateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinGridLayoutModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001LBu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010\u0016J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b*\u0010\u0016J\u0092\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010.\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b5\u0010/J \u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b@\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bA\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bB\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bE\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010(R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010\u0016R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bJ\u0010\u0016¨\u0006M"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_layout/BeduinGridLayoutModel;", "Lcom/avito/android/beduin/common/container/BeduinSingleChildOwnerModel;", "Lcom/avito/android/beduin/common/component/d;", "", "id", "", "narrowScreenColumnCount", "wideScreenColumnCount", "horizontalInterItemSpacing", "verticalInterItemSpacing", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "rowPadding", "rowMargin", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "rows", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;)V", "getInlinedModels", "()Ljava/util/List;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "create", "(Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component7", "component8", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/component/grid_layout/BeduinGridLayoutModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getNarrowScreenColumnCount", "getWideScreenColumnCount", "getHorizontalInterItemSpacing", "getVerticalInterItemSpacing", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getRowPadding", "getRowMargin", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getChildren", "getRows", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinGridLayoutModel extends BeduinSingleChildOwnerModel implements com.avito.android.beduin.common.component.d {

    @l
    private final List<BeduinModel> children;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final Integer horizontalInterItemSpacing;

    @k
    private final String id;

    @l
    private final Integer narrowScreenColumnCount;

    @l
    private final BeduinContainerIndent rowMargin;

    @l
    private final BeduinContainerIndent rowPadding;

    @l
    private final transient List<BeduinModel> rows;

    @l
    private final Integer verticalInterItemSpacing;

    @l
    private final Integer wideScreenColumnCount;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinGridLayoutModel> CREATOR = new b();

    @k
    private static final List<String> types = Collections.singletonList("gridLayout");

    @k
    private static final Class<BeduinGridLayoutModel> model = BeduinGridLayoutModel.class;

    /* compiled from: BeduinGridLayoutModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_layout/BeduinGridLayoutModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.grid_layout.BeduinGridLayoutModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinGridLayoutModel> S() {
            return BeduinGridLayoutModel.model;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinGridLayoutModel.types;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinGridLayoutModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinGridLayoutModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinGridLayoutModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinGridLayoutModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = a.l(BeduinGridLayoutModel.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(BeduinGridLayoutModel.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new BeduinGridLayoutModel(string, numValueOf, numValueOf2, numValueOf3, numValueOf4, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, displayingPredicate, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinGridLayoutModel[] newArray(int i12) {
            return new BeduinGridLayoutModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinGridLayoutModel(@k String str, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l BeduinContainerIndent beduinContainerIndent, @l BeduinContainerIndent beduinContainerIndent2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinModel> list, @l List<? extends BeduinModel> list2) {
        this.id = str;
        this.narrowScreenColumnCount = num;
        this.wideScreenColumnCount = num2;
        this.horizontalInterItemSpacing = num3;
        this.verticalInterItemSpacing = num4;
        this.rowPadding = beduinContainerIndent;
        this.rowMargin = beduinContainerIndent2;
        this.displayingPredicate = displayingPredicate;
        this.children = list;
        this.rows = list2;
    }

    public static /* synthetic */ BeduinGridLayoutModel copy$default(BeduinGridLayoutModel beduinGridLayoutModel, String str, Integer num, Integer num2, Integer num3, Integer num4, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, List list, List list2, int i12, Object obj) {
        return beduinGridLayoutModel.copy((i12 & 1) != 0 ? beduinGridLayoutModel.id : str, (i12 & 2) != 0 ? beduinGridLayoutModel.narrowScreenColumnCount : num, (i12 & 4) != 0 ? beduinGridLayoutModel.wideScreenColumnCount : num2, (i12 & 8) != 0 ? beduinGridLayoutModel.horizontalInterItemSpacing : num3, (i12 & 16) != 0 ? beduinGridLayoutModel.verticalInterItemSpacing : num4, (i12 & 32) != 0 ? beduinGridLayoutModel.rowPadding : beduinContainerIndent, (i12 & 64) != 0 ? beduinGridLayoutModel.rowMargin : beduinContainerIndent2, (i12 & 128) != 0 ? beduinGridLayoutModel.displayingPredicate : displayingPredicate, (i12 & 256) != 0 ? beduinGridLayoutModel.children : list, (i12 & 512) != 0 ? beduinGridLayoutModel.rows : list2);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        if (transform instanceof ChildrenUpdateTransform) {
            return copy$default(this, null, null, null, null, null, null, null, null, ((ChildrenUpdateTransform) transform).getChildren(), null, 767, null);
        }
        if (!(transform instanceof ChildrenAppendTransform)) {
            return super.apply(transform);
        }
        List<BeduinModel> children = getChildren();
        if (children == null) {
            children = C42784z0.f406748b;
        }
        return copy$default(this, null, null, null, null, null, null, null, null, C42745f0.h0(((ChildrenAppendTransform) transform).getChildren(), children), null, 767, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<BeduinModel> component10() {
        return this.rows;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getNarrowScreenColumnCount() {
        return this.narrowScreenColumnCount;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getWideScreenColumnCount() {
        return this.wideScreenColumnCount;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getHorizontalInterItemSpacing() {
        return this.horizontalInterItemSpacing;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getVerticalInterItemSpacing() {
        return this.verticalInterItemSpacing;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinContainerIndent getRowPadding() {
        return this.rowPadding;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BeduinContainerIndent getRowMargin() {
        return this.rowMargin;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final List<BeduinModel> component9() {
        return this.children;
    }

    @k
    public final BeduinGridLayoutModel copy(@k String id2, @l Integer narrowScreenColumnCount, @l Integer wideScreenColumnCount, @l Integer horizontalInterItemSpacing, @l Integer verticalInterItemSpacing, @l BeduinContainerIndent rowPadding, @l BeduinContainerIndent rowMargin, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinModel> children, @l List<? extends BeduinModel> rows) {
        return new BeduinGridLayoutModel(id2, narrowScreenColumnCount, wideScreenColumnCount, horizontalInterItemSpacing, verticalInterItemSpacing, rowPadding, rowMargin, displayingPredicate, children, rows);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public BeduinModel create(@l List<? extends BeduinModel> children, @l DisplayingPredicate displayingPredicate) {
        return copy$default(this, null, null, null, null, null, null, null, displayingPredicate, children, null, 639, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinGridLayoutModel)) {
            return false;
        }
        BeduinGridLayoutModel beduinGridLayoutModel = (BeduinGridLayoutModel) other;
        return L.f(this.id, beduinGridLayoutModel.id) && L.f(this.narrowScreenColumnCount, beduinGridLayoutModel.narrowScreenColumnCount) && L.f(this.wideScreenColumnCount, beduinGridLayoutModel.wideScreenColumnCount) && L.f(this.horizontalInterItemSpacing, beduinGridLayoutModel.horizontalInterItemSpacing) && L.f(this.verticalInterItemSpacing, beduinGridLayoutModel.verticalInterItemSpacing) && L.f(this.rowPadding, beduinGridLayoutModel.rowPadding) && L.f(this.rowMargin, beduinGridLayoutModel.rowMargin) && L.f(this.displayingPredicate, beduinGridLayoutModel.displayingPredicate) && L.f(this.children, beduinGridLayoutModel.children) && L.f(this.rows, beduinGridLayoutModel.rows);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @l
    public List<BeduinModel> getChildren() {
        return this.children;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @l
    public final Integer getHorizontalInterItemSpacing() {
        return this.horizontalInterItemSpacing;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @Override // com.avito.android.beduin.common.component.d
    @k
    public List<BeduinModel> getInlinedModels() {
        List<BeduinModel> list = this.rows;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    public final Integer getNarrowScreenColumnCount() {
        return this.narrowScreenColumnCount;
    }

    @l
    public final BeduinContainerIndent getRowMargin() {
        return this.rowMargin;
    }

    @l
    public final BeduinContainerIndent getRowPadding() {
        return this.rowPadding;
    }

    @l
    public final List<BeduinModel> getRows() {
        return this.rows;
    }

    @l
    public final Integer getVerticalInterItemSpacing() {
        return this.verticalInterItemSpacing;
    }

    @l
    public final Integer getWideScreenColumnCount() {
        return this.wideScreenColumnCount;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Integer num = this.narrowScreenColumnCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.wideScreenColumnCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.horizontalInterItemSpacing;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.verticalInterItemSpacing;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.rowPadding;
        int iHashCode6 = (iHashCode5 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent2 = this.rowMargin;
        int iHashCode7 = (iHashCode6 + (beduinContainerIndent2 == null ? 0 : beduinContainerIndent2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode8 = (iHashCode7 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinModel> list = this.children;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinModel> list2 = this.rows;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinGridLayoutModel(id=");
        sb2.append(this.id);
        sb2.append(", narrowScreenColumnCount=");
        sb2.append(this.narrowScreenColumnCount);
        sb2.append(", wideScreenColumnCount=");
        sb2.append(this.wideScreenColumnCount);
        sb2.append(", horizontalInterItemSpacing=");
        sb2.append(this.horizontalInterItemSpacing);
        sb2.append(", verticalInterItemSpacing=");
        sb2.append(this.verticalInterItemSpacing);
        sb2.append(", rowPadding=");
        sb2.append(this.rowPadding);
        sb2.append(", rowMargin=");
        sb2.append(this.rowMargin);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", children=");
        sb2.append(this.children);
        sb2.append(", rows=");
        return H.p(sb2, this.rows, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Integer num = this.narrowScreenColumnCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.wideScreenColumnCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.horizontalInterItemSpacing;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        Integer num4 = this.verticalInterItemSpacing;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num4);
        }
        BeduinContainerIndent beduinContainerIndent = this.rowPadding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent2 = this.rowMargin;
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
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinModel> list2 = this.rows;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }
}
