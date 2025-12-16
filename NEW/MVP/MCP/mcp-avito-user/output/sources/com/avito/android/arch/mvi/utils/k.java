package com.avito.android.arch.mvi.utils;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$pairWithPrevious$$inlined$transform$1", f = "FlowExt.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Q<Object, Object>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f92098q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92099r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n2 f92100s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.h f92101t;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Q<? extends T, ? extends T>> f92102b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0.h f92103c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.arch.mvi.utils.FlowExtKt$pairWithPrevious$$inlined$transform$1$1", f = "FlowExt.kt", i = {0, 0}, l = {219}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        /* renamed from: com.avito.android.arch.mvi.utils.k$a$a, reason: collision with other inner class name */
        public static final class C2720a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f92104q;

            /* renamed from: r, reason: collision with root package name */
            public int f92105r;

            /* renamed from: t, reason: collision with root package name */
            public a f92107t;

            /* renamed from: u, reason: collision with root package name */
            public Object f92108u;

            public C2720a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f92104q = obj;
                this.f92105r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, l0.h hVar) {
            this.f92103c = hVar;
            this.f92102b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.arch.mvi.utils.k.a.C2720a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.arch.mvi.utils.k$a$a r0 = (com.avito.android.arch.mvi.utils.k.a.C2720a) r0
                int r1 = r0.f92105r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f92105r = r1
                goto L18
            L13:
                com.avito.android.arch.mvi.utils.k$a$a r0 = new com.avito.android.arch.mvi.utils.k$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f92104q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f92105r
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r5 = r0.f92108u
                com.avito.android.arch.mvi.utils.k$a r0 = r0.f92107t
                kotlin.C42729a0.b(r6)
                goto L51
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.C42729a0.b(r6)
                kotlin.jvm.internal.l0$h r6 = r4.f92103c
                T r6 = r6.f406842b
                kotlin.Q r2 = new kotlin.Q
                r2.<init>(r6, r5)
                r0.f92107t = r4
                r0.f92108u = r5
                r0.f92105r = r3
                kotlinx.coroutines.flow.j<kotlin.Q<? extends T, ? extends T>> r6 = r4.f92102b
                java.lang.Object r6 = r6.emit(r2, r0)
                if (r6 != r1) goto L50
                return r1
            L50:
                r0 = r4
            L51:
                kotlin.jvm.internal.l0$h r6 = r0.f92103c
                r6.f406842b = r5
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.utils.k.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n2 n2Var, Continuation continuation, l0.h hVar) {
        super(2, continuation);
        this.f92100s = n2Var;
        this.f92101t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f92100s, continuation, this.f92101t);
        kVar.f92099r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Q<Object, Object>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f92098q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f92099r, this.f92101t);
            this.f92098q = 1;
            if (this.f92100s.collect(aVar, this) == coroutine_suspended) {
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
