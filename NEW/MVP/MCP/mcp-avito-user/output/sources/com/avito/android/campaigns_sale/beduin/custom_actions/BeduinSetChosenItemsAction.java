package com.avito.android.campaigns_sale.beduin.custom_actions;

import Ui.InterfaceC15524c;
import Y61.k;
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

/* compiled from: BeduinSetChosenItemsAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/campaigns_sale/beduin/custom_actions/BeduinSetChosenItemsAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "blockId", "", "", "itemIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/campaigns_sale/beduin/custom_actions/BeduinSetChosenItemsAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBlockId", "Ljava/util/List;", "getItemIds", "Companion", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BeduinSetChosenItemsAction implements BeduinAction {

    @k
    private final String blockId;

    @k
    private final List<Long> itemIds;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinSetChosenItemsAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinSetChosenItemsAction.class;

    @k
    private static final String type = "avitoSalesSetChosenItems";

    /* compiled from: BeduinSetChosenItemsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/beduin/custom_actions/BeduinSetChosenItemsAction$a;", "LUi/c;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.campaigns_sale.beduin.custom_actions.BeduinSetChosenItemsAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinSetChosenItemsAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinSetChosenItemsAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSetChosenItemsAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSetChosenItemsAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSetChosenItemsAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new BeduinSetChosenItemsAction(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSetChosenItemsAction[] newArray(int i12) {
            return new BeduinSetChosenItemsAction[i12];
        }
    }

    public BeduinSetChosenItemsAction(@k String str, @k List<Long> list) {
        this.blockId = str;
        this.itemIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinSetChosenItemsAction copy$default(BeduinSetChosenItemsAction beduinSetChosenItemsAction, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinSetChosenItemsAction.blockId;
        }
        if ((i12 & 2) != 0) {
            list = beduinSetChosenItemsAction.itemIds;
        }
        return beduinSetChosenItemsAction.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getBlockId() {
        return this.blockId;
    }

    @k
    public final List<Long> component2() {
        return this.itemIds;
    }

    @k
    public final BeduinSetChosenItemsAction copy(@k String blockId, @k List<Long> itemIds) {
        return new BeduinSetChosenItemsAction(blockId, itemIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSetChosenItemsAction)) {
            return false;
        }
        BeduinSetChosenItemsAction beduinSetChosenItemsAction = (BeduinSetChosenItemsAction) other;
        return L.f(this.blockId, beduinSetChosenItemsAction.blockId) && L.f(this.itemIds, beduinSetChosenItemsAction.itemIds);
    }

    @k
    public final String getBlockId() {
        return this.blockId;
    }

    @k
    public final List<Long> getItemIds() {
        return this.itemIds;
    }

    public int hashCode() {
        return this.itemIds.hashCode() + (this.blockId.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSetChosenItemsAction(blockId=");
        sb2.append(this.blockId);
        sb2.append(", itemIds=");
        return H.p(sb2, this.itemIds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.blockId);
        Iterator itJ = C0.j(this.itemIds, parcel);
        while (itJ.hasNext()) {
            parcel.writeLong(((Number) itJ.next()).longValue());
        }
    }
}
