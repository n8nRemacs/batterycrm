package com.avito.android.services_portfolio.project.seller.mvi;

import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.avito.android.services_portfolio.project.seller.mvi.a;
import com.avito.android.services_portfolio.project.seller.mvi.entity.PortfolioProjectSellerInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import jv0.C42432a;
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
import kv0.InterfaceC43503b;

/* compiled from: PortfolioProjectSellerActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_portfolio/project/seller/mvi/entity/PortfolioProjectSellerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.services_portfolio.project.seller.mvi.PortfolioProjectSellerActor$process$1", f = "PortfolioProjectSellerActor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, 35, 36, 45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super PortfolioProjectSellerInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f280232q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f280233r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43503b f280234s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f280235t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC43503b interfaceC43503b, a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f280234s = interfaceC43503b;
        this.f280235t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f280234s, this.f280235t, continuation);
        bVar.f280233r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PortfolioProjectSellerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f280232q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f280233r;
            InterfaceC43503b interfaceC43503b = this.f280234s;
            boolean z12 = interfaceC43503b instanceof InterfaceC43503b.e;
            a aVar = this.f280235t;
            if (z12) {
                com.avito.android.services_portfolio.project.seller.domain.a aVar2 = aVar.f280227a;
                PortfolioProjectArguments.SellerArgs sellerArgs = aVar.f280228b;
                InterfaceC43160i<PortfolioProjectSellerInternalAction> interfaceC43160iB = aVar2.b(sellerArgs.f279999c, sellerArgs.f279998b);
                this.f280232q = 1;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC43503b instanceof InterfaceC43503b.a) {
                PortfolioProjectSellerInternalAction.Back back = PortfolioProjectSellerInternalAction.Back.f280259b;
                this.f280232q = 2;
                if (interfaceC43172j.emit(back, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC43503b instanceof InterfaceC43503b.d) {
                InterfaceC43503b.d dVar = (InterfaceC43503b.d) interfaceC43503b;
                PortfolioProjectSellerInternalAction.OpenImage openImage = new PortfolioProjectSellerInternalAction.OpenImage(dVar.f413269a, dVar.f413270b);
                this.f280232q = 3;
                if (interfaceC43172j.emit(openImage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC43503b instanceof InterfaceC43503b.C11762b) {
                InterfaceC28373a interfaceC28373a = aVar.f280229c;
                PortfolioProjectArguments.SellerArgs sellerArgs2 = aVar.f280228b;
                String str = sellerArgs2.f279998b;
                a.EnumC8339a[] enumC8339aArr = a.EnumC8339a.f280230b;
                interfaceC28373a.c(new C42432a(str, "delete"));
                InterfaceC43160i<PortfolioProjectSellerInternalAction> interfaceC43160iA = aVar.f280227a.a(sellerArgs2.f279999c);
                this.f280232q = 4;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (interfaceC43503b instanceof InterfaceC43503b.c) {
                InterfaceC28373a interfaceC28373a2 = aVar.f280229c;
                String str2 = aVar.f280228b.f279998b;
                a.EnumC8339a[] enumC8339aArr2 = a.EnumC8339a.f280230b;
                interfaceC28373a2.c(new C42432a(str2, "edit"));
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
