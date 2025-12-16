package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class s2e extends i3 {
    public long c;
    public long[] d;
    public long[] o;

    public static Serializable L0(int i, umb umbVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(umbVar.r()));
        }
        if (i == 1) {
            return Boolean.valueOf(umbVar.x() == 1);
        }
        if (i == 2) {
            return N0(umbVar);
        }
        if (i != 3) {
            if (i == 8) {
                return M0(umbVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(umbVar.r()));
                umbVar.K(2);
                return date;
            }
            int iB = umbVar.B();
            ArrayList arrayList = new ArrayList(iB);
            for (int i2 = 0; i2 < iB; i2++) {
                Serializable serializableL0 = L0(umbVar.x(), umbVar);
                if (serializableL0 != null) {
                    arrayList.add(serializableL0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strN0 = N0(umbVar);
            int iX = umbVar.x();
            if (iX == 9) {
                return map;
            }
            Serializable serializableL02 = L0(iX, umbVar);
            if (serializableL02 != null) {
                map.put(strN0, serializableL02);
            }
        }
    }

    public static HashMap M0(umb umbVar) {
        int iB = umbVar.B();
        HashMap map = new HashMap(iB);
        for (int i = 0; i < iB; i++) {
            String strN0 = N0(umbVar);
            Serializable serializableL0 = L0(umbVar.x(), umbVar);
            if (serializableL0 != null) {
                map.put(strN0, serializableL0);
            }
        }
        return map;
    }

    public static String N0(umb umbVar) {
        int iD = umbVar.D();
        int i = umbVar.b;
        umbVar.K(iD);
        return new String(umbVar.a, i, iD);
    }
}
