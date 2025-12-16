package com.avito.android.beduin.common.action;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenSearchFiltersAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersModel;", "Landroid/os/Parcelable;", "", "targetFormId", "modelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTargetFormId", "getModelId", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinOpenSearchFiltersModel implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BeduinOpenSearchFiltersModel> CREATOR = new a();

    @Y61.k
    private final String modelId;

    @Y61.k
    private final String targetFormId;

    /* compiled from: BeduinOpenSearchFiltersAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinOpenSearchFiltersModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOpenSearchFiltersModel createFromParcel(Parcel parcel) {
            return new BeduinOpenSearchFiltersModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOpenSearchFiltersModel[] newArray(int i12) {
            return new BeduinOpenSearchFiltersModel[i12];
        }
    }

    public BeduinOpenSearchFiltersModel(@Y61.k String str, @Y61.k String str2) {
        this.targetFormId = str;
        this.modelId = str2;
    }

    public static /* synthetic */ BeduinOpenSearchFiltersModel copy$default(BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinOpenSearchFiltersModel.targetFormId;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinOpenSearchFiltersModel.modelId;
        }
        return beduinOpenSearchFiltersModel.copy(str, str2);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @Y61.k
    public final BeduinOpenSearchFiltersModel copy(@Y61.k String targetFormId, @Y61.k String modelId) {
        return new BeduinOpenSearchFiltersModel(targetFormId, modelId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinOpenSearchFiltersModel)) {
            return false;
        }
        BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel = (BeduinOpenSearchFiltersModel) other;
        return L.f(this.targetFormId, beduinOpenSearchFiltersModel.targetFormId) && L.f(this.modelId, beduinOpenSearchFiltersModel.modelId);
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
        return this.modelId.hashCode() + (this.targetFormId.hashCode() * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinOpenSearchFiltersModel(targetFormId=");
        sb2.append(this.targetFormId);
        sb2.append(", modelId=");
        return C22026a.c(sb2, this.modelId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.targetFormId);
        parcel.writeString(this.modelId);
    }
}
