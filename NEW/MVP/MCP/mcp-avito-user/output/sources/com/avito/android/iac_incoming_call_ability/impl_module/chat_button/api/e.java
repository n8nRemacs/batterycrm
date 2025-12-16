package com.avito.android.iac_incoming_call_ability.impl_module.chat_button.api;

import J81.o;
import Y61.k;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;

/* compiled from: IacChannelButtonsRetrofitApi.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/chat_button/api/e;", "Lcom/avito/android/iac_incoming_call_ability/impl_module/chat_button/api/a;", "", "channelId", "Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/I;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes14.dex */
public interface e extends a {
    @Override // com.avito.android.iac_incoming_call_ability.impl_module.chat_button.api.a
    @o("1/ip-calls/closeChatButtons")
    @J81.e
    @k
    I<TypedResult<Object>> a(@J81.c("channelId") @k String channelId);
}
