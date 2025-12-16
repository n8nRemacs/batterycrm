package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/U;", "Landroidx/compose/foundation/gestures/U1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class U implements U1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f27482a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f27483b = new b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.G1 f27484c = new androidx.compose.foundation.G1();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Boolean> f27485d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Boolean> f27486e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Boolean> f27487f;

    /* compiled from: ScrollableState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27488q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ MutatePriority f27490s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.p<G1, Continuation<? super kotlin.G0>, Object> f27491t;

        /* compiled from: ScrollableState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.U$a$a, reason: collision with other inner class name */
        public static final class C1574a extends SuspendLambda implements Y41.p<G1, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f27492q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f27493r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ U f27494s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Y41.p<G1, Continuation<? super kotlin.G0>, Object> f27495t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1574a(U u12, Y41.p<? super G1, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super C1574a> continuation) {
                super(2, continuation);
                this.f27494s = u12;
                this.f27495t = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                C1574a c1574a = new C1574a(this.f27494s, this.f27495t, continuation);
                c1574a.f27493r = obj;
                return c1574a;
            }

            @Override // Y41.p
            public final Object invoke(G1 g12, Continuation<? super kotlin.G0> continuation) {
                return ((C1574a) create(g12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f27492q;
                U u12 = this.f27494s;
                try {
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        G1 g12 = (G1) this.f27493r;
                        ((C22082i3) u12.f27485d).setValue(Boxing.boxBoolean(true));
                        Y41.p<G1, Continuation<? super kotlin.G0>, Object> pVar = this.f27495t;
                        this.f27492q = 1;
                        if (pVar.invoke(g12, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    ((C22082i3) u12.f27485d).setValue(Boxing.boxBoolean(false));
                    return kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    ((C22082i3) u12.f27485d).setValue(Boxing.boxBoolean(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(MutatePriority mutatePriority, Y41.p<? super G1, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27490s = mutatePriority;
            this.f27491t = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return U.this.new a(this.f27490s, this.f27491t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27488q;
            if (i12 == 0) {
                C42729a0.b(obj);
                U u12 = U.this;
                androidx.compose.foundation.G1 g12 = u12.f27484c;
                b bVar = u12.f27483b;
                C1574a c1574a = new C1574a(u12, this.f27491t, null);
                this.f27488q = 1;
                if (g12.c(bVar, this.f27490s, c1574a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ScrollableState.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/U$b", "Landroidx/compose/foundation/gestures/G1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements G1 {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.compose.foundation.gestures.G1
        public final float a(float f12) {
            if (Float.isNaN(f12)) {
                return 0.0f;
            }
            U u12 = U.this;
            float fFloatValue = ((Number) u12.f27482a.invoke(Float.valueOf(f12))).floatValue();
            ((C22082i3) u12.f27486e).setValue(Boolean.valueOf(fFloatValue > 0.0f));
            ((C22082i3) u12.f27487f).setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U(@Y61.k Y41.l<? super Float, Float> lVar) {
        this.f27482a = (kotlin.jvm.internal.N) lVar;
        Boolean bool = Boolean.FALSE;
        this.f27485d = C22126m3.g(bool);
        this.f27486e = C22126m3.g(bool);
        this.f27487f = C22126m3.g(bool);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean a() {
        return ((Boolean) ((C22082i3) this.f27485d).getF42167b()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.compose.foundation.gestures.U1
    public final float c(float f12) {
        return ((Number) this.f27482a.invoke(Float.valueOf(f12))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    @Y61.l
    public final Object e(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.p<? super G1, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new a(mutatePriority, pVar, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }
}
