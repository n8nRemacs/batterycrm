package com.avito.android.referral_program.deeplinks;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Intent;
import com.avito.android.referral_program.g;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import rv.C47918a;

/* compiled from: ReferralPageBaseDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lrv/a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.referral_program.deeplinks.ReferralPageBaseDeepLinkHandler$subscribe$2", f = "ReferralPageBaseDeepLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<C47918a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f252644q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f252645r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l<com.avito.android.referral_program.g, G0> f252646s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(d dVar, l<? super com.avito.android.referral_program.g, G0> lVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f252645r = dVar;
        this.f252646s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f252645r, this.f252646s, continuation);
        cVar.f252644q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(C47918a c47918a, Continuation<? super G0> continuation) {
        return ((c) create(c47918a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        com.avito.android.referral_program.g cVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C47918a c47918a = (C47918a) this.f252644q;
        this.f252645r.getClass();
        if (c47918a.f437156b == -1) {
            Intent intent = c47918a.f437157c;
            if (intent != null) {
                intent.getExtras();
            }
            cVar = new g.c(null);
        } else {
            cVar = g.b.f252670b;
        }
        this.f252646s.invoke(cVar);
        return G0.f406611a;
    }
}
