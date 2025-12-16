package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinAddComponentsToEndAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinAddComponentsToEndAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "targetFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "models", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinAddComponentsToEndAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTargetFormId", "Ljava/util/List;", "getModels", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinAddComponentsToEndAction implements BeduinAction, Ui.e {

    @Y61.k
    private final List<BeduinModel> models;

    @Y61.k
    private final String targetFormId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinAddComponentsToEndAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinAddComponentsToEndAction.class;

    @Y61.k
    private static final String type = "addComponentsToEnd";

    /* compiled from: BeduinAddComponentsToEndAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinAddComponentsToEndAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinAddComponentsToEndAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinAddComponentsToEndAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinAddComponentsToEndAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinAddComponentsToEndAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinAddComponentsToEndAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinAddComponentsToEndAction createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinAddComponentsToEndAction.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinAddComponentsToEndAction(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinAddComponentsToEndAction[] newArray(int i12) {
            return new BeduinAddComponentsToEndAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinAddComponentsToEndAction(@Y61.k String str, @Y61.k List<? extends BeduinModel> list) {
        this.targetFormId = str;
        this.models = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinAddComponentsToEndAction copy$default(BeduinAddComponentsToEndAction beduinAddComponentsToEndAction, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinAddComponentsToEndAction.targetFormId;
        }
        if ((i12 & 2) != 0) {
            list = beduinAddComponentsToEndAction.models;
        }
        return beduinAddComponentsToEndAction.copy(str, list);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @Y61.k
    public final List<BeduinModel> component2() {
        return this.models;
    }

    @Y61.k
    public final BeduinAddComponentsToEndAction copy(@Y61.k String targetFormId, @Y61.k List<? extends BeduinModel> models) {
        return new BeduinAddComponentsToEndAction(targetFormId, models);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinAddComponentsToEndAction)) {
            return false;
        }
        BeduinAddComponentsToEndAction beduinAddComponentsToEndAction = (BeduinAddComponentsToEndAction) other;
        return L.f(this.targetFormId, beduinAddComponentsToEndAction.targetFormId) && L.f(this.models, beduinAddComponentsToEndAction.models);
    }

    @Y61.k
    public final List<BeduinModel> getModels() {
        return this.models;
    }

    @Y61.k
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    public int hashCode() {
        return this.models.hashCode() + (this.targetFormId.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinAddComponentsToEndAction(targetFormId=");
        sb2.append(this.targetFormId);
        sb2.append(", models=");
        return H.p(sb2, this.models, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.targetFormId);
        Iterator itJ = C0.j(this.models, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
    }
}
