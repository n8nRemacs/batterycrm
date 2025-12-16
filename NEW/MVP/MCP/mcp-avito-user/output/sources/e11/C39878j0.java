package e11;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.ViewOnTouchListenerC37781d0;
import java.util.ArrayList;

/* renamed from: e11.j0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39878j0 extends RecyclerView.Adapter<U0> {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final ArrayList f394619c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final com.my.target.U f394620d;

    public C39878j0(@j.N ArrayList arrayList, @j.N com.my.target.U u12) {
        this.f394619c = arrayList;
        this.f394620d = u12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f394619c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@j.N RecyclerView.C c12, int i12) {
        U0 u02 = (U0) c12;
        com.my.target.m1 m1Var = (com.my.target.m1) this.f394619c.get(i12);
        u02.f394486c = m1Var;
        m1Var.b(u02.f394485b, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @j.N
    public final RecyclerView.C onCreateViewHolder(@j.N ViewGroup viewGroup, int i12) {
        com.my.target.U u12 = this.f394620d;
        u12.getClass();
        ViewOnTouchListenerC37781d0 viewOnTouchListenerC37781d0 = new ViewOnTouchListenerC37781d0(u12.f364615c, u12.f364613a, u12.f364616d);
        viewOnTouchListenerC37781d0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new U0(viewOnTouchListenerC37781d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@j.N RecyclerView.C c12) {
        U0 u02 = (U0) c12;
        com.my.target.m1 m1Var = u02.f394486c;
        if (m1Var != null) {
            m1Var.a(u02.f394485b);
        }
        u02.f394486c = null;
        return super.onFailedToRecycleView(u02);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@j.N RecyclerView.C c12) {
        U0 u02 = (U0) c12;
        com.my.target.m1 m1Var = u02.f394486c;
        if (m1Var != null) {
            m1Var.a(u02.f394485b);
        }
        u02.f394486c = null;
        super.onViewRecycled(u02);
    }
}
