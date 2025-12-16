package defpackage;

import android.content.Context;
import android.os.Trace;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class i41 extends FrameLayout {
    public final a9c a;
    public boolean b;
    public boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(Context context) {
        super(context, null, 0);
        final int i = 0;
        a9c a9cVar = new a9c(context);
        this.a = a9cVar;
        this.d = ipi.b(3, new cm6(this) { // from class: h41
            public final /* synthetic */ i41 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new g41(tfh.a(this.b));
                    default:
                        i41 i41Var = this.b;
                        i41Var.a(i41Var.b, i41Var.c);
                        return qqg.a;
                }
            }
        });
        addView(a9cVar, -1, -1);
        g41 cameraPreviewController = getCameraPreviewController();
        cameraPreviewController.getClass();
        w9c w9cVar = w9c.f;
        q72 q72VarC = a6j.c(context);
        q72VarC.d(new ud(cameraPreviewController, 17, q72VarC), z7.d(context));
        final int i2 = 1;
        getCameraPreviewController().c = new cm6(this) { // from class: h41
            public final /* synthetic */ i41 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new g41(tfh.a(this.b));
                    default:
                        i41 i41Var = this.b;
                        i41Var.a(i41Var.b, i41Var.c);
                        return qqg.a;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final g41 getCameraPreviewController() {
        return (g41) this.d.getValue();
    }

    public final void a(boolean z, boolean z2) {
        if (!z) {
            w9c w9cVar = getCameraPreviewController().b;
            if (w9cVar != null) {
                w9cVar.f();
                return;
            }
            return;
        }
        g41 cameraPreviewController = getCameraPreviewController();
        w9c w9cVar2 = cameraPreviewController.b;
        if (w9cVar2 == null) {
            return;
        }
        if (w9cVar2 != null) {
            w9cVar2.f();
        }
        int i = !z2 ? 1 : 0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = 0;
        z5j.f("The specified lens facing is invalid.", i != -1);
        linkedHashSet.add(new y28(i));
        f32 f32Var = new f32(linkedHashSet);
        r8c r8cVarB = new ad7(2).b();
        r8cVarB.G(this.a.getSurfaceProvider());
        j48 j48Var = cameraPreviewController.a;
        uwg[] uwgVarArr = {r8cVarB};
        Trace.beginSection(kfi.h("CX:bindToLifecycle"));
        try {
            q32 q32Var = w9cVar2.d;
            if (q32Var != null) {
                wm2 wm2Var = q32Var.f;
                if (wm2Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                i2 = ((ggg) wm2Var.c).b;
            }
            if (i2 == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            w9c.b(w9cVar2, 1);
            w9cVar2.d(j48Var, f32Var, null, hd5.a, (uwg[]) Arrays.copyOf(uwgVarArr, 1));
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
