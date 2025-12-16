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

/* compiled from: RepositoryRemoveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/q;", "I", "Lkotlinx/coroutines/channels/I0;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.repository.flow.RepositoryRemoveInteractionHandler$handle$1", f = "RepositoryRemoveInteractionHandler.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class r extends SuspendLambda implements Y41.p<I0<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337781q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337782r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s<q> f337783s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f337784t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f337785u;

    /* compiled from: RepositoryRemoveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/q;", "I", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.c f337786l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.c cVar) {
            super(0);
            this.f337786l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f337786l.dispose();
            return G0.f406611a;
        }
    }

    /* compiled from: RepositoryRemoveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/q;", "I", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f337787l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ s<q> f337788m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36238a f337789n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ I0<dU0.f> f337790o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q qVar, s<q> sVar, InterfaceC36238a interfaceC36238a, I0<? super dU0.f> i02) {
            super(1);
            this.f337787l = qVar;
            this.f337788m = sVar;
            this.f337789n = interfaceC36238a;
            this.f337790o = i02;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> lVar = this.f337787l.f337779b;
            C36272i c36272iC = this.f337789n.c();
            this.f337788m.getClass();
            dU0.f fVarInvoke = lVar.invoke(C36328a.b(th3, c36272iC));
            I0<dU0.f> i02 = this.f337790o;
            if (fVarInvoke != null) {
                i02.w(fVarInvoke);
                i02.h(null);
            } else {
                i02.h(th3);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RepositoryRemoveInteractionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/q;", "I", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q f337791l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I0<dU0.f> f337792m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(q qVar, I0<? super dU0.f> i02) {
            super(0);
            this.f337791l = qVar;
            this.f337792m = i02;
        }

        @Override // Y41.a
        public final G0 invoke() {
            dU0.f fVarInvoke = this.f337791l.f337778a.invoke();
            I0<dU0.f> i02 = this.f337792m;
            if (fVarInvoke != null) {
                kotlinx.coroutines.channels.B.a(i02.w(fVarInvoke));
            }
            i02.h(null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s<q> sVar, q qVar, InterfaceC36238a interfaceC36238a, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f337783s = sVar;
        this.f337784t = qVar;
        this.f337785u = interfaceC36238a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f337783s, this.f337784t, this.f337785u, continuation);
        rVar.f337782r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super dU0.f> i02, Continuation<? super G0> continuation) {
        return ((r) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337781q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f337782r;
            q qVar = this.f337784t;
            s<q> sVar = this.f337783s;
            new b(qVar, sVar, this.f337785u, i02);
            new c(qVar, i02);
            a aVar = new a(sVar.q());
            this.f337781q = 1;
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
