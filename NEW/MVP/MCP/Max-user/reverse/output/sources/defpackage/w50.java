package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w50 extends bxd {
    public final sk4 e;
    public final i50 f;
    public final ph4 g;
    public final ph4 h;
    public final w30 i;
    public final y30 j;
    public final hf6 k;
    public boolean l;
    public long m;

    public w50(hf6 hf6Var, hf6 hf6Var2, chg chgVar, g95 g95Var, wg7 wg7Var, u1j u1jVar, cd3 cd3Var, u9a u9aVar, w86 w86Var, LogSessionId logSessionId) throws ExportException {
        y30 y30VarJ;
        super(hf6Var, u9aVar);
        q6f q6fVar = new q6f(false);
        tg7 tg7Var = new tg7(4);
        tg7Var.d(wg7Var);
        tg7Var.a(q6fVar);
        w30 w30Var = new w30(u1jVar, tg7Var.i());
        this.i = w30Var;
        this.k = hf6Var2;
        y30 y30VarJ2 = w30Var.j(g95Var, hf6Var2);
        g50 g50Var = (g50) w30Var.f;
        i50 i50Var = g50Var.d;
        boolean zEquals = i50Var.equals(i50.e);
        int i = i50Var.a;
        hsi.g(!zEquals);
        ff6 ff6Var = new ff6();
        chg chgVarA = chgVar;
        String str = chgVarA.b;
        if (str == null) {
            str = hf6Var.n;
            str.getClass();
        }
        ff6Var.m = xz9.n(str);
        ff6Var.F = i;
        ff6Var.E = i50Var.b;
        ff6Var.G = i50Var.c;
        ff6Var.j = hf6Var2.k;
        hf6 hf6Var3 = new hf6(ff6Var);
        ff6 ff6VarA = hf6Var3.a();
        ff6VarA.m = xz9.n(bxd.i(hf6Var3, u9aVar.b.a(1)));
        sk4 sk4VarA = cd3Var.a(new hf6(ff6VarA), logSessionId);
        hf6 hf6Var4 = sk4VarA.c;
        this.e = sk4VarA;
        try {
            int i2 = new i50(sk4.a(sk4VarA.d.getInputFormat(), sk4VarA.g, hf6Var4.l)).a;
            if (i2 != i) {
                w30Var.k();
                hsi.b(i2 == -1 || i2 > 0);
                q6fVar.c = i2;
                y30VarJ = w30Var.j(g95Var, hf6Var2);
                i50Var = g50Var.d;
            } else {
                y30VarJ = y30VarJ2;
            }
            this.j = y30VarJ;
            this.f = i50Var;
            this.g = new ph4(0);
            this.h = new ph4(0);
            if (!Objects.equals(hf6Var3.n, hf6Var4.n)) {
                ft0 ft0VarA = chgVarA.a();
                ft0VarA.b(hf6Var4.n);
                chgVarA = ft0VarA.a();
            }
            w86Var.f(chgVarA);
        } catch (RuntimeException e) {
            a8i.f("DefaultCodec", "MediaCodec error", e);
            throw sk4VarA.b(e);
        }
    }

    @Override // defpackage.bxd
    public final sx6 j(g95 g95Var, hf6 hf6Var, int i) {
        if (this.l) {
            return this.i.j(g95Var, hf6Var);
        }
        this.l = true;
        hsi.g(hf6Var.equals(this.k));
        return this.j;
    }

    @Override // defpackage.bxd
    public final ph4 k() {
        sk4 sk4Var = this.e;
        ByteBuffer byteBufferD = sk4Var.d();
        ph4 ph4Var = this.h;
        ph4Var.o = byteBufferD;
        if (byteBufferD == null) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = sk4Var.g(false) ? sk4Var.a : null;
        bufferInfo.getClass();
        ph4Var.Y = bufferInfo.presentationTimeUs;
        ph4Var.b = 1;
        return ph4Var;
    }

    @Override // defpackage.bxd
    public final hf6 l() throws ExportException {
        sk4 sk4Var = this.e;
        sk4Var.g(false);
        return sk4Var.j;
    }

    @Override // defpackage.bxd
    public final boolean m() {
        return this.e.e();
    }

    @Override // defpackage.bxd
    public final boolean n() throws MediaCodec.CryptoException, ExportException {
        boolean z;
        ByteBuffer byteBufferD;
        ByteBuffer byteBuffer;
        w30 w30Var = this.i;
        ArrayList arrayList = (ArrayList) w30Var.d;
        pj4 pj4Var = (pj4) w30Var.e;
        long j = -9223372036854775807L;
        if (w30Var.b) {
            z = true;
        } else {
            if (!w30Var.a) {
                try {
                    pj4Var.d((i50) w30Var.g);
                    w30Var.a = true;
                } catch (AudioProcessor$UnhandledAudioFormatException e) {
                    throw ExportException.b(e, "Error while configuring mixer");
                }
            }
            w30Var.b = true;
            for (int i = 0; i < arrayList.size(); i++) {
                v30 v30Var = (v30) arrayList.get(i);
                if (v30Var.b == -1) {
                    y30 y30Var = v30Var.a;
                    try {
                        y30Var.l();
                        long j2 = y30Var.e.get();
                        if (j2 == -9223372036854775807L) {
                            w30Var.b = false;
                        } else if (j2 != Long.MIN_VALUE) {
                            v30Var.b = pj4Var.a(y30Var.a, j2);
                        }
                    } catch (AudioProcessor$UnhandledAudioFormatException e2) {
                        throw ExportException.b(e2, "Unhandled format while adding source " + v30Var.b);
                    }
                }
            }
            z = w30Var.b;
        }
        if (z) {
            if (!((pj4) w30Var.e).e()) {
                ArrayList arrayList2 = (ArrayList) w30Var.d;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    v30 v30Var2 = (v30) arrayList2.get(i2);
                    int i3 = v30Var2.b;
                    pj4 pj4Var2 = (pj4) w30Var.e;
                    pj4Var2.c();
                    SparseArray sparseArray = pj4Var2.a;
                    if (zxg.k(sparseArray, i3)) {
                        y30 y30Var2 = v30Var2.a;
                        if (!y30Var2.m() && y30Var2.d.isEmpty() && (y30Var2.l == j ? y30Var2.j || y30Var2.k : y30Var2.o && (y30Var2.j || y30Var2.k))) {
                            pj4Var2.c();
                            long j3 = pj4Var2.j;
                            SparseArray sparseArray2 = pj4Var2.a;
                            hsi.f("Source not found.", zxg.k(sparseArray2, i3));
                            pj4Var2.j = Math.max(j3, ((oj4) sparseArray2.get(i3)).a);
                            sparseArray.delete(i3);
                            v30Var2.b = -1;
                            w30Var.c++;
                        } else {
                            try {
                                pj4Var2.f(i3, y30Var2.l());
                            } catch (AudioProcessor$UnhandledAudioFormatException e3) {
                                throw ExportException.b(e3, "AudioGraphInput (sourceId=" + i3 + ") reconfiguration");
                            }
                        }
                    }
                    i2++;
                    j = -9223372036854775807L;
                }
            }
            if (!((ByteBuffer) w30Var.h).hasRemaining()) {
                pj4 pj4Var3 = (pj4) w30Var.e;
                pj4Var3.c();
                if (pj4Var3.e()) {
                    byteBuffer = l50.a;
                } else {
                    long jMin = pj4Var3.i;
                    if (pj4Var3.a.size() == 0) {
                        jMin = Math.min(jMin, pj4Var3.j);
                    }
                    for (int i4 = 0; i4 < pj4Var3.a.size(); i4++) {
                        jMin = Math.min(jMin, ((oj4) pj4Var3.a.valueAt(i4)).a);
                    }
                    if (jMin <= pj4Var3.h) {
                        byteBuffer = l50.a;
                    } else {
                        bz1 bz1Var = pj4Var3.e[0];
                        long jMin2 = Math.min(jMin, bz1Var.b);
                        ByteBuffer byteBufferDuplicate = ((ByteBuffer) bz1Var.c).duplicate();
                        byteBufferDuplicate.position(((int) (pj4Var3.h - bz1Var.a)) * pj4Var3.c.d).limit(((int) (jMin2 - bz1Var.a)) * pj4Var3.c.d);
                        ByteBuffer byteBufferOrder = byteBufferDuplicate.slice().order(ByteOrder.nativeOrder());
                        if (jMin2 == bz1Var.b) {
                            bz1[] bz1VarArr = pj4Var3.e;
                            bz1 bz1Var2 = bz1VarArr[1];
                            bz1VarArr[0] = bz1Var2;
                            bz1VarArr[1] = pj4Var3.b(bz1Var2.b);
                        }
                        pj4Var3.h = jMin2;
                        pj4Var3.g = Math.min(pj4Var3.i, jMin2 + pj4Var3.d);
                        byteBufferOrder.remaining();
                        LinkedHashMap linkedHashMap = ah4.a;
                        synchronized (ah4.class) {
                        }
                        byteBuffer = byteBufferOrder;
                    }
                }
                w30Var.h = byteBuffer;
            }
            if (((g50) w30Var.f).f()) {
                g50 g50Var = (g50) w30Var.f;
                if (w30Var.i()) {
                    g50Var.h();
                } else {
                    g50Var.i((ByteBuffer) w30Var.h);
                }
                byteBufferD = ((g50) w30Var.f).d();
            } else {
                byteBufferD = (ByteBuffer) w30Var.h;
            }
        } else {
            byteBufferD = l50.a;
        }
        if (this.e.f(this.g)) {
            w30 w30Var2 = this.i;
            g50 g50Var2 = (g50) w30Var2.f;
            if (g50Var2.f() ? g50Var2.e() : w30Var2.i()) {
                ah4.a();
                ph4 ph4Var = this.g;
                ByteBuffer byteBuffer2 = ph4Var.o;
                byteBuffer2.getClass();
                hsi.g(byteBuffer2.position() == 0);
                long j4 = this.m;
                i50 i50Var = this.f;
                ph4Var.Y = ((j4 / i50Var.d) * 1000000) / i50Var.a;
                ph4Var.a(4);
                ph4Var.z();
                this.e.h(ph4Var);
                return false;
            }
            if (byteBufferD.hasRemaining()) {
                ph4 ph4Var2 = this.g;
                ByteBuffer byteBuffer3 = ph4Var2.o;
                byteBuffer3.getClass();
                int iLimit = byteBufferD.limit();
                byteBufferD.limit(Math.min(iLimit, byteBuffer3.capacity() + byteBufferD.position()));
                byteBuffer3.put(byteBufferD);
                long j5 = this.m;
                i50 i50Var2 = this.f;
                ph4Var2.Y = ((j5 / i50Var2.d) * 1000000) / i50Var2.a;
                this.m = j5 + byteBuffer3.position();
                ph4Var2.b = 0;
                ph4Var2.z();
                byteBufferD.limit(iLimit);
                this.e.h(ph4Var2);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bxd
    public final void o() {
        this.i.k();
        this.e.i();
    }

    @Override // defpackage.bxd
    public final void p() throws ExportException {
        this.e.j();
    }
}
