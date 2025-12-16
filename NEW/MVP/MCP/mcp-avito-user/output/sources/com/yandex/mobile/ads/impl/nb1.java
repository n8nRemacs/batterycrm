package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.yandex.mobile.ads.impl.vm;
import java.util.List;

/* loaded from: classes8.dex */
public final class nb1 extends d41 {

    /* renamed from: m, reason: collision with root package name */
    private final pr0 f388200m = new pr0();

    /* renamed from: n, reason: collision with root package name */
    private final boolean f388201n;

    /* renamed from: o, reason: collision with root package name */
    private final int f388202o;

    /* renamed from: p, reason: collision with root package name */
    private final int f388203p;

    /* renamed from: q, reason: collision with root package name */
    private final String f388204q;

    /* renamed from: r, reason: collision with root package name */
    private final float f388205r;

    /* renamed from: s, reason: collision with root package name */
    private final int f388206s;

    public nb1(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f388202o = 0;
            this.f388203p = -1;
            this.f388204q = "sans-serif";
            this.f388201n = false;
            this.f388205r = 0.85f;
            this.f388206s = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f388202o = bArr[24];
        this.f388203p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f388204q = "Serif".equals(pc1.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i12 = bArr[25] * 20;
        this.f388206s = i12;
        boolean z12 = (bArr[0] & 32) != 0;
        this.f388201n = z12;
        if (z12) {
            this.f388205r = pc1.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i12);
        } else {
            this.f388205r = 0.85f;
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i12, int i13, int i14, int i15, int i16) {
        if (i12 != i13) {
            int i17 = i16 | 33;
            boolean z12 = (i12 & 1) != 0;
            boolean z13 = (i12 & 2) != 0;
            if (z12) {
                if (z13) {
                    androidx.media3.extractor.text.cea.a.a(3, spannableStringBuilder, i14, i15, i17);
                } else {
                    androidx.media3.extractor.text.cea.a.a(1, spannableStringBuilder, i14, i15, i17);
                }
            } else if (z13) {
                androidx.media3.extractor.text.cea.a.a(2, spannableStringBuilder, i14, i15, i17);
            }
            boolean z14 = (i12 & 4) != 0;
            if (z14) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, i15, i17);
            }
            if (z14 || z12 || z13) {
                return;
            }
            androidx.media3.extractor.text.cea.a.a(0, spannableStringBuilder, i14, i15, i17);
        }
    }

    @Override // com.yandex.mobile.ads.impl.d41
    public final t71 a(byte[] bArr, int i12, boolean z12) throws v71 {
        String strA;
        char cF2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 1;
        int i18 = 8;
        this.f388200m.a(i12, bArr);
        pr0 pr0Var = this.f388200m;
        int i19 = 2;
        if (pr0Var.a() >= 2) {
            int iZ2 = pr0Var.z();
            if (iZ2 == 0) {
                strA = "";
            } else if (pr0Var.a() >= 2 && ((cF2 = pr0Var.f()) == 65279 || cF2 == 65534)) {
                strA = pr0Var.a(iZ2, oi.f388556e);
            } else {
                strA = pr0Var.a(iZ2, oi.f388554c);
            }
            if (strA.isEmpty()) {
                return ob1.f388482b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
            a(spannableStringBuilder, this.f388202o, 0, 0, spannableStringBuilder.length(), 16711680);
            int i22 = this.f388203p;
            int length = spannableStringBuilder.length();
            int i23 = 0;
            if (i22 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan((i22 >>> 8) | ((i22 & 255) << 24)), 0, length, 16711713);
            }
            String str = this.f388204q;
            int length2 = spannableStringBuilder.length();
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float fMax = this.f388205r;
            while (this.f388200m.a() >= i18) {
                int iD2 = this.f388200m.d();
                int iH2 = this.f388200m.h();
                int iH3 = this.f388200m.h();
                if (iH3 == 1937013100) {
                    if (this.f388200m.a() >= i19) {
                        int iZ3 = this.f388200m.z();
                        int i24 = i23;
                        while (i24 < iZ3) {
                            pr0 pr0Var2 = this.f388200m;
                            if (pr0Var2.a() >= 12) {
                                int iZ4 = pr0Var2.z();
                                int iZ5 = pr0Var2.z();
                                pr0Var2.f(i19);
                                int iT2 = pr0Var2.t();
                                pr0Var2.f(i17);
                                int iH4 = pr0Var2.h();
                                if (iZ5 > spannableStringBuilder.length()) {
                                    StringBuilder sbJ = androidx.camera.camera2.internal.G.j(iZ5, "Truncating styl end (", ") to cueText.length() (");
                                    sbJ.append(spannableStringBuilder.length());
                                    sbJ.append(").");
                                    ka0.d("Tx3gDecoder", sbJ.toString());
                                    iZ5 = spannableStringBuilder.length();
                                }
                                int i25 = iZ5;
                                if (iZ4 >= i25) {
                                    ka0.d("Tx3gDecoder", androidx.appcompat.app.r.l(iZ4, i25, "Ignoring styl with start (", ") >= end (", ")."));
                                    i14 = i24;
                                    i15 = iZ3;
                                    i17 = 1;
                                    i16 = 8;
                                } else {
                                    i14 = i24;
                                    i15 = iZ3;
                                    a(spannableStringBuilder, iT2, this.f388202o, iZ4, i25, 0);
                                    if (iH4 != this.f388203p) {
                                        i16 = 8;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((iH4 & 255) << 24) | (iH4 >>> 8)), iZ4, i25, 33);
                                    } else {
                                        i16 = 8;
                                    }
                                    i17 = 1;
                                }
                                i24 = i14 + 1;
                                i18 = i16;
                                iZ3 = i15;
                                i19 = 2;
                            } else {
                                throw new v71("Unexpected subtitle format.");
                            }
                        }
                        i13 = i18;
                    } else {
                        throw new v71("Unexpected subtitle format.");
                    }
                } else {
                    i13 = i18;
                    if (iH3 == 1952608120 && this.f388201n) {
                        i19 = 2;
                        if (this.f388200m.a() >= 2) {
                            int i26 = pc1.f388768a;
                            fMax = Math.max(0.0f, Math.min(this.f388200m.z() / this.f388206s, 0.95f));
                        } else {
                            throw new v71("Unexpected subtitle format.");
                        }
                    } else {
                        i19 = 2;
                    }
                }
                this.f388200m.e(iD2 + iH2);
                i18 = i13;
                i23 = 0;
            }
            return new ob1(new vm.a().a(spannableStringBuilder).a(0, fMax).a(0).a());
        }
        throw new v71("Unexpected subtitle format.");
    }
}
