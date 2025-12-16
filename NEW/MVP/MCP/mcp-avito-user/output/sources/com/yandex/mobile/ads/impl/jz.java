package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lj0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class jz {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f387006a;

    /* renamed from: b, reason: collision with root package name */
    public final int f387007b;

    /* renamed from: c, reason: collision with root package name */
    public final float f387008c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f387009d;

    private jz(List list, int i12, float f12, @j.P String str) {
        this.f387006a = list;
        this.f387007b = i12;
        this.f387008c = f12;
        this.f387009d = str;
    }

    public static jz a(pr0 pr0Var) {
        int i12;
        try {
            pr0Var.f(21);
            int iT2 = pr0Var.t() & 3;
            int iT3 = pr0Var.t();
            int iD2 = pr0Var.d();
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < iT3; i15++) {
                pr0Var.f(1);
                int iZ2 = pr0Var.z();
                for (int i16 = 0; i16 < iZ2; i16++) {
                    int iZ3 = pr0Var.z();
                    i14 += iZ3 + 4;
                    pr0Var.f(iZ3);
                }
            }
            pr0Var.e(iD2);
            byte[] bArr = new byte[i14];
            float f12 = 1.0f;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iT3) {
                int iT4 = pr0Var.t() & 127;
                int iZ4 = pr0Var.z();
                int i19 = i13;
                while (i19 < iZ4) {
                    int iZ5 = pr0Var.z();
                    System.arraycopy(lj0.f387520a, i13, bArr, i18, 4);
                    int i22 = i18 + 4;
                    System.arraycopy(pr0Var.c(), pr0Var.d(), bArr, i22, iZ5);
                    if (iT4 == 33 && i19 == 0) {
                        lj0.a aVarA = lj0.a(bArr, i22, i22 + iZ5);
                        float f13 = aVarA.f387530g;
                        i12 = iT3;
                        strA = jk.a(aVarA.f387524a, aVarA.f387525b, aVarA.f387526c, aVarA.f387527d, aVarA.f387528e, aVarA.f387529f);
                        f12 = f13;
                    } else {
                        i12 = iT3;
                    }
                    i18 = i22 + iZ5;
                    pr0Var.f(iZ5);
                    i19++;
                    iT3 = i12;
                    i13 = 0;
                }
                i17++;
                i13 = 0;
            }
            return new jz(i14 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iT2 + 1, f12, strA);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw tr0.a("Error parsing HEVC config", e12);
        }
    }
}
