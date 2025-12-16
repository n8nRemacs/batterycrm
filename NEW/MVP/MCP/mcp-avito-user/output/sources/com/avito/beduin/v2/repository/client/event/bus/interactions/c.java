package com.avito.beduin.v2.repository.client.event.bus.interactions;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.repository.flow.C36328a;
import dU0.f;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientEventBusRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.client.event.bus.interactions.ClientEventBusRepositoryObserveInteractionHandler$handle$2", f = "ClientEventBusRepositoryObserveInteractionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements q<InterfaceC43172j<? super f>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f338185q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f338186r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f338187s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f338188t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, e eVar, InterfaceC36238a interfaceC36238a, Continuation<? super c> continuation) {
        super(3, continuation);
        this.f338186r = aVar;
        this.f338187s = eVar;
        this.f338188t = interfaceC36238a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super f> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        c cVar = new c(this.f338186r, this.f338187s, this.f338188t, continuation);
        cVar.f338185q = th2;
        return cVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = this.f338185q;
        Y41.l<com.avito.beduin.v2.engine.field.d, f> lVar = this.f338186r.f337755c;
        C36272i c36272iC = this.f338188t.c();
        this.f338187s.getClass();
        if (lVar.invoke(C36328a.b(th2, c36272iC)) != null) {
            return G0.f406611a;
        }
        throw th2;
    }
}
