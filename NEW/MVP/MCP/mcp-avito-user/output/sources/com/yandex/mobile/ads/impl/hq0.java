package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class hq0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ae1 f386206a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final nq0 f386207b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final xq0 f386208c = new xq0();

    public hq0(@j.N Context context, @j.N ae1 ae1Var) {
        this.f386206a = ae1Var;
        this.f386207b = new nq0(context);
    }

    @j.P
    public final to1 a(@j.N ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xd1 xd1Var = (xd1) it.next();
            try {
                this.f386208c.getClass();
                arrayList2.add(xq0.a(xd1Var));
            } catch (zd1 e12) {
                this.f386206a.a(e12);
            } catch (Exception unused) {
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return j6.a(k6.a(), l6.a(ur0.a(), this.f386207b.a(), arrayList2));
    }
}
