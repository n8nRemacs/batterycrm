package bb1;

import androidx.datastore.preferences.core.f;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterStoreDataSource$saveMasterHost$2", f = "ArbiterStoreDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class j extends SuspendLambda implements Y41.p<androidx.datastore.preferences.core.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f57236q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f57237r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ T11.a f57238s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, T11.a aVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f57237r = iVar;
        this.f57238s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        j jVar = new j(this.f57237r, this.f57238s, continuation);
        jVar.f57236q = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(androidx.datastore.preferences.core.a aVar, Continuation<? super G0> continuation) {
        return ((j) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.f57236q;
        i iVar = this.f57237r;
        f.a<String> aVar2 = iVar.f57233b;
        T11.a aVar3 = this.f57238s;
        aVar.d(aVar2, aVar3.f15306a);
        aVar.d(iVar.f57234c, aVar3.f15307b);
        return G0.f406611a;
    }
}
