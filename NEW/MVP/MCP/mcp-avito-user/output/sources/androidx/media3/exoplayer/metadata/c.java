package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C23108t;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.AbstractC23136e;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.metadata.a;
import j.P;
import java.util.ArrayList;

/* compiled from: MetadataRenderer.java */
@J
/* loaded from: classes.dex */
public final class c extends AbstractC23136e implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public final a f49402p;

    /* renamed from: q, reason: collision with root package name */
    public final b f49403q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public final Handler f49404r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.media3.extractor.metadata.b f49405s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public androidx.media3.extractor.metadata.a f49406t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f49407u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f49408v;

    /* renamed from: w, reason: collision with root package name */
    public long f49409w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public Metadata f49410x;

    /* renamed from: y, reason: collision with root package name */
    public long f49411y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, @P Looper looper) {
        Handler handler;
        super(5);
        a aVar = a.f49401a;
        this.f49403q = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i12 = M.f47887a;
            handler = new Handler(looper, this);
        }
        this.f49404r = handler;
        aVar.getClass();
        this.f49402p = aVar;
        this.f49405s = new androidx.media3.extractor.metadata.b();
        this.f49411y = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void D() {
        this.f49410x = null;
        this.f49406t = null;
        this.f49411y = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void F(long j12, boolean z12) {
        this.f49410x = null;
        this.f49407u = false;
        this.f49408v = false;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void K(C23108t[] c23108tArr, long j12, long j13) {
        this.f49406t = ((a.C1829a) this.f49402p).a(c23108tArr[0]);
        Metadata metadata = this.f49410x;
        if (metadata != null) {
            long j14 = this.f49411y;
            long j15 = metadata.f47362c;
            long j16 = (j14 + j15) - j13;
            if (j15 != j16) {
                metadata = new Metadata(j16, metadata.f47361b);
            }
            this.f49410x = metadata;
        }
        this.f49411y = j13;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(androidx.media3.common.Metadata r7, java.util.ArrayList r8) {
        /*
            r6 = this;
            r0 = 0
        L1:
            androidx.media3.common.Metadata$Entry[] r1 = r7.f47361b
            int r2 = r1.length
            if (r0 >= r2) goto L4a
            r2 = r1[r0]
            androidx.media3.common.t r2 = r2.i0()
            if (r2 == 0) goto L42
            androidx.media3.exoplayer.metadata.a r3 = r6.f49402p
            androidx.media3.exoplayer.metadata.a$a r3 = (androidx.media3.exoplayer.metadata.a.C1829a) r3
            boolean r4 = r3.b(r2)
            if (r4 == 0) goto L42
            androidx.media3.extractor.metadata.c r2 = r3.a(r2)
            r1 = r1[r0]
            byte[] r1 = r1.Z()
            r1.getClass()
            androidx.media3.extractor.metadata.b r3 = r6.f49405s
            r3.h()
            int r4 = r1.length
            r3.j(r4)
            java.nio.ByteBuffer r4 = r3.f48323d
            int r5 = androidx.media3.common.util.M.f47887a
            r4.put(r1)
            r3.k()
            androidx.media3.common.Metadata r1 = r2.a(r3)
            if (r1 == 0) goto L47
            r6.M(r1, r8)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.metadata.c.M(androidx.media3.common.Metadata, java.util.ArrayList):void");
    }

    @K61.c
    public final long O(long j12) {
        C23110a.g(j12 != -9223372036854775807L);
        C23110a.g(this.f49411y != -9223372036854775807L);
        return j12 - this.f49411y;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.c0
    public final boolean a() {
        return this.f49408v;
    }

    @Override // androidx.media3.exoplayer.c0, androidx.media3.exoplayer.d0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.f49403q.d((Metadata) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.d0
    public final int i(C23108t c23108t) {
        if (((a.C1829a) this.f49402p).b(c23108t)) {
            return d0.e(c23108t.f47744H == 0 ? 4 : 2, 0, 0);
        }
        return d0.e(0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean n() {
        return true;
    }

    @Override // androidx.media3.exoplayer.c0
    public final void o(long j12, long j13) {
        boolean z12 = true;
        while (z12) {
            if (!this.f49407u && this.f49410x == null) {
                androidx.media3.extractor.metadata.b bVar = this.f49405s;
                bVar.h();
                F f12 = this.f49141d;
                f12.a();
                int iL2 = L(f12, bVar, 0);
                if (iL2 == -4) {
                    if (bVar.f(4)) {
                        this.f49407u = true;
                    } else {
                        bVar.f50621i = this.f49409w;
                        bVar.k();
                        androidx.media3.extractor.metadata.a aVar = this.f49406t;
                        int i12 = M.f47887a;
                        Metadata metadataA = aVar.a(bVar);
                        if (metadataA != null) {
                            ArrayList arrayList = new ArrayList(metadataA.f47361b.length);
                            M(metadataA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f49410x = new Metadata(O(bVar.f48325f), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (iL2 == -5) {
                    C23108t c23108t = f12.f48506b;
                    c23108t.getClass();
                    this.f49409w = c23108t.f47761q;
                }
            }
            Metadata metadata = this.f49410x;
            if (metadata == null || metadata.f47362c > O(j12)) {
                z12 = false;
            } else {
                Metadata metadata2 = this.f49410x;
                Handler handler = this.f49404r;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.f49403q.d(metadata2);
                }
                this.f49410x = null;
                z12 = true;
            }
            if (this.f49407u && this.f49410x == null) {
                this.f49408v = true;
            }
        }
    }
}
