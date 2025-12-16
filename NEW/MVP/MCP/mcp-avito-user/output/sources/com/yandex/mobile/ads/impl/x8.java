package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class x8 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Object f391574a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final CopyOnWriteArrayList f391575b = new CopyOnWriteArrayList();

    public final void a(@j.N Context context, @j.N b9 b9Var) {
        synchronized (this.f391574a) {
            this.f391575b.add(b9Var);
            w8.a(context).b(b9Var);
        }
    }

    public final void a(@j.N Context context) {
        ArrayList arrayList;
        synchronized (this.f391574a) {
            arrayList = new ArrayList(this.f391575b);
            this.f391575b.clear();
        }
        w8 w8VarA = w8.a(context);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w8VarA.a((b9) it.next());
        }
    }
}
