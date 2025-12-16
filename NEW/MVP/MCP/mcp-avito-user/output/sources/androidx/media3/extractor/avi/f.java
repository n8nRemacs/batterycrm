package androidx.media3.extractor.avi;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import com.google.common.base.C37262f;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import j.P;

/* compiled from: ListChunk.java */
/* loaded from: classes.dex */
final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37401r1<a> f50468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50469b;

    public f(int i12, AbstractC37401r1<a> abstractC37401r1) {
        this.f50469b = i12;
        this.f50468a = abstractC37401r1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i12, z zVar) {
        String str;
        a cVar;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        int i13 = zVar.f47964c;
        int i14 = -2;
        while (zVar.a() > 8) {
            int i15 = zVar.i();
            int i16 = zVar.f47963b + zVar.i();
            zVar.E(i16);
            if (i15 != 1414744396) {
                g gVar = null;
                switch (i15) {
                    case 1718776947:
                        if (i14 == 2) {
                            zVar.G(4);
                            int i17 = zVar.i();
                            int i18 = zVar.i();
                            zVar.G(4);
                            switch (zVar.i()) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                s.g();
                            } else {
                                C23108t.b bVar = new C23108t.b();
                                bVar.f47792p = i17;
                                bVar.f47793q = i18;
                                bVar.f47787k = str;
                                gVar = new g(bVar.a());
                            }
                        } else if (i14 == 1) {
                            int iN2 = zVar.n();
                            String str2 = iN2 != 1 ? iN2 != 85 ? iN2 != 255 ? iN2 != 8192 ? iN2 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 == null) {
                                s.g();
                            } else {
                                int iN3 = zVar.n();
                                int i19 = zVar.i();
                                zVar.G(6);
                                int iU2 = M.u(zVar.z());
                                int iN4 = zVar.n();
                                byte[] bArr = new byte[iN4];
                                zVar.e(0, iN4, bArr);
                                C23108t.b bVar2 = new C23108t.b();
                                bVar2.f47787k = str2;
                                bVar2.f47800x = iN3;
                                bVar2.f47801y = i19;
                                if ("audio/raw".equals(str2) && iU2 != 0) {
                                    bVar2.f47802z = iU2;
                                }
                                if ("audio/mp4a-latm".equals(str2) && iN4 > 0) {
                                    bVar2.f47789m = AbstractC37401r1.E(bArr);
                                }
                                gVar = new g(bVar2.a());
                            }
                        } else {
                            M.y(i14);
                            s.g();
                        }
                        cVar = gVar;
                        break;
                    case 1751742049:
                        int i22 = zVar.i();
                        zVar.G(8);
                        int i23 = zVar.i();
                        int i24 = zVar.i();
                        zVar.G(4);
                        zVar.i();
                        zVar.G(12);
                        cVar = new c(i22, i23, i24);
                        break;
                    case 1752331379:
                        int i25 = zVar.i();
                        zVar.G(12);
                        zVar.i();
                        int i26 = zVar.i();
                        int i27 = zVar.i();
                        zVar.G(4);
                        int i28 = zVar.i();
                        int i29 = zVar.i();
                        zVar.G(8);
                        cVar = new d(i25, i26, i27, i28, i29);
                        break;
                    case 1852994675:
                        cVar = new h(zVar.s(zVar.a(), C37262f.f359034c));
                        break;
                    default:
                        cVar = gVar;
                        break;
                }
            } else {
                cVar = b(zVar.i(), zVar);
            }
            if (cVar != null) {
                if (cVar.getType() == 1752331379) {
                    int i32 = ((d) cVar).f50451a;
                    if (i32 == 1935960438) {
                        i14 = 2;
                    } else if (i32 == 1935963489) {
                        i14 = 1;
                    } else if (i32 != 1937012852) {
                        Integer.toHexString(i32);
                        s.g();
                        i14 = -1;
                    } else {
                        i14 = 3;
                    }
                }
                aVar.g(cVar);
            }
            zVar.F(i16);
            zVar.E(i13);
        }
        return new f(i12, aVar.i());
    }

    @P
    public final <T extends a> T a(Class<T> cls) {
        O4<a> o4ListIterator = this.f50468a.listIterator(0);
        while (o4ListIterator.hasNext()) {
            T t12 = (T) o4ListIterator.next();
            if (t12.getClass() == cls) {
                return t12;
            }
        }
        return null;
    }

    @Override // androidx.media3.extractor.avi.a
    public final int getType() {
        return this.f50469b;
    }
}
