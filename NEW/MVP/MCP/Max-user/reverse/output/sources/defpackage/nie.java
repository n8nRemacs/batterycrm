package defpackage;

import java.util.function.Predicate;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes3.dex */
public final /* synthetic */ class nie implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ nie(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((qie) obj) == qie.b;
            case 1:
                return ((qie) obj) == qie.b;
            case 2:
                qie qieVar = (qie) obj;
                return qieVar == qie.c || qieVar == qie.d;
            case 3:
                return true;
            case 4:
                return az1.c(((or3) obj).c, 1);
            case 5:
                return ((rn5) obj) instanceof u0f;
            case 6:
                return ((rn5) obj) instanceof e72;
            case 7:
                return ((rn5) obj) instanceof urf;
            case 8:
                return !(((rn5) obj) instanceof org);
            case 9:
                return !bbg.A.contains((obg) obj);
            case 10:
                return ((rn5) obj) instanceof xfe;
            case 11:
                rn5 rn5Var = (rn5) obj;
                return (rn5Var instanceof g7c) || (rn5Var instanceof iz7);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((rn5) obj) instanceof urf;
            case 13:
                rn5 rn5Var2 = (rn5) obj;
                return ((rn5Var2 instanceof urf) || (rn5Var2 instanceof g7c) || (rn5Var2 instanceof iz7)) ? false : true;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((rn5) obj) instanceof iz7;
            default:
                return !((iz7) ((rn5) obj)).b.isEmpty();
        }
    }
}
