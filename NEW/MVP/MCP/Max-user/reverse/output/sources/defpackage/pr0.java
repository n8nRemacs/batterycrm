package defpackage;

import com.google.android.material.chip.Chip;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class pr0 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pr0(oh6 oh6Var, ghb ghbVar, long j) {
        this.a = 2;
        this.c = oh6Var;
        this.d = ghbVar;
        this.b = j;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        qqg qqgVar = qqg.a;
        Object obj = this.d;
        long j = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                String str = (String) obj;
                ve2 ve2VarI = ((w63) obj2).i();
                ve2VarI.getClass();
                wqi.c("ve2", "changeChatIcon, chatId = " + j + ", path = " + str, new Object[0]);
                ve2VarI.n(j, bf2.b);
                ve2VarI.r(j, false, new g6(4, str));
                ve2VarI.n.c(new n73(Collections.singletonList(Long.valueOf(j)), false));
                break;
            case 2:
                ghb ghbVar = (ghb) obj;
                Iterator it = ((oh6) obj2).b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).t(ghbVar, j);
                }
                break;
            default:
                a2b a2bVar = (a2b) obj2;
                Chip chip = (Chip) obj;
                y1b y1bVar = a2bVar.y0;
                if (y1bVar != null) {
                    ((i5i) y1bVar).n(j);
                }
                a2bVar.removeView(chip);
                break;
        }
        return qqgVar;
    }

    public /* synthetic */ pr0(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }
}
