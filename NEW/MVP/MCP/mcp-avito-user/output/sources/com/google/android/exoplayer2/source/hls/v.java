package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.O;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebvttExtractor.java */
/* loaded from: classes6.dex */
public final class v implements com.google.android.exoplayer2.extractor.j {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f346605g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f346606h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    @P
    public final String f346607a;

    /* renamed from: b, reason: collision with root package name */
    public final O f346608b;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.l f346610d;

    /* renamed from: f, reason: collision with root package name */
    public int f346612f;

    /* renamed from: c, reason: collision with root package name */
    public final F f346609c = new F();

    /* renamed from: e, reason: collision with root package name */
    public byte[] f346611e = new byte[1024];

    public v(@P String str, O o12) {
        this.f346607a = str;
        this.f346608b = o12;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f346610d = lVar;
        lVar.i(new y.b(-9223372036854775807L));
    }

    @v61.m
    public final A c(long j12) {
        A aC2 = this.f346610d.c(0, 3);
        I.b bVar = new I.b();
        bVar.f343504k = "text/vtt";
        bVar.f343496c = this.f346607a;
        bVar.f343508o = j12;
        aC2.a(bVar.a());
        this.f346610d.b();
        return aC2;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(com.google.android.exoplayer2.extractor.k kVar) {
        com.google.android.exoplayer2.extractor.f fVar = (com.google.android.exoplayer2.extractor.f) kVar;
        fVar.a(this.f346611e, 0, 6, false);
        byte[] bArr = this.f346611e;
        F f12 = this.f346609c;
        f12.z(6, bArr);
        if (com.google.android.exoplayer2.text.webvtt.i.a(f12)) {
            return true;
        }
        fVar.a(this.f346611e, 6, 3, false);
        f12.z(9, this.f346611e);
        return com.google.android.exoplayer2.text.webvtt.i.a(f12);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final int i(com.google.android.exoplayer2.extractor.k kVar, com.google.android.exoplayer2.extractor.w wVar) throws ParserException, EOFException, InterruptedIOException {
        String strE;
        this.f346610d.getClass();
        int i12 = (int) ((com.google.android.exoplayer2.extractor.f) kVar).f344494c;
        int i13 = this.f346612f;
        byte[] bArr = this.f346611e;
        if (i13 == bArr.length) {
            this.f346611e = Arrays.copyOf(bArr, ((i12 != -1 ? i12 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f346611e;
        int i14 = this.f346612f;
        int i15 = ((com.google.android.exoplayer2.extractor.f) kVar).read(bArr2, i14, bArr2.length - i14);
        if (i15 != -1) {
            int i16 = this.f346612f + i15;
            this.f346612f = i16;
            if (i12 == -1 || i16 != i12) {
                return 0;
            }
        }
        F f12 = new F(this.f346611e);
        com.google.android.exoplayer2.text.webvtt.i.d(f12);
        String strE2 = f12.e();
        long j12 = 0;
        long jC2 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strE2)) {
                while (true) {
                    String strE3 = f12.e();
                    if (strE3 == null) {
                        break;
                    }
                    if (com.google.android.exoplayer2.text.webvtt.i.f347129a.matcher(strE3).matches()) {
                        do {
                            strE = f12.e();
                            if (strE != null) {
                            }
                        } while (!strE.isEmpty());
                    } else {
                        Matcher matcher2 = com.google.android.exoplayer2.text.webvtt.f.f347102a.matcher(strE3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    c(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC3 = com.google.android.exoplayer2.text.webvtt.i.c(strGroup);
                long jB2 = this.f346608b.b(((((j12 + jC3) - jC2) * 90000) / 1000000) % 8589934592L);
                A aC2 = c(jB2 - jC3);
                byte[] bArr3 = this.f346611e;
                int i17 = this.f346612f;
                F f13 = this.f346609c;
                f13.z(i17, bArr3);
                aC2.c(this.f346612f, f13);
                aC2.f(jB2, 1, this.f346612f, 0, null);
                return -1;
            }
            if (strE2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f346605g.matcher(strE2);
                if (!matcher3.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strE2), null);
                }
                Matcher matcher4 = f346606h.matcher(strE2);
                if (!matcher4.find()) {
                    throw ParserException.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strE2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC2 = com.google.android.exoplayer2.text.webvtt.i.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j12 = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strE2 = f12.e();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
