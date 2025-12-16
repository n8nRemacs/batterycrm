package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.impl.vw;

/* loaded from: classes8.dex */
final class k90 implements hd {

    /* renamed from: a, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<hd> f387087a;

    /* renamed from: b, reason: collision with root package name */
    private final int f387088b;

    private k90(int i12, com.yandex.mobile.ads.embedded.guava.collect.p<hd> pVar) {
        this.f387088b = i12;
        this.f387087a = pVar;
    }

    public static k90 a(int i12, pr0 pr0Var) {
        hd c71Var;
        String str;
        p.a aVar = new p.a();
        int iE2 = pr0Var.e();
        int i13 = -2;
        while (pr0Var.a() > 8) {
            int iK2 = pr0Var.k();
            int iD2 = pr0Var.d() + pr0Var.k();
            pr0Var.d(iD2);
            if (iK2 == 1414744396) {
                c71Var = a(pr0Var.k(), pr0Var);
            } else if (iK2 != 1718776947) {
                c71Var = iK2 != 1751742049 ? iK2 != 1752331379 ? iK2 != 1852994675 ? null : d71.a(pr0Var) : kd.a(pr0Var) : jd.a(pr0Var);
            } else if (i13 == 2) {
                pr0Var.f(4);
                int iK3 = pr0Var.k();
                int iK4 = pr0Var.k();
                pr0Var.f(4);
                int iK5 = pr0Var.k();
                switch (iK5) {
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
                    j90.a("Ignoring track with unsupported compression ", iK5, "StreamFormatChunk");
                } else {
                    vw.a aVar2 = new vw.a();
                    aVar2.q(iK3).g(iK4).f(str);
                    c71Var = new c71(aVar2.a());
                }
            } else {
                if (i13 == 1) {
                    int iO2 = pr0Var.o();
                    String str2 = iO2 != 1 ? iO2 != 85 ? iO2 != 255 ? iO2 != 8192 ? iO2 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                    if (str2 == null) {
                        j90.a("Ignoring track with unsupported format tag ", iO2, "StreamFormatChunk");
                    } else {
                        int iO3 = pr0Var.o();
                        int iK6 = pr0Var.k();
                        pr0Var.f(6);
                        int iB2 = pc1.b(pr0Var.z());
                        int iO4 = pr0Var.o();
                        byte[] bArr = new byte[iO4];
                        pr0Var.a(bArr, 0, iO4);
                        vw.a aVar3 = new vw.a();
                        aVar3.f(str2).c(iO3).n(iK6);
                        if ("audio/raw".equals(str2) && iB2 != 0) {
                            aVar3.j(iB2);
                        }
                        if ("audio/mp4a-latm".equals(str2) && iO4 > 0) {
                            aVar3.a(com.yandex.mobile.ads.embedded.guava.collect.p.a(bArr));
                        }
                        c71Var = new c71(aVar3.a());
                    }
                } else {
                    StringBuilder sbA = Cif.a("Ignoring strf box for unsupported track type: ");
                    sbA.append(pc1.d(i13));
                    ka0.d("StreamFormatChunk", sbA.toString());
                }
            }
            if (c71Var != null) {
                if (c71Var.getType() == 1752331379) {
                    kd kdVar = (kd) c71Var;
                    int i14 = kdVar.f387105a;
                    if (i14 == 1935960438) {
                        i13 = 2;
                    } else if (i14 == 1935963489) {
                        i13 = 1;
                    } else if (i14 != 1937012852) {
                        StringBuilder sbA2 = Cif.a("Found unsupported streamType fourCC: ");
                        sbA2.append(Integer.toHexString(kdVar.f387105a));
                        ka0.d("AviStreamHeaderChunk", sbA2.toString());
                        i13 = -1;
                    } else {
                        i13 = 3;
                    }
                }
                aVar.b(c71Var);
            }
            pr0Var.e(iD2);
            pr0Var.d(iE2);
        }
        return new k90(i12, aVar.a());
    }

    @Override // com.yandex.mobile.ads.impl.hd
    public final int getType() {
        return this.f387088b;
    }
}
