package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class o30 {
    public final crf a;
    public final Handler b;
    public sm5 c;
    public k20 d;
    public int f;
    public s30 h;
    public float g = 1.0f;
    public int e = 0;

    public o30(Context context, Looper looper, sm5 sm5Var) {
        this.a = ml6.k(new k30(context, 0));
        this.c = sm5Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.get();
        AudioFocusRequest audioFocusRequest = this.h.f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i) {
        sm5 sm5Var = this.c;
        if (sm5Var != null) {
            wwf wwfVar = sm5Var.Z;
            wwfVar.getClass();
            uwf uwfVarC = wwf.c();
            uwfVarC.a = wwfVar.a.obtainMessage(33, i, 0);
            uwfVarC.b();
        }
    }

    public final void c(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        sm5 sm5Var = this.c;
        if (sm5Var != null) {
            sm5Var.Z.f(34);
        }
    }

    public final int d(int i, boolean z) {
        int i2;
        c0 c0Var;
        boolean z2 = false;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z) {
            int i3 = this.e;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.e != 2) {
            s30 s30Var = this.h;
            if (s30Var == null) {
                if (s30Var == null) {
                    c0Var = new c0();
                    c0Var.c = k20.h;
                    c0Var.a = i2;
                } else {
                    c0 c0Var2 = new c0();
                    c0Var2.a = s30Var.a;
                    c0Var2.c = s30Var.d;
                    c0Var2.b = s30Var.e;
                    c0Var = c0Var2;
                }
                k20 k20Var = this.d;
                if (k20Var != null && k20Var.a == 1) {
                    z2 = true;
                }
                k20Var.getClass();
                c0Var.c = k20Var;
                c0Var.b = z2;
                j30 j30Var = new j30(0, this);
                Handler handler = this.b;
                handler.getClass();
                this.h = new s30(c0Var.a, j30Var, handler, (k20) c0Var.c, c0Var.b);
            }
            AudioManager audioManager = (AudioManager) this.a.get();
            AudioFocusRequest audioFocusRequest = this.h.f;
            audioFocusRequest.getClass();
            if (audioManager.requestAudioFocus(audioFocusRequest) == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
