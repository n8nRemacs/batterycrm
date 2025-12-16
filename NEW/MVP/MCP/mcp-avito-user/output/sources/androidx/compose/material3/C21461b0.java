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
@DebugMetadata(c = "androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {594}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21461b0 extends SuspendLambda implements Y41.q<kotlinx.coroutines.T, Float, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f36066q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ float f36067r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21691l1 f36068s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21461b0(InterfaceC21691l1 interfaceC21691l1, Continuation<? super C21461b0> continuation) {
        super(3, continuation);
        this.f36068s = interfaceC21691l1;
    }

    @Override // Y41.q
    public final Object invoke(kotlinx.coroutines.T t12, Float f12, Continuation<? super kotlin.G0> continuation) {
        float fFloatValue = f12.floatValue();
        C21461b0 c21461b0 = new C21461b0(this.f36068s, continuation);
        c21461b0.f36067r = fFloatValue;
        return c21461b0.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f36066q;
        if (i12 == 0) {
            C42729a0.b(obj);
            float f12 = this.f36067r;
            InterfaceC21691l1 interfaceC21691l1 = this.f36068s;
            InterfaceC21714m1 f36018a = interfaceC21691l1.getF36018a();
            androidx.compose.animation.core.H<Float> hB2 = interfaceC21691l1.b();
            InterfaceC20307p<Float> interfaceC20307pA = interfaceC21691l1.a();
            this.f36066q = 1;
            if (E0.b(f36018a, f12, hB2, interfaceC20307pA, this) == coroutine_suspended) {
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
