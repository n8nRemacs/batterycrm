package androidx.media3.extractor.avi;

import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.C23195n;
import androidx.media3.extractor.H;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import j.P;

/* compiled from: AviExtractor.java */
@J
/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: c, reason: collision with root package name */
    public int f50431c;

    /* renamed from: e, reason: collision with root package name */
    public androidx.media3.extractor.avi.c f50433e;

    /* renamed from: h, reason: collision with root package name */
    public long f50436h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public e f50437i;

    /* renamed from: m, reason: collision with root package name */
    public int f50441m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f50442n;

    /* renamed from: a, reason: collision with root package name */
    public final z f50429a = new z(12);

    /* renamed from: b, reason: collision with root package name */
    public final c f50430b = new c();

    /* renamed from: d, reason: collision with root package name */
    public r f50432d = new C23195n();

    /* renamed from: g, reason: collision with root package name */
    public e[] f50435g = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public long f50439k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f50440l = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f50438j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f50434f = -9223372036854775807L;

    /* compiled from: AviExtractor.java */
    /* renamed from: androidx.media3.extractor.avi.b$b, reason: collision with other inner class name */
    public class C1848b implements H {

        /* renamed from: a, reason: collision with root package name */
        public final long f50443a;

        public C1848b(long j12) {
            this.f50443a = j12;
        }

        @Override // androidx.media3.extractor.H
        public final long d() {
            return this.f50443a;
        }

        @Override // androidx.media3.extractor.H
        public final H.a f(long j12) {
            b bVar = b.this;
            H.a aVarB = bVar.f50435g[0].b(j12);
            int i12 = 1;
            while (true) {
                e[] eVarArr = bVar.f50435g;
                if (i12 >= eVarArr.length) {
                    return aVarB;
                }
                H.a aVarB2 = eVarArr[i12].b(j12);
                if (aVarB2.f50373a.f50379b < aVarB.f50373a.f50379b) {
                    aVarB = aVarB2;
                }
                i12++;
            }
        }

        @Override // androidx.media3.extractor.H
        public final boolean g() {
            return true;
        }
    }

    /* compiled from: AviExtractor.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f50445a;

        /* renamed from: b, reason: collision with root package name */
        public int f50446b;

        /* renamed from: c, reason: collision with root package name */
        public int f50447c;

        public c() {
        }
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        this.f50436h = -1L;
        this.f50437i = null;
        for (e eVar : this.f50435g) {
            if (eVar.f50465j == 0) {
                eVar.f50463h = 0;
            } else {
                eVar.f50463h = eVar.f50467l[M.f(eVar.f50466k, j12, true)];
            }
        }
        if (j12 != 0) {
            this.f50431c = 6;
        } else if (this.f50435g.length == 0) {
            this.f50431c = 0;
        } else {
            this.f50431c = 3;
        }
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) {
        z zVar = this.f50429a;
        ((C23191j) qVar).a(zVar.f47962a, 0, 12, false);
        zVar.F(0);
        if (zVar.i() != 1179011410) {
            return false;
        }
        zVar.G(4);
        return zVar.i() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r22, androidx.media3.extractor.F r23) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.avi.b.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f50431c = 0;
        this.f50432d = rVar;
        this.f50436h = -1L;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
