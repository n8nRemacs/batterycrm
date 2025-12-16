package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* renamed from: androidx.recyclerview.widget.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23411b implements C {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final RecyclerView.Adapter f53981b;

    public C23411b(@j.N RecyclerView.Adapter adapter) {
        this.f53981b = adapter;
    }

    @Override // androidx.recyclerview.widget.C
    public final void b(int i12, int i13) {
        this.f53981b.notifyItemRangeRemoved(i12, i13);
    }

    @Override // androidx.recyclerview.widget.C
    public final void c(int i12, int i13) {
        this.f53981b.notifyItemRangeInserted(i12, i13);
    }

    @Override // androidx.recyclerview.widget.C
    public final void d(int i12, int i13) {
        this.f53981b.notifyItemMoved(i12, i13);
    }

    @Override // androidx.recyclerview.widget.C
    public final void i(int i12, int i13, Object obj) {
        this.f53981b.notifyItemRangeChanged(i12, i13, obj);
    }
}
