package com.google.common.collect;

import aZ0.InterfaceC19845a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ObjectArrays.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.t3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37414t3 {
    @InterfaceC19845a
    public static void a(int i12, Object[] objArr) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (objArr[i13] == null) {
                throw new NullPointerException(AK.c.g(i13, "at index "));
            }
        }
    }

    @InterfaceC19845a
    public static void b(Collection collection, Object[] objArr) {
        Iterator it = collection.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            objArr[i12] = it.next();
            i12++;
        }
    }

    public static <T> T[] c(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            if (tArr.length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, size);
        }
        b(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}
