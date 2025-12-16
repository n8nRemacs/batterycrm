package com.yandex.mobile.ads.impl;

import com.facebook.imageutils.JfifUtil;
import com.yandex.mobile.ads.impl.hb0;
import java.util.ArrayDeque;

/* loaded from: classes8.dex */
final class ro implements hs {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f389589a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<a> f389590b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final yc1 f389591c = new yc1();

    /* renamed from: d, reason: collision with root package name */
    private gs f389592d;

    /* renamed from: e, reason: collision with root package name */
    private int f389593e;

    /* renamed from: f, reason: collision with root package name */
    private int f389594f;

    /* renamed from: g, reason: collision with root package name */
    private long f389595g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f389596a;

        /* renamed from: b, reason: collision with root package name */
        private final long f389597b;

        public /* synthetic */ a(int i12, long j12, int i13) {
            this(i12, j12);
        }

        private a(int i12, long j12) {
            this.f389596a = i12;
            this.f389597b = j12;
        }
    }

    public final void a(gs gsVar) {
        this.f389592d = gsVar;
    }

    public final void a() {
        this.f389593e = 0;
        this.f389590b.clear();
        this.f389591c.b();
    }

    public final boolean a(to toVar) {
        int i12;
        String str;
        double dLongBitsToDouble;
        db.b(this.f389592d);
        while (true) {
            a aVarPeek = this.f389590b.peek();
            if (aVarPeek != null && toVar.getPosition() >= aVarPeek.f389597b) {
                hb0.this.b(this.f389590b.pop().f389596a);
                return true;
            }
            int i13 = 0;
            if (this.f389593e == 0) {
                long jA2 = this.f389591c.a(toVar, true, false, 4);
                if (jA2 == -2) {
                    toVar.c();
                    while (true) {
                        toVar.b(this.f389589a, 0, 4, false);
                        int iA2 = yc1.a(this.f389589a[0]);
                        if (iA2 != -1 && iA2 <= 4) {
                            int iA3 = (int) yc1.a(this.f389589a, iA2, false);
                            if (((hb0.a) this.f389592d).a(iA3)) {
                                toVar.a(iA2);
                                jA2 = iA3;
                            }
                        }
                        toVar.a(1);
                    }
                }
                if (jA2 == -1) {
                    return false;
                }
                this.f389594f = (int) jA2;
                this.f389593e = 1;
            }
            if (this.f389593e == 1) {
                this.f389595g = this.f389591c.a(toVar, false, true, 8);
                this.f389593e = 2;
            }
            gs gsVar = this.f389592d;
            int i14 = this.f389594f;
            hb0.this.getClass();
            switch (i14) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case JfifUtil.MARKER_RST7 /* 215 */:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i12 = 2;
                    break;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    i12 = 3;
                    break;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case JfifUtil.MARKER_APP1 /* 225 */:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i12 = 1;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i12 = 4;
                    break;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i12 = 5;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            if (i12 != 0) {
                if (i12 == 1) {
                    long position = toVar.getPosition();
                    this.f389590b.push(new a(this.f389594f, this.f389595g + position, i13));
                    hb0.this.a(this.f389594f, position, this.f389595g);
                    this.f389593e = 0;
                    return true;
                }
                long j12 = 0;
                if (i12 == 2) {
                    long j13 = this.f389595g;
                    if (j13 <= 8) {
                        gs gsVar2 = this.f389592d;
                        int i15 = this.f389594f;
                        int i16 = (int) j13;
                        toVar.a(this.f389589a, 0, i16, false);
                        for (int i17 = 0; i17 < i16; i17++) {
                            j12 = (this.f389589a[i17] & 255) | (j12 << 8);
                        }
                        hb0.this.a(i15, j12);
                        this.f389593e = 0;
                        return true;
                    }
                    StringBuilder sbA = Cif.a("Invalid integer size: ");
                    sbA.append(this.f389595g);
                    throw tr0.a(sbA.toString(), (Exception) null);
                }
                if (i12 == 3) {
                    long j14 = this.f389595g;
                    if (j14 <= 2147483647L) {
                        gs gsVar3 = this.f389592d;
                        int i18 = this.f389594f;
                        int i19 = (int) j14;
                        if (i19 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i19];
                            toVar.a(bArr, 0, i19, false);
                            while (i19 > 0 && bArr[i19 - 1] == 0) {
                                i19--;
                            }
                            str = new String(bArr, 0, i19);
                        }
                        hb0.this.a(i18, str);
                        this.f389593e = 0;
                        return true;
                    }
                    StringBuilder sbA2 = Cif.a("String element size: ");
                    sbA2.append(this.f389595g);
                    throw tr0.a(sbA2.toString(), (Exception) null);
                }
                if (i12 == 4) {
                    hb0.this.a(this.f389594f, (int) this.f389595g, toVar);
                    this.f389593e = 0;
                    return true;
                }
                if (i12 == 5) {
                    long j15 = this.f389595g;
                    if (j15 != 4 && j15 != 8) {
                        StringBuilder sbA3 = Cif.a("Invalid float size: ");
                        sbA3.append(this.f389595g);
                        throw tr0.a(sbA3.toString(), (Exception) null);
                    }
                    gs gsVar4 = this.f389592d;
                    int i22 = this.f389594f;
                    int i23 = (int) j15;
                    toVar.a(this.f389589a, 0, i23, false);
                    for (int i24 = 0; i24 < i23; i24++) {
                        j12 = (j12 << 8) | (this.f389589a[i24] & 255);
                    }
                    if (i23 == 4) {
                        dLongBitsToDouble = Float.intBitsToFloat((int) j12);
                    } else {
                        dLongBitsToDouble = Double.longBitsToDouble(j12);
                    }
                    hb0.this.a(i22, dLongBitsToDouble);
                    this.f389593e = 0;
                    return true;
                }
                throw tr0.a("Invalid element type " + i12, (Exception) null);
            }
            toVar.a((int) this.f389595g);
            this.f389593e = 0;
        }
    }
}
