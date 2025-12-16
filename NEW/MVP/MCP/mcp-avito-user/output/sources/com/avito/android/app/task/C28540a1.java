package com.avito.android.app.task;

import arrow.core.C23703n1;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41821l;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PendingMessageHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "", "connectedTimestamp", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.a1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28540a1<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91570c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.core.H f91571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f91572e;

    public C28540a1(C28582o1 c28582o1, LocalMessage localMessage, io.reactivex.rxjava3.core.H h12, MessengerUserHashInfo messengerUserHashInfo) {
        this.f91569b = c28582o1;
        this.f91570c = localMessage;
        this.f91571d = h12;
        this.f91572e = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC41768a c41821l;
        arrow.core.Y0 y02 = (arrow.core.Y0) obj;
        boolean z12 = y02 instanceof arrow.core.X0;
        C28582o1 c28582o1 = this.f91569b;
        LocalMessage localMessage = this.f91570c;
        io.reactivex.rxjava3.core.H h12 = this.f91571d;
        if (z12) {
            C28607x0 c28607x0A = c28582o1.f91673f.a(localMessage);
            long jB2 = kotlin.ranges.s.b((((Number) c28582o1.f91679l.getValue()).longValue() + MessengerTimestamp.INSTANCE.toMillis(localMessage.getCreated())) - c28582o1.f91672e.now(), 0L);
            V2 v22 = V2.f318762a;
            StringBuilder sbQ = androidx.compose.foundation.H.q(jB2, "Message will expire in ", " ms: ");
            sbQ.append(localMessage.getLocalId());
            v22.i("PendingMessageHandler", sbQ.toString(), null);
            c41821l = io.reactivex.rxjava3.core.I.C(jB2, TimeUnit.MILLISECONDS, c28582o1.f91675h.c()).o(new C28549d1(c28582o1, localMessage, h12, c28607x0A));
        } else {
            if (!(y02 instanceof C23703n1)) {
                throw new NoWhenBranchMatchedException();
            }
            long jLongValue = ((Number) ((C23703n1) y02).f56288b).longValue();
            C28607x0 c28607x0A2 = c28582o1.f91673f.a(localMessage);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            long jB3 = kotlin.ranges.s.b((((Number) c28582o1.f91679l.getValue()).longValue() + MessengerTimestamp.INSTANCE.toMillis(localMessage.getCreated())) - c28582o1.f91672e.now(), 0L);
            V2 v23 = V2.f318762a;
            StringBuilder sbQ2 = androidx.compose.foundation.H.q(jB3, "Message will expire in ", " ms: ");
            sbQ2.append(localMessage.getLocalId());
            v23.i("PendingMessageHandler", sbQ2.toString(), null);
            if (jB3 > 0) {
                c41821l = c28582o1.f91671d.a(localMessage, this.f91572e, Boolean.valueOf(System.currentTimeMillis() - jLongValue > 5000 && atomicInteger.get() == 0)).j(new C28564i1(c28607x0A2, c28582o1, localMessage, atomicInteger)).w(new V0(atomicInteger, localMessage, c28582o1)).B(jB3, TimeUnit.MILLISECONDS, c28582o1.f91675h.c(), null).o(new C28570k1(c28582o1, c28607x0A2, atomicInteger)).s(new C28576m1(c28582o1, localMessage, h12, c28607x0A2, atomicInteger));
            } else {
                c41821l = new C41821l(c28582o1.f91670c.B(Collections.singletonList(localMessage.getLocalId())).x(h12).q(h12).n(new C28579n1(c28607x0A2)), new Q0(c28582o1, c28607x0A2, localMessage, 0));
            }
        }
        return c41821l.l(new Z0(localMessage));
    }
}
