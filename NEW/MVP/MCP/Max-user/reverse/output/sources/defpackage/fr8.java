package defpackage;

import android.content.Context;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public interface fr8 extends mu6 {
    @Override // defpackage.mu6
    default su6 a(Context context, boolean z) {
        return jp4.j(context, wg7.m(this), zjd.o, z);
    }

    Matrix b();

    default int c() {
        return 9729;
    }

    default c4f e(int i, int i2) {
        return new c4f(i, i2);
    }
}
