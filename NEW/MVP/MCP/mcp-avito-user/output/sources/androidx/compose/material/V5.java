package androidx.compose.material;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {425}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class V5 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f33277q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C21234k6 f33278r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(C21234k6 c21234k6, Continuation<? super V5> continuation) {
        super(2, continuation);
        this.f33278r = c21234k6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new V5(this.f33278r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((V5) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f33277q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f33277q = 1;
            C21234k6 c21234k6 = this.f33278r;
            InterfaceC21153e3<ModalBottomSheetValue> interfaceC21153e3E = c21234k6.f33739c.e();
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f32955d;
            if (!interfaceC21153e3E.d(modalBottomSheetValue) || (objA = C21234k6.a(c21234k6, modalBottomSheetValue, this)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
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
