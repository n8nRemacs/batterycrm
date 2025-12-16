package com.avito.android.messenger.conversation.mvi.send;

import arrow.core.C23703n1;
import com.avito.android.messenger.conversation.mvi.send.D;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.Quote;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "apply", "(Larrow/core/Y0;)Ljava/lang/Object;", "com/avito/android/util/rx3/R0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class C<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SendMessagePresenter.State f194178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D.C32190a f194179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SendMessagePresenter.State f194180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f194181e;

    public C(SendMessagePresenter.State state, D.C32190a c32190a, SendMessagePresenter.State state2, D d12) {
        this.f194178b = state;
        this.f194179c = c32190a;
        this.f194180d = state2;
        this.f194181e = d12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        if (y02 instanceof arrow.core.X0) {
            return this.f194178b;
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        LocalMessage localMessage = (LocalMessage) ((C23703n1) y02).f56288b;
        D.C32190a c32190a = this.f194179c;
        c32190a.getClass();
        String remoteId = localMessage.getRemoteId();
        if (remoteId == null) {
            remoteId = "";
        }
        Quote quote = new Quote(remoteId, localMessage.getBody(), localMessage.getCreated(), localMessage.getFromId(), c32190a.f194242d.getF191620d());
        D d12 = this.f194181e;
        SendMessagePresenter.State state = this.f194180d;
        return SendMessagePresenter.State.a(state, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, quote, D.oe(d12, state, quote, null, null, 6), null, null, null, false, null, null, -402653185, 7);
    }
}
