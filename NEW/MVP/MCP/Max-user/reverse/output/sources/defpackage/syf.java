package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class syf implements w74, rl3 {
    public static boolean a(String str, String str2, ArrayList arrayList) {
        if (str2 == null) {
            String strZ = vmf.Z(31, str);
            int length = strZ.length();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (dnf.r(str3, strZ, false) && str3.length() > length && str3.charAt(length) == '=') {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
        String strZ2 = vmf.Z(31, str);
        int length2 = strZ2.length();
        String strZ3 = vmf.Z(31, str2);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str4 = (String) it2.next();
            if (dnf.r(str4, strZ2, false) && str4.length() > length2 && str4.charAt(length2) == '=') {
                it2.remove();
                if (str4.endsWith(strZ3) && str4.length() == strZ3.length() + length2 + 1) {
                    arrayList.add(str4);
                    return false;
                }
            }
        }
        arrayList.add(strZ2 + '=' + strZ3);
        while (arrayList.size() > 30) {
            arrayList.remove(0);
        }
        return true;
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        synchronized (m8j.class) {
            byte b = (byte) (((byte) 1) | 2);
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            j7j j7jVar = new j7j();
            synchronized (m8j.class) {
                try {
                    if (m8j.a == null) {
                        m8j.a = new m1j(1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new mni();
        }
        return new mni();
    }
}
