package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
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

/* compiled from: BeduinRunUntilLimitAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001'B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinRunUntilLimitAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "id", "", "actions", "", "maxLimit", "<init>", "(Ljava/lang/String;Ljava/util/List;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/util/List;I)Lcom/avito/android/beduin/common/action/BeduinRunUntilLimitAction;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getActions", "I", "getMaxLimit", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinRunUntilLimitAction implements BeduinAction {

    @Y61.k
    private final List<BeduinAction> actions;

    @Y61.k
    private final String id;
    private final int maxLimit;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinRunUntilLimitAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinRunUntilLimitAction.class;

    @Y61.k
    private static final String type = "runUntilLimit";

    /* compiled from: BeduinRunUntilLimitAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinRunUntilLimitAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinRunUntilLimitAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinRunUntilLimitAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinRunUntilLimitAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinRunUntilLimitAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinRunUntilLimitAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRunUntilLimitAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinRunUntilLimitAction.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinRunUntilLimitAction(string, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRunUntilLimitAction[] newArray(int i12) {
            return new BeduinRunUntilLimitAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinRunUntilLimitAction(@Y61.k String str, @Y61.k List<? extends BeduinAction> list, int i12) {
        this.id = str;
        this.actions = list;
        this.maxLimit = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinRunUntilLimitAction copy$default(BeduinRunUntilLimitAction beduinRunUntilLimitAction, String str, List list, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = beduinRunUntilLimitAction.id;
        }
        if ((i13 & 2) != 0) {
            list = beduinRunUntilLimitAction.actions;
        }
        if ((i13 & 4) != 0) {
            i12 = beduinRunUntilLimitAction.maxLimit;
        }
        return beduinRunUntilLimitAction.copy(str, list, i12);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public final List<BeduinAction> component2() {
        return this.actions;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxLimit() {
        return this.maxLimit;
    }

    @Y61.k
    public final BeduinRunUntilLimitAction copy(@Y61.k String id2, @Y61.k List<? extends BeduinAction> actions, int maxLimit) {
        return new BeduinRunUntilLimitAction(id2, actions, maxLimit);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRunUntilLimitAction)) {
            return false;
        }
        BeduinRunUntilLimitAction beduinRunUntilLimitAction = (BeduinRunUntilLimitAction) other;
        return L.f(this.id, beduinRunUntilLimitAction.id) && L.f(this.actions, beduinRunUntilLimitAction.actions) && this.maxLimit == beduinRunUntilLimitAction.maxLimit;
    }

    @Y61.k
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    public final int getMaxLimit() {
        return this.maxLimit;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxLimit) + H.e(this.id.hashCode() * 31, 31, this.actions);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinRunUntilLimitAction(id=");
        sb2.append(this.id);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", maxLimit=");
        return r.t(sb2, this.maxLimit, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeInt(this.maxLimit);
    }
}
