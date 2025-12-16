package ma1;

import Ba1.C13123a;
import android.graphics.Bitmap;
import androidx.camera.core.T;
import androidx.camera.core.z0;
import androidx.fragment.app.ActivityC22955m;
import androidx.media3.exoplayer.analytics.m;
import kotlin.G0;
import kotlin.Z;
import oa1.C44722a;
import okhttp3.internal.http2.Http2Connection;
import wa1.C49587b;
import ya1.C50207c;

/* loaded from: classes9.dex */
public final class e implements T.a {

    /* renamed from: b, reason: collision with root package name */
    public final C44722a f414599b;

    /* renamed from: c, reason: collision with root package name */
    public final C50207c f414600c;

    /* renamed from: d, reason: collision with root package name */
    public final C44038a f414601d;

    /* renamed from: e, reason: collision with root package name */
    public final C49587b f414602e = new C49587b();

    /* renamed from: f, reason: collision with root package name */
    public final C13123a f414603f = new C13123a();

    /* renamed from: g, reason: collision with root package name */
    public boolean f414604g = true;

    public e(ActivityC22955m activityC22955m, C44722a c44722a) {
        this.f414599b = c44722a;
        this.f414600c = new C50207c(activityC22955m);
        this.f414601d = new C44038a(activityC22955m);
    }

    public final void a(z0 z0Var) throws Exception {
        C13123a c13123a = this.f414603f;
        long jNanoTime = System.nanoTime();
        try {
            Bitmap bitmap = (Bitmap) c13123a.a("Transform frame", new b(this, z0Var));
            V41.b.a(z0Var, null);
            Boolean bool = (Boolean) c13123a.a("Brightness", new c(this, bitmap));
            bool.getClass();
            Boolean bool2 = (Boolean) c13123a.a("Passport detect", new d(this, bitmap));
            boolean zBooleanValue = bool2.booleanValue();
            pc1.b.f428696a.b(m.i(1 / ((System.nanoTime() - jNanoTime) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS), "Full FPS: "), new Object[0]);
            this.f414604g = !zBooleanValue;
            this.f414599b.invoke(bool2, bool);
        } finally {
        }
    }

    @Override // androidx.camera.core.T.a
    public final void d(z0 z0Var) {
        int i12;
        if (!this.f414604g || (i12 = z0Var.f24620i) == 0 || i12 == 0) {
            z0Var.close();
            return;
        }
        try {
            int i13 = Z.f406624c;
            a(z0Var);
            G0 g02 = G0.f406611a;
        } catch (Throwable unused) {
            int i14 = Z.f406624c;
        }
    }
}
