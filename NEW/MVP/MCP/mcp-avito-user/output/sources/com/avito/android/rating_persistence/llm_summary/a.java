package com.avito.android.rating_persistence.llm_summary;

import androidx.room.A;
import androidx.room.InterfaceC23458l0;
import androidx.room.W;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingLLMSummaryDao.kt */
@A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_persistence/llm_summary/a;", "", "_avito_rating-persistence_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {
    @InterfaceC23458l0
    @Y61.l
    Object a(long j12, @Y61.k ContinuationImpl continuationImpl);

    @InterfaceC23458l0
    @Y61.k
    InterfaceC43160i<List<g>> b(@Y61.k String str);

    @InterfaceC23458l0
    @Y61.l
    Object c(@Y61.k String str, @Y61.k Continuation<? super List<g>> continuation);

    @Y61.l
    @W
    Object d(@Y61.k g gVar, @Y61.k SuspendLambda suspendLambda);
}
