package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C39328g2 {

    /* renamed from: com.yandex.mobile.ads.impl.g2$a */
    public static class a implements Comparator<p60> {
        private a() {
        }

        @Override // java.util.Comparator
        public final int compare(@j.N p60 p60Var, @j.N p60 p60Var2) {
            long value = p60Var.getAdBreakPosition().getValue() - p60Var2.getAdBreakPosition().getValue();
            if (value < 0) {
                return -1;
            }
            return value > 0 ? 1 : 0;
        }

        public /* synthetic */ a(int i12) {
            this();
        }
    }

    @j.N
    public static ArrayList a(@j.N List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new a(0));
        return new ArrayList(arrayList);
    }
}
