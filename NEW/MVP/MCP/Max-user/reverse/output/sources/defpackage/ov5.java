package defpackage;

import android.util.Size;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.time.Instant;
import java.util.Comparator;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ov5 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ov5(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return pmi.a(((my0) obj).c, ((my0) obj2).c);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return fni.c(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 3:
                return ((v47) obj).a.compareTo(((v47) obj2).a);
            case 4:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress instanceof Inet4Address) {
                    return -1;
                }
                return inetAddress instanceof Inet6Address ? 1 : 0;
            case 5:
                InetAddress inetAddress2 = (InetAddress) obj;
                if (inetAddress2 instanceof Inet6Address) {
                    return -1;
                }
                return inetAddress2 instanceof Inet4Address ? 1 : 0;
            case 6:
                wy0 wy0Var = (wy0) obj;
                wy0 wy0Var2 = (wy0) obj2;
                long j = wy0Var.X;
                long j2 = wy0Var2.X;
                return j - j2 == 0 ? wy0Var.compareTo(wy0Var2) : j < j2 ? -1 : 1;
            case 7:
                xy0 xy0Var = (xy0) obj;
                xy0 xy0Var2 = (xy0) obj2;
                long j3 = xy0Var.X;
                long j4 = xy0Var2.X;
                return j3 - j4 == 0 ? xy0Var.compareTo(xy0Var2) : j3 < j4 ? -1 : 1;
            case 8:
                w88 w88Var = (w88) obj;
                w88 w88Var2 = (w88) obj2;
                int i2 = w88Var.c;
                int i3 = w88Var2.c;
                if (i2 < i3) {
                    return -1;
                }
                if (i2 > i3) {
                    return 1;
                }
                return Integer.compare(w88Var2.d, w88Var.d);
            case 9:
                return ((Instant) obj).compareTo((Instant) obj2);
            case 10:
                wl9 wl9Var = (wl9) obj;
                wl9 wl9Var2 = (wl9) obj2;
                int iB = fni.b(wl9Var2.b, wl9Var.b);
                if (iB == 0) {
                    return wl9Var.a.b.a.toString().compareTo(wl9Var2.a.b.a.toString());
                }
                return iB;
            case 11:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((cfg) obj).getClass();
                ((cfg) obj2).getClass();
                return Integer.compare(1, 1);
            case 13:
                return ((tlb) obj).b.m().compareTo(((tlb) obj2).b.m());
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return fni.c(((Long) obj2).longValue(), ((Long) obj).longValue());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                j37 j37Var = (j37) obj;
                j37 j37Var2 = (j37) obj2;
                int iB2 = b5j.b(Long.valueOf(j37Var2.getC()), Long.valueOf(j37Var.getC()));
                return iB2 != 0 ? iB2 : b5j.b(Long.valueOf(j37Var.getA()), Long.valueOf(j37Var2.getA()));
            case 16:
                return Integer.compare(((rhb) obj).a.b, ((rhb) obj2).a.b);
            case LangUtils.HASH_SEED /* 17 */:
                return Long.compare(((l1i) obj).b, ((l1i) obj2).b);
            case 18:
                return ((s90) obj).a.compareTo(((s90) obj2).a);
            case 19:
                return fni.b(((isc) obj).a.ordinal(), ((isc) obj2).a.ordinal());
            case 20:
                c9d c9dVar = (c9d) obj;
                c9d c9dVar2 = (c9d) obj2;
                if (c9dVar == null || c9dVar2 == null) {
                    return 0;
                }
                return c9dVar2.getCount() - c9dVar.getCount();
            case 21:
                return pmi.a(((pb2) obj2).b.Z, ((pb2) obj).b.Z);
            case 22:
                sf2 sf2Var = (sf2) obj;
                sf2 sf2Var2 = (sf2) obj2;
                long j5 = sf2Var.b.a().e;
                long j6 = sf2Var2.b.a().e;
                if (j5 == 0) {
                    j5 = Long.MAX_VALUE;
                }
                if (j6 == 0) {
                    j6 = Long.MAX_VALUE;
                }
                int iC = fni.c(j6, j5);
                if (iC != 0) {
                    return iC;
                }
                int iC2 = fni.c(sf2Var2.b.k, sf2Var.b.k);
                if (iC2 != 0) {
                    return iC2;
                }
                int iC3 = fni.c(sf2Var2.a, sf2Var.a);
                return iC3 != 0 ? iC3 : fni.b(sf2Var2.hashCode(), sf2Var.hashCode());
            case 23:
                return ((q4f) obj).a - ((q4f) obj2).a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((r4f) obj).a - ((r4f) obj2).a;
            case 25:
                return Float.compare(((q4f) obj).c, ((q4f) obj2).c);
            case 26:
                return Float.compare(((r4f) obj).c, ((r4f) obj2).c);
            case 27:
                z4f z4fVar = (z4f) obj;
                z4f z4fVar2 = (z4f) obj2;
                return cj3.a.b(z4fVar.a, z4fVar2.a).b(z4fVar.b, z4fVar2.b).a(z4fVar.c, z4fVar2.c).f();
            case 28:
                return ((Integer) obj).compareTo((Integer) obj2);
            default:
                o7f o7fVar = (o7f) obj;
                o7f o7fVar2 = (o7f) obj2;
                int iCompare = Integer.compare(o7fVar2.b, o7fVar.b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = o7fVar.c.compareTo(o7fVar2.c);
                return iCompareTo != 0 ? iCompareTo : o7fVar.d.compareTo(o7fVar2.d);
        }
    }
}
