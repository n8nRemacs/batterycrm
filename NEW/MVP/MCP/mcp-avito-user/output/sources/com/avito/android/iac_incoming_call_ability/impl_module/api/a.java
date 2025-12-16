package com.avito.android.iac_incoming_call_ability.impl_module.api;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: IacIncomingCallAbilityApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/api/a;", "", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: IacIncomingCallAbilityApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_incoming_call_ability.impl_module.api.a$a, reason: collision with other inner class name */
    public static final class C4974a {
    }

    @k
    I<TypedResult<Object>> a(@l String str, @l String str2, @l String str3);

    @k
    I<TypedResult<Object>> b(boolean z12);

    @k
    I<TypedResult<DL.a>> c(@l Boolean bool);

    @l
    Object d(@l Boolean bool, @l Boolean bool2, @k Continuation<? super TypedResult<DL.a>> continuation);

    @k
    I<TypedResult<Object>> e(@k String str, @k String str2, @k String str3);

    @l
    Object f(@k String str, @l String str2, @k Continuation<? super TypedResult<Object>> continuation);

    @k
    I<TypedResult<Object>> g(@l Boolean bool, @l Boolean bool2, @l String str);
}
