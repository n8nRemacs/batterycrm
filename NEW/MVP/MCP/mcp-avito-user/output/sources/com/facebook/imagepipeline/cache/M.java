package com.facebook.imagepipeline.cache;

import com.facebook.infer.annotation.Nullsafe;
import java.util.HashMap;
import uW0.C48986a;

/* compiled from: StagingArea.java */
@Nullsafe
/* loaded from: classes12.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    @J41.a
    public final HashMap f340216a = new HashMap();

    @I41.h
    public final synchronized YW0.d a(com.facebook.cache.common.c cVar) {
        cVar.getClass();
        YW0.d dVarA = (YW0.d) this.f340216a.get(cVar);
        if (dVarA != null) {
            synchronized (dVarA) {
                if (!YW0.d.k(dVarA)) {
                    this.f340216a.remove(cVar);
                    C48986a.j(M.class, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(dVarA)), cVar.a(), Integer.valueOf(System.identityHashCode(cVar)));
                    return null;
                }
                dVarA = YW0.d.a(dVarA);
            }
        }
        return dVarA;
    }

    public final synchronized void b() {
        C48986a.g(Integer.valueOf(this.f340216a.size()), M.class, "Count = %d");
    }

    public final synchronized void c(com.facebook.cache.common.c cVar, YW0.d dVar) {
        cVar.getClass();
        if (!YW0.d.k(dVar)) {
            throw new IllegalArgumentException();
        }
        YW0.d.b((YW0.d) this.f340216a.put(cVar, YW0.d.a(dVar)));
        b();
    }

    public final void d(com.facebook.cache.common.c cVar) {
        YW0.d dVar;
        cVar.getClass();
        synchronized (this) {
            dVar = (YW0.d) this.f340216a.remove(cVar);
        }
        if (dVar == null) {
            return;
        }
        try {
            dVar.j();
        } finally {
            dVar.close();
        }
    }

    public final synchronized void e(com.facebook.cache.common.c cVar, YW0.d dVar) {
        cVar.getClass();
        dVar.getClass();
        if (!YW0.d.k(dVar)) {
            throw new IllegalArgumentException();
        }
        YW0.d dVar2 = (YW0.d) this.f340216a.get(cVar);
        if (dVar2 == null) {
            return;
        }
        com.facebook.common.references.a aVarB = com.facebook.common.references.a.b(dVar2.f19498b);
        com.facebook.common.references.a aVarB2 = com.facebook.common.references.a.b(dVar.f19498b);
        if (aVarB != null && aVarB2 != null) {
            try {
                if (aVarB.i() == aVarB2.i()) {
                    this.f340216a.remove(cVar);
                    com.facebook.common.references.a.c(aVarB2);
                    com.facebook.common.references.a.c(aVarB);
                    YW0.d.b(dVar2);
                    b();
                }
            } finally {
                com.facebook.common.references.a.c(aVarB2);
                com.facebook.common.references.a.c(aVarB);
                YW0.d.b(dVar2);
            }
        }
    }
}
