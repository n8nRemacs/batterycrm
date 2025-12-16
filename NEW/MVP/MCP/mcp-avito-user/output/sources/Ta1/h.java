package ta1;

import B91.C13108a;
import Y41.p;
import com.avito.android.R;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class h extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f439289q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C13108a f439290r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.selfie.ui.camera.i f439291s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C13108a c13108a, ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f439290r = c13108a;
        this.f439291s = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f439290r, this.f439291s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f439289q;
        ru.mts.biometry.sdk.feature.selfie.ui.camera.i iVar = this.f439291s;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f439290r.f1089c.setText(iVar.getString(R.string.sdk_bio_selfie_face_in_frame));
            this.f439289q = 1;
            if (C43131e0.b(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        iVar.f436522i0.a();
        return G0.f406611a;
    }
}
