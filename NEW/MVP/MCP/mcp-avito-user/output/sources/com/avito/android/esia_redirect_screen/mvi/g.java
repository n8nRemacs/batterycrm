package com.avito.android.esia_redirect_screen.mvi;

import Iz.AbstractC14178c;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: EsiaRedirectBootstrap.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkv/a;", "it", "Lkotlinx/coroutines/flow/i;", "LIz/c;", "<anonymous>", "(Lkv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.esia_redirect_screen.mvi.EsiaRedirectBootstrap$observeDeeplinkResult$1", f = "EsiaRedirectBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class g extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC43160i<? extends AbstractC14178c>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f148077q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f148078r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f148078r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f148078r, continuation);
        gVar.f148077q = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC43160i<? extends AbstractC14178c>> continuation) {
        return ((g) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return ((C43501a) this.f148077q).f413261b instanceof AuthenticateLink.b.C4024b ? this.f148078r.f148079a.a() : C43175k.w();
    }
}
