package androidx.compose.material3;

import androidx.compose.runtime.C22040c3;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {289}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class J1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34902q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Me f34903r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(Me me2, Continuation<? super J1> continuation) {
        super(2, continuation);
        this.f34903r = me2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new J1(this.f34903r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((J1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34902q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f34902q = 1;
            SheetValue sheetValue = SheetValue.f35418c;
            C21916v<SheetValue> c21916v = this.f34903r.f35135c;
            Object objC = C21894u.c(c21916v, sheetValue, ((C22040c3) c21916v.f37500l).f(), this);
            if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objC = kotlin.G0.f406611a;
            }
            if (objC == coroutine_suspended) {
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
