package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C22040c3;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/gestures/a;", "Landroidx/compose/foundation/gestures/T0;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/a;Landroidx/compose/foundation/gestures/T0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$fling$2", f = "AnchoredDraggable.kt", i = {}, l = {469}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class r extends SuspendLambda implements Y41.q<InterfaceC20430a, T0<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27934q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27935r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20490p<Object> f27936s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.e f27937t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f27938u;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/r$a", "Landroidx/compose/foundation/gestures/G1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements G1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C20490p<Object> f27939a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20430a f27940b;

        public a(C20490p<Object> c20490p, InterfaceC20430a interfaceC20430a) {
            this.f27939a = c20490p;
            this.f27940b = interfaceC20430a;
        }

        @Override // androidx.compose.foundation.gestures.G1
        public final float a(float f12) {
            C20490p<Object> c20490p = this.f27939a;
            float fE2 = c20490p.f27894z.e(f12);
            float f13 = fE2 - ((C22040c3) c20490p.f27894z.f27971j).f();
            this.f27940b.a(fE2, 0.0f);
            return f13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C20490p<Object> c20490p, l0.e eVar, float f12, Continuation<? super r> continuation) {
        super(3, continuation);
        this.f27936s = c20490p;
        this.f27937t = eVar;
        this.f27938u = f12;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC20430a interfaceC20430a, T0<Object> t02, Continuation<? super kotlin.G0> continuation) {
        float f12 = this.f27938u;
        r rVar = new r(this.f27936s, this.f27937t, f12, continuation);
        rVar.f27935r = interfaceC20430a;
        return rVar.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l0.e eVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27934q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC20430a interfaceC20430a = (InterfaceC20430a) this.f27935r;
            C20490p<Object> c20490p = this.f27936s;
            a aVar = new a(c20490p, interfaceC20430a);
            InterfaceC20432a1 interfaceC20432a1 = c20490p.f27892F;
            if (interfaceC20432a1 == null) {
                interfaceC20432a1 = null;
            }
            l0.e eVar2 = this.f27937t;
            this.f27935r = eVar2;
            this.f27934q = 1;
            obj = interfaceC20432a1.a(aVar, this.f27938u, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            eVar = eVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (l0.e) this.f27935r;
            C42729a0.b(obj);
        }
        eVar.f406839b = ((Number) obj).floatValue();
        return kotlin.G0.f406611a;
    }
}
