package com.avito.android.onboarding;

import com.avito.android.onboarding.model.BxOnboardingState;
import com.avito.android.onboarding.model.BxOnboardingStep;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: BxOnboardingChainController.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/h;", "Lcom/avito/android/onboarding/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.onboarding.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32924h implements InterfaceC32919c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209075a = C42727D.c(e.f209089l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209076b = C42727D.c(a.f209079l);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f209077c = C42727D.c(b.f209080l);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f209078d;

    /* compiled from: BxOnboardingChainController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.onboarding.h$a */
    public static final class a extends N implements Y41.a<Z1<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f209079l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Z1<Boolean> invoke() {
            return p2.a(Boolean.FALSE);
        }
    }

    /* compiled from: BxOnboardingChainController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.onboarding.h$b */
    public static final class b extends N implements Y41.a<Z1<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f209080l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Z1<Boolean> invoke() {
            return p2.a(Boolean.FALSE);
        }
    }

    /* compiled from: BxOnboardingChainController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainControllerImpl$pause$1", f = "BxOnboardingChainController.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.onboarding.h$c */
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209081q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f209083s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f209083s = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C32924h.this.new c(this.f209083s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209081q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C32924h c32924h = C32924h.this;
                Z1<BxOnboardingState> z1A = c32924h.a();
                BxOnboardingState value = c32924h.a().getValue();
                value.getClass();
                if (BxOnboardingState.a.f209120a[value.ordinal()] == 1) {
                    value = this.f209083s ? BxOnboardingState.f209117d : BxOnboardingState.f209116c;
                }
                this.f209081q = 1;
                if (z1A.emit(value, this) == coroutine_suspended) {
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

    /* compiled from: BxOnboardingChainController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainControllerImpl$resume$1", f = "BxOnboardingChainController.kt", i = {0}, l = {102, 104}, m = "invokeSuspend", n = {"value"}, s = {"L$0"})
    /* renamed from: com.avito.android.onboarding.h$d */
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public BxOnboardingState f209084q;

        /* renamed from: r, reason: collision with root package name */
        public int f209085r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f209087t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f209088u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12, boolean z13, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f209087t = z12;
            this.f209088u = z13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C32924h.this.new d(this.f209087t, this.f209088u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            BxOnboardingState bxOnboardingState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209085r;
            C32924h c32924h = C32924h.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                int iOrdinal = c32924h.a().getValue().ordinal();
                bxOnboardingState = BxOnboardingState.f209115b;
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!this.f209087t) {
                        bxOnboardingState = BxOnboardingState.f209117d;
                    }
                }
                Z1<BxOnboardingState> z1A = c32924h.a();
                this.f209084q = bxOnboardingState;
                this.f209085r = 1;
                if (z1A.emit(bxOnboardingState, this) == coroutine_suspended) {
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
                bxOnboardingState = this.f209084q;
                C42729a0.b(obj);
            }
            if (this.f209088u) {
                bxOnboardingState.getClass();
                if (bxOnboardingState == BxOnboardingState.f209115b) {
                    Z1 z12 = (Z1) c32924h.f209076b.getValue();
                    Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                    this.f209084q = null;
                    this.f209085r = 2;
                    if (z12.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BxOnboardingChainController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/flow/Z1;", "Lcom/avito/android/onboarding/model/BxOnboardingState;", "invoke", "()Lkotlinx/coroutines/flow/Z1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.onboarding.h$e */
    public static final class e extends N implements Y41.a<Z1<BxOnboardingState>> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f209089l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Z1<BxOnboardingState> invoke() {
            return p2.a(BxOnboardingState.f209116c);
        }
    }

    /* compiled from: BxOnboardingChainController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainControllerImpl$unlock$1", f = "BxOnboardingChainController.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.onboarding.h$f */
    public static final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f209090q;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C32924h.this.new f(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f209090q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Z1 z12 = (Z1) C32924h.this.f209077c.getValue();
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.f209090q = 1;
                if (z12.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
    public C32924h(@Y61.k R0 r02) {
        this.f209078d = U.a(r02.a());
    }

    public final Z1<BxOnboardingState> a() {
        return (Z1) this.f209075a.getValue();
    }

    @Override // com.avito.android.onboarding.InterfaceC32919c
    @Y61.k
    public final N0 b(boolean z12, boolean z13) {
        return C43259k.d(this.f209078d, null, null, new d(z13, z12, null), 3);
    }

    @Override // com.avito.android.onboarding.InterfaceC32919c
    @Y61.k
    public final InterfaceC43160i<BxOnboardingStep> f(@Y61.k InterfaceC43160i<? extends BxOnboardingStep> interfaceC43160i, @Y61.k InterfaceC43160i<? extends BxOnboardingStep> interfaceC43160i2, @Y61.k InterfaceC43160i<? extends BxOnboardingStep> interfaceC43160i3) {
        e2 e2VarB = f2.b(1, 0, null, 6);
        C0 c0D = C43175k.D(new kotlinx.coroutines.flow.r(new InterfaceC43160i[]{interfaceC43160i, new C43210w(null), interfaceC43160i2}));
        i2.a aVar = i2.f411430a;
        i2 i2VarB = i2.a.b(aVar, 0L, 3);
        C43238h c43238h = this.f209078d;
        C32920d c32920d = new C32920d(new kotlinx.coroutines.flow.internal.o(C43175k.N(e2VarB, C43175k.S(new C32923g((Z1) this.f209076b.getValue()), c43238h, i2.a.b(aVar, 0L, 3), 0)), C43175k.S(c0D, c43238h, i2VarB, 0), new C32921e(3, null)), e2VarB);
        InterfaceC42726C interfaceC42726C = this.f209077c;
        return C43175k.N(new C43197r1(new C32922f(this, null), C43175k.G(new I40.a(C43175k.G(new I40.a(c32920d, null, new InterfaceC43160i[]{new C32923g((Z1) interfaceC42726C.getValue())})), null, new InterfaceC43160i[]{new C32925i(a())}))), C43175k.G(new I40.a(C43175k.G(new I40.a(interfaceC43160i3, null, new InterfaceC43160i[]{new C32923g((Z1) interfaceC42726C.getValue())})), null, new InterfaceC43160i[]{e2VarB, new C32925i(a())})));
    }

    @Override // com.avito.android.onboarding.InterfaceC32919c
    @Y61.k
    public final N0 g(boolean z12) {
        return C43259k.d(this.f209078d, null, null, new c(z12, null), 3);
    }

    @Override // com.avito.android.onboarding.InterfaceC32919c
    @Y61.k
    public final N0 unlock() {
        return C43259k.d(this.f209078d, null, null, new f(null), 3);
    }
}
