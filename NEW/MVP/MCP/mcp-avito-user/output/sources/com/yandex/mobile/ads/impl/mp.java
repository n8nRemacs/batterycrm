package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class mp implements fb1.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f388055a;

    /* renamed from: b, reason: collision with root package name */
    private final List<vw> f388056b;

    public mp() {
        this(com.yandex.mobile.ads.embedded.guava.collect.p.i());
    }

    @Override // com.yandex.mobile.ads.impl.fb1.c
    public final SparseArray<fb1> a() {
        return new SparseArray<>();
    }

    public mp(List list) {
        this.f388055a = 0;
        this.f388056b = list;
    }

    @Override // com.yandex.mobile.ads.impl.fb1.c
    @j.P
    public final fb1 a(int i12, fb1.b bVar) {
        if (i12 != 2) {
            if (i12 == 3 || i12 == 4) {
                return new is0(new nh0(bVar.f385259a));
            }
            if (i12 == 21) {
                return new is0(new e20());
            }
            if (i12 == 27) {
                if (a(4)) {
                    return null;
                }
                return new is0(new zy(new c31(a(bVar)), a(1), a(8)));
            }
            if (i12 == 36) {
                return new is0(new az(new c31(a(bVar))));
            }
            if (i12 == 89) {
                return new is0(new es(bVar.f385260b));
            }
            if (i12 != 138) {
                if (i12 == 172) {
                    return new is0(new C39338k(bVar.f385259a));
                }
                if (i12 == 257) {
                    return new w21(new zr0("application/vnd.dvb.ait"));
                }
                if (i12 == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new w21(new zr0("application/x-scte35"));
                }
                if (i12 != 135) {
                    switch (i12) {
                        case 15:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case 17:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i12) {
                                case 130:
                                    if (!a(64)) {
                                    }
                                    break;
                            }
                    }
                    return null;
                }
                return new is0(new C39329h(bVar.f385259a));
            }
            return new is0(new vr(bVar.f385259a));
        }
        return new is0(new xy(new oc1(a(bVar))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private List<vw> a(fb1.b bVar) {
        String str;
        int i12;
        List<byte[]> listSingletonList;
        if (a(32)) {
            return this.f388056b;
        }
        pr0 pr0Var = new pr0(bVar.f385261c);
        ArrayList arrayList = this.f388056b;
        while (pr0Var.a() > 0) {
            int iT2 = pr0Var.t();
            int iD2 = pr0Var.d() + pr0Var.t();
            if (iT2 == 134) {
                arrayList = new ArrayList();
                int iT3 = pr0Var.t() & 31;
                for (int i13 = 0; i13 < iT3; i13++) {
                    String strA = pr0Var.a(3, oi.f388554c);
                    int iT4 = pr0Var.t();
                    boolean z12 = (iT4 & 128) != 0;
                    if (z12) {
                        i12 = iT4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i12 = 1;
                    }
                    byte bT2 = (byte) pr0Var.t();
                    pr0Var.f(1);
                    if (z12) {
                        listSingletonList = Collections.singletonList((bT2 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    arrayList.add(new vw.a().f(str).e(strA).a(i12).a(listSingletonList).a());
                }
            }
            pr0Var.e(iD2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    private boolean a(int i12) {
        return (i12 & this.f388055a) != 0;
    }
}
