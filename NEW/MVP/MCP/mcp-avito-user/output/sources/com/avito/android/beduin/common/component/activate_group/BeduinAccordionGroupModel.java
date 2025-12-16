package com.avito.android.beduin.common.component.activate_group;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ToggleTransform;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinAccordionGroupModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001GBy\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J$\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J$\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0090\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00072\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010 J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020-HÖ\u0001¢\u0006\u0004\b4\u0010/J \u00108\u001a\u00020\u00172\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020-HÖ\u0001¢\u0006\u0004\b8\u00109R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b;\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b\u0006\u0010\"R+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010$R+\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b?\u0010$R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u001bR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bB\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010)R\u0014\u0010E\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\"¨\u0006H"}, d2 = {"Lcom/avito/android/beduin/common/component/activate_group/BeduinAccordionGroupModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin/common/component/d;", "", "id", "", "isExpanded", "", "", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "onExpandTransforms", "onCollapseTransforms", "headerChildren", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lkotlin/Function1;", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "getInlinedModels", "()Ljava/util/List;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/Map;", "component4", "component5", "component6", "component7", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/activate_group/BeduinAccordionGroupModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Z", "Ljava/util/Map;", "getOnExpandTransforms", "getOnCollapseTransforms", "Ljava/util/List;", "getHeaderChildren", "getChildren", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "isValid", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes11.dex */
public final /* data */ class BeduinAccordionGroupModel implements BeduinModel, com.avito.android.beduin.common.component.d {

    @l
    private final List<BeduinModel> children;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final List<BeduinModel> headerChildren;

    @k
    private final String id;
    private final boolean isExpanded;

    @l
    private final Map<String, List<BeduinModelTransform>> onCollapseTransforms;

    @l
    private final Map<String, List<BeduinModelTransform>> onExpandTransforms;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinAccordionGroupModel> CREATOR = new b();

    @k
    private static final List<String> types = Collections.singletonList("accordionGroup");

    @k
    private static final Class<BeduinAccordionGroupModel> model = BeduinAccordionGroupModel.class;

    /* compiled from: BeduinAccordionGroupModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/activate_group/BeduinAccordionGroupModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.activate_group.BeduinAccordionGroupModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinAccordionGroupModel> S() {
            return BeduinAccordionGroupModel.model;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinAccordionGroupModel.types;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinAccordionGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinAccordionGroupModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinAccordionGroupModel createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            ArrayList arrayList;
            String string = parcel.readString();
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    String string2 = parcel.readString();
                    int i14 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i14);
                    int iL3 = 0;
                    while (iL3 != i14) {
                        iL3 = a.l(BeduinAccordionGroupModel.class, parcel, arrayList3, iL3, 1);
                    }
                    linkedHashMap.put(string2, arrayList3);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i15 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    String string3 = parcel.readString();
                    int i17 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i17);
                    int iL4 = 0;
                    while (iL4 != i17) {
                        iL4 = a.l(BeduinAccordionGroupModel.class, parcel, arrayList4, iL4, 1);
                    }
                    linkedHashMap2.put(string3, arrayList4);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i18 = parcel.readInt();
                arrayList = new ArrayList(i18);
                int iL5 = 0;
                while (iL5 != i18) {
                    iL5 = a.l(BeduinAccordionGroupModel.class, parcel, arrayList, iL5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i19 = parcel.readInt();
                arrayList2 = new ArrayList(i19);
                while (iL2 != i19) {
                    iL2 = a.l(BeduinAccordionGroupModel.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new BeduinAccordionGroupModel(string, z12, linkedHashMap, linkedHashMap2, arrayList, arrayList2, (DisplayingPredicate) parcel.readParcelable(BeduinAccordionGroupModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinAccordionGroupModel[] newArray(int i12) {
            return new BeduinAccordionGroupModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinAccordionGroupModel(@k String str, boolean z12, @l Map<String, ? extends List<? extends BeduinModelTransform>> map, @l Map<String, ? extends List<? extends BeduinModelTransform>> map2, @l List<? extends BeduinModel> list, @l List<? extends BeduinModel> list2, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.isExpanded = z12;
        this.onExpandTransforms = map;
        this.onCollapseTransforms = map2;
        this.headerChildren = list;
        this.children = list2;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinAccordionGroupModel copy$default(BeduinAccordionGroupModel beduinAccordionGroupModel, String str, boolean z12, Map map, Map map2, List list, List list2, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinAccordionGroupModel.id;
        }
        if ((i12 & 2) != 0) {
            z12 = beduinAccordionGroupModel.isExpanded;
        }
        boolean z13 = z12;
        if ((i12 & 4) != 0) {
            map = beduinAccordionGroupModel.onExpandTransforms;
        }
        Map map3 = map;
        if ((i12 & 8) != 0) {
            map2 = beduinAccordionGroupModel.onCollapseTransforms;
        }
        Map map4 = map2;
        if ((i12 & 16) != 0) {
            list = beduinAccordionGroupModel.headerChildren;
        }
        List list3 = list;
        if ((i12 & 32) != 0) {
            list2 = beduinAccordionGroupModel.children;
        }
        List list4 = list2;
        if ((i12 & 64) != 0) {
            displayingPredicate = beduinAccordionGroupModel.displayingPredicate;
        }
        return beduinAccordionGroupModel.copy(str, z13, map3, map4, list3, list4, displayingPredicate);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        if (!(transform instanceof ToggleTransform)) {
            return transform instanceof DisplayPredicateTransform ? copy$default(this, null, false, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 63, null) : this;
        }
        Boolean boolIsEnabled = ((ToggleTransform) transform).isEnabled();
        return copy$default(this, null, boolIsEnabled != null ? boolIsEnabled.booleanValue() : !this.isExpanded, null, null, null, null, null, 125, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @l
    public final Map<String, List<BeduinModelTransform>> component3() {
        return this.onExpandTransforms;
    }

    @l
    public final Map<String, List<BeduinModelTransform>> component4() {
        return this.onCollapseTransforms;
    }

    @l
    public final List<BeduinModel> component5() {
        return this.headerChildren;
    }

    @l
    public final List<BeduinModel> component6() {
        return this.children;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinAccordionGroupModel copy(@k String id2, boolean isExpanded, @l Map<String, ? extends List<? extends BeduinModelTransform>> onExpandTransforms, @l Map<String, ? extends List<? extends BeduinModelTransform>> onCollapseTransforms, @l List<? extends BeduinModel> headerChildren, @l List<? extends BeduinModel> children, @l DisplayingPredicate displayingPredicate) {
        return new BeduinAccordionGroupModel(id2, isExpanded, onExpandTransforms, onCollapseTransforms, headerChildren, children, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinAccordionGroupModel)) {
            return false;
        }
        BeduinAccordionGroupModel beduinAccordionGroupModel = (BeduinAccordionGroupModel) other;
        return L.f(this.id, beduinAccordionGroupModel.id) && this.isExpanded == beduinAccordionGroupModel.isExpanded && L.f(this.onExpandTransforms, beduinAccordionGroupModel.onExpandTransforms) && L.f(this.onCollapseTransforms, beduinAccordionGroupModel.onCollapseTransforms) && L.f(this.headerChildren, beduinAccordionGroupModel.headerChildren) && L.f(this.children, beduinAccordionGroupModel.children) && L.f(this.displayingPredicate, beduinAccordionGroupModel.displayingPredicate);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public List<BeduinModel> flatMap(@k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        List<BeduinModel> list = this.headerChildren;
        BeduinAccordionGroupModel beduinAccordionGroupModelCopy$default = null;
        ArrayList arrayListC = list != null ? C28809e.c(mapper, list) : null;
        List<BeduinModel> list2 = this.children;
        ArrayList arrayListC2 = list2 != null ? C28809e.c(mapper, list2) : null;
        if (L.f(arrayListC, this.headerChildren) && L.f(arrayListC2, this.children)) {
            beduinAccordionGroupModelCopy$default = this;
        }
        if (beduinAccordionGroupModelCopy$default == null) {
            beduinAccordionGroupModelCopy$default = copy$default(this, null, false, null, null, arrayListC, arrayListC2, null, 79, null);
        }
        return (List) mapper.invoke(beduinAccordionGroupModelCopy$default);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public void forEach(@k Y41.l<? super BeduinModel, Boolean> action) {
        if (action.invoke(this).booleanValue()) {
            return;
        }
        List<BeduinModel> list = this.headerChildren;
        if (list != null) {
            C28809e.e(action, list);
        }
        List<BeduinModel> list2 = this.children;
        if (list2 != null) {
            C28809e.e(action, list2);
        }
    }

    @l
    public final List<BeduinModel> getChildren() {
        return this.children;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @l
    public final List<BeduinModel> getHeaderChildren() {
        return this.headerChildren;
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
        if (!this.isExpanded) {
            List<BeduinModel> list = this.headerChildren;
            return list == null ? C42784z0.f406748b : list;
        }
        Collection collection = this.headerChildren;
        if (collection == null) {
            collection = C42784z0.f406748b;
        }
        Collection collection2 = collection;
        Iterable iterable = this.children;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        return C42745f0.h0(iterable, collection2);
    }

    @l
    public final Map<String, List<BeduinModelTransform>> getOnCollapseTransforms() {
        return this.onCollapseTransforms;
    }

    @l
    public final Map<String, List<BeduinModelTransform>> getOnExpandTransforms() {
        return this.onExpandTransforms;
    }

    public int hashCode() {
        int i12 = r.i(this.id.hashCode() * 31, 31, this.isExpanded);
        Map<String, List<BeduinModelTransform>> map = this.onExpandTransforms;
        int iHashCode = (i12 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, List<BeduinModelTransform>> map2 = this.onCollapseTransforms;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        List<BeduinModel> list = this.headerChildren;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinModel> list2 = this.children;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode4 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    @Override // com.avito.android.beduin_models.BeduinModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isValid() {
        /*
            r2 = this;
            java.util.List<com.avito.android.beduin_models.BeduinModel> r0 = r2.headerChildren
            if (r0 == 0) goto L2b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L14
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
            goto L2b
        L14:
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            com.avito.android.beduin_models.BeduinModel r1 = (com.avito.android.beduin_models.BeduinModel) r1
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L18
            goto L55
        L2b:
            java.util.List<com.avito.android.beduin_models.BeduinModel> r0 = r2.children
            if (r0 == 0) goto L57
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L3f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3f
            goto L57
        L3f:
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            com.avito.android.beduin_models.BeduinModel r1 = (com.avito.android.beduin_models.BeduinModel) r1
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L43
        L55:
            r0 = 0
            goto L58
        L57:
            r0 = 1
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.activate_group.BeduinAccordionGroupModel.isValid():boolean");
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinAccordionGroupModel(id=");
        sb2.append(this.id);
        sb2.append(", isExpanded=");
        sb2.append(this.isExpanded);
        sb2.append(", onExpandTransforms=");
        sb2.append(this.onExpandTransforms);
        sb2.append(", onCollapseTransforms=");
        sb2.append(this.onCollapseTransforms);
        sb2.append(", headerChildren=");
        sb2.append(this.headerChildren);
        sb2.append(", children=");
        sb2.append(this.children);
        sb2.append(", displayingPredicate=");
        return c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeInt(this.isExpanded ? 1 : 0);
        Map<String, List<BeduinModelTransform>> map = this.onExpandTransforms;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                Iterator itJ = C0.j((List) entry.getValue(), parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), flags);
                }
            }
        }
        Map<String, List<BeduinModelTransform>> map2 = this.onCollapseTransforms;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                parcel.writeString((String) entry2.getKey());
                Iterator itJ2 = C0.j((List) entry2.getValue(), parcel);
                while (itJ2.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ2.next(), flags);
                }
            }
        }
        List<BeduinModel> list = this.headerChildren;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinModel> list2 = this.children;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
    }
}
