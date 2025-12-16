package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j.P;
import j.X;
import java.lang.reflect.InvocationTargetException;

/* compiled from: HandlerCompat.java */
/* renamed from: androidx.core.os.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22783k {

    /* compiled from: HandlerCompat.java */
    @X
    /* renamed from: androidx.core.os.k$a */
    public static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static boolean b(Handler handler, Runnable runnable, Object obj, long j12) {
            return handler.postDelayed(runnable, obj, j12);
        }
    }

    /* compiled from: HandlerCompat.java */
    @X
    /* renamed from: androidx.core.os.k$b */
    public static class b {
    }

    @j.N
    public static Handler a(@j.N Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void b(@j.N Handler handler, @j.N Runnable runnable, @P Object obj, long j12) {
        if (Build.VERSION.SDK_INT >= 28) {
            a.b(handler, runnable, obj, j12);
            return;
        }
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        handler.sendMessageDelayed(messageObtain, j12);
    }
}
