package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.messenger.conversation.mvi.context.C31988b;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/Channel;", "newChannel", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/messenger/Channel;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32005t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190398b;

    public C32005t(C31988b c31988b) {
        this.f190398b = c31988b;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f190398b.le().s(new C31988b.C5633b((Channel) obj));
    }
}
