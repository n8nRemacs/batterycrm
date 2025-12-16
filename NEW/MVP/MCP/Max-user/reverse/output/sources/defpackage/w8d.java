package defpackage;

import java.util.Arrays;
import java.util.Set;

/* loaded from: classes2.dex */
public interface w8d {
    /* JADX WARN: Multi-variable type inference failed */
    static void a(sm smVar, pzf pzfVar) {
        tm tmVar = smVar.c;
        if (tmVar == null) {
            tmVar = null;
        }
        if (((Set) ((l5c) ((age) tmVar.e.getValue())).l.getValue()).contains(pzfVar.b)) {
            wqi.o(smVar.getClass().getName(), null, "detect common reaction error, call onMaxFailCount() for task", Arrays.copyOf(new Object[]{pzfVar}, 1));
            ((tsb) smVar).f();
        }
    }
}
