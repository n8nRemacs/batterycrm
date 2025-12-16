package com.avito.android.messenger.conversation.mvi.voice;

import kotlin.Metadata;

/* compiled from: VoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a \u0012\u001c\b\u0001\u0012\u0018\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/voice/N;", "kotlin.jvm.PlatformType", "command", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lcom/avito/android/remote/model/User;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/voice/N;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class V<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f195090b;

    public V(a0 a0Var) {
        this.f195090b = a0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        N n12 = (N) obj;
        a0 a0Var = this.f195090b;
        return a0Var.f195124K.b(n12.getF195083a().getFromId(), n12.getF195083a().getChannelId(), com.avito.android.messenger.util.i.c(n12.getF195083a())).z(a0Var.f195122E.a()).r(new U(n12));
    }
}
