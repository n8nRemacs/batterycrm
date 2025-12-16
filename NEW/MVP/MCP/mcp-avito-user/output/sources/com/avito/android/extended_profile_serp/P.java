package com.avito.android.extended_profile_serp;

import bB.InterfaceC25487a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileSerpView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpView$initInlineFilters$7", f = "ExtendedProfileSerpView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class P extends SuspendLambda implements Y41.p<kotlin.Q<? extends DeepLink, ? extends Boolean>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152567q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f152568r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(F f12, Continuation<? super P> continuation) {
        super(2, continuation);
        this.f152568r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        P p12 = new P(this.f152568r, continuation);
        p12.f152567q = obj;
        return p12;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends DeepLink, ? extends Boolean> q12, Continuation<? super G0> continuation) {
        return ((P) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f152568r.f152526c.invoke(new InterfaceC25487a.i((DeepLink) ((kotlin.Q) this.f152567q).f406619b));
        return G0.f406611a;
    }
}
