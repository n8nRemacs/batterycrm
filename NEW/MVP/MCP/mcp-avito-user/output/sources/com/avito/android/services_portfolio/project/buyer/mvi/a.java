package com.avito.android.services_portfolio.project.buyer.mvi;

import Y41.p;
import com.avito.android.analytics.event.i1;
import com.avito.android.analytics.event.r;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.avito.android.services_portfolio.project.buyer.analytics.ServicesPortfolioBuyerActionType;
import com.avito.android.services_portfolio.project.buyer.mvi.entity.PortfolioProjectBuyerInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import gv0.C40742a;
import iv0.InterfaceC42115a;
import java.util.LinkedHashMap;
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

/* compiled from: PortfolioProjectBuyerActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.services_portfolio.project.buyer.mvi.PortfolioProjectBuyerActor$process$1", f = "PortfolioProjectBuyerActor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 38, 39, 48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super PortfolioProjectBuyerInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f280014q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f280015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42115a f280016s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f280017t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC42115a interfaceC42115a, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f280016s = interfaceC42115a;
        this.f280017t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f280016s, this.f280017t, continuation);
        aVar.f280015r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PortfolioProjectBuyerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f280014q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f280015r;
            InterfaceC42115a interfaceC42115a = this.f280016s;
            boolean z12 = interfaceC42115a instanceof InterfaceC42115a.f;
            c cVar = this.f280017t;
            if (z12) {
                com.avito.android.services_portfolio.project.buyer.domain.a aVar = cVar.f280021a;
                PortfolioProjectArguments.BuyerArgs buyerArgs = cVar.f280023c;
                InterfaceC43160i<PortfolioProjectBuyerInternalAction> interfaceC43160iA = aVar.a(buyerArgs.f279992c, buyerArgs.f279991b, buyerArgs.f279993d, buyerArgs.f279994e, buyerArgs.f279995f);
                this.f280014q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC42115a instanceof InterfaceC42115a.h) {
                com.avito.android.services_portfolio.project.buyer.domain.a aVar2 = cVar.f280021a;
                aVar2.f280003b.a(cVar.f280023c.f279992c);
            } else if (interfaceC42115a instanceof InterfaceC42115a.c) {
                ((InterfaceC42115a.c) interfaceC42115a).getClass();
                PortfolioProjectBuyerInternalAction.Error error = new PortfolioProjectBuyerInternalAction.Error(null);
                this.f280014q = 2;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC42115a instanceof InterfaceC42115a.C11540a) {
                PortfolioProjectBuyerInternalAction.Back back = PortfolioProjectBuyerInternalAction.Back.f280039b;
                this.f280014q = 3;
                if (interfaceC43172j.emit(back, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC42115a instanceof InterfaceC42115a.e) {
                C40742a c40742a = cVar.f280022b;
                PortfolioProjectArguments.BuyerArgs buyerArgs2 = cVar.f280023c;
                long j12 = buyerArgs2.f279992c;
                c40742a.getClass();
                ServicesPortfolioBuyerActionType[] servicesPortfolioBuyerActionTypeArr = ServicesPortfolioBuyerActionType.f280000b;
                c40742a.f396947a.c(new gv0.c(buyerArgs2.f279991b, "photo_view", buyerArgs2.f279996g, buyerArgs2.f279997h, buyerArgs2.f279995f, String.valueOf(j12)));
                InterfaceC42115a.e eVar = (InterfaceC42115a.e) interfaceC42115a;
                PortfolioProjectBuyerInternalAction.OpenImage openImage = new PortfolioProjectBuyerInternalAction.OpenImage(eVar.f405360a, eVar.f405361b, eVar.f405362c, eVar.f405363d);
                this.f280014q = 4;
                if (interfaceC43172j.emit(openImage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC42115a instanceof InterfaceC42115a.g) {
                C40742a c40742a2 = cVar.f280022b;
                PortfolioProjectArguments.BuyerArgs buyerArgs3 = cVar.f280023c;
                long j13 = buyerArgs3.f279992c;
                c40742a2.getClass();
                ServicesPortfolioBuyerActionType[] servicesPortfolioBuyerActionTypeArr2 = ServicesPortfolioBuyerActionType.f280000b;
                c40742a2.f396947a.c(new gv0.c(buyerArgs3.f279991b, "description_view", buyerArgs3.f279996g, buyerArgs3.f279997h, buyerArgs3.f279995f, String.valueOf(j13)));
            } else if (interfaceC42115a instanceof InterfaceC42115a.b) {
                C40742a c40742a3 = cVar.f280022b;
                PortfolioProjectArguments.BuyerArgs buyerArgs4 = cVar.f280023c;
                String str = buyerArgs4.f279991b;
                c40742a3.getClass();
                if (str != null) {
                    r.f90128e.getClass();
                    r rVar = new r(null);
                    LinkedHashMap linkedHashMap = rVar.f90131d;
                    linkedHashMap.put("iid", str);
                    linkedHashMap.put("vsrc", "portfolio_project");
                    linkedHashMap.put("from_block", 20);
                    String str2 = buyerArgs4.f279996g;
                    if (str2 != null) {
                        linkedHashMap.put("cid", str2);
                    }
                    String str3 = buyerArgs4.f279995f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    linkedHashMap.put("x", str3);
                    c40742a3.f396947a.c(rVar);
                }
            } else if (interfaceC42115a instanceof InterfaceC42115a.d) {
                C40742a c40742a4 = cVar.f280022b;
                PortfolioProjectArguments.BuyerArgs buyerArgs5 = cVar.f280023c;
                String str4 = buyerArgs5.f279991b;
                c40742a4.getClass();
                if (str4 != null) {
                    c40742a4.f396947a.c(new i1(c40742a4.f396948b, c40742a4.f396947a, 0L, null, str4, "portfolio_project", 20, null, buyerArgs5.f279995f, buyerArgs5.f279996g));
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
