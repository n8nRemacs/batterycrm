package com.avito.android.messenger.conversation;

import android.view.View;
import com.avito.android.messenger.conversation.mvi.voice.r0;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/r0;", "playbackState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/voice/r0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.z1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32368z1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f195279b;

    public C32368z1(ChannelFragment channelFragment) {
        this.f195279b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.messenger.conversation.mvi.voice.r0 r0Var = (com.avito.android.messenger.conversation.mvi.voice.r0) obj;
        ChannelFragment channelFragment = this.f195279b;
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = channelFragment.f189001o1;
        if (q0Var == null) {
            q0Var = null;
        }
        q0Var.f193107e.f193616c.setValue(r0Var);
        boolean z12 = r0Var instanceof r0.b;
        View view = channelFragment.getView();
        if (view == null) {
            return;
        }
        view.setKeepScreenOn(z12);
    }
}
