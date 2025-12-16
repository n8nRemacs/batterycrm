package io.ktor.utils.io.core.internal;

import Y61.k;
import Y61.l;
import io.ktor.utils.io.core.C41629b;
import io.ktor.utils.io.core.C41636i;
import io.ktor.utils.io.core.C41640m;
import io.ktor.utils.io.core.C41641n;
import io.ktor.utils.io.core.E;
import io.ktor.utils.io.core.K;
import io.ktor.utils.io.core.x;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.s0;

/* compiled from: Unsafe.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @k
    public static final byte[] f400900a = new byte[0];

    @X
    public static final void a(@k x xVar, @k b bVar) {
        if (bVar == xVar) {
            return;
        }
        int i12 = bVar.f400876c;
        int i13 = bVar.f400875b;
        if (i12 <= i13) {
            xVar.h(bVar);
            return;
        }
        int i14 = bVar.f400878e;
        int i15 = bVar.f400879f;
        if (i15 - i14 >= 8) {
            xVar.f400910e = i13;
            return;
        }
        b bVarI = bVar.i();
        if (bVarI == null) {
            xVar.k(bVar);
            return;
        }
        int i16 = bVar.f400876c - bVar.f400875b;
        int iMin = Math.min(i16, 8 - (i15 - bVar.f400878e));
        if (bVarI.f400877d < iMin) {
            xVar.k(bVar);
            return;
        }
        bVarI.d(bVarI.f400875b - iMin);
        if (i16 > iMin) {
            bVar.f400878e = i15;
            xVar.f400911f = bVar.f400876c;
            xVar.B(xVar.f400912g + iMin);
        } else {
            xVar.D(bVarI);
            xVar.B(xVar.f400912g - ((bVarI.f400876c - bVarI.f400875b) - iMin));
            bVar.g();
            bVar.k(xVar.f400907b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    @X
    public static final b b(@k x xVar, @k b bVar) {
        if (bVar != xVar) {
            return xVar.h(bVar);
        }
        if (xVar.a()) {
            return (b) xVar;
        }
        return null;
    }

    @k
    public static final b c(@k E e12, int i12, @l b bVar) {
        if (bVar != null) {
            e12.a();
        }
        return e12.m(i12);
    }

    public static final void d(@k C41641n c41641n, @k C41640m c41640m) {
        int iK2 = c41640m.k();
        b bVarN = c41640m.n();
        if (bVarN == null) {
            return;
        }
        if (iK2 <= K.f400870a && bVarN.i() == null) {
            b bVarN2 = c41641n.n();
            while (true) {
                b bVarI = bVarN2.i();
                if (bVarI == null) {
                    break;
                } else {
                    bVarN2 = bVarI;
                }
            }
            int i12 = bVarN.f400876c - bVarN.f400875b;
            if (i12 != 0 && bVarN2.f400878e - bVarN2.f400876c >= i12) {
                C41629b.a(bVarN2, bVarN, i12);
                if (c41641n.n() == bVarN2) {
                    c41641n.f400911f = bVarN2.f400876c;
                } else {
                    c41641n.B(c41641n.f400912g + i12);
                }
                b bVar = c41640m.f400863c;
                if (bVar == null) {
                    b.f400881j.getClass();
                    bVar = b.f400886o;
                }
                b.f400881j.getClass();
                if (bVar != b.f400886o) {
                    if (bVar.i() != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    bVar.f(bVar.f400879f - bVar.f400877d);
                    bVar.e();
                    int i13 = bVar.f400876c;
                    c41640m.f400866f = i13;
                    c41640m.f400868h = i13;
                    c41640m.f400867g = bVar.f400878e;
                    return;
                }
                return;
            }
        }
        b.f400881j.getClass();
        b bVar2 = b.f400886o;
        if (bVarN == bVar2) {
            return;
        }
        long jA2 = C41636i.a(bVarN);
        b bVar3 = c41641n.f400908c;
        if (bVar3 == bVar2) {
            c41641n.D(bVarN);
            c41641n.B(jA2 - (c41641n.f400911f - c41641n.f400910e));
            return;
        }
        while (true) {
            b bVarI2 = bVar3.i();
            if (bVarI2 == null) {
                bVar3.m(bVarN);
                c41641n.B(c41641n.f400912g + jA2);
                return;
            }
            bVar3 = bVarI2;
        }
    }
}
