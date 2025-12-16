package Fc1;

import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.screenshot.dialogs.take.compose.components.FeedbackTakeDialogFlashBoxKt$FeedbackTakeDialogFlashBox$3$1", f = "FeedbackTakeDialogFlashBox.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: Fc1.u0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13740u0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C13600e3 f5843q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13740u0(C13600e3 c13600e3, Continuation continuation) {
        super(2, continuation);
        this.f5843q = c13600e3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C13740u0(this.f5843q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C13740u0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f5843q.invoke();
        return kotlin.G0.f406611a;
    }
}
