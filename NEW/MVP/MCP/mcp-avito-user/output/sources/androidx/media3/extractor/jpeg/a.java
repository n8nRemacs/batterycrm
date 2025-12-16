package androidx.media3.extractor.jpeg;

import androidx.media3.common.C23108t;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.H;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.g;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: JpegExtractor.java */
@J
/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public r f50588b;

    /* renamed from: c, reason: collision with root package name */
    public int f50589c;

    /* renamed from: d, reason: collision with root package name */
    public int f50590d;

    /* renamed from: e, reason: collision with root package name */
    public int f50591e;

    /* renamed from: g, reason: collision with root package name */
    @P
    public MotionPhotoMetadata f50593g;

    /* renamed from: h, reason: collision with root package name */
    public C23191j f50594h;

    /* renamed from: i, reason: collision with root package name */
    public c f50595i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public g f50596j;

    /* renamed from: a, reason: collision with root package name */
    public final z f50587a = new z(6);

    /* renamed from: f, reason: collision with root package name */
    public long f50592f = -1;

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        if (j12 == 0) {
            this.f50589c = 0;
            this.f50596j = null;
        } else if (this.f50589c == 5) {
            g gVar = this.f50596j;
            gVar.getClass();
            gVar.a(j12, j13);
        }
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) throws EOFException, InterruptedIOException {
        C23191j c23191j = (C23191j) qVar;
        z zVar = this.f50587a;
        zVar.C(2);
        c23191j.a(zVar.f47962a, 0, 2, false);
        if (zVar.z() != 65496) {
            return false;
        }
        zVar.C(2);
        c23191j.a(zVar.f47962a, 0, 2, false);
        int iZ2 = zVar.z();
        this.f50590d = iZ2;
        if (iZ2 == 65504) {
            zVar.C(2);
            c23191j.a(zVar.f47962a, 0, 2, false);
            c23191j.k(zVar.z() - 2, false);
            zVar.C(2);
            c23191j.a(zVar.f47962a, 0, 2, false);
            this.f50590d = zVar.z();
        }
        if (this.f50590d != 65505) {
            return false;
        }
        c23191j.k(2, false);
        zVar.C(6);
        c23191j.a(zVar.f47962a, 0, 6, false);
        return zVar.v() == 1165519206 && zVar.z() == 0;
    }

    public final void c() {
        d(new Metadata.Entry[0]);
        r rVar = this.f50588b;
        rVar.getClass();
        rVar.b();
        this.f50588b.e(new H.b(-9223372036854775807L));
        this.f50589c = 6;
    }

    public final void d(Metadata.Entry... entryArr) {
        r rVar = this.f50588b;
        rVar.getClass();
        androidx.media3.extractor.J jC2 = rVar.c(1024, 4);
        C23108t.b bVar = new C23108t.b();
        bVar.f47786j = "image/jpeg";
        bVar.f47785i = new Metadata(entryArr);
        jC2.b(bVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r26, androidx.media3.extractor.F r27) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.jpeg.a.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f50588b = rVar;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
        g gVar = this.f50596j;
        if (gVar != null) {
            gVar.getClass();
        }
    }
}
