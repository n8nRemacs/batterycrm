package com.avito.beduin.v2.repository.in_memory.interactions;

import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;
import mV0.C44020b;

/* compiled from: InMemoryRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/engine/field/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.in_memory.interactions.InMemoryRepositoryObserveInteractionHandler$observeData$1", f = "InMemoryRepositoryObserveInteractionHandler.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<I0<? super com.avito.beduin.v2.engine.field.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338285q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f338286r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f338287s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f338288t;

    /* compiled from: InMemoryRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.c f338289l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.c cVar) {
            super(0);
            this.f338289l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f338289l.dispose();
            return G0.f406611a;
        }
    }

    /* compiled from: InMemoryRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/avito/beduin/v2/repository/in_memory/interactions/d$b", "LoV0/e;", "Lcom/avito/beduin/v2/engine/field/d;", "in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements oV0.e<com.avito.beduin.v2.engine.field.d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I0<com.avito.beduin.v2.engine.field.d> f338290a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(I0<? super com.avito.beduin.v2.engine.field.d> i02) {
            this.f338290a = i02;
        }

        @Override // oV0.e
        public final void a(com.avito.beduin.v2.engine.field.d dVar) {
            com.avito.beduin.v2.engine.field.d dVar2 = dVar;
            if (dVar2 == null) {
                dVar2 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
            }
            this.f338290a.w(dVar2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f338287s = eVar;
        this.f338288t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f338287s, this.f338288t, continuation);
        dVar.f338286r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super com.avito.beduin.v2.engine.field.d> i02, Continuation<? super G0> continuation) {
        return ((d) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f338285q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f338286r;
            C44020b c44020b = this.f338287s.f338291c;
            a aVar = new a(c44020b.f414543a.d(this.f338288t.f338283e, new b(i02)));
            this.f338285q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
