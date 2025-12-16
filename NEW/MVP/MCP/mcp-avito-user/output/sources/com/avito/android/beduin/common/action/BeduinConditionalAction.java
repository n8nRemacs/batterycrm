package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.conditional_group.component.Condition;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinConditionalAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001(B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\f¨\u0006)"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinConditionalAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "condition", "", "whenTrueActions", "whenFalseActions", "<init>", "(Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinConditionalAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "getCondition", "Ljava/util/List;", "getWhenTrueActions", "getWhenFalseActions", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinConditionalAction implements BeduinAction {

    @Y61.k
    private final Condition condition;

    @l
    private final List<BeduinAction> whenFalseActions;

    @l
    private final List<BeduinAction> whenTrueActions;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinConditionalAction> CREATOR = new b();

    @Y61.k
    private static final String type = "conditional";

    @Y61.k
    private static final Class<BeduinConditionalAction> action = BeduinConditionalAction.class;

    /* compiled from: BeduinConditionalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinConditionalAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinConditionalAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinConditionalAction> getAction() {
            return BeduinConditionalAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinConditionalAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinConditionalAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinConditionalAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinConditionalAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Condition condition = (Condition) parcel.readParcelable(BeduinConditionalAction.class.getClassLoader());
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinConditionalAction.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinConditionalAction.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new BeduinConditionalAction(condition, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinConditionalAction[] newArray(int i12) {
            return new BeduinConditionalAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinConditionalAction(@Y61.k Condition condition, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2) {
        this.condition = condition;
        this.whenTrueActions = list;
        this.whenFalseActions = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinConditionalAction copy$default(BeduinConditionalAction beduinConditionalAction, Condition condition, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            condition = beduinConditionalAction.condition;
        }
        if ((i12 & 2) != 0) {
            list = beduinConditionalAction.whenTrueActions;
        }
        if ((i12 & 4) != 0) {
            list2 = beduinConditionalAction.whenFalseActions;
        }
        return beduinConditionalAction.copy(condition, list, list2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final Condition getCondition() {
        return this.condition;
    }

    @l
    public final List<BeduinAction> component2() {
        return this.whenTrueActions;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.whenFalseActions;
    }

    @Y61.k
    public final BeduinConditionalAction copy(@Y61.k Condition condition, @l List<? extends BeduinAction> whenTrueActions, @l List<? extends BeduinAction> whenFalseActions) {
        return new BeduinConditionalAction(condition, whenTrueActions, whenFalseActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinConditionalAction)) {
            return false;
        }
        BeduinConditionalAction beduinConditionalAction = (BeduinConditionalAction) other;
        return L.f(this.condition, beduinConditionalAction.condition) && L.f(this.whenTrueActions, beduinConditionalAction.whenTrueActions) && L.f(this.whenFalseActions, beduinConditionalAction.whenFalseActions);
    }

    @Y61.k
    public final Condition getCondition() {
        return this.condition;
    }

    @l
    public final List<BeduinAction> getWhenFalseActions() {
        return this.whenFalseActions;
    }

    @l
    public final List<BeduinAction> getWhenTrueActions() {
        return this.whenTrueActions;
    }

    public int hashCode() {
        int iHashCode = this.condition.hashCode() * 31;
        List<BeduinAction> list = this.whenTrueActions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.whenFalseActions;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinConditionalAction(condition=");
        sb2.append(this.condition);
        sb2.append(", whenTrueActions=");
        sb2.append(this.whenTrueActions);
        sb2.append(", whenFalseActions=");
        return H.p(sb2, this.whenFalseActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeParcelable(this.condition, flags);
        List<BeduinAction> list = this.whenTrueActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.whenFalseActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }
}
