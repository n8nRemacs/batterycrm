package com.avito.android.vas_performance.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import xZ.C49899a;

/* compiled from: PerformanceVasFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PerformanceVasFragment f321535b;

    public i(PerformanceVasFragment performanceVasFragment) {
        this.f321535b = performanceVasFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PerformanceVasFragment performanceVasFragment = this.f321535b;
        RecyclerView recyclerView = performanceVasFragment.f321393u0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        Button button = performanceVasFragment.f321394v0;
        recyclerView.l(new C49899a((button != null ? button : null).getHeight()), -1);
    }
}
