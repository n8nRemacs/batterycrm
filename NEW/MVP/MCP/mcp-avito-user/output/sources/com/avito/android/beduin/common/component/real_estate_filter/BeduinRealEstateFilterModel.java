package com.avito.android.beduin.common.component.real_estate_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.label.BeduinLabelModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.RealEstateFilterStateTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRealEstateFilterModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b0\u00101J\u0086\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\u001fJ\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u000108HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000205HÖ\u0001¢\u0006\u0004\b=\u00107J \u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u000205HÖ\u0001¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bK\u0010%R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bM\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bO\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bQ\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bS\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\bU\u0010/R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bW\u00101¨\u0006X"}, d2 = {"Lcom/avito/android/beduin/common/component/real_estate_filter/BeduinRealEstateFilterModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/label/BeduinLabelModel;", "overridenTitle", "Lcom/avito/android/beduin/common/component/real_estate_filter/TitleStyle;", "titleStyle", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilters;", "filters", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "filterState", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFiltersLogEvent;", "filtersLogEvent", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequestLogEvent;", "requestLogEvent", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;", "request", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/label/BeduinLabelModel;Lcom/avito/android/beduin/common/component/real_estate_filter/TitleStyle;Ljava/util/List;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilters;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFiltersLogEvent;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequestLogEvent;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/label/BeduinLabelModel;", "component4", "()Lcom/avito/android/beduin/common/component/real_estate_filter/TitleStyle;", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilters;", "component7", "()Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "component8", "()Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFiltersLogEvent;", "component9", "()Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequestLogEvent;", "component10", "()Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/label/BeduinLabelModel;Lcom/avito/android/beduin/common/component/real_estate_filter/TitleStyle;Ljava/util/List;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilters;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFiltersLogEvent;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequestLogEvent;Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;)Lcom/avito/android/beduin/common/component/real_estate_filter/BeduinRealEstateFilterModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/label/BeduinLabelModel;", "getOverridenTitle", "Lcom/avito/android/beduin/common/component/real_estate_filter/TitleStyle;", "getTitleStyle", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilters;", "getFilters", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "getFilterState", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFiltersLogEvent;", "getFiltersLogEvent", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequestLogEvent;", "getRequestLogEvent", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateRequest;", "getRequest", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinRealEstateFilterModel extends LeafBeduinModel {

    @Y61.k
    public static final Parcelable.Creator<BeduinRealEstateFilterModel> CREATOR = new a();

    @Y61.l
    private final List<BeduinAction> actions;

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.k
    private final RealEstateFilterState filterState;

    @Y61.k
    private final RealEstateFilters filters;

    @Y61.l
    private final RealEstateFiltersLogEvent filtersLogEvent;

    @Y61.k
    private final String id;

    @Y61.l
    private final BeduinLabelModel overridenTitle;

    @Y61.k
    private final RealEstateRequest request;

    @Y61.l
    private final RealEstateRequestLogEvent requestLogEvent;

    @Y61.l
    private final TitleStyle titleStyle;

    /* compiled from: BeduinRealEstateFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinRealEstateFilterModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRealEstateFilterModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinRealEstateFilterModel.class.getClassLoader());
            BeduinLabelModel beduinLabelModelCreateFromParcel = parcel.readInt() == 0 ? null : BeduinLabelModel.CREATOR.createFromParcel(parcel);
            TitleStyle titleStyleCreateFromParcel = parcel.readInt() == 0 ? null : TitleStyle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinRealEstateFilterModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinRealEstateFilterModel(string, displayingPredicate, beduinLabelModelCreateFromParcel, titleStyleCreateFromParcel, arrayList, RealEstateFilters.CREATOR.createFromParcel(parcel), RealEstateFilterState.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RealEstateFiltersLogEvent.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RealEstateRequestLogEvent.CREATOR.createFromParcel(parcel) : null, RealEstateRequest.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRealEstateFilterModel[] newArray(int i12) {
            return new BeduinRealEstateFilterModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinRealEstateFilterModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l BeduinLabelModel beduinLabelModel, @Y61.l TitleStyle titleStyle, @Y61.l List<? extends BeduinAction> list, @Y61.k RealEstateFilters realEstateFilters, @Y61.k RealEstateFilterState realEstateFilterState, @Y61.l RealEstateFiltersLogEvent realEstateFiltersLogEvent, @Y61.l RealEstateRequestLogEvent realEstateRequestLogEvent, @Y61.k RealEstateRequest realEstateRequest) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.overridenTitle = beduinLabelModel;
        this.titleStyle = titleStyle;
        this.actions = list;
        this.filters = realEstateFilters;
        this.filterState = realEstateFilterState;
        this.filtersLogEvent = realEstateFiltersLogEvent;
        this.requestLogEvent = realEstateRequestLogEvent;
        this.request = realEstateRequest;
    }

    public static /* synthetic */ BeduinRealEstateFilterModel copy$default(BeduinRealEstateFilterModel beduinRealEstateFilterModel, String str, DisplayingPredicate displayingPredicate, BeduinLabelModel beduinLabelModel, TitleStyle titleStyle, List list, RealEstateFilters realEstateFilters, RealEstateFilterState realEstateFilterState, RealEstateFiltersLogEvent realEstateFiltersLogEvent, RealEstateRequestLogEvent realEstateRequestLogEvent, RealEstateRequest realEstateRequest, int i12, Object obj) {
        return beduinRealEstateFilterModel.copy((i12 & 1) != 0 ? beduinRealEstateFilterModel.id : str, (i12 & 2) != 0 ? beduinRealEstateFilterModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinRealEstateFilterModel.overridenTitle : beduinLabelModel, (i12 & 8) != 0 ? beduinRealEstateFilterModel.titleStyle : titleStyle, (i12 & 16) != 0 ? beduinRealEstateFilterModel.actions : list, (i12 & 32) != 0 ? beduinRealEstateFilterModel.filters : realEstateFilters, (i12 & 64) != 0 ? beduinRealEstateFilterModel.filterState : realEstateFilterState, (i12 & 128) != 0 ? beduinRealEstateFilterModel.filtersLogEvent : realEstateFiltersLogEvent, (i12 & 256) != 0 ? beduinRealEstateFilterModel.requestLogEvent : realEstateRequestLogEvent, (i12 & 512) != 0 ? beduinRealEstateFilterModel.request : realEstateRequest);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        return transform instanceof RealEstateFilterStateTransform ? copy$default(this, null, null, null, null, null, null, ((RealEstateFilterStateTransform) transform).getFilterState(), null, null, null, 959, null) : transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, 1021, null) : super.apply(transform);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: component10, reason: from getter */
    public final RealEstateRequest getRequest() {
        return this.request;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final BeduinLabelModel getOverridenTitle() {
        return this.overridenTitle;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final TitleStyle getTitleStyle() {
        return this.titleStyle;
    }

    @Y61.l
    public final List<BeduinAction> component5() {
        return this.actions;
    }

    @Y61.k
    /* renamed from: component6, reason: from getter */
    public final RealEstateFilters getFilters() {
        return this.filters;
    }

    @Y61.k
    /* renamed from: component7, reason: from getter */
    public final RealEstateFilterState getFilterState() {
        return this.filterState;
    }

    @Y61.l
    /* renamed from: component8, reason: from getter */
    public final RealEstateFiltersLogEvent getFiltersLogEvent() {
        return this.filtersLogEvent;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final RealEstateRequestLogEvent getRequestLogEvent() {
        return this.requestLogEvent;
    }

    @Y61.k
    public final BeduinRealEstateFilterModel copy(@Y61.k String id2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l BeduinLabelModel overridenTitle, @Y61.l TitleStyle titleStyle, @Y61.l List<? extends BeduinAction> actions, @Y61.k RealEstateFilters filters, @Y61.k RealEstateFilterState filterState, @Y61.l RealEstateFiltersLogEvent filtersLogEvent, @Y61.l RealEstateRequestLogEvent requestLogEvent, @Y61.k RealEstateRequest request) {
        return new BeduinRealEstateFilterModel(id2, displayingPredicate, overridenTitle, titleStyle, actions, filters, filterState, filtersLogEvent, requestLogEvent, request);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRealEstateFilterModel)) {
            return false;
        }
        BeduinRealEstateFilterModel beduinRealEstateFilterModel = (BeduinRealEstateFilterModel) other;
        return L.f(this.id, beduinRealEstateFilterModel.id) && L.f(this.displayingPredicate, beduinRealEstateFilterModel.displayingPredicate) && L.f(this.overridenTitle, beduinRealEstateFilterModel.overridenTitle) && L.f(this.titleStyle, beduinRealEstateFilterModel.titleStyle) && L.f(this.actions, beduinRealEstateFilterModel.actions) && L.f(this.filters, beduinRealEstateFilterModel.filters) && L.f(this.filterState, beduinRealEstateFilterModel.filterState) && L.f(this.filtersLogEvent, beduinRealEstateFilterModel.filtersLogEvent) && L.f(this.requestLogEvent, beduinRealEstateFilterModel.requestLogEvent) && L.f(this.request, beduinRealEstateFilterModel.request);
    }

    @Y61.l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Y61.k
    public final RealEstateFilterState getFilterState() {
        return this.filterState;
    }

    @Y61.k
    public final RealEstateFilters getFilters() {
        return this.filters;
    }

    @Y61.l
    public final RealEstateFiltersLogEvent getFiltersLogEvent() {
        return this.filtersLogEvent;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @Y61.l
    public final BeduinLabelModel getOverridenTitle() {
        return this.overridenTitle;
    }

    @Y61.k
    public final RealEstateRequest getRequest() {
        return this.request;
    }

    @Y61.l
    public final RealEstateRequestLogEvent getRequestLogEvent() {
        return this.requestLogEvent;
    }

    @Y61.l
    public final TitleStyle getTitleStyle() {
        return this.titleStyle;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinLabelModel beduinLabelModel = this.overridenTitle;
        int iHashCode3 = (iHashCode2 + (beduinLabelModel == null ? 0 : beduinLabelModel.hashCode())) * 31;
        TitleStyle titleStyle = this.titleStyle;
        int iHashCode4 = (iHashCode3 + (titleStyle == null ? 0 : titleStyle.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode5 = (this.filterState.hashCode() + ((this.filters.hashCode() + ((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        RealEstateFiltersLogEvent realEstateFiltersLogEvent = this.filtersLogEvent;
        int iHashCode6 = (iHashCode5 + (realEstateFiltersLogEvent == null ? 0 : realEstateFiltersLogEvent.hashCode())) * 31;
        RealEstateRequestLogEvent realEstateRequestLogEvent = this.requestLogEvent;
        return this.request.hashCode() + ((iHashCode6 + (realEstateRequestLogEvent != null ? realEstateRequestLogEvent.hashCode() : 0)) * 31);
    }

    @Y61.k
    public String toString() {
        return "BeduinRealEstateFilterModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", overridenTitle=" + this.overridenTitle + ", titleStyle=" + this.titleStyle + ", actions=" + this.actions + ", filters=" + this.filters + ", filterState=" + this.filterState + ", filtersLogEvent=" + this.filtersLogEvent + ", requestLogEvent=" + this.requestLogEvent + ", request=" + this.request + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        BeduinLabelModel beduinLabelModel = this.overridenTitle;
        if (beduinLabelModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinLabelModel.writeToParcel(parcel, flags);
        }
        TitleStyle titleStyle = this.titleStyle;
        if (titleStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            titleStyle.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        this.filters.writeToParcel(parcel, flags);
        this.filterState.writeToParcel(parcel, flags);
        RealEstateFiltersLogEvent realEstateFiltersLogEvent = this.filtersLogEvent;
        if (realEstateFiltersLogEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realEstateFiltersLogEvent.writeToParcel(parcel, flags);
        }
        RealEstateRequestLogEvent realEstateRequestLogEvent = this.requestLogEvent;
        if (realEstateRequestLogEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realEstateRequestLogEvent.writeToParcel(parcel, flags);
        }
        this.request.writeToParcel(parcel, flags);
    }
}
