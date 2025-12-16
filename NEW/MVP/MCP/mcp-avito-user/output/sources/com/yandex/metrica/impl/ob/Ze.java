package com.yandex.metrica.impl.ob;

import android.util.SparseArray;

/* loaded from: classes7.dex */
public class Ze {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<String> f380000a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f380000a = sparseArray;
        sparseArray.put(0, "String");
        f380000a.put(1, "Number");
        f380000a.put(2, "Counter");
    }

    public static String a(int i12) {
        return f380000a.get(i12);
    }
}
