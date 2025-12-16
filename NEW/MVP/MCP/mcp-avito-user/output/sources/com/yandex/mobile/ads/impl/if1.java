package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class if1<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final tg1 f386485a = new tg1();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final td1 f386486b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final gf1<T> f386487c;

    public if1(@j.N Context context, @j.N tf1<T> tf1Var) {
        this.f386486b = new td1(context);
        this.f386487c = new gf1<>(tf1Var);
    }

    @j.N
    public final ArrayList a(@j.N List list) {
        this.f386485a.getClass();
        ArrayList arrayListA = this.f386486b.a(tg1.a(list));
        int size = arrayListA.size();
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < arrayListA.size(); i12++) {
            arrayList.add(this.f386487c.a((sd1) arrayListA.get(i12), size, i12));
        }
        return arrayList;
    }
}
