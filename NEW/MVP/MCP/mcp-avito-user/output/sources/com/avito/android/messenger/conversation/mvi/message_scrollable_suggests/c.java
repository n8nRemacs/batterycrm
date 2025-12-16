package com.avito.android.messenger.conversation.mvi.message_scrollable_suggests;

import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggestsResponse;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MessageScrollSuggestsInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;", "resp", "Lcom/avito/android/messenger/conversation/mvi/message_suggests/a$b;", "apply", "(Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;)Lcom/avito/android/messenger/conversation/mvi/message_suggests/a$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final c<T, R> f191840b = new c<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        MessageSuggestsResponse messageSuggestsResponse = (MessageSuggestsResponse) obj;
        String title = messageSuggestsResponse.getTitle();
        List<MessageSuggest> suggestList = messageSuggestsResponse.getSuggestList();
        Boolean hideChatButtons = messageSuggestsResponse.getHideChatButtons();
        return new InterfaceC32119a.b(title, suggestList, false, hideChatButtons != null ? hideChatButtons.booleanValue() : false);
    }
}
