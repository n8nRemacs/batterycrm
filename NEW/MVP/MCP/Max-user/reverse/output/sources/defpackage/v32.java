package defpackage;

import android.os.SystemClock;
import android.util.SparseLongArray;
import androidx.camera.core.ImageCaptureException;
import androidx.media3.common.VideoFrameProcessingException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class v32 implements td4, ud4, gof, d4h, hp5, ip5, jp5, kp5, fw8, nva {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ v32(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.td4
    public boolean A() {
        switch (this.a) {
        }
        return true;
    }

    @Override // defpackage.jp5
    public rfg B(int i, int i2) {
        return ((jp5) this.c).B(i, i2);
    }

    @Override // defpackage.td4
    public long C() {
        switch (this.a) {
        }
        return 0L;
    }

    @Override // defpackage.td4
    public long D(long j) {
        int i;
        switch (this.a) {
            case 3:
                i = ((g93) this.c).a;
                break;
            default:
                i = ((h93) this.c).a;
                break;
        }
        return i;
    }

    @Override // defpackage.td4
    public long E(long j, long j2) {
        int i;
        switch (this.a) {
            case 3:
                i = ((g93) this.c).a;
                break;
            default:
                i = ((h93) this.c).a;
                break;
        }
        return i;
    }

    @Override // defpackage.d4h
    public void F(float f) {
        ((s2f) this.c).f.execute(new pt0(this, f, 2));
    }

    @Override // defpackage.hp5
    public int G() {
        return ((hp5) this.c).G();
    }

    @Override // defpackage.fw8
    public void J(c3c c3cVar) {
    }

    @Override // defpackage.ip5
    public boolean K(int i, boolean z) {
        return ((ip5) this.c).K(i, true);
    }

    @Override // defpackage.jp5
    public void N(h9e h9eVar) {
        ((jp5) this.c).N(new xbf(this, h9eVar));
    }

    @Override // defpackage.d4h
    public void O() {
        ((s2f) this.c).f.execute(new bee(11, this));
    }

    @Override // defpackage.ip5
    public boolean P(int i, boolean z) {
        return ((ip5) this.c).P(i, true);
    }

    @Override // defpackage.kp5
    public void Q(i9e i9eVar) {
        ((kp5) this.c).Q(new ybf(this, i9eVar, i9eVar));
    }

    public void T(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        v32 v32Var = (v32) this.c;
        if (v32Var != null) {
            v32Var.T(i - 64);
        }
    }

    public int U(int i) {
        v32 v32Var = (v32) this.c;
        if (v32Var == null) {
            return i >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + v32Var.U(i - 64);
    }

    public void V() {
        if (((v32) this.c) == null) {
            this.c = new v32(1);
        }
    }

    public boolean W(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        V();
        return ((v32) this.c).W(i - 64);
    }

    public CharSequence X() {
        Object next;
        Iterator it = ((ArrayList) this.c).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            a3i a3iVar = (a3i) next;
            if ((a3iVar instanceof d3i) && ((d3i) a3iVar).c) {
                break;
            }
        }
        d3i d3iVar = next instanceof d3i ? (d3i) next : null;
        if (d3iVar != null) {
            return d3iVar.a;
        }
        return null;
    }

    public long Y() {
        ag agVar = (ag) this.c;
        long j = this.b;
        if (j != -1) {
            return j;
        }
        this.b = 0L;
        int iA = agVar.a();
        for (int i = 0; i < iA; i++) {
            this.b += agVar.b(i);
        }
        return this.b;
    }

    public void Z(int i, boolean z) {
        if (i >= 64) {
            V();
            ((v32) this.c).Z(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            f0(i);
        } else {
            T(i);
        }
        if (z2 || ((v32) this.c) != null) {
            V();
            ((v32) this.c).Z(0, z2);
        }
    }

    @Override // defpackage.hp5
    public boolean a(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((hp5) this.c).a(bArr, 0, i2, z);
            default:
                return ((ip5) this.c).a(bArr, 0, i2, z);
        }
    }

    public void a0(String str) {
        long seconds = TimeUnit.NANOSECONDS.toSeconds(System.nanoTime() - this.b);
        float nanos = (r0 - TimeUnit.SECONDS.toNanos(seconds)) / TimeUnit.MILLISECONDS.toNanos(1L);
        String str2 = seconds == 0 ? String.format(Locale.ROOT, "%.1f ms", Float.valueOf(nanos)) : String.format(Locale.ROOT, "%d seconds and %.1f ms", Long.valueOf(seconds), Float.valueOf(nanos));
        ((y6d) this.c).log("OKRTCCall", str + " completed in " + str2);
    }

    @Override // defpackage.td4
    public long b(long j) {
        long j2;
        long j3;
        switch (this.a) {
            case 3:
                j2 = ((g93) this.c).e[(int) j];
                j3 = this.b;
                break;
            default:
                j2 = ((h93) this.c).o[(int) j];
                j3 = this.b;
                break;
        }
        return j2 - j3;
    }

    public void b0(ImageCaptureException imageCaptureException) {
        wqi.c(v32.class.getName(), "capture image with error", new Object[0]);
        CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) this.c;
        cameraxCameraApiView.getFreezeCameraDetector().a();
        q22 q22Var = cameraxCameraApiView.s0;
        if (q22Var != null) {
            ((s6b) q22Var).c(new CameraExceptionImpl(imageCaptureException));
        }
    }

    @Override // defpackage.fw8
    /* renamed from: c */
    public c3c mo25c() {
        return c3c.d;
    }

    public j17 c0() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String strJ = ((wv0) this.c).j(this.b);
            this.b -= strJ.length();
            if (strJ.length() == 0) {
                break;
            }
            int iC = vmf.C(strJ, ':', 1, 4);
            if (iC != -1) {
                String strSubstring = strJ.substring(0, iC);
                String strSubstring2 = strJ.substring(iC + 1);
                arrayList.add(strSubstring);
                arrayList.add(vmf.c0(strSubstring2).toString());
            } else if (strJ.charAt(0) == ':') {
                String strSubstring3 = strJ.substring(1);
                arrayList.add("");
                arrayList.add(vmf.c0(strSubstring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(vmf.c0(strJ).toString());
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new j17((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // defpackage.d4h
    public void d(VideoFrameProcessingException videoFrameProcessingException) {
        ((s2f) this.c).f.execute(new aee(this, 14, videoFrameProcessingException));
    }

    public boolean d0(int i) {
        if (i >= 64) {
            V();
            return ((v32) this.c).d0(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        v32 v32Var = (v32) this.c;
        if (v32Var != null) {
            if (v32Var.W(0)) {
                f0(63);
            }
            ((v32) this.c).d0(0);
        }
        return z;
    }

    @Override // defpackage.gof
    public int e(long j) {
        return this.b > j ? 0 : -1;
    }

    public void e0() {
        this.b = 0L;
        v32 v32Var = (v32) this.c;
        if (v32Var != null) {
            v32Var.e0();
        }
    }

    @Override // defpackage.td4
    public long f(long j, long j2) {
        switch (this.a) {
            case 3:
                return ((g93) this.c).d[(int) j];
            default:
                return ((h93) this.c).d[(int) j];
        }
    }

    public void f0(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            V();
            ((v32) this.c).f0(i - 64);
        }
    }

    @Override // defpackage.gof
    public long g(int i) {
        fsi.b(i == 0);
        return this.b;
    }

    public void g0(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
            this.b = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.b) {
            Exception exc2 = (Exception) this.c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.c;
            this.c = null;
            throw exc3;
        }
    }

    @Override // defpackage.hp5
    public long getLength() {
        long length;
        long j;
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                length = ((hp5) this.c).getLength();
                j = this.b;
                break;
            default:
                length = ((ip5) this.c).getLength();
                j = this.b;
                break;
        }
        return length - j;
    }

    @Override // defpackage.hp5
    public long getPosition() {
        long position;
        long j;
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                position = ((hp5) this.c).getPosition();
                j = this.b;
                break;
            default:
                position = ((ip5) this.c).getPosition();
                j = this.b;
                break;
        }
        return position - j;
    }

    @Override // defpackage.td4
    public long h(long j, long j2) {
        switch (this.a) {
        }
        return 0L;
    }

    public void h0(int i, long j) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.c;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            sparseLongArray.put(i, j);
            if (j2 == -9223372036854775807L || j2 == this.b) {
                String str = zxg.a;
                if (sparseLongArray.size() == 0) {
                    throw new NoSuchElementException();
                }
                long jMin = BuildConfig.MAX_TIME_TO_UPLOAD;
                for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
                    jMin = Math.min(jMin, sparseLongArray.valueAt(i2));
                }
                this.b = jMin;
            }
        }
    }

    @Override // defpackage.hp5
    public void i(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((hp5) this.c).i(i, bArr, i2);
                break;
            default:
                ((ip5) this.c).i(i, bArr, i2);
                break;
        }
    }

    @Override // defpackage.td4
    public long j(long j, long j2) {
        switch (this.a) {
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.td4
    public q7d k(long j) {
        return new q7d(((g93) this.c).c[(int) j], r1.b[r7], null);
    }

    @Override // defpackage.d4h
    public void l(int i, int i2) {
        ((s2f) this.c).f.execute(new vu0(this, i, i2, 4));
    }

    @Override // defpackage.gof
    public List m(long j) {
        if (j >= this.b) {
            return (wg7) this.c;
        }
        t76 t76Var = wg7.b;
        return zjd.o;
    }

    @Override // defpackage.hp5
    public boolean n(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((hp5) this.c).n(bArr, i, i2, z);
            default:
                return ((ip5) this.c).n(bArr, i, i2, z);
        }
    }

    @Override // defpackage.hp5
    public long o() {
        long jO;
        long j;
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                jO = ((hp5) this.c).o();
                j = this.b;
                break;
            default:
                jO = ((ip5) this.c).o();
                j = this.b;
                break;
        }
        return jO - j;
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        vhb vhbVar = (vhb) this.c;
        ((AtomicLong) vhbVar.c).set(this.b);
    }

    @Override // defpackage.d4h
    public void p(long j, boolean z) {
        if (j == 0) {
            ((s2f) this.c).l = true;
        }
        this.b = j;
        ((s2f) this.c).f.execute(new c7a(this, j, z, 1));
    }

    @Override // defpackage.hp5
    public void q(int i) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((hp5) this.c).q(i);
                break;
            default:
                ((ip5) this.c).q(i);
                break;
        }
    }

    @Override // defpackage.fw8
    public long r() {
        return this.b;
    }

    @Override // defpackage.je4
    public int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((hp5) this.c).read(bArr, i, i2);
            default:
                return ((ip5) this.c).read(bArr, i, i2);
        }
    }

    @Override // defpackage.hp5
    public void readFully(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((hp5) this.c).readFully(bArr, i, i2);
                break;
            default:
                ((ip5) this.c).readFully(bArr, i, i2);
                break;
        }
    }

    @Override // defpackage.gof
    public int s() {
        return 1;
    }

    @Override // defpackage.hp5
    public int t(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((hp5) this.c).t(i, bArr, i2);
            default:
                return ((ip5) this.c).t(i, bArr, i2);
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                if (((v32) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((v32) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.td4
    public long u(long j, long j2) {
        int iE;
        switch (this.a) {
            case 3:
                iE = xxg.e(((g93) this.c).e, j + this.b, true);
                break;
            default:
                iE = zxg.e(((h93) this.c).o, j + this.b, true);
                break;
        }
        return iE;
    }

    @Override // defpackage.ip5
    public int v(int i) {
        return ((ip5) this.c).v(i);
    }

    @Override // defpackage.jp5
    public void w() {
        switch (this.a) {
            case 16:
                ((jp5) this.c).w();
                break;
            default:
                ((kp5) this.c).w();
                break;
        }
    }

    @Override // defpackage.hp5
    public void y() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((hp5) this.c).y();
                break;
            default:
                ((ip5) this.c).y();
                break;
        }
    }

    @Override // defpackage.hp5
    public void z(int i) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((hp5) this.c).z(i);
                break;
            default:
                ((ip5) this.c).z(i);
                break;
        }
    }

    @Override // defpackage.kp5
    /* renamed from: B, reason: collision with other method in class */
    public sfg mo163B(int i, int i2) {
        return ((kp5) this.c).mo163B(i, i2);
    }

    @Override // defpackage.ud4
    /* renamed from: k, reason: collision with other method in class */
    public r7d mo164k(long j) {
        return new r7d(((h93) this.c).c[(int) j], r1.b[r7], null);
    }

    public /* synthetic */ v32(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public /* synthetic */ v32(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public v32(prd prdVar, u4e u4eVar) {
        this.a = 12;
        this.c = new AtomicInteger(0);
        int iIntValue = ((Number) prdVar.invoke()).intValue() + 1;
        ((w4e) u4eVar.b).g(iIntValue, "request_id");
        this.b = iIntValue << 32;
    }

    public v32(InetAddress[] inetAddressArr, long j) {
        this.a = 6;
        this.c = inetAddressArr;
        this.b = j;
        if (inetAddressArr.length == 0) {
            throw new IllegalStateException("Addresses MUST NOT be empty");
        }
    }

    public v32(ag agVar) {
        this.a = 7;
        this.c = agVar;
        this.b = -1L;
    }

    public v32(wv0 wv0Var) {
        this.a = 10;
        this.c = wv0Var;
        this.b = 262144;
    }

    public v32(hp5 hp5Var, long j) {
        this.a = 14;
        this.c = hp5Var;
        fsi.b(hp5Var.getPosition() >= j);
        this.b = j;
    }

    public v32(ip5 ip5Var, long j) {
        this.a = 15;
        this.c = ip5Var;
        hsi.b(ip5Var.getPosition() >= j);
        this.b = j;
    }

    public v32(int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.c = new SparseLongArray();
                break;
            default:
                this.b = 0L;
                break;
        }
    }
}
