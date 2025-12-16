package com.avito.android.wallet.page.history.details.mvi.component;

import SO0.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.wallet.page.history.details.mvi.entity.PaymentHistoryDetailsInternalAction;
import com.avito.android.wallet.page.history.details.remote.dto.ReceiptStatus;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import nd.InterfaceC44378a;

/* compiled from: PaymentHistoryDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/component/a;", "Lcom/avito/android/arch/mvi/a;", "LSO0/a;", "Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsInternalAction;", "LSO0/c;", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.arch.mvi.a<SO0.a, PaymentHistoryDetailsInternalAction, SO0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet.page.history.details.mvi.i f327883a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44378a f327884b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f327885c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f327886d;

    /* compiled from: PaymentHistoryDetailsActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/component/a$a;", "", "<init>", "()V", "", "THROTTLING_TIMEOUT", "J", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.page.history.details.mvi.component.a$a, reason: collision with other inner class name */
    public static final class C10168a {
        public /* synthetic */ C10168a(C42822w c42822w) {
            this();
        }

        public C10168a() {
        }
    }

    /* compiled from: PaymentHistoryDetailsActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f327887a;

        static {
            int[] iArr = new int[ReceiptStatus.values().length];
            try {
                iArr[ReceiptStatus.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReceiptStatus.WAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReceiptStatus.FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f327887a = iArr;
        }
    }

    static {
        new C10168a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.wallet.page.history.details.mvi.i iVar, @Y61.k InterfaceC44378a interfaceC44378a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f327883a = iVar;
        this.f327884b = interfaceC44378a;
        this.f327885c = aVar;
        this.f327886d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, com.avito.android.wallet.page.history.details.mvi.component.b.f327888l, new c(this, aVar), 300L);
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<PaymentHistoryDetailsInternalAction> b(SO0.a aVar, SO0.c cVar) {
        return c(aVar);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k SO0.a aVar) {
        C43210w c43210w;
        if (aVar instanceof a.d) {
            return C43175k.G(new d(this, null));
        }
        boolean z12 = aVar instanceof a.c;
        InterfaceC28373a interfaceC28373a = this.f327886d;
        if (z12) {
            UO0.c cVar = ((a.c) aVar).f14952a;
            int i12 = b.f327887a[cVar.getStatus().ordinal()];
            if (i12 == 1) {
                interfaceC28373a.c(new MO0.g());
                return new C43210w(new PaymentHistoryDetailsInternalAction.RunChromeCustomTabs(cVar.getReceiptUrl(), this.f327884b.b("com.android.chrome") ? "com.android.chrome" : null));
            }
            if (i12 == 2) {
                c43210w = new C43210w(PaymentHistoryDetailsInternalAction.ShowFiscalizationInProgressDialog.f327944b);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC28373a.c(new MO0.h());
                c43210w = new C43210w(PaymentHistoryDetailsInternalAction.ShowFiscalizationErrorDialog.f327943b);
            }
            return c43210w;
        }
        if (aVar instanceof a.f) {
            return C43175k.G(new e(this, aVar, null));
        }
        if (aVar instanceof a.e) {
            interfaceC28373a.c(new MO0.f());
            a.e eVar = (a.e) aVar;
            return new C43210w(new PaymentHistoryDetailsInternalAction.Refund(eVar.f14954a, eVar.f14955b));
        }
        if (aVar instanceof a.b) {
            interfaceC28373a.c(new MO0.c());
            return C43175k.G(new f(this, null));
        }
        if (aVar instanceof a.C1010a) {
            return C43175k.G(new g(2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
