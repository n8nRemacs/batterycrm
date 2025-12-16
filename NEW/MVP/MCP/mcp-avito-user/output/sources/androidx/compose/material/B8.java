package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", i = {}, l = {235}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class B8 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32395q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C21210i8 f32396r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f32397s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f32398t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f32399u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f32400v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8(C21210i8 c21210i8, float f12, float f13, float f14, Y41.a<kotlin.G0> aVar, Continuation<? super B8> continuation) {
        super(2, continuation);
        this.f32396r = c21210i8;
        this.f32397s = f12;
        this.f32398t = f13;
        this.f32399u = f14;
        this.f32400v = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new B8(this.f32396r, this.f32397s, this.f32398t, this.f32399u, this.f32400v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((B8) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32395q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f32395q = 1;
            float f12 = I8.f32762a;
            J8 j82 = new J8(this.f32397s, this.f32398t, this.f32399u, null);
            Object objA = this.f32396r.a(MutatePriority.f26797b, j82, this);
            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objA = kotlin.G0.f406611a;
            }
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        Y41.a<kotlin.G0> aVar = this.f32400v;
        if (aVar != null) {
            aVar.invoke();
        }
        return kotlin.G0.f406611a;
    }
}
