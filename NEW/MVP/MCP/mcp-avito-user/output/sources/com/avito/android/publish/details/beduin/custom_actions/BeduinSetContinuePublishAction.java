package com.avito.android.publish.details.beduin.custom_actions;

import K51.d;
import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSetContinuePublishAction.kt */
@P
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007¨\u0006!"}, d2 = {"Lcom/avito/android/publish/details/beduin/custom_actions/BeduinSetContinuePublishAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction;", "action", "<init>", "(Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction;)V", "component1", "()Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction;", "copy", "(Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction;)Lcom/avito/android/publish/details/beduin/custom_actions/BeduinSetContinuePublishAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "action$1", "Lcom/avito/android/publish/details/beduin/custom_actions/ContinuePublishAction;", "getAction", "Companion", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes16.dex */
public final /* data */ class BeduinSetContinuePublishAction implements BeduinAction {

    /* renamed from: action$1, reason: from kotlin metadata */
    @com.google.gson.annotations.c("action")
    @l
    private final ContinuePublishAction action;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<BeduinSetContinuePublishAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinSetContinuePublishAction.class;

    @k
    private static final String type = "setContinuePublishAction";

    /* compiled from: BeduinSetContinuePublishAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/beduin/custom_actions/BeduinSetContinuePublishAction$a;", "LUi/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.details.beduin.custom_actions.BeduinSetContinuePublishAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinSetContinuePublishAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF100007c() {
            return BeduinSetContinuePublishAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSetContinuePublishAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSetContinuePublishAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSetContinuePublishAction createFromParcel(Parcel parcel) {
            return new BeduinSetContinuePublishAction((ContinuePublishAction) parcel.readParcelable(BeduinSetContinuePublishAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSetContinuePublishAction[] newArray(int i12) {
            return new BeduinSetContinuePublishAction[i12];
        }
    }

    public BeduinSetContinuePublishAction(@l ContinuePublishAction continuePublishAction) {
        this.action = continuePublishAction;
    }

    public static /* synthetic */ BeduinSetContinuePublishAction copy$default(BeduinSetContinuePublishAction beduinSetContinuePublishAction, ContinuePublishAction continuePublishAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            continuePublishAction = beduinSetContinuePublishAction.action;
        }
        return beduinSetContinuePublishAction.copy(continuePublishAction);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final ContinuePublishAction getAction() {
        return this.action;
    }

    @k
    public final BeduinSetContinuePublishAction copy(@l ContinuePublishAction action2) {
        return new BeduinSetContinuePublishAction(action2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinSetContinuePublishAction) && L.f(this.action, ((BeduinSetContinuePublishAction) other).action);
    }

    @l
    public final ContinuePublishAction getAction() {
        return this.action;
    }

    public int hashCode() {
        ContinuePublishAction continuePublishAction = this.action;
        if (continuePublishAction == null) {
            return 0;
        }
        return continuePublishAction.hashCode();
    }

    @k
    public String toString() {
        return "BeduinSetContinuePublishAction(action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.action, flags);
    }
}
