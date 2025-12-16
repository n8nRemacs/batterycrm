package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x20 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;

    public x20(eje ejeVar, pmb pmbVar, pmb pmbVar2, pmb pmbVar3, pmb pmbVar4, pmb pmbVar5, pmb pmbVar6, pmb pmbVar7, pmb pmbVar8, boolean z) {
        this.b = ejeVar;
        this.c = pmbVar;
        this.d = pmbVar2;
        this.e = pmbVar3;
        this.f = pmbVar4;
        this.g = pmbVar5;
        this.h = pmbVar6;
        this.i = pmbVar7;
        this.j = pmbVar8;
        this.a = z;
    }

    public void a(u20 u20Var) {
        ar4 ar4Var;
        if (!this.a || u20Var.equals((u20) this.h)) {
            return;
        }
        this.h = u20Var;
        ak4 ak4Var = (ak4) ((i62) this.c).b;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = ak4Var.f0 == looperMyLooper;
        StringBuilder sb = new StringBuilder("Current looper (");
        sb.append(looperMyLooper == null ? "null" : looperMyLooper.getThread().getName());
        sb.append(") is not the playback looper (");
        Looper looper = ak4Var.f0;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(")");
        hsi.f(sb.toString(), z);
        u20 u20Var2 = ak4Var.x;
        if (u20Var2 == null || u20Var.equals(u20Var2)) {
            return;
        }
        ak4Var.x = u20Var;
        y6i y6iVar = ak4Var.s;
        if (y6iVar != null) {
            mw8 mw8Var = (mw8) y6iVar.b;
            synchronized (mw8Var.a) {
                ar4Var = mw8Var.B0;
            }
            if (ar4Var != null) {
                synchronized (ar4Var.c) {
                    ar4Var.f.getClass();
                }
            }
        }
    }

    public void b() throws VideoFrameProcessingException {
        SparseArray sparseArray = (SparseArray) this.h;
        for (int i = 0; i < sparseArray.size(); i++) {
            zn7 zn7Var = (zn7) sparseArray.get(sparseArray.keyAt(i));
            if (!zn7Var.d) {
                zn7Var.d = true;
                zn7Var.a.q();
                jp4 jp4Var = zn7Var.b;
                if (jp4Var != null) {
                    jp4Var.release();
                }
            }
        }
    }

    public void c(AudioDeviceInfo audioDeviceInfo) {
        ao6 ao6Var = (ao6) this.i;
        if (Objects.equals(audioDeviceInfo, ao6Var == null ? null : (AudioDeviceInfo) ao6Var.b)) {
            return;
        }
        ao6 ao6Var2 = audioDeviceInfo != null ? new ao6(3, audioDeviceInfo) : null;
        this.i = ao6Var2;
        a(u20.b((Context) this.b, (k20) this.j, ao6Var2));
    }

    public x20(Context context, gf3 gf3Var, xo8 xo8Var, iy1 iy1Var, Executor executor, jr4 jr4Var, boolean z, boolean z2, boolean z3) {
        this.b = context;
        this.c = gf3Var;
        this.d = xo8Var;
        this.e = iy1Var;
        this.g = executor;
        this.f = jr4Var;
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.a = z2;
        zn7 zn7Var = new zn7(new ap5(xo8Var, iy1Var, z, z2));
        sparseArray.put(1, zn7Var);
        sparseArray.put(4, zn7Var);
        sparseArray.put(2, new zn7(new up0(xo8Var, iy1Var, z3)));
        sparseArray.put(3, new zn7(new p3g(xo8Var, iy1Var)));
    }

    public x20(Context context, i62 i62Var, k20 k20Var, ao6 ao6Var) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = i62Var;
        this.j = k20Var;
        this.i = ao6Var;
        Handler handlerO = zxg.o(null);
        this.d = handlerO;
        this.e = new v20(this);
        this.f = new eo(1, this);
        u20 u20Var = u20.c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new w20(this, handlerO, applicationContext.getContentResolver(), uriFor) : null;
    }
}
