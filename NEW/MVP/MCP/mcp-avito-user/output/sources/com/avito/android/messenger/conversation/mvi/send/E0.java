package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", VoiceInfo.STATE, "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class E0<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final E0<T> f194272b = new E0<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        String str;
        SendMessagePresenter.State state = (SendMessagePresenter.State) obj;
        MessengerUserHashInfo messengerUserHashInfo = state.f194422b;
        String str2 = messengerUserHashInfo != null ? messengerUserHashInfo.f430682d : null;
        return (str2 == null || C43066x.K(str2) || (str = state.f194426f) == null || C43066x.K(str)) ? false : true;
    }
}
