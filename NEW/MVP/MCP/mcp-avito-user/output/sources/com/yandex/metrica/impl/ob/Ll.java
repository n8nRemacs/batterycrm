package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import j.InterfaceC42148d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class Ll<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private T f378852a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f378853b;

    /* renamed from: c, reason: collision with root package name */
    private final List<E1<T>> f378854c = new ArrayList();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E1 f378855a;

        public a(E1 e12) {
            this.f378855a = e12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (Ll.this) {
                try {
                    Object obj = Ll.this.f378852a;
                    if (obj == null) {
                        Ll.this.f378854c.add(this.f378855a);
                    } else {
                        this.f378855a.b(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @InterfaceC42148d
    public Ll(@j.N ICommonExecutor iCommonExecutor) {
        this.f378853b = iCommonExecutor;
    }

    @InterfaceC42148d
    public void a(@j.N E1<T> e12) {
        this.f378853b.execute(new a(e12));
    }

    @j.l0
    public synchronized void a(@j.N T t12) {
        try {
            this.f378852a = t12;
            Iterator<E1<T>> it = this.f378854c.iterator();
            while (it.hasNext()) {
                it.next().b(t12);
            }
            this.f378854c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
