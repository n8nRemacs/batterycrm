package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinAuthenticateAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006'"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinAuthenticateAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", SearchParamsConverterKt.SOURCE, "", "onSuccessActions", "onFailureActions", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinAuthenticateAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSource", "Ljava/util/List;", "getOnSuccessActions", "getOnFailureActions", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinAuthenticateAction implements BeduinAction {

    @l
    private final List<BeduinAction> onFailureActions;

    @l
    private final List<BeduinAction> onSuccessActions;

    @l
    private final String source;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinAuthenticateAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinAuthenticateAction.class;

    @Y61.k
    private static final String TYPE = "authenticate";

    @Y61.k
    private static final String type = TYPE;

    /* compiled from: BeduinAuthenticateAction.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinAuthenticateAction$a;", "LUi/c;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinAuthenticateAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinAuthenticateAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinAuthenticateAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinAuthenticateAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinAuthenticateAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinAuthenticateAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinAuthenticateAction.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinAuthenticateAction.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new BeduinAuthenticateAction(string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinAuthenticateAction[] newArray(int i12) {
            return new BeduinAuthenticateAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinAuthenticateAction(@l String str, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2) {
        this.source = str;
        this.onSuccessActions = list;
        this.onFailureActions = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinAuthenticateAction copy$default(BeduinAuthenticateAction beduinAuthenticateAction, String str, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinAuthenticateAction.source;
        }
        if ((i12 & 2) != 0) {
            list = beduinAuthenticateAction.onSuccessActions;
        }
        if ((i12 & 4) != 0) {
            list2 = beduinAuthenticateAction.onFailureActions;
        }
        return beduinAuthenticateAction.copy(str, list, list2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @l
    public final List<BeduinAction> component2() {
        return this.onSuccessActions;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.onFailureActions;
    }

    @Y61.k
    public final BeduinAuthenticateAction copy(@l String source, @l List<? extends BeduinAction> onSuccessActions, @l List<? extends BeduinAction> onFailureActions) {
        return new BeduinAuthenticateAction(source, onSuccessActions, onFailureActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinAuthenticateAction)) {
            return false;
        }
        BeduinAuthenticateAction beduinAuthenticateAction = (BeduinAuthenticateAction) other;
        return L.f(this.source, beduinAuthenticateAction.source) && L.f(this.onSuccessActions, beduinAuthenticateAction.onSuccessActions) && L.f(this.onFailureActions, beduinAuthenticateAction.onFailureActions);
    }

    @l
    public final List<BeduinAction> getOnFailureActions() {
        return this.onFailureActions;
    }

    @l
    public final List<BeduinAction> getOnSuccessActions() {
        return this.onSuccessActions;
    }

    @l
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BeduinAction> list = this.onSuccessActions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onFailureActions;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinAuthenticateAction(source=");
        sb2.append(this.source);
        sb2.append(", onSuccessActions=");
        sb2.append(this.onSuccessActions);
        sb2.append(", onFailureActions=");
        return H.p(sb2, this.onFailureActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.source);
        List<BeduinAction> list = this.onSuccessActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onFailureActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }

    public /* synthetic */ BeduinAuthenticateAction(String str, List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, list, list2);
    }
}
