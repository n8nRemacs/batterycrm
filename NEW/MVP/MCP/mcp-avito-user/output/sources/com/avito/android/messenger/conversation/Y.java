package com.avito.android.messenger.conversation;

import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189248b;

    public Y(ChannelFragment channelFragment) {
        this.f189248b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.messenger.conversation.mvi.message_menu.l lVar = this.f189248b.f188949O0;
        if (lVar == null) {
            lVar = null;
        }
        lVar.Sd();
    }
}
