package Is0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import androidx.media3.exoplayer.audio.n;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingVibration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIs0/e;", "LIs0/b;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Vibrator f8582a;

    @Inject
    public e(@k Context context) {
        Vibrator defaultVibrator = null;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            VibratorManager vibratorManagerI = d.C(systemService) ? n.i(systemService) : null;
            if (vibratorManagerI != null) {
                defaultVibrator = vibratorManagerI.getDefaultVibrator();
            }
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            if (systemService2 instanceof Vibrator) {
                defaultVibrator = (Vibrator) systemService2;
            }
        }
        this.f8582a = defaultVibrator;
    }

    @Override // Is0.b
    public final void a(@k c cVar) {
        Vibrator vibrator = this.f8582a;
        if (vibrator != null) {
            vibrator.vibrate(VibrationEffect.createWaveform(cVar.f8580a, cVar.f8581b, -1));
        }
    }

    @Override // Is0.b
    public final void b() {
        Vibrator vibrator = this.f8582a;
        if (vibrator != null) {
            vibrator.cancel();
        }
    }
}
