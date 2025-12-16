package androidx.media3.extractor.ogg;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.M;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.H;
import androidx.media3.extractor.ogg.h;
import androidx.media3.extractor.u;
import androidx.media3.extractor.v;
import androidx.media3.extractor.w;
import androidx.media3.extractor.x;
import j.P;
import java.util.Arrays;
import v61.InterfaceC49174e;

/* compiled from: FlacReader.java */
/* loaded from: classes.dex */
final class b extends h {

    /* renamed from: n, reason: collision with root package name */
    @P
    public x f51096n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public a f51097o;

    /* compiled from: FlacReader.java */
    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public x f51098a;

        /* renamed from: b, reason: collision with root package name */
        public x.a f51099b;

        /* renamed from: c, reason: collision with root package name */
        public long f51100c;

        /* renamed from: d, reason: collision with root package name */
        public long f51101d;

        @Override // androidx.media3.extractor.ogg.f
        public final H b() {
            C23110a.g(this.f51100c != -1);
            return new w(this.f51098a, this.f51100c);
        }

        @Override // androidx.media3.extractor.ogg.f
        public final void c(long j12) {
            long[] jArr = this.f51099b.f51903a;
            this.f51101d = jArr[M.f(jArr, j12, true)];
        }

        @Override // androidx.media3.extractor.ogg.f
        public final long d(C23191j c23191j) {
            long j12 = this.f51101d;
            if (j12 < 0) {
                return -1L;
            }
            long j13 = -(j12 + 2);
            this.f51101d = -1L;
            return j13;
        }
    }

    @Override // androidx.media3.extractor.ogg.h
    public final long b(z zVar) {
        byte[] bArr = zVar.f47962a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i12 = (bArr[2] & 255) >> 4;
        if (i12 == 6 || i12 == 7) {
            zVar.G(4);
            zVar.A();
        }
        int iB2 = u.b(i12, zVar);
        zVar.F(0);
        return iB2;
    }

    @Override // androidx.media3.extractor.ogg.h
    @InterfaceC49174e
    public final boolean c(z zVar, long j12, h.b bVar) {
        byte[] bArr = zVar.f47962a;
        x xVar = this.f51096n;
        if (xVar == null) {
            x xVar2 = new x(bArr, 17);
            this.f51096n = xVar2;
            bVar.f51133a = xVar2.c(Arrays.copyOfRange(bArr, 9, zVar.f47964c), null);
            return true;
        }
        byte b12 = bArr[0];
        if ((b12 & 127) != 3) {
            if (b12 != -1) {
                return true;
            }
            a aVar = this.f51097o;
            if (aVar != null) {
                aVar.f51100c = j12;
                bVar.f51134b = aVar;
            }
            bVar.f51133a.getClass();
            return false;
        }
        x.a aVarA = v.a(zVar);
        x xVar3 = new x(xVar.f51891a, xVar.f51892b, xVar.f51893c, xVar.f51894d, xVar.f51895e, xVar.f51897g, xVar.f51898h, xVar.f51900j, aVarA, xVar.f51902l);
        this.f51096n = xVar3;
        a aVar2 = new a();
        aVar2.f51098a = xVar3;
        aVar2.f51099b = aVarA;
        aVar2.f51100c = -1L;
        aVar2.f51101d = -1L;
        this.f51097o = aVar2;
        return true;
    }

    @Override // androidx.media3.extractor.ogg.h
    public final void d(boolean z12) {
        super.d(z12);
        if (z12) {
            this.f51096n = null;
            this.f51097o = null;
        }
    }
}
