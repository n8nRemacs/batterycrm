package com.avito.android.messenger.conversation;

import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "channelId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class D<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189049b;

    public D(ChannelFragment channelFragment) {
        this.f189049b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        com.avito.android.messenger.conversation.mvi.menu.l lVar = this.f189049b.f188945K0;
        if (lVar == null) {
            lVar = null;
        }
        lVar.q1(str);
    }
}
