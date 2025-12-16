package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes8.dex */
public final class ip0 {
    public static boolean a(int i12, int i13) {
        return (i12 == 4 || (100 <= i13 && i13 < 200) || i13 == 204 || i13 == 304) ? false : true;
    }

    @Y61.k
    public static ArrayList a(@Y61.k TreeMap treeMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add(new dz(str, (String) it.next()));
            }
        }
        return arrayList;
    }

    @Y61.k
    public static URL a(@Y61.k qy0 qy0Var, @Y61.l cc1 cc1Var) {
        String strM = qy0Var.m();
        if (cc1Var != null) {
            String strA = cc1Var.a(strM);
            if (strA == null) {
                throw new IOException(up1.a("URL blocked by rewriter: ", strM));
            }
            strM = strA;
        }
        return new URL(strM);
    }

    @Y61.l
    public static InputStream a(@Y61.k iz0 iz0Var) {
        mz0 mz0VarA = iz0Var.a();
        if (mz0VarA != null) {
            return mz0VarA.a();
        }
        return null;
    }
}
