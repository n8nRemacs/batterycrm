package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinValidateFormsAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001-BQ\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJd\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\rR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b*\u0010\rR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b+\u0010\r¨\u0006."}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinValidateFormsAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "", "formIds", "modelIds", "", "showValidationErrors", "onValidActions", "onInvalidActions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinValidateFormsAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getFormIds", "getModelIds", "Ljava/lang/Boolean;", "getShowValidationErrors", "getOnValidActions", "getOnInvalidActions", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinValidateFormsAction implements BeduinAction {

    @l
    private final List<String> formIds;

    @l
    private final List<String> modelIds;

    @l
    private final List<BeduinAction> onInvalidActions;

    @l
    private final List<BeduinAction> onValidActions;

    @l
    private final Boolean showValidationErrors;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinValidateFormsAction> CREATOR = new b();

    @Y61.k
    private static final String type = "validateForms";

    @Y61.k
    private static final Class<BeduinValidateFormsAction> action = BeduinValidateFormsAction.class;

    /* compiled from: BeduinValidateFormsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinValidateFormsAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinValidateFormsAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinValidateFormsAction> getAction() {
            return BeduinValidateFormsAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinValidateFormsAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinValidateFormsAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinValidateFormsAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinValidateFormsAction createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinValidateFormsAction.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinValidateFormsAction.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new BeduinValidateFormsAction(arrayListCreateStringArrayList, arrayListCreateStringArrayList2, boolValueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinValidateFormsAction[] newArray(int i12) {
            return new BeduinValidateFormsAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinValidateFormsAction(@l List<String> list, @l List<String> list2, @l Boolean bool, @l List<? extends BeduinAction> list3, @l List<? extends BeduinAction> list4) {
        this.formIds = list;
        this.modelIds = list2;
        this.showValidationErrors = bool;
        this.onValidActions = list3;
        this.onInvalidActions = list4;
    }

    public static /* synthetic */ BeduinValidateFormsAction copy$default(BeduinValidateFormsAction beduinValidateFormsAction, List list, List list2, Boolean bool, List list3, List list4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinValidateFormsAction.formIds;
        }
        if ((i12 & 2) != 0) {
            list2 = beduinValidateFormsAction.modelIds;
        }
        List list5 = list2;
        if ((i12 & 4) != 0) {
            bool = beduinValidateFormsAction.showValidationErrors;
        }
        Boolean bool2 = bool;
        if ((i12 & 8) != 0) {
            list3 = beduinValidateFormsAction.onValidActions;
        }
        List list6 = list3;
        if ((i12 & 16) != 0) {
            list4 = beduinValidateFormsAction.onInvalidActions;
        }
        return beduinValidateFormsAction.copy(list, list5, bool2, list6, list4);
    }

    @l
    public final List<String> component1() {
        return this.formIds;
    }

    @l
    public final List<String> component2() {
        return this.modelIds;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getShowValidationErrors() {
        return this.showValidationErrors;
    }

    @l
    public final List<BeduinAction> component4() {
        return this.onValidActions;
    }

    @l
    public final List<BeduinAction> component5() {
        return this.onInvalidActions;
    }

    @Y61.k
    public final BeduinValidateFormsAction copy(@l List<String> formIds, @l List<String> modelIds, @l Boolean showValidationErrors, @l List<? extends BeduinAction> onValidActions, @l List<? extends BeduinAction> onInvalidActions) {
        return new BeduinValidateFormsAction(formIds, modelIds, showValidationErrors, onValidActions, onInvalidActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinValidateFormsAction)) {
            return false;
        }
        BeduinValidateFormsAction beduinValidateFormsAction = (BeduinValidateFormsAction) other;
        return L.f(this.formIds, beduinValidateFormsAction.formIds) && L.f(this.modelIds, beduinValidateFormsAction.modelIds) && L.f(this.showValidationErrors, beduinValidateFormsAction.showValidationErrors) && L.f(this.onValidActions, beduinValidateFormsAction.onValidActions) && L.f(this.onInvalidActions, beduinValidateFormsAction.onInvalidActions);
    }

    @l
    public final List<String> getFormIds() {
        return this.formIds;
    }

    @l
    public final List<String> getModelIds() {
        return this.modelIds;
    }

    @l
    public final List<BeduinAction> getOnInvalidActions() {
        return this.onInvalidActions;
    }

    @l
    public final List<BeduinAction> getOnValidActions() {
        return this.onValidActions;
    }

    @l
    public final Boolean getShowValidationErrors() {
        return this.showValidationErrors;
    }

    public int hashCode() {
        List<String> list = this.formIds;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.modelIds;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.showValidationErrors;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BeduinAction> list3 = this.onValidActions;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BeduinAction> list4 = this.onInvalidActions;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinValidateFormsAction(formIds=");
        sb2.append(this.formIds);
        sb2.append(", modelIds=");
        sb2.append(this.modelIds);
        sb2.append(", showValidationErrors=");
        sb2.append(this.showValidationErrors);
        sb2.append(", onValidActions=");
        sb2.append(this.onValidActions);
        sb2.append(", onInvalidActions=");
        return H.p(sb2, this.onInvalidActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeStringList(this.formIds);
        parcel.writeStringList(this.modelIds);
        Boolean bool = this.showValidationErrors;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<BeduinAction> list = this.onValidActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onInvalidActions;
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
