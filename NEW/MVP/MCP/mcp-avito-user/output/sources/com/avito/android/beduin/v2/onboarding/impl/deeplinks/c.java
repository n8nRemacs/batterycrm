package com.avito.android.beduin.v2.onboarding.impl.deeplinks;

import Ei.AbstractC13488a;
import Y41.l;
import Y41.p;
import android.content.Intent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import rv.C47918a;

/* compiled from: BeduinV2OnboardingBaseDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.beduin.v2.onboarding.impl.deeplinks.BeduinV2OnboardingBaseDeepLinkHandler$subscribe$2", f = "BeduinV2OnboardingBaseDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f104696q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f104697r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l<AbstractC13488a, G0> f104698s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar, l<? super AbstractC13488a, G0> lVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f104697r = dVar;
        this.f104698s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f104697r, this.f104698s, continuation);
        cVar.f104696q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
        return ((c) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        AbstractC13488a cVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C47918a c47918a = (C47918a) this.f104696q;
        this.f104697r.getClass();
        if (c47918a.f437156b == -1) {
            Intent intent = c47918a.f437157c;
            if (intent != null) {
                intent.getExtras();
            }
            cVar = new AbstractC13488a.c(null);
        } else {
            cVar = AbstractC13488a.b.f4206b;
        }
        this.f104698s.invoke(cVar);
        return G0.f406611a;
    }
}
