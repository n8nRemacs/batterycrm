package L91;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class f extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.document.camera.ui.n f9822q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ru.mts.biometry.sdk.feature.document.camera.ui.n nVar, Continuation continuation) {
        super(2, continuation);
        this.f9822q = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f9822q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.reflect.n[] nVarArr = ru.mts.biometry.sdk.feature.document.camera.ui.n.f436424m0;
        ru.mts.biometry.sdk.feature.document.camera.ui.n nVar = this.f9822q;
        ((Ba1.o) nVar.f436427j0.getValue()).f1521i.observe(nVar.getViewLifecycleOwner(), new e(new d(nVar), 0));
        return G0.f406611a;
    }
}
