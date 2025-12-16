package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.fb0;
import defpackage.l22;

/* loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean a(l22 l22Var, fb0 fb0Var) {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL) && l22Var.h() == 0 && fb0Var == fb0.d;
    }
}
