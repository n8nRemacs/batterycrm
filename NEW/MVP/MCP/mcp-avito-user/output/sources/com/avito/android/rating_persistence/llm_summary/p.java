package com.avito.android.rating_persistence.llm_summary;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingLLMSummaryRepository.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/p;", "Lcom/avito/android/rating_persistence/llm_summary/o;", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f249835a;

    @Inject
    public p(@Y61.k a aVar) {
        this.f249835a = aVar;
    }

    public static String e(long j12, String str) {
        return str + ':' + j12;
    }

    @Override // com.avito.android.rating_persistence.llm_summary.o
    @Y61.l
    public final Object a(long j12, @Y61.k ContinuationImpl continuationImpl) {
        Object objA = this.f249835a.a(j12, continuationImpl);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // com.avito.android.rating_persistence.llm_summary.o
    @Y61.l
    public final Object b(@Y61.k String str, long j12, long j13, @Y61.k SuspendLambda suspendLambda) {
        Object objD = this.f249835a.d(new g(e(j12, str), j13), suspendLambda);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : G0.f406611a;
    }

    @Override // com.avito.android.rating_persistence.llm_summary.o
    @Y61.k
    public final InterfaceC43160i c(long j12, @Y61.k String str) {
        return this.f249835a.b(e(j12, str));
    }

    @Override // com.avito.android.rating_persistence.llm_summary.o
    @Y61.l
    public final Object d(long j12, @Y61.k String str, @Y61.k Continuation continuation) {
        return this.f249835a.c(e(j12, str), continuation);
    }
}
