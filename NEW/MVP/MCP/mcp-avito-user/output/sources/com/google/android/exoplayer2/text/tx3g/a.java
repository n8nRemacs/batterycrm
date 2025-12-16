package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import java.util.List;

/* compiled from: Tx3gDecoder.java */
/* loaded from: classes6.dex */
public final class a extends g {

    /* renamed from: o, reason: collision with root package name */
    public final F f347067o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f347068p;

    /* renamed from: q, reason: collision with root package name */
    public final int f347069q;

    /* renamed from: r, reason: collision with root package name */
    public final int f347070r;

    /* renamed from: s, reason: collision with root package name */
    public final String f347071s;

    /* renamed from: t, reason: collision with root package name */
    public final float f347072t;

    /* renamed from: u, reason: collision with root package name */
    public final int f347073u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f347067o = new F();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f347069q = 0;
            this.f347070r = -1;
            this.f347071s = "sans-serif";
            this.f347068p = false;
            this.f347072t = 0.85f;
            this.f347073u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f347069q = bArr[24];
        this.f347070r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        int i12 = U.f348106a;
        this.f347071s = "Serif".equals(new String(bArr, 43, length, C37262f.f359034c)) ? "serif" : "sans-serif";
        int i13 = bArr[25] * 20;
        this.f347073u = i13;
        boolean z12 = (bArr[0] & 32) != 0;
        this.f347068p = z12;
        if (z12) {
            this.f347072t = U.j(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i13, 0.0f, 0.95f);
        } else {
            this.f347072t = 0.85f;
        }
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, int i12, int i13, int i14, int i15, int i16) {
        if (i12 != i13) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i12 >>> 8) | ((i12 & 255) << 24)), i14, i15, i16 | 33);
        }
    }

    public static void k(SpannableStringBuilder spannableStringBuilder, int i12, int i13, int i14, int i15, int i16) {
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // com.google.android.exoplayer2.text.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.text.h i(int r24, byte[] r25, boolean r26) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.tx3g.a.i(int, byte[], boolean):com.google.android.exoplayer2.text.h");
    }
}
