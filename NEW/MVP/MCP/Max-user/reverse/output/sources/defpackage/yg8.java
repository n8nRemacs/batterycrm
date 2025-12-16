package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class yg8 extends cei {
    public final int c;

    public yg8(int i) {
        this.c = i;
    }

    @Override // defpackage.cei
    public final void c(String str, String str2) {
        if (this.c <= 3) {
            Log.d(str, str2);
        }
    }

    @Override // defpackage.cei
    public final void d(String str, String str2, Throwable th) {
        if (this.c <= 3) {
            Log.d(str, str2, th);
        }
    }

    @Override // defpackage.cei
    public final void e(String str, String str2) {
        if (this.c <= 6) {
            Log.e(str, str2);
        }
    }

    @Override // defpackage.cei
    public final void f(String str, String str2, Throwable th) {
        if (this.c <= 6) {
            Log.e(str, str2, th);
        }
    }

    @Override // defpackage.cei
    public final void i(String str, String str2) {
        if (this.c <= 4) {
            Log.i(str, str2);
        }
    }

    @Override // defpackage.cei
    public final void j(String str, String str2, CancellationException cancellationException) {
        if (this.c <= 4) {
            Log.i(str, str2, cancellationException);
        }
    }

    @Override // defpackage.cei
    public final void n(String str) {
        if (this.c <= 2) {
            Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
        }
    }

    @Override // defpackage.cei
    public final void o(String str, String str2) {
        if (this.c <= 5) {
            Log.w(str, str2);
        }
    }

    @Override // defpackage.cei
    public final void p(String str, String str2, RuntimeException runtimeException) {
        if (this.c <= 5) {
            Log.w(str, str2, runtimeException);
        }
    }
}
