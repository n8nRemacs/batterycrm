package defpackage;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class to8 {
    public static final int a(eg0 eg0Var) {
        int iOrdinal = eg0Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final LinkedHashSet b(byte[] bArr) throws IOException {
        ObjectInputStream objectInputStream;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                int i = objectInputStream.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    linkedHashSet.add(new au3(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                }
                objectInputStream.close();
                byteArrayInputStream.close();
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static Object c(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap d(imb... imbVarArr) {
        HashMap map = new HashMap(i(imbVarArr.length));
        m(map, imbVarArr);
        return map;
    }

    public static final eg0 e(int i) {
        if (i == 0) {
            return eg0.a;
        }
        if (i == 1) {
            return eg0.b;
        }
        throw new IllegalArgumentException(wy1.e(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int f(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(wy1.e(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final ujb g(int i) {
        if (i == 0) {
            return ujb.a;
        }
        if (i == 1) {
            return ujb.b;
        }
        throw new IllegalArgumentException(wy1.e(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final w4i h(int i) {
        if (i == 0) {
            return w4i.a;
        }
        if (i == 1) {
            return w4i.b;
        }
        if (i == 2) {
            return w4i.c;
        }
        if (i == 3) {
            return w4i.d;
        }
        if (i == 4) {
            return w4i.o;
        }
        if (i == 5) {
            return w4i.X;
        }
        throw new IllegalArgumentException(wy1.e(i, "Could not convert ", " to State"));
    }

    public static int i(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map j(imb... imbVarArr) {
        if (imbVarArr.length <= 0) {
            return id5.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i(imbVarArr.length));
        m(linkedHashMap, imbVarArr);
        return linkedHashMap;
    }

    public static final int k(int i) {
        int iV = az1.v(i);
        if (iV == 0) {
            return 0;
        }
        int i2 = 1;
        if (iV != 1) {
            i2 = 2;
            if (iV != 2) {
                i2 = 3;
                if (iV != 3) {
                    i2 = 4;
                    if (iV != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + vb9.o(i) + " to int");
                    }
                }
            }
        }
        return i2;
    }

    public static final int l(ujb ujbVar) {
        int iOrdinal = ujbVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void m(AbstractMap abstractMap, imb[] imbVarArr) {
        for (imb imbVar : imbVarArr) {
            abstractMap.put(imbVar.a, imbVar.b);
        }
    }

    public static void n(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            imb imbVar = (imb) it.next();
            map.put(imbVar.a, imbVar.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(xl7 xl7Var, String str, int i, int i2, boolean z) {
        if (xl7Var.b.equals(str)) {
            ArrayList arrayList = xl7Var.a;
            if (((yw0) ((ex0) arrayList.get(i)).get(i2)).Z == z) {
                return;
            }
            yw0 yw0Var = (yw0) ((ex0) arrayList.get(i)).get(i2);
            vw0 vw0Var = new vw0(yw0Var.a, yw0Var.b, yw0Var.c);
            vw0Var.d = yw0Var.d;
            vw0Var.e = yw0Var.o;
            vw0Var.h = yw0Var.Y;
            vw0Var.f = yw0Var.X;
            vw0Var.g = z;
            ((ex0) arrayList.get(i)).set(i2, new yw0(vw0Var));
        }
    }

    public static final byte[] p(Set set) throws IOException {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    au3 au3Var = (au3) it.next();
                    objectOutputStream.writeUTF(au3Var.a.toString());
                    objectOutputStream.writeBoolean(au3Var.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } finally {
        }
    }

    public static final int q(w4i w4iVar) {
        int iOrdinal = w4iVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i;
    }

    public static Map r(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return id5.a;
        }
        if (size == 1) {
            imb imbVar = (imb) arrayList.get(0);
            return Collections.singletonMap(imbVar.a, imbVar.b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i(arrayList.size()));
        n(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static Map s(Map map) {
        int size = map.size();
        if (size == 0) {
            return id5.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static void t(x10 x10Var, String str, gu3 gu3Var) {
        for (int i = 0; i < x10Var.b(); i++) {
            w10 w10VarD = x10Var.d(i);
            String str2 = w10VarD.r;
            o10 o10Var = w10VarD.g;
            if (ssi.b(str, str2)) {
                x00 x00VarI = w10VarD.i();
                gu3Var.accept(x00VarI);
                x10Var.e(i, x00VarI.a());
                return;
            }
            if (w10VarD.g()) {
                w10 w10Var = o10Var.g;
                w10 w10Var2 = o10Var.g;
                if (w10Var != null && ssi.b(str, w10Var.r)) {
                    x00 x00VarI2 = w10Var2.i();
                    gu3Var.accept(x00VarI2);
                    o10 o10Var2 = new o10();
                    o10Var2.a = o10Var.a;
                    o10Var2.b = o10Var.b;
                    o10Var2.c = o10Var.c;
                    o10Var2.d = o10Var.d;
                    o10Var2.e = o10Var.e;
                    o10Var2.f = o10Var.f;
                    o10Var2.g = w10Var2;
                    o10Var2.h = o10Var.h;
                    o10Var2.i = o10Var.i;
                    o10Var2.g = x00VarI2.a();
                    x00 x00VarI3 = w10VarD.i();
                    x00VarI3.g = new o10(o10Var2);
                    x10Var.e(i, x00VarI3.a());
                    return;
                }
            }
        }
    }

    public static void u(x00 x00Var, p10 p10Var, long j) {
        x00Var.i = p10Var;
        if (p10Var.c()) {
            x00Var.j = j;
        }
        if (p10Var == p10.a) {
            x00Var.k = 0.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0280 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(defpackage.si9 r21, defpackage.x10 r22, defpackage.jdc r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to8.v(si9, x10, jdc, java.lang.String):void");
    }
}
