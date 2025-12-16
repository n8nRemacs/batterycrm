package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.send.D;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "contextInteractorState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32231p0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194545b;

    public C32231p0(D d12) {
        this.f194545b = d12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.mvi.b<Channel> bVar = ((InterfaceC31987a.C5631a) obj).f190237b;
        if (bVar instanceof b.d) {
            Channel channel = (Channel) ((b.d) bVar).f207035a;
            com.avito.android.mvi.rx3.with_monolithic_state.t<SendMessagePresenter.State> tVarLe = this.f194545b.le();
            ChannelContext context = channel.getContext();
            ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
            tVarLe.s(new D.C32197i(item != null ? item.getCategoryId() : null));
        }
    }
}
