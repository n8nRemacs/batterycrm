package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.InterfaceC36582l;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public final class CacheDataSink implements InterfaceC36582l {

    /* renamed from: a, reason: collision with root package name */
    public final q f347800a;

    /* renamed from: b, reason: collision with root package name */
    public final long f347801b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347802c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.upstream.p f347803d;

    /* renamed from: e, reason: collision with root package name */
    public long f347804e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public File f347805f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public OutputStream f347806g;

    /* renamed from: h, reason: collision with root package name */
    public long f347807h;

    /* renamed from: i, reason: collision with root package name */
    public long f347808i;

    /* renamed from: j, reason: collision with root package name */
    public o f347809j;

    public static final class CacheDataSinkException extends Cache.CacheException {
    }

    public static final class a implements InterfaceC36582l.a {
    }

    public CacheDataSink(q qVar) {
        qVar.getClass();
        this.f347800a = qVar;
        this.f347801b = 5242880L;
        this.f347802c = 20480;
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.f347806g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            U.h(this.f347806g);
            this.f347806g = null;
            File file = this.f347805f;
            this.f347805f = null;
            q qVar = this.f347800a;
            long j12 = this.f347807h;
            synchronized (qVar) {
                boolean z12 = true;
                C36585a.d(!qVar.f347902j);
                if (file.exists()) {
                    if (j12 == 0) {
                        file.delete();
                        return;
                    }
                    r rVarB = r.b(file, j12, -9223372036854775807L, qVar.f347895c);
                    rVarB.getClass();
                    h hVarC = qVar.f347895c.c(rVarB.f347842b);
                    hVarC.getClass();
                    C36585a.d(hVarC.c(rVarB.f347843c, rVarB.f347844d));
                    long jB2 = hVarC.f347862e.b();
                    if (jB2 != -1) {
                        if (rVarB.f347843c + rVarB.f347844d > jB2) {
                            z12 = false;
                        }
                        C36585a.d(z12);
                    }
                    if (qVar.f347896d == null) {
                        qVar.k(rVarB);
                        qVar.f347895c.g();
                        qVar.notifyAll();
                        return;
                    }
                    try {
                        qVar.f347896d.d(rVarB.f347844d, rVarB.f347847g, file.getName());
                        qVar.k(rVarB);
                        try {
                            qVar.f347895c.g();
                            qVar.notifyAll();
                            return;
                        } catch (IOException e12) {
                            throw new Cache.CacheException(e12);
                        }
                    } catch (IOException e13) {
                        throw new Cache.CacheException(e13);
                    }
                }
            }
        } catch (Throwable th2) {
            U.h(this.f347806g);
            this.f347806g = null;
            File file2 = this.f347805f;
            this.f347805f = null;
            file2.delete();
            throw th2;
        }
    }

    public final void b(com.google.android.exoplayer2.upstream.p pVar) {
        File fileC;
        long j12 = pVar.f347935g;
        long jMin = j12 == -1 ? -1L : Math.min(j12 - this.f347808i, this.f347804e);
        int i12 = U.f348106a;
        long j13 = pVar.f347934f + this.f347808i;
        q qVar = this.f347800a;
        String str = pVar.f347936h;
        synchronized (qVar) {
            try {
                C36585a.d(!qVar.f347902j);
                qVar.l();
                h hVarC = qVar.f347895c.c(str);
                hVarC.getClass();
                C36585a.d(hVarC.c(j13, jMin));
                if (!qVar.f347893a.exists()) {
                    q.m(qVar.f347893a);
                    qVar.s();
                }
                m mVar = qVar.f347894b;
                if (jMin != -1) {
                    while (mVar.f347888c + jMin > mVar.f347886a) {
                        TreeSet<f> treeSet = mVar.f347887b;
                        if (treeSet.isEmpty()) {
                            break;
                        }
                        f fVarFirst = treeSet.first();
                        synchronized (qVar) {
                            C36585a.d(!qVar.f347902j);
                            qVar.r(fVarFirst);
                        }
                    }
                } else {
                    mVar.getClass();
                }
                File file = new File(qVar.f347893a, Integer.toString(qVar.f347898f.nextInt(10)));
                if (!file.exists()) {
                    q.m(file);
                }
                fileC = r.c(file, hVarC.f347858a, j13, System.currentTimeMillis());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f347805f = fileC;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f347805f);
        int i13 = this.f347802c;
        if (i13 > 0) {
            o oVar = this.f347809j;
            if (oVar == null) {
                this.f347809j = new o(fileOutputStream, i13);
            } else {
                oVar.a(fileOutputStream);
            }
            this.f347806g = this.f347809j;
        } else {
            this.f347806g = fileOutputStream;
        }
        this.f347807h = 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36582l
    public final void close() throws CacheDataSinkException {
        if (this.f347803d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e12) {
            throw new CacheDataSinkException(e12);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36582l
    public final void e(com.google.android.exoplayer2.upstream.p pVar) throws CacheDataSinkException {
        pVar.f347936h.getClass();
        long j12 = pVar.f347935g;
        int i12 = pVar.f347937i;
        if (j12 == -1 && (i12 & 2) == 2) {
            this.f347803d = null;
            return;
        }
        this.f347803d = pVar;
        this.f347804e = (i12 & 4) == 4 ? this.f347801b : Long.MAX_VALUE;
        this.f347808i = 0L;
        try {
            b(pVar);
        } catch (IOException e12) {
            throw new CacheDataSinkException(e12);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36582l
    public final void write(byte[] bArr, int i12, int i13) throws IOException {
        com.google.android.exoplayer2.upstream.p pVar = this.f347803d;
        if (pVar == null) {
            return;
        }
        int i14 = 0;
        while (i14 < i13) {
            try {
                if (this.f347807h == this.f347804e) {
                    a();
                    b(pVar);
                }
                int iMin = (int) Math.min(i13 - i14, this.f347804e - this.f347807h);
                OutputStream outputStream = this.f347806g;
                int i15 = U.f348106a;
                outputStream.write(bArr, i12 + i14, iMin);
                i14 += iMin;
                long j12 = iMin;
                this.f347807h += j12;
                this.f347808i += j12;
            } catch (IOException e12) {
                throw new CacheDataSinkException(e12);
            }
        }
    }
}
