package com.avito.android.mortgage.root.mvi;

import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import g10.C40513c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MortgageRootActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$handlePolling$1", f = "MortgageRootActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.root.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32686d extends SuspendLambda implements Y41.p<MortgageRootInternalAction, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f202958q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f202959r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40513c f202960s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32686d(s sVar, C40513c c40513c, Continuation<? super C32686d> continuation) {
        super(2, continuation);
        this.f202959r = sVar;
        this.f202960s = c40513c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32686d c32686d = new C32686d(this.f202959r, this.f202960s, continuation);
        c32686d.f202958q = obj;
        return c32686d;
    }

    @Override // Y41.p
    public final Object invoke(MortgageRootInternalAction mortgageRootInternalAction, Continuation<? super G0> continuation) {
        return ((C32686d) create(mortgageRootInternalAction, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f202959r.f203331c.c(this.f202960s.f396246b, (MortgageRootInternalAction) this.f202958q);
        return G0.f406611a;
    }
}
