package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: BufferRecyclers.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final q f341281a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<SoftReference<a>> f341282b;

    static {
        boolean zEquals;
        try {
            zEquals = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        f341281a = zEquals ? q.a.f341326a : null;
        f341282b = new ThreadLocal<>();
    }

    public static a a() {
        SoftReference<a> softReference;
        ThreadLocal<SoftReference<a>> threadLocal = f341282b;
        SoftReference<a> softReference2 = threadLocal.get();
        a aVar = softReference2 == null ? null : softReference2.get();
        if (aVar == null) {
            aVar = new a();
            q qVar = f341281a;
            if (qVar != null) {
                ReferenceQueue<a> referenceQueue = qVar.f341325b;
                softReference = new SoftReference<>(aVar, referenceQueue);
                ConcurrentHashMap concurrentHashMap = qVar.f341324a;
                concurrentHashMap.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    concurrentHashMap.remove(softReference3);
                }
            } else {
                softReference = new SoftReference<>(aVar);
            }
            threadLocal.set(softReference);
        }
        return aVar;
    }
}
