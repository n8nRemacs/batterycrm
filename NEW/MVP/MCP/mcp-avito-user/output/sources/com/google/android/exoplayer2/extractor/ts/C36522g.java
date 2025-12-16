package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.common.base.C37262f;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DefaultTsPayloadReaderFactory.java */
/* renamed from: com.google.android.exoplayer2.extractor.ts.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36522g implements D.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f345104a;

    /* renamed from: b, reason: collision with root package name */
    public final List<I> f345105b;

    /* compiled from: DefaultTsPayloadReaderFactory.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.extractor.ts.g$a */
    public @interface a {
    }

    public C36522g() {
        this(0);
    }

    @P
    public final D a(int i12, D.b bVar) {
        if (i12 != 2) {
            String str = bVar.f345033a;
            if (i12 == 3 || i12 == 4) {
                return new t(new q(str));
            }
            if (i12 == 21) {
                return new t(new o());
            }
            if (i12 == 27) {
                if (c(4)) {
                    return null;
                }
                return new t(new m(new z(b(bVar)), c(1), c(8)));
            }
            if (i12 == 36) {
                return new t(new n(new z(b(bVar))));
            }
            if (i12 == 89) {
                return new t(new i(bVar.f345034b));
            }
            if (i12 != 138) {
                if (i12 == 172) {
                    return new t(new C36519d(str));
                }
                if (i12 == 257) {
                    return new y(new s("application/vnd.dvb.ait"));
                }
                if (i12 == 134) {
                    if (c(16)) {
                        return null;
                    }
                    return new y(new s("application/x-scte35"));
                }
                if (i12 != 135) {
                    switch (i12) {
                        case 15:
                            if (!c(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!c(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i12) {
                                case 130:
                                    if (!c(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new t(new C36517b(str));
            }
            return new t(new h(str));
        }
        return new t(new k(new F(b(bVar))));
    }

    public final List<I> b(D.b bVar) {
        String str;
        int i12;
        boolean zC2 = c(32);
        List<I> list = this.f345105b;
        if (zC2) {
            return list;
        }
        com.google.android.exoplayer2.util.F f12 = new com.google.android.exoplayer2.util.F(bVar.f345035c);
        while (f12.a() > 0) {
            int iR2 = f12.r();
            int iR3 = f12.f348071b + f12.r();
            if (iR2 == 134) {
                ArrayList arrayList = new ArrayList();
                int iR4 = f12.r() & 31;
                for (int i13 = 0; i13 < iR4; i13++) {
                    String strP = f12.p(3, C37262f.f359034c);
                    int iR5 = f12.r();
                    boolean z12 = (iR5 & 128) != 0;
                    if (z12) {
                        i12 = iR5 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i12 = 1;
                    }
                    byte bR2 = (byte) f12.r();
                    f12.C(1);
                    List<byte[]> listSingletonList = z12 ? Collections.singletonList((bR2 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    I.b bVar2 = new I.b();
                    bVar2.f343504k = str;
                    bVar2.f343496c = strP;
                    bVar2.f343492C = i12;
                    bVar2.f343506m = listSingletonList;
                    arrayList.add(bVar2.a());
                }
                list = arrayList;
            }
            f12.B(iR3);
        }
        return list;
    }

    public final boolean c(int i12) {
        return (i12 & this.f345104a) != 0;
    }

    public C36522g(int i12) {
        this(0, AbstractC37401r1.C());
    }

    public C36522g(int i12, List<I> list) {
        this.f345104a = i12;
        this.f345105b = list;
    }
}
