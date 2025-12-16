package com.avito.android.saved_searches.presentation.main;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: SavedSearchMainView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/e;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f258601b;

    public e(h hVar) {
        this.f258601b = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        h hVar = this.f258601b;
        float fComputeVerticalScrollOffset = hVar.f258609e.computeVerticalScrollOffset();
        float f12 = hVar.f258614j;
        float f13 = fComputeVerticalScrollOffset > f12 ? 1.0f : fComputeVerticalScrollOffset / f12;
        View view = hVar.f258613i;
        view.setAlpha(f13);
        D6.H(view);
    }
}
