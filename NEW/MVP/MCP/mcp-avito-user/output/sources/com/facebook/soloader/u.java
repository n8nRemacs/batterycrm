package com.facebook.soloader;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: NativeDeps.java */
/* loaded from: classes16.dex */
class u implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        v.f340900d.writeLock().lock();
        v.f340899c = true;
        try {
            v.c();
            throw null;
        } catch (IOException unused) {
            ReentrantReadWriteLock reentrantReadWriteLock = v.f340900d;
            int readLockCount = reentrantReadWriteLock.getReadLockCount();
            if (readLockCount >= 3) {
                Integer.toString(readLockCount);
            }
            reentrantReadWriteLock.writeLock().unlock();
            v.f340899c = false;
        } catch (Throwable th2) {
            ReentrantReadWriteLock reentrantReadWriteLock2 = v.f340900d;
            int readLockCount2 = reentrantReadWriteLock2.getReadLockCount();
            if (readLockCount2 >= 3) {
                Integer.toString(readLockCount2);
            }
            reentrantReadWriteLock2.writeLock().unlock();
            v.f340899c = false;
            throw th2;
        }
    }
}
