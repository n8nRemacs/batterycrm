package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class us7 extends at7 {
    public final qk X;
    public final qif Y;

    public us7(qk qkVar, qif qifVar) {
        super(3, 0);
        this.X = qkVar;
        this.Y = qifVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at7
    public final void a(RecyclerView recyclerView, mid midVar) {
        super.a(recyclerView, midVar);
        if (midVar instanceof s35) {
            ((zff) ((s35) midVar)).a.animate().translationZ(0.0f);
            this.Y.invoke(midVar);
        }
    }

    @Override // defpackage.at7
    public final boolean i(mid midVar, mid midVar2) {
        this.X.invoke(Integer.valueOf(midVar.f()), Integer.valueOf(midVar2.f()));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.at7
    public final void j(mid midVar, int i) {
        if (i == 0 || !(midVar instanceof s35)) {
            return;
        }
        ((zff) ((s35) midVar)).a.animate().translationZ(vw4.d().getDisplayMetrics().density * 20.0f);
    }
}
