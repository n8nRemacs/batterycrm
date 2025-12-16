package D;

import Ba1.B;
import androidx.annotation.RestrictTo;
import androidx.camera.core.L;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.InterfaceC20106m0;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.s0;
import androidx.camera.core.impl.x0;
import j.N;
import j.X;

/* compiled from: CaptureRequestOptions.java */
@i
@X
/* loaded from: classes.dex */
public class h implements x0 {

    /* renamed from: F, reason: collision with root package name */
    public final Config f2839F;

    /* compiled from: CaptureRequestOptions.java */
    @X
    public static final class a implements L<h> {

        /* renamed from: a, reason: collision with root package name */
        public final n0 f2840a = n0.R();

        @N
        @RestrictTo
        public static a c(@N Config config) {
            a aVar = new a();
            config.b(new B(1, aVar, config));
            return aVar;
        }

        @N
        public final h a() {
            return new h(s0.Q(this.f2840a));
        }

        @Override // androidx.camera.core.L
        @N
        @RestrictTo
        public final InterfaceC20106m0 d() {
            throw null;
        }
    }

    @RestrictTo
    public h(@N Config config) {
        this.f2839F = config;
    }

    @Override // androidx.camera.core.impl.x0
    @N
    @RestrictTo
    public final Config getConfig() {
        return this.f2839F;
    }
}
