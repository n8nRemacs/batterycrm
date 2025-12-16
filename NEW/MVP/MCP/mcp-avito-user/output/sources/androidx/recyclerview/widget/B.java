package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C23412c;
import androidx.recyclerview.widget.C23413d;
import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import java.util.List;

/* compiled from: ListAdapter.java */
/* loaded from: classes10.dex */
public abstract class B<T, VH extends RecyclerView.C> extends RecyclerView.Adapter<VH> {

    /* renamed from: c, reason: collision with root package name */
    public final C23413d<T> f53650c;

    /* renamed from: d, reason: collision with root package name */
    public final C23413d.b<T> f53651d;

    /* compiled from: ListAdapter.java */
    public class a implements C23413d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.C23413d.b
        public final void a(@j.N List<T> list, @j.N List<T> list2) {
            B.this.k(list2);
        }
    }

    public B(@j.N C23424o.f<T> fVar) {
        a aVar = new a();
        C23413d<T> c23413d = new C23413d<>(new C23411b(this), new C23412c.a(fVar).a());
        this.f53650c = c23413d;
        c23413d.f53992d.add(aVar);
    }

    public T getItem(int i12) {
        return this.f53650c.f53994f.get(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f53650c.f53994f.size();
    }

    @j.N
    public List<T> j() {
        return this.f53650c.f53994f;
    }

    public void l(@j.P List<T> list, @j.P Runnable runnable) {
        this.f53650c.b(list, runnable);
    }

    public void m(@j.P List<T> list) {
        this.f53650c.b(list, null);
    }

    public void k(@j.N List list) {
    }
}
