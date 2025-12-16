package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class kr0 {
    @j.N
    private static ArrayList b(@j.N View view) {
        ArrayList arrayList = new ArrayList();
        if (!rj1.d(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (rj1.e(viewGroup)) {
                    arrayList.add(viewGroup);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                        arrayList2.addAll(b(viewGroup.getChildAt(i12)));
                    }
                    arrayList.addAll(arrayList2);
                }
            } else {
                arrayList.add(view);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @j.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@j.N android.view.View r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = com.yandex.mobile.ads.impl.rj1.f389556b
            android.view.ViewParent r1 = r6.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L13
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = r6
            goto L18
        L13:
            r1 = r6
        L14:
            r2 = 0
        L15:
            r4 = r2
            r2 = r1
            r1 = r4
        L18:
            if (r1 == 0) goto L3d
            int r2 = r1.indexOfChild(r2)
        L1e:
            int r2 = r2 + 1
            int r3 = r1.getChildCount()
            if (r2 >= r3) goto L32
            android.view.View r3 = r1.getChildAt(r2)
            java.util.ArrayList r3 = b(r3)
            r0.addAll(r3)
            goto L1e
        L32:
            android.view.ViewParent r2 = r1.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L14
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L15
        L3d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            float r6 = r6.getZ()
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            float r3 = r2.getZ()
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 > 0) goto L4a
            r1.add(r2)
            goto L4a
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kr0.a(android.view.View):java.util.ArrayList");
    }
}
