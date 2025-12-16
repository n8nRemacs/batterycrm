package defpackage;

import java.util.LinkedHashSet;
import java.util.function.UnaryOperator;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class lk2 implements UnaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ lk2(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                jk2 jk2Var = (jk2) obj;
                if (jk2Var != null) {
                    return new jk2(jk2Var.a, jk2Var.b, jk2Var.c, jk2Var.d, true);
                }
                return null;
            case 2:
                return new LinkedHashSet();
            case 3:
                return new LinkedHashSet();
            case 4:
                return dk8.a();
            case 5:
                return new LinkedHashSet();
            case 6:
                return dk8.a();
            case 7:
                ((rt7) ((ok3) obj)).D();
                return eoi.a();
            case 8:
                yy7[] yy7VarArr = ay9.r;
                return null;
            case 9:
                return null;
            case 10:
                return String.valueOf(System.currentTimeMillis());
            case 11:
                return rd5.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new rhf((String) null, 3);
            default:
                zhe zheVar = (zhe) obj;
                if (zheVar != null) {
                    zheVar.f(true);
                }
                return null;
        }
    }
}
