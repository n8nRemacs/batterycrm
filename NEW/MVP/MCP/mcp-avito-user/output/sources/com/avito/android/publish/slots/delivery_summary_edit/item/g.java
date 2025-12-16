package com.avito.android.publish.slots.delivery_summary_edit.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliverySummaryEditItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/item/g;", "Lcom/avito/android/publish/slots/delivery_summary_edit/item/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f243787b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243788c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f243789d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243790e;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243787b = cVar;
        this.f243788c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<String> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f243789d = cVar2;
        this.f243790e = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        n nVar = (n) aVar;
        iVar.K4(nVar.f243818h);
        o oVar = nVar.f243819i;
        if (oVar != null) {
            iVar.o4(oVar);
            return;
        }
        com.jakewharton.rxrelay3.c<DeepLink> cVar = this.f243787b;
        iVar.X9(nVar.f243813c, new d(cVar), new e(1, this.f243789d, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        iVar.wp(nVar.f243814d, new f(cVar));
        iVar.F7(nVar.f243815e);
        iVar.qb(nVar.f243816f);
        iVar.u2(nVar.f243817g);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.item.c
    @Y61.k
    public final z<DeepLink> j() {
        return this.f243788c;
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.item.c
    @Y61.k
    public final z<String> l() {
        return this.f243790e;
    }
}
