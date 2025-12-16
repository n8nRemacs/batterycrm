package com.avito.beduin.v2.repository.environment;

import Y41.p;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: AndroidEnvironmentClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.environment.AndroidEnvironmentClient$observeEnvironment$2", f = "AndroidEnvironmentClient.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338216q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f338217r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f338218s;

    /* compiled from: AndroidEnvironmentClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.beduin.v2.repository.environment.AndroidEnvironmentClient$observeEnvironment$2$1", f = "AndroidEnvironmentClient.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f338219q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ g f338220r;

        /* compiled from: AndroidEnvironmentClient.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/environment/h;", "env", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/beduin/v2/repository/environment/h;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.beduin.v2.repository.environment.AndroidEnvironmentClient$observeEnvironment$2$1$1", f = "AndroidEnvironmentClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.beduin.v2.repository.environment.e$a$a, reason: collision with other inner class name */
        public static final class C10479a extends SuspendLambda implements p<h, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f338221q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ g f338222r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10479a(g gVar, Continuation<? super C10479a> continuation) {
                super(2, continuation);
                this.f338222r = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C10479a c10479a = new C10479a(this.f338222r, continuation);
                c10479a.f338221q = obj;
                return c10479a;
            }

            @Override // Y41.p
            public final Object invoke(h hVar, Continuation<? super G0> continuation) {
                return ((C10479a) create(hVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                h hVar = (h) this.f338221q;
                Iterator it = C42745f0.M0(this.f338222r.f338232g).iterator();
                while (it.hasNext()) {
                    ((Y41.l) it.next()).invoke(hVar);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f338220r = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f338220r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f338219q;
            if (i12 == 0) {
                C42729a0.b(obj);
                g gVar = this.f338220r;
                C1 c12 = gVar.f338231f;
                C10479a c10479a = new C10479a(gVar, null);
                this.f338219q = 1;
                if (C43175k.j(c12, c10479a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC22983P interfaceC22983P, g gVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f338217r = interfaceC22983P;
        this.f338218s = gVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.P, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new e(this.f338217r, this.f338218s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.P, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f338216q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(this.f338218s, null);
            this.f338216q = 1;
            if (C23056p0.b(this.f338217r, state, aVar, this) == coroutine_suspended) {
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
