package androidx.media3.extractor.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.text.a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.d;
import androidx.media3.extractor.text.e;
import com.google.common.base.C37262f;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: Tx3gDecoder.java */
@J
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: o, reason: collision with root package name */
    public final z f51430o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f51431p;

    /* renamed from: q, reason: collision with root package name */
    public final int f51432q;

    /* renamed from: r, reason: collision with root package name */
    public final int f51433r;

    /* renamed from: s, reason: collision with root package name */
    public final String f51434s;

    /* renamed from: t, reason: collision with root package name */
    public final float f51435t;

    /* renamed from: u, reason: collision with root package name */
    public final int f51436u;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f51430o = new z();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f51432q = 0;
            this.f51433r = -1;
            this.f51434s = "sans-serif";
            this.f51431p = false;
            this.f51435t = 0.85f;
            this.f51436u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f51432q = bArr[24];
        this.f51433r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        int i12 = M.f47887a;
        this.f51434s = "Serif".equals(new String(bArr, 43, length, C37262f.f359034c)) ? "serif" : "sans-serif";
        int i13 = bArr[25] * 20;
        this.f51436u = i13;
        boolean z12 = (bArr[0] & 32) != 0;
        this.f51431p = z12;
        if (z12) {
            this.f51435t = M.j(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i13, 0.0f, 0.95f);
        } else {
            this.f51435t = 0.85f;
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

    @Override // androidx.media3.extractor.text.d
    public final e i(int i12, byte[] bArr, boolean z12) throws SubtitleDecoderException {
        String strS;
        int i13;
        z zVar = this.f51430o;
        zVar.D(i12, bArr);
        if (zVar.a() < 2) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
        int iZ2 = zVar.z();
        if (iZ2 == 0) {
            strS = "";
        } else {
            int i14 = zVar.f47963b;
            Charset charsetB = zVar.B();
            int i15 = iZ2 - (zVar.f47963b - i14);
            if (charsetB == null) {
                charsetB = C37262f.f359034c;
            }
            strS = zVar.s(i15, charsetB);
        }
        if (strS.isEmpty()) {
            return b.f51437c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        k(spannableStringBuilder, this.f51432q, 0, 0, spannableStringBuilder.length(), 16711680);
        j(spannableStringBuilder, this.f51433r, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f51434s;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fJ2 = this.f51435t;
        while (zVar.a() >= 8) {
            int i16 = zVar.f47963b;
            int iG2 = zVar.g();
            int iG3 = zVar.g();
            if (iG3 == 1937013100) {
                if (zVar.a() < 2) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                int iZ3 = zVar.z();
                int i17 = 0;
                while (i17 < iZ3) {
                    if (zVar.a() < 12) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    int iZ4 = zVar.z();
                    int iZ5 = zVar.z();
                    zVar.G(2);
                    int iU2 = zVar.u();
                    zVar.G(1);
                    int iG4 = zVar.g();
                    if (iZ5 > spannableStringBuilder.length()) {
                        spannableStringBuilder.length();
                        s.g();
                        iZ5 = spannableStringBuilder.length();
                    }
                    int i18 = iZ5;
                    if (iZ4 >= i18) {
                        s.g();
                        i13 = i17;
                    } else {
                        i13 = i17;
                        k(spannableStringBuilder, iU2, this.f51432q, iZ4, i18, 0);
                        j(spannableStringBuilder, iG4, this.f51433r, iZ4, i18, 0);
                    }
                    i17 = i13 + 1;
                }
            } else if (iG3 == 1952608120 && this.f51431p) {
                if (zVar.a() < 2) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                fJ2 = M.j(zVar.z() / this.f51436u, 0.0f, 0.95f);
            }
            zVar.F(i16 + iG2);
        }
        a.c cVar = new a.c();
        cVar.f47839a = spannableStringBuilder;
        cVar.f47843e = fJ2;
        cVar.f47844f = 0;
        cVar.f47845g = 0;
        return new b(cVar.a());
    }
}
