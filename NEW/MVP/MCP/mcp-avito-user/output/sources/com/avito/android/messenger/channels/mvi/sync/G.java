package com.avito.android.messenger.channels.mvi.sync;

import IY.a;
import com.avito.android.C30277e1;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.Collections;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessageUpdate;

/* compiled from: ChannelsBackendNotificationsHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "event", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/messenger/channels/mvi/sync/I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class G<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J f188332c;

    public G(MessengerUserHashInfo messengerUserHashInfo, J j12) {
        this.f188331b = messengerUserHashInfo;
        this.f188332c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ChatMessage message = ((ChatMessageUpdate) obj).getMessage();
        J j12 = this.f188332c;
        C31834f0 c31834f0 = j12.f188346g;
        MessengerUserHashInfo messengerUserHashInfo = this.f188331b;
        AbstractC41768a abstractC41768aA = c31834f0.a(messengerUserHashInfo, message);
        io.reactivex.rxjava3.internal.operators.completable.v vVar = new io.reactivex.rxjava3.internal.operators.completable.v(j12.f188343d.t(abstractC41768aA.B(kotlin.G0.f406611a), "handleNewMessageEvent", Collections.singleton(new a.b(message.getChannelId())), j12.f188344e));
        C30277e1 c30277e1 = j12.f188348i;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[106];
        return ((Boolean) c30277e1.f145000a1.a().invoke()).booleanValue() ? vVar.g(j12.f188347h.c(message, messengerUserHashInfo, false)) : vVar;
    }
}
