package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class fs4 {
    public static fs4 f;
    public static final /* synthetic */ int g = 0;
    public Object a = new Object();
    public Object e = new ue(11, this);
    public Object c = new ArrayList();
    public Object d = new ArrayList();
    public Object b = new Handler(Looper.getMainLooper());

    public static fs4 b(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        fs4 fs4Var = new fs4();
        fs4Var.d = new ArrayDeque();
        fs4Var.a = sharedPreferences;
        fs4Var.b = "topic_operation_queue";
        fs4Var.c = ",";
        fs4Var.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) fs4Var.d)) {
            try {
                ((ArrayDeque) fs4Var.d).clear();
                String string = ((SharedPreferences) fs4Var.a).getString((String) fs4Var.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) fs4Var.c)) {
                    String[] strArrSplit = string.split((String) fs4Var.c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) fs4Var.d).add(str);
                        }
                    }
                    return fs4Var;
                }
                return fs4Var;
            } finally {
            }
        }
    }

    public static synchronized fs4 e() {
        try {
            if (f == null) {
                f = new fs4();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public void a(es4 es4Var) {
        synchronized (this.a) {
            ((ArrayList) this.c).remove(es4Var);
        }
    }

    public Interpolator c() {
        if (((xq5) this.b) == null) {
            this.b = new xq5(1);
        }
        return (xq5) this.b;
    }

    public Interpolator d() {
        if (((xq5) this.c) == null) {
            this.c = new xq5(0);
        }
        return (xq5) this.c;
    }

    public Interpolator f() {
        if (((yq5) this.d) == null) {
            this.d = new yq5();
        }
        return (yq5) this.d;
    }

    public Interpolator g() {
        if (((OvershootInterpolator) this.e) == null) {
            this.e = new OvershootInterpolator();
        }
        return (OvershootInterpolator) this.e;
    }

    public void h() {
        if (!((rr4) this.e).w) {
            ((iy1) this.c).g(new nr4((rr4) this.e, 3), true);
            return;
        }
        ((Executor) this.a).execute(new qj4(7, (d4h) this.b));
        ah4.a();
    }
}
