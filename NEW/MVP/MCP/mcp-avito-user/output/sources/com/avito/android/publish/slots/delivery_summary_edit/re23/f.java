package com.avito.android.publish.slots.delivery_summary_edit.re23;

import Hj.C13996a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.slots.delivery_summary_edit.item.m;
import com.avito.android.publish.slots.delivery_summary_edit.item.n;
import com.avito.android.publish.slots.delivery_summary_edit.item.o;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDeliverySummaryEditItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/re23/f;", "Lcom/avito/android/publish/slots/delivery_summary_edit/re23/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f243839b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f243840c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f243841d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f243842e;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243839b = cVar;
        this.f243840c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<String> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f243841d = cVar2;
        this.f243842e = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        n nVar = (n) aVar;
        String str = "";
        boolean z12 = true;
        boolean z13 = false;
        String str2 = null;
        AttributedText attributedText = null;
        hVar.a60(new C13996a(str, new ItemWithState.State.Normal(null, 1, null), z12, z13, str2, attributedText, null, nVar.f243817g, null, 376, null));
        hVar.K4(nVar.f243818h);
        o oVar = nVar.f243819i;
        m mVar = nVar.f243813c;
        m mVar2 = nVar.f243815e;
        m mVar3 = nVar.f243816f;
        List listU = C42745f0.U(oVar, mVar, mVar2, mVar3, nVar.f243817g);
        if (!(listU instanceof Collection) || !listU.isEmpty()) {
            Iterator it = listU.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    if (oVar != null) {
                        hVar.o4(oVar);
                        return;
                    }
                    hVar.X9(mVar, new d(this.f243839b), new e(1, this.f243841d, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 0));
                    hVar.F7(mVar2);
                    hVar.qb(mVar3);
                    return;
                }
            }
        }
        hVar.Dc();
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.re23.c
    @k
    public final z<DeepLink> j() {
        return this.f243840c;
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.re23.c
    @k
    public final z<String> l() {
        return this.f243842e;
    }
}
