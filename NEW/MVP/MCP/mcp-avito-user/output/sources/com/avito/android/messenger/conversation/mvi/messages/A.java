package com.avito.android.messenger.conversation.mvi.messages;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.messages.C32141e;
import com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/P0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class A<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f192023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32141e.c f192024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C32141e.c.a f192025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f192026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c.C5680c f192027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C32141e.c.a f192028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32129a.c.C5680c f192029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C32141e.c f192030i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f192031j;

    public A(C32141e c32141e, C32141e.c cVar, C32141e.c.a aVar, long j12, InterfaceC32129a.c.C5680c c5680c, C32141e.c.a aVar2, InterfaceC32129a.c.C5680c c5680c2, C32141e.c cVar2, long j13) {
        this.f192023b = c32141e;
        this.f192024c = cVar;
        this.f192025d = aVar;
        this.f192026e = j12;
        this.f192027f = c5680c;
        this.f192028g = aVar2;
        this.f192029h = c5680c2;
        this.f192030i = cVar2;
        this.f192031j = j13;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        boolean z12 = y02 instanceof X0;
        C32141e c32141e = this.f192023b;
        if (z12) {
            com.avito.android.messenger.conversation.mvi.sync.K k12 = c32141e.f192903W;
            C32141e.c cVar = this.f192024c;
            MessengerUserHashInfo messengerUserHashInfo = cVar.f192929d;
            C32141e.c.a aVar = this.f192025d;
            io.reactivex.rxjava3.core.I iD2 = k12.d(messengerUserHashInfo, c32141e.f192907a0, aVar.f192935d, (16 & 8) != 0 ? null : null, (16 & 16) != 0 ? null : Long.valueOf(this.f192026e), aVar.f192936e);
            InterfaceC32129a.c.C5680c c5680c = this.f192027f;
            return iD2.n(new C(c32141e, cVar, c5680c)).t(new E(c5680c, aVar, cVar, c32141e));
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        int iIntValue = ((Number) ((C23703n1) y02).f56288b).intValue();
        C32141e.c.a aVar2 = this.f192028g;
        Integer num = aVar2.f192936e;
        c32141e.getClass();
        int iNe = C32141e.ne(iIntValue, num);
        Integer num2 = aVar2.f192936e;
        int iIntValue2 = (num2 != null ? num2.intValue() : 100) * iNe;
        int iNe2 = iNe - C32141e.ne(this.f192029h.f192129c, null);
        return c32141e.f192903W.b(this.f192030i.f192929d, c32141e.f192907a0, iNe2, Long.valueOf(this.f192031j), aVar2.f192936e).n(new G(this.f192023b, this.f192030i, iNe, iIntValue2, this.f192029h)).t(new I(this.f192023b, this.f192030i, iNe, iIntValue2, this.f192029h));
    }
}
