package com.avito.android.messenger.conversation;

import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "actionId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189250b;

    public Z(ChannelFragment channelFragment) {
        this.f189250b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        com.avito.android.messenger.conversation.mvi.message_menu.l lVar = this.f189250b.f188949O0;
        if (lVar == null) {
            lVar = null;
        }
        lVar.y9(str);
    }
}
