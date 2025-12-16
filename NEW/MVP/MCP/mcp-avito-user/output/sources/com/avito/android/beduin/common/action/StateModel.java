package com.avito.android.beduin.common.action;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinShowFiltersAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/action/StateModel;", "Landroid/os/Parcelable;", "", "formId", "modelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/action/StateModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormId", "getModelId", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StateModel implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<StateModel> CREATOR = new a();

    @Y61.k
    private final String formId;

    @Y61.k
    private final String modelId;

    /* compiled from: BeduinShowFiltersAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StateModel> {
        @Override // android.os.Parcelable.Creator
        public final StateModel createFromParcel(Parcel parcel) {
            return new StateModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StateModel[] newArray(int i12) {
            return new StateModel[i12];
        }
    }

    public StateModel(@Y61.k String str, @Y61.k String str2) {
        this.formId = str;
        this.modelId = str2;
    }

    public static /* synthetic */ StateModel copy$default(StateModel stateModel, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = stateModel.formId;
        }
        if ((i12 & 2) != 0) {
            str2 = stateModel.modelId;
        }
        return stateModel.copy(str, str2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getFormId() {
        return this.formId;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @Y61.k
    public final StateModel copy(@Y61.k String formId, @Y61.k String modelId) {
        return new StateModel(formId, modelId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateModel)) {
            return false;
        }
        StateModel stateModel = (StateModel) other;
        return L.f(this.formId, stateModel.formId) && L.f(this.modelId, stateModel.modelId);
    }

    @Y61.k
    public final String getFormId() {
        return this.formId;
    }

    @Y61.k
    public final String getModelId() {
        return this.modelId;
    }

    public int hashCode() {
        return this.modelId.hashCode() + (this.formId.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StateModel(formId=");
        sb2.append(this.formId);
        sb2.append(", modelId=");
        return C22026a.c(sb2, this.modelId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.formId);
        parcel.writeString(this.modelId);
    }
}
