package com.avito.android.iac_calls_history.impl_module.api;

import J81.o;
import XJ.a;
import Y61.k;
import Y61.l;
import com.avito.android.iac_calls_history.impl_module.api.remote.GetCallHistoryRequest;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CallsHistoryRetrofitApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H§@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H§@¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/e;", "Lcom/avito/android/iac_calls_history/impl_module/api/a;", "", "count", "", "fromTimestamp", NotificationOpenAtTab.TAB, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/iac_calls_history/impl_module/api/remote/GetCallHistoryRequest$a;", "c", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LXJ/a$a;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes13.dex */
public interface e extends a {
    @Override // com.avito.android.iac_calls_history.impl_module.api.a
    @J81.f("1/ip-calls/getMissedCounter")
    @l
    Object a(@k Continuation<? super TypedResult<a.C1328a>> continuation);

    @Override // com.avito.android.iac_calls_history.impl_module.api.a
    @o("1/ip-calls/resetMissedCounter")
    @l
    Object b(@k Continuation<? super TypedResult<Object>> continuation);

    @Override // com.avito.android.iac_calls_history.impl_module.api.a
    @o("1/ip-calls/getCallLog")
    @J81.e
    @l
    Object c(@J81.c("limit") int i12, @J81.c("beforeTimestamp") @l String str, @J81.c(NotificationOpenAtTab.TAB) @k String str2, @k Continuation<? super TypedResult<GetCallHistoryRequest.a>> continuation);
}
