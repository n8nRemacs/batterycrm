package ha1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class e extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f397231q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.recognition.ui.camera.i f397232r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f397232r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.f397232r, continuation);
        eVar.f397231q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        T t12 = (T) this.f397231q;
        ru.mts.biometry.sdk.feature.recognition.ui.camera.i iVar = this.f397232r;
        C43259k.d(t12, null, null, new C40905c(iVar, null), 3);
        iVar.e5().f1521i.a(iVar.getViewLifecycleOwner(), new L91.e(new C40906d(iVar), 13));
        return G0.f406611a;
    }
}
