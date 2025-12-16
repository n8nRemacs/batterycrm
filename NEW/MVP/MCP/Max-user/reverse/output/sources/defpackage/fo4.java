package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class fo4 implements uj0 {
    public Object X;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public fo4(y6d y6dVar, cm6 cm6Var) {
        this.b = y6dVar;
        this.c = cm6Var;
        lqc lqcVar = new lqc();
        this.d = lqcVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        this.o = new lra(lqcVar, j0eVarA, 0).l(de.a()).n(new ukd(21, this));
    }

    public static m7i b(i12 i12Var) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) i12Var.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError e) {
                gri.j("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
                range = null;
            }
            if (range != null) {
                return new be(i12Var);
            }
        }
        ywf ywfVar = new ywf();
        ywfVar.b = null;
        ywfVar.d = null;
        ywfVar.a = i12Var;
        return ywfVar;
    }

    public jqb a() {
        lg8 lg8Var = lg8.d;
        if (this.a) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "PerfRegistrarConfigBuilder", "was created in lazy mode", null);
            }
        } else {
            if (((erb) this.c) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (((yi5) this.d) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (((lzf) this.o) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, "PerfRegistrarConfigBuilder", "was initialized", null);
            }
        }
        boolean z = this.a;
        yi5 yi5Var = (yi5) this.d;
        lzf lzfVar = (lzf) this.o;
        return new jqb((w8a) this.b, (ui5) this.X, z, (erb) this.c, yi5Var, lzfVar);
    }

    public crf c(int i) {
        crf crfVar;
        crf eo4Var;
        HashMap map = (HashMap) this.c;
        crf crfVar2 = (crf) map.get(Integer.valueOf(i));
        if (crfVar2 != null) {
            return crfVar2;
        }
        final oe4 oe4Var = (oe4) this.o;
        oe4Var.getClass();
        final int i2 = 0;
        if (i != 0) {
            final int i3 = 1;
            if (i != 1) {
                final int i4 = 2;
                if (i != 2) {
                    final int i5 = 3;
                    if (i == 3) {
                        eo4Var = new eo4(i2, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(b99.class));
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException(ho7.f(i, "Unrecognized contentType: "));
                        }
                        crfVar = new crf() { // from class: do4
                            @Override // defpackage.crf
                            public final Object get() {
                                switch (i5) {
                                    case 0:
                                        return ho4.c((Class) this, oe4Var);
                                    case 1:
                                        return ho4.c((Class) this, oe4Var);
                                    case 2:
                                        return ho4.c((Class) this, oe4Var);
                                    default:
                                        return new joc(oe4Var, (pm4) ((fo4) this).b);
                                }
                            }
                        };
                    }
                } else {
                    final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(b99.class);
                    eo4Var = new crf() { // from class: do4
                        @Override // defpackage.crf
                        public final Object get() {
                            switch (i4) {
                                case 0:
                                    return ho4.c((Class) clsAsSubclass, oe4Var);
                                case 1:
                                    return ho4.c((Class) clsAsSubclass, oe4Var);
                                case 2:
                                    return ho4.c((Class) clsAsSubclass, oe4Var);
                                default:
                                    return new joc(oe4Var, (pm4) ((fo4) clsAsSubclass).b);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(b99.class);
                eo4Var = new crf() { // from class: do4
                    @Override // defpackage.crf
                    public final Object get() {
                        switch (i3) {
                            case 0:
                                return ho4.c((Class) genericDeclarationAsSubclass, oe4Var);
                            case 1:
                                return ho4.c((Class) genericDeclarationAsSubclass, oe4Var);
                            case 2:
                                return ho4.c((Class) genericDeclarationAsSubclass, oe4Var);
                            default:
                                return new joc(oe4Var, (pm4) ((fo4) genericDeclarationAsSubclass).b);
                        }
                    }
                };
            }
            crfVar = eo4Var;
        } else {
            final Class clsAsSubclass2 = DashMediaSource$Factory.class.asSubclass(b99.class);
            crfVar = new crf() { // from class: do4
                @Override // defpackage.crf
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return ho4.c((Class) clsAsSubclass2, oe4Var);
                        case 1:
                            return ho4.c((Class) clsAsSubclass2, oe4Var);
                        case 2:
                            return ho4.c((Class) clsAsSubclass2, oe4Var);
                        default:
                            return new joc(oe4Var, (pm4) ((fo4) clsAsSubclass2).b);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i), crfVar);
        return crfVar;
    }

    public void d(tu1 tu1Var, ka0 ka0Var) {
        ka0 ka0VarE;
        if (this.a) {
            ((m7i) this.X).f(ka0Var.a, tu1Var);
            ((ry1) this.b).A();
            return;
        }
        synchronized (((r7i) this.d)) {
            ((r7i) this.d).f(1.0f);
            ka0VarE = ka0.e((r7i) this.d);
        }
        e(ka0VarE);
        tu1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
    }

    public void e(ka0 ka0Var) {
        j8a j8aVar = (j8a) this.o;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            j8aVar.k(ka0Var);
        } else {
            j8aVar.i(ka0Var);
        }
    }

    public void f(es3 es3Var) {
        wai waiVar = (wai) ((xv6) this.X).t0.get((cm) this.c);
        if (waiVar != null) {
            waiVar.n(es3Var);
        }
    }

    @Override // defpackage.uj0
    public void y(es3 es3Var) {
        ((xv6) this.X).w0.post(new owf(this, 6, es3Var));
    }

    public fo4(Context context) {
        this.a = false;
        this.X = context;
    }

    public fo4() {
        this.b = new w8a();
    }
}
