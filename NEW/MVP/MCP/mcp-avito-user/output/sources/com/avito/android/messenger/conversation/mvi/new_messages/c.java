package com.avito.android.messenger.conversation.mvi.new_messages;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import l41.o;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: NewMessagesPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/E;", "", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f193771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35745a5 f193772c;

    public c(g gVar, InterfaceC35745a5 interfaceC35745a5) {
        this.f193771b = gVar;
        this.f193772c = interfaceC35745a5;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        if (messengerUserHashInfo.f430682d.length() <= 0) {
            return U.f403867b;
        }
        g gVar = this.f193771b;
        return gVar.f193777W.Q(gVar.f193776V, messengerUserHashInfo).x0(this.f193772c.a());
    }
}
