package com.facebook.soloader;

import iX0.InterfaceC41359b;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: NativeLoaderToSoLoaderDelegate.java */
/* loaded from: classes16.dex */
public class y implements InterfaceC41359b {
    @Override // iX0.InterfaceC41359b
    public final boolean a(String str) {
        Boolean boolValueOf;
        boolean z12;
        if (SoLoader.f340849d == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = SoLoader.f340848c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (SoLoader.f340849d == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                boolean zContains = SoLoader.f340853h.contains(str);
                                boolean z13 = !zContains;
                                if (!zContains) {
                                    System.loadLibrary(str);
                                }
                                boolValueOf = Boolean.valueOf(z13);
                            } finally {
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else if (!SoLoader.h()) {
                        throw new IllegalStateException("SoLoader.init() not yet called");
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                boolValueOf = null;
            } catch (Throwable th2) {
                SoLoader.f340848c.readLock().unlock();
                throw th2;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if (SoLoader.f340858m != 2) {
        }
        String strMapLibraryName = System.mapLibraryName(str);
        boolean zI2 = false;
        do {
            try {
                zI2 = SoLoader.i(strMapLibraryName, str, 0, null);
                z12 = false;
            } catch (UnsatisfiedLinkError e12) {
                AtomicInteger atomicInteger = SoLoader.f340850e;
                int i12 = atomicInteger.get();
                ReentrantReadWriteLock reentrantReadWriteLock2 = SoLoader.f340848c;
                reentrantReadWriteLock2.writeLock().lock();
                try {
                    try {
                        if (SoLoader.f340852g == null || !SoLoader.f340852g.c()) {
                            z12 = false;
                        } else {
                            atomicInteger.getAndIncrement();
                            z12 = true;
                        }
                        reentrantReadWriteLock2.writeLock().unlock();
                        if (atomicInteger.get() == i12) {
                            throw e12;
                        }
                    } catch (Throwable th3) {
                        reentrantReadWriteLock2.writeLock().unlock();
                        throw th3;
                    }
                } catch (IOException e13) {
                    throw new RuntimeException(e13);
                }
            }
        } while (z12);
        return zI2;
    }
}
