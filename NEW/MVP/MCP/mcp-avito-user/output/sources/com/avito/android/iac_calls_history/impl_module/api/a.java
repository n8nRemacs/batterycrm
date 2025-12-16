package com.avito.android.iac_calls_history.impl_module.api;

import XJ.a;
import Y61.k;
import Y61.l;
import com.avito.android.iac_calls_history.impl_module.api.remote.GetCallHistoryRequest;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CallsHistoryApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/a;", "", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface a {
    @l
    Object a(@k Continuation<? super TypedResult<a.C1328a>> continuation);

    @l
    Object b(@k Continuation<? super TypedResult<Object>> continuation);

    @l
    Object c(int i12, @l String str, @k String str2, @k Continuation<? super TypedResult<GetCallHistoryRequest.a>> continuation);
}
