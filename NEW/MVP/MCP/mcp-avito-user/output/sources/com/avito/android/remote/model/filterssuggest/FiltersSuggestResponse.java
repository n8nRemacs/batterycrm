package com.avito.android.remote.model.filterssuggest;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.category_parameters.SectionedOptions;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.WithSectionedOptions;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FiltersSuggestResponse.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JT\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/filterssuggest/FiltersSuggestResponse;", "Lcom/avito/android/remote/model/category_parameters/WithSectionedOptions;", "optionsTotal", "", "optionsLimit", "optionsOffset", "sectionedOptions", "", "Lcom/avito/android/remote/model/category_parameters/SectionedOptions;", "selectedValue", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getOptionsLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOptionsOffset", "getOptionsTotal", "()I", "getSectionedOptions", "()Ljava/util/List;", "getSelectedValue", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/filterssuggest/FiltersSuggestResponse;", "equals", "", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FiltersSuggestResponse implements WithSectionedOptions {

    @c("optionsLimit")
    @l
    private final Integer optionsLimit;

    @c("optionsOffset")
    @l
    private final Integer optionsOffset;

    @c("optionsTotal")
    private final int optionsTotal;

    @c("sections")
    @l
    private final List<SectionedOptions> sectionedOptions;

    @c("selectedValue")
    @l
    private final List<SelectParameter.Value> selectedValue;

    public FiltersSuggestResponse(int i12, @l Integer num, @l Integer num2, @l List<SectionedOptions> list, @l List<SelectParameter.Value> list2) {
        this.optionsTotal = i12;
        this.optionsLimit = num;
        this.optionsOffset = num2;
        this.sectionedOptions = list;
        this.selectedValue = list2;
    }

    public static /* synthetic */ FiltersSuggestResponse copy$default(FiltersSuggestResponse filtersSuggestResponse, int i12, Integer num, Integer num2, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = filtersSuggestResponse.optionsTotal;
        }
        if ((i13 & 2) != 0) {
            num = filtersSuggestResponse.optionsLimit;
        }
        Integer num3 = num;
        if ((i13 & 4) != 0) {
            num2 = filtersSuggestResponse.optionsOffset;
        }
        Integer num4 = num2;
        if ((i13 & 8) != 0) {
            list = filtersSuggestResponse.sectionedOptions;
        }
        List list3 = list;
        if ((i13 & 16) != 0) {
            list2 = filtersSuggestResponse.selectedValue;
        }
        return filtersSuggestResponse.copy(i12, num3, num4, list3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOptionsTotal() {
        return this.optionsTotal;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getOptionsLimit() {
        return this.optionsLimit;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getOptionsOffset() {
        return this.optionsOffset;
    }

    @l
    public final List<SectionedOptions> component4() {
        return this.sectionedOptions;
    }

    @l
    public final List<SelectParameter.Value> component5() {
        return this.selectedValue;
    }

    @k
    public final FiltersSuggestResponse copy(int optionsTotal, @l Integer optionsLimit, @l Integer optionsOffset, @l List<SectionedOptions> sectionedOptions, @l List<SelectParameter.Value> selectedValue) {
        return new FiltersSuggestResponse(optionsTotal, optionsLimit, optionsOffset, sectionedOptions, selectedValue);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersSuggestResponse)) {
            return false;
        }
        FiltersSuggestResponse filtersSuggestResponse = (FiltersSuggestResponse) other;
        return this.optionsTotal == filtersSuggestResponse.optionsTotal && L.f(this.optionsLimit, filtersSuggestResponse.optionsLimit) && L.f(this.optionsOffset, filtersSuggestResponse.optionsOffset) && L.f(this.sectionedOptions, filtersSuggestResponse.sectionedOptions) && L.f(this.selectedValue, filtersSuggestResponse.selectedValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.WithSectionedOptions
    public int getOptionsCount() {
        return WithSectionedOptions.DefaultImpls.getOptionsCount(this);
    }

    @l
    public final Integer getOptionsLimit() {
        return this.optionsLimit;
    }

    @l
    public final Integer getOptionsOffset() {
        return this.optionsOffset;
    }

    public final int getOptionsTotal() {
        return this.optionsTotal;
    }

    @Override // com.avito.android.remote.model.category_parameters.WithSectionedOptions
    @l
    public List<SectionedOptions> getSectionedOptions() {
        return this.sectionedOptions;
    }

    @Override // com.avito.android.remote.model.category_parameters.WithSectionedOptions
    @k
    public List<ParcelableEntity<String>> getSectionedOptionsAsEntities() {
        return WithSectionedOptions.DefaultImpls.getSectionedOptionsAsEntities(this);
    }

    @l
    public final List<SelectParameter.Value> getSelectedValue() {
        return this.selectedValue;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.optionsTotal) * 31;
        Integer num = this.optionsLimit;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.optionsOffset;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SectionedOptions> list = this.sectionedOptions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<SelectParameter.Value> list2 = this.selectedValue;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersSuggestResponse(optionsTotal=");
        sb2.append(this.optionsTotal);
        sb2.append(", optionsLimit=");
        sb2.append(this.optionsLimit);
        sb2.append(", optionsOffset=");
        sb2.append(this.optionsOffset);
        sb2.append(", sectionedOptions=");
        sb2.append(this.sectionedOptions);
        sb2.append(", selectedValue=");
        return H.p(sb2, this.selectedValue, ')');
    }
}
