package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import j.P;

/* compiled from: ListChunk.java */
/* loaded from: classes6.dex */
final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37401r1<a> f344475a;

    /* renamed from: b, reason: collision with root package name */
    public final int f344476b;

    public f(int i12, AbstractC37401r1<a> abstractC37401r1) {
        this.f344476b = i12;
        this.f344475a = abstractC37401r1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i12, F f12) {
        String str;
        a cVar;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        int i13 = f12.f348072c;
        char c12 = 65534;
        while (f12.a() > 8) {
            int iF2 = f12.f();
            int iF3 = f12.f348071b + f12.f();
            f12.A(iF3);
            if (iF2 != 1414744396) {
                g gVar = null;
                switch (iF2) {
                    case 1718776947:
                        if (c12 == 2) {
                            f12.C(4);
                            int iF4 = f12.f();
                            int iF5 = f12.f();
                            f12.C(4);
                            switch (f12.f()) {
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
                            if (str != null) {
                                I.b bVar = new I.b();
                                bVar.f343509p = iF4;
                                bVar.f343510q = iF5;
                                bVar.f343504k = str;
                                gVar = new g(bVar.a());
                            }
                        } else if (c12 == 1) {
                            int iK2 = f12.k();
                            String str2 = iK2 != 1 ? iK2 != 85 ? iK2 != 255 ? iK2 != 8192 ? iK2 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int iK3 = f12.k();
                                int iF6 = f12.f();
                                f12.C(6);
                                int iV2 = U.v(f12.w());
                                int iK4 = f12.k();
                                byte[] bArr = new byte[iK4];
                                f12.c(0, iK4, bArr);
                                I.b bVar2 = new I.b();
                                bVar2.f343504k = str2;
                                bVar2.f343517x = iK3;
                                bVar2.f343518y = iF6;
                                if ("audio/raw".equals(str2) && iV2 != 0) {
                                    bVar2.f343519z = iV2;
                                }
                                if ("audio/mp4a-latm".equals(str2) && iK4 > 0) {
                                    bVar2.f343506m = AbstractC37401r1.E(bArr);
                                }
                                gVar = new g(bVar2.a());
                            }
                        } else {
                            int i14 = U.f348106a;
                        }
                        cVar = gVar;
                        break;
                    case 1751742049:
                        int iF7 = f12.f();
                        f12.C(8);
                        int iF8 = f12.f();
                        int iF9 = f12.f();
                        f12.C(4);
                        f12.f();
                        f12.C(12);
                        cVar = new c(iF7, iF8, iF9);
                        break;
                    case 1752331379:
                        int iF10 = f12.f();
                        f12.C(12);
                        f12.f();
                        int iF11 = f12.f();
                        int iF12 = f12.f();
                        f12.C(4);
                        int iF13 = f12.f();
                        int iF14 = f12.f();
                        f12.C(8);
                        cVar = new d(iF10, iF11, iF12, iF13, iF14);
                        break;
                    case 1852994675:
                        cVar = new h(f12.p(f12.a(), C37262f.f359034c));
                        break;
                    default:
                        cVar = gVar;
                        break;
                }
            } else {
                cVar = b(f12.f(), f12);
            }
            if (cVar != null) {
                if (cVar.getType() == 1752331379) {
                    int i15 = ((d) cVar).f344458a;
                    if (i15 == 1935960438) {
                        c12 = 2;
                    } else if (i15 == 1935963489) {
                        c12 = 1;
                    } else if (i15 != 1937012852) {
                        Integer.toHexString(i15);
                        c12 = 65535;
                    } else {
                        c12 = 3;
                    }
                }
                aVar.g(cVar);
            }
            f12.B(iF3);
            f12.A(i13);
        }
        return new f(i12, aVar.i());
    }

    @P
    public final <T extends a> T a(Class<T> cls) {
        O4<a> o4ListIterator = this.f344475a.listIterator(0);
        while (o4ListIterator.hasNext()) {
            T t12 = (T) o4ListIterator.next();
            if (t12.getClass() == cls) {
                return t12;
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.a
    public final int getType() {
        return this.f344476b;
    }
}
