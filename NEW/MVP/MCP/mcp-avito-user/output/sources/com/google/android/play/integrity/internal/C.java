package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
public final class C implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f358909c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC37253b f358910a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f358911b;

    public static d b(InterfaceC37253b interfaceC37253b) {
        interfaceC37253b.getClass();
        if (interfaceC37253b instanceof C) {
            return interfaceC37253b;
        }
        C c12 = new C();
        c12.f358911b = f358909c;
        c12.f358910a = interfaceC37253b;
        return c12;
    }

    @Override // com.google.android.play.integrity.internal.d
    public final Object a() {
        Object objA = this.f358911b;
        Object obj = f358909c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f358911b;
                    if (objA == obj) {
                        objA = this.f358910a.a();
                        Object obj2 = this.f358911b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f358911b = objA;
                        this.f358910a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
