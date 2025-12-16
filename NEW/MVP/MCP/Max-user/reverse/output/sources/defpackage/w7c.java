package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.recyclerview.widget.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import tech.kwik.agent15.TlsProtocolException;
import tech.kwik.agent15.alert.DecodeErrorException;
import tech.kwik.agent15.alert.IllegalParameterAlert;

/* loaded from: classes2.dex */
public final class w7c implements oeh, ooe, td4, n9f, hdh, ge8 {
    public Object a;

    public /* synthetic */ w7c(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.td4
    public boolean A() {
        return true;
    }

    @Override // defpackage.hdh
    public int B() {
        return 2;
    }

    @Override // defpackage.td4
    public long C() {
        return 0L;
    }

    @Override // defpackage.td4
    public long D(long j) {
        return 1L;
    }

    @Override // defpackage.td4
    public long E(long j, long j2) {
        return 1L;
    }

    @Override // defpackage.hdh
    public int F() {
        g2h g2hVar = ((VideoViewerWidget) this.a).s0;
        if (g2hVar != null) {
            return g2hVar.getHeight();
        }
        return 0;
    }

    @Override // defpackage.hdh
    public void J(Surface surface, a3h a3hVar) {
        cbh cbhVarO0;
        String str = ((VideoViewerWidget) this.a).a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Media viewer. Video viewer, set surface " + surface, null);
            }
        }
        rdh rdhVarA0 = ((VideoViewerWidget) this.a).A0();
        if (rdhVarA0 == null || (cbhVarO0 = ((ChatMediaViewerScreen) rdhVarA0).O0()) == null) {
            return;
        }
        cbhVarO0.a0(surface);
        cbhVarO0.O(a3hVar);
    }

    @Override // defpackage.ge8
    public void a(boolean z) {
        ((k01) this.a).l(x71.Y, Boolean.valueOf(z));
    }

    @Override // defpackage.td4
    public long b(long j) {
        return 0L;
    }

    @Override // defpackage.oeh
    public int c(View view) {
        return a.C(view) - ((ViewGroup.MarginLayoutParams) ((xhd) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.n9f
    public m9f d() {
        return (u1j) this.a;
    }

    public void e(long j, long j2) {
        hhg hhgVar = (hhg) this.a;
        f65 f65Var = hhgVar.q;
        f65Var.getClass();
        boolean z = true;
        hsi.b(j >= 0 || j == -9223372036854775807L);
        f65Var.a = j;
        if (j2 <= 0 && j2 != -1) {
            z = false;
        }
        hsi.a("Invalid file size = " + j2, z);
        f65Var.b = j2;
        lhg lhgVar = hhgVar.s;
        lhgVar.getClass();
        lhgVar.e();
        lhgVar.j.b(null, 4, 0, 0).b();
    }

    @Override // defpackage.td4
    public long f(long j, long j2) {
        return j2;
    }

    @Override // defpackage.ooe
    public void g(long j, boolean z) {
        ((sm6) this.a).invoke(Long.valueOf(j), Boolean.valueOf(z));
    }

    @Override // defpackage.td4
    public long h(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.oeh
    public int i() {
        return ((a) this.a).K();
    }

    @Override // defpackage.td4
    public long j(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.td4
    public q7d k(long j) {
        return (q7d) this.a;
    }

    @Override // defpackage.hdh
    public int m() {
        g2h g2hVar = ((VideoViewerWidget) this.a).s0;
        if (g2hVar != null) {
            return g2hVar.getWidth();
        }
        return 0;
    }

    @Override // defpackage.oeh
    public int n() {
        a aVar = (a) this.a;
        return aVar.n - aVar.L();
    }

    public h07 o(ByteBuffer byteBuffer, pl9 pl9Var, int i) throws TlsProtocolException {
        i62 i62Var = (i62) this.a;
        byte b = byteBuffer.get();
        int i2 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        if (b == lbg.client_hello.a) {
            hb3 hb3Var = new hb3(byteBuffer, i62Var);
            if (pl9Var != null) {
                pl9Var.a();
            }
            return hb3Var;
        }
        lbg lbgVar = lbg.server_hello;
        if (b == lbgVar.a) {
            lfe lfeVar = new lfe();
            lfeVar.d = Collections.EMPTY_LIST;
            int i3 = i2 + 4;
            if (byteBuffer.remaining() < 44) {
                throw new DecodeErrorException("Message too short");
            }
            byteBuffer.getInt();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            if (b2 != 3 || b3 != 3) {
                throw new IllegalParameterAlert("Invalid version number (should be 0x0303)");
            }
            byte[] bArr = new byte[32];
            lfeVar.b = bArr;
            byteBuffer.get(bArr);
            if (Arrays.equals(lfeVar.b, lfe.e)) {
                ah8.a("HelloRetryRequest!");
            }
            int i4 = byteBuffer.get() & 255;
            if (i4 > 32) {
                throw new DecodeErrorException("session id length exceeds 32");
            }
            byteBuffer.get(new byte[i4]);
            Arrays.stream(jbg.values()).filter(new fb3(byteBuffer.getShort(), 2)).findFirst().ifPresent(new m4(18, lfeVar));
            if (byteBuffer.get() != 0) {
                throw new DecodeErrorException("Legacy compression method must have the value 0");
            }
            lfeVar.d = h07.c(byteBuffer, lbgVar, null);
            lfeVar.a = new byte[i3];
            byteBuffer.get(lfeVar.a);
            if (pl9Var != null) {
                pl9Var.h(lfeVar);
            }
            return lfeVar;
        }
        if (b == lbg.encrypted_extensions.a) {
            h72 h72Var = new h72(1);
            List list = Collections.EMPTY_LIST;
            h72Var.c = list;
            List list2 = (List) list.stream().map(new m0(18)).collect(Collectors.toList());
            int iSum = list2.stream().mapToInt(new n0(11)).sum();
            byte[] bArr2 = new byte[iSum + 6];
            h72Var.b = bArr2;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
            byteBufferWrap.putInt((iSum + 2) | 134217728);
            byteBufferWrap.putShort((short) iSum);
            list2.forEach(new as(3, byteBufferWrap));
            int i5 = i2 + 4;
            if (byteBuffer.remaining() < 6) {
                throw new DecodeErrorException("Message too short");
            }
            int iPosition = byteBuffer.position();
            int i6 = byteBuffer.getInt() & 16777215;
            if (byteBuffer.remaining() < i6 || i6 < 2) {
                throw new DecodeErrorException("Incorrect message length");
            }
            h72Var.c = h07.c(byteBuffer, lbgVar, i62Var);
            h72Var.b = new byte[i5];
            byteBuffer.get(h72Var.b);
            if (pl9Var != null) {
                pl9Var.e(h72Var, i);
            }
            return h72Var;
        }
        lbg lbgVar2 = lbg.certificate;
        if (b == lbgVar2.a) {
            f72 f72Var = new f72();
            f72Var.c = new ArrayList();
            int iPosition2 = byteBuffer.position();
            int iD = f72Var.d(byteBuffer, lbgVar2, 13);
            try {
                int i7 = byteBuffer.get() & 255;
                if (i7 > 0) {
                    byte[] bArr3 = new byte[i7];
                    f72Var.a = bArr3;
                    byteBuffer.get(bArr3);
                } else {
                    f72Var.a = new byte[0];
                }
                f72Var.e(byteBuffer);
                f72Var.d = new byte[iD + 4];
                byteBuffer.get(f72Var.d);
                if (pl9Var != null) {
                    pl9Var.f(f72Var, i);
                }
                return f72Var;
            } catch (BufferUnderflowException unused) {
                throw new DecodeErrorException("message underflow");
            }
        }
        lbg lbgVar3 = lbg.certificate_request;
        if (b == lbgVar3.a) {
            h72 h72Var2 = new h72(0);
            int iPosition3 = byteBuffer.position();
            int iD2 = h72Var2.d(byteBuffer, lbgVar3, 7);
            int i8 = byteBuffer.get();
            byte[] bArr4 = new byte[i8];
            if (i8 > 0) {
                byteBuffer.get(bArr4);
            }
            h72Var2.c = h07.c(byteBuffer, lbgVar3, null);
            if (byteBuffer.position() - (iPosition3 + 4) != iD2) {
                throw new DecodeErrorException("inconsistent length");
            }
            h72Var2.b = new byte[iD2 + 4];
            byteBuffer.get(h72Var2.b);
            if (pl9Var != null) {
                pl9Var.c(h72Var2, i);
            }
            return h72Var2;
        }
        lbg lbgVar4 = lbg.certificate_verify;
        if (b == lbgVar4.a) {
            i72 i72Var = new i72();
            int i9 = i2 + 4;
            int iPosition4 = byteBuffer.position();
            int iD3 = i72Var.d(byteBuffer, lbgVar4, 9);
            try {
                i72Var.a = (obg) Arrays.stream(obg.values()).filter(new fb3(byteBuffer.getShort(), 4)).findFirst().orElse(null);
                byte[] bArr5 = new byte[byteBuffer.getShort() & 65535];
                i72Var.b = bArr5;
                byteBuffer.get(bArr5);
                if (byteBuffer.position() - iPosition4 != iD3 + 4) {
                    throw new DecodeErrorException("Incorrect message length");
                }
                i72Var.c = new byte[i9];
                byteBuffer.get(i72Var.c);
                if (pl9Var != null) {
                    pl9Var.b(i72Var, i);
                }
                return i72Var;
            } catch (BufferUnderflowException unused2) {
                throw new DecodeErrorException("message underflow");
            }
        }
        lbg lbgVar5 = lbg.finished;
        if (b == lbgVar5.a) {
            h72 h72Var3 = new h72(2);
            int i10 = i2 + 4;
            ah8.a("Got Finished message (" + i10 + " bytes)");
            byte[] bArr6 = new byte[h72Var3.d(byteBuffer, lbgVar5, 36)];
            h72Var3.b = bArr6;
            byteBuffer.get(bArr6);
            byte[] bArr7 = new byte[i10];
            h72Var3.c = bArr7;
            byteBuffer.get(bArr7);
            if (pl9Var != null) {
                pl9Var.d(h72Var3, i);
            }
            return h72Var3;
        }
        lbg lbgVar6 = lbg.new_session_ticket;
        if (b != lbgVar6.a) {
            throw new TlsProtocolException(wy1.e(b, "Invalid/unsupported message type (", ")"));
        }
        cha chaVar = new cha();
        int iD4 = chaVar.d(byteBuffer, lbgVar6, 17);
        int i11 = byteBuffer.getInt();
        chaVar.d = i11;
        if (i11 > 604800 || i11 < 0) {
            throw new IllegalParameterAlert("Invalid ticket lifetime");
        }
        chaVar.a = byteBuffer.getInt() & 4294967295L;
        int i12 = iD4 - 8;
        byte[] bArrE = cha.e("ticket nonce", byteBuffer, 1, i12);
        chaVar.c = bArrE;
        chaVar.b = cha.e("ticket", byteBuffer, 2, i12 - (bArrE.length + 1));
        Iterator it = h07.c(byteBuffer, lbgVar6, null).iterator();
        while (it.hasNext()) {
            rn5 rn5Var = (rn5) it.next();
            if (rn5Var instanceof g85) {
                if (chaVar.e != null) {
                    throw new DecodeErrorException("repeated extension is not allowed");
                }
                chaVar.e = (g85) rn5Var;
            }
        }
        if (pl9Var != null) {
            pl9Var.g(chaVar, i);
        }
        return chaVar;
    }

    @Override // defpackage.hdh
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((VideoViewerWidget) this.a).a;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, null);
        }
    }

    @Override // defpackage.oeh
    public View p(int i) {
        return ((a) this.a).w(i);
    }

    @Override // defpackage.oeh
    public int q(View view) {
        return a.F(view) + ((ViewGroup.MarginLayoutParams) ((xhd) view.getLayoutParams())).rightMargin;
    }

    public boolean r() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) this.a;
        boolean z = false;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (!(Build.VERSION.SDK_INT >= 28 && ry1.t(torchFlashRequiredFor3aUpdateQuirk.a, 5) == 5)) {
                z = true;
            }
        }
        gri.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z);
        return z;
    }

    @Override // defpackage.td4
    public long u(long j, long j2) {
        return 0L;
    }

    public /* synthetic */ w7c(qc4 qc4Var) {
        hfd hfdVar = new hfd(16, qc4Var);
        this.a = uci.a(new zid(uci.a(new jkc(uci.a(new enb(hfdVar, 21, uci.a(new znd(hfdVar)))), uci.a(new kme(11, hfdVar)), hfdVar))));
    }
}
