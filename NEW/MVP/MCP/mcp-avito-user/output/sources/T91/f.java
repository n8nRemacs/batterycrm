package T91;

import B91.H;
import android.widget.TextView;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class f extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f15451q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H f15452r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.documentResult.ui.h f15453s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation, H h12, ru.mts.biometry.sdk.feature.documentResult.ui.h hVar) {
        super(2, continuation);
        this.f15452r = h12;
        this.f15453s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(continuation, this.f15452r, this.f15453s);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f15451q;
        if (i12 == 0) {
            C42729a0.b(obj);
            H h12 = this.f15452r;
            TextView textView = h12.f1053k;
            ru.mts.biometry.sdk.feature.documentResult.ui.h hVar = this.f15453s;
            Ca1.d.a(new e(hVar, i), textView);
            C15343a c15343a = ru.mts.biometry.sdk.feature.documentResult.ui.h.f436451k0;
            boolean zBooleanValue = ((Boolean) hVar.f436455j0.getValue()).booleanValue();
            h12.f1052j.setVisibility(zBooleanValue ? 0 : 8);
            h12.f1053k.setVisibility(zBooleanValue ? 0 : 8);
            Lifecycle.State state = Lifecycle.State.f46682e;
            d dVar = new d(null, h12, hVar);
            this.f15451q = 1;
            if (C23056p0.b(hVar, state, dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
