package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: SendMessagePresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.l0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32223l0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194528b;

    public C32223l0(D d12) {
        this.f194528b = d12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str;
        SendMessagePresenter.IncidentWarning incidentWarning;
        SendMessagePresenter.State state = (SendMessagePresenter.State) obj;
        if ((kotlin.jvm.internal.L.f(state.f194425e, Boolean.TRUE) && state.f194426f != null && ((incidentWarning = state.f194421J) == null || !incidentWarning.f194407b)) || (str = state.f194446z) == null || C43066x.K(str)) {
            return;
        }
        this.f194528b.f194183A0.postValue(str);
    }
}
