package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ota extends k3 {
    public final /* synthetic */ int b;
    public final long c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ota(vqa vqaVar, long j, m7c m7cVar) {
        super(vqaVar);
        this.b = 2;
        this.d = m7cVar;
        this.c = j;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        switch (this.b) {
            case 0:
                yee yeeVar = new yee(vtaVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.a.a(new nta(yeeVar, this.c, ((j0e) this.d).a()));
                break;
            case 1:
                j0e j0eVar = (j0e) this.d;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                qta qtaVar = new qta(vtaVar, this.c, j0eVar.a());
                vtaVar.c(qtaVar);
                py4 py4VarC = qtaVar.d.c(new n76(0L, qtaVar), qtaVar.b, qtaVar.c);
                n42 n42Var = qtaVar.o;
                n42Var.getClass();
                ty4.d(n42Var, py4VarC);
                this.a.a(qtaVar);
                break;
            default:
                n42 n42Var2 = new n42(2);
                vtaVar.c(n42Var2);
                new hta(vtaVar, this.c, (m7c) this.d, n42Var2, this.a).a();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ota(vqa vqaVar, long j, j0e j0eVar, int i) {
        super(vqaVar);
        this.b = i;
        switch (i) {
            case 1:
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                super(vqaVar);
                this.c = j;
                this.d = j0eVar;
                break;
            default:
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                this.c = j;
                this.d = j0eVar;
                break;
        }
    }
}
