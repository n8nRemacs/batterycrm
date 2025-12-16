package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
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
import kotlinx.coroutines.C43259k;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", f = "WindowInsetsConnection.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class M2 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f28411q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I2 f28412r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f28413s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f28414t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f28415u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsAnimationController f28416v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f28417w;

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", f = "WindowInsetsConnection.android.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f28418q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f28419r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f28420s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ float f28421t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ WindowInsetsAnimationController f28422u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f28423v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ I2 f28424w;

        /* compiled from: WindowInsetsConnection.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/c;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.layout.M2$a$a, reason: collision with other inner class name */
        public static final class C1586a extends kotlin.jvm.internal.N implements Y41.l<C20268c<Float, C20318t>, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ I2 f28425l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1586a(I2 i22) {
                super(1);
                this.f28425l = i22;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(C20268c<Float, C20318t> c20268c) {
                float fFloatValue = c20268c.f().floatValue();
                I2 i22 = this.f28425l;
                WindowInsetsAnimationController windowInsetsAnimationController = i22.f28322f;
                if (windowInsetsAnimationController != null) {
                    windowInsetsAnimationController.setInsetsAndAlpha(i22.f28320d.b(windowInsetsAnimationController.getCurrentInsets(), Math.round(fFloatValue)), 1.0f, 0.0f);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, int i12, int i13, WindowInsetsAnimationController windowInsetsAnimationController, I2 i22, Continuation continuation, boolean z12) {
            super(2, continuation);
            this.f28419r = i12;
            this.f28420s = i13;
            this.f28421t = f12;
            this.f28422u = windowInsetsAnimationController;
            this.f28423v = z12;
            this.f28424w = i22;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            WindowInsetsAnimationController windowInsetsAnimationController = this.f28422u;
            boolean z12 = this.f28423v;
            I2 i22 = this.f28424w;
            return new a(this.f28421t, this.f28419r, this.f28420s, windowInsetsAnimationController, i22, continuation, z12);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f28418q;
            I2 i22 = this.f28424w;
            if (i12 == 0) {
                C42729a0.b(obj);
                C20268c c20268cA = C20274e.a(this.f28419r);
                Float fBoxFloat = Boxing.boxFloat(this.f28420s);
                Float fBoxFloat2 = Boxing.boxFloat(this.f28421t);
                C1586a c1586a = new C1586a(i22);
                this.f28418q = 1;
                if (C20268c.c(c20268cA, fBoxFloat, null, fBoxFloat2, c1586a, this, 2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            this.f28422u.finish(this.f28423v);
            i22.f28322f = null;
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(float f12, int i12, int i13, WindowInsetsAnimationController windowInsetsAnimationController, I2 i22, Continuation continuation, boolean z12) {
        super(2, continuation);
        this.f28412r = i22;
        this.f28413s = i12;
        this.f28414t = i13;
        this.f28415u = f12;
        this.f28416v = windowInsetsAnimationController;
        this.f28417w = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.f28416v;
        boolean z12 = this.f28417w;
        I2 i22 = this.f28412r;
        M2 m22 = new M2(this.f28415u, this.f28413s, this.f28414t, windowInsetsAnimationController, i22, continuation, z12);
        m22.f28411q = obj;
        return m22;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((M2) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f28411q;
        WindowInsetsAnimationController windowInsetsAnimationController = this.f28416v;
        I2 i22 = this.f28412r;
        i22.f28326j = C43259k.d(t12, null, null, new a(this.f28415u, this.f28413s, this.f28414t, windowInsetsAnimationController, i22, null, this.f28417w), 3);
        return kotlin.G0.f406611a;
    }
}
