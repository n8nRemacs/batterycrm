package com.avito.android.mortgage.root.mvi;

import KZ.C14272b;
import KZ.C14273c;
import KZ.C14275e;
import KZ.C14276f;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankAdditionalBlock;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankAdditionalDetails;
import com.avito.android.mortgage.root.list.items.bank.details.model.MortgageRootBankDetails;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import f10.InterfaceC40199a;
import g10.C40513c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageRootActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$process$4", f = "MortgageRootActor.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203283q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203284r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f203285s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40513c f203286t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40199a f203287u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(s sVar, InterfaceC40199a interfaceC40199a, C40513c c40513c, Continuation continuation) {
        super(2, continuation);
        this.f203285s = sVar;
        this.f203286t = c40513c;
        this.f203287u = interfaceC40199a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C40513c c40513c = this.f203286t;
        l lVar = new l(this.f203285s, this.f203287u, c40513c, continuation);
        lVar.f203284r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C14273c appealBankInfo;
        MortgageRootBankAdditionalDetails mortgageRootBankAdditionalDetails;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203283q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203284r;
            C14272b c14272bC = s.c(this.f203285s, this.f203286t.f396248d, ((InterfaceC40199a.x) this.f203287u).f395621a);
            if (c14272bC == null || (appealBankInfo = c14272bC.getAppealBankInfo()) == null) {
                return G0.f406611a;
            }
            C14275e additionalBlock = appealBankInfo.getAdditionalBlock();
            if (additionalBlock != null) {
                String title = additionalBlock.getTitle();
                List<C14276f> listA = additionalBlock.a();
                ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                for (C14276f c14276f : listA) {
                    arrayList.add(new MortgageRootBankAdditionalBlock(c14276f.getIconName(), c14276f.getText()));
                }
                mortgageRootBankAdditionalDetails = new MortgageRootBankAdditionalDetails(title, arrayList);
            } else {
                mortgageRootBankAdditionalDetails = null;
            }
            MortgageRootInternalAction.OpenBankDetails openBankDetails = new MortgageRootInternalAction.OpenBankDetails(new MortgageRootBankDetails(appealBankInfo.getTitle(), appealBankInfo.getIconUrl(), appealBankInfo.getDescription(), mortgageRootBankAdditionalDetails, appealBankInfo.getAction().getTitle()));
            this.f203283q = 1;
            if (interfaceC43172j.emit(openBankDetails, this) == coroutine_suspended) {
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
