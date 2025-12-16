package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k89 extends Service {
    public static final boolean v0 = Log.isLoggable("MBServiceCompat", 3);
    public pv8 X;
    public final ey Y;
    public g79 Z;
    public rv8 a;
    public final t9f b = new t9f(23, this);
    public final pv8 c = new pv8(this, "android.media.session.MediaController", -1, -1, null);
    public final ArrayList d = new ArrayList();
    public final us o = new us(0);
    public final f89 s0;
    public final o79 t0;
    public final fde u0;

    public k89(o79 o79Var) {
        ey eyVar = new ey();
        eyVar.b = this;
        this.Y = eyVar;
        this.s0 = f89.a(o79Var.f);
        this.t0 = o79Var;
        this.u0 = new fde(o79Var);
    }

    public final void a(g79 g79Var) {
        attachBaseContext(this.t0.f);
        onCreate();
        if (g79Var == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.Z != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.Z = g79Var;
        rv8 rv8Var = this.a;
        rv8Var.getClass();
        ((k89) rv8Var.d).Y.c(new yn6(rv8Var, g79Var, false, 18));
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        rv8 rv8Var = this.a;
        rv8Var.getClass();
        qv8 qv8Var = (qv8) rv8Var.b;
        qv8Var.getClass();
        return qv8Var.onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.a = new sv8(this);
        } else {
            this.a = new rv8(this);
        }
        rv8 rv8Var = this.a;
        rv8Var.getClass();
        qv8 qv8Var = new qv8(rv8Var, rv8Var.f);
        rv8Var.b = qv8Var;
        qv8Var.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.Y.b = null;
    }
}
