package com.avito.android.employee_mode_impl.manager.state;

import com.avito.android.account.G;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.error_reporting.app_state.C30369h;
import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import dz.C39832c;
import dz.InterfaceC39830a;
import iz.C42140a;
import java.util.Map;
import javax.inject.Inject;
import jz.C42450a;
import jz.C42453d;
import jz.C42454e;
import jz.InterfaceC42451b;
import jz.InterfaceC42452c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.internal.C43238h;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: EmployeeModeInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/state/b;", "Lcom/avito/android/employee_mode_impl/manager/state/a;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.employee_mode_impl.manager.state.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30339b implements InterfaceC30338a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f147405a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f147406b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f147407c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C30369h f147408d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final x f147409e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43238h f147410f;

    /* compiled from: EmployeeModeInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$1", f = "EmployeeModeInteractor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$a */
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147411q;

        /* compiled from: EmployeeModeInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "authorized", "approved"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$1$2", f = "EmployeeModeInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$a$a, reason: collision with other inner class name */
        public static final class C4294a extends SuspendLambda implements Y41.q<Boolean, Boolean, Continuation<? super Boolean>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ boolean f147413q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ boolean f147414r;

            public C4294a() {
                throw null;
            }

            @Override // Y41.q
            public final Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = bool2.booleanValue();
                C4294a c4294a = new C4294a(3, continuation);
                c4294a.f147413q = zBooleanValue;
                c4294a.f147414r = zBooleanValue2;
                return c4294a.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return Boxing.boxBoolean(this.f147413q && this.f147414r);
            }
        }

        /* compiled from: EmployeeModeInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "enabled", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$1$3", f = "EmployeeModeInteractor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$a$b, reason: collision with other inner class name */
        public static final class C4295b extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f147415q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ boolean f147416r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ C30339b f147417s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4295b(C30339b c30339b, Continuation<? super C4295b> continuation) {
                super(2, continuation);
                this.f147417s = c30339b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C4295b c4295b = new C4295b(this.f147417s, continuation);
                c4295b.f147416r = ((Boolean) obj).booleanValue();
                return c4295b;
            }

            @Override // Y41.p
            public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C4295b) create(bool2, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f147415q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    boolean z12 = this.f147416r;
                    C30339b c30339b = this.f147417s;
                    if (z12) {
                        this.f147415q = 1;
                        c30339b.getClass();
                        if (U.c(new C30340c(c30339b, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        C30369h c30369h = c30339b.f147408d;
                        c30369h.getClass();
                        c30369h.f147815a.b("is_employee_mode_on", String.valueOf(false));
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

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$a$c */
        public static final class c implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f147418b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$a$c$a, reason: collision with other inner class name */
            public static final class C4296a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f147419b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$1$invokeSuspend$$inlined$map$1$2", f = "EmployeeModeInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$a$c$a$a, reason: collision with other inner class name */
                public static final class C4297a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f147420q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f147421r;

                    public C4297a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f147420q = obj;
                        this.f147421r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C4296a.this.emit(null, this);
                    }
                }

                public C4296a(InterfaceC43172j interfaceC43172j) {
                    this.f147419b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.employee_mode_impl.manager.state.C30339b.a.c.C4296a.C4297a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.employee_mode_impl.manager.state.b$a$c$a$a r0 = (com.avito.android.employee_mode_impl.manager.state.C30339b.a.c.C4296a.C4297a) r0
                        int r1 = r0.f147421r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f147421r = r1
                        goto L18
                    L13:
                        com.avito.android.employee_mode_impl.manager.state.b$a$c$a$a r0 = new com.avito.android.employee_mode_impl.manager.state.b$a$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f147420q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f147421r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L49
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        jz.a r5 = (jz.C42450a) r5
                        jz.c r5 = r5.f405963a
                        boolean r5 = r5 instanceof jz.InterfaceC42452c.a
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r0.f147421r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f147419b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.C30339b.a.c.C4296a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(n nVar) {
                this.f147418b = nVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f147418b.collect(new C4296a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C30339b.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147411q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C30339b c30339b = C30339b.this;
                InterfaceC43160i interfaceC43160iR = C43175k.r(new C1(kotlinx.coroutines.rx3.y.a(c30339b.f147405a.g()), new c(new n((Z1) c30339b.f147406b.f147506b.getValue())), new C4294a(3, null)));
                C4295b c4295b = new C4295b(c30339b, null);
                this.f147411q = 1;
                if (C43175k.j(interfaceC43160iR, c4295b, this) == coroutine_suspended) {
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

    /* compiled from: EmployeeModeInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$2", f = "EmployeeModeInteractor.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$b, reason: collision with other inner class name */
    public static final class C4298b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147423q;

        /* compiled from: EmployeeModeInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/ProfileInfo;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/remote/model/ProfileInfo;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$2$1", f = "EmployeeModeInteractor.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$b$a */
        public static final class a extends SuspendLambda implements Y41.p<ProfileInfo, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f147425q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f147426r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ C30339b f147427s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C30339b c30339b, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f147427s = c30339b;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f147427s, continuation);
                aVar.f147426r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(ProfileInfo profileInfo, Continuation<? super G0> continuation) {
                return ((a) create(profileInfo, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f147425q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ProfileInfo profileInfo = (ProfileInfo) this.f147426r;
                    String userId = profileInfo.getUserId();
                    String userHashId = profileInfo.getUserHashId();
                    this.f147425q = 1;
                    C30339b c30339b = this.f147427s;
                    c30339b.getClass();
                    if (userId == null) {
                        userId = "";
                    }
                    if (userHashId == null) {
                        userHashId = "";
                    }
                    Object objG = c30339b.g(new InterfaceC39830a.c(userId, userHashId), this);
                    if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objG = G0.f406611a;
                    }
                    if (objG == coroutine_suspended) {
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

        public C4298b(Continuation<? super C4298b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C30339b.this.new C4298b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4298b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147423q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C30339b c30339b = C30339b.this;
                InterfaceC43160i interfaceC43160iR = C43175k.r(kotlinx.coroutines.rx3.y.a(c30339b.f147405a.getF68055j()));
                a aVar = new a(c30339b, null);
                this.f147423q = 1;
                if (C43175k.j(interfaceC43160iR, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$c */
    public static final class c implements InterfaceC43160i<InterfaceC42451b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f147428b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f147429b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$collectModeChanges$$inlined$map$1$2", f = "EmployeeModeInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$c$a$a, reason: collision with other inner class name */
            public static final class C4299a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f147430q;

                /* renamed from: r, reason: collision with root package name */
                public int f147431r;

                public C4299a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f147430q = obj;
                    this.f147431r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f147429b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.employee_mode_impl.manager.state.C30339b.c.a.C4299a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.employee_mode_impl.manager.state.b$c$a$a r0 = (com.avito.android.employee_mode_impl.manager.state.C30339b.c.a.C4299a) r0
                    int r1 = r0.f147431r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f147431r = r1
                    goto L18
                L13:
                    com.avito.android.employee_mode_impl.manager.state.b$c$a$a r0 = new com.avito.android.employee_mode_impl.manager.state.b$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f147430q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f147431r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L47
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
                    r0.f147431r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f147429b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.C30339b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i) {
            this.f147428b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC42451b> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f147428b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: EmployeeModeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ljz/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$currentEmployeeMode$1", f = "EmployeeModeInteractor.kt", i = {}, l = {87, 87, 89}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$d */
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC42451b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147433q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f147434r;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = C30339b.this.new d(continuation);
            dVar.f147434r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC42451b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f147433q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.C42729a0.b(r7)
                goto L72
            L1e:
                java.lang.Object r1 = r6.f147434r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L49
            L26:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f147434r
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.employee_mode_impl.manager.state.b r7 = com.avito.android.employee_mode_impl.manager.state.C30339b.this
                com.avito.android.employee_mode_impl.manager.state.k r5 = r7.f147406b
                jz.a r5 = r5.a()
                jz.c r5 = r5.f405963a
                boolean r5 = r5 instanceof jz.InterfaceC42452c.a
                com.avito.android.employee_mode_impl.manager.state.k r7 = r7.f147406b
                if (r5 == 0) goto L5f
                r6.f147434r = r1
                r6.f147433q = r4
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L49
                return r0
            L49:
                dz.c r7 = (dz.C39832c) r7
                jz.a r7 = r7.f394202a
                jz.c r7 = r7.f405963a
                jz.b r7 = r7.getF405972a()
                r2 = 0
                r6.f147434r = r2
                r6.f147433q = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L72
                return r0
            L5f:
                jz.a r7 = r7.a()
                jz.c r7 = r7.f405963a
                jz.b r7 = r7.getF405972a()
                r6.f147433q = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L72
                return r0
            L72:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.C30339b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$e */
    public static final class e implements InterfaceC43160i<C42454e> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f147436b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$e$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f147437b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$currentPassportModes$$inlined$map$1$2", f = "EmployeeModeInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$e$a$a, reason: collision with other inner class name */
            public static final class C4300a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f147438q;

                /* renamed from: r, reason: collision with root package name */
                public int f147439r;

                public C4300a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f147438q = obj;
                    this.f147439r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f147437b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.employee_mode_impl.manager.state.C30339b.e.a.C4300a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.employee_mode_impl.manager.state.b$e$a$a r0 = (com.avito.android.employee_mode_impl.manager.state.C30339b.e.a.C4300a) r0
                    int r1 = r0.f147439r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f147439r = r1
                    goto L18
                L13:
                    com.avito.android.employee_mode_impl.manager.state.b$e$a$a r0 = new com.avito.android.employee_mode_impl.manager.state.b$e$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f147438q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f147439r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r7)
                    goto L86
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    java.util.Map r6 = (java.util.Map) r6
                    java.util.Set r6 = r6.entrySet()
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    r7 = 10
                    int r7 = kotlin.collections.C42745f0.q(r6, r7)
                    int r7 = kotlin.collections.P0.f(r7)
                    r2 = 16
                    if (r7 >= r2) goto L4b
                    r7 = r2
                L4b:
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>(r7)
                    java.util.Iterator r6 = r6.iterator()
                L54:
                    boolean r7 = r6.hasNext()
                    if (r7 == 0) goto L76
                    java.lang.Object r7 = r6.next()
                    java.util.Map$Entry r7 = (java.util.Map.Entry) r7
                    java.lang.Object r4 = r7.getKey()
                    com.avito.android.employee_mode_impl.manager.storage.d r4 = (com.avito.android.employee_mode_impl.manager.storage.d) r4
                    java.lang.String r4 = r4.f147561a
                    java.lang.Object r7 = r7.getValue()
                    jz.c r7 = (jz.InterfaceC42452c) r7
                    jz.b r7 = r7.getF405972a()
                    r2.put(r4, r7)
                    goto L54
                L76:
                    jz.e r6 = new jz.e
                    r6.<init>(r2)
                    r0.f147439r = r3
                    kotlinx.coroutines.flow.j r7 = r5.f147437b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L86
                    return r1
                L86:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.C30339b.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public e(InterfaceC43160i interfaceC43160i) {
            this.f147436b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super C42454e> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f147436b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: EmployeeModeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lcom/avito/android/employee_mode_impl/manager/storage/d;", "Ljz/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$currentPassportModes$1", f = "EmployeeModeInteractor.kt", i = {}, l = {104, 104}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$f */
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Map<com.avito.android.employee_mode_impl.manager.storage.d, ? extends InterfaceC42452c>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147441q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f147442r;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = C30339b.this.new f(continuation);
            fVar.f147442r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Map<com.avito.android.employee_mode_impl.manager.storage.d, ? extends InterfaceC42452c>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147441q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f147442r;
                k kVar = C30339b.this.f147406b;
                this.f147442r = interfaceC43172j;
                this.f147441q = 1;
                obj = kVar.d(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f147442r;
                C42729a0.b(obj);
            }
            this.f147442r = null;
            this.f147441q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EmployeeModeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Ljz/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$employeeInfo$1", f = "EmployeeModeInteractor.kt", i = {0}, l = {79, 80, 80}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$g */
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<C42450a>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147444q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f147445r;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = C30339b.this.new g(continuation);
            gVar.f147445r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<C42450a>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f147444q
                r2 = 0
                com.avito.android.employee_mode_impl.manager.state.b r3 = com.avito.android.employee_mode_impl.manager.state.C30339b.this
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L31
                if (r1 == r6) goto L29
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                kotlin.C42729a0.b(r8)
                goto L88
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f147445r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5d
            L29:
                java.lang.Object r1 = r7.f147445r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L46
            L31:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f147445r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                r7.f147445r = r8
                r7.f147444q = r6
                com.avito.android.employee_mode_impl.manager.state.k r1 = r3.f147406b
                java.lang.Object r1 = r1.b(r7)
                if (r1 != r0) goto L45
                return r0
            L45:
                r1 = r8
            L46:
                dz.a$a r8 = dz.InterfaceC39830a.C11046a.f394185a
                r7.f147445r = r1
                r7.f147444q = r5
                r3.getClass()
                com.avito.android.employee_mode_impl.manager.state.h r5 = new com.avito.android.employee_mode_impl.manager.state.h
                r5.<init>(r3, r8, r2)
                com.avito.android.employee_mode_impl.manager.state.k r8 = r3.f147406b
                java.lang.Object r8 = r8.e(r5, r7)
                if (r8 != r0) goto L5d
                return r0
            L5d:
                dz.c r8 = (dz.C39832c) r8
                com.avito.android.remote.model.TypedResult<com.avito.android.employee_mode_impl.manager.domain.d> r3 = r8.f394203b
                boolean r5 = r3 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r5 == 0) goto L75
                com.avito.android.remote.model.TypedResult$Error r8 = new com.avito.android.remote.model.TypedResult$Error
                com.avito.android.remote.model.TypedResult$Error r3 = (com.avito.android.remote.model.TypedResult.Error) r3
                com.avito.android.remote.error.ApiError r5 = r3.getError()
                java.lang.Throwable r3 = r3.getCause()
                r8.<init>(r5, r3)
                goto L7d
            L75:
                com.avito.android.remote.model.TypedResult$Success r3 = new com.avito.android.remote.model.TypedResult$Success
                jz.a r8 = r8.f394202a
                r3.<init>(r8)
                r8 = r3
            L7d:
                r7.f147445r = r2
                r7.f147444q = r4
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L88
                return r0
            L88:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.C30339b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EmployeeModeInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$profileChangeStated$1", f = "EmployeeModeInteractor.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$h */
    public static final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147447q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f147449s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Boolean f147450t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Boolean bool, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f147449s = str;
            this.f147450t = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C30339b.this.new h(this.f147449s, this.f147450t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147447q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC42451b interfaceC42451b = L.f(this.f147450t, Boolean.TRUE) ? InterfaceC42451b.C11596b.f405967a : InterfaceC42451b.a.f405966a;
                this.f147447q = 1;
                C30339b c30339b = C30339b.this;
                c30339b.getClass();
                Object objG = c30339b.g(new InterfaceC39830a.b(this.f147449s, interfaceC42451b), this);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == coroutine_suspended) {
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

    /* compiled from: EmployeeModeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$refreshCompanyAccessInfo$1", f = "EmployeeModeInteractor.kt", i = {0, 0}, l = {125, WebSocketProtocol.PAYLOAD_SHORT, 128}, m = "invokeSuspend", n = {"$this$flow", "oldModeInfo"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$i */
    public static final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Boolean>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC42452c f147451q;

        /* renamed from: r, reason: collision with root package name */
        public int f147452r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f147453s;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = C30339b.this.new i(continuation);
            iVar.f147453s = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Boolean> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x008c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f147452r
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2a
                if (r1 == r5) goto L20
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                kotlin.C42729a0.b(r11)
                goto L9a
            L20:
                jz.c r1 = r10.f147451q
                java.lang.Object r3 = r10.f147453s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r11)
                goto L66
            L2a:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f147453s
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.employee_mode_impl.manager.state.b r1 = com.avito.android.employee_mode_impl.manager.state.C30339b.this
                com.avito.android.employee_mode_impl.manager.state.k r6 = r1.f147406b
                jz.a r6 = r6.a()
                jz.c r6 = r6.f405963a
                jz.b r7 = r6.getF405972a()
                jz.b$b r8 = jz.InterfaceC42451b.C11596b.f405967a
                boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
                if (r7 == 0) goto L8d
                boolean r6 = r6 instanceof jz.InterfaceC42452c.a.C11597a
                if (r6 == 0) goto L8d
                com.avito.android.employee_mode_impl.manager.state.k r3 = r1.f147406b
                jz.a r3 = r3.a()
                jz.c r3 = r3.f405963a
                dz.a$d r6 = dz.InterfaceC39830a.d.f394190a
                r10.f147453s = r11
                r10.f147451q = r3
                r10.f147452r = r5
                java.lang.Object r1 = r1.g(r6, r10)
                if (r1 != r0) goto L62
                return r0
            L62:
                r9 = r3
                r3 = r11
                r11 = r1
                r1 = r9
            L66:
                dz.c r11 = (dz.C39832c) r11
                com.avito.android.remote.model.TypedResult<com.avito.android.employee_mode_impl.generated.api.api_messenger_info_v_2.ApiMessengerInfoV2Response> r6 = r11.f394204c
                if (r6 == 0) goto L7b
                boolean r6 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r6 != 0) goto L7b
                jz.a r11 = r11.f394202a
                jz.c r11 = r11.f405963a
                boolean r11 = kotlin.jvm.internal.L.f(r1, r11)
                if (r11 != 0) goto L7b
                r2 = r5
            L7b:
                java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r1 = 0
                r10.f147453s = r1
                r10.f147451q = r1
                r10.f147452r = r4
                java.lang.Object r11 = r3.emit(r11, r10)
                if (r11 != r0) goto L9a
                return r0
            L8d:
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r10.f147452r = r3
                java.lang.Object r11 = r11.emit(r1, r10)
                if (r11 != r0) goto L9a
                return r0
            L9a:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.employee_mode_impl.manager.state.C30339b.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EmployeeModeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ljz/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.employee_mode_impl.manager.state.EmployeeModeInteractor$switchEmployeeMode$1", f = "EmployeeModeInteractor.kt", i = {}, l = {73, 73}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.employee_mode_impl.manager.state.b$j */
    public static final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC42451b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147455q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f147456r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C42453d f147457s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C30339b f147458t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C42453d c42453d, C30339b c30339b, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f147457s = c42453d;
            this.f147458t = c30339b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = new j(this.f147457s, this.f147458t, continuation);
            jVar.f147456r = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC42451b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147455q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f147456r;
                InterfaceC39830a.e eVar = new InterfaceC39830a.e(this.f147457s);
                this.f147456r = interfaceC43172j;
                this.f147455q = 1;
                obj = this.f147458t.g(eVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f147456r;
                C42729a0.b(obj);
            }
            InterfaceC42451b f405972a = ((C39832c) obj).f394202a.f405963a.getF405972a();
            this.f147456r = null;
            this.f147455q = 2;
            if (interfaceC43172j.emit(f405972a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C30339b(@Y61.k G g12, @Y61.k k kVar, @Y61.k R0 r02, @Y61.k C30369h c30369h, @Y61.k x xVar, @Y61.k com.avito.android.employee_mode_impl.manager.scope.a aVar) {
        this.f147405a = g12;
        this.f147406b = kVar;
        this.f147407c = r02;
        this.f147408d = c30369h;
        this.f147409e = xVar;
        C43238h c43238hF = U.f(aVar, r02.c());
        this.f147410f = c43238hF;
        C43259k.d(c43238hF, null, null, new a(null), 3);
        C43259k.d(c43238hF, null, null, new C4298b(null), 3);
    }

    @Override // com.avito.android.employee_mode_impl.manager.state.InterfaceC30338a
    @Y61.k
    public final C42450a a() {
        return this.f147406b.a();
    }

    @Y61.k
    public final InterfaceC43160i<InterfaceC42451b> b(@Y61.k C42140a c42140a) {
        n nVar = new n((Z1) this.f147406b.f147506b.getValue());
        InterfaceC43160i gVar = c42140a.f405416b ? new com.avito.android.employee_mode_impl.manager.state.g(new com.avito.android.employee_mode_impl.manager.state.f(C43175k.G(new com.avito.android.employee_mode_impl.manager.state.i(nVar, null, new l0.h())))) : C43175k.s(nVar, C30341d.f147469l);
        if (!c42140a.f405415a) {
            gVar = C43175k.t(gVar, 1);
        }
        return C43175k.I(this.f147407c.c(), new c(gVar));
    }

    @Y61.k
    public final InterfaceC43160i<InterfaceC42451b> c() {
        return C43175k.I(this.f147407c.c(), C43175k.G(new d(null)));
    }

    @Y61.k
    public final InterfaceC43160i<C42454e> d() {
        return C43175k.I(this.f147407c.c(), new e(C43175k.G(new f(null))));
    }

    @Y61.k
    public final InterfaceC43160i<TypedResult<C42450a>> e() {
        return C43175k.I(this.f147407c.c(), C43175k.G(new g(null)));
    }

    public final void f(@Y61.l Boolean bool, @Y61.l String str) {
        if (str == null || str.length() == 0 || bool == null) {
            return;
        }
        C43259k.d(this.f147410f, null, null, new h(str, bool, null), 3);
    }

    public final Object g(InterfaceC39830a interfaceC39830a, SuspendLambda suspendLambda) {
        return this.f147406b.c(new com.avito.android.employee_mode_impl.manager.state.e(this, interfaceC39830a, null), suspendLambda);
    }

    @Y61.k
    public final InterfaceC43160i<Boolean> h() {
        return C43175k.I(this.f147407c.a(), C43175k.G(new i(null)));
    }

    @Y61.k
    public final InterfaceC43160i<InterfaceC42451b> i(@Y61.k C42453d c42453d) {
        return C43175k.I(this.f147407c.c(), C43175k.G(new j(c42453d, this, null)));
    }
}
