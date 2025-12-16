package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20273d1;
import androidx.compose.animation.core.C20304o;
import androidx.compose.animation.core.C20315s;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.C22082i3;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;

/* compiled from: Scrollable.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/T;", "Landroidx/compose/foundation/gestures/I1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T implements I1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public androidx.compose.animation.core.H<Float> f27467a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.x f27468b;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)F"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {953}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super Float>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.e f27469q;

        /* renamed from: r, reason: collision with root package name */
        public androidx.compose.animation.core.r f27470r;

        /* renamed from: s, reason: collision with root package name */
        public int f27471s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ float f27472t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ T f27473u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ G1 f27474v;

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/o;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.gestures.T$a$a, reason: collision with other inner class name */
        public static final class C1573a extends kotlin.jvm.internal.N implements Y41.l<C20304o<Float, C20318t>, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ l0.e f27475l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ G1 f27476m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ l0.e f27477n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ T f27478o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1573a(l0.e eVar, G1 g12, l0.e eVar2, T t12) {
                super(1);
                this.f27475l = eVar;
                this.f27476m = g12;
                this.f27477n = eVar2;
                this.f27478o = t12;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(C20304o<Float, C20318t> c20304o) {
                C20304o<Float, C20318t> c20304o2 = c20304o;
                float fFloatValue = ((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue();
                l0.e eVar = this.f27475l;
                float f12 = fFloatValue - eVar.f406839b;
                float fA2 = this.f27476m.a(f12);
                eVar.f406839b = ((Number) ((C22082i3) c20304o2.f26389e).getF42167b()).floatValue();
                this.f27477n.f406839b = c20304o2.b().floatValue();
                if (Math.abs(f12 - fA2) > 0.5f) {
                    c20304o2.a();
                }
                this.f27478o.getClass();
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, T t12, G1 g12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27472t = f12;
            this.f27473u = t12;
            this.f27474v = g12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f27472t, this.f27473u, this.f27474v, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super Float> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f12;
            l0.e eVar;
            androidx.compose.animation.core.r rVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27471s;
            if (i12 == 0) {
                C42729a0.b(obj);
                f12 = this.f27472t;
                if (Math.abs(f12) > 1.0f) {
                    eVar = new l0.e();
                    eVar.f406839b = f12;
                    l0.e eVar2 = new l0.e();
                    androidx.compose.animation.core.r rVarA = C20315s.a(0.0f, f12, 28);
                    try {
                        T t12 = this.f27473u;
                        androidx.compose.animation.core.H<Float> h12 = t12.f27467a;
                        C1573a c1573a = new C1573a(eVar2, this.f27474v, eVar, t12);
                        this.f27469q = eVar;
                        this.f27470r = rVarA;
                        this.f27471s = 1;
                        if (C20273d1.e(rVarA, h12, false, c1573a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (CancellationException unused) {
                        rVar = rVarA;
                        eVar.f406839b = ((Number) rVar.a()).floatValue();
                        f12 = eVar.f406839b;
                        return Boxing.boxFloat(f12);
                    }
                    f12 = eVar.f406839b;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar = this.f27470r;
                eVar = this.f27469q;
                try {
                    C42729a0.b(obj);
                } catch (CancellationException unused2) {
                    eVar.f406839b = ((Number) rVar.a()).floatValue();
                    f12 = eVar.f406839b;
                    return Boxing.boxFloat(f12);
                }
                f12 = eVar.f406839b;
            }
            return Boxing.boxFloat(f12);
        }
    }

    public T() {
        throw null;
    }

    public T(androidx.compose.animation.core.H h12, androidx.compose.ui.x xVar, int i12, C42822w c42822w) {
        xVar = (i12 & 2) != 0 ? K1.f27310c : xVar;
        this.f27467a = h12;
        this.f27468b = xVar;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC20432a1
    @Y61.l
    public final Object a(@Y61.k G1 g12, float f12, @Y61.k Continuation<? super Float> continuation) {
        return C43259k.g(this.f27468b, new a(f12, this, g12, null), continuation);
    }
}
