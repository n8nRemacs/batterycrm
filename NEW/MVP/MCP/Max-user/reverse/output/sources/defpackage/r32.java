package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r32 implements a2g {
    public final fjb a;
    public static final s90 b = new s90("camerax.core.appConfig.cameraFactoryProvider", b02.class, null);
    public static final s90 c = new s90("camerax.core.appConfig.deviceSurfaceManagerProvider", c02.class, null);
    public static final s90 d = new s90("camerax.core.appConfig.useCaseConfigFactoryProvider", d02.class, null);
    public static final s90 o = new s90("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final s90 X = new s90("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final s90 Y = new s90("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final s90 Z = new s90("camerax.core.appConfig.availableCamerasLimiter", f32.class, null);
    public static final s90 s0 = new s90("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final s90 t0 = new s90("camerax.core.appConfig.cameraProviderInitRetryPolicy", wpd.class, null);
    public static final s90 u0 = new s90("camerax.core.appConfig.quirksSettings", duc.class, null);

    public r32(fjb fjbVar) {
        this.a = fjbVar;
    }

    public final f32 a() {
        Object objF;
        try {
            objF = this.a.f(Z);
        } catch (IllegalArgumentException unused) {
            objF = null;
        }
        return (f32) objF;
    }

    public final b02 b() {
        Object objF;
        try {
            objF = this.a.f(b);
        } catch (IllegalArgumentException unused) {
            objF = null;
        }
        return (b02) objF;
    }

    @Override // defpackage.ebd
    public final ao3 getConfig() {
        return this.a;
    }

    public final long k() {
        s90 s90Var = s0;
        Object objF = -1L;
        fjb fjbVar = this.a;
        fjbVar.getClass();
        try {
            objF = fjbVar.f(s90Var);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objF).longValue();
    }

    public final c02 m() {
        Object objF;
        try {
            objF = this.a.f(c);
        } catch (IllegalArgumentException unused) {
            objF = null;
        }
        return (c02) objF;
    }

    public final d02 n() {
        Object objF;
        try {
            objF = this.a.f(d);
        } catch (IllegalArgumentException unused) {
            objF = null;
        }
        return (d02) objF;
    }
}
