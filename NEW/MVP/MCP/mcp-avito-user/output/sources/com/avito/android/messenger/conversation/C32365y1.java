package com.avito.android.messenger.conversation;

import android.view.View;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: ChannelFragment.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.y1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32365y1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f195276b;

    public C32365y1(ChannelFragment channelFragment) {
        this.f195276b = channelFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SendMessagePresenter.State state = (SendMessagePresenter.State) obj;
        boolean z12 = state.f194418G instanceof SendMessagePresenter.VoiceRecorderState.RecordingInProgress;
        ChannelFragment.a aVar = ChannelFragment.f188932o3;
        ChannelFragment channelFragment = this.f195276b;
        View view = channelFragment.getView();
        if (view != null) {
            view.setKeepScreenOn(z12);
        }
        com.avito.android.messenger.conversation.mvi.send.Q0 q02 = channelFragment.f188942H2;
        if (q02 == null) {
            q02 = null;
        }
        q02.b(state, channelFragment.f188988h3);
    }
}
