package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Looper;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class xn3 implements vib, wzg {
    public final /* synthetic */ int a;
    public boolean b;

    public /* synthetic */ xn3(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public static h52 c(h52 h52Var) {
        w30 w30Var = new w30();
        w30Var.c = h52Var.c;
        Iterator it = Collections.unmodifiableList(h52Var.a).iterator();
        while (it.hasNext()) {
            ((HashSet) w30Var.e).add((zr4) it.next());
        }
        w30Var.c(h52Var.b);
        x8a x8aVarB = x8a.b();
        x8aVarB.n(e02.N(CaptureRequest.FLASH_MODE), 0);
        w30Var.c(new e02(9, fjb.a(x8aVarB)));
        return w30Var.d();
    }

    public synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public boolean d(ArrayList arrayList, boolean z) {
        if (!this.b || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public void f(boolean z) {
        switch (this.a) {
            case 13:
                if (this.b != z) {
                    this.b = z;
                    break;
                }
                break;
            default:
                if (this.b != z) {
                    this.b = z;
                    break;
                }
                break;
        }
    }

    public boolean g(ArrayList arrayList, boolean z) {
        if (!this.b || !z) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wzg
    public long n(yeb yebVar) {
        switch (this.a) {
            case 2:
                return ipi.a(0, this.b ? yebVar.a().i().b.m : yebVar.a().r().b.m);
            case 3:
                return ipi.a(0, this.b ? yebVar.a().i().b.o : yebVar.a().r().b.o);
            default:
                return ipi.a(0, this.b ? yebVar.getIcon().a.e : yebVar.a().G().g.a);
        }
    }

    public xn3(i17 i17Var, int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = i17Var.d(UseTorchAsFlashQuirk.class);
                break;
            default:
                this.b = i17Var.d(Preview3AThreadCrashQuirk.class);
                break;
        }
    }

    public xn3(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = ((StillCaptureFlashStopRepeatingQuirk) rv4.a.e(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
            case 7:
                this.b = ov4.a.e(SurfaceOrderQuirk.class) != null;
                break;
            case 8:
                this.b = rv4.a.e(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
        }
    }

    public xn3(Context context, Looper looper, mwf mwfVar, int i) {
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                context.getApplicationContext();
                mwfVar.a(looper, null);
                break;
            default:
                context.getApplicationContext();
                mwfVar.a(looper, null);
                break;
        }
    }

    public xn3(bua buaVar, aua auaVar) throws zta {
        this.a = 4;
        int i = auaVar.a;
        ByteBuffer byteBuffer = auaVar.b;
        hsi.b(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        u62 u62Var = new u62(bArr, iMin, 3, (byte) 0);
        if (!buaVar.a) {
            if (u62Var.h()) {
                this.b = false;
                return;
            }
            int i2 = u62Var.i(2);
            boolean zH = u62Var.h();
            if (buaVar.b) {
                throw new zta();
            }
            if (!zH) {
                this.b = true;
                return;
            }
            boolean zH2 = (i2 == 3 || i2 == 0) ? true : u62Var.h();
            u62Var.s();
            if (buaVar.d) {
                if (u62Var.h()) {
                    if (buaVar.e) {
                        u62Var.s();
                    } else {
                        throw new zta();
                    }
                }
                if (!buaVar.c) {
                    if (i2 != 3) {
                        u62Var.s();
                    }
                    u62Var.t(buaVar.f);
                    if (i2 != 2 && i2 != 0 && !zH2) {
                        u62Var.t(3);
                    }
                    this.b = ((i2 == 3 || i2 == 0) ? 255 : u62Var.i(8)) != 0;
                    return;
                }
                throw new zta();
            }
            throw new zta();
        }
        throw new zta();
    }
}
