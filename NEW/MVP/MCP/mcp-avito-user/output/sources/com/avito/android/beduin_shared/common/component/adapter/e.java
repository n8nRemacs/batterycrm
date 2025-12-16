package com.avito.android.beduin_shared.common.component.adapter;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.common.component.adapter.b;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSyncWithDiffUtilAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/common/component/adapter/e;", "Lcom/avito/android/beduin_shared/common/component/adapter/b;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends b {

    /* renamed from: e, reason: collision with root package name */
    @l
    public Integer f105276e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public AbstractC40112a<BeduinModel, InterfaceC40116e> f105277f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> f105278g = C42784z0.f406748b;

    @Inject
    public e() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f105278g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a = this.f105278g.get(i12);
        this.f105277f = abstractC40112a;
        return j(abstractC40112a);
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.b
    public final void k(@k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
        C23424o.e eVarA = C23424o.a(new a(this.f105278g, list), true);
        this.f105278g = list;
        eVarA.b(this);
    }

    public final void l(AbstractC40112a abstractC40112a) {
        Integer num = this.f105276e;
        abstractC40112a.f395324b = num != null ? num.intValue() : abstractC40112a.f395324b;
        abstractC40112a.f395325c = num != null ? num.intValue() : abstractC40112a.f395325c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a = this.f105278g.get(i12);
        l(abstractC40112a);
        abstractC40112a.m(((b.a) c12).f105272b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.C onCreateViewHolder(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            ej.a<com.avito.android.beduin_models.BeduinModel, ej.e> r0 = r4.f105277f
            if (r0 == 0) goto Lf
            int r1 = r4.j(r0)
            if (r1 != r6) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto Lf
            goto L2a
        Lf:
            java.util.List<? extends ej.a<com.avito.android.beduin_models.BeduinModel, ej.e>> r0 = r4.f105278g
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            ej.a r1 = (ej.AbstractC40112a) r1
            int r2 = r4.j(r1)
            if (r2 != r6) goto L17
            r0 = r1
        L2a:
            r4.l(r0)
            com.avito.android.beduin_shared.common.component.adapter.b$a r6 = new com.avito.android.beduin_shared.common.component.adapter.b$a
            androidx.recyclerview.widget.RecyclerView$n r1 = new androidx.recyclerview.widget.RecyclerView$n
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            ej.e r5 = r0.i(r5, r1)
            com.avito.android.beduin_shared.model.utils.i.a(r5, r0)
            r6.<init>(r5)
            return r6
        L41:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Collection contains no element matching the predicate."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin_shared.common.component.adapter.e.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$C");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.C c12) {
        b.a aVar = (b.a) c12;
        Object objK = C42745f0.K(aVar.getAdapterPosition(), this.f105278g);
        g gVar = objK instanceof g ? (g) objK : null;
        if (gVar != null) {
            gVar.e(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.C c12) {
        b.a aVar = (b.a) c12;
        Object objK = C42745f0.K(aVar.getAdapterPosition(), this.f105278g);
        g gVar = objK instanceof g ? (g) objK : null;
        if (gVar != null) {
            gVar.c(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.C c12) {
        b.a aVar = (b.a) c12;
        Object objK = C42745f0.K(aVar.getAdapterPosition(), this.f105278g);
        g gVar = objK instanceof g ? (g) objK : null;
        if (gVar != null) {
            gVar.d(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12, List list) {
        b.a aVar = (b.a) c12;
        if (list.isEmpty()) {
            AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a = this.f105278g.get(i12);
            l(abstractC40112a);
            abstractC40112a.m(aVar.f105272b);
        } else {
            AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a2 = this.f105278g.get(i12);
            l(abstractC40112a2);
            abstractC40112a2.n(aVar.f105272b, list);
        }
    }
}
