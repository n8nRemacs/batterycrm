package com.google.android.play.core.assetpacks.internal;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.internal.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37146p implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f358380c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile r f358381a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f358382b = f358380c;

    public C37146p(r rVar) {
        this.f358381a = rVar;
    }

    public static r b(r rVar) {
        rVar.getClass();
        return rVar instanceof C37146p ? rVar : new C37146p(rVar);
    }

    public static C37146p c(r rVar) {
        return rVar instanceof C37146p ? (C37146p) rVar : new C37146p(rVar);
    }

    @Override // com.google.android.play.core.assetpacks.internal.r
    public final Object a() {
        Object objA = this.f358382b;
        Object obj = f358380c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f358382b;
                    if (objA == obj) {
                        objA = this.f358381a.a();
                        Object obj2 = this.f358382b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f358382b = objA;
                        this.f358381a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
