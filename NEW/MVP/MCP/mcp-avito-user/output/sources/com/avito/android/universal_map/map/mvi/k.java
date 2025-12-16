package com.avito.android.universal_map.map.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: Emitters.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_map.map.mvi.UniversalMapBootstrap$showSpecificLocationActionHandler$$inlined$transform$1", f = "UniversalMapBootstrap.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f305631q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f305632r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f305633s;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<UniversalMapInternalAction> f305634b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.UniversalMapBootstrap$showSpecificLocationActionHandler$$inlined$transform$1$1", f = "UniversalMapBootstrap.kt", i = {0}, l = {219, 220}, m = "emit", n = {"$this$showSpecificLocationActionHandler_u24lambda_u2414"}, s = {"L$0"})
        /* renamed from: com.avito.android.universal_map.map.mvi.k$a$a, reason: collision with other inner class name */
        public static final class C9388a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f305635q;

            /* renamed from: r, reason: collision with root package name */
            public int f305636r;

            /* renamed from: t, reason: collision with root package name */
            public InterfaceC43172j f305638t;

            public C9388a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f305635q = obj;
                this.f305636r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f305634b = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.universal_map.map.mvi.k.a.C9388a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.universal_map.map.mvi.k$a$a r0 = (com.avito.android.universal_map.map.mvi.k.a.C9388a) r0
                int r1 = r0.f305636r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f305636r = r1
                goto L18
            L13:
                com.avito.android.universal_map.map.mvi.k$a$a r0 = new com.avito.android.universal_map.map.mvi.k$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f305635q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f305636r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlinx.coroutines.flow.j r6 = r0.f305638t
                kotlin.C42729a0.b(r7)
                goto L51
            L3a:
                kotlin.C42729a0.b(r7)
                com.avito.android.map_core.beduin.BeduinShowSpecificLocationAction r6 = (com.avito.android.map_core.beduin.BeduinShowSpecificLocationAction) r6
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$SpecificLocationRequestParamsChanged r7 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$SpecificLocationRequestParamsChanged
                r7.<init>(r6)
                kotlinx.coroutines.flow.j<com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction> r6 = r5.f305634b
                r0.f305638t = r6
                r0.f305636r = r4
                java.lang.Object r7 = r6.emit(r7, r0)
                if (r7 != r1) goto L51
                return r1
            L51:
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$RequestLocation r7 = com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction.RequestLocation.f305550b
                r2 = 0
                r0.f305638t = r2
                r0.f305636r = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.k.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC43160i interfaceC43160i, Continuation continuation) {
        super(2, continuation);
        this.f305633s = interfaceC43160i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f305633s, continuation);
        kVar.f305632r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f305631q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f305632r);
            this.f305631q = 1;
            if (((AbstractC43168f) this.f305633s).collect(aVar, this) == coroutine_suspended) {
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
