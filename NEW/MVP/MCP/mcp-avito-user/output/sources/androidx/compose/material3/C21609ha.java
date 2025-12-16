package androidx.compose.material3;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$4$1", f = "ModalBottomSheet.android.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21609ha extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f36494q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Me f36495r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21609ha(Me me2, Continuation<? super C21609ha> continuation) {
        super(2, continuation);
        this.f36495r = me2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C21609ha(this.f36495r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21609ha) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f36494q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f36494q = 1;
            Me me2 = this.f36495r;
            N6<SheetValue> n6E = me2.f35135c.e();
            SheetValue sheetValue = SheetValue.f35419d;
            if (!n6E.d(sheetValue)) {
                sheetValue = SheetValue.f35418c;
            }
            Object objA = Me.a(me2, sheetValue, this);
            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objA = kotlin.G0.f406611a;
            }
            if (objA == coroutine_suspended) {
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
