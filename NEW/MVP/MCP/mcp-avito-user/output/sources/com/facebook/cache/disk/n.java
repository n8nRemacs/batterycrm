package com.facebook.cache.disk;

import com.facebook.infer.annotation.Nullsafe;
import fX0.u;

/* compiled from: SettableCacheEvent.java */
@Nullsafe
/* loaded from: classes5.dex */
public class n implements com.facebook.cache.common.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f339801c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public static n f339802d;

    /* renamed from: e, reason: collision with root package name */
    public static int f339803e;

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public com.facebook.cache.common.c f339804a;

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public n f339805b;

    @u
    public static n a() {
        synchronized (f339801c) {
            try {
                n nVar = f339802d;
                if (nVar == null) {
                    return new n();
                }
                f339802d = nVar.f339805b;
                nVar.f339805b = null;
                f339803e--;
                return nVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (f339801c) {
            try {
                int i12 = f339803e;
                if (i12 < 5) {
                    f339803e = i12 + 1;
                    n nVar = f339802d;
                    if (nVar != null) {
                        this.f339805b = nVar;
                    }
                    f339802d = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
