package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.mvi.context.d0;
import com.avito.android.mvi.e;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/d0$c;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/context/d0$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32334o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f195231b;

    public C32334o(ChannelFragment channelFragment) {
        this.f195231b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        d0.c cVar = (d0.c) obj;
        com.avito.android.messenger.conversation.mvi.context.f0 f0Var = this.f195231b.f188951P2;
        if (f0Var == null) {
            f0Var = null;
        }
        f0Var.getClass();
        e.a.a(f0Var, cVar);
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" Rendered ");
        sb2.append(cVar);
        v22.g("ChannelFragment", sb2.toString());
    }
}
