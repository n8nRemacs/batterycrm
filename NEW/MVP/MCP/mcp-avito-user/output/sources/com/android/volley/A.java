package com.android.volley;

import com.android.volley.Request;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: WaitingRequestManager.java */
/* loaded from: classes10.dex */
class A implements Request.c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f67020a;

    /* renamed from: b, reason: collision with root package name */
    public final x f67021b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final h f67022c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final l f67023d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final PriorityBlockingQueue f67024e;

    public A(@N h hVar) {
        this.f67020a = new HashMap();
        this.f67022c = hVar;
        this.f67021b = hVar.f67156g;
        this.f67023d = null;
        this.f67024e = null;
    }

    public final synchronized boolean a(Request<?> request) {
        try {
            String strH = request.h();
            if (!this.f67020a.containsKey(strH)) {
                this.f67020a.put(strH, null);
                synchronized (request.f67029f) {
                    request.f67038o = this;
                }
                if (z.f67166a) {
                    z.a("new request, sending to network %s", strH);
                }
                return false;
            }
            List arrayList = (List) this.f67020a.get(strH);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            request.a("waiting-for-response");
            arrayList.add(request);
            this.f67020a.put(strH, arrayList);
            if (z.f67166a) {
                z.a("Request for cacheKey=%s is in flight, putting on hold.", strH);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Request<?> request) {
        PriorityBlockingQueue priorityBlockingQueue;
        try {
            String strH = request.h();
            List list = (List) this.f67020a.remove(strH);
            if (list != null && !list.isEmpty()) {
                if (z.f67166a) {
                    z.b("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strH);
                }
                Request request2 = (Request) list.remove(0);
                this.f67020a.put(strH, list);
                synchronized (request2.f67029f) {
                    request2.f67038o = this;
                }
                h hVar = this.f67022c;
                if (hVar != null) {
                    hVar.d(request2);
                } else if (this.f67023d != null && (priorityBlockingQueue = this.f67024e) != null) {
                    try {
                        priorityBlockingQueue.put(request2);
                    } catch (InterruptedException e12) {
                        z.a("Couldn't add request to queue. %s", e12.toString());
                        Thread.currentThread().interrupt();
                        l lVar = this.f67023d;
                        lVar.f67081f = true;
                        lVar.interrupt();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public A(@N l lVar, @N PriorityBlockingQueue priorityBlockingQueue, x xVar) {
        this.f67020a = new HashMap();
        this.f67022c = null;
        this.f67021b = xVar;
        this.f67023d = lVar;
        this.f67024e = priorityBlockingQueue;
    }
}
