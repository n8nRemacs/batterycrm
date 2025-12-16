package com.my.target;

import android.content.Context;
import com.my.target.AbstractC37822y0;
import com.my.target.mediation.c;
import e11.C39901r0;
import e11.W1;
import e11.m2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class W0 implements Runnable, c.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final W1 f364627b = new W1(10000);

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final ArrayList f364628c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final Map<String, String> f364629d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public volatile androidx.work.N f364630e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f364631f;

    public interface a {
    }

    public W0(@j.N String str, @j.N ArrayList arrayList, @j.N Context context, @j.N androidx.work.N n12) {
        this.f364628c = arrayList;
        this.f364630e = n12;
        this.f364631f = arrayList.size();
        this.f364629d = this.f364631f == 0 ? Collections.emptyMap() : new HashMap<>();
    }

    public final void a() {
        synchronized (this) {
            try {
                androidx.work.N n12 = this.f364630e;
                if (n12 == null) {
                    return;
                }
                this.f364630e = null;
                Map<String, String> map = this.f364629d;
                AbstractC37822y0.a aVar = (AbstractC37822y0.a) n12.f55391c;
                aVar.getClass();
                m2.a(new com.my.tracker.obfuscated.I(aVar, n12.f55390b, (C39901r0) n12.f55392d, map, (Context) n12.f55393e, (e11.A0) n12.f55394f));
                this.f364627b.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f364628c.iterator();
        while (it.hasNext()) {
            ((com.my.target.mediation.c) it.next()).b();
        }
        a();
    }
}
