package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class ir0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final kr0 f386670a = new kr0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final jr0 f386671b = new jr0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final hr0 f386672c = new hr0();

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final q21 f386673d = q21.b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    public final int a(@j.N View view, @j.N Rect rect) {
        v11 v11VarA = this.f386673d.a(view.getContext());
        if (v11VarA == null || !v11VarA.X()) {
            return 0;
        }
        ArrayList<View> arrayListA = this.f386670a.a(view);
        this.f386671b.getClass();
        ArrayList arrayList = new ArrayList();
        for (View view2 : arrayListA) {
            Rect rect2 = new Rect();
            if (view2.getGlobalVisibleRect(rect2)) {
                arrayList.add(rect2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Rect rect3 = (Rect) it.next();
            int i12 = rect3.left;
            int i13 = rect.left;
            rect3.left = Math.min(Math.max(i12, i13), rect.right);
            int i14 = rect3.top;
            int i15 = rect.top;
            rect3.top = Math.min(Math.max(i14, i15), rect.bottom);
            int i16 = rect3.right;
            int i17 = rect.left;
            rect3.right = Math.min(Math.max(i16, i17), rect.right);
            int i18 = rect3.bottom;
            int i19 = rect.top;
            rect3.bottom = Math.min(Math.max(i18, i19), rect.bottom);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Rect rect4 = (Rect) it2.next();
            if (rect4.width() > 0 && rect4.height() > 0) {
                arrayList2.add(rect4);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayListSubList = arrayList2;
        if (size > 100) {
            arrayListSubList = arrayList2.subList(0, 100);
        }
        this.f386672c.getClass();
        return hr0.a(rect, arrayListSubList);
    }
}
