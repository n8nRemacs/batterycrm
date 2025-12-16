package androidx.compose.material;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1$1", f = "BottomSheetScaffold.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21294p1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f33876q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J1 f33877r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21294p1(J1 j12, Continuation<? super C21294p1> continuation) {
        super(2, continuation);
        this.f33877r = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C21294p1(this.f33877r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21294p1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f33876q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f33876q = 1;
            J1 j12 = this.f33877r;
            InterfaceC21153e3<BottomSheetValue> interfaceC21153e3E = j12.f32790a.e();
            BottomSheetValue bottomSheetValue = BottomSheetValue.f32455c;
            if (!interfaceC21153e3E.d(bottomSheetValue)) {
                bottomSheetValue = BottomSheetValue.f32454b;
            }
            Object objE = C21385w.e(j12.f32790a, bottomSheetValue, this);
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
