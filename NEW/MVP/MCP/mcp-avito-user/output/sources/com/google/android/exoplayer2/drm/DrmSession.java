package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.e;
import j.P;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.UUID;

/* loaded from: classes6.dex */
public interface DrmSession {

    public static class DrmSessionException extends IOException {

        /* renamed from: b, reason: collision with root package name */
        public final int f344327b;

        public DrmSessionException(Exception exc, int i12) {
            super(exc);
            this.f344327b = i12;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static void g(@P DrmSession drmSession, @P DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.f(null);
        }
        if (drmSession != null) {
            drmSession.e(null);
        }
    }

    default boolean a() {
        return false;
    }

    UUID b();

    @P
    com.google.android.exoplayer2.decoder.c c();

    boolean d(String str);

    void e(@P e.a aVar);

    void f(@P e.a aVar);

    @P
    DrmSessionException getError();

    int getState();
}
