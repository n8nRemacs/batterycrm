package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C20456g1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: MouseWheelScrollable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/compose/foundation/gestures/g1$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/compose/foundation/gestures/g1$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2", f = "MouseWheelScrollable.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.gestures.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20480m1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super C20456g1.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27870q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20456g1 f27871r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20480m1(C20456g1 c20456g1, Continuation<? super C20480m1> continuation) {
        super(2, continuation);
        this.f27871r = c20456g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C20480m1(this.f27871r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super C20456g1.a> continuation) {
        return ((C20480m1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27870q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C43108m c43108m = this.f27871r.f27717e;
            this.f27870q = 1;
            obj = kotlinx.coroutines.U.c(new C20464i1(c43108m, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
