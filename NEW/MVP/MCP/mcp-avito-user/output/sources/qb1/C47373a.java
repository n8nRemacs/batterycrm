package qb1;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage$clear$2", f = "DataStorePushStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: qb1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47373a extends SuspendLambda implements p<androidx.datastore.preferences.core.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f429304q;

    public C47373a() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        C47373a c47373a = new C47373a(2, continuation);
        c47373a.f429304q = obj;
        return c47373a;
    }

    @Override // Y41.p
    public final Object invoke(androidx.datastore.preferences.core.a aVar, Continuation<? super G0> continuation) {
        C47373a c47373a = new C47373a(2, continuation);
        c47373a.f429304q = aVar;
        return c47373a.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.f429304q;
        aVar.c();
        aVar.f45556a.clear();
        return G0.f406611a;
    }
}
