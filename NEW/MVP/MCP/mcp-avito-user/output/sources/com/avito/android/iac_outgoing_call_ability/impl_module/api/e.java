package com.avito.android.iac_outgoing_call_ability.impl_module.api;

import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.iac_outgoing_call_ability.impl_module.api.remote.CanCallResult;
import com.avito.android.remote.model.TypedResult;
import com.huawei.hms.api.FailedBinderCallBack;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: IacOutgoingCallAbilityRetrofitApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Js\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r0\f2\f\b\u0001\u0010\u0012\u001a\u00060\u0002j\u0002`\u00112\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/e;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/a;", "", "itemId", "peerUserId", "localUserId", "networkType", "scenario", "", "micAccess", "checkGoodBoy", "analyticsParams", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/remote/CanCallResult;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "LRL/b;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface e extends a {
    @Override // com.avito.android.iac_outgoing_call_ability.impl_module.api.a
    @o("4/ip-calls/voip/canCall")
    @J81.e
    @k
    I<TypedResult<CanCallResult>> a(@J81.c("itemId") @l String itemId, @J81.c("calleeUserId") @l String peerUserId, @J81.c("callerUserId") @l String localUserId, @J81.c("networkType") @k String networkType, @J81.c("scenario") @k String scenario, @J81.c("micAccess") boolean micAccess, @J81.c("checkGoodBoy") boolean checkGoodBoy, @J81.c("analyticsParams") @l String analyticsParams);

    @Override // com.avito.android.iac_outgoing_call_ability.impl_module.api.a
    @o("1/ip-calls/canRecall")
    @J81.e
    @k
    I<TypedResult<RL.b>> b(@J81.c(FailedBinderCallBack.CALLER_ID) @k String callId, @J81.c("networkType") @k String networkType, @J81.c("scenario") @k String scenario);
}
