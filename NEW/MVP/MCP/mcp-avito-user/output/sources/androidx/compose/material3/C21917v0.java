package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC20307p;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "", "velocity", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;F)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {1796}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21917v0 extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, Float, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f37530q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ float f37531r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ El f37532s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21917v0(El el2, Continuation<? super C21917v0> continuation) {
        super(3, continuation);
        this.f37532s = el2;
    }

    @Override // Y41.q
    public final Object invoke(kotlinx.coroutines.T t12, Float f12, Continuation<? super kotlin.G0> continuation) {
        float fFloatValue = f12.floatValue();
        C21917v0 c21917v0 = new C21917v0(this.f37532s, continuation);
        c21917v0.f37531r = fFloatValue;
        return c21917v0.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37530q;
        if (i12 == 0) {
            C42729a0.b(obj);
            float f12 = this.f37531r;
            El el2 = this.f37532s;
            Fl f37419a = el2.getF37419a();
            androidx.compose.animation.core.H<Float> hB2 = el2.b();
            InterfaceC20307p<Float> interfaceC20307pA = el2.a();
            this.f37530q = 1;
            if (E0.a(f37419a, f12, hB2, interfaceC20307pA, this) == coroutine_suspended) {
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
