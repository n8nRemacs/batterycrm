package com.avito.android.phones_actualization.scenario;

import To.InterfaceC15383a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.registration.VerifyCodeResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ActualizePhonesCodeConfirmInteractor.kt */
@com.avito.android.code_check_public.g
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phones_actualization/scenario/a;", "Lcom/avito/android/code_check_public/screen/c$b;", "_avito_phones-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends c.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.r f216219a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34258d f216220b;

    /* compiled from: ActualizePhonesCodeConfirmInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.phones_actualization.scenario.ActualizePhonesCodeConfirmInteractor$confirm$1", f = "ActualizePhonesCodeConfirmInteractor.kt", i = {}, l = {35, 34}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.phones_actualization.scenario.a$a, reason: collision with other inner class name */
    public static final class C6484a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<VerifyCodeResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f216221q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f216222r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f216223s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f216224t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f216225u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6484a(String str, a aVar, String str2, Continuation<? super C6484a> continuation) {
            super(2, continuation);
            this.f216223s = str;
            this.f216224t = aVar;
            this.f216225u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C6484a c6484a = new C6484a(this.f216223s, this.f216224t, this.f216225u, continuation);
            c6484a.f216222r = obj;
            return c6484a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<VerifyCodeResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6484a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f216221q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f216222r;
                String str = this.f216223s;
                if ((str != null ? Phone.a(str) : null) == null) {
                    throw new IllegalArgumentException("Phone must be set for ActualizePhonesCodeConfirmInteractor");
                }
                com.avito.android.remote.r rVar = this.f216224t.f216219a;
                String strB = Phone.b(str);
                this.f216222r = interfaceC43172j;
                this.f216221q = 1;
                obj = rVar.o(strB, this.f216225u, "actualization_popup", this);
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
                interfaceC43172j = (InterfaceC43172j) this.f216222r;
                C42729a0.b(obj);
            }
            this.f216222r = null;
            this.f216221q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ActualizePhonesCodeConfirmInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "confirmResult", "LTo/a;", "<anonymous>", "(Lcom/avito/android/remote/model/registration/VerifyCodeResult;)LTo/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.phones_actualization.scenario.ActualizePhonesCodeConfirmInteractor$confirm$2$codeConfirmResult$1", f = "ActualizePhonesCodeConfirmInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<VerifyCodeResult, Continuation<? super InterfaceC15383a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f216226q;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f216226q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(VerifyCodeResult verifyCodeResult, Continuation<? super InterfaceC15383a> continuation) {
            return ((b) create(verifyCodeResult, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            VerifyCodeResult verifyCodeResult = (VerifyCodeResult) this.f216226q;
            if (verifyCodeResult instanceof VerifyCodeResult.Ok) {
                throw new IllegalStateException("Not expected");
            }
            if (verifyCodeResult instanceof VerifyCodeResult.Failure) {
                return new InterfaceC15383a.d.b(com.avito.android.printable_text.b.f(((VerifyCodeResult.Failure) verifyCodeResult).getMessage()));
            }
            if (!(verifyCodeResult instanceof VerifyCodeResult.IncorrectData)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = (String) C42745f0.F(((VerifyCodeResult.IncorrectData) verifyCodeResult).getMessages().values());
            return new InterfaceC15383a.d.b(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.code_check_public.k.a());
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.phones_actualization.scenario.ActualizePhonesCodeConfirmInteractor$confirm-SLR4gvU$$inlined$transform$1", f = "ActualizePhonesCodeConfirmInteractor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC15383a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f216227q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f216228r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f216229s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f216230t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.phones_actualization.scenario.a$c$a, reason: collision with other inner class name */
        public static final class C6485a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC15383a> f216231b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f216232c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.phones_actualization.scenario.ActualizePhonesCodeConfirmInteractor$confirm-SLR4gvU$$inlined$transform$1$1", f = "ActualizePhonesCodeConfirmInteractor.kt", i = {1}, l = {221, 223, 224}, m = "emit", n = {"$this$confirm_SLR4gvU_u24lambda_u240"}, s = {"L$0"})
            /* renamed from: com.avito.android.phones_actualization.scenario.a$c$a$a, reason: collision with other inner class name */
            public static final class C6486a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f216233q;

                /* renamed from: r, reason: collision with root package name */
                public int f216234r;

                /* renamed from: t, reason: collision with root package name */
                public InterfaceC43172j f216236t;

                public C6486a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f216233q = obj;
                    this.f216234r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6485a.this.emit(null, this);
                }
            }

            public C6485a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f216232c = aVar;
                this.f216231b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.avito.android.phones_actualization.scenario.a.c.C6485a.C6486a
                    if (r0 == 0) goto L13
                    r0 = r11
                    com.avito.android.phones_actualization.scenario.a$c$a$a r0 = (com.avito.android.phones_actualization.scenario.a.c.C6485a.C6486a) r0
                    int r1 = r0.f216234r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f216234r = r1
                    goto L18
                L13:
                    com.avito.android.phones_actualization.scenario.a$c$a$a r0 = new com.avito.android.phones_actualization.scenario.a$c$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f216233q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f216234r
                    r3 = 3
                    r4 = 0
                    r5 = 2
                    r6 = 1
                    if (r2 == 0) goto L3f
                    if (r2 == r6) goto L3b
                    if (r2 == r5) goto L35
                    if (r2 != r3) goto L2d
                    goto L3b
                L2d:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L35:
                    kotlinx.coroutines.flow.j r10 = r0.f216236t
                    kotlin.C42729a0.b(r11)
                    goto L92
                L3b:
                    kotlin.C42729a0.b(r11)
                    goto L9f
                L3f:
                    kotlin.C42729a0.b(r11)
                    com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                    boolean r11 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                    com.avito.android.phones_actualization.scenario.a r2 = r9.f216232c
                    kotlinx.coroutines.flow.j<To.a> r7 = r9.f216231b
                    if (r11 == 0) goto L7e
                    r11 = r10
                    com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                    java.lang.Object r8 = r11.getResult()
                    boolean r8 = r8 instanceof com.avito.android.remote.model.registration.VerifyCodeResult.Ok
                    if (r8 == 0) goto L7e
                    java.lang.Object r10 = r11.getResult()
                    com.avito.android.remote.model.registration.VerifyCodeResult$Ok r10 = (com.avito.android.remote.model.registration.VerifyCodeResult.Ok) r10
                    java.lang.Boolean r10 = r10.getReverified()
                    java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                    boolean r10 = kotlin.jvm.internal.L.f(r10, r11)
                    r2.getClass()
                    com.avito.android.phones_actualization.scenario.b r11 = new com.avito.android.phones_actualization.scenario.b
                    r11.<init>(r2, r10, r4)
                    kotlinx.coroutines.flow.i r10 = kotlinx.coroutines.flow.C43175k.G(r11)
                    r0.f216234r = r6
                    java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r0, r10, r7)
                    if (r10 != r1) goto L9f
                    return r1
                L7e:
                    com.avito.android.phones_actualization.scenario.a$b r11 = new com.avito.android.phones_actualization.scenario.a$b
                    r11.<init>(r5, r4)
                    r0.f216236t = r7
                    r0.f216234r = r5
                    r2.getClass()
                    java.lang.Object r11 = com.avito.android.code_check_public.screen.c.b.b(r10, r11, r0)
                    if (r11 != r1) goto L91
                    return r1
                L91:
                    r10 = r7
                L92:
                    To.a r11 = (To.InterfaceC15383a) r11
                    r0.f216236t = r4
                    r0.f216234r = r3
                    java.lang.Object r10 = r10.emit(r11, r0)
                    if (r10 != r1) goto L9f
                    return r1
                L9f:
                    kotlin.G0 r10 = kotlin.G0.f406611a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.phones_actualization.scenario.a.c.C6485a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC43160i interfaceC43160i, Continuation continuation, a aVar) {
            super(2, continuation);
            this.f216229s = interfaceC43160i;
            this.f216230t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f216229s, continuation, this.f216230t);
            cVar.f216228r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f216227q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C6485a c6485a = new C6485a((InterfaceC43172j) this.f216228r, this.f216230t);
                this.f216227q = 1;
                if (this.f216229s.collect(c6485a, this) == coroutine_suspended) {
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

    @Inject
    public a(@Y61.k com.avito.android.remote.r rVar, @Y61.k InterfaceC34258d interfaceC34258d) {
        this.f216219a = rVar;
        this.f216220b = interfaceC34258d;
    }

    @Override // com.avito.android.code_check_public.screen.c.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC15383a> a(@Y61.k String str, @Y61.l String str2) {
        return C43175k.G(new c(C43175k.G(new C6484a(str2, this, str, null)), null, this));
    }
}
