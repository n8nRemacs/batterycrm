package com.avito.android.wallet.page.history.mvi.component;

import VO0.b;
import VO0.d;
import YO0.a;
import com.avito.android.arch.mvi.u;
import com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction;
import com.avito.android.wallet.page.history.remote.dto.PaymentRefundStatus;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/component/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "LVO0/d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s implements u<PaymentHistoryInternalAction, VO0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f328054b;

    @Inject
    public s(@Y61.k o oVar) {
        this.f328054b = oVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final VO0.d a(PaymentHistoryInternalAction paymentHistoryInternalAction, VO0.d dVar) {
        List listP;
        Object c1178b;
        PaymentHistoryInternalAction paymentHistoryInternalAction2 = paymentHistoryInternalAction;
        VO0.d dVar2 = dVar;
        boolean z12 = paymentHistoryInternalAction2 instanceof PaymentHistoryInternalAction.Items;
        ?? r32 = dVar2.f17124b;
        boolean z13 = false;
        o oVar = this.f328054b;
        if (!z12) {
            if (paymentHistoryInternalAction2 instanceof PaymentHistoryInternalAction.InitialLoad) {
                return VO0.d.a(dVar2, C42784z0.f406748b, d.b.c.f17129a, 2);
            }
            if (paymentHistoryInternalAction2 instanceof PaymentHistoryInternalAction.InitialLoadError) {
                return VO0.d.a(dVar2, C42784z0.f406748b, new d.b.a(((PaymentHistoryInternalAction.InitialLoadError) paymentHistoryInternalAction2).f328069b), 2);
            }
            if (paymentHistoryInternalAction2 instanceof PaymentHistoryInternalAction.NextLoad) {
                oVar.getClass();
                return VO0.d.a(dVar2, C42745f0.i0(new b.c(false, 1, null), o.a(r32)), null, 6);
            }
            if (!(paymentHistoryInternalAction2 instanceof PaymentHistoryInternalAction.NextLoadError)) {
                return dVar2;
            }
            oVar.getClass();
            return VO0.d.a(dVar2, C42745f0.i0(new b.c(true), o.a(r32)), null, 6);
        }
        PaymentHistoryInternalAction.Items items = (PaymentHistoryInternalAction.Items) paymentHistoryInternalAction2;
        oVar.getClass();
        List<YO0.a> list = items.f328070b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (YO0.a aVar : list) {
            if (aVar instanceof a.b) {
                a.b bVar = (a.b) aVar;
                c1178b = new b.d(bVar.getOperationId(), bVar.getTitle(), bVar.getAmount(), bVar.getDescription(), bVar.getDate(), bVar.getStatus(), bVar.getRefundStatus() == PaymentRefundStatus.AVAILABLE, bVar.getRefundSubtitle());
            } else {
                if (!(aVar instanceof a.C1378a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c1178b = new b.C1178b(((a.C1378a) aVar).getTitle());
            }
            arrayList.add(c1178b);
        }
        String str = items.f328071c;
        if (str == null || str.length() == 0) {
            com.avito.android.wallet.page.feature.a aVar2 = oVar.f328049a;
            aVar2.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.wallet.page.feature.a.f327818c[0];
            if (((Boolean) aVar2.f327819b.a().invoke()).booleanValue() && L.f(oVar.f328050b, "topup") && !arrayList.isEmpty()) {
                z13 = true;
            }
            kotlin.collections.builders.b bVarT = C42745f0.t();
            if (z13) {
                bVarT.add(b.a.f17109a);
            }
            bVarT.addAll(arrayList);
            listP = C42745f0.p(bVarT);
        } else {
            listP = C42745f0.h0(arrayList, o.a(r32));
        }
        return new VO0.d(listP, items.f328072d, d.b.C1179b.f17128a);
    }
}
