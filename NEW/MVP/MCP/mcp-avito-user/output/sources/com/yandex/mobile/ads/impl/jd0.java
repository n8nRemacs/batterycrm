package com.yandex.mobile.ads.impl;

import android.os.Handler;

/* loaded from: classes8.dex */
public interface jd0 {

    public interface a {
    }

    public static final class b extends fd0 {
        public b(Object obj) {
            super(obj);
        }

        public final b b(Object obj) {
            return new b(a(obj));
        }

        public b(Object obj, long j12) {
            super(obj, j12);
        }

        public b(int i12, long j12, Object obj) {
            super(i12, j12, obj);
        }

        public b(Object obj, int i12, int i13, long j12) {
            super(obj, i12, i13, j12);
        }

        public b(fd0 fd0Var) {
            super(fd0Var);
        }
    }

    public interface c {
        void a(jd0 jd0Var, i91 i91Var);
    }

    dd0 a(b bVar, h9 h9Var, long j12);

    void a(Handler handler, com.yandex.mobile.ads.exo.drm.f fVar);

    void a(Handler handler, kd0 kd0Var);

    void a(com.yandex.mobile.ads.exo.drm.f fVar);

    void a(dd0 dd0Var);

    void a(c cVar);

    void a(c cVar, @j.P ua1 ua1Var, jt0 jt0Var);

    void a(kd0 kd0Var);

    void b(c cVar);

    void c(c cVar);

    xc0 getMediaItem();

    void maybeThrowSourceInfoRefreshError();
}
