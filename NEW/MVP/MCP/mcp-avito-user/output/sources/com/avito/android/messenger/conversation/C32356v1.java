package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "fromInputButton", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.v1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32356v1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f195267b;

    public C32356v1(ChannelFragment channelFragment) {
        this.f195267b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        SendMessagePresenter sendMessagePresenter = this.f195267b.f188939G0;
        if (sendMessagePresenter == null) {
            sendMessagePresenter = null;
        }
        sendMessagePresenter.tD(zBooleanValue);
    }
}
