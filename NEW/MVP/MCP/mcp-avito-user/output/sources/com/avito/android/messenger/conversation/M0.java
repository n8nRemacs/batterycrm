package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.mvi.message_scrollable_suggests.g;
import com.avito.android.messenger.conversation.mvi.send.P0;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/g$a;", "kotlin.jvm.PlatformType", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/message_scrollable_suggests/g$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class M0 extends kotlin.jvm.internal.N implements Y41.l<g.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189116l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(ChannelFragment channelFragment) {
        super(1);
        this.f189116l = channelFragment;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(g.a aVar) {
        g.a aVar2 = aVar;
        com.avito.android.messenger.conversation.mvi.send.Q0 q02 = this.f189116l.f188942H2;
        if (q02 == null) {
            q02 = null;
        }
        P0.a.a(q02, aVar2.f191847a, true);
        return kotlin.G0.f406611a;
    }
}
