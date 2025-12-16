package com.my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes7.dex */
public final class m0 {
    public static void a(int i12, Map<String, String> map, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        if (map == null || map.isEmpty()) {
            return;
        }
        Iterator it = new TreeSet(map.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            byteArrayOutputStream.reset();
            for (int i13 : b1.f365551x) {
                if (i13 == 1) {
                    c1.a(1, str, byteArrayOutputStream);
                } else if (i13 == 2) {
                    c1.a(2, map.get(str), byteArrayOutputStream);
                }
            }
            if (byteArrayOutputStream.size() > 0) {
                c1.a(i12, byteArrayOutputStream, outputStream);
            }
        }
    }
}
