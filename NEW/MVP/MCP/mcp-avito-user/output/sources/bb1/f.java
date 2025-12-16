package bb1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterStoreDataSource$clear$2", f = "ArbiterStoreDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class f extends SuspendLambda implements Y41.p<androidx.datastore.preferences.core.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f57221q;

    public f() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        f fVar = new f(2, continuation);
        fVar.f57221q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(androidx.datastore.preferences.core.a aVar, Continuation<? super G0> continuation) {
        f fVar = new f(2, continuation);
        fVar.f57221q = aVar;
        return fVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.f57221q;
        aVar.c();
        aVar.f45556a.clear();
        return G0.f406611a;
    }
}
