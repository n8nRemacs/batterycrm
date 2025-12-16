package androidx.compose.material;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class I2 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32753q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N4 f32754r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L2 f32755s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(N4 n42, L2 l22, Continuation<? super I2> continuation) {
        super(2, continuation);
        this.f32754r = n42;
        this.f32755s = l22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new I2(this.f32754r, this.f32755s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((I2) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32753q;
        if (i12 == 0) {
            C42729a0.b(obj);
            L2 l22 = this.f32755s;
            float f12 = l22.f32851a;
            this.f32753q = 1;
            N4 n42 = this.f32754r;
            n42.f32974a = f12;
            n42.f32975b = l22.f32852b;
            n42.f32976c = l22.f32853c;
            n42.f32977d = l22.f32854d;
            Object objB = n42.b(this);
            if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objB = kotlin.G0.f406611a;
            }
            if (objB == coroutine_suspended) {
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
