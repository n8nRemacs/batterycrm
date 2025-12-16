package com.avito.android.sbc.create;

import ap0.C23649a;
import com.avito.android.remote.model.TypedResult;
import ep0.C40143a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CreateDiscountDispatchInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/c;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {
    @Y61.l
    Object a(long j12, @Y61.l Long l12, long j13, long j14, @Y61.k String str, long j15, @Y61.k Continuation<? super TypedResult<C23649a>> continuation);

    @Y61.l
    Object b(@Y61.k String str, @Y61.k String str2, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object c(@Y61.k String str, @Y61.l String str2, @Y61.k ContinuationImpl continuationImpl);

    @Y61.l
    Object d(long j12, @Y61.l Long l12, @Y61.l Long l13, long j13, @Y61.k Continuation<? super TypedResult<C40143a>> continuation);

    @Y61.l
    Object e(long j12, long j13, @Y61.k String str, @Y61.l Long l12, @Y61.l Long l13, @Y61.k ContinuationImpl continuationImpl);
}
