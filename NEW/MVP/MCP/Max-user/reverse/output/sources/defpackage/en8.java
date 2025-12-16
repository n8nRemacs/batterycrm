package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class en8 extends tw0 {
    public final Handler i = new Handler(Looper.getMainLooper());

    @Override // defpackage.tw0
    public final void c(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            super.c(obj);
        } else {
            this.i.post(new dn8(this, obj, 0));
        }
    }

    @Override // defpackage.tw0
    public final void d(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                super.d(obj);
            } catch (Exception unused) {
            }
        } else {
            this.i.post(new dn8(this, obj, 1));
        }
    }

    @Override // defpackage.tw0
    public final void f(Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                super.f(obj);
            } catch (Exception unused) {
            }
        } else {
            this.i.post(new dn8(this, obj, 2));
        }
    }
}
