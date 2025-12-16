package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.messenger.conversation.mvi.context.W;
import com.avito.android.messenger.conversation.mvi.context.W.b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/W$a;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/context/W$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class Z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f190233b;

    public Z(W w12) {
        this.f190233b = w12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        W w12 = this.f190233b;
        w12.le().s(w12.new b((W.a) obj));
    }
}
