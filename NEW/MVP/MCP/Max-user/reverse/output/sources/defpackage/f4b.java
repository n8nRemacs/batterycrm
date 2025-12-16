package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f4b {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final /* synthetic */ g4b d;

    public f4b(g4b g4bVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = g4bVar;
                m69 m69Var = g4bVar.a;
                this.b = m69Var.d;
                this.c = m69Var.c;
                break;
            default:
                this.d = g4bVar;
                m69 m69Var2 = g4bVar.a;
                this.b = m69Var2.d;
                this.c = m69Var2.c;
                break;
        }
    }

    public final void a(ArrayList arrayList) {
        switch (this.a) {
            case 0:
                ((em6) this.d.a.o).invoke(arrayList);
                break;
            default:
                ((em6) this.d.a.o).invoke(arrayList);
                break;
        }
    }
}
