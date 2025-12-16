package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import androidx.media3.common.C23108t;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: RendererCapabilities.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface d0 {

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* compiled from: RendererCapabilities.java */
    public interface f {
        void a(c0 c0Var);
    }

    /* compiled from: RendererCapabilities.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    static int e(int i12, int i13, int i14) {
        return i12 | i13 | i14 | 128;
    }

    @SuppressLint({"WrongConstant"})
    static int g(int i12) {
        return i12 & 64;
    }

    @SuppressLint({"WrongConstant"})
    static int h(int i12) {
        return i12 & 384;
    }

    int f();

    String getName();

    int i(C23108t c23108t);

    int m();

    default void j() {
    }

    default void k(f fVar) {
    }
}
