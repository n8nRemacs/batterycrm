package com.google.android.play.core.appupdate.internal;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: com.google.android.play.core.appupdate.internal.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37103e implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f358033c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile g f358034a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f358035b;

    public static g a(g gVar) {
        if (gVar instanceof C37103e) {
            return gVar;
        }
        C37103e c37103e = new C37103e();
        c37103e.f358035b = f358033c;
        c37103e.f358034a = gVar;
        return c37103e;
    }

    @Override // com.google.android.play.core.appupdate.internal.g
    public final Object zza() {
        Object objZza = this.f358035b;
        Object obj = f358033c;
        if (objZza == obj) {
            synchronized (this) {
                try {
                    objZza = this.f358035b;
                    if (objZza == obj) {
                        objZza = this.f358034a.zza();
                        Object obj2 = this.f358035b;
                        if (obj2 != obj && obj2 != objZza) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                        }
                        this.f358035b = objZza;
                        this.f358034a = null;
                    }
                } finally {
                }
            }
        }
        return objZza;
    }
}
