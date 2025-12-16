package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.J;
import androidx.media3.exoplayer.drm.f;
import j.P;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

@J
/* loaded from: classes.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* renamed from: b, reason: collision with root package name */
        public final int f49098b;

        public DrmSessionException(Exception exc, int i12) {
            super(exc);
            this.f49098b = i12;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static void e(@P DrmSession drmSession, @P DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.g(null);
        }
        if (drmSession != null) {
            drmSession.f(null);
        }
    }

    default boolean a() {
        return false;
    }

    UUID b();

    @P
    androidx.media3.decoder.c c();

    boolean d(String str);

    void f(@P f.a aVar);

    void g(@P f.a aVar);

    @P
    DrmSessionException getError();

    int getState();
}
