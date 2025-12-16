package com.avito.android.messenger.conversation;

import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$SuggestItem;", "clickedSuggest", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$SuggestItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.f0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31931f0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189638b;

    public C31931f0(ChannelFragment channelFragment) {
        this.f189638b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        MessageSuggestsView.SuggestItem suggestItem = (MessageSuggestsView.SuggestItem) obj;
        ChannelFragment channelFragment = this.f189638b;
        com.avito.android.messenger.conversation.mvi.message_suggests.s sVar = channelFragment.f188947M0;
        if (sVar == null) {
            sVar = null;
        }
        sVar.S2(suggestItem);
        InterfaceC28373a interfaceC28373a = channelFragment.f189006t0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        StringBuilder sb2 = new StringBuilder("clickToSendIcebreakers.channel.");
        u3.g<SimpleTestGroupWithNone> gVar = channelFragment.f188997m1;
        if (gVar == null) {
            gVar = null;
        }
        sb2.append(gVar.f439742a.f439749b.name());
        interfaceC28373a.c(new y.a(sb2.toString(), 0L, 2, null));
        u3.g<SimpleTestGroupWithNone> gVar2 = channelFragment.f188997m1;
        if (gVar2 == null) {
            gVar2 = null;
        }
        if (gVar2.f439742a.f439749b.a()) {
            u3.g<SimpleTestGroupWithNone> gVar3 = channelFragment.f188997m1;
            if (gVar3 == null) {
                gVar3 = null;
            }
            gVar3.b();
        }
        u3.g<SimpleTestGroupWithNone> gVar4 = channelFragment.f188997m1;
        if (gVar4 == null) {
            gVar4 = null;
        }
        if (gVar4.f439742a.f439749b.b()) {
            SendMessagePresenter sendMessagePresenter = channelFragment.f188939G0;
            (sendMessagePresenter != null ? sendMessagePresenter : null).gw(suggestItem.f191927c);
        } else {
            SendMessagePresenter sendMessagePresenter2 = channelFragment.f188939G0;
            (sendMessagePresenter2 != null ? sendMessagePresenter2 : null).De(suggestItem);
        }
    }
}
