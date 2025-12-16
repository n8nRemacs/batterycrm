package androidx.compose.material;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1", f = "BackdropScaffold.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21318r0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34020q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ L0 f34021r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21318r0(L0 l02, Continuation<? super C21318r0> continuation) {
        super(2, continuation);
        this.f34021r = l02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C21318r0(this.f34021r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21318r0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34020q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f34020q = 1;
            L0 l02 = this.f34021r;
            Object objE = C21385w.e(l02.f32846b, BackdropValue.f32405b, this);
            if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objE = kotlin.G0.f406611a;
            }
            if (objE == coroutine_suspended) {
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
