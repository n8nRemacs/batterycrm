package com.google.android.exoplayer2;

import com.google.android.exoplayer2.e0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Renderer.java */
/* loaded from: classes6.dex */
public interface h0 extends e0.b {

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

    void N();

    boolean a();

    String getName();

    int getState();

    void i(int i12, com.google.android.exoplayer2.analytics.p pVar);

    void j(I[] iArr, com.google.android.exoplayer2.source.M m12, long j12, long j13);

    void k(j0 j0Var, I[] iArr, com.google.android.exoplayer2.source.M m12, long j12, boolean z12, boolean z13, long j13, long j14);

    @j.P
    com.google.android.exoplayer2.source.M l();

    int m();

    boolean n();

    void o(long j12, long j13);

    long p();

    void q();

    void r();

    void reset();

    i0 s();

    void start();

    void stop();

    boolean t();

    boolean u();

    void v(long j12);

    @j.P
    com.google.android.exoplayer2.util.x w();

    default void x(float f12, float f13) {
    }
}
