package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.J;
import androidx.media3.extractor.ts.D;
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
@J
/* renamed from: androidx.media3.extractor.ts.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23203g implements D.c {

    /* renamed from: a, reason: collision with root package name */
    public final List<C23108t> f51609a;

    /* compiled from: DefaultTsPayloadReaderFactory.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.extractor.ts.g$a */
    public @interface a {
    }

    public C23203g() {
        this(0);
    }

    @P
    public final D a(int i12, D.b bVar) {
        if (i12 != 2) {
            String str = bVar.f51535a;
            if (i12 == 3 || i12 == 4) {
                return new t(new q(str));
            }
            if (i12 == 21) {
                return new t(new o());
            }
            if (i12 == 27) {
                return new t(new m(new z(b(bVar)), false, false));
            }
            if (i12 == 36) {
                return new t(new n(new z(b(bVar))));
            }
            if (i12 == 89) {
                return new t(new i(bVar.f51536b));
            }
            if (i12 == 138) {
                return new t(new h(str));
            }
            if (i12 == 172) {
                return new t(new C23200d(str));
            }
            if (i12 == 257) {
                return new y(new s("application/vnd.dvb.ait"));
            }
            if (i12 == 134) {
                return new y(new s("application/x-scte35"));
            }
            if (i12 != 135) {
                switch (i12) {
                    case 15:
                        return new t(new C23202f(false, str));
                    case 16:
                        return new t(new l(new F(b(bVar))));
                    case 17:
                        return new t(new p(str));
                    default:
                        switch (i12) {
                            case 128:
                                break;
                            case 129:
                                break;
                            case 130:
                            default:
                                return null;
                        }
                }
            }
            return new t(new C23198b(str));
        }
        return new t(new k(new F(b(bVar))));
    }

    public final List<C23108t> b(D.b bVar) {
        String str;
        int i12;
        List<C23108t> list = this.f51609a;
        androidx.media3.common.util.z zVar = new androidx.media3.common.util.z(bVar.f51537c);
        while (zVar.a() > 0) {
            int iU2 = zVar.u();
            int iU3 = zVar.f47963b + zVar.u();
            if (iU2 == 134) {
                ArrayList arrayList = new ArrayList();
                int iU4 = zVar.u() & 31;
                for (int i13 = 0; i13 < iU4; i13++) {
                    String strS = zVar.s(3, C37262f.f359034c);
                    int iU5 = zVar.u();
                    boolean z12 = (iU5 & 128) != 0;
                    if (z12) {
                        i12 = iU5 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i12 = 1;
                    }
                    byte bU2 = (byte) zVar.u();
                    zVar.G(1);
                    List<byte[]> listSingletonList = z12 ? Collections.singletonList((bU2 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    C23108t.b bVar2 = new C23108t.b();
                    bVar2.f47787k = str;
                    bVar2.f47779c = strS;
                    bVar2.f47773C = i12;
                    bVar2.f47789m = listSingletonList;
                    arrayList.add(bVar2.a());
                }
                list = arrayList;
            }
            zVar.F(iU3);
        }
        return list;
    }

    public C23203g(int i12) {
        this(AbstractC37401r1.C());
    }

    public C23203g(List list) {
        this.f51609a = list;
    }
}
