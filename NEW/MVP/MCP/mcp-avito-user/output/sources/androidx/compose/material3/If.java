package androidx.compose.material3;

import androidx.compose.material3.Wf;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;F)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SliderKt$SliderImpl$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class If extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, Float, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Wf f34887q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public If(Wf wf2, Continuation<? super If> continuation) {
        super(3, continuation);
        this.f34887q = wf2;
    }

    @Override // Y41.q
    public final Object invoke(kotlinx.coroutines.T t12, Float f12, Continuation<? super kotlin.G0> continuation) {
        f12.floatValue();
        return new If(this.f34887q, continuation).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ((Wf.c) this.f34887q.f35779k).invoke();
        return kotlin.G0.f406611a;
    }
}
