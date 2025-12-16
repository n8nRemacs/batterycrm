package com.android.volley.toolbox;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: NetworkUtility.java */
/* loaded from: classes10.dex */
final class D {

    /* compiled from: NetworkUtility.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f67107a;

        /* renamed from: b, reason: collision with root package name */
        public final VolleyError f67108b;

        public b(String str, VolleyError volleyError, a aVar) {
            this.f67107a = str;
            this.f67108b = volleyError;
        }
    }

    public static com.android.volley.r a(Request request, List list) {
        j.a aVar = request.f67037n;
        if (aVar == null) {
            return new com.android.volley.r(304, null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((com.android.volley.o) it.next()).f67092a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.android.volley.o> list2 = aVar.f67073h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.android.volley.o oVar : aVar.f67073h) {
                    if (!treeSet.contains(oVar.f67092a)) {
                        arrayList.add(oVar);
                    }
                }
            }
        } else if (!aVar.f67072g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f67072g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.android.volley.o(entry.getKey(), entry.getValue()));
                }
            }
        }
        return new com.android.volley.r(304, aVar.f67066a, true, arrayList);
    }

    public static byte[] b(InputStream inputStream, int i12, C27628h c27628h) throws Throwable {
        byte[] bArrA;
        G g12 = new G(c27628h, i12);
        try {
            bArrA = c27628h.a(1024);
            while (true) {
                try {
                    int i13 = inputStream.read(bArrA);
                    if (i13 == -1) {
                        break;
                    }
                    g12.write(bArrA, 0, i13);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        com.android.volley.z.b("Error occurred when closing InputStream", new Object[0]);
                    }
                    c27628h.b(bArrA);
                    g12.close();
                    throw th;
                }
            }
            byte[] byteArray = g12.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                com.android.volley.z.b("Error occurred when closing InputStream", new Object[0]);
            }
            c27628h.b(bArrA);
            g12.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }
}
