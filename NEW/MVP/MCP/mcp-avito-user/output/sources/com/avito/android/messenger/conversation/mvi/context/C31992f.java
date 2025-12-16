package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.messenger.conversation.mvi.context.C31988b;
import io.reactivex.rxjava3.internal.operators.observable.M0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31992f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190369b;

    public C31992f(C31988b c31988b) {
        this.f190369b = c31988b;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C31988b c31988b = this.f190369b;
        c31988b.f190257l0.e();
        hu.akarnokd.rxjava3.schedulers.c cVar = new hu.akarnokd.rxjava3.schedulers.c(c31988b.f207133K.a());
        io.reactivex.rxjava3.disposables.d dVarQ = io.reactivex.rxjava3.disposables.d.Q(new C31684n(cVar, 0));
        io.reactivex.rxjava3.disposables.c cVar2 = c31988b.f190257l0;
        cVar2.b(dVarQ);
        M0 m02 = new M0(com.avito.android.util.rx3.arrow.b.a(c31988b.f190242W.g().j0(cVar).d0(S.f190194b)).x0(cVar));
        H h12 = new H(c31988b);
        C31988b.l lVar = new C31988b.l(new C32000n(c31988b, "Non-blank user Id"));
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar2.b(m02.v0(h12, lVar, interfaceC43543a));
        cVar2.b(new io.reactivex.rxjava3.internal.operators.observable.Z(m02.y0(new C32007v(c31988b)).j0(cVar).Z(new C31988b.m(C32008w.f190402b)), new A(c31988b)).x(cVar).v(B.f190172b, new C31988b.l(new C32000n(c31988b, "ChatTypingEvent"))));
        cVar2.b(m02.y0(new N(c31988b)).j0(cVar).v0(new O(c31988b), new C31988b.l(new C32000n(c31988b, "New messages")), interfaceC43543a));
        cVar2.b(com.avito.android.util.rx3.arrow.b.a(m02.y0(new C32004s(c31988b)).j0(cVar)).v0(new C32005t(c31988b), new C31988b.l(new C32000n(c31988b, "channelRepo.getChannel()")), interfaceC43543a));
        io.reactivex.rxjava3.disposables.d dVarV0 = m02.y0(new J(c31988b)).x0(cVar).j0(cVar).v0(new K(c31988b), new C31988b.l(new C32000n(c31988b, "PinnedChatEvent|UnpinnedChatEvent")), interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar3 = c31988b.f190256k0;
        cVar3.b(dVarV0);
        cVar2.b(m02.N0());
        cVar2.b(c31988b.f207139Q.d0(new C32003q()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).j0(cVar).v0(new r(c31988b), new C31988b.l(new C32000n(c31988b, "State")), interfaceC43543a));
        cVar3.b(cVar2);
    }
}
