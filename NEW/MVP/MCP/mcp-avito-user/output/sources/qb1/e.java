package qb1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage$savePushToken$2", f = "DataStorePushStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class e extends SuspendLambda implements p<androidx.datastore.preferences.core.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f429318q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f429319r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f429320s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, String str, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f429319r = dVar;
        this.f429320s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        e eVar = new e(this.f429319r, this.f429320s, continuation);
        eVar.f429318q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(androidx.datastore.preferences.core.a aVar, Continuation<? super G0> continuation) {
        return ((e) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        ((androidx.datastore.preferences.core.a) this.f429318q).d(this.f429319r.f429312b, this.f429320s);
        return G0.f406611a;
    }
}
