package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class ws7 {
    public rhd a;
    public phd b;

    public final void a(RecyclerView recyclerView) {
        b(recyclerView);
        phd adapter = recyclerView.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("require not null adapter");
        }
        this.b = adapter;
        rhd rhdVarC = c(recyclerView, adapter);
        this.a = rhdVarC;
        adapter.z(rhdVarC);
    }

    public final void b(RecyclerView recyclerView) {
        phd phdVar = this.b;
        if (phdVar == null && this.a == null) {
            return;
        }
        if (phdVar != null && recyclerView.getAdapter() != this.b) {
            wqi.p(getClass().getName(), "adapter was changed! cached adapter = " + this.b + ", recyclerView.adapter = " + recyclerView.getAdapter(), new IllegalStateException("adapter was changed"));
        }
        phd phdVar2 = this.b;
        rhd rhdVar = this.a;
        if (phdVar2 != null && rhdVar != null) {
            phdVar2.B(rhdVar);
        }
        this.b = null;
        this.a = null;
    }

    public abstract rhd c(RecyclerView recyclerView, phd phdVar);
}
