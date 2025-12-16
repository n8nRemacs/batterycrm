package com.avito.android.lib.design.tooltip;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RecyclerTooltipHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tooltip/f;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f181197a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f181198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f181199c;

    /* renamed from: d, reason: collision with root package name */
    public final int f181200d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Integer> f181201e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Integer> f181202f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public d f181203g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public e f181204h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public N f181205i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public k f181206j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public D.b f181207k;

    public f(@Y61.k RecyclerView recyclerView, @Y61.k View view, int i12, int i13, @Y61.k Y41.a<Integer> aVar, @Y61.k Y41.a<Integer> aVar2) {
        this.f181197a = recyclerView;
        this.f181198b = view;
        this.f181199c = i12;
        this.f181200d = i13;
        this.f181201e = aVar;
        this.f181202f = aVar2;
    }

    public final boolean a(View view, RecyclerView recyclerView) {
        if (view == null) {
            return false;
        }
        int height = view.getHeight() * this.f181199c;
        return true ^ (((view.getHeight() * this.f181200d) - (recyclerView.getHeight() - (view.getTop() + this.f181201e.invoke().intValue())) > 0) || ((this.f181202f.invoke().intValue() - view.getBottom()) - height <= 0));
    }

    public final void b() {
        k kVar;
        d dVar = this.f181203g;
        RecyclerView recyclerView = this.f181197a;
        if (dVar != null) {
            recyclerView.v0(dVar);
        }
        e eVar = this.f181204h;
        if (eVar != null) {
            recyclerView.v0(eVar);
        }
        this.f181207k = null;
        this.f181205i = null;
        k kVar2 = this.f181206j;
        if (kVar2 != null && kVar2.isShowing() && (kVar = this.f181206j) != null) {
            kVar.dismiss();
        }
        this.f181206j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(@Y61.l Y41.l lVar, boolean z12) {
        k kVar = this.f181206j;
        if ((kVar == null || !kVar.isShowing()) && this.f181207k == null) {
            this.f181205i = (N) lVar;
            k kVar2 = new k(this.f181198b.getContext(), 0, 0, 6, null);
            kVar2.setOutsideTouchable(!z12);
            if (lVar != 0) {
                lVar.invoke(kVar2);
            }
            this.f181206j = kVar2;
            D.b bVar = new D.b(9, this, z12);
            this.f181207k = bVar;
            this.f181197a.postDelayed(bVar, 300L);
        }
    }
}
