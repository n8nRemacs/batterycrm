package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.mvi.message_suggests.MessageSuggestsView;
import com.avito.android.mvi.e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/message_suggests/MessageSuggestsView$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.e0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31928e0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189635b;

    public C31928e0(ChannelFragment channelFragment) {
        this.f189635b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        MessageSuggestsView.b bVar = (MessageSuggestsView.b) obj;
        com.avito.android.messenger.conversation.mvi.message_suggests.H h12 = this.f189635b.f188955R2;
        if (h12 == null) {
            h12 = null;
        }
        h12.getClass();
        e.a.a(h12, bVar);
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" Rendered ");
        sb2.append(bVar);
        v22.g("ChannelFragment", sb2.toString());
    }
}
