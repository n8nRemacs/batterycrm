package ru.tinkoff.scrollingpagerindicator;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RecyclerViewAttacher.java */
/* loaded from: classes9.dex */
class c extends RecyclerView.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollingPagerIndicator f437131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f437132b;

    public c(e eVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f437132b = eVar;
        this.f437131a = scrollingPagerIndicator;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void a() {
        e eVar = this.f437132b;
        this.f437131a.setDotCount(eVar.f437138d.getItemCount());
        eVar.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void b(int i12, int i13) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void c(int i12, int i13, Object obj) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void d(int i12, int i13) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void e(int i12, int i13) {
        a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void f(int i12, int i13) {
        a();
    }
}
