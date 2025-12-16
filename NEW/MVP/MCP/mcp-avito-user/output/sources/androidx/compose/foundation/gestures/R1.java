package androidx.compose.foundation.gestures;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l0.g;

/* compiled from: Scrollable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", i = {}, l = {518}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class R1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27448q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O1 f27449r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f27450s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f27451t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(O1 o12, float f12, float f13, Continuation<? super R1> continuation) {
        super(2, continuation);
        this.f27449r = o12;
        this.f27450s = f12;
        this.f27451t = f13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new R1(this.f27449r, this.f27450s, this.f27451t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((R1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27448q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C20433a2 c20433a2 = this.f27449r.f27395E;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(this.f27450s) << 32) | (Float.floatToRawIntBits(this.f27451t) & 4294967295L);
            g.a aVar = l0.g.f413384b;
            this.f27448q = 1;
            if (K1.a(c20433a2, jFloatToRawIntBits, this) == coroutine_suspended) {
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
