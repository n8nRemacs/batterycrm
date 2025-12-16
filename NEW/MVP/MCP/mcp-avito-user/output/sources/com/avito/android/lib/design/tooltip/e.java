package com.avito.android.lib.design.tooltip;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: RecyclerTooltipHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tooltip/e;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f181194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f181195c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f181196d;

    public e(f fVar, k kVar, boolean z12) {
        this.f181194b = fVar;
        this.f181195c = kVar;
        this.f181196d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        f fVar = this.f181194b;
        boolean zA2 = fVar.a(fVar.f181198b, recyclerView);
        k kVar = this.f181195c;
        if (zA2) {
            kVar.g(-i12, -i13);
            return;
        }
        kVar.dismiss();
        d dVar = fVar.f181203g;
        RecyclerView recyclerView2 = fVar.f181197a;
        if (dVar != null) {
            recyclerView2.v0(dVar);
        }
        e eVar = fVar.f181204h;
        if (eVar != null) {
            recyclerView2.v0(eVar);
        }
        fVar.c(fVar.f181205i, this.f181196d);
    }
}
