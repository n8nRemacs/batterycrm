package com.avito.android.iac_dialer.impl_module.api;

import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.api.FailedBinderCallBack;
import e30.InterfaceC39936a;
import gK.C40592a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: IacDialerFinalLinkInteractorRetrofitApi.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/api/e;", "Lcom/avito/android/iac_dialer/impl_module/api/a;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "talkDurationSeconds", "Lcom/avito/android/remote/model/TypedResult;", "LgK/a;", "a", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface e extends a {
    @Override // com.avito.android.iac_dialer.impl_module.api.a
    @o("1/ip-calls/enrich/callFinishScreen")
    @J81.e
    @l
    Object a(@J81.c(FailedBinderCallBack.CALLER_ID) @k String str, @J81.c("talkDuration") long j12, @k Continuation<? super TypedResult<C40592a>> continuation);
}
