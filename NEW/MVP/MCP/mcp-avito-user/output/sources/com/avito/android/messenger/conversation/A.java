package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.mvi.menu.t;
import com.avito.android.mvi.e;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/t$e;", "curState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/menu/t$e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f188872b;

    public A(ChannelFragment channelFragment) {
        this.f188872b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        t.e eVar = (t.e) obj;
        com.avito.android.messenger.conversation.mvi.menu.u uVar = this.f188872b.f188953Q2;
        if (uVar == null) {
            uVar = null;
        }
        uVar.getClass();
        e.a.a(uVar, eVar);
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" Rendered ");
        sb2.append(eVar);
        v22.g("ChannelFragment", sb2.toString());
    }
}
