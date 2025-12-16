package com.avito.android.messenger.conversation.mvi.messages;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/P0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class O<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c f192093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.c.b f192094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c f192095d;

    public O(InterfaceC32129a.c cVar, C32141e.c.b bVar, InterfaceC32129a.c cVar2) {
        this.f192093b = cVar;
        this.f192094c = bVar;
        this.f192095d = cVar2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            return io.reactivex.rxjava3.core.I.q(InterfaceC32129a.c.C5680c.a((InterfaceC32129a.c.C5680c) this.f192093b, null, new InterfaceC32129a.b.c(false, null, 2, null), 0, 13));
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        long jLongValue = ((Number) ((C23703n1) y02).f56288b).longValue();
        InterfaceC32129a.c.C5680c c5680c = (InterfaceC32129a.c.C5680c) this.f192095d;
        C32141e.c.b bVar = this.f192094c;
        Integer num = bVar.f192938d;
        C32141e.c cVar = C32141e.c.this;
        C32141e c32141e = C32141e.this;
        io.reactivex.rxjava3.core.I<Integer> iB2 = c32141e.f192903W.b(cVar.f192929d, c32141e.f192907a0, 1, Long.valueOf(jLongValue), num);
        C32141e c32141e2 = C32141e.this;
        return iB2.n(new L(c5680c, cVar, c32141e2, num)).t(new N(c5680c, cVar, c32141e2, num));
    }
}
