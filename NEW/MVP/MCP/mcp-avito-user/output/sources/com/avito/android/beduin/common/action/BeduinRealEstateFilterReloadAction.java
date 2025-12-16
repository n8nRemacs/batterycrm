package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState;
import com.avito.android.beduin.common.component.real_estate_filter.RealEstateRequest;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterReloadAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006-"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinRealEstateFilterReloadAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "targetFormId", "modelId", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "filterState", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;", "request", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "component4", "()Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;)Lcom/avito/android/beduin/common/action/BeduinRealEstateFilterReloadAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTargetFormId", "getModelId", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "getFilterState", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;", "getRequest", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinRealEstateFilterReloadAction implements BeduinAction {

    @l
    private final RealEstateFilterState filterState;

    @l
    private final String modelId;

    @l
    private final RealEstateRequest request;

    @l
    private final String targetFormId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinRealEstateFilterReloadAction> CREATOR = new b();

    @Y61.k
    private static final String type = "realEstateFilterReload";

    @Y61.k
    private static final Class<BeduinRealEstateFilterReloadAction> action = BeduinRealEstateFilterReloadAction.class;

    /* compiled from: BeduinRealEstateFilterReloadAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinRealEstateFilterReloadAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinRealEstateFilterReloadAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinRealEstateFilterReloadAction> getAction() {
            return BeduinRealEstateFilterReloadAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99982c() {
            return BeduinRealEstateFilterReloadAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinRealEstateFilterReloadAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinRealEstateFilterReloadAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRealEstateFilterReloadAction createFromParcel(Parcel parcel) {
            return new BeduinRealEstateFilterReloadAction(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RealEstateFilterState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RealEstateRequest.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRealEstateFilterReloadAction[] newArray(int i12) {
            return new BeduinRealEstateFilterReloadAction[i12];
        }
    }

    public BeduinRealEstateFilterReloadAction(@l String str, @l String str2, @l RealEstateFilterState realEstateFilterState, @l RealEstateRequest realEstateRequest) {
        this.targetFormId = str;
        this.modelId = str2;
        this.filterState = realEstateFilterState;
        this.request = realEstateRequest;
    }

    public static /* synthetic */ BeduinRealEstateFilterReloadAction copy$default(BeduinRealEstateFilterReloadAction beduinRealEstateFilterReloadAction, String str, String str2, RealEstateFilterState realEstateFilterState, RealEstateRequest realEstateRequest, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinRealEstateFilterReloadAction.targetFormId;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinRealEstateFilterReloadAction.modelId;
        }
        if ((i12 & 4) != 0) {
            realEstateFilterState = beduinRealEstateFilterReloadAction.filterState;
        }
        if ((i12 & 8) != 0) {
            realEstateRequest = beduinRealEstateFilterReloadAction.request;
        }
        return beduinRealEstateFilterReloadAction.copy(str, str2, realEstateFilterState, realEstateRequest);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getModelId() {
        return this.modelId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final RealEstateFilterState getFilterState() {
        return this.filterState;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final RealEstateRequest getRequest() {
        return this.request;
    }

    @Y61.k
    public final BeduinRealEstateFilterReloadAction copy(@l String targetFormId, @l String modelId, @l RealEstateFilterState filterState, @l RealEstateRequest request) {
        return new BeduinRealEstateFilterReloadAction(targetFormId, modelId, filterState, request);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRealEstateFilterReloadAction)) {
            return false;
        }
        BeduinRealEstateFilterReloadAction beduinRealEstateFilterReloadAction = (BeduinRealEstateFilterReloadAction) other;
        return L.f(this.targetFormId, beduinRealEstateFilterReloadAction.targetFormId) && L.f(this.modelId, beduinRealEstateFilterReloadAction.modelId) && L.f(this.filterState, beduinRealEstateFilterReloadAction.filterState) && L.f(this.request, beduinRealEstateFilterReloadAction.request);
    }

    @l
    public final RealEstateFilterState getFilterState() {
        return this.filterState;
    }

    @l
    public final String getModelId() {
        return this.modelId;
    }

    @l
    public final RealEstateRequest getRequest() {
        return this.request;
    }

    @l
    public final String getTargetFormId() {
        return this.targetFormId;
    }

    public int hashCode() {
        String str = this.targetFormId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.modelId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RealEstateFilterState realEstateFilterState = this.filterState;
        int iHashCode3 = (iHashCode2 + (realEstateFilterState == null ? 0 : realEstateFilterState.hashCode())) * 31;
        RealEstateRequest realEstateRequest = this.request;
        return iHashCode3 + (realEstateRequest != null ? realEstateRequest.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "BeduinRealEstateFilterReloadAction(targetFormId=" + this.targetFormId + ", modelId=" + this.modelId + ", filterState=" + this.filterState + ", request=" + this.request + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.targetFormId);
        parcel.writeString(this.modelId);
        RealEstateFilterState realEstateFilterState = this.filterState;
        if (realEstateFilterState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realEstateFilterState.writeToParcel(parcel, flags);
        }
        RealEstateRequest realEstateRequest = this.request;
        if (realEstateRequest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realEstateRequest.writeToParcel(parcel, flags);
        }
    }
}
