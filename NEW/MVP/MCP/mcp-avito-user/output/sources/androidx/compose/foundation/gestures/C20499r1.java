package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MouseWheelScrollable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", f = "MouseWheelScrollable.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.gestures.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20499r1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27958q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20433a2 f27959r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<InterfaceC20506t1, Continuation<? super kotlin.G0>, Object> f27960s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20499r1(Y41.p pVar, C20433a2 c20433a2, Continuation continuation) {
        super(2, continuation);
        this.f27959r = c20433a2;
        this.f27960s = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C20499r1(this.f27960s, this.f27959r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C20499r1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27958q;
        if (i12 == 0) {
            C42729a0.b(obj);
            MutatePriority mutatePriority = MutatePriority.f26798c;
            this.f27958q = 1;
            if (this.f27959r.f(mutatePriority, this.f27960s, this) == coroutine_suspended) {
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
