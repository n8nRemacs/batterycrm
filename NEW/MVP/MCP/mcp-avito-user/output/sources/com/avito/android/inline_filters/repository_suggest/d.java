package com.avito.android.inline_filters.repository_suggest;

import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.SectionedOptions;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.filterssuggest.FiltersSuggestResponse;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: InlineFiltersSelectRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/filterssuggest/FiltersSuggestResponse;", "result", "LZp0/e;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f172355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f172356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f172357d;

    public d(int i12, e eVar, String str) {
        this.f172355b = eVar;
        this.f172356c = i12;
        this.f172357d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        SectionedOptions sectionedOptions;
        List<SelectParameter.Value> options;
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
        FiltersSuggestResponse filtersSuggestResponse = (FiltersSuggestResponse) ((TypedResult.Success) typedResult).getResult();
        List<ParcelableEntity<String>> sectionedOptionsAsEntities = filtersSuggestResponse.getSectionedOptionsAsEntities();
        List<SectionedOptions> sectionedOptions2 = filtersSuggestResponse.getSectionedOptions();
        int optionsCount = (sectionedOptions2 == null || (sectionedOptions = (SectionedOptions) C42745f0.S(sectionedOptions2)) == null || (options = sectionedOptions.getOptions()) == null) ? filtersSuggestResponse.getOptionsCount() : options.size();
        int optionsTotal = filtersSuggestResponse.getOptionsTotal();
        int optionsCount2 = filtersSuggestResponse.getOptionsCount();
        int i12 = this.f172356c;
        int i13 = optionsCount2 + i12;
        return new TypedResult.Success(new Zp0.e(sectionedOptionsAsEntities, (!O2.a(sectionedOptionsAsEntities) || i13 >= optionsTotal) ? null : new g(this.f172355b.f172362e ? optionsCount + i12 : i13, this.f172357d)));
    }
}
