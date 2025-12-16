package com.avito.android.rating_persistence.llm_summary;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingLLMSummaryRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/o;", "", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface o {
    @Y61.l
    Object a(long j12, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object b(@Y61.k String str, long j12, long j13, @Y61.k SuspendLambda suspendLambda);

    @Y61.k
    InterfaceC43160i c(long j12, @Y61.k String str);

    @Y61.l
    Object d(long j12, @Y61.k String str, @Y61.k Continuation continuation);
}
