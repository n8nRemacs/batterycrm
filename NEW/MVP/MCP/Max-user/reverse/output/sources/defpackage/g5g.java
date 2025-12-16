package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class g5g extends sk0 implements Handler.Callback {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public gf6 E0;
    public iof F0;
    public nof G0;
    public z62 H0;
    public z62 I0;
    public int J0;
    public long K0;
    public final Handler w0;
    public final xl5 x0;
    public final jbe y0;
    public final i5i z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5g(xl5 xl5Var, Looper looper) {
        Handler handler;
        super(3);
        jbe jbeVar = jbe.z0;
        this.x0 = xl5Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = xxg.a;
            handler = new Handler(looper, this);
        }
        this.w0 = handler;
        this.y0 = jbeVar;
        this.z0 = new i5i();
        this.K0 = -9223372036854775807L;
    }

    public final void A(SubtitleDecoderException subtitleDecoderException) {
        String strValueOf = String.valueOf(this.E0);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(strValueOf);
        pai.c("TextRenderer", sb.toString(), subtitleDecoderException);
        List list = Collections.EMPTY_LIST;
        Handler handler = this.w0;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.x0.a.w0.j(27, new oh2(1, list));
        }
        C();
        iof iofVar = this.F0;
        iofVar.getClass();
        iofVar.release();
        this.F0 = null;
        this.D0 = 0;
        B();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g5g.B():void");
    }

    public final void C() {
        this.G0 = null;
        this.J0 = -1;
        z62 z62Var = this.H0;
        if (z62Var != null) {
            z62Var.w();
            this.H0 = null;
        }
        z62 z62Var2 = this.I0;
        if (z62Var2 != null) {
            z62Var2.w();
            this.I0 = null;
        }
    }

    @Override // defpackage.sk0
    public final String f() {
        return "TextRenderer";
    }

    @Override // defpackage.sk0
    public final boolean h() {
        return this.B0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        this.x0.a.w0.j(27, new oh2(1, (List) message.obj));
        return true;
    }

    @Override // defpackage.sk0
    public final boolean i() {
        return true;
    }

    @Override // defpackage.sk0
    public final void j() {
        this.E0 = null;
        this.K0 = -9223372036854775807L;
        List list = Collections.EMPTY_LIST;
        Handler handler = this.w0;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.x0.a.w0.j(27, new oh2(1, list));
        }
        C();
        iof iofVar = this.F0;
        iofVar.getClass();
        iofVar.release();
        this.F0 = null;
        this.D0 = 0;
    }

    @Override // defpackage.sk0
    public final void l(long j, boolean z) {
        List list = Collections.EMPTY_LIST;
        Handler handler = this.w0;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            this.x0.a.w0.j(27, new oh2(1, list));
        }
        this.A0 = false;
        this.B0 = false;
        this.K0 = -9223372036854775807L;
        if (this.D0 == 0) {
            C();
            iof iofVar = this.F0;
            iofVar.getClass();
            iofVar.flush();
            return;
        }
        C();
        iof iofVar2 = this.F0;
        iofVar2.getClass();
        iofVar2.release();
        this.F0 = null;
        this.D0 = 0;
        B();
    }

    @Override // defpackage.sk0
    public final void p(gf6[] gf6VarArr, long j, long j2) {
        this.E0 = gf6VarArr[0];
        if (this.F0 != null) {
            this.D0 = 1;
        } else {
            B();
        }
    }

    @Override // defpackage.sk0
    public final void t(long j, long j2) {
        boolean z;
        i5i i5iVar = this.z0;
        if (this.u0) {
            long j3 = this.K0;
            if (j3 != -9223372036854775807L && j >= j3) {
                C();
                this.B0 = true;
            }
        }
        if (this.B0) {
            return;
        }
        if (this.I0 == null) {
            iof iofVar = this.F0;
            iofVar.getClass();
            iofVar.a(j);
            try {
                iof iofVar2 = this.F0;
                iofVar2.getClass();
                this.I0 = iofVar2.b();
            } catch (SubtitleDecoderException e) {
                A(e);
                return;
            }
        }
        if (this.X != 2) {
            return;
        }
        if (this.H0 != null) {
            long jZ = z();
            z = false;
            while (jZ <= j) {
                this.J0++;
                jZ = z();
                z = true;
            }
        } else {
            z = false;
        }
        z62 z62Var = this.I0;
        if (z62Var != null) {
            if (z62Var.j(4)) {
                if (!z && z() == BuildConfig.MAX_TIME_TO_UPLOAD) {
                    if (this.D0 == 2) {
                        C();
                        iof iofVar3 = this.F0;
                        iofVar3.getClass();
                        iofVar3.release();
                        this.F0 = null;
                        this.D0 = 0;
                        B();
                    } else {
                        C();
                        this.B0 = true;
                    }
                }
            } else if (z62Var.c <= j) {
                z62 z62Var2 = this.H0;
                if (z62Var2 != null) {
                    z62Var2.w();
                }
                this.J0 = z62Var.e(j);
                this.H0 = z62Var;
                this.I0 = null;
                z = true;
            }
        }
        if (z) {
            this.H0.getClass();
            List listM = this.H0.m(j);
            Handler handler = this.w0;
            if (handler != null) {
                handler.obtainMessage(0, listM).sendToTarget();
            } else {
                this.x0.a.w0.j(27, new oh2(1, listM));
            }
        }
        if (this.D0 == 2) {
            return;
        }
        while (!this.A0) {
            try {
                nof nofVar = this.G0;
                if (nofVar == null) {
                    iof iofVar4 = this.F0;
                    iofVar4.getClass();
                    nofVar = (nof) iofVar4.c();
                    if (nofVar == null) {
                        return;
                    } else {
                        this.G0 = nofVar;
                    }
                }
                if (this.D0 == 1) {
                    nofVar.b = 4;
                    iof iofVar5 = this.F0;
                    iofVar5.getClass();
                    iofVar5.d(nofVar);
                    this.G0 = null;
                    this.D0 = 2;
                    return;
                }
                int iQ = q(i5iVar, nofVar, 0);
                if (iQ == -4) {
                    if (nofVar.j(4)) {
                        this.A0 = true;
                        this.C0 = false;
                    } else {
                        gf6 gf6Var = (gf6) i5iVar.b;
                        if (gf6Var == null) {
                            return;
                        }
                        nofVar.s0 = gf6Var.z0;
                        nofVar.z();
                        this.C0 &= !nofVar.j(1);
                    }
                    if (!this.C0) {
                        iof iofVar6 = this.F0;
                        iofVar6.getClass();
                        iofVar6.d(nofVar);
                        this.G0 = null;
                    }
                } else if (iQ == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                A(e2);
                return;
            }
        }
    }

    @Override // defpackage.sk0
    public final int x(gf6 gf6Var) {
        this.y0.getClass();
        String str = gf6Var.v0;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return sk0.b(gf6Var.O0 == 0 ? 4 : 2, 0, 0);
        }
        return wz9.i(gf6Var.v0) ? sk0.b(1, 0, 0) : sk0.b(0, 0, 0);
    }

    public final long z() {
        if (this.J0 == -1) {
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        this.H0.getClass();
        return this.J0 >= this.H0.s() ? BuildConfig.MAX_TIME_TO_UPLOAD : this.H0.g(this.J0);
    }
}
