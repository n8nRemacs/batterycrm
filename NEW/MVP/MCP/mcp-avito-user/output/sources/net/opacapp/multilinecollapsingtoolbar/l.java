package net.opacapp.multilinecollapsingtoolbar;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import net.opacapp.multilinecollapsingtoolbar.k;

/* compiled from: ValueAnimatorCompatImplGingerbread.java */
/* loaded from: classes7.dex */
class l extends k.e {

    /* renamed from: d, reason: collision with root package name */
    public static final Handler f419093d = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public boolean f419094a;

    /* renamed from: b, reason: collision with root package name */
    public final long f419095b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f419096c = new a();

    /* compiled from: ValueAnimatorCompatImplGingerbread.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            if (lVar.f419094a) {
                SystemClock.uptimeMillis();
                long j12 = lVar.f419095b;
                if (SystemClock.uptimeMillis() >= 0 + lVar.f419095b) {
                    lVar.f419094a = false;
                }
            }
            if (lVar.f419094a) {
                l.f419093d.postDelayed(lVar.f419096c, 10L);
            }
        }
    }
}
