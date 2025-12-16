package kotlin.random;

import Y61.k;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Random.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g {
    @InterfaceC42733c0
    @k
    public static final i a(long j12) {
        int i12 = (int) j12;
        int i13 = (int) (j12 >> 32);
        int i14 = ~i12;
        i iVar = new i();
        iVar.f406885d = i12;
        iVar.f406886e = i13;
        iVar.f406887f = 0;
        iVar.f406888g = 0;
        iVar.f406889h = i14;
        iVar.f406890i = (i12 << 10) ^ (i13 >>> 4);
        if ((i13 | i12 | i14) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i15 = 0; i15 < 64; i15++) {
            iVar.i();
        }
        return iVar;
    }

    @k
    public static final String b(@k Number number, @k Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }
}
