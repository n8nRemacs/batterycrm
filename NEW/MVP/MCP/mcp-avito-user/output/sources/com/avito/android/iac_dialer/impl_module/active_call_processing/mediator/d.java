package com.avito.android.iac_dialer.impl_module.active_call_processing.mediator;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialer;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;

/* compiled from: IacDialerMediator.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"MediatorAction", "MediatorState", "MediatorEvent", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.IacDialerMediatorImpl$state$2$1", f = "IacDialerMediator.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f165651q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b<Object, Object, Object> f165652r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z1<Object> f165653s;

    /* compiled from: IacDialerMediator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"MediatorAction", "MediatorState", "MediatorEvent", "it", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Z1<Object> f165654b;

        public a(Z1<Object> z12) {
            this.f165654b = z12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @l
        public final Object emit(Object obj, @k Continuation<? super G0> continuation) {
            this.f165654b.setValue(obj);
            return G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2 f165655b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b f165656c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f165657b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b f165658c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.IacDialerMediatorImpl$state$2$1$invokeSuspend$$inlined$map$1$2", f = "IacDialerMediator.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.d$b$a$a, reason: collision with other inner class name */
            public static final class C4910a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f165659q;

                /* renamed from: r, reason: collision with root package name */
                public int f165660r;

                public C4910a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f165659q = obj;
                    this.f165660r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b bVar) {
                this.f165657b = interfaceC43172j;
                this.f165658c = bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.d.b.a.C4910a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.d$b$a$a r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.d.b.a.C4910a) r0
                    int r1 = r0.f165660r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f165660r = r1
                    goto L18
                L13:
                    com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.d$b$a$a r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.d$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f165659q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f165660r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState r5 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState) r5
                    com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b r6 = r4.f165658c
                    JK.j r6 = r6.d()
                    java.lang.Object r5 = r6.b(r5)
                    r0.f165660r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f165657b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.d.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(n2 n2Var, com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b bVar) {
            this.f165655b = n2Var;
            this.f165656c = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Object> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f165655b.collect(new a(interfaceC43172j, this.f165656c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b<Object, Object, Object> bVar, Z1<Object> z12, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f165652r = bVar;
        this.f165653s = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f165652r, this.f165653s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f165651q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b<Object, Object, Object> bVar = this.f165652r;
            b bVar2 = new b(((IacDialer) bVar.f165640a.getValue()).getState(), bVar);
            a aVar = new a(this.f165653s);
            this.f165651q = 1;
            if (bVar2.collect(aVar, this) == coroutine_suspended) {
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
