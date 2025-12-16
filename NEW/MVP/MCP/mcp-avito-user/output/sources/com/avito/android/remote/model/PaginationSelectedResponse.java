package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.SectionedOptions;
import com.avito.android.remote.model.category_parameters.WithSectionedOptions;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaginationSelectedResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/PaginationSelectedResponse;", "Lcom/avito/android/remote/model/category_parameters/WithSectionedOptions;", "optionsTotal", "", "sectionedOptions", "", "Lcom/avito/android/remote/model/category_parameters/SectionedOptions;", "(ILjava/util/List;)V", "getOptionsTotal", "()I", "getSectionedOptions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PaginationSelectedResponse implements WithSectionedOptions {

    @c("optionsTotal")
    private final int optionsTotal;

    @c("sections")
    @l
    private final List<SectionedOptions> sectionedOptions;

    public PaginationSelectedResponse(int i12, @l List<SectionedOptions> list) {
        this.optionsTotal = i12;
        this.sectionedOptions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaginationSelectedResponse copy$default(PaginationSelectedResponse paginationSelectedResponse, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = paginationSelectedResponse.optionsTotal;
        }
        if ((i13 & 2) != 0) {
            list = paginationSelectedResponse.sectionedOptions;
        }
        return paginationSelectedResponse.copy(i12, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOptionsTotal() {
        return this.optionsTotal;
    }

    @l
    public final List<SectionedOptions> component2() {
        return this.sectionedOptions;
    }

    @k
    public final PaginationSelectedResponse copy(int optionsTotal, @l List<SectionedOptions> sectionedOptions) {
        return new PaginationSelectedResponse(optionsTotal, sectionedOptions);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginationSelectedResponse)) {
            return false;
        }
        PaginationSelectedResponse paginationSelectedResponse = (PaginationSelectedResponse) other;
        return this.optionsTotal == paginationSelectedResponse.optionsTotal && L.f(this.sectionedOptions, paginationSelectedResponse.sectionedOptions);
    }

    @Override // com.avito.android.remote.model.category_parameters.WithSectionedOptions
    public int getOptionsCount() {
        return WithSectionedOptions.DefaultImpls.getOptionsCount(this);
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

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.optionsTotal) * 31;
        List<SectionedOptions> list = this.sectionedOptions;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaginationSelectedResponse(optionsTotal=");
        sb2.append(this.optionsTotal);
        sb2.append(", sectionedOptions=");
        return H.p(sb2, this.sectionedOptions, ')');
    }
}
