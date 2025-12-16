package com.avito.android.beduin_shared.common.action;

import K51.d;
import Ui.InterfaceC15524c;
import Ui.e;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSendActionsToFormAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001$B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/beduin_shared/common/action/BeduinSendActionsToFormAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "formId", "", "actions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin_shared/common/action/BeduinSendActionsToFormAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormId", "Ljava/util/List;", "getActions", "Companion", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSendActionsToFormAction implements BeduinAction, e {

    @k
    private final List<BeduinAction> actions;

    @k
    private final String formId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinSendActionsToFormAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinSendActionsToFormAction.class;

    @k
    private static final String TYPE = "sendActionsToForm";

    @k
    private static final String type = TYPE;

    /* compiled from: BeduinSendActionsToFormAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin_shared/common/action/BeduinSendActionsToFormAction$a;", "LUi/c;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_shared.common.action.BeduinSendActionsToFormAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinSendActionsToFormAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinSendActionsToFormAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSendActionsToFormAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSendActionsToFormAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSendActionsToFormAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(BeduinSendActionsToFormAction.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinSendActionsToFormAction(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSendActionsToFormAction[] newArray(int i12) {
            return new BeduinSendActionsToFormAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSendActionsToFormAction(@k String str, @k List<? extends BeduinAction> list) {
        this.formId = str;
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinSendActionsToFormAction copy$default(BeduinSendActionsToFormAction beduinSendActionsToFormAction, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinSendActionsToFormAction.formId;
        }
        if ((i12 & 2) != 0) {
            list = beduinSendActionsToFormAction.actions;
        }
        return beduinSendActionsToFormAction.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    @k
    public final List<BeduinAction> component2() {
        return this.actions;
    }

    @k
    public final BeduinSendActionsToFormAction copy(@k String formId, @k List<? extends BeduinAction> actions) {
        return new BeduinSendActionsToFormAction(formId, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSendActionsToFormAction)) {
            return false;
        }
        BeduinSendActionsToFormAction beduinSendActionsToFormAction = (BeduinSendActionsToFormAction) other;
        return L.f(this.formId, beduinSendActionsToFormAction.formId) && L.f(this.actions, beduinSendActionsToFormAction.actions);
    }

    @k
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @k
    public final String getFormId() {
        return this.formId;
    }

    public int hashCode() {
        return this.actions.hashCode() + (this.formId.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSendActionsToFormAction(formId=");
        sb2.append(this.formId);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.formId);
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }
}
