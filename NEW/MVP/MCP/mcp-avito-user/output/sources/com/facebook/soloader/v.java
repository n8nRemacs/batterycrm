package com.facebook.soloader;

import java.io.FileInputStream;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: NativeDeps.java */
/* loaded from: classes16.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f340898b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f340899c = false;

    /* renamed from: a, reason: collision with root package name */
    public static final int f340897a = 3 + 3;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantReadWriteLock f340900d = new ReentrantReadWriteLock();

    public static String[] a(String str, n nVar) throws ClosedByInterruptException {
        String[] strArrD;
        if (f340898b) {
            strArrD = d(str);
        } else if (f340899c) {
            ReentrantReadWriteLock reentrantReadWriteLock = f340900d;
            reentrantReadWriteLock.readLock().lock();
            try {
                strArrD = d(str);
                reentrantReadWriteLock.readLock().unlock();
            } catch (Throwable th2) {
                f340900d.readLock().unlock();
                throw th2;
            }
        } else {
            strArrD = null;
        }
        if (strArrD != null) {
            return strArrD;
        }
        if (!(nVar instanceof o)) {
            return MinElf.a(nVar);
        }
        o oVar = (o) nVar;
        int i12 = 0;
        while (true) {
            try {
                return MinElf.a(oVar);
            } catch (ClosedByInterruptException e12) {
                i12++;
                if (i12 > 4) {
                    throw e12;
                }
                Thread.interrupted();
                oVar.getClass();
                FileInputStream fileInputStream = new FileInputStream(oVar.f340872b);
                oVar.f340873c = fileInputStream;
                oVar.f340874d = fileInputStream.getChannel();
            }
        }
    }

    @I41.h
    public static String b(int i12) {
        throw null;
    }

    public static boolean c() {
        if (f340898b) {
            synchronized (v.class) {
                try {
                    if (f340898b) {
                        throw new IllegalStateException("Trying to initialize NativeDeps but it was already initialized");
                    }
                } finally {
                }
            }
        }
        throw null;
    }

    @I41.h
    public static String[] d(String str) {
        if (!f340898b || str.length() <= f340897a) {
            return null;
        }
        for (int i12 = 3; i12 < str.length() - 3; i12++) {
            str.codePointAt(i12);
        }
        throw null;
    }
}
