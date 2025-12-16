package androidx.media3.exoplayer;

import androidx.media3.common.C23108t;
import androidx.media3.exoplayer.Y;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Renderer.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface c0 extends Y.b {

    /* compiled from: Renderer.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: Renderer.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: Renderer.java */
    public interface c {
        void a();

        void b();
    }

    void A(e0 e0Var, C23108t[] c23108tArr, androidx.media3.exoplayer.source.P p12, long j12, boolean z12, boolean z13, long j13, long j14);

    void N();

    boolean a();

    String getName();

    int getState();

    @j.P
    androidx.media3.exoplayer.source.P l();

    int m();

    boolean n();

    void o(long j12, long j13);

    long p();

    void q();

    void r();

    void reset();

    d0 s();

    void start();

    void stop();

    boolean t();

    boolean u();

    void v(long j12);

    @j.P
    I w();

    void y(C23108t[] c23108tArr, androidx.media3.exoplayer.source.P p12, long j12, long j13);

    void z(int i12, androidx.media3.exoplayer.analytics.w wVar);

    default void release() {
    }

    default void x(float f12, float f13) {
    }
}
