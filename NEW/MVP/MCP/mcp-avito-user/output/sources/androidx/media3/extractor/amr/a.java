package androidx.media3.extractor.amr;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.extractor.C23190i;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.H;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import com.google.common.base.C37262f;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: AmrExtractor.java */
@J
/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f50409p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f50410q;

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f50411r;

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f50412s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f50413t;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50414a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50415b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50416c;

    /* renamed from: d, reason: collision with root package name */
    public long f50417d;

    /* renamed from: e, reason: collision with root package name */
    public int f50418e;

    /* renamed from: f, reason: collision with root package name */
    public int f50419f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f50420g;

    /* renamed from: h, reason: collision with root package name */
    public long f50421h;

    /* renamed from: i, reason: collision with root package name */
    public int f50422i;

    /* renamed from: j, reason: collision with root package name */
    public int f50423j;

    /* renamed from: k, reason: collision with root package name */
    public long f50424k;

    /* renamed from: l, reason: collision with root package name */
    public r f50425l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.media3.extractor.J f50426m;

    /* renamed from: n, reason: collision with root package name */
    public H f50427n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f50428o;

    /* compiled from: AmrExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.extractor.amr.a$a, reason: collision with other inner class name */
    public @interface InterfaceC1847a {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f50410q = iArr;
        int i12 = M.f47887a;
        Charset charset = C37262f.f359034c;
        f50411r = "#!AMR\n".getBytes(charset);
        f50412s = "#!AMR-WB\n".getBytes(charset);
        f50413t = iArr[8];
    }

    public a() {
        this(0);
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        this.f50417d = 0L;
        this.f50418e = 0;
        this.f50419f = 0;
        if (j12 != 0) {
            H h12 = this.f50427n;
            if (h12 instanceof C23190i) {
                this.f50424k = (Math.max(0L, j12 - ((C23190i) h12).f50574b) * 8000000) / r0.f50577e;
                return;
            }
        }
        this.f50424k = 0L;
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) {
        return d((C23191j) qVar);
    }

    public final int c(C23191j c23191j) throws ParserException {
        boolean z12;
        c23191j.f50585f = 0;
        byte[] bArr = this.f50414a;
        c23191j.a(bArr, 0, 1, false);
        byte b12 = bArr[0];
        if ((b12 & 131) > 0) {
            throw ParserException.a("Invalid padding bits for frame header " + ((int) b12), null);
        }
        int i12 = (b12 >> 3) & 15;
        if (i12 >= 0 && i12 <= 15 && (((z12 = this.f50416c) && (i12 < 10 || i12 > 13)) || (!z12 && (i12 < 12 || i12 > 14)))) {
            return z12 ? f50410q[i12] : f50409p[i12];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.f50416c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i12);
        throw ParserException.a(sb2.toString(), null);
    }

    public final boolean d(C23191j c23191j) throws EOFException, InterruptedIOException {
        c23191j.f50585f = 0;
        byte[] bArr = f50411r;
        byte[] bArr2 = new byte[bArr.length];
        c23191j.a(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f50416c = false;
            c23191j.i(bArr.length);
            return true;
        }
        c23191j.f50585f = 0;
        byte[] bArr3 = f50412s;
        byte[] bArr4 = new byte[bArr3.length];
        c23191j.a(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f50416c = true;
        c23191j.i(bArr3.length);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r18, androidx.media3.extractor.F r19) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.amr.a.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f50425l = rVar;
        this.f50426m = rVar.c(0, 1);
        rVar.b();
    }

    public a(int i12) {
        this.f50415b = i12;
        this.f50414a = new byte[1];
        this.f50422i = -1;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
