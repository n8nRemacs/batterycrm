package com.avito.android.iac_outgoing_call_ability.impl_module.api;

import Y61.k;
import Y61.l;
import com.avito.android.iac_outgoing_call_ability.impl_module.api.remote.CanCallResult;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: IacOutgoingCallAbilityApi.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/a;", "", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    @k
    I<TypedResult<CanCallResult>> a(@l String str, @l String str2, @l String str3, @k String str4, @k String str5, boolean z12, boolean z13, @l String str6);

    @k
    I<TypedResult<RL.b>> b(@k String str, @k String str2, @k String str3);
}
