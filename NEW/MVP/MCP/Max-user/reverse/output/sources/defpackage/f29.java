package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes.dex */
public final class f29 implements Handler.Callback {
    public final Intent X;
    public final HashMap Y;
    public final b29 Z;
    public final OneMeMediaSessionService a;
    public final bj b;
    public final bna c;
    public final Handler d;
    public final fv1 o;
    public int s0;
    public ao6 t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public final long x0;
    public final int y0;

    public f29(OneMeMediaSessionService oneMeMediaSessionService, b29 b29Var, bj bjVar) {
        this.a = oneMeMediaSessionService;
        this.Z = b29Var;
        this.b = bjVar;
        this.c = new bna(oneMeMediaSessionService);
        Looper mainLooper = Looper.getMainLooper();
        String str = zxg.a;
        this.d = new Handler(mainLooper, this);
        this.o = new fv1(3, this);
        this.X = new Intent(oneMeMediaSessionService, oneMeMediaSessionService.getClass());
        this.Y = new HashMap();
        this.u0 = false;
        this.w0 = true;
        this.x0 = 600000L;
        this.y0 = 3;
    }

    public final px8 a(w69 w69Var) {
        d29 d29Var = (d29) this.Y.get(w69Var);
        if (d29Var == null) {
            return null;
        }
        yx8 yx8Var = d29Var.a;
        if (!yx8Var.isDone()) {
            return null;
        }
        try {
            return (px8) a6a.a(yx8Var);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean b(boolean z) {
        boolean z2;
        ArrayList arrayListC = this.a.c();
        for (int i = 0; i < arrayListC.size(); i++) {
            px8 px8VarA = a((w69) arrayListC.get(i));
            if (px8VarA != null && ((px8VarA.i() || z) && (px8VarA.getPlaybackState() == 3 || px8VarA.getPlaybackState() == 2))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.w0;
        long j = this.x0;
        boolean z4 = z3 && j > 0;
        boolean z5 = this.v0;
        Handler handler = this.d;
        if (z5 && !z2 && z4) {
            handler.sendEmptyMessageDelayed(1, j);
        } else if (z2) {
            handler.removeMessages(1);
        }
        this.v0 = z2;
        return z2 || handler.hasMessages(1);
    }

    public final boolean c(w69 w69Var) {
        px8 px8VarA = a(w69Var);
        if (px8VarA != null && !px8VarA.v().p()) {
            d29 d29Var = (d29) this.Y.get(w69Var);
            d29Var.getClass();
            if (px8VarA.getPlaybackState() != 1) {
                d29Var.b = false;
                d29Var.c = true;
                return true;
            }
            int i = this.y0;
            if (i == 1) {
                return !d29Var.b;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                if (!d29Var.b && d29Var.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d(w69 w69Var, ao6 ao6Var, boolean z) {
        MediaSession.Token token = ((b79) w69Var.a.h.k.b).c.b;
        Notification notification = (Notification) ao6Var.b;
        notification.extras.putParcelable("android.mediaSession", token);
        this.t0 = ao6Var;
        OneMeMediaSessionService oneMeMediaSessionService = this.a;
        if (z) {
            u34.b(oneMeMediaSessionService, this.X);
            zxg.g0(oneMeMediaSessionService, 1001, notification, 2, "mediaPlayback");
            this.u0 = true;
        } else {
            this.c.a(null, 1001, notification);
            oneMeMediaSessionService.stopForeground(2);
            this.u0 = false;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        OneMeMediaSessionService oneMeMediaSessionService = this.a;
        ArrayList arrayListC = oneMeMediaSessionService.c();
        for (int i = 0; i < arrayListC.size(); i++) {
            oneMeMediaSessionService.k((w69) arrayListC.get(i), false);
        }
        return true;
    }
}
