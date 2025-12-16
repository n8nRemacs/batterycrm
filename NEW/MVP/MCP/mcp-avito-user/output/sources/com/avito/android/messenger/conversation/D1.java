package com.avito.android.messenger.conversation;

import MY.k;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D1 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.Q<LocalMessage, com.avito.android.persistence.messenger.Q1> f189052m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(ChannelFragment channelFragment, kotlin.Q<LocalMessage, com.avito.android.persistence.messenger.Q1> q12) {
        super(0);
        this.f189051l = channelFragment;
        this.f189052m = q12;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        kotlin.Q<LocalMessage, com.avito.android.persistence.messenger.Q1> q12 = this.f189052m;
        T1.d.b.a aVar = new T1.d.b.a(q12.f406619b.getBody());
        LocalMessage localMessage = q12.f406619b;
        com.avito.android.persistence.messenger.Q1 q13 = q12.f406620c;
        ChannelFragment.a aVar2 = ChannelFragment.f188932o3;
        this.f189051l.D5().accept(new k.a.g(aVar, localMessage, q13, null));
        return kotlin.G0.f406611a;
    }
}
