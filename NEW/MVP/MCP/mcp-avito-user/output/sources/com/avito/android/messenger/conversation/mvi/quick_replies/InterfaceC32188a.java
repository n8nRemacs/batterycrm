package com.avito.android.messenger.conversation.mvi.quick_replies;

import com.avito.android.remote.model.messenger.quick_replies.QuickRepliesResponse;
import io.reactivex.rxjava3.core.I;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: QuickRepliesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32188a {
    @Y61.k
    I a(@Y61.k String str);

    @Y61.k
    I<G0> deleteQuickReply(@Y61.k String str);

    @Y61.k
    I<QuickRepliesResponse> getQuickReplies();
}
