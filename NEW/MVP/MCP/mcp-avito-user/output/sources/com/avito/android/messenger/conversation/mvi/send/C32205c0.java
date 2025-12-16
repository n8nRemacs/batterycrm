package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.D;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SendMessagePresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/z;", "videoInfo", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/file_attachment/z;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.c0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32205c0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SendMessagePresenter.State f194486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f194487c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D.J f194488d;

    public C32205c0(SendMessagePresenter.State state, D d12, D.J j12) {
        this.f194486b = state;
        this.f194487c = d12;
        this.f194488d = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.messenger.conversation.mvi.file_attachment.z zVar = (com.avito.android.messenger.conversation.mvi.file_attachment.z) obj;
        SendMessagePresenter.State state = this.f194486b;
        MessengerUserHashInfo messengerUserHashInfo = state.f194422b;
        MessengerUserHashInfo messengerUserHashInfo2 = (messengerUserHashInfo == null || messengerUserHashInfo.f430682d.length() <= 0) ? null : messengerUserHashInfo;
        D d12 = this.f194487c;
        if (messengerUserHashInfo2 != null) {
            MessageBody.Video video = new MessageBody.Video(null, null, null);
            InterfaceC32232q interfaceC32232q = d12.f194193V;
            D.J j12 = this.f194488d;
            return interfaceC32232q.e(messengerUserHashInfo2, video, j12.f194237d, j12.f194239f, zVar.f190760a, state.f194414C).k(new Z(d12)).r(new C32201a0(state)).i(new C32203b0(d12));
        }
        V2 v22 = V2.f318762a;
        String str = d12.f207131E;
        StringBuilder sb2 = new StringBuilder("Video upload not started since currentUserId=");
        MessengerUserHashInfo messengerUserHashInfo3 = state.f194422b;
        sb2.append(messengerUserHashInfo3 != null ? messengerUserHashInfo3.f430682d : null);
        v22.c(str, sb2.toString(), null);
        return io.reactivex.rxjava3.core.I.q(state);
    }
}
