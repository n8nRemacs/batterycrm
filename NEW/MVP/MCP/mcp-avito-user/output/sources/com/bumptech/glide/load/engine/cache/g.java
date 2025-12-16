package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.a;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.c;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes5.dex */
public class g implements a {

    /* renamed from: b, reason: collision with root package name */
    public final File f338966b;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.disklrucache.a f338969e;

    /* renamed from: d, reason: collision with root package name */
    public final c f338968d = new c();

    /* renamed from: c, reason: collision with root package name */
    public final long f338967c = 262144000;

    /* renamed from: a, reason: collision with root package name */
    public final r f338965a = new r();

    @Deprecated
    public g(File file) {
        this.f338966b = file;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public final void a(com.bumptech.glide.load.h hVar, a.b bVar) {
        c.a aVar;
        com.bumptech.glide.disklrucache.a aVarC;
        boolean z12;
        String strA = this.f338965a.a(hVar);
        c cVar = this.f338968d;
        synchronized (cVar) {
            aVar = (c.a) cVar.f338959a.get(strA);
            if (aVar == null) {
                c.b bVar2 = cVar.f338960b;
                synchronized (bVar2.f338963a) {
                    aVar = (c.a) bVar2.f338963a.poll();
                }
                if (aVar == null) {
                    aVar = new c.a();
                }
                cVar.f338959a.put(strA, aVar);
            }
            aVar.f338962b++;
        }
        aVar.f338961a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(hVar);
            }
            try {
                aVarC = c();
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            if (aVarC.g(strA) != null) {
                return;
            }
            a.c cVarD = aVarC.d(strA);
            if (cVarD == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
            }
            try {
                if (bVar.a(cVarD.b())) {
                    com.bumptech.glide.disklrucache.a.a(com.bumptech.glide.disklrucache.a.this, cVarD, true);
                    cVarD.f338722c = true;
                }
                if (!z12) {
                    try {
                        cVarD.a();
                    } catch (IOException unused2) {
                    }
                }
            } finally {
                if (!cVarD.f338722c) {
                    try {
                        cVarD.a();
                    } catch (IOException unused3) {
                    }
                }
            }
        } finally {
            this.f338968d.a(strA);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public final File b(com.bumptech.glide.load.h hVar) {
        String strA = this.f338965a.a(hVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(hVar);
        }
        try {
            a.e eVarG = c().g(strA);
            if (eVarG != null) {
                return eVarG.f338732a[0];
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    public final synchronized com.bumptech.glide.disklrucache.a c() {
        try {
            if (this.f338969e == null) {
                this.f338969e = com.bumptech.glide.disklrucache.a.i(this.f338966b, this.f338967c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f338969e;
    }
}
