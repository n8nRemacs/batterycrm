package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C23427s;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: ItemTouchHelper.java */
/* renamed from: androidx.recyclerview.widget.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class RunnableC23428t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C23427s.c f54196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C23427s f54197c;

    public RunnableC23428t(C23427s c23427s, C23427s.c cVar, int i12) {
        this.f54197c = c23427s;
        this.f54196b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23427s c23427s = this.f54197c;
        RecyclerView recyclerView = c23427s.f54165s;
        if (recyclerView == null || !recyclerView.f53799t) {
            return;
        }
        C23427s.c cVar = this.f54196b;
        if (cVar.f54193k || cVar.f54187e.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        RecyclerView.j itemAnimator = c23427s.f54165s.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.l()) {
            ArrayList arrayList = c23427s.f54163q;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (((C23427s.f) arrayList.get(i12)).f54194l) {
                }
            }
            c23427s.f54160n.o();
            return;
        }
        c23427s.f54165s.post(this);
    }
}
