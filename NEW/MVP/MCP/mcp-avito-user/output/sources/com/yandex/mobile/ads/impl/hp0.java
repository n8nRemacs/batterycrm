package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zg;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes8.dex */
final class hp0 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f386201a;

        /* renamed from: b, reason: collision with root package name */
        private final ok1 f386202b;

        public /* synthetic */ a(String str, ok1 ok1Var, int i12) {
            this(str, ok1Var);
        }

        private a(String str, ok1 ok1Var) {
            this.f386201a = str;
            this.f386202b = ok1Var;
        }
    }

    public static zo0 a(qy0<?> qy0Var, long j12, List<dz> list) {
        zg.a aVarD = qy0Var.d();
        if (aVarD == null) {
            return new zo0(304, (byte[]) null, true, j12, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<dz> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<dz> list2 = aVarD.f392261h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (dz dzVar : aVarD.f392261h) {
                    if (!treeSet.contains(dzVar.a())) {
                        arrayList.add(dzVar);
                    }
                }
            }
        } else if (!aVarD.f392260g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVarD.f392260g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new dz(entry.getKey(), entry.getValue()));
                }
            }
        }
        return new zo0(304, aVarD.f392254a, true, j12, (List<dz>) arrayList);
    }

    public static byte[] a(InputStream inputStream, int i12, vg vgVar) throws Throwable {
        byte[] bArrA;
        au0 au0Var = new au0(vgVar, i12);
        try {
            bArrA = vgVar.a(1024);
            while (true) {
                try {
                    int i13 = inputStream.read(bArrA);
                    if (i13 == -1) {
                        break;
                    }
                    au0Var.write(bArrA, 0, i13);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z12 = pk1.f388875a;
                    }
                    vgVar.a(bArrA);
                    au0Var.close();
                    throw th;
                }
            }
            byte[] byteArray = au0Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z13 = pk1.f388875a;
            }
            vgVar.a(bArrA);
            au0Var.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }
}
