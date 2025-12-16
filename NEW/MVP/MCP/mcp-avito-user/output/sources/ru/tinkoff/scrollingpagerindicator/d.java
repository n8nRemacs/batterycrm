package ru.tinkoff.scrollingpagerindicator;

import androidx.recyclerview.widget.RecyclerView;
import j.N;

/* compiled from: RecyclerViewAttacher.java */
/* loaded from: classes9.dex */
class d extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScrollingPagerIndicator f437133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f437134c;

    public d(e eVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f437134c = eVar;
        this.f437133b = scrollingPagerIndicator;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @N RecyclerView recyclerView) {
        int iA2;
        if (i12 == 0) {
            e eVar = this.f437134c;
            if (eVar.a() == -1 || (iA2 = eVar.a()) == -1) {
                return;
            }
            int itemCount = eVar.f437138d.getItemCount();
            ScrollingPagerIndicator scrollingPagerIndicator = this.f437133b;
            scrollingPagerIndicator.setDotCount(itemCount);
            if (iA2 < eVar.f437138d.getItemCount()) {
                scrollingPagerIndicator.setCurrentPosition(iA2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@N RecyclerView recyclerView, int i12, int i13) {
        this.f437134c.f();
    }
}
