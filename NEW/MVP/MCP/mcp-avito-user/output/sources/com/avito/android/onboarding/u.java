package com.avito.android.onboarding;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.onboarding.model.BxOnboardingStep;
import java.util.Arrays;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxOnboardingChainObserver.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/u;", "Lcom/avito/android/onboarding/t;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final F f209385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32927k f209386b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n f209387c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32919c f209388d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f209389e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC43160i<? extends BxOnboardingStep>[], InterfaceC43160i<BxOnboardingStep>> f209390f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC43160i<? extends BxOnboardingStep>[], InterfaceC43160i<BxOnboardingStep>> f209391g;

    /* compiled from: BxOnboardingChainObserver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "it", "invoke", "([Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC43160i<? extends BxOnboardingStep>[], InterfaceC43160i<? extends BxOnboardingStep>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f209392l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC43160i<? extends BxOnboardingStep> invoke(InterfaceC43160i<? extends BxOnboardingStep>[] interfaceC43160iArr) {
            InterfaceC43160i<? extends BxOnboardingStep>[] interfaceC43160iArr2 = interfaceC43160iArr;
            return C43175k.N((InterfaceC43160i[]) Arrays.copyOf(interfaceC43160iArr2, interfaceC43160iArr2.length));
        }
    }

    /* compiled from: BxOnboardingChainObserver.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/onboarding/model/BxOnboardingStep;", "it", "invoke", "([Lkotlinx/coroutines/flow/i;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC43160i<? extends BxOnboardingStep>[], InterfaceC43160i<? extends BxOnboardingStep>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f209393l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC43160i<? extends BxOnboardingStep> invoke(InterfaceC43160i<? extends BxOnboardingStep>[] interfaceC43160iArr) {
            InterfaceC43160i<? extends BxOnboardingStep>[] interfaceC43160iArr2 = interfaceC43160iArr;
            return C43175k.D(new kotlinx.coroutines.flow.r((InterfaceC43160i[]) Arrays.copyOf(interfaceC43160iArr2, interfaceC43160iArr2.length)));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<BxOnboardingStep> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f209394b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u f209395c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f209396b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ u f209397c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainObserverImpl$observe$$inlined$map$1$2", f = "BxOnboardingChainObserver.kt", i = {}, l = {220, 219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.onboarding.u$c$a$a, reason: collision with other inner class name */
            public static final class C6241a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f209398q;

                /* renamed from: r, reason: collision with root package name */
                public int f209399r;

                /* renamed from: s, reason: collision with root package name */
                public InterfaceC43172j f209400s;

                public C6241a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f209398q = obj;
                    this.f209399r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, u uVar) {
                this.f209396b = interfaceC43172j;
                this.f209397c = uVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.avito.android.onboarding.u.c.a.C6241a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.avito.android.onboarding.u$c$a$a r0 = (com.avito.android.onboarding.u.c.a.C6241a) r0
                    int r1 = r0.f209399r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f209399r = r1
                    goto L18
                L13:
                    com.avito.android.onboarding.u$c$a$a r0 = new com.avito.android.onboarding.u$c$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f209398q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f209399r
                    r3 = 0
                    r4 = 2
                    r5 = 1
                    if (r2 == 0) goto L3b
                    if (r2 == r5) goto L35
                    if (r2 != r4) goto L2d
                    kotlin.C42729a0.b(r9)
                    goto L76
                L2d:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L35:
                    kotlinx.coroutines.flow.j r8 = r0.f209400s
                    kotlin.C42729a0.b(r9)
                    goto L6b
                L3b:
                    kotlin.C42729a0.b(r9)
                    com.avito.android.onboarding.model.BxOnboardingStep r8 = (com.avito.android.onboarding.model.BxOnboardingStep) r8
                    kotlinx.coroutines.flow.j r9 = r7.f209396b
                    r0.f209400s = r9
                    r0.f209399r = r5
                    com.avito.android.onboarding.u r2 = r7.f209397c
                    r2.getClass()
                    java.lang.Class r5 = r8.c()
                    if (r5 == 0) goto L5e
                    com.avito.android.onboarding.F r2 = r2.f209385a
                    java.util.Map r2 = r2.getAll()
                    java.lang.Object r2 = r2.get(r5)
                    com.avito.android.onboarding.E r2 = (com.avito.android.onboarding.E) r2
                    goto L5f
                L5e:
                    r2 = r3
                L5f:
                    if (r2 == 0) goto L65
                    com.avito.android.onboarding.model.BxOnboardingStep r8 = r2.a(r8)
                L65:
                    if (r8 != r1) goto L68
                    return r1
                L68:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L6b:
                    r0.f209400s = r3
                    r0.f209399r = r4
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L76
                    return r1
                L76:
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.u.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i, u uVar) {
            this.f209394b = interfaceC43160i;
            this.f209395c = uVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super BxOnboardingStep> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f209394b.collect(new a(interfaceC43172j, this.f209395c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: BxOnboardingChainObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/onboarding/model/BxOnboardingStep;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/onboarding/model/BxOnboardingStep;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainObserverImpl$observe$2", f = "BxOnboardingChainObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<BxOnboardingStep, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f209402q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = u.this.new d(continuation);
            dVar.f209402q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(BxOnboardingStep bxOnboardingStep, Continuation<? super G0> continuation) {
            return ((d) create(bxOnboardingStep, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            if (((BxOnboardingStep) this.f209402q) == null) {
                u.this.f209388d.b((3 & 1) != 0, (3 & 2) != 0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BxOnboardingChainObserver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends C42801a implements Y41.p<BxOnboardingStep, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(BxOnboardingStep bxOnboardingStep, Continuation<? super G0> continuation) {
            u uVar = (u) this.receiver;
            uVar.getClass();
            uVar.f209389e.c(new y.a("newOnboarding." + bxOnboardingStep.f209121b, 0L, 2, null));
            return G0.f406611a;
        }
    }

    public u() {
        throw null;
    }

    @Inject
    public u(@Y61.k F f12, @Y61.k InterfaceC32927k interfaceC32927k, @Y61.k n nVar, @Y61.k InterfaceC32919c interfaceC32919c, @Y61.k InterfaceC28373a interfaceC28373a) {
        a aVar = a.f209392l;
        b bVar = b.f209393l;
        this.f209385a = f12;
        this.f209386b = interfaceC32927k;
        this.f209387c = nVar;
        this.f209388d = interfaceC32919c;
        this.f209389e = interfaceC28373a;
        this.f209390f = aVar;
        this.f209391g = bVar;
    }

    @Override // com.avito.android.onboarding.t
    @Y61.k
    public final InterfaceC43160i<BxOnboardingStep> a() {
        F f12 = this.f209385a;
        Collection<E> collectionValues = f12.a().values();
        InterfaceC32927k interfaceC32927k = this.f209386b;
        InterfaceC43160i<BxOnboardingStep> interfaceC43160iA = interfaceC32927k.a(collectionValues);
        InterfaceC43160i<BxOnboardingStep> interfaceC43160iA2 = interfaceC32927k.a(f12.c().values());
        n nVar = this.f209387c;
        return new C43197r1(new e(2, this, u.class, "track", "track(Lcom/avito/android/onboarding/model/BxOnboardingStep;)V", 4), new C43189o1(new C43197r1(new d(null), new c(this.f209388d.f(interfaceC43160iA, ((b) this.f209391g).invoke(new InterfaceC43160i[]{interfaceC43160iA2, nVar.getQueue()}), ((a) this.f209390f).invoke(new InterfaceC43160i[]{interfaceC32927k.b(f12.b().values()), nVar.e()})), this))));
    }
}
