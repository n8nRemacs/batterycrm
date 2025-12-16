package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class r2e extends i3 {
    public long c;
    public long[] d;
    public long[] o;

    public static Serializable L0(int i, qyg qygVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(qygVar.m()));
        }
        if (i == 1) {
            return Boolean.valueOf(qygVar.s() == 1);
        }
        if (i == 2) {
            return N0(qygVar);
        }
        if (i != 3) {
            if (i == 8) {
                return M0(qygVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(qygVar.m()));
                qygVar.F(2);
                return date;
            }
            int iV = qygVar.v();
            ArrayList arrayList = new ArrayList(iV);
            for (int i2 = 0; i2 < iV; i2++) {
                Serializable serializableL0 = L0(qygVar.s(), qygVar);
                if (serializableL0 != null) {
                    arrayList.add(serializableL0);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strN0 = N0(qygVar);
            int iS = qygVar.s();
            if (iS == 9) {
                return map;
            }
            Serializable serializableL02 = L0(iS, qygVar);
            if (serializableL02 != null) {
                map.put(strN0, serializableL02);
            }
        }
    }

    public static HashMap M0(qyg qygVar) {
        int iV = qygVar.v();
        HashMap map = new HashMap(iV);
        for (int i = 0; i < iV; i++) {
            String strN0 = N0(qygVar);
            Serializable serializableL0 = L0(qygVar.s(), qygVar);
            if (serializableL0 != null) {
                map.put(strN0, serializableL0);
            }
        }
        return map;
    }

    public static String N0(qyg qygVar) {
        int iX = qygVar.x();
        int i = qygVar.b;
        qygVar.F(iX);
        return new String(qygVar.a, i, iX);
    }
}
