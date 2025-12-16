package com.avito.beduin.v2.interaction.repository.flow;

import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: RepositoryUpdateInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/x;", "I", "Lkotlinx/coroutines/channels/I0;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.repository.flow.RepositoryUpdateInteractionHandler$handle$1", f = "RepositoryUpdateInteractionHandler.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class y extends SuspendLambda implements Y41.p<I0<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337805q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337806r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z<x> f337807s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f337808t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f337809u;

    /* compiled from: RepositoryUpdateInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/x;", "I", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.c f337810l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.c cVar) {
            super(0);
            this.f337810l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f337810l.dispose();
            return G0.f406611a;
        }
    }

    /* compiled from: RepositoryUpdateInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/x;", "I", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x f337811l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z<x> f337812m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36238a f337813n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ I0<dU0.f> f337814o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x xVar, z<x> zVar, InterfaceC36238a interfaceC36238a, I0<? super dU0.f> i02) {
            super(1);
            this.f337811l = xVar;
            this.f337812m = zVar;
            this.f337813n = interfaceC36238a;
            this.f337814o = i02;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> lVar = this.f337811l.f337803b;
            C36272i c36272iC = this.f337813n.c();
            this.f337812m.getClass();
            dU0.f fVar = (dU0.f) ((w) lVar).invoke(C36328a.b(th3, c36272iC));
            I0<dU0.f> i02 = this.f337814o;
            if (fVar != null) {
                i02.w(fVar);
                i02.h(null);
            } else {
                i02.h(th3);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RepositoryUpdateInteractionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/x;", "I", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x f337815l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I0<dU0.f> f337816m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x xVar, I0<? super dU0.f> i02) {
            super(0);
            this.f337815l = xVar;
            this.f337816m = i02;
        }

        @Override // Y41.a
        public final G0 invoke() {
            dU0.f fVar = (dU0.f) ((v) this.f337815l.f337802a).invoke();
            I0<dU0.f> i02 = this.f337816m;
            if (fVar != null) {
                kotlinx.coroutines.channels.B.a(i02.w(fVar));
            }
            i02.h(null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z<x> zVar, x xVar, InterfaceC36238a interfaceC36238a, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f337807s = zVar;
        this.f337808t = xVar;
        this.f337809u = interfaceC36238a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        y yVar = new y(this.f337807s, this.f337808t, this.f337809u, continuation);
        yVar.f337806r = obj;
        return yVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super dU0.f> i02, Continuation<? super G0> continuation) {
        return ((y) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337805q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f337806r;
            x xVar = this.f337808t;
            z<x> zVar = this.f337807s;
            new b(xVar, zVar, this.f337809u, i02);
            new c(xVar, i02);
            a aVar = new a(zVar.q());
            this.f337805q = 1;
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
