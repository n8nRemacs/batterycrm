package X91;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.mts.biometry.sdk.IdentificationCancelReason;

/* loaded from: classes9.dex */
public final class p extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f18748q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.main.ui.r f18749r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ru.mts.biometry.sdk.feature.main.ui.r rVar, Continuation continuation) {
        super(2, continuation);
        this.f18749r = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f18749r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f18748q;
        ru.mts.biometry.sdk.feature.main.ui.r rVar = this.f18749r;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlin.reflect.n nVar = ru.mts.biometry.sdk.feature.main.ui.r.f436480i0[0];
            s sVar = (s) rVar.f436481h0.a(rVar);
            Context contextRequireContext = rVar.requireContext();
            this.f18748q = 1;
            obj = sVar.ke(contextRequireContext, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        IdentificationCancelReason identificationCancelReason = (IdentificationCancelReason) obj;
        if (identificationCancelReason == null) {
            return G0.f406611a;
        }
        Intent intent = new Intent();
        intent.putExtra("data", identificationCancelReason);
        ActivityC22955m activityC22955mL1 = rVar.l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.setResult(12, intent);
        }
        ActivityC22955m activityC22955mL12 = rVar.l1();
        if (activityC22955mL12 != null) {
            activityC22955mL12.finish();
        }
        return G0.f406611a;
    }
}
