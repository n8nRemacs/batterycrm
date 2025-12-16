package androidx.compose.foundation.gestures;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", i = {0}, l = {502, 504}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.gestures.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20461h2 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27740q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27741r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.N0 f27742s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f27743t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20461h2(kotlinx.coroutines.N0 n02, Y41.p<? super kotlinx.coroutines.T, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super C20461h2> continuation) {
        super(2, continuation);
        this.f27742s = n02;
        this.f27743t = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20461h2 c20461h2 = new C20461h2(this.f27742s, this.f27743t, continuation);
        c20461h2.f27741r = obj;
        return c20461h2;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C20461h2) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27740q;
        if (i12 == 0) {
            C42729a0.b(obj);
            t12 = (kotlinx.coroutines.T) this.f27741r;
            if (androidx.compose.foundation.N0.f26805c) {
                this.f27741r = t12;
                this.f27740q = 1;
                if (this.f27742s.A(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            t12 = (kotlinx.coroutines.T) this.f27741r;
            C42729a0.b(obj);
        }
        this.f27741r = null;
        this.f27740q = 2;
        if (this.f27743t.invoke(t12, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }
}
