package com.avito.beduin.v2.interaction.repository.flow;

import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RepositoryUpdateSyncInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/x;", "I", "Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.repository.flow.RepositoryUpdateSyncInteractionHandler$handle$1", f = "RepositoryUpdateSyncInteractionHandler.kt", i = {0, 1}, l = {21, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"$this$flow", "error"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class A extends SuspendLambda implements Y41.p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337718q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337719r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B<x> f337720s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f337721t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f337722u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B<x> b12, x xVar, InterfaceC36238a interfaceC36238a, Continuation<? super A> continuation) {
        super(2, continuation);
        this.f337720s = b12;
        this.f337721t = xVar;
        this.f337722u = interfaceC36238a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        A a12 = new A(this.f337720s, this.f337721t, this.f337722u, continuation);
        a12.f337719r = obj;
        return a12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((A) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Throwable th2;
        G0 g02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f337718q;
        B<x> b12 = this.f337720s;
        x xVar = this.f337721t;
        try {
        } catch (Throwable th3) {
            Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> lVar = xVar.f337803b;
            C36272i c36272iC = this.f337722u.c();
            b12.getClass();
            dU0.f fVar = (dU0.f) ((w) lVar).invoke(C36328a.b(th3, c36272iC));
            if (fVar != null) {
                this.f337719r = th3;
                this.f337718q = 2;
                if (r12.emit(fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                th2 = th3;
            } else {
                th2 = th3;
                g02 = null;
            }
        }
        if (r12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f337719r;
            b12.q(xVar);
            dU0.f fVar2 = (dU0.f) ((v) xVar.f337802a).invoke();
            r12 = interfaceC43172j;
            if (fVar2 != null) {
                this.f337719r = interfaceC43172j;
                this.f337718q = 1;
                Object objEmit = interfaceC43172j.emit(fVar2, this);
                r12 = interfaceC43172j;
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) this.f337719r;
                C42729a0.b(obj);
                g02 = G0.f406611a;
                if (g02 == null) {
                    throw th2;
                }
                return G0.f406611a;
            }
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f337719r;
            C42729a0.b(obj);
            r12 = interfaceC43172j2;
        }
        return G0.f406611a;
    }
}
