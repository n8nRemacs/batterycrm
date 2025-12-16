package defpackage;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public final class ej {
    public final zh a;
    public final enb b;
    public final li c;
    public final a93 d;
    public final ts9 e;
    public final HandlerThread f;
    public final Handler g;
    public final HandlerThread h;
    public final HashMap i;
    public final ConcurrentHashMap j;
    public final HashMap k;
    public final LinkedHashSet l;
    public final Point m;
    public final y6d n;
    public final ah1 o;
    public volatile boolean p;

    public ej(zh zhVar, enb enbVar, li liVar, EglBase eglBase, a93 a93Var, ts9 ts9Var) {
        this.a = zhVar;
        this.b = enbVar;
        this.c = liVar;
        this.d = a93Var;
        this.e = ts9Var;
        HandlerThread handlerThread = new HandlerThread("AniRDControl");
        this.f = handlerThread;
        HandlerThread handlerThread2 = new HandlerThread("AniRDOutput");
        this.h = handlerThread2;
        this.i = new HashMap();
        this.j = new ConcurrentHashMap();
        this.k = new HashMap();
        this.l = new LinkedHashSet();
        this.m = new Point();
        y6d y6dVar = zhVar.b;
        this.n = y6dVar;
        this.o = new ah1(y6dVar, eglBase.getEglBaseContext(), EglBase.CONFIG_PLAIN, "CallOpenGLAnimoji");
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper());
        handlerThread2.start();
        new Handler(handlerThread2.getLooper());
    }

    public final void a(Integer num, ti1 ti1Var, float[] fArr) {
        if (ti1Var != null) {
            b(ti1Var);
        }
    }

    public final fj b(ti1 ti1Var) {
        this.c.getClass();
        return null;
    }
}
