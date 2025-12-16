package com.avito.konveyor.item_visibility_tracker;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ItemVisibilityTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/konveyor/item_visibility_tracker/e;", "Landroidx/recyclerview/widget/RecyclerView$g;", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends RecyclerView.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f338558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f338559b;

    public e(d dVar, RecyclerView recyclerView) {
        this.f338558a = dVar;
        this.f338559b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void a() {
        d dVar = this.f338558a;
        if (dVar.f338538b) {
            dVar.m(this.f338559b, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void b(int i12, int i13) {
        this.f338558a.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void d(int i12, int i13) {
        this.f338558a.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void e(int i12, int i13) {
        this.f338558a.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void f(int i12, int i13) {
        this.f338558a.n();
    }
}
