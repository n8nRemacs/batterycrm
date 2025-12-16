package com.huawei.agconnect.core.a;

import android.content.Context;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f363163a;

    public static class b implements Serializable, Comparator<Map.Entry<String, Integer>> {
        public b() {
        }

        @Override // java.util.Comparator
        public final int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry.getValue().intValue() - entry2.getValue().intValue();
        }
    }

    public f(Context context) {
        this.f363163a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a() throws android.content.pm.PackageManager.NameNotFoundException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.core.a.f.a():java.util.ArrayList");
    }
}
