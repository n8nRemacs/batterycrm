package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinShowFiltersAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006,"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinShowFiltersAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/remote/model/search/Filter;", "filter", "Lcom/avito/android/beduin/common/action/StateModel;", "stateModel", "", "onFilterSelectedActions", "<init>", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/beduin/common/action/StateModel;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/search/Filter;", "component2", "()Lcom/avito/android/beduin/common/action/StateModel;", "component3", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/beduin/common/action/StateModel;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinShowFiltersAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/search/Filter;", "getFilter", "Lcom/avito/android/beduin/common/action/StateModel;", "getStateModel", "Ljava/util/List;", "getOnFilterSelectedActions", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinShowFiltersAction implements BeduinAction {

    @Y61.k
    private final Filter filter;

    @l
    private final List<BeduinAction> onFilterSelectedActions;

    @Y61.k
    private final StateModel stateModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinShowFiltersAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinShowFiltersAction.class;

    @Y61.k
    private static final String type = "showFilters";

    /* compiled from: BeduinShowFiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinShowFiltersAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinShowFiltersAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinShowFiltersAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinShowFiltersAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinShowFiltersAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinShowFiltersAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinShowFiltersAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Filter filter = (Filter) parcel.readParcelable(BeduinShowFiltersAction.class.getClassLoader());
            StateModel stateModelCreateFromParcel = StateModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinShowFiltersAction.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinShowFiltersAction(filter, stateModelCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinShowFiltersAction[] newArray(int i12) {
            return new BeduinShowFiltersAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinShowFiltersAction(@Y61.k Filter filter, @Y61.k StateModel stateModel, @l List<? extends BeduinAction> list) {
        this.filter = filter;
        this.stateModel = stateModel;
        this.onFilterSelectedActions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinShowFiltersAction copy$default(BeduinShowFiltersAction beduinShowFiltersAction, Filter filter, StateModel stateModel, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            filter = beduinShowFiltersAction.filter;
        }
        if ((i12 & 2) != 0) {
            stateModel = beduinShowFiltersAction.stateModel;
        }
        if ((i12 & 4) != 0) {
            list = beduinShowFiltersAction.onFilterSelectedActions;
        }
        return beduinShowFiltersAction.copy(filter, stateModel, list);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final Filter getFilter() {
        return this.filter;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final StateModel getStateModel() {
        return this.stateModel;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.onFilterSelectedActions;
    }

    @Y61.k
    public final BeduinShowFiltersAction copy(@Y61.k Filter filter, @Y61.k StateModel stateModel, @l List<? extends BeduinAction> onFilterSelectedActions) {
        return new BeduinShowFiltersAction(filter, stateModel, onFilterSelectedActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinShowFiltersAction)) {
            return false;
        }
        BeduinShowFiltersAction beduinShowFiltersAction = (BeduinShowFiltersAction) other;
        return L.f(this.filter, beduinShowFiltersAction.filter) && L.f(this.stateModel, beduinShowFiltersAction.stateModel) && L.f(this.onFilterSelectedActions, beduinShowFiltersAction.onFilterSelectedActions);
    }

    @Y61.k
    public final Filter getFilter() {
        return this.filter;
    }

    @l
    public final List<BeduinAction> getOnFilterSelectedActions() {
        return this.onFilterSelectedActions;
    }

    @Y61.k
    public final StateModel getStateModel() {
        return this.stateModel;
    }

    public int hashCode() {
        int iHashCode = (this.stateModel.hashCode() + (this.filter.hashCode() * 31)) * 31;
        List<BeduinAction> list = this.onFilterSelectedActions;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinShowFiltersAction(filter=");
        sb2.append(this.filter);
        sb2.append(", stateModel=");
        sb2.append(this.stateModel);
        sb2.append(", onFilterSelectedActions=");
        return H.p(sb2, this.onFilterSelectedActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeParcelable(this.filter, flags);
        this.stateModel.writeToParcel(parcel, flags);
        List<BeduinAction> list = this.onFilterSelectedActions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
