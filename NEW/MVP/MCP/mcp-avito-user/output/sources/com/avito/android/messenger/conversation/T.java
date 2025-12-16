package com.avito.android.messenger.conversation;

import androidx.view.InterfaceC23040h0;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import kotlin.Metadata;

/* compiled from: LiveDatas.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class T<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189143b;

    public T(ChannelFragment channelFragment) {
        this.f189143b = channelFragment;
    }

    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != null) {
            com.avito.android.messenger.conversation.mvi.message_menu.d dVar = (com.avito.android.messenger.conversation.mvi.message_menu.d) t12;
            SendMessagePresenter sendMessagePresenter = this.f189143b.f188939G0;
            if (sendMessagePresenter == null) {
                sendMessagePresenter = null;
            }
            sendMessagePresenter.sW(dVar);
        }
    }
}
