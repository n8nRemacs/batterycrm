package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lj0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class gd {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f385711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f385712b;

    /* renamed from: c, reason: collision with root package name */
    public final int f385713c;

    /* renamed from: d, reason: collision with root package name */
    public final int f385714d;

    /* renamed from: e, reason: collision with root package name */
    public final float f385715e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final String f385716f;

    private gd(ArrayList arrayList, int i12, int i13, int i14, float f12, @j.P String str) {
        this.f385711a = arrayList;
        this.f385712b = i12;
        this.f385713c = i13;
        this.f385714d = i14;
        this.f385715e = f12;
        this.f385716f = str;
    }

    public static gd a(pr0 pr0Var) {
        int i12;
        int i13;
        float f12;
        String str;
        try {
            pr0Var.f(4);
            int iT2 = (pr0Var.t() & 3) + 1;
            if (iT2 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iT3 = pr0Var.t() & 31;
            for (int i14 = 0; i14 < iT3; i14++) {
                int iZ2 = pr0Var.z();
                int iD2 = pr0Var.d();
                pr0Var.f(iZ2);
                arrayList.add(jk.a(pr0Var.c(), iD2, iZ2));
            }
            int iT4 = pr0Var.t();
            for (int i15 = 0; i15 < iT4; i15++) {
                int iZ3 = pr0Var.z();
                int iD3 = pr0Var.d();
                pr0Var.f(iZ3);
                arrayList.add(jk.a(pr0Var.c(), iD3, iZ3));
            }
            if (iT3 > 0) {
                lj0.c cVarB = lj0.b((byte[]) arrayList.get(0), iT2, ((byte[]) arrayList.get(0)).length);
                int i16 = cVarB.f387538e;
                int i17 = cVarB.f387539f;
                float f13 = cVarB.f387540g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(cVarB.f387534a), Integer.valueOf(cVarB.f387535b), Integer.valueOf(cVarB.f387536c));
                i12 = i16;
                i13 = i17;
                f12 = f13;
            } else {
                i12 = -1;
                i13 = -1;
                f12 = 1.0f;
                str = null;
            }
            return new gd(arrayList, iT2, i12, i13, f12, str);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw tr0.a("Error parsing AVC config", e12);
        }
    }
}
