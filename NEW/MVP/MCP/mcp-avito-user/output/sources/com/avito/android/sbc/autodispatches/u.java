package com.avito.android.sbc.autodispatches;

import Po0.InterfaceC14819c;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut;
import dp0.C39777a;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;

/* compiled from: SbcAutoDispatchesInteractor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/utils/c;", "", "Ldp0/a;", "active", "inactive", "LPo0/c;", "<anonymous>", "(Lcom/avito/android/arch/mvi/utils/c;Lcom/avito/android/arch/mvi/utils/c;)LPo0/c;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.autodispatches.SbcAutoDispatchesInteractorImpl$reloadDispatches$1", f = "SbcAutoDispatchesInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class u extends SuspendLambda implements Y41.q<com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends C39777a>, com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends C39777a>, Continuation<? super InterfaceC14819c>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.c f258959q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.c f258960r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f258961s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N f258962t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N f258963u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(v vVar, Y41.p<? super List<AutoDispatchOut>, ? super List<AutoDispatchOut>, ? extends InterfaceC14819c> pVar, Y41.a<? extends InterfaceC14819c> aVar, Continuation<? super u> continuation) {
        super(3, continuation);
        this.f258961s = vVar;
        this.f258962t = (N) pVar;
        this.f258963u = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.q
    public final Object invoke(com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends C39777a> cVar, com.avito.android.arch.mvi.utils.c<? extends Throwable, ? extends C39777a> cVar2, Continuation<? super InterfaceC14819c> continuation) {
        ?? r12 = this.f258963u;
        ?? r22 = this.f258962t;
        u uVar = new u(this.f258961s, r22, r12, continuation);
        uVar.f258959q = cVar;
        uVar.f258960r = cVar2;
        return uVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        com.avito.android.arch.mvi.utils.c cVar = this.f258959q;
        com.avito.android.arch.mvi.utils.c cVar2 = this.f258960r;
        if (!(cVar instanceof c.C2712c) || !(cVar2 instanceof c.C2712c)) {
            return (InterfaceC14819c) this.f258963u.invoke();
        }
        List<AutoDispatchOut> listA = ((C39777a) ((c.C2712c) cVar).f92028b).a();
        if (listA == null) {
            listA = C42784z0.f406748b;
        }
        List<AutoDispatchOut> listA2 = ((C39777a) ((c.C2712c) cVar2).f92028b).a();
        if (listA2 == null) {
            listA2 = C42784z0.f406748b;
        }
        InterfaceC34468d interfaceC34468d = this.f258961s.f258964a;
        boolean z12 = true;
        C34466b c34466b = new C34466b(listA, listA.isEmpty() || ((long) listA.size()) < 50);
        if (!listA2.isEmpty() && listA2.size() >= 50) {
            z12 = false;
        }
        interfaceC34468d.c(c34466b, new C34466b(listA2, z12));
        return (InterfaceC14819c) this.f258962t.invoke(listA, listA2);
    }
}
