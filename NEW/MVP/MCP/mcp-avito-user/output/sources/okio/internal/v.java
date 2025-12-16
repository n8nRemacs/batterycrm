package okio.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.C44802l;
import okio.C44810u;
import okio.S;
import okio.Y;

/* compiled from: ZipFiles.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class v {
    public static final LinkedHashMap a(ArrayList arrayList) {
        S sB2 = S.a.b(S.f420033c, "/");
        LinkedHashMap linkedHashMapJ = P0.j(new Q(sB2, new q(sB2, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (q qVar : C42745f0.B0(arrayList, new r())) {
            if (((q) linkedHashMapJ.put(qVar.f420102a, qVar)) == null) {
                while (true) {
                    S s5 = qVar.f420102a;
                    S sB3 = s5.b();
                    if (sB3 != null) {
                        q qVar2 = (q) linkedHashMapJ.get(sB3);
                        if (qVar2 != null) {
                            qVar2.f420109h.add(s5);
                            break;
                        }
                        q qVar3 = new q(sB3, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        linkedHashMapJ.put(sB3, qVar3);
                        qVar3.f420109h.add(s5);
                        qVar = qVar3;
                    }
                }
            }
        }
        return linkedHashMapJ;
    }

    public static final String b(int i12) {
        C43044a.a(16);
        return "0x".concat(Integer.toString(i12, 16));
    }

    @Y61.k
    public static final q c(@Y61.k Y y12) throws IOException {
        Long lValueOf;
        Long l12;
        long j12;
        int iC2 = y12.c();
        if (iC2 != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iC2));
        }
        y12.skip(4L);
        short sF2 = y12.f();
        int i12 = sF2 & 65535;
        if ((sF2 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i12));
        }
        int iF2 = y12.f() & 65535;
        short sF3 = y12.f();
        int i13 = sF3 & 65535;
        short sF4 = y12.f();
        int i14 = sF4 & 65535;
        if (i13 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i14 >> 9) & 127) + 1980, ((i14 >> 5) & 15) - 1, sF4 & 31, (i13 >> 11) & 31, (i13 >> 5) & 63, (sF3 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l13 = lValueOf;
        y12.c();
        l0.g gVar = new l0.g();
        gVar.f406841b = y12.c() & 4294967295L;
        l0.g gVar2 = new l0.g();
        gVar2.f406841b = y12.c() & 4294967295L;
        int iF3 = y12.f() & 65535;
        int iF4 = y12.f() & 65535;
        int iF5 = y12.f() & 65535;
        y12.skip(8L);
        l0.g gVar3 = new l0.g();
        gVar3.f406841b = y12.c() & 4294967295L;
        String strD4 = y12.d4(iF3);
        if (C43066x.r(strD4, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        if (gVar2.f406841b == 4294967295L) {
            j12 = 8;
            l12 = l13;
        } else {
            l12 = l13;
            j12 = 0;
        }
        if (gVar.f406841b == 4294967295L) {
            j12 += 8;
        }
        if (gVar3.f406841b == 4294967295L) {
            j12 += 8;
        }
        long j13 = j12;
        l0.a aVar = new l0.a();
        d(y12, iF4, new t(aVar, j13, gVar2, y12, gVar, gVar3));
        if (j13 > 0 && !aVar.f406838b) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        y12.d4(iF5);
        return new q(S.a.b(S.f420033c, "/").d(strD4), C43066x.z(strD4, "/", false), gVar.f406841b, gVar2.f406841b, iF2, l12, gVar3.f406841b);
    }

    public static final void d(Y y12, int i12, Y41.p pVar) throws IOException {
        long j12 = i12;
        while (j12 != 0) {
            if (j12 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iF2 = y12.f() & 65535;
            long jF2 = y12.f() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j13 = j12 - 4;
            if (j13 < jF2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            y12.x5(jF2);
            C44802l c44802l = y12.f420047c;
            long j14 = c44802l.f420125c;
            pVar.invoke(Integer.valueOf(iF2), Long.valueOf(jF2));
            long j15 = (c44802l.f420125c + jF2) - j14;
            if (j15 < 0) {
                throw new IOException(AK.c.g(iF2, "unsupported zip: too many bytes processed for "));
            }
            if (j15 > 0) {
                c44802l.skip(j15);
            }
            j12 = j13 - jF2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C44810u e(Y y12, C44810u c44810u) throws IOException {
        l0.h hVar = new l0.h();
        hVar.f406842b = c44810u != null ? c44810u.f420158f : 0;
        l0.h hVar2 = new l0.h();
        l0.h hVar3 = new l0.h();
        int iC2 = y12.c();
        if (iC2 != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(iC2));
        }
        y12.skip(2L);
        short sF2 = y12.f();
        int i12 = sF2 & 65535;
        if ((sF2 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i12));
        }
        y12.skip(18L);
        long jF2 = y12.f() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int iF2 = y12.f() & 65535;
        y12.skip(jF2);
        if (c44810u == null) {
            y12.skip(iF2);
            return null;
        }
        d(y12, iF2, new u(y12, hVar, hVar2, hVar3));
        return new C44810u(c44810u.f420153a, c44810u.f420154b, null, c44810u.f420156d, (Long) hVar3.f406842b, (Long) hVar.f406842b, (Long) hVar2.f406842b, null, 128, null);
    }
}
