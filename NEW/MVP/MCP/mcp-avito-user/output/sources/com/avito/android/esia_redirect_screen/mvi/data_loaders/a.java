package com.avito.android.esia_redirect_screen.mvi.data_loaders;

import Iz.AbstractC14178c;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: EsiaRedirectContentLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIz/c;", "it", "Lkotlin/G0;", "<anonymous>", "(LIz/c;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.esia_redirect_screen.mvi.data_loaders.EsiaRedirectContentLoader$loadPage$1", f = "EsiaRedirectContentLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<AbstractC14178c, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f148067q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f148068r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f148068r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f148068r, continuation);
        aVar.f148067q = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC14178c abstractC14178c, Continuation<? super G0> continuation) {
        return ((a) create(abstractC14178c, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (((AbstractC14178c) this.f148067q) instanceof AbstractC14178c.e) {
            b.a.a(this.f148068r.f148069a, new AuthenticateLink(AuthSource.f92709j0, false, (DeepLink) null, 6, (C42822w) null), null, null, 6);
        }
        return G0.f406611a;
    }
}
