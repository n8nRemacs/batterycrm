package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* loaded from: classes2.dex */
public final /* synthetic */ class fv1 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fv1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                CallsAudioManagerV3Impl.startTrackingAudioDevices$lambda$4$lambda$3((CallsAudioManagerV3Impl) this.b, runnable);
                break;
            case 1:
                ((Handler) this.b).post(runnable);
                break;
            case 2:
                zxg.a0(((yx8) this.b).Z, runnable);
                break;
            case 3:
                zxg.a0(((f29) this.b).d, runnable);
                break;
            case 4:
                zxg.a0(((o79) this.b).l, runnable);
                break;
            case 5:
                ((wwf) this.b).d(runnable);
                break;
            default:
                ((wwf) ((e07) this.b)).d(runnable);
                break;
        }
    }
}
