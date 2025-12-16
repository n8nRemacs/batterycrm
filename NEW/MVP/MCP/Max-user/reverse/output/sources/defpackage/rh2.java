package defpackage;

import java.util.HashSet;
import java.util.List;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class rh2 extends sm implements j1g {
    public final /* synthetic */ int d;
    public final List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh2(int i, long j, List list) {
        super(j);
        this.d = i;
        this.o = list;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        switch (this.d) {
            case 0:
                sh2 sh2Var = (sh2) l0gVar;
                try {
                    o().m(sh2Var);
                } catch (TamErrorException unused) {
                    String name = rh2.class.getName();
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.Y;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, name, "fail to get missed contacts for CHAT_INFO", null);
                        }
                    }
                }
                l().m0(sh2Var.c);
                tw0 tw0VarK = k();
                long j = this.a;
                List list = this.o;
                th2 th2Var = new th2(j);
                new HashSet(list);
                tw0VarK.c(th2Var);
                break;
            default:
                xje xjeVar = (xje) l0gVar;
                tm tmVar = this.c;
                if (tmVar == null) {
                    tmVar = null;
                }
                fxa fxaVar = (fxa) tmVar.g.getValue();
                fxaVar.a().d.i("auth.token", xjeVar.c);
                k().c(new yje(this.a));
                break;
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        switch (this.d) {
            case 0:
                k().c(new rj0(this.a, pzfVar));
                break;
            default:
                k().c(new rj0(this.a, pzfVar));
                break;
        }
    }

    @Override // defpackage.sm
    public final n2 i() {
        switch (this.d) {
            case 0:
                return new fh2(this.o);
            default:
                zf8 zf8Var = new zf8((xhb) null, 23);
                List list = this.o;
                if (list != null && !list.isEmpty()) {
                    zf8Var.o("pushTokens", list);
                }
                return zf8Var;
        }
    }
}
