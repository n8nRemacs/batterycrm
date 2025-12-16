package com.avito.android.floating_views;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.floating_views.j;
import kotlin.Metadata;

/* compiled from: RecyclerViewScrollHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/floating_views/h;", "Landroidx/recyclerview/widget/RecyclerView$r;", "Lcom/avito/android/floating_views/j;", "_avito_floating-views_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends RecyclerView.r implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j.a f158462b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayoutManager f158463c;

    /* renamed from: d, reason: collision with root package name */
    public int f158464d = -1;

    public h(@Y61.k j.a aVar, @Y61.k LinearLayoutManager linearLayoutManager) {
        this.f158462b = aVar;
        this.f158463c = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        if (i12 == 0 && i13 == 0) {
            return;
        }
        l();
    }

    public final void l() {
        int i12 = this.f158464d;
        LinearLayoutManager linearLayoutManager = this.f158463c;
        int iK1 = linearLayoutManager.K1();
        this.f158464d = iK1;
        if (iK1 == -1 || i12 == -1) {
            return;
        }
        int iE02 = linearLayoutManager.e0();
        int iO02 = linearLayoutManager.o0();
        this.f158462b.f(this.f158464d, i12, linearLayoutManager.M1(), iE02, iO02);
    }
}
