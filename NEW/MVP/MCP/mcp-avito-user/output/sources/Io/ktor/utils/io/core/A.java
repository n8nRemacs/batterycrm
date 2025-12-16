package io.ktor.utils.io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputArrays.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A {
    public static final int a(@Y61.k C41641n c41641n, @Y61.k byte[] bArr, int i12, int i13) throws Throwable {
        int i14;
        boolean z12 = true;
        io.ktor.utils.io.core.internal.b bVarU = c41641n.u(1);
        if (bVarU == null) {
            i14 = i13;
        } else {
            i14 = i13;
            while (true) {
                try {
                    int iMin = Math.min(i14, bVarU.f400876c - bVarU.f400875b);
                    C41634g.b(bVarU, bArr, i12, iMin);
                    i14 -= iMin;
                    i12 += iMin;
                    if (i14 <= 0) {
                        io.ktor.utils.io.core.internal.i.a(c41641n, bVarU);
                        break;
                    }
                    try {
                        bVarU = io.ktor.utils.io.core.internal.i.b(c41641n, bVarU);
                        if (bVarU == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z12 = false;
                        if (z12) {
                            io.ktor.utils.io.core.internal.i.a(c41641n, bVarU);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        return i13 - i14;
    }

    public static final void b(@Y61.k C41641n c41641n, @Y61.k C41628a c41628a, int i12) throws Throwable {
        boolean z12 = true;
        io.ktor.utils.io.core.internal.b bVarU = c41641n.u(1);
        if (bVarU != null) {
            while (true) {
                try {
                    int iMin = Math.min(i12, bVarU.f400876c - bVarU.f400875b);
                    C41634g.a(bVarU, c41628a, iMin);
                    i12 -= iMin;
                    if (i12 <= 0) {
                        io.ktor.utils.io.core.internal.i.a(c41641n, bVarU);
                        break;
                    }
                    try {
                        bVarU = io.ktor.utils.io.core.internal.i.b(c41641n, bVarU);
                        if (bVarU == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z12 = false;
                        if (z12) {
                            io.ktor.utils.io.core.internal.i.a(c41641n, bVarU);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (i12 <= 0) {
            return;
        }
        S.a(i12);
        throw null;
    }

    public static final void c(@Y61.k C41641n c41641n, @Y61.k byte[] bArr, int i12, int i13) {
        boolean z12 = true;
        io.ktor.utils.io.core.internal.b bVarU = c41641n.u(1);
        if (bVarU != null) {
            while (true) {
                try {
                    int iMin = Math.min(i13, bVarU.f400876c - bVarU.f400875b);
                    C41634g.b(bVarU, bArr, i12, iMin);
                    i13 -= iMin;
                    i12 += iMin;
                    if (i13 <= 0) {
                        io.ktor.utils.io.core.internal.i.a(c41641n, bVarU);
                        break;
                    }
                    try {
                        bVarU = io.ktor.utils.io.core.internal.i.b(c41641n, bVarU);
                        if (bVarU == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z12 = false;
                        if (z12) {
                            io.ktor.utils.io.core.internal.i.a(c41641n, bVarU);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        if (i13 <= 0) {
            return;
        }
        S.a(i13);
        throw null;
    }
}
