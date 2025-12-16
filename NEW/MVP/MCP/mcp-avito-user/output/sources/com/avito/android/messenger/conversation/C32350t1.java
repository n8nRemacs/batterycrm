package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.t1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32350t1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f195249b;

    public C32350t1(ChannelFragment channelFragment) {
        this.f195249b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SendMessagePresenter sendMessagePresenter = this.f195249b.f188939G0;
        if (sendMessagePresenter == null) {
            sendMessagePresenter = null;
        }
        sendMessagePresenter.TW();
    }
}
