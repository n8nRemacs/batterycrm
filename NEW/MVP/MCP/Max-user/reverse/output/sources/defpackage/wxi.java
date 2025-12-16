package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wxi {
    public static String a(t22 t22Var, Integer num, List list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) t22Var.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
            } else if (num.intValue() == 0 && ((Integer) t22Var.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            }
        }
        return null;
    }

    public static o8c b(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        zea zeaVar = null;
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            lfa lfaVar = (lfa) it.next();
            linkedHashMap.put(Integer.valueOf(i), lfaVar.a);
            for (yea yeaVar : lfaVar.b) {
                long j = yeaVar.a;
                String str = yeaVar.b;
                boolean zBooleanValue = yeaVar.c.booleanValue();
                zea zeaVar2 = new zea(j, str, i, zBooleanValue);
                arrayList.add(zeaVar2);
                if (zBooleanValue && zeaVar == null) {
                    zeaVar = zeaVar2;
                }
            }
            i = i2;
        }
        return new o8c(linkedHashMap, arrayList, zeaVar);
    }
}
