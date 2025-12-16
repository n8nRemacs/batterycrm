package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRemoveComponentsAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001#B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinRemoveComponentsAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "", "targetFormId", "", "modelIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/beduin/common/action/BeduinRemoveComponentsAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTargetFormId", "Ljava/util/List;", "getModelIds", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinRemoveComponentsAction implements BeduinAction, Ui.e {

    @Y61.k
    public static final Parcelable.Creator<BeduinRemoveComponentsAction> CREATOR = new a();

    @Y61.k
    private final List<String> modelIds;

    @Y61.k
    private final String targetFormId;

    /* compiled from: BeduinRemoveComponentsAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinRemoveComponentsAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRemoveComponentsAction createFromParcel(Parcel parcel) {
            return new BeduinRemoveComponentsAction(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRemoveComponentsAction[] newArray(int i12) {
            return new BeduinRemoveComponentsAction[i12];
        }
    }

    /* compiled from: BeduinRemoveComponentsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinRemoveComponentsAction$b;", "LUi/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC15524c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f99995b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinAction> f99996c;

        public b() {
            this(null, null, 3, null);
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return this.f99996c;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF100007c() {
            return this.f99995b;
        }

        public b(String str, Class cls, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? "removeComponents" : str;
            cls = (i12 & 2) != 0 ? BeduinRemoveComponentsAction.class : cls;
            this.f99995b = str;
            this.f99996c = cls;
        }
    }

    public BeduinRemoveComponentsAction(@Y61.k String str, @Y61.k List<String> list) {
        this.targetFormId = str;
        this.modelIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinRemoveComponentsAction copy$default(BeduinRemoveComponentsAction beduinRemoveComponentsAction, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinRemoveComponentsAction.targetFormId;
        }
        if ((i12 & 2) != 0) {
            list = beduinRemoveComponentsAction.modelIds;
        }
        return beduinRemoveComponentsAction.copy(str, list);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @Y61.k
    public final List<String> component2() {
        return this.modelIds;
    }

    @Y61.k
    public final BeduinRemoveComponentsAction copy(@Y61.k String targetFormId, @Y61.k List<String> modelIds) {
        return new BeduinRemoveComponentsAction(targetFormId, modelIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRemoveComponentsAction)) {
            return false;
        }
        BeduinRemoveComponentsAction beduinRemoveComponentsAction = (BeduinRemoveComponentsAction) other;
        return L.f(this.targetFormId, beduinRemoveComponentsAction.targetFormId) && L.f(this.modelIds, beduinRemoveComponentsAction.modelIds);
    }

    @Y61.k
    public final List<String> getModelIds() {
        return this.modelIds;
    }

    @Y61.k
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    public int hashCode() {
        return this.modelIds.hashCode() + (this.targetFormId.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinRemoveComponentsAction(targetFormId=");
        sb2.append(this.targetFormId);
        sb2.append(", modelIds=");
        return H.p(sb2, this.modelIds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.targetFormId);
        parcel.writeStringList(this.modelIds);
    }
}
