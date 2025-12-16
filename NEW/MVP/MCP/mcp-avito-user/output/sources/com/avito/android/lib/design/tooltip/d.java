package com.avito.android.lib.design.tooltip;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecyclerTooltipHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tooltip/d;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f181191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f181192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f181193d;

    public d(f fVar, k kVar, boolean z12) {
        this.f181191b = fVar;
        this.f181192c = kVar;
        this.f181193d = z12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @Y61.k RecyclerView recyclerView) {
        f fVar = this.f181191b;
        boolean zA2 = fVar.a(fVar.f181198b, recyclerView);
        boolean z12 = false;
        boolean z13 = recyclerView.getScrollState() != 0;
        if (zA2 && !z13) {
            z12 = true;
        }
        if (z12) {
            k kVar = this.f181192c;
            kVar.f(fVar.f181198b);
            boolean z14 = this.f181193d;
            if (z14) {
                e eVar = new e(fVar, kVar, z14);
                fVar.f181197a.o(eVar);
                fVar.f181204h = eVar;
            }
            d dVar = fVar.f181203g;
            if (dVar != null) {
                recyclerView.v0(dVar);
            }
            fVar.f181203g = null;
        }
    }
}
