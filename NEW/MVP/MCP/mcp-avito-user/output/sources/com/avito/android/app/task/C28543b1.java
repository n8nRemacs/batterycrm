package com.avito.android.app.task;

import arrow.core.C23703n1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PendingMessageHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "messageOption", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.b1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28543b1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f91575c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f91576d;

    public C28543b1(C28582o1 c28582o1, io.reactivex.rxjava3.core.H h12, MessengerUserHashInfo messengerUserHashInfo) {
        this.f91574b = c28582o1;
        this.f91575c = h12;
        this.f91576d = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            return new C41826q(new com.avito.android.advert_core.task.a(1));
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        LocalMessage localMessage = (LocalMessage) ((C23703n1) y02).f56288b;
        C28582o1 c28582o1 = this.f91574b;
        return new io.reactivex.rxjava3.internal.operators.mixed.v(c28582o1.f91668a.state().d0(X0.f91555b).B(Y0.f91557a), new C28540a1(c28582o1, localMessage, this.f91575c, this.f91576d));
    }
}
