package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.yandex.mobile.ads.impl.pc;
import com.yandex.mobile.ads.impl.qc;
import com.yandex.mobile.ads.impl.ux0;
import com.yandex.mobile.ads.impl.vw;
import j.InterfaceC42153i;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class bc0 extends gc0 implements zb0 {

    /* renamed from: S0, reason: collision with root package name */
    private static final cc0 f383882S0 = tv0.d();

    /* renamed from: H0, reason: collision with root package name */
    private final Context f383883H0;

    /* renamed from: I0, reason: collision with root package name */
    private final pc.a f383884I0;

    /* renamed from: J0, reason: collision with root package name */
    private final qc f383885J0;

    /* renamed from: K0, reason: collision with root package name */
    private int f383886K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f383887L0;

    /* renamed from: M0, reason: collision with root package name */
    @j.P
    private vw f383888M0;

    /* renamed from: N0, reason: collision with root package name */
    private long f383889N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f383890O0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f383891P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f383892Q0;

    /* renamed from: R0, reason: collision with root package name */
    @j.P
    private ux0.a f383893R0;

    public final class a implements qc.c {
        private a() {
        }

        public /* synthetic */ a(bc0 bc0Var, int i12) {
            this();
        }
    }

    public bc0(Context context, cp cpVar, ic0 ic0Var, @j.P Handler handler, @j.P pc pcVar, io ioVar) {
        super(1, cpVar, ic0Var, 44100.0f);
        this.f383883H0 = context.getApplicationContext();
        this.f383885J0 = ioVar;
        this.f383884I0 = new pc.a(handler, pcVar);
        ioVar.a(new a(this, 0));
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void J() {
        this.f383885J0.f();
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void M() throws lt {
        try {
            this.f383885J0.c();
        } catch (qc.e e12) {
            throw a(5002, e12.f389141c, e12, e12.f389140b);
        }
    }

    @InterfaceC42153i
    public final void R() {
        this.f383891P0 = true;
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ux0
    public final boolean d() {
        return this.f383885J0.d() || super.d();
    }

    @Override // com.yandex.mobile.ads.impl.ux0, com.yandex.mobile.ads.impl.vx0
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.zb0
    public final ct0 getPlaybackParameters() {
        return this.f383885J0.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.zb0
    public final long o() {
        if (c() == 2) {
            long jA2 = this.f383885J0.a(a());
            if (jA2 != Long.MIN_VALUE) {
                if (!this.f383891P0) {
                    jA2 = Math.max(this.f383889N0, jA2);
                }
                this.f383889N0 = jA2;
                this.f383891P0 = false;
            }
        }
        return this.f383889N0;
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ff
    public final void u() {
        this.f383892Q0 = true;
        try {
            this.f383885J0.flush();
            try {
                super.u();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.u();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ff
    public final void v() {
        try {
            super.v();
        } finally {
            if (this.f383892Q0) {
                this.f383892Q0 = false;
                this.f383885J0.reset();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void w() {
        this.f383885J0.play();
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void x() {
        long jA2 = this.f383885J0.a(a());
        if (jA2 != Long.MIN_VALUE) {
            if (!this.f383891P0) {
                jA2 = Math.max(this.f383889N0, jA2);
            }
            this.f383889N0 = jA2;
            this.f383891P0 = false;
        }
        this.f383885J0.pause();
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final boolean a(long j12, long j13, @j.P ac0 ac0Var, @j.P ByteBuffer byteBuffer, int i12, int i13, int i14, long j14, boolean z12, boolean z13, vw vwVar) throws lt {
        byteBuffer.getClass();
        if (this.f383888M0 != null && (i13 & 2) != 0) {
            ac0Var.getClass();
            ac0Var.a(false, i12);
            return true;
        }
        if (z12) {
            if (ac0Var != null) {
                ac0Var.a(false, i12);
            }
            this.f385640B0.f390234f += i14;
            this.f383885J0.f();
            return true;
        }
        try {
            if (!this.f383885J0.a(byteBuffer, j14, i14)) {
                return false;
            }
            if (ac0Var != null) {
                ac0Var.a(false, i12);
            }
            this.f385640B0.f390233e += i14;
            return true;
        } catch (qc.b e12) {
            throw a(5001, e12.f389138c, e12, e12.f389137b);
        } catch (qc.e e13) {
            throw a(5002, vwVar, e13, e13.f389140b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final boolean b(vw vwVar) {
        return this.f383885J0.a(vwVar);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void b(vn vnVar) {
        if (!this.f383890O0 || vnVar.e()) {
            return;
        }
        if (Math.abs(vnVar.f390953e - this.f383889N0) > 500000) {
            this.f383889N0 = vnVar.f390953e;
        }
        this.f383890O0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8  */
    @Override // com.yandex.mobile.ads.impl.gc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.ic0 r12, com.yandex.mobile.ads.impl.vw r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bc0.a(com.yandex.mobile.ads.impl.ic0, com.yandex.mobile.ads.impl.vw):int");
    }

    @Override // com.yandex.mobile.ads.impl.ff, com.yandex.mobile.ads.impl.ux0
    @j.P
    public final zb0 l() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // com.yandex.mobile.ads.impl.gc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(com.yandex.mobile.ads.impl.ic0 r5, com.yandex.mobile.ads.impl.vw r6, boolean r7) {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.qc r0 = r4.f383885J0
            java.lang.String r1 = r6.f391181l
            if (r1 != 0) goto Lb
            com.yandex.mobile.ads.embedded.guava.collect.p r5 = com.yandex.mobile.ads.embedded.guava.collect.p.i()
            goto L53
        Lb:
            boolean r0 = r0.a(r6)
            r2 = 0
            if (r0 == 0) goto L2d
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = com.yandex.mobile.ads.impl.jc0.a(r0, r2, r2)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L20
            r0 = 0
            goto L26
        L20:
            java.lang.Object r0 = r0.get(r2)
            com.yandex.mobile.ads.impl.ec0 r0 = (com.yandex.mobile.ads.impl.ec0) r0
        L26:
            if (r0 == 0) goto L2d
            com.yandex.mobile.ads.embedded.guava.collect.p r5 = com.yandex.mobile.ads.embedded.guava.collect.p.a(r0)
            goto L53
        L2d:
            java.util.List r0 = r5.a(r1, r7, r2)
            java.lang.String r1 = com.yandex.mobile.ads.impl.jc0.a(r6)
            if (r1 != 0) goto L3c
            com.yandex.mobile.ads.embedded.guava.collect.p r5 = com.yandex.mobile.ads.embedded.guava.collect.p.a(r0)
            goto L53
        L3c:
            java.util.List r5 = r5.a(r1, r7, r2)
            int r7 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c
            com.yandex.mobile.ads.embedded.guava.collect.p$a r7 = new com.yandex.mobile.ads.embedded.guava.collect.p$a
            r7.<init>()
            com.yandex.mobile.ads.embedded.guava.collect.p$a r7 = r7.b(r0)
            com.yandex.mobile.ads.embedded.guava.collect.p$a r5 = r7.b(r5)
            com.yandex.mobile.ads.embedded.guava.collect.p r5 = r5.a()
        L53:
            java.util.ArrayList r5 = com.yandex.mobile.ads.impl.jc0.a(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bc0.a(com.yandex.mobile.ads.impl.ic0, com.yandex.mobile.ads.impl.vw, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    @Override // com.yandex.mobile.ads.impl.gc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.impl.ac0.a a(com.yandex.mobile.ads.impl.ec0 r11, com.yandex.mobile.ads.impl.vw r12, @j.P android.media.MediaCrypto r13, float r14) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bc0.a(com.yandex.mobile.ads.impl.ec0, com.yandex.mobile.ads.impl.vw, android.media.MediaCrypto, float):com.yandex.mobile.ads.impl.ac0$a");
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final xn a(ec0 ec0Var, vw vwVar, vw vwVar2) {
        xn xnVarA = ec0Var.a(vwVar, vwVar2);
        int i12 = xnVarA.f391784e;
        if (a(vwVar2, ec0Var) > this.f383886K0) {
            i12 |= 64;
        }
        int i13 = i12;
        return new xn(ec0Var.f384886a, vwVar, vwVar2, i13 != 0 ? 0 : xnVarA.f391783d, i13);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final float a(float f12, vw[] vwVarArr) {
        int iMax = -1;
        for (vw vwVar : vwVarArr) {
            int i12 = vwVar.f391195z;
            if (i12 != -1) {
                iMax = Math.max(iMax, i12);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f12 * iMax;
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void a(String str, long j12, long j13) {
        this.f383884I0.a(str, j12, j13);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void a(String str) {
        this.f383884I0.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void a(Exception exc) {
        ka0.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f383884I0.a(exc);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    @j.P
    public final xn a(ww wwVar) {
        xn xnVarA = super.a(wwVar);
        this.f383884I0.a(wwVar.f391506b, xnVarA);
        return xnVarA;
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void a(vw vwVar, @j.P MediaFormat mediaFormat) throws lt {
        int iB2;
        int i12;
        vw vwVar2 = this.f383888M0;
        int[] iArr = null;
        if (vwVar2 != null) {
            vwVar = vwVar2;
        } else if (C() != null) {
            if ("audio/raw".equals(vwVar.f391181l)) {
                iB2 = vwVar.f391164A;
            } else if (pc1.f388768a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iB2 = mediaFormat.getInteger("pcm-encoding");
            } else {
                iB2 = mediaFormat.containsKey("v-bits-per-sample") ? pc1.b(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            vw vwVarA = new vw.a().f("audio/raw").j(iB2).e(vwVar.f391165B).f(vwVar.f391166C).c(mediaFormat.getInteger("channel-count")).n(mediaFormat.getInteger("sample-rate")).a();
            if (this.f383887L0 && vwVarA.f391194y == 6 && (i12 = vwVar.f391194y) < 6) {
                iArr = new int[i12];
                for (int i13 = 0; i13 < vwVar.f391194y; i13++) {
                    iArr[i13] = i13;
                }
            }
            vwVar = vwVarA;
        }
        try {
            this.f383885J0.a(vwVar, iArr);
        } catch (qc.a e12) {
            throw a(e12, e12.f389135a, 5001);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ff
    public final void a(boolean z12, boolean z13) {
        super.a(z12, z13);
        this.f383884I0.b(this.f385640B0);
        if (p().f391510a) {
            this.f383885J0.b();
        } else {
            this.f383885J0.e();
        }
        this.f383885J0.a(r());
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ff
    public final void a(long j12, boolean z12) {
        super.a(j12, z12);
        this.f383885J0.flush();
        this.f383889N0 = j12;
        this.f383890O0 = true;
        this.f383891P0 = true;
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ux0
    public final boolean a() {
        return super.a() && this.f383885J0.a();
    }

    @Override // com.yandex.mobile.ads.impl.zb0
    public final void a(ct0 ct0Var) {
        this.f383885J0.a(ct0Var);
    }

    @Override // com.yandex.mobile.ads.impl.ff, com.yandex.mobile.ads.impl.kt0.b
    public final void a(int i12, @j.P Object obj) {
        if (i12 == 2) {
            this.f383885J0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i12 == 3) {
            this.f383885J0.a((jc) obj);
            return;
        }
        if (i12 != 6) {
            switch (i12) {
                case 9:
                    this.f383885J0.b(((Boolean) obj).booleanValue());
                    break;
                case 10:
                    this.f383885J0.a(((Integer) obj).intValue());
                    break;
                case 11:
                    this.f383893R0 = (ux0.a) obj;
                    break;
            }
            return;
        }
        this.f383885J0.a((dd) obj);
    }

    private int a(vw vwVar, ec0 ec0Var) {
        int i12;
        if (!f383882S0.f().equals(ec0Var.f384886a) || (i12 = pc1.f388768a) >= 24 || (i12 == 23 && pc1.d(this.f383883H0))) {
            return vwVar.f391182m;
        }
        return -1;
    }
}
