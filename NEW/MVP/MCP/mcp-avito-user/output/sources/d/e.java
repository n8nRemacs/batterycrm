package D;

import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.b;
import androidx.camera.camera2.internal.C20026p;
import androidx.camera.camera2.internal.RunnableC20012i;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.b;
import j.B;
import j.N;
import j.X;
import java.util.concurrent.Executor;

/* compiled from: Camera2CameraControl.java */
@i
@X
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public final C20026p f2832c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f2833d;

    /* renamed from: g, reason: collision with root package name */
    public b.a<Void> f2836g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2830a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2831b = false;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2834e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @B
    public b.a f2835f = new b.a();

    /* renamed from: h, reason: collision with root package name */
    public final d f2837h = new C20026p.c() { // from class: D.d
        /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
        @Override // androidx.camera.camera2.internal.C20026p.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(android.hardware.camera2.TotalCaptureResult r4) {
            /*
                r3 = this;
                D.e r0 = r3.f2829a
                androidx.concurrent.futures.b$a<java.lang.Void> r1 = r0.f2836g
                r2 = 0
                if (r1 == 0) goto L36
                android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
                java.lang.Object r4 = r4.getTag()
                boolean r1 = r4 instanceof androidx.camera.core.impl.J0
                if (r1 == 0) goto L36
                androidx.camera.core.impl.J0 r4 = (androidx.camera.core.impl.J0) r4
                android.util.ArrayMap r4 = r4.f23987a
                java.lang.String r1 = "Camera2CameraControl"
                java.lang.Object r4 = r4.get(r1)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 == 0) goto L36
                androidx.concurrent.futures.b$a<java.lang.Void> r1 = r0.f2836g
                int r1 = r1.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r4 = r4.equals(r1)
                if (r4 == 0) goto L36
                androidx.concurrent.futures.b$a<java.lang.Void> r4 = r0.f2836g
                r0.f2836g = r2
                goto L37
            L36:
                r4 = r2
            L37:
                if (r4 == 0) goto L3c
                r4.b(r2)
            L3c:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: D.d.a(android.hardware.camera2.TotalCaptureResult):boolean");
        }
    };

    /* JADX WARN: Type inference failed for: r0v3, types: [D.d] */
    @RestrictTo
    public e(@N C20026p c20026p, @N Executor executor) {
        this.f2832c = c20026p;
        this.f2833d = executor;
    }

    @N
    @RestrictTo
    public final androidx.camera.camera2.impl.b a() {
        androidx.camera.camera2.impl.b bVarA;
        synchronized (this.f2834e) {
            try {
                b.a<Void> aVar = this.f2836g;
                if (aVar != null) {
                    this.f2835f.f22897a.K(androidx.camera.camera2.impl.b.f22895M, Integer.valueOf(aVar.hashCode()));
                }
                bVarA = this.f2835f.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVarA;
    }

    public final void b(b.a<Void> aVar) {
        this.f2831b = true;
        b.a<Void> aVar2 = this.f2836g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f2836g = aVar;
        if (this.f2830a) {
            C20026p c20026p = this.f2832c;
            c20026p.getClass();
            c20026p.f23389c.execute(new RunnableC20012i(c20026p, 1));
            this.f2831b = false;
        }
        if (aVar2 != null) {
            aVar2.d(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }
}
