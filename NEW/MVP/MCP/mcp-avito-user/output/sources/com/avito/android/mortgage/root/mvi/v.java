package com.avito.android.mortgage.root.mvi;

import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MortgageRootBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootBootstrap$handlePolling$1", f = "MortgageRootBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class v extends SuspendLambda implements Y41.p<MortgageRootInternalAction, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f203355q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f203356r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f203357s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, String str, Continuation<? super v> continuation) {
        super(2, continuation);
        this.f203356r = wVar;
        this.f203357s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        v vVar = new v(this.f203356r, this.f203357s, continuation);
        vVar.f203355q = obj;
        return vVar;
    }

    @Override // Y41.p
    public final Object invoke(MortgageRootInternalAction mortgageRootInternalAction, Continuation<? super G0> continuation) {
        return ((v) create(mortgageRootInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f203356r.f203360c.c(this.f203357s, (MortgageRootInternalAction) this.f203355q);
        return G0.f406611a;
    }
}
