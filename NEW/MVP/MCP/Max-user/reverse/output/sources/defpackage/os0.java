package defpackage;

import android.os.CancellationSignal;
import androidx.appcompat.widget.ActionMenuView;
import java.io.File;
import java.util.ArrayList;
import org.webrtc.VideoEncoderObserver;

/* loaded from: classes.dex */
public class os0 implements vx5, ru6, qu6, uf5, VideoEncoderObserver, lg9 {
    public boolean a;
    public Object b;

    @Override // defpackage.ru6
    public synchronized void a() {
        if (this.a) {
            ((hc8) this.b).a();
        }
    }

    public void b() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m45 c(int i) {
        return (m45) ((ArrayList) this.b).get(i);
    }

    @Override // defpackage.uf5
    public void d() {
        if (this.a) {
            return;
        }
        this.a = true;
        z71 z71Var = (z71) this.b;
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(new gwe(i));
        }
        z71Var.E(arrayList);
    }

    public void e() {
        this.a = false;
    }

    @Override // defpackage.lg9
    public void f(vf9 vf9Var, boolean z) {
        h7 h7Var;
        acg acgVar = (acg) this.b;
        if (this.a) {
            return;
        }
        this.a = true;
        ActionMenuView actionMenuView = acgVar.a.a.a;
        if (actionMenuView != null && (h7Var = actionMenuView.o) != null) {
            h7Var.g();
            e7 e7Var = h7Var.D0;
            if (e7Var != null && e7Var.b()) {
                e7Var.i.dismiss();
            }
        }
        acgVar.b.onPanelClosed(108, vf9Var);
        this.a = false;
    }

    @Override // defpackage.uf5
    public void g() {
        if (this.a) {
            this.a = false;
            ((z71) this.b).E(hd5.a);
        }
    }

    @Override // defpackage.vx5
    public void h(File file) {
        jl4 jl4Var;
        hl4 hl4VarG;
        if (this.a && (hl4VarG = jl4.g((jl4Var = (jl4) this.b), file)) != null) {
            String str = hl4VarG.b;
            if (str != ".tmp") {
                l5j.f(str == ".cnt");
                return;
            }
            long jLastModified = file.lastModified();
            jl4Var.e.getClass();
            if (jLastModified > System.currentTimeMillis() - jl4.f) {
                return;
            }
        }
        file.delete();
    }

    public void i() {
        ArrayList arrayList = (ArrayList) this.b;
        if (this.a) {
            return;
        }
        this.a = true;
        for (int i = 0; i < arrayList.size(); i++) {
            ((m45) arrayList.get(i)).f();
        }
    }

    @Override // defpackage.vx5
    public void j(File file) {
        if (this.a || !file.equals(((jl4) this.b).c)) {
            return;
        }
        this.a = true;
    }

    @Override // defpackage.vx5
    public void k(File file) {
        jl4 jl4Var = (jl4) this.b;
        if (!jl4Var.a.equals(file) && !this.a) {
            file.delete();
        }
        if (this.a && file.equals(jl4Var.c)) {
            this.a = false;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.b;
        if (this.a) {
            this.a = false;
            for (int i = 0; i < arrayList.size(); i++) {
                ((m45) arrayList.get(i)).g();
            }
        }
    }

    @Override // defpackage.qu6
    public void m() {
        if (this.a) {
            ((hc8) this.b).m();
        }
    }

    public void n(byte b) {
        ((bj) this.b).s(String.valueOf(b));
    }

    @Override // defpackage.qu6
    public void o(tu6 tu6Var) {
        if (this.a) {
            ((hc8) this.b).o(tu6Var);
        }
    }

    @Override // org.webrtc.VideoEncoderObserver
    public void onEncoderChanged(VideoEncoderObserver.EncoderInfo encoderInfo) {
        wpb wpbVar = (wpb) this.b;
        y6d y6dVar = wpbVar.C;
        StringBuilder sb = new StringBuilder("Encoder for ");
        boolean z = this.a;
        sb.append(z ? "camera" : "screen share");
        sb.append(" updated: ");
        sb.append(encoderInfo.getEncoderType());
        sb.append(", ");
        sb.append(encoderInfo.getImplementationName());
        sb.append(", isHw: ");
        sb.append(encoderInfo.isHardwareAccelerated());
        y6dVar.log("PCRTCClient", sb.toString());
        if (z) {
            wpbVar.i(new c(wpbVar, new qpb(this, 5, encoderInfo), 0), "onCameraEncoderInfoChanged");
        }
    }

    public void p(char c) {
        bj bjVar = (bj) this.b;
        bjVar.f(bjVar.b, 1);
        char[] cArr = (char[]) bjVar.c;
        int i = bjVar.b;
        bjVar.b = i + 1;
        cArr[i] = c;
    }

    public void q(int i) {
        ((bj) this.b).s(String.valueOf(i));
    }

    public void r(long j) {
        ((bj) this.b).s(String.valueOf(j));
    }

    @Override // org.webrtc.VideoEncoderObserver
    public void release() {
        ((wpb) this.b).C.log("PCRTCClient", "Encoder observer released isCamera=(" + this.a + ")");
    }

    public void s(String str) {
        ((bj) this.b).s(str);
    }

    public void t(short s) {
        ((bj) this.b).s(String.valueOf(s));
    }

    public void u(String str) {
        byte b;
        bj bjVar = (bj) this.b;
        bjVar.f(bjVar.b, str.length() + 2);
        char[] cArr = (char[]) bjVar.c;
        int i = bjVar.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = qmf.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    bjVar.f(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = qmf.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) bjVar.c)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = qmf.a[cCharAt];
                            bjVar.f(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) bjVar.c, i4);
                            int length3 = str2.length() + i4;
                            bjVar.b = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) bjVar.c;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            bjVar.b = i4;
                        }
                    }
                }
                bjVar.f(i4, 1);
                ((char[]) bjVar.c)[i4] = '\"';
                bjVar.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        bjVar.b = i3 + 1;
    }

    public void v() {
    }

    @Override // defpackage.ru6
    public synchronized void w(tu6 tu6Var, long j) {
        if (this.a) {
            ((hc8) this.b).w(tu6Var, j);
        }
    }

    @Override // defpackage.lg9
    public boolean x(vf9 vf9Var) {
        ((acg) this.b).b.onMenuOpened(108, vf9Var);
        return true;
    }

    @Override // defpackage.qu6
    public synchronized void y() {
        if (this.a) {
            ((hc8) this.b).y();
        }
    }

    public void z() {
    }

    public /* synthetic */ os0(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public os0(boolean z, ss8 ss8Var) {
        this.a = z;
        this.b = ss8Var;
    }

    public os0(bj bjVar) {
        this.b = bjVar;
        this.a = true;
    }
}
