package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.AbstractC36523f;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.J;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.metadata.b;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.ArrayList;

/* compiled from: MetadataRenderer.java */
/* loaded from: classes6.dex */
public final class e extends AbstractC36523f implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    public final b f345628n;

    /* renamed from: o, reason: collision with root package name */
    public final d f345629o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public final Handler f345630p;

    /* renamed from: q, reason: collision with root package name */
    public final c f345631q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public a f345632r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f345633s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f345634t;

    /* renamed from: u, reason: collision with root package name */
    public long f345635u;

    /* renamed from: v, reason: collision with root package name */
    public long f345636v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public Metadata f345637w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, @P Looper looper) {
        Handler handler;
        super(5);
        b bVar = b.f345624a;
        this.f345629o = dVar;
        if (looper == null) {
            handler = null;
        } else {
            int i12 = U.f348106a;
            handler = new Handler(looper, this);
        }
        this.f345630p = handler;
        bVar.getClass();
        this.f345628n = bVar;
        this.f345631q = new c();
        this.f345636v = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void B() {
        this.f345637w = null;
        this.f345636v = -9223372036854775807L;
        this.f345632r = null;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void D(long j12, boolean z12) {
        this.f345637w = null;
        this.f345636v = -9223372036854775807L;
        this.f345633s = false;
        this.f345634t = false;
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f
    public final void H(I[] iArr, long j12, long j13) {
        this.f345632r = ((b.a) this.f345628n).a(iArr[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(com.google.android.exoplayer2.metadata.Metadata r7, java.util.ArrayList r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r7.f345623b
            int r2 = r1.length
            if (r0 >= r2) goto L4a
            r2 = r1[r0]
            com.google.android.exoplayer2.I r2 = r2.i0()
            if (r2 == 0) goto L42
            com.google.android.exoplayer2.metadata.b r3 = r6.f345628n
            com.google.android.exoplayer2.metadata.b$a r3 = (com.google.android.exoplayer2.metadata.b.a) r3
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L42
            com.google.android.exoplayer2.metadata.f r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.Z()
            r1.getClass()
            com.google.android.exoplayer2.metadata.c r3 = r6.f345631q
            r3.h()
            int r4 = r1.length
            r3.j(r4)
            java.nio.ByteBuffer r4 = r3.f344205d
            int r5 = com.google.android.exoplayer2.util.U.f348106a
            r4.put(r1)
            r3.k()
            com.google.android.exoplayer2.metadata.Metadata r1 = r2.a(r3)
            if (r1 == 0) goto L47
            r6.J(r1, r8)
            goto L47
        L42:
            r1 = r1[r0]
            r8.add(r1)
        L47:
            int r0 = r0 + 1
            goto L1
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.e.J(com.google.android.exoplayer2.metadata.Metadata, java.util.ArrayList):void");
    }

    @Override // com.google.android.exoplayer2.AbstractC36523f, com.google.android.exoplayer2.h0
    public final boolean a() {
        return this.f345634t;
    }

    @Override // com.google.android.exoplayer2.h0, com.google.android.exoplayer2.i0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f345629o.onMetadata((Metadata) message.obj);
        return true;
    }

    @Override // com.google.android.exoplayer2.h0
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.exoplayer2.h0
    public final void o(long j12, long j13) {
        boolean z12 = true;
        while (z12) {
            if (!this.f345633s && this.f345637w == null) {
                c cVar = this.f345631q;
                cVar.h();
                J j14 = this.f345397c;
                j14.a();
                int I12 = I(j14, cVar, 0);
                if (I12 == -4) {
                    if (cVar.f(4)) {
                        this.f345633s = true;
                    } else {
                        cVar.f345625i = this.f345635u;
                        cVar.k();
                        a aVar = this.f345632r;
                        int i12 = U.f348106a;
                        Metadata metadataA = aVar.a(cVar);
                        if (metadataA != null) {
                            ArrayList arrayList = new ArrayList(metadataA.f345623b.length);
                            J(metadataA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f345637w = new Metadata(arrayList);
                                this.f345636v = cVar.f344207f;
                            }
                        }
                    }
                } else if (I12 == -5) {
                    I i13 = j14.f343521b;
                    i13.getClass();
                    this.f345635u = i13.f343480q;
                }
            }
            Metadata metadata = this.f345637w;
            if (metadata == null || this.f345636v > j12) {
                z12 = false;
            } else {
                Handler handler = this.f345630p;
                if (handler != null) {
                    handler.obtainMessage(0, metadata).sendToTarget();
                } else {
                    this.f345629o.onMetadata(metadata);
                }
                this.f345637w = null;
                this.f345636v = -9223372036854775807L;
                z12 = true;
            }
            if (this.f345633s && this.f345637w == null) {
                this.f345634t = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.i0
    public final int y(I i12) {
        if (((b.a) this.f345628n).b(i12)) {
            return i0.e(i12.f343463F == 0 ? 4 : 2, 0, 0);
        }
        return i0.e(0, 0, 0);
    }
}
