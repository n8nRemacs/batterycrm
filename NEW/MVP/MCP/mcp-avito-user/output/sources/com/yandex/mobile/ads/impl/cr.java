package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.div.core.view2.C38029k;
import java.util.ArrayList;
import java.util.Iterator;
import u21.InterfaceC48776c;

/* loaded from: classes8.dex */
public final class cr implements InterfaceC48776c {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f384394b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private static volatile cr f384395c;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ArrayList f384396a = new ArrayList();

    private cr() {
    }

    @j.N
    public static cr a() {
        if (f384395c == null) {
            synchronized (f384394b) {
                try {
                    if (f384395c == null) {
                        f384395c = new cr();
                    }
                } finally {
                }
            }
        }
        return f384395c;
    }

    public final void b(@j.N il0 il0Var) {
        synchronized (f384394b) {
            this.f384396a.remove(il0Var);
        }
    }

    @Override // u21.InterfaceC48776c
    public final void bindView(@j.N C38029k c38029k, @j.N View view, @j.N com.yandex.div2.H h12) {
        ArrayList arrayList = new ArrayList();
        synchronized (f384394b) {
            try {
                Iterator it = this.f384396a.iterator();
                while (it.hasNext()) {
                    InterfaceC48776c interfaceC48776c = (InterfaceC48776c) it.next();
                    if (interfaceC48776c.matches(h12)) {
                        arrayList.add(interfaceC48776c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC48776c) it2.next()).bindView(c38029k, view, h12);
        }
    }

    @Override // u21.InterfaceC48776c
    public final boolean matches(@j.N com.yandex.div2.H h12) {
        ArrayList arrayList = new ArrayList();
        synchronized (f384394b) {
            arrayList.addAll(this.f384396a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((InterfaceC48776c) it.next()).matches(h12)) {
                return true;
            }
        }
        return false;
    }

    @Override // u21.InterfaceC48776c
    public final void unbindView(@j.N C38029k c38029k, @j.N View view, @j.N com.yandex.div2.H h12) {
        ArrayList arrayList = new ArrayList();
        synchronized (f384394b) {
            try {
                Iterator it = this.f384396a.iterator();
                while (it.hasNext()) {
                    InterfaceC48776c interfaceC48776c = (InterfaceC48776c) it.next();
                    if (interfaceC48776c.matches(h12)) {
                        arrayList.add(interfaceC48776c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC48776c) it2.next()).unbindView(c38029k, view, h12);
        }
    }

    public final void a(@j.N il0 il0Var) {
        synchronized (f384394b) {
            this.f384396a.add(il0Var);
        }
    }

    @Override // u21.InterfaceC48776c
    public /* bridge */ /* synthetic */ void preprocess(@Y61.k com.yandex.div2.H h12, @Y61.k com.yandex.div.json.expressions.e eVar) {
    }

    @Override // u21.InterfaceC48776c
    public /* bridge */ /* synthetic */ void beforeBindView(@Y61.k C38029k c38029k, @Y61.k View view, @Y61.k com.yandex.div2.H h12) {
    }
}
