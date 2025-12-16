package Ba1;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.os.VibratorManager;

/* renamed from: Ba1.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13128f {

    /* renamed from: a, reason: collision with root package name */
    public final Vibrator f1499a;

    public C13128f(Context context) {
        Vibrator defaultVibrator = null;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            VibratorManager vibratorManagerI = Is0.d.C(systemService) ? androidx.media3.exoplayer.audio.n.i(systemService) : null;
            if (vibratorManagerI != null) {
                defaultVibrator = vibratorManagerI.getDefaultVibrator();
            }
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            if (systemService2 instanceof Vibrator) {
                defaultVibrator = (Vibrator) systemService2;
            }
        }
        this.f1499a = defaultVibrator;
    }
}
