package com.avito.android.mortgage.root.mvi;

import KZ.C14272b;
import KZ.C14279i;
import KZ.C14282l;
import KZ.C14285o;
import KZ.InterfaceC14286p;
import Y00.InterfaceC18246g;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import f10.InterfaceC40199a;
import g10.C40513c;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageRootActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$process$5", f = "MortgageRootActor.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203288q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203289r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f203290s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40513c f203291t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40199a f203292u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, InterfaceC40199a interfaceC40199a, C40513c c40513c, Continuation continuation) {
        super(2, continuation);
        this.f203290s = sVar;
        this.f203291t = c40513c;
        this.f203292u = interfaceC40199a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C40513c c40513c = this.f203291t;
        m mVar = new m(this.f203290s, this.f203292u, c40513c, continuation);
        mVar.f203289r = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String currentApplicantType;
        Object next;
        Object next2;
        C14272b c14272b;
        JZ.a analytics;
        JZ.a analytics2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203288q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203289r;
            C40513c c40513c = this.f203291t;
            List<C14285o> list = c40513c.f396248d;
            s sVar = this.f203290s;
            sVar.getClass();
            Iterator<T> it = list.iterator();
            while (true) {
                currentApplicantType = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C14285o) next).f9530b instanceof C14282l) {
                    break;
                }
            }
            C14285o c14285o = (C14285o) next;
            InterfaceC14286p interfaceC14286p = c14285o != null ? c14285o.f9530b : null;
            if (!(interfaceC14286p instanceof C14282l)) {
                interfaceC14286p = null;
            }
            C14282l c14282l = (C14282l) interfaceC14286p;
            if (c14282l == null) {
                c14272b = null;
            } else {
                Iterator<T> it2 = c14282l.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    C14279i selectBankButton = ((C14272b) next2).getSelectBankButton();
                    if (selectBankButton != null && selectBankButton.getIsSelected()) {
                        break;
                    }
                }
                c14272b = (C14272b) next2;
            }
            String id2 = c14272b != null ? c14272b.getId() : null;
            InterfaceC40199a.M m12 = (InterfaceC40199a.M) this.f203292u;
            C14272b c14272bC = s.c(sVar, c40513c.f396248d, m12.f395590a);
            if (c14272bC == null) {
                return G0.f406611a;
            }
            C14279i selectBankButton2 = c14272bC.getSelectBankButton();
            if (selectBankButton2 == null) {
                return G0.f406611a;
            }
            boolean isSelected = selectBankButton2.getIsSelected();
            JZ.d dVar = c40513c.f396249e;
            String currentMortgageStage = (dVar == null || (analytics2 = dVar.getAnalytics()) == null) ? null : analytics2.getCurrentMortgageStage();
            if (currentMortgageStage == null) {
                currentMortgageStage = "";
            }
            if (dVar != null && (analytics = dVar.getAnalytics()) != null) {
                currentApplicantType = analytics.getCurrentApplicantType();
            }
            String str = currentApplicantType != null ? currentApplicantType : "";
            InterfaceC18246g interfaceC18246g = sVar.f203340l;
            String str2 = c40513c.f396246b;
            interfaceC18246g.a(str2, currentMortgageStage, str, c14272bC);
            InterfaceC43160i interfaceC43160iA = sVar.f203336h.a(m12.f395590a, id2, str2, !isSelected);
            this.f203288q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
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
