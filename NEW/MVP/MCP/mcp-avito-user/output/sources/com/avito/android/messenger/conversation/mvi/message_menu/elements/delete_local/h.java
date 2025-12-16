package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: Singles.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/P0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class h<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f191652b;

    public h(m mVar) {
        this.f191652b = mVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC41768a abstractC41768aQ;
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            return I.q(Boolean.FALSE);
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        LocalMessage localMessage = (LocalMessage) ((C23703n1) y02).f56288b;
        if (localMessage.getRemoteId() != null) {
            return I.q(Boolean.FALSE);
        }
        m mVar = this.f191652b;
        mVar.getClass();
        MessageBody body = localMessage.getBody();
        boolean z12 = body instanceof MessageBody.LocalImage;
        InterfaceC32024m interfaceC32024m = mVar.f191660a;
        InterfaceC35745a5 interfaceC35745a5 = mVar.f191663d;
        if (z12) {
            abstractC41768aQ = interfaceC32024m.N(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).x(interfaceC35745a5.a()).q(interfaceC35745a5.a()).g(new C41826q(new GL.a(13, mVar, (MessageBody.LocalImage) body)));
        } else if (body instanceof MessageBody.File) {
            abstractC41768aQ = interfaceC32024m.Z(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).z(interfaceC35745a5.a()).s(interfaceC35745a5.a()).o(new i(mVar, localMessage));
        } else if (body instanceof MessageBody.Voice) {
            abstractC41768aQ = interfaceC32024m.Z(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).z(interfaceC35745a5.a()).s(interfaceC35745a5.a()).o(new j(mVar, localMessage));
        } else if (body instanceof MessageBody.Video) {
            abstractC41768aQ = interfaceC32024m.Z(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).z(interfaceC35745a5.a()).s(interfaceC35745a5.a()).o(new k(mVar, localMessage));
        } else {
            abstractC41768aQ = interfaceC32024m.N(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).x(interfaceC35745a5.a()).q(interfaceC35745a5.a());
        }
        return abstractC41768aQ.B(Boolean.TRUE);
    }
}
