package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.error_reporting.app_state.C30369h;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;

/* compiled from: EmployeeModeInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/N0;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/N0;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$collectAppState$2", f = "EmployeeModeInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.employee_mode_impl.manager.state.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30340c extends SuspendLambda implements Y41.p<T, Continuation<? super N0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f147459q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30339b f147460r;

    /* compiled from: EmployeeModeInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$collectAppState$2$1", f = "EmployeeModeInteractor.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.c$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147461q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C30339b f147462r;

        /* compiled from: EmployeeModeInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.employee_mode_impl.manager.state.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C4301a implements InterfaceC43172j, kotlin.jvm.internal.D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C30369h f147463b;

            public C4301a(C30369h c30369h) {
                this.f147463b = c30369h;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C30369h c30369h = this.f147463b;
                c30369h.getClass();
                c30369h.f147815a.b("is_employee_mode_on", String.valueOf(zBooleanValue));
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f147463b, C30369h.class, "setEmployeeModeActive", "setEmployeeModeActive(Z)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.employee_mode_impl.manager.state.c$a$b */
        public static final class b implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f147464b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.employee_mode_impl.manager.state.c$a$b$a, reason: collision with other inner class name */
            public static final class C4302a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f147465b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$collectAppState$2$1$invokeSuspend$$inlined$map$1$2", f = "EmployeeModeInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.employee_mode_impl.manager.state.c$a$b$a$a, reason: collision with other inner class name */
                public static final class C4303a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f147466q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f147467r;

                    public C4303a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f147466q = obj;
                        this.f147467r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C4302a.this.emit(null, this);
                    }
                }

                public C4302a(InterfaceC43172j interfaceC43172j) {
                    this.f147465b = interfaceC43172j;
                }

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
                        boolean r0 = r6 instanceof com.avito.android.employee_mode_impl.manager.state.C30340c.a.b.C4302a.C4303a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.employee_mode_impl.manager.state.c$a$b$a$a r0 = (com.avito.android.employee_mode_impl.manager.state.C30340c.a.b.C4302a.C4303a) r0
                        int r1 = r0.f147467r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f147467r = r1
                        goto L18
                    L13:
                        com.avito.android.employee_mode_impl.manager.state.c$a$b$a$a r0 = new com.avito.android.employee_mode_impl.manager.state.c$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f147466q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f147467r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        jz.a r5 = (jz.C42450a) r5
                        jz.c r5 = r5.f405963a
                        jz.b r5 = r5.getF405972a()
                        boolean r5 = cz.C39437b.a(r5)
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.f147467r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f147465b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.C30340c.a.b.C4302a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public b(n nVar) {
                this.f147464b = nVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f147464b.collect(new C4302a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C30339b c30339b, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f147462r = c30339b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f147462r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147461q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C30339b c30339b = this.f147462r;
                InterfaceC43160i interfaceC43160iR = C43175k.r(new b(new n((Z1) c30339b.f147406b.f147506b.getValue())));
                C4301a c4301a = new C4301a(c30339b.f147408d);
                this.f147461q = 1;
                if (interfaceC43160iR.collect(c4301a, this) == coroutine_suspended) {
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
    public C30340c(C30339b c30339b, Continuation<? super C30340c> continuation) {
        super(2, continuation);
        this.f147460r = c30339b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30340c c30340c = new C30340c(this.f147460r, continuation);
        c30340c.f147459q = obj;
        return c30340c;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super N0> continuation) {
        return ((C30340c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43259k.d((T) this.f147459q, null, null, new a(this.f147460r, null), 3);
    }
}
