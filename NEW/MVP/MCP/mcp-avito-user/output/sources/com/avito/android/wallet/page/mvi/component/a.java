package com.avito.android.wallet.page.mvi.component;

import PO0.b;
import ZO0.b;
import android.content.Intent;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.BottomSheetContentPaddings;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.LegacyPaymentSessionLink;
import com.avito.android.deep_linking.links.PaymentGenericFormLink;
import com.avito.android.deep_linking.links.PaymentGenericLink;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.deep_linking.links.PaymentStatusFormLink;
import com.avito.android.deep_linking.links.PaymentStatusLink;
import com.avito.android.deep_linking.links.SBOLPaymentLink;
import com.avito.android.deep_linking.links.TopUpFormLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.payment.ParametersTree;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.wallet.page.mvi.entity.WalletPageInternalAction;
import com.avito.android.wallet.page.mvi.entity.WalletPageState;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: WalletPageActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/mvi/component/a;", "Lcom/avito/android/arch/mvi/a;", "LZO0/b;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageState;", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<ZO0.b, WalletPageInternalAction, WalletPageState> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f328102h = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f328103a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f328104b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet.page.mvi.a f328105c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f328106d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36134w1 f328107e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet.page.c f328108f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.ui.universal.h f328109g;

    /* compiled from: WalletPageActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/mvi/component/a$a;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.page.mvi.component.a$a, reason: collision with other inner class name */
    public static final class C10175a {
        public /* synthetic */ C10175a(C42822w c42822w) {
            this();
        }

        public C10175a() {
        }
    }

    /* compiled from: WalletPageActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.mvi.component.WalletPageActor$process$1", f = "WalletPageActor.kt", i = {0}, l = {94, 95}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletPageInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328110q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f328111r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f328111r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WalletPageInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f328110q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f328111r;
                WalletPageInternalAction.Refresh refresh = new WalletPageInternalAction.Refresh();
                this.f328111r = interfaceC43172j;
                this.f328110q = 1;
                if (interfaceC43172j.emit(refresh, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f328111r;
                C42729a0.b(obj);
            }
            this.f328111r = null;
            this.f328110q = 2;
            if (a.c(a.this, interfaceC43172j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPageActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/page/mvi/entity/WalletPageInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.mvi.component.WalletPageActor$process$2", f = "WalletPageActor.kt", i = {0}, l = {UpdateStatusCode.DialogButton.CONFIRM, 102}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletPageInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328113q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f328114r;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = a.this.new c(continuation);
            cVar.f328114r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WalletPageInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f328113q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f328114r;
                WalletPageInternalAction.ShowContentLoading showContentLoading = new WalletPageInternalAction.ShowContentLoading();
                this.f328114r = interfaceC43172j;
                this.f328113q = 1;
                if (interfaceC43172j.emit(showContentLoading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f328114r;
                C42729a0.b(obj);
            }
            this.f328114r = null;
            this.f328113q = 2;
            if (a.c(a.this, interfaceC43172j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPageActor.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/avito/android/wallet/page/mvi/component/a$d", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements cc.e, com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f328116b;

        public d(PO0.a aVar) {
            int id2 = (int) aVar.getId();
            int version = (int) aVar.getVersion();
            Map<String, Object> mapB = aVar.b();
            this.f328116b = new ParametrizedClickStreamEvent(id2, version, mapB == null ? P0.c() : mapB, null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF83080b() {
            return this.f328116b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f328116b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF83081c() {
            return this.f328116b.f90248c;
        }
    }

    static {
        new C10175a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k x xVar, @Y61.k com.avito.android.wallet.page.mvi.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC36134w1 interfaceC36134w1, @Y61.k com.avito.android.wallet.page.c cVar, @Y61.k com.avito.android.beduin.ui.universal.h hVar) {
        this.f328103a = aVar;
        this.f328104b = xVar;
        this.f328105c = aVar2;
        this.f328106d = interfaceC28373a;
        this.f328107e = interfaceC36134w1;
        this.f328108f = cVar;
        this.f328109g = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.wallet.page.mvi.component.a r8, kotlinx.coroutines.flow.InterfaceC43172j r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.page.mvi.component.a.c(com.avito.android.wallet.page.mvi.component.a, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.G(new com.avito.android.wallet.page.mvi.component.d(new com.avito.android.wallet.page.mvi.component.c(y.a(this.f328103a.d9())), null, this)), com.avito.android.arch.mvi.utils.h.e(c43197r1, e.f328137l, new f(this, aVar), 1000L));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<WalletPageInternalAction> b(@Y61.k ZO0.b bVar, @Y61.k WalletPageState walletPageState) {
        PO0.i promoBanner;
        PO0.l events;
        Intent intentA;
        C43210w c43210w;
        boolean z12 = bVar instanceof b.a;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f328103a;
        PO0.a bannerShown = null;
        if (z12) {
            b.a.a(aVar, ((b.a) bVar).f20118a, null, null, 6);
            return C43175k.w();
        }
        if (bVar instanceof b.c) {
            b.a.a(aVar, ((b.c) bVar).f20120a, "wallet_page_action_link_request_key", null, 4);
            return C43175k.w();
        }
        boolean zEquals = bVar.equals(b.C1438b.f20119a);
        com.avito.android.wallet.page.c cVar = this.f328108f;
        InterfaceC28373a interfaceC28373a = this.f328106d;
        if (zEquals) {
            interfaceC28373a.c(new LO0.a());
            return new C43210w(new WalletPageInternalAction.StartActivity(cVar.a()));
        }
        if (bVar.equals(b.d.f20121a)) {
            return C43175k.G(new b(null));
        }
        if (bVar.equals(b.e.f20122a)) {
            return C43175k.G(new c(null));
        }
        if (bVar.equals(b.f.f20123a)) {
            c43210w = new C43210w(WalletPageInternalAction.Close.f328180b);
        } else {
            if (!(bVar instanceof b.g)) {
                if (!(bVar instanceof b.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                PO0.b bVar2 = walletPageState.f328192e;
                b.a aVar2 = bVar2 instanceof b.a ? (b.a) bVar2 : null;
                if (aVar2 != null && (promoBanner = aVar2.getPromoBanner()) != null && (events = promoBanner.getEvents()) != null) {
                    bannerShown = events.getBannerShown();
                }
                if (bannerShown != null) {
                    interfaceC28373a.c(new d(bannerShown));
                }
                return C43175k.w();
            }
            interfaceC28373a.c(new LO0.c());
            DeepLink deepLink = ((b.g) bVar).f20124a;
            if (deepLink instanceof TopUpFormLink) {
                intentA = cVar.b(((TopUpFormLink) deepLink).f133742b);
            } else {
                boolean z13 = deepLink instanceof PaymentGenericFormLink;
                InterfaceC36134w1 interfaceC36134w1 = this.f328107e;
                if (z13) {
                    PaymentGenericFormLink paymentGenericFormLink = (PaymentGenericFormLink) deepLink;
                    intentA = interfaceC36134w1.f(paymentGenericFormLink.f133553b, paymentGenericFormLink.f133554c);
                } else if (deepLink instanceof PaymentGenericLink) {
                    PaymentGenericLink paymentGenericLink = (PaymentGenericLink) deepLink;
                    intentA = interfaceC36134w1.d(paymentGenericLink.f133555b, paymentGenericLink.f133556c, paymentGenericLink.f133557d.length() > 0 ? new ParametersTree(Collections.singletonList(new CharParameter("paymentToken", "", true, true, null, null, null, paymentGenericLink.f133557d, null, null, null, null, null, null, null, null, null, null, 262000, null))) : new ParametersTree(C42784z0.f406748b));
                } else if (deepLink instanceof PaymentStatusLink) {
                    intentA = interfaceC36134w1.b(((PaymentStatusLink) deepLink).f133571b);
                } else if (deepLink instanceof PaymentStatusFormLink) {
                    intentA = interfaceC36134w1.h(((PaymentStatusFormLink) deepLink).f133570b);
                } else if (deepLink instanceof PaymentSessionLink) {
                    PaymentSessionLink paymentSessionLink = (PaymentSessionLink) deepLink;
                    intentA = interfaceC36134w1.a(paymentSessionLink.f133562b, paymentSessionLink.f133563c, paymentSessionLink.f133564d, null, null);
                } else if (deepLink instanceof SBOLPaymentLink) {
                    intentA = interfaceC36134w1.c(((SBOLPaymentLink) deepLink).f133641b);
                } else if (deepLink instanceof LegacyPaymentSessionLink) {
                    LegacyPaymentSessionLink legacyPaymentSessionLink = (LegacyPaymentSessionLink) deepLink;
                    intentA = interfaceC36134w1.e(legacyPaymentSessionLink.f133422b, legacyPaymentSessionLink.f133424d, Collections.singletonList(legacyPaymentSessionLink.f133423c));
                } else if (deepLink instanceof BeduinUniversalPageLink) {
                    BeduinUniversalPageLink beduinUniversalPageLink = (BeduinUniversalPageLink) deepLink;
                    BottomSheetContentPaddings bottomSheetContentPaddings = beduinUniversalPageLink.f133044h;
                    intentA = this.f328109g.a(beduinUniversalPageLink.f133038b, beduinUniversalPageLink.f133041e, beduinUniversalPageLink.f133039c, beduinUniversalPageLink.f133040d, beduinUniversalPageLink.f133042f, beduinUniversalPageLink.f133043g, bottomSheetContentPaddings != null ? bottomSheetContentPaddings.f133059b : null);
                } else {
                    intentA = null;
                }
            }
            if (intentA == null) {
                b.a.a(aVar, deepLink, null, null, 6);
                return C43175k.w();
            }
            c43210w = new C43210w(new WalletPageInternalAction.StartActivityForResult(intentA));
        }
        return c43210w;
    }
}
