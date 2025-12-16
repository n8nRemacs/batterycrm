package com.avito.android.extended_profile_selection_create.select;

import RA.a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileSelectionCreateView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateView$initInlineFilters$7", f = "ExtendedProfileSelectionCreateView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class y extends SuspendLambda implements Y41.p<Q<? extends DeepLink, ? extends Boolean>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152432q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H f152433r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(H h12, Continuation<? super y> continuation) {
        super(2, continuation);
        this.f152433r = h12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        y yVar = new y(this.f152433r, continuation);
        yVar.f152432q = obj;
        return yVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends DeepLink, ? extends Boolean> q12, Continuation<? super G0> continuation) {
        return ((y) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f152433r.f152005c.invoke(new a.h((DeepLink) ((Q) this.f152432q).f406619b));
        return G0.f406611a;
    }
}
