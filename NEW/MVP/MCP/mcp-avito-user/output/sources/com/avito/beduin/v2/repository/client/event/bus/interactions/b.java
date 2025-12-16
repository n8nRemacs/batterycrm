package com.avito.beduin.v2.repository.client.event.bus.interactions;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.repository.flow.C36328a;
import dU0.f;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientEventBusRepositoryObserveInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.client.event.bus.interactions.ClientEventBusRepositoryObserveInteractionHandler$handle$1", f = "ClientEventBusRepositoryObserveInteractionHandler.kt", i = {}, l = {35, 44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements q<InterfaceC43172j<? super f>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338179q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f338180r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f338181s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f338182t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f338183u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f338184v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, e eVar, InterfaceC36238a interfaceC36238a, Continuation<? super b> continuation) {
        super(3, continuation);
        this.f338182t = aVar;
        this.f338183u = eVar;
        this.f338184v = interfaceC36238a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super f> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        b bVar = new b(this.f338182t, this.f338183u, this.f338184v, continuation);
        bVar.f338180r = interfaceC43172j;
        bVar.f338181s = th2;
        return bVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f338179q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f338180r;
            Throwable th2 = this.f338181s;
            a aVar = this.f338182t;
            if (th2 == null) {
                f fVarInvoke = aVar.f337754b.invoke();
                if (fVarInvoke != null) {
                    this.f338180r = null;
                    this.f338179q = 1;
                    if (interfaceC43172j.emit(fVarInvoke, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (!(th2 instanceof CancellationException)) {
                Y41.l<com.avito.beduin.v2.engine.field.d, f> lVar = aVar.f337755c;
                C36272i c36272iC = this.f338184v.c();
                this.f338183u.getClass();
                f fVarInvoke2 = lVar.invoke(C36328a.b(th2, c36272iC));
                if (fVarInvoke2 != null) {
                    this.f338180r = null;
                    this.f338179q = 2;
                    if (interfaceC43172j.emit(fVarInvoke2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
