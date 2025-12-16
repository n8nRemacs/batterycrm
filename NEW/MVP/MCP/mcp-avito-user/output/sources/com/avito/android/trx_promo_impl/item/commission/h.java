package com.avito.android.trx_promo_impl.item.commission;

import RF0.n;
import Y41.l;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: TrxPromoCommissionPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/commission/h;", "Lcom/avito/android/trx_promo_impl/item/commission/d;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<DeepLink, G0> f304239b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f304240c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f304241d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k l<? super DeepLink, G0> lVar) {
        this.f304239b = lVar;
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f304240c = e2VarB;
        this.f304241d = e2VarB;
    }

    public static void O(j jVar, ArrayList arrayList, int i12) {
        Object next;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            kotlin.ranges.l lVar = ((n) next).f14251a;
            if (i12 <= lVar.f406906c && lVar.f406905b <= i12) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar != null) {
            jVar.RW(nVar);
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null || !bundle.getBoolean("trx_promo_payload_commission_value_change")) {
            k(jVar, cVar);
            return;
        }
        jVar.Y5();
        jVar.K3(cVar.f304227c);
        jVar.Q8(new e(cVar, this, jVar));
        O(jVar, cVar.f304233i, cVar.f304227c);
    }

    public final void k(@Y61.k j jVar, @Y61.k c cVar) {
        l<DeepLink, G0> lVar = this.f304239b;
        f fVar = new f(lVar);
        AttributedText attributedText = cVar.f304226b;
        attributedText.setOnDeepLinkClickListener(fVar);
        jVar.e(attributedText);
        jVar.ii(cVar.f304230f, cVar.f304231g, cVar.f304232h);
        jVar.TN(cVar.f304228d);
        jVar.A9(cVar.f304229e);
        ArrayList arrayList = cVar.f304233i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AttributedText attributedText2 = ((n) it.next()).f14252b;
            if (attributedText2 != null) {
                attributedText2.setOnDeepLinkClickListener(new g(lVar));
            }
        }
        jVar.Y5();
        jVar.K3(cVar.f304227c);
        jVar.Q8(new e(cVar, this, jVar));
        O(jVar, arrayList, cVar.f304227c);
    }

    @Override // com.avito.android.trx_promo_impl.item.commission.d
    @Y61.k
    /* renamed from: u4, reason: from getter */
    public final e2 getF304241d() {
        return this.f304241d;
    }
}
