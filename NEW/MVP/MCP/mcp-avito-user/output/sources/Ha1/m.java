package ha1;

import B91.z;
import android.graphics.Rect;
import androidx.view.AbstractC22991Y;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class m extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.p f397246q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar, Continuation continuation) {
        super(2, continuation);
        this.f397246q = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f397246q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC22991Y<Rect> frameRect;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        int i12 = ru.mts.biometry.sdk.feature.recognition.ui.camera.p.f436498o0;
        ru.mts.biometry.sdk.feature.recognition.ui.camera.p pVar = this.f397246q;
        z zVar = (z) pVar.f436376g0;
        if (zVar != null && (frameRect = zVar.f1203f.getFrameRect()) != null) {
            frameRect.observe(pVar.getViewLifecycleOwner(), new L91.e(new l(pVar), 14));
        }
        return G0.f406611a;
    }
}
