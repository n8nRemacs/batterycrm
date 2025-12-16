package defpackage;

import android.util.Base64;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class te4 implements crf {
    public final /* synthetic */ int a;

    @Override // defpackage.crf
    public final Object get() {
        switch (this.a) {
            case 0:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (executorServiceNewSingleThreadExecutor instanceof va8) {
                    return (va8) executorServiceNewSingleThreadExecutor;
                }
                return executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new l2a((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new i2a(executorServiceNewSingleThreadExecutor);
            case 1:
                byte[] bArr = new byte[12];
                uo4.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new bo4(new ri4(), 50000, 50000, 1000, 2000, false);
            case 3:
                return new ao4(new qi4(), 50000, 50000, 2500, 5000);
            case 4:
                crf crfVar = k3c.a;
                return DefaultVideoFrameProcessor$Factory$Builder.class;
            default:
                throw new IllegalStateException();
        }
    }
}
