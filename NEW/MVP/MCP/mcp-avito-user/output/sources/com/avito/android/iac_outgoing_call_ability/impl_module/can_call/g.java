package com.avito.android.iac_outgoing_call_ability.impl_module.can_call;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.iac_outgoing_call_ability.impl_module.api.remote.CanCallResult;
import kotlin.Metadata;

/* compiled from: IacCanCallResultFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/can_call/g;", "", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface g {
    @Y61.k
    IacCanCallResult a(@Y61.k CanCallResult canCallResult, @Y61.k String str, @Y61.k IacCallContext iacCallContext, @Y61.l DeepLink deepLink, @Y61.l String str2);

    @Y61.k
    IacCanCallResult b(@Y61.k RL.b bVar, @Y61.k String str, @Y61.k String str2, @Y61.l DeepLink deepLink);
}
