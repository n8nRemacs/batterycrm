package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wmf extends ee4 {
    public static String d(String str) throws IOException {
        int length;
        List listO = lee.o(vmf.I(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (!vmf.F((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!ozi.c(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) ue3.R(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listO.size();
        int i = ve3.i(listO);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listO.iterator();
        while (true) {
            if (!it2.hasNext()) {
                StringBuilder sb = new StringBuilder(length3);
                ue3.M(arrayList3, sb, null, 124);
                return sb.toString();
            }
            Object next = it2.next();
            int i2 = length + 1;
            if (length < 0) {
                ve3.p();
                throw null;
            }
            String str3 = (String) next;
            String strU = ((length == 0 || length == i) && vmf.F(str3)) ? null : vmf.u(iIntValue, str3);
            if (strU != null) {
                arrayList3.add(strU);
            }
            length = i2;
        }
    }

    public static String e(String str) throws IOException {
        if (vmf.F("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listO = lee.o(vmf.I(str));
        int length = str.length();
        listO.size();
        int i = ve3.i(listO);
        ArrayList arrayList = new ArrayList();
        Iterator it = listO.iterator();
        int i2 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                ue3.M(arrayList, sb, null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                ve3.p();
                throw null;
            }
            String str2 = (String) next;
            if ((i2 != 0 && i2 != i) || !vmf.F(str2)) {
                int length2 = str2.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!ozi.c(str2.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && str2.startsWith("|", i4)) {
                    strSubstring = str2.substring("|".length() + i4);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i2 = i3;
        }
    }
}
