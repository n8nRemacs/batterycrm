package defpackage;

import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* loaded from: classes.dex */
public final class knd {
    public final yb0 a;
    public final zyf b;
    public final wu1 c;
    public final wu1 d;
    public tu1 e;
    public tu1 f;
    public boolean g = false;
    public boolean h = false;
    public q72 i;

    public knd(yb0 yb0Var, zyf zyfVar) {
        this.a = yb0Var;
        this.b = zyfVar;
        final int i = 0;
        this.c = ixi.a(new uu1(this) { // from class: jnd
            public final /* synthetic */ knd b;

            {
                this.b = this;
            }

            @Override // defpackage.uu1
            public final String m(tu1 tu1Var) {
                switch (i) {
                    case 0:
                        this.b.e = tu1Var;
                        return "CaptureCompleteFuture";
                    default:
                        this.b.f = tu1Var;
                        return "RequestCompleteFuture";
                }
            }
        });
        final int i2 = 1;
        this.d = ixi.a(new uu1(this) { // from class: jnd
            public final /* synthetic */ knd b;

            {
                this.b = this;
            }

            @Override // defpackage.uu1
            public final String m(tu1 tu1Var) {
                switch (i2) {
                    case 0:
                        this.b.e = tu1Var;
                        return "CaptureCompleteFuture";
                    default:
                        this.b.f = tu1Var;
                        return "RequestCompleteFuture";
                }
            }
        });
    }

    public final void a() {
        z5j.f("The callback can only complete once.", !this.d.b.isDone());
        this.f.b(null);
    }

    public final void b() {
        jei.b();
        if (this.g || this.h) {
            return;
        }
        this.h = true;
        v32 v32Var = this.a.c;
        if (v32Var != null) {
            xk6 freezeCameraDetector = ((CameraxCameraApiView) v32Var.c).getFreezeCameraDetector();
            long j = v32Var.b;
            long j2 = freezeCameraDetector.b;
            if (s65.d(j, j2) <= 0) {
                freezeCameraDetector.d.invoke(new s65(j));
                j = j2;
            }
            freezeCameraDetector.e.O(freezeCameraDetector, xk6.f[0], svi.e(freezeCameraDetector.a, null, i84.b, new wk6(j, freezeCameraDetector, null), 1));
        }
    }
}
