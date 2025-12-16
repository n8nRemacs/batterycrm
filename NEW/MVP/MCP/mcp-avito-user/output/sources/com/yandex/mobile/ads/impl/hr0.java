package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes8.dex */
final class hr0 {
    public static int a(@j.N Rect rect, @j.N List list) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(Integer.valueOf(rect.left));
        treeSet.add(Integer.valueOf(rect.right));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect rect2 = (Rect) it.next();
            treeSet.add(Integer.valueOf(rect2.left));
            treeSet.add(Integer.valueOf(rect2.right));
        }
        ArrayList arrayList = new ArrayList(treeSet);
        TreeSet treeSet2 = new TreeSet();
        treeSet2.add(Integer.valueOf(rect.top));
        treeSet2.add(Integer.valueOf(rect.bottom));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Rect rect3 = (Rect) it2.next();
            treeSet2.add(Integer.valueOf(rect3.top));
            treeSet2.add(Integer.valueOf(rect3.bottom));
        }
        ArrayList arrayList2 = new ArrayList(treeSet2);
        rect.left = Collections.binarySearch(arrayList, Integer.valueOf(rect.left));
        rect.top = Collections.binarySearch(arrayList2, Integer.valueOf(rect.top));
        rect.right = Collections.binarySearch(arrayList, Integer.valueOf(rect.right));
        rect.bottom = Collections.binarySearch(arrayList2, Integer.valueOf(rect.bottom));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Rect rect4 = (Rect) it3.next();
            rect4.left = Collections.binarySearch(arrayList, Integer.valueOf(rect4.left));
            rect4.top = Collections.binarySearch(arrayList2, Integer.valueOf(rect4.top));
            rect4.right = Collections.binarySearch(arrayList, Integer.valueOf(rect4.right));
            rect4.bottom = Collections.binarySearch(arrayList2, Integer.valueOf(rect4.bottom));
        }
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, arrayList.size() - 1, arrayList2.size() - 1);
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Rect rect5 = (Rect) it4.next();
            for (int i12 = rect5.left; i12 < rect5.right; i12++) {
                for (int i13 = rect5.top; i13 < rect5.bottom; i13++) {
                    bArr[i12][i13] = 1;
                }
            }
        }
        int iIntValue = 0;
        for (int i14 = 0; i14 < arrayList.size() - 1; i14++) {
            for (int i15 = 0; i15 < arrayList2.size() - 1; i15++) {
                if (bArr[i14][i15] == 1) {
                    iIntValue = ((((Integer) arrayList2.get(i15 + 1)).intValue() - ((Integer) arrayList2.get(i15)).intValue()) * (((Integer) arrayList.get(i14 + 1)).intValue() - ((Integer) arrayList.get(i14)).intValue())) + iIntValue;
                }
            }
        }
        return iIntValue;
    }
}
