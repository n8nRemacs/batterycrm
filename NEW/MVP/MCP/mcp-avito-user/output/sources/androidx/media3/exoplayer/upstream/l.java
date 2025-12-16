package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.J;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: LoadErrorHandlingPolicy.java */
@J
/* loaded from: classes.dex */
public interface l {

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class a {
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class b {
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: LoadErrorHandlingPolicy.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final IOException f50153a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50154b;

        public d(IOException iOException, int i12) {
            this.f50153a = iOException;
            this.f50154b = i12;
        }
    }

    int a(int i12);

    long b(d dVar);
}
