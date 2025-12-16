package com.avito.android.messenger.conversation.mvi.platform_actions;

import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.context_actions.RecommendationsResponse;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PlatformActionsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.platform_actions.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32187a {
    @Y61.k
    I<RawJson> a(@Y61.k String str, @Y61.l RawJson rawJson);

    @Y61.k
    I<RecommendationsResponse> b(@Y61.k String str, @Y61.l RawJson rawJson);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.A c(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);
}
