package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$SuggestItem;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$SuggestItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class N0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g f189121b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189122c;

    public N0(com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g gVar, ChannelFragment channelFragment) {
        this.f189121b = gVar;
        this.f189122c = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        MessageSuggestsView.SuggestItem suggestItem = (MessageSuggestsView.SuggestItem) obj;
        this.f189121b.Uc(suggestItem);
        SendMessagePresenter sendMessagePresenter = this.f189122c.f188939G0;
        if (sendMessagePresenter == null) {
            sendMessagePresenter = null;
        }
        sendMessagePresenter.De(suggestItem);
    }
}
