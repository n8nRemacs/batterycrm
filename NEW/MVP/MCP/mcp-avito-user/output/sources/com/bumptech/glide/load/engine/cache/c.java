package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker.java */
/* loaded from: classes5.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f338959a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final b f338960b = new b();

    /* compiled from: DiskCacheWriteLocker.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ReentrantLock f338961a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        public int f338962b;
    }

    /* compiled from: DiskCacheWriteLocker.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque f338963a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                Object obj = this.f338959a.get(str);
                com.bumptech.glide.util.k.c(obj, "Argument must not be null");
                aVar = (a) obj;
                int i12 = aVar.f338962b;
                if (i12 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f338962b);
                }
                int i13 = i12 - 1;
                aVar.f338962b = i13;
                if (i13 == 0) {
                    a aVar2 = (a) this.f338959a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    b bVar = this.f338960b;
                    synchronized (bVar.f338963a) {
                        try {
                            if (bVar.f338963a.size() < 10) {
                                bVar.f338963a.offer(aVar2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f338961a.unlock();
    }
}
