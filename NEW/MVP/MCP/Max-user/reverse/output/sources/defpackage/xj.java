package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class xj implements Runnable {
    public static final Handler d = new Handler(Looper.getMainLooper());
    public static volatile long o = -1;
    public final long a;
    public final WeakReference b;
    public volatile boolean c;

    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xj(ru.ok.tamtam.animoji.views.AnimojiTextView r18) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xj.<init>(ru.ok.tamtam.animoji.views.AnimojiTextView):void");
    }

    public final void a() {
        this.c = false;
        if (this.b.get() == null) {
            return;
        }
        d.postDelayed(this, this.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            d.removeCallbacks(this);
            return;
        }
        View view = (View) this.b.get();
        if (view == null) {
            return;
        }
        if (view.getParent() == null) {
            this.b.clear();
            return;
        }
        if (view.isAttachedToWindow()) {
            view.invalidate();
        }
        d.postDelayed(this, this.a);
    }
}
