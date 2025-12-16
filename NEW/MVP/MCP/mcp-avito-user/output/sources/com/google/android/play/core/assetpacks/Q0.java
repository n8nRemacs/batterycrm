package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.C37146p;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
final class Q0 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358215g = new com.google.android.play.core.assetpacks.internal.F("ExtractorSessionStoreView");

    /* renamed from: a, reason: collision with root package name */
    public final Q f358216a;

    /* renamed from: b, reason: collision with root package name */
    public final C37196z0 f358217b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f358218c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f358219d = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public final C37146p f358220e;

    /* renamed from: f, reason: collision with root package name */
    public final C37146p f358221f;

    public Q0(Q q12, C37146p c37146p, C37196z0 c37196z0, C37146p c37146p2) {
        this.f358216a = q12;
        this.f358220e = c37146p;
        this.f358217b = c37196z0;
        this.f358221f = c37146p2;
    }

    public final void a() {
        this.f358219d.unlock();
    }

    public final N0 b(int i12) {
        HashMap map = this.f358218c;
        Integer numValueOf = Integer.valueOf(i12);
        N0 n02 = (N0) map.get(numValueOf);
        if (n02 != null) {
            return n02;
        }
        throw new C37184v0(String.format("Could not find session %d while trying to get it", numValueOf), i12);
    }

    public final Object c(P0 p02) {
        ReentrantLock reentrantLock = this.f358219d;
        try {
            reentrantLock.lock();
            return p02.a();
        } finally {
            reentrantLock.unlock();
        }
    }
}
