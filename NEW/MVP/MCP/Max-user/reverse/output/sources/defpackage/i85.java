package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i85 implements ju3 {
    public final /* synthetic */ int a;
    public Object b;

    @Override // defpackage.ju3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((ju3) this.b).accept(obj);
                return;
            case 1:
                fe6 fe6Var = (fe6) obj;
                if (fe6Var == null) {
                    fe6Var = new fe6(-3);
                }
                ((s7c) this.b).A(fe6Var);
                return;
            default:
                fe6 fe6Var2 = (fe6) obj;
                synchronized (ge6.c) {
                    try {
                        z0f z0fVar = ge6.d;
                        ArrayList arrayList = (ArrayList) z0fVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        z0fVar.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((ju3) arrayList.get(i)).accept(fe6Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ i85(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
