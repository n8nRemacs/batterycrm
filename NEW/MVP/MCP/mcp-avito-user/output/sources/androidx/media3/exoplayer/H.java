package androidx.media3.exoplayer;

/* compiled from: LoadControl.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface H {
    static {
        new androidx.media3.common.C(new Object());
    }

    boolean a();

    long b();

    default boolean c(long j12, float f12, boolean z12, long j13) {
        return i(j12, f12, z12, j13);
    }

    androidx.media3.exoplayer.upstream.h d();

    void e();

    void f();

    void g();

    boolean h(long j12, float f12);

    @Deprecated
    default boolean i(long j12, float f12, boolean z12, long j13) {
        androidx.media3.common.P p12 = androidx.media3.common.P.f47368b;
        return c(j12, f12, z12, j13);
    }

    default void j(c0[] c0VarArr, androidx.media3.exoplayer.source.Y y12, androidx.media3.exoplayer.trackselection.k[] kVarArr) {
        k(c0VarArr, y12, kVarArr);
    }

    @Deprecated
    default void k(c0[] c0VarArr, androidx.media3.exoplayer.source.Y y12, androidx.media3.exoplayer.trackselection.k[] kVarArr) {
        androidx.media3.common.P p12 = androidx.media3.common.P.f47368b;
        j(c0VarArr, y12, kVarArr);
    }
}
