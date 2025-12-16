package com.avito.android.inline_filters.dialog;

import com.avito.android.remote.model.category_parameters.SortDirection;
import com.avito.android.remote.model.search.Filter;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersDialogItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "o1", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$Options;", "kotlin.jvm.PlatformType", "o2", "invoke", "(Lcom/avito/android/remote/model/search/Filter$InnerOptions$Options;Lcom/avito/android/remote/model/search/Filter$InnerOptions$Options;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class u extends N implements Y41.p<Filter.InnerOptions.Options, Filter.InnerOptions.Options, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SortDirection f172288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SortDirection sortDirection) {
        super(2);
        this.f172288l = sortDirection;
    }

    @Override // Y41.p
    public final Integer invoke(Filter.InnerOptions.Options options, Filter.InnerOptions.Options options2) {
        int iCompareTo;
        String sortParam = options.getSortParam();
        String sortParam2 = options2.getSortParam();
        if (sortParam == null || sortParam.length() == 0 || sortParam2 == null || sortParam2.length() == 0) {
            iCompareTo = 0;
        } else {
            iCompareTo = sortParam.compareTo(sortParam2);
            if (this.f172288l == SortDirection.Descending) {
                iCompareTo *= -1;
            }
        }
        return Integer.valueOf(iCompareTo);
    }
}
