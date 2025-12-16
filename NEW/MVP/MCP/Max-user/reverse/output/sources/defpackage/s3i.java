package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class s3i {
    public r3i a;

    public s3i(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new q3i(jlb.l(i, interpolator, j));
        } else {
            this.a = new o3i(i, interpolator, j);
        }
    }
}
