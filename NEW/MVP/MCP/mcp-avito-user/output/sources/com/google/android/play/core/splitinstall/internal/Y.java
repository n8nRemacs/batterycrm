package com.google.android.play.core.splitinstall.internal;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class Y implements b0, X {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f358740c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b0 f358741a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f358742b = f358740c;

    public Y(b0 b0Var) {
        this.f358741a = b0Var;
    }

    public static X a(b0 b0Var) {
        return b0Var instanceof X ? (X) b0Var : new Y(b0Var);
    }

    public static b0 b(b0 b0Var) {
        return b0Var instanceof Y ? b0Var : new Y(b0Var);
    }

    @Override // com.google.android.play.core.splitinstall.internal.b0
    public final Object zza() {
        Object objZza = this.f358742b;
        Object obj = f358740c;
        if (objZza == obj) {
            synchronized (this) {
                try {
                    objZza = this.f358742b;
                    if (objZza == obj) {
                        objZza = this.f358741a.zza();
                        Object obj2 = this.f358742b;
                        if (obj2 != obj && obj2 != objZza) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                        }
                        this.f358742b = objZza;
                        this.f358741a = null;
                    }
                } finally {
                }
            }
        }
        return objZza;
    }
}
