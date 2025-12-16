package com.avito.android.favorite_comparison.presentation;

import com.avito.android.comparison.remote.model.ComparisonListResponse;
import com.avito.android.favorite_comparison.presentation.b;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoriteComparisonViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/comparison/remote/model/ComparisonListResponse;", "it", "Lcom/avito/android/favorite_comparison/presentation/b;", "apply", "(Lcom/avito/android/comparison/remote/model/ComparisonListResponse;)Lcom/avito/android/favorite_comparison/presentation/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f155372b;

    public t(y yVar) {
        this.f155372b = yVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ComparisonListResponse comparisonListResponse = (ComparisonListResponse) obj;
        List<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.a> listA = this.f155372b.f155378J.a(comparisonListResponse);
        return !listA.isEmpty() ? new b.a(listA) : new b.c(comparisonListResponse.getEmptyStateInfo());
    }
}
