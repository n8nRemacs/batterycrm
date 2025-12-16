package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.send.D;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SendMessagePresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/m;", "fileInfo", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/send/SendMessagePresenter$State;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/file_attachment/m;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class J<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SendMessagePresenter.State f194281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f194282c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D.o f194283d;

    public J(SendMessagePresenter.State state, D d12, D.o oVar) {
        this.f194281b = state;
        this.f194282c = d12;
        this.f194283d = oVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.messenger.conversation.mvi.file_attachment.m mVar = (com.avito.android.messenger.conversation.mvi.file_attachment.m) obj;
        SendMessagePresenter.State state = this.f194281b;
        MessengerUserHashInfo messengerUserHashInfo = state.f194422b;
        if (messengerUserHashInfo == null || messengerUserHashInfo.f430682d.length() <= 0) {
            messengerUserHashInfo = null;
        }
        D d12 = this.f194282c;
        if (messengerUserHashInfo != null) {
            return d12.f194193V.i(messengerUserHashInfo, new MessageBody.File("", mVar.f190719a, mVar.f190721c, mVar.f190720b, null), this.f194283d.f194255d, state.f194414C).r(new G(state)).k(new H(d12)).i(new I(d12));
        }
        V2 v22 = V2.f318762a;
        String str = d12.f207131E;
        StringBuilder sb2 = new StringBuilder("File upload not started since currentUserId=");
        MessengerUserHashInfo messengerUserHashInfo2 = state.f194422b;
        sb2.append(messengerUserHashInfo2 != null ? messengerUserHashInfo2.f430682d : null);
        v22.c(str, sb2.toString(), null);
        return io.reactivex.rxjava3.core.I.q(state);
    }
}
