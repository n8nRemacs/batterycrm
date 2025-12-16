package androidx.compose.material;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.C20318t;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/O0;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/O0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {1053}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class J8 extends SuspendLambda implements Y41.p<androidx.compose.foundation.gestures.O0, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32801q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f32802r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f32803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f32804t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f32805u;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/c;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C20268c<Float, C20318t>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.gestures.O0 f32806l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.e f32807m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.foundation.gestures.O0 o02, l0.e eVar) {
            super(1);
            this.f32806l = o02;
            this.f32807m = eVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C20268c<Float, C20318t> c20268c) {
            C20268c<Float, C20318t> c20268c2 = c20268c;
            float fFloatValue = c20268c2.f().floatValue();
            l0.e eVar = this.f32807m;
            this.f32806l.a(fFloatValue - eVar.f406839b);
            eVar.f406839b = c20268c2.f().floatValue();
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8(float f12, float f13, float f14, Continuation<? super J8> continuation) {
        super(2, continuation);
        this.f32803s = f12;
        this.f32804t = f13;
        this.f32805u = f14;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        J8 j82 = new J8(this.f32803s, this.f32804t, this.f32805u, continuation);
        j82.f32802r = obj;
        return j82;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.foundation.gestures.O0 o02, Continuation<? super kotlin.G0> continuation) {
        return ((J8) create(o02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32801q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.foundation.gestures.O0 o02 = (androidx.compose.foundation.gestures.O0) this.f32802r;
            l0.e eVar = new l0.e();
            float f12 = this.f32803s;
            eVar.f406839b = f12;
            C20268c c20268cA = C20274e.a(f12);
            Float fBoxFloat = Boxing.boxFloat(this.f32804t);
            androidx.compose.animation.core.G1<Float> g12 = I8.f32768g;
            Float fBoxFloat2 = Boxing.boxFloat(this.f32805u);
            a aVar = new a(o02, eVar);
            this.f32801q = 1;
            if (c20268cA.b(fBoxFloat, g12, fBoxFloat2, aVar, this) == coroutine_suspended) {
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
