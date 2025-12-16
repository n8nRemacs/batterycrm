package com.avito.android.comfortable_deal.deal.mvi;

import Ep.InterfaceC13517a;
import Gp.C13905a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.comfortable_deal.api.model.CurrentStage;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import com.avito.android.comfortable_deal.end_deal.model.EndDealResult;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResult;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wp.InterfaceC49662a;

/* compiled from: DealActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LEp/a;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "LEp/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.comfortable_deal.deal.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29453a implements com.avito.android.arch.mvi.a<InterfaceC13517a, DealInternalAction, Ep.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.deal.player.l f121580a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.repository.a f121581b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C13905a f121582c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f121583d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49662a f121584e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.deal.interactor.a f121585f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f121586g;

    /* compiled from: DealActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.deal.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3595a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121587a;

        static {
            int[] iArr = new int[CurrentStage.values().length];
            try {
                iArr[CurrentStage.Published.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CurrentStage.Deposit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f121587a = iArr;
        }
    }

    @Inject
    public C29453a(@Y61.k com.avito.android.comfortable_deal.deal.player.l lVar, @Y61.k com.avito.android.comfortable_deal.repository.a aVar, @Y61.k C13905a c13905a, @Y61.k R0 r02, @Y61.k InterfaceC49662a interfaceC49662a, @Y61.k com.avito.android.comfortable_deal.deal.interactor.a aVar2) {
        this.f121580a = lVar;
        this.f121581b = aVar;
        this.f121582c = c13905a;
        this.f121583d = r02;
        this.f121584e = interfaceC49662a;
        this.f121585f = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.comfortable_deal.deal.mvi.C29453a r8, kotlinx.coroutines.flow.InterfaceC43172j r9, java.lang.String r10, com.avito.android.comfortable_deal.repository.model.CommentsFilter r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r8.getClass()
            boolean r0 = r12 instanceof com.avito.android.comfortable_deal.deal.mvi.t
            if (r0 == 0) goto L16
            r0 = r12
            com.avito.android.comfortable_deal.deal.mvi.t r0 = (com.avito.android.comfortable_deal.deal.mvi.t) r0
            int r1 = r0.f121722w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f121722w = r1
            goto L1b
        L16:
            com.avito.android.comfortable_deal.deal.mvi.t r0 = new com.avito.android.comfortable_deal.deal.mvi.t
            r0.<init>(r8, r12)
        L1b:
            java.lang.Object r12 = r0.f121720u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f121722w
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L56
            if (r2 == r6) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            goto L3b
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.C42729a0.b(r12)
            goto Lc4
        L40:
            java.lang.Object r8 = r0.f121716q
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            kotlin.C42729a0.b(r12)
            goto L80
        L48:
            com.avito.android.comfortable_deal.repository.model.CommentsFilter r11 = r0.f121719t
            java.lang.String r10 = r0.f121718s
            kotlinx.coroutines.flow.j r9 = r0.f121717r
            java.lang.Object r8 = r0.f121716q
            com.avito.android.comfortable_deal.deal.mvi.a r8 = (com.avito.android.comfortable_deal.deal.mvi.C29453a) r8
            kotlin.C42729a0.b(r12)
            goto L6c
        L56:
            kotlin.C42729a0.b(r12)
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$LoadingCommentsStarted r12 = com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction.LoadingCommentsStarted.f121607b
            r0.f121716q = r8
            r0.f121717r = r9
            r0.f121718s = r10
            r0.f121719t = r11
            r0.f121722w = r6
            java.lang.Object r12 = r9.emit(r12, r0)
            if (r12 != r1) goto L6c
            goto Lc6
        L6c:
            com.avito.android.comfortable_deal.repository.a r8 = r8.f121581b
            r0.f121716q = r9
            r0.f121717r = r7
            r0.f121718s = r7
            r0.f121719t = r7
            r0.f121722w = r5
            java.lang.Object r12 = r8.t(r10, r11, r0)
            if (r12 != r1) goto L7f
            goto Lc6
        L7f:
            r8 = r9
        L80:
            com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
            boolean r9 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r9 == 0) goto L9e
            com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
            java.lang.Object r9 = r12.getResult()
            java.util.List r9 = (java.util.List) r9
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$LoadingCommentsSuccess r10 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$LoadingCommentsSuccess
            r10.<init>(r9)
            r0.f121716q = r7
            r0.f121722w = r4
            java.lang.Object r8 = r8.emit(r10, r0)
            if (r8 != r1) goto Lc4
            goto Lc6
        L9e:
            boolean r9 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r9 == 0) goto Lc7
            com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
            com.avito.android.remote.error.ApiError r9 = r12.getError()
            java.lang.Throwable r10 = r12.getCause()
            com.avito.android.util.ApiException r9 = com.avito.android.util.C35936s.a(r9, r10)
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$LoadingCommentsError r10 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$LoadingCommentsError
            com.avito.android.remote.error.ApiError r9 = com.avito.android.error.z.n(r9)
            r10.<init>(r9)
            r0.f121716q = r7
            r0.f121722w = r3
            java.lang.Object r8 = r8.emit(r10, r0)
            if (r8 != r1) goto Lc4
            goto Lc6
        Lc4:
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lc6:
            return r1
        Lc7:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.mvi.C29453a.c(com.avito.android.comfortable_deal.deal.mvi.a, kotlinx.coroutines.flow.j, java.lang.String, com.avito.android.comfortable_deal.repository.model.CommentsFilter, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DealInternalAction> b(InterfaceC13517a interfaceC13517a, Ep.c cVar) {
        C43210w c43210w;
        Object openTransitionDialog;
        InterfaceC13517a interfaceC13517a2 = interfaceC13517a;
        Ep.c cVar2 = cVar;
        boolean z12 = interfaceC13517a2 instanceof InterfaceC13517a.s;
        Ep.d dVar = cVar2.f4331h;
        com.avito.android.comfortable_deal.deal.interactor.a aVar = this.f121585f;
        if (z12) {
            return aVar.a(dVar.f4339h);
        }
        boolean z13 = interfaceC13517a2 instanceof InterfaceC13517a.C0257a;
        String str = cVar2.f4325b;
        if (z13) {
            ActionTransition actionTransition = ActionTransition.Sold;
            ActionTransition actionTransition2 = ((InterfaceC13517a.C0257a) interfaceC13517a2).f4269a;
            if (actionTransition2 == actionTransition) {
                openTransitionDialog = new DealInternalAction.OpenSoldTransitionDialog(str == null ? "" : str, cVar2.f4328e, cVar2.f4327d, cVar2.f4326c, actionTransition2, null);
            } else {
                openTransitionDialog = new DealInternalAction.OpenTransitionDialog(str != null ? str : "", actionTransition2, P0.c());
            }
            c43210w = new C43210w(openTransitionDialog);
        } else {
            if (interfaceC13517a2 instanceof InterfaceC13517a.B) {
                StagesTransitionResult stagesTransitionResult = ((InterfaceC13517a.B) interfaceC13517a2).f4268a;
                return aVar.c(cVar2, stagesTransitionResult.f122956b, stagesTransitionResult.f122957c, dVar.f4339h, stagesTransitionResult.f122958d);
            }
            if (interfaceC13517a2 instanceof InterfaceC13517a.k) {
                EndDealResult endDealResult = ((InterfaceC13517a.k) interfaceC13517a2).f4280a;
                return aVar.b(endDealResult.f122277b, dVar.f4339h, endDealResult.f122278c);
            }
            if (interfaceC13517a2 instanceof InterfaceC13517a.v) {
                return C43175k.G(new j(interfaceC13517a2, cVar2, null));
            }
            if (interfaceC13517a2 instanceof InterfaceC13517a.y) {
                return new C43210w(new DealInternalAction.OpenSellerItem(((InterfaceC13517a.y) interfaceC13517a2).f4297a));
            }
            if (interfaceC13517a2 instanceof InterfaceC13517a.c) {
                return new C43210w(new DealInternalAction.OpenAgentItem(((InterfaceC13517a.c) interfaceC13517a2).f4271a));
            }
            if (interfaceC13517a2 instanceof InterfaceC13517a.q) {
                InterfaceC13517a.q qVar = (InterfaceC13517a.q) interfaceC13517a2;
                return new C43210w(new DealInternalAction.PhoneCall(qVar.f4286a, str != null ? str : "", qVar.f4287b));
            }
            if (interfaceC13517a2 instanceof InterfaceC13517a.x) {
                return new C43210w(new DealInternalAction.SelectAgent(str != null ? str : "", ((InterfaceC13517a.x) interfaceC13517a2).f4296a));
            }
            if (!(interfaceC13517a2 instanceof InterfaceC13517a.C13518b)) {
                if (interfaceC13517a2 instanceof InterfaceC13517a.j) {
                    return C43175k.G(new k(interfaceC13517a2, cVar2, this, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.u) {
                    return C43175k.G(new l(interfaceC13517a2, cVar2, null));
                }
                if (interfaceC13517a2.equals(InterfaceC13517a.z.f4298a)) {
                    return C43175k.G(new m(cVar2, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.A) {
                    return C43175k.G(new n(interfaceC13517a2, this, null));
                }
                if (interfaceC13517a2.equals(InterfaceC13517a.f.f4275a)) {
                    return C43175k.G(new o(this, null));
                }
                if (interfaceC13517a2.equals(InterfaceC13517a.m.f4282a)) {
                    return C43175k.G(new p(this, null));
                }
                if (interfaceC13517a2.equals(InterfaceC13517a.l.f4281a)) {
                    return C43175k.G(new q(this, null));
                }
                if (interfaceC13517a2.equals(InterfaceC13517a.g.f4276a)) {
                    return C43175k.G(new r(this, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.w) {
                    return C43175k.G(new C29455c(interfaceC13517a2, this, null));
                }
                if (interfaceC13517a2.equals(InterfaceC13517a.t.f4292a)) {
                    return C43175k.G(new C29456d(this, cVar2, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.i) {
                    return C43175k.G(new C29457e(interfaceC13517a2, cVar2, this, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.e) {
                    return C43175k.G(new C29458f(this, cVar2, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.n) {
                    return aVar.d(cVar2, ((InterfaceC13517a.n) interfaceC13517a2).f4283a);
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.p) {
                    return new C43210w(new DealInternalAction.OpenRecallRequestDialogClicked(null, ((InterfaceC13517a.p) interfaceC13517a2).f4285a, 1, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.r) {
                    return C43175k.G(new C29459g(interfaceC13517a2, cVar2, this, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.d) {
                    return C43175k.G(new s(interfaceC13517a2, cVar2, this, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.o) {
                    return C43175k.G(new h(interfaceC13517a2, cVar2, this, null));
                }
                if (interfaceC13517a2 instanceof InterfaceC13517a.h) {
                    return C43175k.G(new i(this, cVar2, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new DealInternalAction.OpenAddCommentDialog(null, str != null ? str : ""));
        }
        return c43210w;
    }
}
