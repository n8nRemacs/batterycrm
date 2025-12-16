package com.avito.android.onboarding;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxOnboardingChainController.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0004\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "T", "value", "<anonymous parameter 1>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.onboarding.BxOnboardingChainControllerImpl$awaitIterator$1", f = "BxOnboardingChainController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.onboarding.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32921e extends SuspendLambda implements Y41.q<Object, Object, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f209067q;

    public C32921e() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Continuation<Object> continuation) {
        C32921e c32921e = new C32921e(3, continuation);
        c32921e.f209067q = obj;
        return c32921e.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f209067q;
    }
}
