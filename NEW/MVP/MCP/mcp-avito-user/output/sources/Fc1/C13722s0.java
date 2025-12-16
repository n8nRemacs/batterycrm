package Fc1;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.C20318t;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.screenshot.dialogs.take.compose.components.FeedbackTakeDialogFlashBoxKt$FeedbackTakeDialogFlashBox$1", f = "FeedbackTakeDialogFlashBox.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: Fc1.s0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13722s0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f5807q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f5808r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13722s0(C20268c<Float, C20318t> c20268c, Continuation<? super C13722s0> continuation) {
        super(2, continuation);
        this.f5808r = c20268c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C13722s0(this.f5808r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C13722s0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f5807q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Float fBoxFloat = Boxing.boxFloat(0.0f);
            androidx.compose.animation.core.G1 g1E = C20310q.e(300, 0, null, 6);
            this.f5807q = 1;
            if (C20268c.c(this.f5808r, fBoxFloat, g1E, null, null, this, 12) == coroutine_suspended) {
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
