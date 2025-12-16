package ru.ok.android.externcalls.sdk;

import android.os.Handler;
import defpackage.d2i;
import defpackage.hlb;
import defpackage.nz9;

/* loaded from: classes2.dex */
public class AudioLevelListener implements nz9 {
    private final Handler handler;
    private boolean isActive;
    private final d2i noise;
    private final Runnable reporter;
    private final short triggerDiff;

    public AudioLevelListener(short s, Handler handler, Runnable runnable) {
        d2i d2iVar = new d2i();
        d2iVar.a = Float.NaN;
        this.noise = d2iVar;
        this.isActive = true;
        this.reporter = runnable;
        this.triggerDiff = s;
        this.handler = handler;
        d2iVar.a = Float.isNaN(d2iVar.a) ? 0.0f : 0.0f + (0.95f * d2iVar.a);
    }

    public void listen() {
        this.isActive = true;
    }

    @Override // defpackage.nz9
    public void onSample(int i, int i2, int i3, hlb hlbVar) {
        if (this.isActive) {
            float f = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
            for (int i4 = 0; i4 < hlbVar.a; i4++) {
                float fAbs = Math.abs((int) hlbVar.a(i4));
                f = Float.isNaN(f) ? fAbs : (0.3f * fAbs) + (0.7f * f);
                d2i d2iVar = this.noise;
                if (!Float.isNaN(d2iVar.a)) {
                    fAbs = (fAbs * 0.05f) + (0.95f * d2iVar.a);
                }
                d2iVar.a = fAbs;
                if (f - this.noise.a > this.triggerDiff) {
                    this.handler.post(this.reporter);
                    return;
                }
            }
        }
    }

    public void stop() {
        this.isActive = false;
    }
}
