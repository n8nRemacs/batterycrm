package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.C20273d1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", f = "WindowInsetsConnection.android.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class L2 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f28367A;

    /* renamed from: q, reason: collision with root package name */
    public int f28368q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f28369r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I2 f28370s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f28371t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f28372u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C20615r2 f28373v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28374w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28375x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l0.e f28376y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsAnimationController f28377z;

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f28378q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f28379r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ float f28380s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C20615r2 f28381t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f28382u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f28383v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ I2 f28384w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ l0.e f28385x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ WindowInsetsAnimationController f28386y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f28387z;

        /* compiled from: WindowInsetsConnection.android.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "velocity", "Lkotlin/G0;", "invoke", "(FF)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.layout.L2$a$a, reason: collision with other inner class name */
        public static final class C1585a extends kotlin.jvm.internal.N implements Y41.p<Float, Float, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ int f28388l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ int f28389m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ I2 f28390n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ l0.e f28391o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ WindowInsetsAnimationController f28392p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ boolean f28393q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1585a(int i12, int i13, I2 i22, l0.e eVar, WindowInsetsAnimationController windowInsetsAnimationController, boolean z12) {
                super(2);
                this.f28388l = i12;
                this.f28389m = i13;
                this.f28390n = i22;
                this.f28391o = eVar;
                this.f28392p = windowInsetsAnimationController;
                this.f28393q = z12;
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(Float f12, Float f13) {
                float fFloatValue = f12.floatValue();
                float fFloatValue2 = f13.floatValue();
                float f14 = this.f28388l;
                float f15 = this.f28389m;
                I2 i22 = this.f28390n;
                if (fFloatValue > f15 || f14 > fFloatValue) {
                    this.f28391o.f406839b = fFloatValue2;
                    this.f28392p.finish(this.f28393q);
                    i22.f28322f = null;
                    kotlinx.coroutines.N0 n02 = i22.f28326j;
                    if (n02 != null) {
                        ((kotlinx.coroutines.V0) n02).V(new C20643y2());
                    }
                } else {
                    WindowInsetsAnimationController windowInsetsAnimationController = i22.f28322f;
                    if (windowInsetsAnimationController != null) {
                        windowInsetsAnimationController.setInsetsAndAlpha(i22.f28320d.b(windowInsetsAnimationController.getCurrentInsets(), Math.round(fFloatValue)), 1.0f, 0.0f);
                    }
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, int i12, int i13, int i14, WindowInsetsAnimationController windowInsetsAnimationController, C20615r2 c20615r2, I2 i22, Continuation continuation, l0.e eVar, boolean z12) {
            super(2, continuation);
            this.f28379r = i12;
            this.f28380s = f12;
            this.f28381t = c20615r2;
            this.f28382u = i13;
            this.f28383v = i14;
            this.f28384w = i22;
            this.f28385x = eVar;
            this.f28386y = windowInsetsAnimationController;
            this.f28387z = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            WindowInsetsAnimationController windowInsetsAnimationController = this.f28386y;
            boolean z12 = this.f28387z;
            int i12 = this.f28379r;
            return new a(this.f28380s, i12, this.f28382u, this.f28383v, windowInsetsAnimationController, this.f28381t, this.f28384w, continuation, this.f28385x, z12);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f28378q;
            if (i12 == 0) {
                C42729a0.b(obj);
                float f12 = this.f28379r;
                C1585a c1585a = new C1585a(this.f28382u, this.f28383v, this.f28384w, this.f28385x, this.f28386y, this.f28387z);
                this.f28378q = 1;
                if (C20273d1.d(f12, this.f28380s, this.f28381t, c1585a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(float f12, int i12, int i13, int i14, WindowInsetsAnimationController windowInsetsAnimationController, C20615r2 c20615r2, I2 i22, Continuation continuation, l0.e eVar, boolean z12) {
        super(2, continuation);
        this.f28370s = i22;
        this.f28371t = i12;
        this.f28372u = f12;
        this.f28373v = c20615r2;
        this.f28374w = i13;
        this.f28375x = i14;
        this.f28376y = eVar;
        this.f28377z = windowInsetsAnimationController;
        this.f28367A = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.f28377z;
        boolean z12 = this.f28367A;
        I2 i22 = this.f28370s;
        int i12 = this.f28371t;
        L2 l22 = new L2(this.f28372u, i12, this.f28374w, this.f28375x, windowInsetsAnimationController, this.f28373v, i22, continuation, this.f28376y, z12);
        l22.f28369r = obj;
        return l22;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((L2) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f28368q;
        I2 i22 = this.f28370s;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f28369r;
            WindowInsetsAnimationController windowInsetsAnimationController = this.f28377z;
            C20615r2 c20615r2 = this.f28373v;
            l0.e eVar = this.f28376y;
            i22.f28326j = C43259k.d(t12, null, null, new a(this.f28372u, this.f28371t, this.f28374w, this.f28375x, windowInsetsAnimationController, c20615r2, i22, null, eVar, this.f28367A), 3);
            kotlinx.coroutines.N0 n02 = i22.f28326j;
            if (n02 != null) {
                this.f28368q = 1;
                if (((kotlinx.coroutines.V0) n02).A(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        i22.f28326j = null;
        return kotlin.G0.f406611a;
    }
}
