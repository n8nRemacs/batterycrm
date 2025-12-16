package com.avito.android.map_core.beduin;

import K51.d;
import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinDeliveryMethodSelectTabAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinDeliveryMethodSelectTabAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "tabId", "", "onTabSelectionActions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/map_core/beduin/BeduinDeliveryMethodSelectTabAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTabId", "Ljava/util/List;", "getOnTabSelectionActions", "Companion", "a", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BeduinDeliveryMethodSelectTabAction implements BeduinAction {

    @l
    private final List<BeduinAction> onTabSelectionActions;

    @k
    private final String tabId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinDeliveryMethodSelectTabAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinDeliveryMethodSelectTabAction.class;

    @k
    private static final String type = "deliveryMethodSelectTab";

    /* compiled from: BeduinDeliveryMethodSelectTabAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinDeliveryMethodSelectTabAction$a;", "LUi/c;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinDeliveryMethodSelectTabAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinDeliveryMethodSelectTabAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinDeliveryMethodSelectTabAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinDeliveryMethodSelectTabAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinDeliveryMethodSelectTabAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(BeduinDeliveryMethodSelectTabAction.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinDeliveryMethodSelectTabAction(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinDeliveryMethodSelectTabAction[] newArray(int i12) {
            return new BeduinDeliveryMethodSelectTabAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinDeliveryMethodSelectTabAction(@k String str, @l List<? extends BeduinAction> list) {
        this.tabId = str;
        this.onTabSelectionActions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinDeliveryMethodSelectTabAction copy$default(BeduinDeliveryMethodSelectTabAction beduinDeliveryMethodSelectTabAction, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinDeliveryMethodSelectTabAction.tabId;
        }
        if ((i12 & 2) != 0) {
            list = beduinDeliveryMethodSelectTabAction.onTabSelectionActions;
        }
        return beduinDeliveryMethodSelectTabAction.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTabId() {
        return this.tabId;
    }

    @l
    public final List<BeduinAction> component2() {
        return this.onTabSelectionActions;
    }

    @k
    public final BeduinDeliveryMethodSelectTabAction copy(@k String tabId, @l List<? extends BeduinAction> onTabSelectionActions) {
        return new BeduinDeliveryMethodSelectTabAction(tabId, onTabSelectionActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinDeliveryMethodSelectTabAction)) {
            return false;
        }
        BeduinDeliveryMethodSelectTabAction beduinDeliveryMethodSelectTabAction = (BeduinDeliveryMethodSelectTabAction) other;
        return L.f(this.tabId, beduinDeliveryMethodSelectTabAction.tabId) && L.f(this.onTabSelectionActions, beduinDeliveryMethodSelectTabAction.onTabSelectionActions);
    }

    @l
    public final List<BeduinAction> getOnTabSelectionActions() {
        return this.onTabSelectionActions;
    }

    @k
    public final String getTabId() {
        return this.tabId;
    }

    public int hashCode() {
        int iHashCode = this.tabId.hashCode() * 31;
        List<BeduinAction> list = this.onTabSelectionActions;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinDeliveryMethodSelectTabAction(tabId=");
        sb2.append(this.tabId);
        sb2.append(", onTabSelectionActions=");
        return H.p(sb2, this.onTabSelectionActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.tabId);
        List<BeduinAction> list = this.onTabSelectionActions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
