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

/* compiled from: BeduinExecutePeriodicAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u0010¨\u0006."}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "id", "Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction$Timer;", "timer", "", "actions", "onFinishActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction$Timer;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction$Timer;", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction$Timer;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction$Timer;", "getTimer", "Ljava/util/List;", "getActions", "getOnFinishActions", "Companion", "a", "Timer", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinExecutePeriodicAction implements BeduinAction {

    @Y61.k
    private final List<BeduinAction> actions;

    @Y61.k
    private final String id;

    @l
    private final List<BeduinAction> onFinishActions;

    @Y61.k
    private final Timer timer;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinExecutePeriodicAction> CREATOR = new b();

    @Y61.k
    private static final String type = "executePeriodicActions";

    @Y61.k
    private static final Class<BeduinExecutePeriodicAction> action = BeduinExecutePeriodicAction.class;

    /* compiled from: BeduinExecutePeriodicAction.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\n¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction$Timer;", "Landroid/os/Parcelable;", "", "duration", "step", "<init>", "(Ljava/lang/Long;J)V", "component1", "()Ljava/lang/Long;", "component2", "()J", "copy", "(Ljava/lang/Long;J)Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction$Timer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getDuration", "J", "getStep", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Timer implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Timer> CREATOR = new a();

        @l
        private final Long duration;
        private final long step;

        /* compiled from: BeduinExecutePeriodicAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Timer> {
            @Override // android.os.Parcelable.Creator
            public final Timer createFromParcel(Parcel parcel) {
                return new Timer(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Timer[] newArray(int i12) {
                return new Timer[i12];
            }
        }

        public Timer(@l Long l12, long j12) {
            this.duration = l12;
            this.step = j12;
        }

        public static /* synthetic */ Timer copy$default(Timer timer, Long l12, long j12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l12 = timer.duration;
            }
            if ((i12 & 2) != 0) {
                j12 = timer.step;
            }
            return timer.copy(l12, j12);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Long getDuration() {
            return this.duration;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStep() {
            return this.step;
        }

        @Y61.k
        public final Timer copy(@l Long duration, long step) {
            return new Timer(duration, step);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timer)) {
                return false;
            }
            Timer timer = (Timer) other;
            return L.f(this.duration, timer.duration) && this.step == timer.step;
        }

        @l
        public final Long getDuration() {
            return this.duration;
        }

        public final long getStep() {
            return this.step;
        }

        public int hashCode() {
            Long l12 = this.duration;
            return Long.hashCode(this.step) + ((l12 == null ? 0 : l12.hashCode()) * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Timer(duration=");
            sb2.append(this.duration);
            sb2.append(", step=");
            return r.u(sb2, this.step, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            Long l12 = this.duration;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeLong(this.step);
        }
    }

    /* compiled from: BeduinExecutePeriodicAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinExecutePeriodicAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinExecutePeriodicAction> getAction() {
            return BeduinExecutePeriodicAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinExecutePeriodicAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinExecutePeriodicAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinExecutePeriodicAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinExecutePeriodicAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            Timer timerCreateFromParcel = Timer.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iL2 = 0;
            int iL3 = 0;
            while (iL3 != i12) {
                iL3 = com.avito.android.actions_sheet.a.l(BeduinExecutePeriodicAction.class, parcel, arrayList2, iL3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinExecutePeriodicAction.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            return new BeduinExecutePeriodicAction(string, timerCreateFromParcel, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinExecutePeriodicAction[] newArray(int i12) {
            return new BeduinExecutePeriodicAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinExecutePeriodicAction(@Y61.k String str, @Y61.k Timer timer, @Y61.k List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2) {
        this.id = str;
        this.timer = timer;
        this.actions = list;
        this.onFinishActions = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinExecutePeriodicAction copy$default(BeduinExecutePeriodicAction beduinExecutePeriodicAction, String str, Timer timer, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinExecutePeriodicAction.id;
        }
        if ((i12 & 2) != 0) {
            timer = beduinExecutePeriodicAction.timer;
        }
        if ((i12 & 4) != 0) {
            list = beduinExecutePeriodicAction.actions;
        }
        if ((i12 & 8) != 0) {
            list2 = beduinExecutePeriodicAction.onFinishActions;
        }
        return beduinExecutePeriodicAction.copy(str, timer, list, list2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @Y61.k
    public final List<BeduinAction> component3() {
        return this.actions;
    }

    @l
    public final List<BeduinAction> component4() {
        return this.onFinishActions;
    }

    @Y61.k
    public final BeduinExecutePeriodicAction copy(@Y61.k String id2, @Y61.k Timer timer, @Y61.k List<? extends BeduinAction> actions, @l List<? extends BeduinAction> onFinishActions) {
        return new BeduinExecutePeriodicAction(id2, timer, actions, onFinishActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinExecutePeriodicAction)) {
            return false;
        }
        BeduinExecutePeriodicAction beduinExecutePeriodicAction = (BeduinExecutePeriodicAction) other;
        return L.f(this.id, beduinExecutePeriodicAction.id) && L.f(this.timer, beduinExecutePeriodicAction.timer) && L.f(this.actions, beduinExecutePeriodicAction.actions) && L.f(this.onFinishActions, beduinExecutePeriodicAction.onFinishActions);
    }

    @Y61.k
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Y61.k
    public final String getId() {
        return this.id;
    }

    @l
    public final List<BeduinAction> getOnFinishActions() {
        return this.onFinishActions;
    }

    @Y61.k
    public final Timer getTimer() {
        return this.timer;
    }

    public int hashCode() {
        int iE2 = H.e((this.timer.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.actions);
        List<BeduinAction> list = this.onFinishActions;
        return iE2 + (list == null ? 0 : list.hashCode());
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinExecutePeriodicAction(id=");
        sb2.append(this.id);
        sb2.append(", timer=");
        sb2.append(this.timer);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", onFinishActions=");
        return H.p(sb2, this.onFinishActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        this.timer.writeToParcel(parcel, flags);
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        List<BeduinAction> list = this.onFinishActions;
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
