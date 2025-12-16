package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20273d1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: ScrollExtensions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/G1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/G1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class B1 extends SuspendLambda implements Y41.p<G1, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27200q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27201r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f27202s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.G1 f27203t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l0.e f27204u;

    /* compiled from: ScrollExtensions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<Float, Float, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.e f27205l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ G1 f27206m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.e eVar, G1 g12) {
            super(2);
            this.f27205l = eVar;
            this.f27206m = g12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(Float f12, Float f13) {
            float fFloatValue = f12.floatValue();
            f13.floatValue();
            l0.e eVar = this.f27205l;
            float f14 = eVar.f406839b;
            eVar.f406839b = this.f27206m.a(fFloatValue - f14) + f14;
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(float f12, androidx.compose.animation.core.G1 g12, l0.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f27202s = f12;
        this.f27203t = g12;
        this.f27204u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        B1 b12 = new B1(this.f27202s, this.f27203t, this.f27204u, continuation);
        b12.f27201r = obj;
        return b12;
    }

    @Override // Y41.p
    public final Object invoke(G1 g12, Continuation<? super kotlin.G0> continuation) {
        return ((B1) create(g12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27200q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f27204u, (G1) this.f27201r);
            this.f27200q = 1;
            if (C20273d1.c(0.0f, this.f27202s, this.f27203t, aVar, this, 4) == coroutine_suspended) {
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
