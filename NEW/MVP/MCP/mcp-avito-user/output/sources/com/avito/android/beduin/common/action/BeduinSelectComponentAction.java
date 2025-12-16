package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSelectComponentAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSelectComponentAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "modelId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinSelectComponentAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getModelId", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSelectComponentAction implements BeduinAction {

    @Y61.k
    public static final Parcelable.Creator<BeduinSelectComponentAction> CREATOR = new a();

    @Y61.k
    private final String modelId;

    /* compiled from: BeduinSelectComponentAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSelectComponentAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSelectComponentAction createFromParcel(Parcel parcel) {
            return new BeduinSelectComponentAction(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSelectComponentAction[] newArray(int i12) {
            return new BeduinSelectComponentAction[i12];
        }
    }

    /* compiled from: BeduinSelectComponentAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSelectComponentAction$b;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC15524c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Class<? extends BeduinAction> f100000b = BeduinSelectComponentAction.class;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f100001c = "selectComponent";

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return this.f100000b;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF99995b() {
            return this.f100001c;
        }
    }

    public BeduinSelectComponentAction(@Y61.k String str) {
        this.modelId = str;
    }

    public static /* synthetic */ BeduinSelectComponentAction copy$default(BeduinSelectComponentAction beduinSelectComponentAction, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinSelectComponentAction.modelId;
        }
        return beduinSelectComponentAction.copy(str);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @Y61.k
    public final BeduinSelectComponentAction copy(@Y61.k String modelId) {
        return new BeduinSelectComponentAction(modelId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinSelectComponentAction) && L.f(this.modelId, ((BeduinSelectComponentAction) other).modelId);
    }

    @Y61.k
    public final String getModelId() {
        return this.modelId;
    }

    public int hashCode() {
        return this.modelId.hashCode();
    }

    @Y61.k
    public String toString() {
        return C22026a.c(new StringBuilder("BeduinSelectComponentAction(modelId="), this.modelId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.modelId);
    }
}
