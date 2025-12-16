package com.avito.android.mortgage.root.mvi;

import KZ.C14285o;
import KZ.C14288s;
import KZ.InterfaceC14286p;
import com.avito.android.mortgage.api.model.items.application.ImmutableInfoDescription;
import com.avito.android.mortgage.root.list.items.immutable_info.description.model.ImmutableInfoDescriptionArguments;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import f10.InterfaceC40199a;
import g10.C40513c;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageRootActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$process$2", f = "MortgageRootActor.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203274q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203275r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40513c f203276s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40199a f203277t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C40513c c40513c, InterfaceC40199a interfaceC40199a, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f203276s = c40513c;
        this.f203277t = interfaceC40199a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f203276s, this.f203277t, continuation);
        jVar.f203275r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String currentMortgageStage;
        Object next;
        JZ.a analytics;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203274q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203275r;
            C40513c c40513c = this.f203276s;
            Iterator<T> it = c40513c.f396248d.iterator();
            while (true) {
                currentMortgageStage = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                InterfaceC14286p interfaceC14286p = ((C14285o) next).f9530b;
                C14288s c14288s = interfaceC14286p instanceof C14288s ? (C14288s) interfaceC14286p : null;
                if (L.f(c14288s != null ? c14288s.getId() : null, ((InterfaceC40199a.y) this.f203277t).f395622a)) {
                    break;
                }
            }
            C14285o c14285o = (C14285o) next;
            InterfaceC14286p interfaceC14286p2 = c14285o != null ? c14285o.f9530b : null;
            C14288s c14288s2 = interfaceC14286p2 instanceof C14288s ? (C14288s) interfaceC14286p2 : null;
            if (c14288s2 != null) {
                ImmutableInfoDescription description = c14288s2.getDescription();
                JZ.d dVar = c40513c.f396249e;
                if (dVar != null && (analytics = dVar.getAnalytics()) != null) {
                    currentMortgageStage = analytics.getCurrentMortgageStage();
                }
                if (currentMortgageStage == null) {
                    currentMortgageStage = "";
                }
                MortgageRootInternalAction.OpenImmutableDataDescription openImmutableDataDescription = new MortgageRootInternalAction.OpenImmutableDataDescription(new ImmutableInfoDescriptionArguments(description, c40513c.f396246b, currentMortgageStage), c14288s2.getApplicantType());
                this.f203274q = 1;
                if (interfaceC43172j.emit(openImmutableDataDescription, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
