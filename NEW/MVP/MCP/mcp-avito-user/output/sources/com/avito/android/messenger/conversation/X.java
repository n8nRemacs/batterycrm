package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.mvi.e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class X<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189246b;

    public X(ChannelFragment channelFragment) {
        this.f189246b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        l.a aVar = (l.a) obj;
        com.avito.android.messenger.conversation.mvi.message_menu.t tVar = this.f189246b.f188959T2;
        if (tVar == null) {
            tVar = null;
        }
        tVar.getClass();
        e.a.a(tVar, aVar);
    }
}
