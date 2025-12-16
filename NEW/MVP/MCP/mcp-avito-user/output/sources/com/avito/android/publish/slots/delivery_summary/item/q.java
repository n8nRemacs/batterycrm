package com.avito.android.publish.slots.delivery_summary.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySummaryItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/item/q;", "Lcom/avito/android/publish/slots/delivery_summary/item/f;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f243591b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243592c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f243593d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243594e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<y> f243595f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243596g;

    @Inject
    public q() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243591b = cVar;
        this.f243592c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<String> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f243593d = cVar2;
        this.f243594e = new C41981q0(cVar2);
        com.jakewharton.rxrelay3.c<y> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f243595f = cVar3;
        this.f243596g = new C41981q0(cVar3);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        s sVar = (s) eVar;
        y yVar = (y) aVar;
        sVar.u5(yVar.f243649n);
        com.avito.android.publish.slots.delivery_summary_edit.item.o oVar = yVar.f243652q;
        if (oVar != null) {
            sVar.o4(oVar);
            return;
        }
        b bVar = yVar.f243638c;
        if (bVar != null) {
            Image image = bVar.f243573a;
            com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
            if (image == null) {
                aVarB = null;
            }
            sVar.L40(aVarB);
            sVar.ER(bVar.f243574b);
            sVar.of(bVar.f243575c);
        }
        sVar.l8(yVar.f243639d);
        com.jakewharton.rxrelay3.c<DeepLink> cVar = this.f243591b;
        j jVar = new j(cVar);
        com.jakewharton.rxrelay3.c<String> cVar2 = this.f243593d;
        sVar.bb(yVar.f243640e, jVar, new k(1, cVar2, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        sVar.Nf(yVar.f243641f, new l(cVar), new m(1, cVar2, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        sVar.Jd(yVar.f243642g);
        sVar.ac(yVar.f243643h);
        sVar.O6(new n(1, cVar2, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0), yVar.f243653r);
        sVar.ab(yVar.f243644i);
        sVar.xb(yVar.f243645j, new o(cVar), new p(1, cVar2, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        sVar.H9(yVar.f243646k);
        sVar.Oa(yVar.f243647l);
        c cVar3 = yVar.f243650o;
        sVar.W5(cVar3 != null ? cVar3.f243576a : null);
        sVar.f9(cVar3 != null ? cVar3.f243577b : null, new g(cVar), new h(1, cVar2, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        sVar.y8(cVar3 != null ? cVar3.f243578c : null);
        sVar.u2(yVar.f243648m);
        sVar.cb(yVar.f243651p, new i(this, yVar));
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.f
    @Y61.k
    public final io.reactivex.rxjava3.core.z<y> b() {
        return this.f243596g;
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.f
    @Y61.k
    public final io.reactivex.rxjava3.core.z<DeepLink> j() {
        return this.f243592c;
    }

    @Override // com.avito.android.publish.slots.delivery_summary.item.f
    @Y61.k
    public final io.reactivex.rxjava3.core.z<String> l() {
        return this.f243594e;
    }
}
