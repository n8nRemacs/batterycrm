package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.O1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/t1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/t1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {814}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Z1 extends SuspendLambda implements Y41.p<InterfaceC20506t1, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C20433a2 f27534q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f27535r;

    /* renamed from: s, reason: collision with root package name */
    public long f27536s;

    /* renamed from: t, reason: collision with root package name */
    public int f27537t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f27538u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C20433a2 f27539v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0.g f27540w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f27541x;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/Z1$a", "Landroidx/compose/foundation/gestures/G1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements G1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C20433a2 f27542a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20506t1 f27543b;

        public a(InterfaceC20506t1 interfaceC20506t1, C20433a2 c20433a2) {
            this.f27542a = c20433a2;
            this.f27543b = interfaceC20506t1;
        }

        @Override // androidx.compose.foundation.gestures.G1
        public final float a(float f12) {
            boolean z12 = androidx.compose.foundation.N0.f26803a;
            C20433a2 c20433a2 = this.f27542a;
            if (z12 && Math.abs(f12) != 0.0f && ((f12 > 0.0f && !c20433a2.f27548a.b()) || ((f12 < 0.0f && !c20433a2.f27548a.d()) || !((Boolean) ((O1.e) c20433a2.f27554g).invoke()).booleanValue()))) {
                throw new FlingCancellationException();
            }
            long jE2 = c20433a2.e(c20433a2.h(f12));
            androidx.compose.ui.input.nestedscroll.i.f40105b.getClass();
            return c20433a2.d(c20433a2.g(this.f27543b.a(androidx.compose.ui.input.nestedscroll.i.f40107d, jE2)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(C20433a2 c20433a2, l0.g gVar, long j12, Continuation<? super Z1> continuation) {
        super(2, continuation);
        this.f27539v = c20433a2;
        this.f27540w = gVar;
        this.f27541x = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        Z1 z12 = new Z1(this.f27539v, this.f27540w, this.f27541x, continuation);
        z12.f27538u = obj;
        return z12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC20506t1 interfaceC20506t1, Continuation<? super kotlin.G0> continuation) {
        return ((Z1) create(interfaceC20506t1, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C20433a2 c20433a2;
        l0.g gVar;
        long j12;
        C20433a2 c20433a22;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27537t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC20506t1 interfaceC20506t1 = (InterfaceC20506t1) this.f27538u;
            c20433a2 = this.f27539v;
            a aVar = new a(interfaceC20506t1, c20433a2);
            InterfaceC20432a1 interfaceC20432a1 = c20433a2.f27550c;
            gVar = this.f27540w;
            long j13 = gVar.f406841b;
            Orientation orientation = c20433a2.f27551d;
            Orientation orientation2 = Orientation.f27426c;
            long j14 = this.f27541x;
            float fD2 = c20433a2.d(orientation == orientation2 ? androidx.compose.ui.unit.B.c(j14) : androidx.compose.ui.unit.B.d(j14));
            this.f27538u = c20433a2;
            this.f27534q = c20433a2;
            this.f27535r = gVar;
            this.f27536s = j13;
            this.f27537t = 1;
            obj = interfaceC20432a1.a(aVar, fD2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            j12 = j13;
            c20433a22 = c20433a2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j12 = this.f27536s;
            gVar = this.f27535r;
            c20433a2 = this.f27534q;
            c20433a22 = (C20433a2) this.f27538u;
            C42729a0.b(obj);
        }
        float fD3 = c20433a22.d(((Number) obj).floatValue());
        gVar.f406841b = c20433a2.f27551d == Orientation.f27426c ? androidx.compose.ui.unit.B.b(fD3, 0.0f, 2, j12) : androidx.compose.ui.unit.B.b(0.0f, fD3, 1, j12);
        return kotlin.G0.f406611a;
    }
}
