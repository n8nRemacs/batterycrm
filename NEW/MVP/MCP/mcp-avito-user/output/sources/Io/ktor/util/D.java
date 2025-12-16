package io.ktor.util;

import io.ktor.utils.io.core.C41640m;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.V0;

@Metadata(d1 = {"io/ktor/util/G", "io/ktor/util/H"}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class D {
    @Y61.k
    public static final String a() {
        String str = (String) kotlinx.coroutines.channels.B.c(p0.f400497b.H());
        if (str != null) {
            return str;
        }
        ((V0) p0.f400498c).start();
        return (String) C43259k.e(EmptyCoroutineContext.INSTANCE, new E(2, null));
    }

    @Y61.k
    public static final byte[] b() {
        char[] cArr = H.f400390a;
        C41640m c41640m = new C41640m(null, 1, null);
        while (c41640m.k() < 16) {
            try {
                io.ktor.utils.io.core.S.d(c41640m, a());
            } catch (Throwable th2) {
                c41640m.close();
                throw th2;
            }
        }
        byte[] bArr = new byte[16];
        io.ktor.utils.io.core.A.c(c41640m.y(), bArr, 0, 16);
        return bArr;
    }

    @Y61.k
    public static final String c(@Y61.k byte[] bArr) {
        char[] cArr = H.f400390a;
        char[] cArr2 = new char[bArr.length * 2];
        int i12 = 0;
        for (byte b12 : bArr) {
            int i13 = i12 + 1;
            char[] cArr3 = H.f400390a;
            cArr2[i12] = cArr3[(b12 & 255) >> 4];
            i12 += 2;
            cArr2[i13] = cArr3[b12 & 15];
        }
        return new String(cArr2);
    }
}
