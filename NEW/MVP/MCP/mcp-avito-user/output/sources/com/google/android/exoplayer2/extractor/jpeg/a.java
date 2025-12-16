package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.j;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.mp4.g;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: JpegExtractor.java */
/* loaded from: classes6.dex */
public final class a implements j {

    /* renamed from: b, reason: collision with root package name */
    public l f344553b;

    /* renamed from: c, reason: collision with root package name */
    public int f344554c;

    /* renamed from: d, reason: collision with root package name */
    public int f344555d;

    /* renamed from: e, reason: collision with root package name */
    public int f344556e;

    /* renamed from: g, reason: collision with root package name */
    @P
    public MotionPhotoMetadata f344558g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.f f344559h;

    /* renamed from: i, reason: collision with root package name */
    public c f344560i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public g f344561j;

    /* renamed from: a, reason: collision with root package name */
    public final F f344552a = new F(6);

    /* renamed from: f, reason: collision with root package name */
    public long f344557f = -1;

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        if (j12 == 0) {
            this.f344554c = 0;
            this.f344561j = null;
        } else if (this.f344554c == 5) {
            g gVar = this.f344561j;
            gVar.getClass();
            gVar.a(j12, j13);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(l lVar) {
        this.f344553b = lVar;
    }

    public final void c() {
        d(new Metadata.Entry[0]);
        l lVar = this.f344553b;
        lVar.getClass();
        lVar.b();
        this.f344553b.i(new y.b(-9223372036854775807L));
        this.f344554c = 6;
    }

    public final void d(Metadata.Entry... entryArr) {
        l lVar = this.f344553b;
        lVar.getClass();
        A aC2 = lVar.c(1024, 4);
        I.b bVar = new I.b();
        bVar.f343503j = "image/jpeg";
        bVar.f343502i = new Metadata(entryArr);
        aC2.a(bVar.a());
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(k kVar) throws EOFException, InterruptedIOException {
        com.google.android.exoplayer2.extractor.f fVar = (com.google.android.exoplayer2.extractor.f) kVar;
        F f12 = this.f344552a;
        f12.y(2);
        fVar.a(f12.f348070a, 0, 2, false);
        if (f12.w() != 65496) {
            return false;
        }
        f12.y(2);
        fVar.a(f12.f348070a, 0, 2, false);
        int iW2 = f12.w();
        this.f344555d = iW2;
        if (iW2 == 65504) {
            f12.y(2);
            fVar.a(f12.f348070a, 0, 2, false);
            fVar.l(f12.w() - 2, false);
            f12.y(2);
            fVar.a(f12.f348070a, 0, 2, false);
            this.f344555d = f12.w();
        }
        if (this.f344555d != 65505) {
            return false;
        }
        fVar.l(2, false);
        f12.y(6);
        fVar.a(f12.f348070a, 0, 6, false);
        return f12.s() == 1165519206 && f12.w() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r26, com.google.android.exoplayer2.extractor.w r27) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.jpeg.a.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
        g gVar = this.f344561j;
        if (gVar != null) {
            gVar.getClass();
        }
    }
}
