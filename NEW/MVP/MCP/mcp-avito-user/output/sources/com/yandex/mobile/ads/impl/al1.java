package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qy0;
import com.yandex.mobile.ads.impl.zg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes8.dex */
final class al1 implements qy0.b {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f383592a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final sz0 f383593b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final eh f383594c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final BlockingQueue<qy0<?>> f383595d;

    public al1(@j.N eh ehVar, @j.N PriorityBlockingQueue priorityBlockingQueue, sz0 sz0Var) {
        this.f383593b = sz0Var;
        this.f383594c = ehVar;
        this.f383595d = priorityBlockingQueue;
    }

    public final void a(qy0<?> qy0Var, kz0<?> kz0Var) {
        List list;
        zg.a aVar = kz0Var.f387335b;
        if (aVar != null) {
            if (aVar.f392258e >= System.currentTimeMillis()) {
                String strE = qy0Var.e();
                synchronized (this) {
                    list = (List) this.f383592a.remove(strE);
                }
                if (list != null) {
                    if (pk1.f388875a) {
                        list.size();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((gt) this.f383593b).a((qy0) it.next(), kz0Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(qy0Var);
    }

    public final synchronized void b(qy0<?> qy0Var) {
        BlockingQueue<qy0<?>> blockingQueue;
        try {
            String strE = qy0Var.e();
            List list = (List) this.f383592a.remove(strE);
            if (list != null && !list.isEmpty()) {
                if (pk1.f388875a) {
                    list.size();
                }
                qy0<?> qy0Var2 = (qy0) list.remove(0);
                this.f383592a.put(strE, list);
                qy0Var2.a((qy0.b) this);
                if (this.f383594c != null && (blockingQueue = this.f383595d) != null) {
                    try {
                        blockingQueue.put(qy0Var2);
                    } catch (InterruptedException unused) {
                        boolean z12 = pk1.f388875a;
                        Thread.currentThread().interrupt();
                        this.f383594c.b();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean a(qy0<?> qy0Var) {
        try {
            String strE = qy0Var.e();
            if (this.f383592a.containsKey(strE)) {
                List arrayList = (List) this.f383592a.get(strE);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                qy0Var.a("waiting-for-response");
                arrayList.add(qy0Var);
                this.f383592a.put(strE, arrayList);
                boolean z12 = pk1.f388875a;
                return true;
            }
            this.f383592a.put(strE, null);
            qy0Var.a((qy0.b) this);
            boolean z13 = pk1.f388875a;
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
