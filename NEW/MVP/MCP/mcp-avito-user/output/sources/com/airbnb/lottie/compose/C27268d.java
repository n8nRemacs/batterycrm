package com.airbnb.lottie.compose;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.airbnb.lottie.C27291k;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.Q0;

/* compiled from: LottieAnimatable.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.airbnb.lottie.compose.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27268d extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f59428q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C27271g f59429r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f59430s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f59431t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f59432u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f59433v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC27282s f59434w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C27291k f59435x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f59436y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ LottieCancellationBehavior f59437z;

    /* compiled from: LottieAnimatable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.airbnb.lottie.compose.d$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f59438q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ LottieCancellationBehavior f59439r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ N0 f59440s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f59441t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f59442u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C27271g f59443v;

        /* compiled from: LottieAnimatable.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.airbnb.lottie.compose.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2077a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f59444a;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                try {
                    LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.f59394b;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f59444a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LottieCancellationBehavior lottieCancellationBehavior, N0 n02, int i12, int i13, C27271g c27271g, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f59439r = lottieCancellationBehavior;
            this.f59440s = n02;
            this.f59441t = i12;
            this.f59442u = i13;
            this.f59443v = c27271g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f59439r, this.f59440s, this.f59441t, this.f59442u, this.f59443v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f59438q
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.C42729a0.b(r5)
                goto L5d
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.C42729a0.b(r5)
            L1a:
                int[] r5 = com.airbnb.lottie.compose.C27268d.a.C2077a.f59444a
                com.airbnb.lottie.compose.LottieCancellationBehavior r1 = r4.f59439r
                int r1 = r1.ordinal()
                r5 = r5[r1]
                int r1 = r4.f59441t
                if (r5 != r2) goto L33
                kotlinx.coroutines.N0 r5 = r4.f59440s
                boolean r5 = r5.isActive()
                if (r5 == 0) goto L31
                goto L33
            L31:
                int r1 = r4.f59442u
            L33:
                r4.f59438q = r2
                com.airbnb.lottie.compose.g r5 = r4.f59443v
                r5.getClass()
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r1 != r3) goto L49
                com.airbnb.lottie.compose.e r3 = new com.airbnb.lottie.compose.e
                r3.<init>(r5, r1)
                java.lang.Object r5 = androidx.compose.animation.core.C20275e0.a(r3, r4)
                goto L5a
            L49:
                com.airbnb.lottie.compose.f r3 = new com.airbnb.lottie.compose.f
                r3.<init>(r5, r1)
                kotlin.coroutines.CoroutineContext r5 = r4.getF411447c()
                androidx.compose.runtime.V0 r5 = androidx.compose.runtime.X0.a(r5)
                java.lang.Object r5 = r5.N(r3, r4)
            L5a:
                if (r5 != r0) goto L5d
                return r0
            L5d:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L1a
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.C27268d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LottieAnimatable.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.airbnb.lottie.compose.d$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[LottieCancellationBehavior.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.f59394b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27268d(C27271g c27271g, int i12, int i13, boolean z12, float f12, AbstractC27282s abstractC27282s, C27291k c27291k, float f13, LottieCancellationBehavior lottieCancellationBehavior, Continuation continuation) {
        super(1, continuation);
        this.f59429r = c27271g;
        this.f59430s = i12;
        this.f59431t = i13;
        this.f59432u = z12;
        this.f59433v = f12;
        this.f59434w = abstractC27282s;
        this.f59435x = c27291k;
        this.f59436y = f13;
        this.f59437z = lottieCancellationBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new C27268d(this.f59429r, this.f59430s, this.f59431t, this.f59432u, this.f59433v, this.f59434w, this.f59435x, this.f59436y, this.f59437z, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return ((C27268d) create(continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        CoroutineContext coroutineContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f59428q;
        C27271g c27271g = this.f59429r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                c27271g.j(this.f59430s);
                InterfaceC22204y1 interfaceC22204y1 = c27271g.f59451d;
                int i13 = this.f59431t;
                ((C22082i3) interfaceC22204y1).setValue(Integer.valueOf(i13));
                ((C22082i3) c27271g.f59452e).setValue(Boolean.valueOf(this.f59432u));
                InterfaceC22204y1 interfaceC22204y12 = c27271g.f59454g;
                float f12 = this.f59433v;
                ((C22082i3) interfaceC22204y12).setValue(Float.valueOf(f12));
                ((C22082i3) c27271g.f59453f).setValue(this.f59434w);
                C22082i3 c22082i3 = (C22082i3) c27271g.f59457j;
                C27291k c27291k = this.f59435x;
                c22082i3.setValue(c27291k);
                c27271g.p(this.f59436y);
                ((C22082i3) c27271g.f59455h).setValue(Boolean.FALSE);
                ((C22082i3) c27271g.f59460m).setValue(Long.MIN_VALUE);
                if (c27291k == null) {
                    C27271g.d(c27271g, false);
                    return G0.f406611a;
                }
                if (Float.isInfinite(f12)) {
                    c27271g.p(((Number) c27271g.f59461n.getF42167b()).floatValue());
                    C27271g.d(c27271g, false);
                    c27271g.j(i13);
                    return G0.f406611a;
                }
                C27271g.d(c27271g, true);
                int iOrdinal = this.f59437z.ordinal();
                if (iOrdinal == 0) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    coroutineContext = C43135f1.f411090b;
                }
                a aVar = new a(this.f59437z, Q0.f(getF411447c()), this.f59431t, this.f59430s, this.f59429r, null);
                this.f59428q = 1;
                if (C43259k.g(coroutineContext, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            Q0.e(getF411447c());
            C27271g.d(c27271g, false);
            return G0.f406611a;
        } catch (Throwable th2) {
            C27271g.d(c27271g, false);
            throw th2;
        }
    }
}
