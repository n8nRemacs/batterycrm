package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTriggerActionsAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTriggerActionsAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "modelId", "targetFormId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinTriggerActionsAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getModelId", "getTargetFormId", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTriggerActionsAction implements BeduinAction, Ui.e {

    @Y61.k
    private final String modelId;

    @Y61.k
    private final String targetFormId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinTriggerActionsAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinTriggerActionsAction.class;

    @Y61.k
    private static final String TYPE = "triggerActions";

    @Y61.k
    private static final String type = TYPE;

    /* compiled from: BeduinTriggerActionsAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinTriggerActionsAction$a;", "LUi/c;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinTriggerActionsAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinTriggerActionsAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinTriggerActionsAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinTriggerActionsAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinTriggerActionsAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTriggerActionsAction createFromParcel(Parcel parcel) {
            return new BeduinTriggerActionsAction(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTriggerActionsAction[] newArray(int i12) {
            return new BeduinTriggerActionsAction[i12];
        }
    }

    public BeduinTriggerActionsAction(@Y61.k String str, @Y61.k String str2) {
        this.modelId = str;
        this.targetFormId = str2;
    }

    public static /* synthetic */ BeduinTriggerActionsAction copy$default(BeduinTriggerActionsAction beduinTriggerActionsAction, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinTriggerActionsAction.modelId;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinTriggerActionsAction.targetFormId;
        }
        return beduinTriggerActionsAction.copy(str, str2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @Y61.k
    public final BeduinTriggerActionsAction copy(@Y61.k String modelId, @Y61.k String targetFormId) {
        return new BeduinTriggerActionsAction(modelId, targetFormId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTriggerActionsAction)) {
            return false;
        }
        BeduinTriggerActionsAction beduinTriggerActionsAction = (BeduinTriggerActionsAction) other;
        return L.f(this.modelId, beduinTriggerActionsAction.modelId) && L.f(this.targetFormId, beduinTriggerActionsAction.targetFormId);
    }

    @Y61.k
    public final String getModelId() {
        return this.modelId;
    }

    @Y61.k
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    public int hashCode() {
        return this.targetFormId.hashCode() + (this.modelId.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinTriggerActionsAction(modelId=");
        sb2.append(this.modelId);
        sb2.append(", targetFormId=");
        return C22026a.c(sb2, this.targetFormId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.modelId);
        parcel.writeString(this.targetFormId);
    }
}
