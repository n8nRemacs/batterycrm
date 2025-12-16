package com.avito.android.beduin.common.component.adapter;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.adapter.BeduinHorizontalIndent;
import com.avito.android.util.y6;
import dj.InterfaceC39736a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/adapter/a;", "Lbj/a;", "Lcom/avito/android/beduin/common/component/adapter/a$a;", "Lcom/avito/android/beduin/common/component/adapter/j;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class a extends AbstractC25658a<C3019a> implements j {

    /* renamed from: g, reason: collision with root package name */
    @l
    public InterfaceC39736a f100611g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Integer f100612h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public AbstractC40112a<BeduinModel, InterfaceC40116e> f100613i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public BeduinHorizontalIndent f100614j;

    /* compiled from: BeduinAdapter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/adapter/a$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.adapter.a$a, reason: collision with other inner class name */
    public static final class C3019a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC40116e f100615b;

        public C3019a(@k InterfaceC40116e interfaceC40116e) {
            super(interfaceC40116e.getRoot());
            this.f100615b = interfaceC40116e;
        }
    }

    @Inject
    public a() {
        super(e.f100616a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i12) {
        AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a = j().get(i12);
        this.f100613i = abstractC40112a;
        return n(abstractC40112a);
    }

    @Override // bj.AbstractC25658a
    public final void o(@k InterfaceC39736a interfaceC39736a) {
        this.f100611g = interfaceC39736a;
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
            ej.a<com.avito.android.beduin_models.BeduinModel, ej.e> r0 = r4.f100613i
            if (r0 == 0) goto Lf
            int r1 = r4.n(r0)
            if (r1 != r6) goto Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto Lf
            goto L2c
        Lf:
            java.util.List r0 = r4.j()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            ej.a r1 = (ej.AbstractC40112a) r1
            int r2 = r4.n(r1)
            if (r2 != r6) goto L19
            r0 = r1
        L2c:
            r4.q(r0)
            com.avito.android.beduin.common.component.adapter.a$a r6 = new com.avito.android.beduin.common.component.adapter.a$a
            androidx.recyclerview.widget.RecyclerView$n r1 = new androidx.recyclerview.widget.RecyclerView$n
            int r2 = r4.u()
            int r3 = r4.t()
            r1.<init>(r2, r3)
            ej.e r5 = r0.i(r5, r1)
            com.avito.android.beduin_shared.model.utils.i.a(r5, r0)
            r6.<init>(r5)
            return r6
        L49:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Collection contains no element matching the predicate."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.adapter.a.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$C");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.C c12) {
        C3019a c3019a = (C3019a) c12;
        Object obj = j().get(c3019a.getAdapterPosition());
        com.avito.android.beduin_shared.common.component.adapter.g gVar = obj instanceof com.avito.android.beduin_shared.common.component.adapter.g ? (com.avito.android.beduin_shared.common.component.adapter.g) obj : null;
        if (gVar != null) {
            gVar.e(c3019a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.C c12) {
        C3019a c3019a = (C3019a) c12;
        Object objK = C42745f0.K(c3019a.getAdapterPosition(), j());
        com.avito.android.beduin_shared.common.component.adapter.g gVar = objK instanceof com.avito.android.beduin_shared.common.component.adapter.g ? (com.avito.android.beduin_shared.common.component.adapter.g) objK : null;
        if (gVar != null) {
            gVar.c(c3019a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.C c12) {
        C3019a c3019a = (C3019a) c12;
        Object objK = C42745f0.K(c3019a.getAdapterPosition(), j());
        com.avito.android.beduin_shared.common.component.adapter.g gVar = objK instanceof com.avito.android.beduin_shared.common.component.adapter.g ? (com.avito.android.beduin_shared.common.component.adapter.g) objK : null;
        if (gVar != null) {
            gVar.d(c3019a);
        }
    }

    @Override // bj.AbstractC25658a
    public final void p(@l BeduinHorizontalIndent beduinHorizontalIndent) {
        this.f100614j = beduinHorizontalIndent;
    }

    public final void q(AbstractC40112a abstractC40112a) {
        BeduinHorizontalIndent beduinHorizontalIndent = this.f100614j;
        Integer numValueOf = beduinHorizontalIndent != null ? Integer.valueOf(y6.b(beduinHorizontalIndent.getLeftIndent())) : null;
        BeduinHorizontalIndent beduinHorizontalIndent2 = this.f100614j;
        Integer numValueOf2 = beduinHorizontalIndent2 != null ? Integer.valueOf(y6.b(beduinHorizontalIndent2.getRightIndent())) : null;
        Integer num = this.f100612h;
        abstractC40112a.f395324b = numValueOf != null ? numValueOf.intValue() : num != null ? num.intValue() : abstractC40112a.f395324b;
        abstractC40112a.f395325c = numValueOf2 != null ? numValueOf2.intValue() : num != null ? num.intValue() : abstractC40112a.f395325c;
        abstractC40112a.f395326d = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@k C3019a c3019a, int i12) {
        AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a = j().get(i12);
        q(abstractC40112a);
        InterfaceC39736a interfaceC39736a = this.f100611g;
        if (interfaceC39736a != null) {
            interfaceC39736a.d();
        }
        abstractC40112a.m(c3019a.f100615b);
        InterfaceC39736a interfaceC39736a2 = this.f100611g;
        if (interfaceC39736a2 != null) {
            interfaceC39736a2.a(abstractC40112a.S(), i12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@k C3019a c3019a, int i12, @k List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(c3019a, i12, list);
            return;
        }
        AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112a = j().get(i12);
        q(abstractC40112a);
        InterfaceC39736a interfaceC39736a = this.f100611g;
        if (interfaceC39736a != null) {
            interfaceC39736a.c(abstractC40112a.S(), i12);
        }
        abstractC40112a.n(c3019a.f100615b, list);
        InterfaceC39736a interfaceC39736a2 = this.f100611g;
        if (interfaceC39736a2 != null) {
            interfaceC39736a2.b(abstractC40112a.S());
        }
    }

    public int t() {
        return -2;
    }

    public int u() {
        return -1;
    }

    public a(@l Integer num) {
        this();
        this.f100612h = num;
    }
}
