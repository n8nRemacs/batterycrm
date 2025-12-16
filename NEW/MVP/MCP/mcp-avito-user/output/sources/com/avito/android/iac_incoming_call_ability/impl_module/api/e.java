package com.avito.android.iac_incoming_call_ability.impl_module.api;

import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: IacIncomingCallAbilityRetrofitApi.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00072\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u0005H'¢\u0006\u0004\b\u001e\u0010\u0010J,\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u001f\u001a\u00020\u00052\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/api/e;", "Lcom/avito/android/iac_incoming_call_ability/impl_module/api/a;", "", "micAccess", "pushTokenRegistered", "", "deviceParams", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "", "g", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "availableTimeFrom", "availableTimeTo", "workSchedule", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "iacEnabled", "b", "(Z)Lio/reactivex/rxjava3/core/I;", "checkIacMandatory", "LDL/a;", "c", "(Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/I;", "withItemsCounters", "d", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itemId", SearchParamsConverterKt.SELLER_ID, "type", "e", "deviceToDelete", "deviceToChange", "f", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface e extends a {
    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @o("1/ip-calls/availability/user")
    @J81.e
    @k
    I<TypedResult<Object>> a(@J81.c("availableTimeFrom") @l String availableTimeFrom, @J81.c("availableTimeTo") @l String availableTimeTo, @J81.c("workScheduleType") @l String workSchedule);

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @o("1/ip-calls/availability/user")
    @J81.e
    @k
    I<TypedResult<Object>> b(@J81.c("iacEnabled") boolean iacEnabled);

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @J81.f("2/ip-calls/voip/getOptions")
    @k
    I<TypedResult<DL.a>> c(@l @t("checkIacMandatory") Boolean checkIacMandatory);

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @J81.f("3/ip-calls/voip/getOptions")
    @l
    Object d(@l @t("checkIacMandatory") Boolean bool, @l @t("withItemsCounters") Boolean bool2, @k Continuation<? super TypedResult<DL.a>> continuation);

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @o("1/ip-calls/askForCall")
    @J81.e
    @k
    I<TypedResult<Object>> e(@J81.c("itemId") @k String itemId, @J81.c(SearchParamsConverterKt.SELLER_ID) @k String sellerId, @J81.c("askForCallType") @k String type);

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @o("1/ip-calls/voip/delete-device")
    @J81.e
    @l
    Object f(@J81.c("deviceToDelete") @k String str, @J81.c("deviceToSet") @l String str2, @k Continuation<? super TypedResult<Object>> continuation);

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @o("1/ip-calls/availability/device")
    @J81.e
    @k
    I<TypedResult<Object>> g(@J81.c("micAccess") @l Boolean micAccess, @J81.c("hasRegPushToken") @l Boolean pushTokenRegistered, @J81.c("deviceParams") @l String deviceParams);
}
