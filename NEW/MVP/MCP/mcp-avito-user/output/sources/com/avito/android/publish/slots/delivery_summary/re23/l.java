package com.avito.android.publish.slots.delivery_summary.re23;

import Hj.C13996a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.slots.delivery_summary.item.y;
import com.avito.android.publish.slots.delivery_summary.view.a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDeliverySummaryAddItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/re23/l;", "Lcom/avito/android/publish/slots/delivery_summary/re23/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f243700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243701c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f243702d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243703e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<y> f243704f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243705g;

    @Inject
    public l() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243700b = cVar;
        this.f243701c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<String> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f243702d = cVar2;
        this.f243703e = new C41981q0(cVar2);
        com.jakewharton.rxrelay3.c<y> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f243704f = cVar3;
        this.f243705g = new C41981q0(cVar3);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        y yVar = (y) aVar;
        nVar.a60(new C13996a("", new ItemWithState.State.Normal(null, 1, null), true, false, null, null, null, null, null, 504, null));
        nVar.setLoading(yVar.f243649n);
        com.avito.android.publish.slots.delivery_summary_edit.item.o oVar = yVar.f243652q;
        if (oVar != null) {
            nVar.nX(oVar);
            return;
        }
        com.avito.android.publish.slots.delivery_summary.item.b bVar = yVar.f243638c;
        nVar.RT(bVar == null ? null : new com.avito.android.publish.slots.delivery_summary.view.a(new a.C7303a(bVar.f243573a), new a.b(bVar.f243575c, bVar.f243574b, null, null, 12, null)));
        nVar.l8(yVar.f243639d);
        com.jakewharton.rxrelay3.c<DeepLink> cVar = this.f243700b;
        d dVar = new d(cVar);
        com.jakewharton.rxrelay3.c<String> cVar2 = this.f243702d;
        nVar.bb(yVar.f243640e, dVar, new e(1, cVar2, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        nVar.Jd(yVar.f243642g);
        nVar.ac(yVar.f243643h);
        nVar.O6(new f(1, cVar2, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0), yVar.f243653r);
        nVar.ab(yVar.f243644i);
        nVar.xb(yVar.f243645j, new g(cVar), new h(1, cVar2, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        nVar.H9(yVar.f243646k);
        nVar.Oa(yVar.f243647l);
        com.avito.android.publish.slots.delivery_summary.item.c cVar3 = yVar.f243650o;
        nVar.W5(cVar3 != null ? cVar3.f243576a : null);
        nVar.f9(cVar3 != null ? cVar3.f243577b : null, new i(cVar), new j(1, cVar2, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        nVar.y8(cVar3 != null ? cVar3.f243578c : null);
        nVar.u2(yVar.f243648m);
        nVar.cb(yVar.f243651p, new k(yVar, this));
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.c
    @Y61.k
    public final z<y> b() {
        return this.f243705g;
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.c
    @Y61.k
    public final z<DeepLink> j() {
        return this.f243701c;
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.c
    @Y61.k
    public final z<String> l() {
        return this.f243703e;
    }
}
