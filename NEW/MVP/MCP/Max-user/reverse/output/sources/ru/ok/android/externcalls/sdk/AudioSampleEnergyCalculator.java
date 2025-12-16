package ru.ok.android.externcalls.sdk;

import android.os.Handler;
import defpackage.hlb;
import defpackage.k50;
import defpackage.nz9;
import defpackage.u50;

/* loaded from: classes2.dex */
public class AudioSampleEnergyCalculator implements nz9 {
    private final Handler mainThreadHandler;
    private final k50 processor = new k50();

    public AudioSampleEnergyCalculator(Handler handler) {
        this.mainThreadHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSample$0(long j) {
        this.processor.a(j);
    }

    public k50 getProcessor() {
        return this.processor;
    }

    @Override // defpackage.nz9
    public void onSample(int i, int i2, int i3, hlb hlbVar) {
        long j = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= hlbVar.a) {
                this.mainThreadHandler.post(new u50(this, (long) Math.sqrt(j / r0), 1));
                return;
            } else {
                short sA = hlbVar.a(i4);
                j += sA * sA;
                i4++;
            }
        }
    }
}
