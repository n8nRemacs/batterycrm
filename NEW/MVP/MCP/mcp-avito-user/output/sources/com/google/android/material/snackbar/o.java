package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import j.N;
import j.P;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes6.dex */
class o {

    /* renamed from: e, reason: collision with root package name */
    public static o f357340e;

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Object f357341a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Handler f357342b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c, reason: collision with root package name */
    @P
    public c f357343c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public c f357344d;

    /* compiled from: SnackbarManager.java */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@N Message message) {
            if (message.what != 0) {
                return false;
            }
            o oVar = o.this;
            c cVar = (c) message.obj;
            synchronized (oVar.f357341a) {
                try {
                    if (oVar.f357343c == cVar || oVar.f357344d == cVar) {
                        oVar.a(cVar, 2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    public interface b {
        void a(int i12);

        void show();
    }

    /* compiled from: SnackbarManager.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final WeakReference<b> f357346a;

        /* renamed from: b, reason: collision with root package name */
        public int f357347b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f357348c;

        public c(int i12, BaseTransientBottomBar.c cVar) {
            this.f357346a = new WeakReference<>(cVar);
            this.f357347b = i12;
        }
    }

    public static o b() {
        if (f357340e == null) {
            f357340e = new o();
        }
        return f357340e;
    }

    public final boolean a(@N c cVar, int i12) {
        b bVar = cVar.f357346a.get();
        if (bVar == null) {
            return false;
        }
        this.f357342b.removeCallbacksAndMessages(cVar);
        bVar.a(i12);
        return true;
    }

    public final boolean c(b bVar) {
        c cVar = this.f357343c;
        return (cVar == null || bVar == null || cVar.f357346a.get() != bVar) ? false : true;
    }

    public final void d(BaseTransientBottomBar.c cVar) {
        synchronized (this.f357341a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.f357343c;
                    if (!cVar2.f357348c) {
                        cVar2.f357348c = true;
                        this.f357342b.removeCallbacksAndMessages(cVar2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(BaseTransientBottomBar.c cVar) {
        synchronized (this.f357341a) {
            try {
                if (c(cVar)) {
                    c cVar2 = this.f357343c;
                    if (cVar2.f357348c) {
                        cVar2.f357348c = false;
                        f(cVar2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(@N c cVar) {
        int i12 = cVar.f357347b;
        if (i12 == -2) {
            return;
        }
        if (i12 <= 0) {
            i12 = i12 == -1 ? 1500 : 2750;
        }
        Handler handler = this.f357342b;
        handler.removeCallbacksAndMessages(cVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i12);
    }
}
