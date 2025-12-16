package com.avito.security;

/* loaded from: classes5.dex */
public class z0 extends n1 {
    @Override // com.avito.security.n1
    public void a(Throwable th2, Throwable th3) {
        y0.b(th2, "cause");
        y0.b(th3, "exception");
        th2.addSuppressed(th3);
    }
}
