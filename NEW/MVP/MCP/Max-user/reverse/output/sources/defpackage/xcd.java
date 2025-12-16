package defpackage;

import java.util.Locale;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public abstract class xcd {
    public static final /* synthetic */ int a = 0;

    public static pcd a(scd scdVar, long j) {
        pcd pcdVar = new pcd();
        hdd hddVar = scdVar.a;
        pcdVar.b = hddVar;
        pcdVar.d = scdVar.b;
        pcdVar.c = j;
        int iOrdinal = hddVar.ordinal();
        if (iOrdinal == 1) {
            kce kceVar = new kce(17);
            kceVar.b = ((wb5) scdVar).c;
            pcdVar.f = kceVar;
            return pcdVar;
        }
        if (iOrdinal == 2) {
            n7 n7Var = new n7();
            n7Var.a = ((pff) scdVar).c;
            pcdVar.e = n7Var;
            return pcdVar;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return pcdVar;
            }
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + scdVar.a);
        }
        k10 k10Var = ((gu6) scdVar).c;
        byte[] byteArray = fl9.toByteArray(a.o(k10Var));
        v32 v32Var = new v32(9, false);
        v32Var.c = byteArray;
        v32Var.b = k10Var.Z;
        pcdVar.g = v32Var;
        return pcdVar;
    }
}
