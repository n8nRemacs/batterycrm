package com.avito.android.messenger.conversation.mvi.platform_actions;

import arrow.core.Z0;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformActionsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "contextInteractorState", "Larrow/core/Y0;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/f$c;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final o<T, R> f194031b = new o<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) obj;
        com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
        f.c cVar = null;
        if (bVar instanceof b.d) {
            Channel channel = (Channel) ((b.d) bVar).f207035a;
            String channelId = channel.getChannelId();
            String flow = channel.getFlow();
            PlatformActions contextActions = channel.getContextActions();
            if (contextActions == null) {
                contextActions = new PlatformActions.None(null);
            }
            cVar = new f.c(c5631a.f190236a, channelId, flow, contextActions);
        }
        return Z0.b(cVar);
    }
}
