package androidx.media3.common;

import android.view.Surface;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: VideoFrameProcessor.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface W {

    /* compiled from: VideoFrameProcessor.java */
    public interface a {
        W create();
    }

    /* compiled from: VideoFrameProcessor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: VideoFrameProcessor.java */
    public interface c {
    }

    void a();

    void b();

    void c();

    int d();

    Surface e();

    void f();

    void flush();

    void g();

    void release();
}
