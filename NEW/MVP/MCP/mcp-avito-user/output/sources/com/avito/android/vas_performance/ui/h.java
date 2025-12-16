package com.avito.android.vas_performance.ui;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import xZ.C49899a;

/* compiled from: PerformanceVasFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PerformanceVasFragment f321534b;

    public h(PerformanceVasFragment performanceVasFragment) {
        this.f321534b = performanceVasFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        RecyclerView recyclerView = this.f321534b.f321393u0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.l(new C49899a(iIntValue), -1);
    }
}
