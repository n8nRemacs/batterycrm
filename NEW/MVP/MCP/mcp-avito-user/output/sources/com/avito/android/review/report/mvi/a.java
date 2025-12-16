package com.avito.android.review.report.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.review.report.mvi.entity.ComfortableDealReviewsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ComfortableDealReviewBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/review/report/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction;", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.b<ComfortableDealReviewsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.review.data_source.a f255407a;

    @Inject
    public a(@Y61.k com.avito.android.review.data_source.a aVar) {
        this.f255407a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ComfortableDealReviewsInternalAction> a() {
        return new C43210w(new ComfortableDealReviewsInternalAction.ReviewsLoaded(this.f255407a.b()));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
