package com.android.volley;

import android.os.Process;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: NetworkDispatcher.java */
/* loaded from: classes10.dex */
public class q extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final PriorityBlockingQueue f67094b;

    /* renamed from: c, reason: collision with root package name */
    public final p f67095c;

    /* renamed from: d, reason: collision with root package name */
    public final j f67096d;

    /* renamed from: e, reason: collision with root package name */
    public final x f67097e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f67098f = false;

    public q(PriorityBlockingQueue priorityBlockingQueue, p pVar, j jVar, x xVar) {
        this.f67094b = priorityBlockingQueue;
        this.f67095c = pVar;
        this.f67096d = jVar;
        this.f67097e = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: all -> 0x002a, Exception -> 0x002d, VolleyError -> 0x0030, TryCatch #7 {VolleyError -> 0x0030, Exception -> 0x002d, blocks: (B:3:0x0012, B:5:0x001d, B:13:0x0033, B:15:0x0047, B:16:0x0049, B:20:0x004f, B:24:0x005a, B:25:0x005b, B:27:0x0068, B:29:0x006c, B:30:0x007c, B:31:0x007e, B:35:0x0083, B:36:0x0088, B:40:0x008e, B:42:0x0092, B:45:0x009d, B:46:0x00a1, B:50:0x00ad, B:52:0x00b1, B:53:0x00c2, B:54:0x00c6, B:56:0x00cc, B:60:0x00da, B:61:0x00db, B:65:0x00e2, B:68:0x00e5), top: B:83:0x0012, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.q.a():void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f67098f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                z.a("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
