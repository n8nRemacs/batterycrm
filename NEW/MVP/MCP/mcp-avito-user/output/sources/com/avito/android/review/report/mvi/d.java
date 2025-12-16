package com.avito.android.review.report.mvi;

import androidx.compose.runtime.internal.P;
import cn0.AbstractC27228a;
import cn0.C27230c;
import com.avito.android.arch.mvi.a;
import com.avito.android.review.report.mvi.entity.ComfortableDealReviewsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ComfortableDealReviewsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/review/report/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lcn0/a;", "Lcom/avito/android/review/report/mvi/entity/ComfortableDealReviewsInternalAction;", "Lcn0/c;", "<init>", "()V", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.arch.mvi.a<AbstractC27228a, ComfortableDealReviewsInternalAction, C27230c> {
    @Inject
    public d() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ComfortableDealReviewsInternalAction> b(AbstractC27228a abstractC27228a, C27230c c27230c) {
        return C43175k.G(new c(abstractC27228a, null));
    }
}
