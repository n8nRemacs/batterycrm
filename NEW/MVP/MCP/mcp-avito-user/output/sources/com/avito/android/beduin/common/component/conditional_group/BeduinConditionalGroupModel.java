package com.avito.android.beduin.common.component.conditional_group;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.c;
import com.avito.android.beduin.common.component.conditional_group.component.Condition;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.ConditionTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinConditionalGroupModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0001DBA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00070\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00120\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(JT\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010!J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020,HÖ\u0001¢\u0006\u0004\b2\u0010.J \u00106\u001a\u00020\u00142\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020,HÖ\u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010#R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010%R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b>\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010(R\u0014\u0010A\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/BeduinConditionalGroupModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin/common/component/c;", "", "id", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "condition", "", "whenTrueChildren", "whenFalseChildren", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lkotlin/Function1;", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "resolveChildren", "(Ljava/util/Map;)Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/conditional_group/BeduinConditionalGroupModel;", "toString", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "getCondition", "Ljava/util/List;", "getWhenTrueChildren", "getWhenFalseChildren", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "isValid", "()Z", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes11.dex */
public final /* data */ class BeduinConditionalGroupModel implements BeduinModel, c {

    @k
    private final Condition condition;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final List<BeduinModel> whenFalseChildren;

    @l
    private final List<BeduinModel> whenTrueChildren;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinConditionalGroupModel> CREATOR = new b();

    @k
    private static final List<String> types = Collections.singletonList("conditionalGroup");

    @k
    private static final Class<BeduinConditionalGroupModel> model = BeduinConditionalGroupModel.class;

    /* compiled from: BeduinConditionalGroupModel.kt */
    @com.avito.android.beduin.common.component.l
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/BeduinConditionalGroupModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.conditional_group.BeduinConditionalGroupModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinConditionalGroupModel> S() {
            return BeduinConditionalGroupModel.model;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinConditionalGroupModel.types;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinConditionalGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinConditionalGroupModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinConditionalGroupModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            Condition condition = (Condition) parcel.readParcelable(BeduinConditionalGroupModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = a.l(BeduinConditionalGroupModel.class, parcel, arrayList3, iL3, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = a.l(BeduinConditionalGroupModel.class, parcel, arrayList4, iL2, 1);
                }
                arrayList2 = arrayList4;
            }
            return new BeduinConditionalGroupModel(string, condition, arrayList, arrayList2, (DisplayingPredicate) parcel.readParcelable(BeduinConditionalGroupModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinConditionalGroupModel[] newArray(int i12) {
            return new BeduinConditionalGroupModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinConditionalGroupModel(@k String str, @k Condition condition, @l List<? extends BeduinModel> list, @l List<? extends BeduinModel> list2, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.condition = condition;
        this.whenTrueChildren = list;
        this.whenFalseChildren = list2;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinConditionalGroupModel copy$default(BeduinConditionalGroupModel beduinConditionalGroupModel, String str, Condition condition, List list, List list2, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinConditionalGroupModel.id;
        }
        if ((i12 & 2) != 0) {
            condition = beduinConditionalGroupModel.condition;
        }
        Condition condition2 = condition;
        if ((i12 & 4) != 0) {
            list = beduinConditionalGroupModel.whenTrueChildren;
        }
        List list3 = list;
        if ((i12 & 8) != 0) {
            list2 = beduinConditionalGroupModel.whenFalseChildren;
        }
        List list4 = list2;
        if ((i12 & 16) != 0) {
            displayingPredicate = beduinConditionalGroupModel.displayingPredicate;
        }
        return beduinConditionalGroupModel.copy(str, condition2, list3, list4, displayingPredicate);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 15, null) : transform instanceof ConditionTransform ? copy$default(this, null, ((ConditionTransform) transform).getCondition(), null, null, null, 29, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Condition getCondition() {
        return this.condition;
    }

    @l
    public final List<BeduinModel> component3() {
        return this.whenTrueChildren;
    }

    @l
    public final List<BeduinModel> component4() {
        return this.whenFalseChildren;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinConditionalGroupModel copy(@k String id2, @k Condition condition, @l List<? extends BeduinModel> whenTrueChildren, @l List<? extends BeduinModel> whenFalseChildren, @l DisplayingPredicate displayingPredicate) {
        return new BeduinConditionalGroupModel(id2, condition, whenTrueChildren, whenFalseChildren, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinConditionalGroupModel)) {
            return false;
        }
        BeduinConditionalGroupModel beduinConditionalGroupModel = (BeduinConditionalGroupModel) other;
        return L.f(this.id, beduinConditionalGroupModel.id) && L.f(this.condition, beduinConditionalGroupModel.condition) && L.f(this.whenTrueChildren, beduinConditionalGroupModel.whenTrueChildren) && L.f(this.whenFalseChildren, beduinConditionalGroupModel.whenFalseChildren) && L.f(this.displayingPredicate, beduinConditionalGroupModel.displayingPredicate);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public List<BeduinModel> flatMap(@k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        List<BeduinModel> list = this.whenTrueChildren;
        BeduinConditionalGroupModel beduinConditionalGroupModelCopy$default = null;
        ArrayList arrayListC = list != null ? C28809e.c(mapper, list) : null;
        List<BeduinModel> list2 = this.whenFalseChildren;
        ArrayList arrayListC2 = list2 != null ? C28809e.c(mapper, list2) : null;
        if (L.f(arrayListC, this.whenTrueChildren) && L.f(arrayListC2, this.whenFalseChildren)) {
            beduinConditionalGroupModelCopy$default = this;
        }
        if (beduinConditionalGroupModelCopy$default == null) {
            beduinConditionalGroupModelCopy$default = copy$default(this, null, null, arrayListC, arrayListC2, null, 19, null);
        }
        return (List) mapper.invoke(beduinConditionalGroupModelCopy$default);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public void forEach(@k Y41.l<? super BeduinModel, Boolean> action) {
        if (action.invoke(this).booleanValue()) {
            return;
        }
        List<BeduinModel> list = this.whenTrueChildren;
        if (list != null) {
            C28809e.e(action, list);
        }
        List<BeduinModel> list2 = this.whenFalseChildren;
        if (list2 != null) {
            C28809e.e(action, list2);
        }
    }

    @k
    public final Condition getCondition() {
        return this.condition;
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

    @l
    public final List<BeduinModel> getWhenFalseChildren() {
        return this.whenFalseChildren;
    }

    @l
    public final List<BeduinModel> getWhenTrueChildren() {
        return this.whenTrueChildren;
    }

    public int hashCode() {
        int iHashCode = (this.condition.hashCode() + (this.id.hashCode() * 31)) * 31;
        List<BeduinModel> list = this.whenTrueChildren;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinModel> list2 = this.whenFalseChildren;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode3 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        List<BeduinModel> list = this.whenTrueChildren;
        if (list != null) {
            List<BeduinModel> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((BeduinModel) it.next()).isValid()) {
                        List<BeduinModel> list3 = this.whenFalseChildren;
                        if (list3 != null) {
                            List<BeduinModel> list4 = list3;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator<T> it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    if (!((BeduinModel) it2.next()).isValid()) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // com.avito.android.beduin.common.component.c
    @l
    public List<BeduinModel> resolveChildren(@k Map<String, ? extends Object> parameters) {
        return this.condition.check(parameters) ? this.whenTrueChildren : this.whenFalseChildren;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinConditionalGroupModel(id=");
        sb2.append(this.id);
        sb2.append(", condition=");
        sb2.append(this.condition);
        sb2.append(", whenTrueChildren=");
        sb2.append(this.whenTrueChildren);
        sb2.append(", whenFalseChildren=");
        sb2.append(this.whenFalseChildren);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.condition, flags);
        List<BeduinModel> list = this.whenTrueChildren;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinModel> list2 = this.whenFalseChildren;
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
