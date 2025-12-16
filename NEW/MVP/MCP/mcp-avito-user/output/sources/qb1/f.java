package qb1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage$setPushTokenDeliveredToClientApp$2", f = "DataStorePushStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class f extends SuspendLambda implements p<androidx.datastore.preferences.core.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f429321q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f429322r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f429322r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        f fVar = new f(this.f429322r, continuation);
        fVar.f429321q = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(androidx.datastore.preferences.core.a aVar, Continuation<? super G0> continuation) {
        f fVar = new f(this.f429322r, continuation);
        fVar.f429321q = aVar;
        return fVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ((androidx.datastore.preferences.core.a) this.f429321q).d(this.f429322r.f429313c, Boxing.boxBoolean(true));
        return G0.f406611a;
    }
}
