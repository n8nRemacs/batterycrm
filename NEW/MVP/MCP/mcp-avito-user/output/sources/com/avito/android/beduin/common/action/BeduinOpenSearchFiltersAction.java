package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenSearchFiltersAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00015BI\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J^\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001f\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b3\u0010\u0014¨\u00066"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "onSelectedActions", "Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersModel;", "countDisplayingModel", "resultParametersPayload", "", "infoModelForm", "Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersAnalyticsData;", "analyticsData", "context", "<init>", "(Ljava/util/List;Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersModel;Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersModel;Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersAnalyticsData;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersModel;", "component3", "component4", "()Ljava/lang/String;", "component5", "()Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersAnalyticsData;", "component6", "copy", "(Ljava/util/List;Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersModel;Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersModel;Ljava/lang/String;Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersAnalyticsData;Ljava/lang/String;)Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getOnSelectedActions", "Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersModel;", "getCountDisplayingModel", "getResultParametersPayload", "Ljava/lang/String;", "getInfoModelForm", "Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersAnalyticsData;", "getAnalyticsData", "getContext", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinOpenSearchFiltersAction implements BeduinAction {

    @l
    private final BeduinOpenSearchFiltersAnalyticsData analyticsData;

    @l
    private final String context;

    @l
    private final BeduinOpenSearchFiltersModel countDisplayingModel;

    @l
    private final String infoModelForm;

    @l
    private final List<BeduinAction> onSelectedActions;

    @l
    private final BeduinOpenSearchFiltersModel resultParametersPayload;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinOpenSearchFiltersAction> CREATOR = new b();

    @Y61.k
    private static final Class<BeduinOpenSearchFiltersAction> action = BeduinOpenSearchFiltersAction.class;

    @Y61.k
    private static final String type = "openSearchFilters";

    /* compiled from: BeduinOpenSearchFiltersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinOpenSearchFiltersAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinOpenSearchFiltersAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<BeduinOpenSearchFiltersAction> getAction() {
            return BeduinOpenSearchFiltersAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF99987c() {
            return BeduinOpenSearchFiltersAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinOpenSearchFiltersAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinOpenSearchFiltersAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinOpenSearchFiltersAction createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinOpenSearchFiltersAction.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinOpenSearchFiltersAction(arrayList, parcel.readInt() == 0 ? null : BeduinOpenSearchFiltersModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BeduinOpenSearchFiltersModel.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? BeduinOpenSearchFiltersAnalyticsData.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinOpenSearchFiltersAction[] newArray(int i12) {
            return new BeduinOpenSearchFiltersAction[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinOpenSearchFiltersAction(@l List<? extends BeduinAction> list, @l BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel, @l BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel2, @l String str, @l BeduinOpenSearchFiltersAnalyticsData beduinOpenSearchFiltersAnalyticsData, @l String str2) {
        this.onSelectedActions = list;
        this.countDisplayingModel = beduinOpenSearchFiltersModel;
        this.resultParametersPayload = beduinOpenSearchFiltersModel2;
        this.infoModelForm = str;
        this.analyticsData = beduinOpenSearchFiltersAnalyticsData;
        this.context = str2;
    }

    public static /* synthetic */ BeduinOpenSearchFiltersAction copy$default(BeduinOpenSearchFiltersAction beduinOpenSearchFiltersAction, List list, BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel, BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel2, String str, BeduinOpenSearchFiltersAnalyticsData beduinOpenSearchFiltersAnalyticsData, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinOpenSearchFiltersAction.onSelectedActions;
        }
        if ((i12 & 2) != 0) {
            beduinOpenSearchFiltersModel = beduinOpenSearchFiltersAction.countDisplayingModel;
        }
        BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel3 = beduinOpenSearchFiltersModel;
        if ((i12 & 4) != 0) {
            beduinOpenSearchFiltersModel2 = beduinOpenSearchFiltersAction.resultParametersPayload;
        }
        BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel4 = beduinOpenSearchFiltersModel2;
        if ((i12 & 8) != 0) {
            str = beduinOpenSearchFiltersAction.infoModelForm;
        }
        String str3 = str;
        if ((i12 & 16) != 0) {
            beduinOpenSearchFiltersAnalyticsData = beduinOpenSearchFiltersAction.analyticsData;
        }
        BeduinOpenSearchFiltersAnalyticsData beduinOpenSearchFiltersAnalyticsData2 = beduinOpenSearchFiltersAnalyticsData;
        if ((i12 & 32) != 0) {
            str2 = beduinOpenSearchFiltersAction.context;
        }
        return beduinOpenSearchFiltersAction.copy(list, beduinOpenSearchFiltersModel3, beduinOpenSearchFiltersModel4, str3, beduinOpenSearchFiltersAnalyticsData2, str2);
    }

    @l
    public final List<BeduinAction> component1() {
        return this.onSelectedActions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinOpenSearchFiltersModel getCountDisplayingModel() {
        return this.countDisplayingModel;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinOpenSearchFiltersModel getResultParametersPayload() {
        return this.resultParametersPayload;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getInfoModelForm() {
        return this.infoModelForm;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BeduinOpenSearchFiltersAnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @Y61.k
    public final BeduinOpenSearchFiltersAction copy(@l List<? extends BeduinAction> onSelectedActions, @l BeduinOpenSearchFiltersModel countDisplayingModel, @l BeduinOpenSearchFiltersModel resultParametersPayload, @l String infoModelForm, @l BeduinOpenSearchFiltersAnalyticsData analyticsData, @l String context) {
        return new BeduinOpenSearchFiltersAction(onSelectedActions, countDisplayingModel, resultParametersPayload, infoModelForm, analyticsData, context);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinOpenSearchFiltersAction)) {
            return false;
        }
        BeduinOpenSearchFiltersAction beduinOpenSearchFiltersAction = (BeduinOpenSearchFiltersAction) other;
        return L.f(this.onSelectedActions, beduinOpenSearchFiltersAction.onSelectedActions) && L.f(this.countDisplayingModel, beduinOpenSearchFiltersAction.countDisplayingModel) && L.f(this.resultParametersPayload, beduinOpenSearchFiltersAction.resultParametersPayload) && L.f(this.infoModelForm, beduinOpenSearchFiltersAction.infoModelForm) && L.f(this.analyticsData, beduinOpenSearchFiltersAction.analyticsData) && L.f(this.context, beduinOpenSearchFiltersAction.context);
    }

    @l
    public final BeduinOpenSearchFiltersAnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    @l
    public final String getContext() {
        return this.context;
    }

    @l
    public final BeduinOpenSearchFiltersModel getCountDisplayingModel() {
        return this.countDisplayingModel;
    }

    @l
    public final String getInfoModelForm() {
        return this.infoModelForm;
    }

    @l
    public final List<BeduinAction> getOnSelectedActions() {
        return this.onSelectedActions;
    }

    @l
    public final BeduinOpenSearchFiltersModel getResultParametersPayload() {
        return this.resultParametersPayload;
    }

    public int hashCode() {
        List<BeduinAction> list = this.onSelectedActions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel = this.countDisplayingModel;
        int iHashCode2 = (iHashCode + (beduinOpenSearchFiltersModel == null ? 0 : beduinOpenSearchFiltersModel.hashCode())) * 31;
        BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel2 = this.resultParametersPayload;
        int iHashCode3 = (iHashCode2 + (beduinOpenSearchFiltersModel2 == null ? 0 : beduinOpenSearchFiltersModel2.hashCode())) * 31;
        String str = this.infoModelForm;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BeduinOpenSearchFiltersAnalyticsData beduinOpenSearchFiltersAnalyticsData = this.analyticsData;
        int iHashCode5 = (iHashCode4 + (beduinOpenSearchFiltersAnalyticsData == null ? 0 : beduinOpenSearchFiltersAnalyticsData.hashCode())) * 31;
        String str2 = this.context;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinOpenSearchFiltersAction(onSelectedActions=");
        sb2.append(this.onSelectedActions);
        sb2.append(", countDisplayingModel=");
        sb2.append(this.countDisplayingModel);
        sb2.append(", resultParametersPayload=");
        sb2.append(this.resultParametersPayload);
        sb2.append(", infoModelForm=");
        sb2.append(this.infoModelForm);
        sb2.append(", analyticsData=");
        sb2.append(this.analyticsData);
        sb2.append(", context=");
        return C22026a.c(sb2, this.context, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        List<BeduinAction> list = this.onSelectedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel = this.countDisplayingModel;
        if (beduinOpenSearchFiltersModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinOpenSearchFiltersModel.writeToParcel(parcel, flags);
        }
        BeduinOpenSearchFiltersModel beduinOpenSearchFiltersModel2 = this.resultParametersPayload;
        if (beduinOpenSearchFiltersModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinOpenSearchFiltersModel2.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.infoModelForm);
        BeduinOpenSearchFiltersAnalyticsData beduinOpenSearchFiltersAnalyticsData = this.analyticsData;
        if (beduinOpenSearchFiltersAnalyticsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinOpenSearchFiltersAnalyticsData.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.context);
    }
}
