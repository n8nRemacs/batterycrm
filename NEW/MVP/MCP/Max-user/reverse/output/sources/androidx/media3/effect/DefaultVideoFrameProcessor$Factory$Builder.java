package androidx.media3.effect;

import defpackage.pr4;
import defpackage.uu6;
import defpackage.xo8;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class DefaultVideoFrameProcessor$Factory$Builder {
    public ExecutorService a;
    public xo8 b;
    public uu6 c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;

    public pr4 build() {
        return new pr4(!this.f, this.b, this.a, this.c, this.d, this.e, this.g, this.h);
    }

    public DefaultVideoFrameProcessor$Factory$Builder setEnableReplayableCache(boolean z) {
        this.e = z;
        return this;
    }
}
