package com.avito.android.arch.mvi.android;

import Y41.p;
import Y41.q;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43194q0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.n2;

/* compiled from: EagerlyAndWhileSubscribedOrInForeground.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/arch/mvi/android/d;", "Lkotlinx/coroutines/flow/i2;", "_common_mvi-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements i2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<Boolean> f91851b;

    /* renamed from: c, reason: collision with root package name */
    public final long f91852c;

    /* renamed from: d, reason: collision with root package name */
    public final long f91853d;

    /* compiled from: EagerlyAndWhileSubscribedOrInForeground.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/SharingCommand;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.arch.mvi.android.EagerlyAndWhileSubscribedOrInForeground$command$1", f = "EagerlyAndWhileSubscribedOrInForeground.kt", i = {0}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super SharingCommand>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f91854q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f91855r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n2<Integer> f91856s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f91857t;

        /* compiled from: EagerlyAndWhileSubscribedOrInForeground.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.arch.mvi.android.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2703a extends C42801a implements q<Integer, Boolean, Continuation<? super Q<? extends Integer, ? extends Boolean>>, Object>, SuspendFunction {

            /* renamed from: b, reason: collision with root package name */
            public static final C2703a f91858b = new C2703a();

            public C2703a() {
                super(3, Q.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            @Override // Y41.q
            public final Object invoke(Integer num, Boolean bool, Continuation<? super Q<? extends Integer, ? extends Boolean>> continuation) {
                return new Q(Boxing.boxInt(num.intValue()), Boxing.boxBoolean(bool.booleanValue()));
            }
        }

        /* compiled from: EagerlyAndWhileSubscribedOrInForeground.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/SharingCommand;", "Lkotlin/Q;", "", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.arch.mvi.android.EagerlyAndWhileSubscribedOrInForeground$command$1$3", f = "EagerlyAndWhileSubscribedOrInForeground.kt", i = {1, 2, 3}, l = {36, 38, 40, 41, 43}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
        public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super SharingCommand>, Q<? extends Integer, ? extends Boolean>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f91859q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ InterfaceC43172j f91860r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Q f91861s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ d f91862t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(d dVar, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f91862t = dVar;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super SharingCommand> interfaceC43172j, Q<? extends Integer, ? extends Boolean> q12, Continuation<? super G0> continuation) {
                b bVar = new b(this.f91862t, continuation);
                bVar.f91860r = interfaceC43172j;
                bVar.f91861s = q12;
                return bVar.invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r11.f91859q
                    r2 = 0
                    r3 = 5
                    r4 = 4
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    com.avito.android.arch.mvi.android.d r8 = r11.f91862t
                    if (r1 == 0) goto L39
                    if (r1 == r7) goto L1a
                    if (r1 == r6) goto L33
                    if (r1 == r5) goto L2d
                    if (r1 == r4) goto L27
                    if (r1 != r3) goto L1f
                L1a:
                    kotlin.C42729a0.b(r12)
                    goto L9e
                L1f:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L27:
                    kotlinx.coroutines.flow.j r1 = r11.f91860r
                    kotlin.C42729a0.b(r12)
                    goto L84
                L2d:
                    kotlinx.coroutines.flow.j r1 = r11.f91860r
                    kotlin.C42729a0.b(r12)
                    goto L77
                L33:
                    kotlinx.coroutines.flow.j r1 = r11.f91860r
                    kotlin.C42729a0.b(r12)
                    goto L62
                L39:
                    kotlin.C42729a0.b(r12)
                    kotlinx.coroutines.flow.j r1 = r11.f91860r
                    kotlin.Q r12 = r11.f91861s
                    A r9 = r12.f406619b
                    java.lang.Number r9 = (java.lang.Number) r9
                    int r9 = r9.intValue()
                    B r12 = r12.f406620c
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r12 = r12.booleanValue()
                    if (r9 > 0) goto L91
                    if (r12 == 0) goto L55
                    goto L91
                L55:
                    long r9 = r8.f91852c
                    r11.f91860r = r1
                    r11.f91859q = r6
                    java.lang.Object r12 = kotlinx.coroutines.C43131e0.b(r9, r11)
                    if (r12 != r0) goto L62
                    return r0
                L62:
                    long r6 = r8.f91853d
                    r9 = 0
                    int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                    if (r12 <= 0) goto L84
                    kotlinx.coroutines.flow.SharingCommand r12 = kotlinx.coroutines.flow.SharingCommand.f411256c
                    r11.f91860r = r1
                    r11.f91859q = r5
                    java.lang.Object r12 = r1.emit(r12, r11)
                    if (r12 != r0) goto L77
                    return r0
                L77:
                    long r5 = r8.f91853d
                    r11.f91860r = r1
                    r11.f91859q = r4
                    java.lang.Object r12 = kotlinx.coroutines.C43131e0.b(r5, r11)
                    if (r12 != r0) goto L84
                    return r0
                L84:
                    kotlinx.coroutines.flow.SharingCommand r12 = kotlinx.coroutines.flow.SharingCommand.f411257d
                    r11.f91860r = r2
                    r11.f91859q = r3
                    java.lang.Object r12 = r1.emit(r12, r11)
                    if (r12 != r0) goto L9e
                    return r0
                L91:
                    kotlinx.coroutines.flow.SharingCommand r12 = kotlinx.coroutines.flow.SharingCommand.f411255b
                    r11.f91860r = r2
                    r11.f91859q = r7
                    java.lang.Object r12 = r1.emit(r12, r11)
                    if (r12 != r0) goto L9e
                    return r0
                L9e:
                    kotlin.G0 r12 = kotlin.G0.f406611a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.arch.mvi.android.d.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: EagerlyAndWhileSubscribedOrInForeground.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.arch.mvi.android.EagerlyAndWhileSubscribedOrInForeground$command$1$4", f = "EagerlyAndWhileSubscribedOrInForeground.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements p<SharingCommand, Continuation<? super Boolean>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f91863q;

            public c() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                c cVar = new c(2, continuation);
                cVar.f91863q = obj;
                return cVar;
            }

            @Override // Y41.p
            public final Object invoke(SharingCommand sharingCommand, Continuation<? super Boolean> continuation) {
                return ((c) create(sharingCommand, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return Boxing.boxBoolean(((SharingCommand) this.f91863q) != SharingCommand.f411255b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2<Integer> n2Var, d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f91856s = n2Var;
            this.f91857t = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f91856s, this.f91857t, continuation);
            aVar.f91855r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SharingCommand> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f91854q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f91855r;
                SharingCommand sharingCommand = SharingCommand.f411255b;
                this.f91855r = interfaceC43172j;
                this.f91854q = 1;
                if (interfaceC43172j.emit(sharingCommand, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f91855r;
                C42729a0.b(obj);
            }
            d dVar = this.f91857t;
            InterfaceC43160i interfaceC43160iR = C43175k.r(new C43194q0(new c(2, null), C43175k.Y(C43175k.r(new C1(this.f91856s, dVar.f91851b, C2703a.f91858b)), new b(dVar, null))));
            this.f91855r = null;
            this.f91854q = 2;
            if (C43175k.u(this, interfaceC43160iR, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    public d() {
        throw null;
    }

    public d(InterfaceC43160i interfaceC43160i, long j12, long j13, int i12, C42822w c42822w) {
        j12 = (i12 & 2) != 0 ? 0L : j12;
        j13 = (i12 & 4) != 0 ? Long.MAX_VALUE : j13;
        this.f91851b = interfaceC43160i;
        this.f91852c = j12;
        this.f91853d = j13;
        if (j12 < 0) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(j12, "stopTimeoutMillis(", " ms) cannot be negative").toString());
        }
        if (j13 < 0) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(j13, "replayExpirationMillis(", " ms) cannot be negative").toString());
        }
    }

    @Override // kotlinx.coroutines.flow.i2
    @Y61.k
    public final InterfaceC43160i<SharingCommand> a(@Y61.k n2<Integer> n2Var) {
        return C43175k.G(new a(n2Var, this, null));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f91852c == dVar.f91852c && this.f91853d == dVar.f91853d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f91853d) + (Long.hashCode(this.f91852c) * 31);
    }

    @Y61.k
    public final String toString() {
        return "EagerlyAndWhileSubscribedOrInForeground";
    }
}
