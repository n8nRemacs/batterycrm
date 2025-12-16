package N2;

import android.content.Context;
import android.graphics.Matrix;
import android.provider.Settings;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode;
import com.airbnb.lottie.utils.k;
import j.P;

/* compiled from: SystemReducedMotionOption.java */
/* loaded from: classes10.dex */
public class c implements b {
    @Override // N2.b
    public final ReducedMotionMode a(@P Context context) {
        if (context != null) {
            Matrix matrix = k.f60123a;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                return ReducedMotionMode.f59564c;
            }
        }
        return ReducedMotionMode.f59563b;
    }
}
