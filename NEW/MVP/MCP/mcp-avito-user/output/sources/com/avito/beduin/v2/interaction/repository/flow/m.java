package com.avito.beduin.v2.interaction.repository.flow;

import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: RepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/l;", "I", "Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.repository.flow.RepositoryObserveInteractionHandler$handle$1", f = "RepositoryObserveInteractionHandler.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337757q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337758r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n<l> f337759s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f337760t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f337761u;

    /* compiled from: RepositoryObserveInteractionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/l;", "I", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/beduin/v2/engine/field/d;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.interaction.repository.flow.RepositoryObserveInteractionHandler$handle$1$1", f = "RepositoryObserveInteractionHandler.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 36}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.beduin.v2.engine.field.d>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f337762q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Throwable f337763r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l f337764s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ n<l> f337765t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36238a f337766u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<dU0.f> f337767v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l lVar, n<l> nVar, InterfaceC36238a interfaceC36238a, InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f337764s = lVar;
            this.f337765t = nVar;
            this.f337766u = interfaceC36238a;
            this.f337767v = interfaceC43172j;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.beduin.v2.engine.field.d> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            InterfaceC36238a interfaceC36238a = this.f337766u;
            InterfaceC43172j<dU0.f> interfaceC43172j2 = this.f337767v;
            a aVar = new a(this.f337764s, this.f337765t, interfaceC36238a, interfaceC43172j2, continuation);
            aVar.f337763r = th2;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f337762q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Throwable th2 = this.f337763r;
                InterfaceC43172j<dU0.f> interfaceC43172j = this.f337767v;
                l lVar = this.f337764s;
                if (th2 == null) {
                    dU0.f fVarInvoke = lVar.f337754b.invoke();
                    if (fVarInvoke != null) {
                        this.f337762q = 1;
                        if (interfaceC43172j.emit(fVarInvoke, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (!(th2 instanceof CancellationException)) {
                    Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> lVar2 = lVar.f337755c;
                    C36272i c36272iC = this.f337766u.c();
                    this.f337765t.getClass();
                    dU0.f fVarInvoke2 = lVar2.invoke(C36328a.b(th2, c36272iC));
                    if (fVarInvoke2 != null) {
                        this.f337762q = 2;
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

    /* compiled from: RepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/l;", "I", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/beduin/v2/engine/field/d;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.interaction.repository.flow.RepositoryObserveInteractionHandler$handle$1$2", f = "RepositoryObserveInteractionHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.beduin.v2.engine.field.d>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f337768q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ l f337769r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n<l> f337770s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36238a f337771t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC36238a interfaceC36238a, l lVar, n nVar, Continuation continuation) {
            super(3, continuation);
            this.f337769r = lVar;
            this.f337770s = nVar;
            this.f337771t = interfaceC36238a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.beduin.v2.engine.field.d> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            l lVar = this.f337769r;
            n<l> nVar = this.f337770s;
            b bVar = new b(this.f337771t, lVar, nVar, continuation);
            bVar.f337768q = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f337768q;
            Y41.l<com.avito.beduin.v2.engine.field.d, dU0.f> lVar = this.f337769r.f337755c;
            C36272i c36272iC = this.f337771t.c();
            this.f337770s.getClass();
            if (lVar.invoke(C36328a.b(th2, c36272iC)) != null) {
                return G0.f406611a;
            }
            throw th2;
        }
    }

    /* compiled from: RepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/repository/flow/l;", "I", "Lcom/avito/beduin/v2/engine/field/d;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/beduin/v2/engine/field/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<dU0.f> f337772b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f337773c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC43172j<? super dU0.f> interfaceC43172j, l lVar) {
            this.f337772b = interfaceC43172j;
            this.f337773c = lVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Object objEmit = this.f337772b.emit(this.f337773c.f337753a.invoke(C36328a.a((com.avito.beduin.v2.engine.field.d) obj)), continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC36238a interfaceC36238a, l lVar, n nVar, Continuation continuation) {
        super(2, continuation);
        this.f337759s = nVar;
        this.f337760t = lVar;
        this.f337761u = interfaceC36238a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f337761u, this.f337760t, this.f337759s, continuation);
        mVar.f337758r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337757q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f337758r;
            InterfaceC36238a interfaceC36238a = this.f337761u;
            C36272i c36272iC = interfaceC36238a.c();
            n<l> nVar = this.f337759s;
            l lVar = this.f337760t;
            C43152f0 c43152f0 = new C43152f0(new X(nVar.q(lVar, c36272iC), new a(this.f337760t, this.f337759s, this.f337761u, interfaceC43172j, null)), new b(interfaceC36238a, lVar, nVar, null));
            c cVar = new c(interfaceC43172j, lVar);
            this.f337757q = 1;
            if (c43152f0.collect(cVar, this) == coroutine_suspended) {
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
