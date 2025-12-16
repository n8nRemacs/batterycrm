package androidx.media3.exoplayer.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C23108t;
import androidx.media3.common.D;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.AbstractC23136e;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.text.b;
import androidx.media3.extractor.text.f;
import androidx.media3.extractor.text.h;
import androidx.media3.extractor.text.i;
import com.google.common.collect.AbstractC37401r1;
import j.P;

/* compiled from: TextRenderer.java */
@J
/* loaded from: classes.dex */
public final class d extends AbstractC23136e implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    @P
    public i f49870A;

    /* renamed from: B, reason: collision with root package name */
    @P
    public i f49871B;

    /* renamed from: C, reason: collision with root package name */
    public int f49872C;

    /* renamed from: D, reason: collision with root package name */
    public long f49873D;

    /* renamed from: E, reason: collision with root package name */
    public long f49874E;

    /* renamed from: F, reason: collision with root package name */
    public long f49875F;

    /* renamed from: p, reason: collision with root package name */
    @P
    public final Handler f49876p;

    /* renamed from: q, reason: collision with root package name */
    public final c f49877q;

    /* renamed from: r, reason: collision with root package name */
    public final b f49878r;

    /* renamed from: s, reason: collision with root package name */
    public final F f49879s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f49880t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f49881u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f49882v;

    /* renamed from: w, reason: collision with root package name */
    public int f49883w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public C23108t f49884x;

    /* renamed from: y, reason: collision with root package name */
    @P
    public f f49885y;

    /* renamed from: z, reason: collision with root package name */
    @P
    public h f49886z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, @P Looper looper) {
        Handler handler;
        super(3);
        b bVar = b.f49869a;
        this.f49877q = cVar;
        if (looper == null) {
            handler = null;
        } else {
            int i12 = M.f47887a;
            handler = new Handler(looper, this);
        }
        this.f49876p = handler;
        this.f49878r = bVar;
        this.f49879s = new F();
        this.f49873D = -9223372036854775807L;
        this.f49874E = -9223372036854775807L;
        this.f49875F = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e
    public final void D() {
        this.f49884x = null;
        this.f49873D = -9223372036854775807L;
        M();
        this.f49874E = -9223372036854775807L;
        this.f49875F = -9223372036854775807L;
        Q();
        f fVar = this.f49885y;
        fVar.getClass();
        fVar.release();
        this.f49885y = null;
        this.f49883w = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    @Override // androidx.media3.exoplayer.AbstractC23136e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(long r5, boolean r7) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.d.F(long, boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // androidx.media3.exoplayer.AbstractC23136e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(androidx.media3.common.C23108t[] r3, long r4, long r6) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.d.K(androidx.media3.common.t[], long, long):void");
    }

    public final void M() {
        androidx.media3.common.text.b bVar = new androidx.media3.common.text.b(AbstractC37401r1.C(), P(this.f49875F));
        Handler handler = this.f49876p;
        if (handler != null) {
            handler.obtainMessage(0, bVar).sendToTarget();
            return;
        }
        c cVar = this.f49877q;
        cVar.onCues(bVar.f47860b);
        cVar.a(bVar);
    }

    public final long O() {
        if (this.f49872C == -1) {
            return Long.MAX_VALUE;
        }
        this.f49870A.getClass();
        if (this.f49872C >= this.f49870A.b()) {
            return Long.MAX_VALUE;
        }
        return this.f49870A.a(this.f49872C);
    }

    @K61.c
    public final long P(long j12) {
        C23110a.g(j12 != -9223372036854775807L);
        C23110a.g(this.f49874E != -9223372036854775807L);
        return j12 - this.f49874E;
    }

    public final void Q() {
        this.f49886z = null;
        this.f49872C = -1;
        i iVar = this.f49870A;
        if (iVar != null) {
            iVar.h();
            this.f49870A = null;
        }
        i iVar2 = this.f49871B;
        if (iVar2 != null) {
            iVar2.h();
            this.f49871B = null;
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.c0
    public final boolean a() {
        return this.f49881u;
    }

    @Override // androidx.media3.exoplayer.c0, androidx.media3.exoplayer.d0
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        androidx.media3.common.text.b bVar = (androidx.media3.common.text.b) message.obj;
        AbstractC37401r1<androidx.media3.common.text.a> abstractC37401r1 = bVar.f47860b;
        c cVar = this.f49877q;
        cVar.onCues(abstractC37401r1);
        cVar.a(bVar);
        return true;
    }

    @Override // androidx.media3.exoplayer.d0
    public final int i(C23108t c23108t) {
        ((b.a) this.f49878r).getClass();
        String str = c23108t.f47757m;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return d0.e(c23108t.f47744H == 0 ? 4 : 2, 0, 0);
        }
        return D.h(c23108t.f47757m) ? d0.e(1, 0, 0) : d0.e(0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.c0
    public final boolean n() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04a2  */
    @Override // androidx.media3.exoplayer.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(long r29, long r31) {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.d.o(long, long):void");
    }
}
