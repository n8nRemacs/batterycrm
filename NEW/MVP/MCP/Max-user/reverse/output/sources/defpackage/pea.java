package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Range;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes.dex */
public class pea implements grf {
    public static pea o;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public pea(int i, fwg fwgVar) {
        this.b = new Object();
        this.a = i;
        this.c = new ArrayDeque(i);
        this.d = fwgVar;
    }

    public static void a(pea peaVar, int i) {
        synchronized (peaVar.b) {
            try {
                if (peaVar.a == i) {
                    return;
                }
                peaVar.a = i;
                Iterator it = ((CopyOnWriteArrayList) peaVar.d).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    bk4 bk4Var = (bk4) weakReference.get();
                    if (bk4Var != null) {
                        bk4Var.a(i);
                    } else {
                        ((CopyOnWriteArrayList) peaVar.d).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String b(int i, long j, long j2, String str) {
        String[] strArr = (String[]) this.c;
        String[] strArr2 = (String[]) this.b;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.a;
            if (i2 >= i3) {
                sb.append(strArr[i3]);
                return sb.toString();
            }
            sb.append(strArr[i2]);
            int i4 = ((int[]) this.d)[i2];
            if (i4 == 1) {
                sb.append(str);
            } else if (i4 == 2) {
                sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j)));
            } else if (i4 == 3) {
                sb.append(String.format(Locale.US, strArr2[i2], Integer.valueOf(i)));
            } else if (i4 == 4) {
                sb.append(String.format(Locale.US, strArr2[i2], Long.valueOf(j2)));
            }
            i2++;
        }
    }

    public Object c() {
        Object objRemoveLast;
        synchronized (this.b) {
            objRemoveLast = ((ArrayDeque) this.c).removeLast();
        }
        return objRemoveLast;
    }

    public void d(Object obj) {
        Object objC;
        synchronized (this.b) {
            try {
                objC = ((ArrayDeque) this.c).size() >= this.a ? c() : null;
                ((ArrayDeque) this.c).addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((fwg) this.d) == null || objC == null) {
            return;
        }
        ((jf7) objC).close();
    }

    public boolean e() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = ((ArrayDeque) this.c).isEmpty();
        }
        return zIsEmpty;
    }

    public void f() {
        HandlerThread handlerThread;
        synchronized (this.b) {
            try {
                hsi.g(this.a > 0);
                int i = this.a - 1;
                this.a = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.grf
    public Object get() {
        Range range = ((g90) this.d).a;
        gri.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        f90 f90Var = (f90) this.b;
        int iC = usi.c(156000, f90Var.c, 2, f90Var.b, 48000, range);
        lz9 lz9Var = new lz9();
        lz9Var.b = -1;
        lz9Var.a = (String) this.c;
        lz9Var.b = Integer.valueOf(this.a);
        lz9Var.c = f9g.a;
        lz9Var.X = Integer.valueOf(f90Var.c);
        lz9Var.o = Integer.valueOf(f90Var.b);
        lz9Var.d = Integer.valueOf(iC);
        return lz9Var.c();
    }

    public pea(Looper looper) {
        this.b = new Object();
        this.c = looper;
        this.d = null;
        this.a = 0;
    }

    public pea(Context context, int i) {
        switch (i) {
            case 3:
                this.c = context.getApplicationContext();
                this.d = new ej4(28);
                this.a = -2000;
                this.b = uw8.O;
                break;
            default:
                this.c = new Handler(Looper.getMainLooper());
                this.d = new CopyOnWriteArrayList();
                this.b = new Object();
                this.a = 0;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new eo(8, this), intentFilter);
                break;
        }
    }

    public pea(py0 py0Var, Toolbar toolbar) {
        this.a = q0d.toolbar_title;
        this.c = py0Var;
        this.d = toolbar;
    }

    public pea(RLottieDrawable rLottieDrawable) {
        this.b = rLottieDrawable;
    }
}
