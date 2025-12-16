package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import j.P;

/* compiled from: DrmSessionManager.java */
/* loaded from: classes6.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f344341a = new a();

    /* compiled from: DrmSessionManager.java */
    public interface b {

        /* renamed from: g2, reason: collision with root package name */
        public static final com.google.android.exoplayer2.analytics.h f344342g2 = new com.google.android.exoplayer2.analytics.h(16);

        void release();
    }

    default b a(@P e.a aVar, I i12) {
        return b.f344342g2;
    }

    @P
    DrmSession b(@P e.a aVar, I i12);

    int c(I i12);

    void d(Looper looper, com.google.android.exoplayer2.analytics.p pVar);

    default void prepare() {
    }

    default void release() {
    }

    /* compiled from: DrmSessionManager.java */
    public class a implements f {
        @Override // com.google.android.exoplayer2.drm.f
        @P
        public final DrmSession b(@P e.a aVar, I i12) {
            if (i12.f343479p == null) {
                return null;
            }
            return new j(new DrmSession.DrmSessionException(new UnsupportedDrmException(), AuthCode.StatusCode.WAITING_CONNECT));
        }

        @Override // com.google.android.exoplayer2.drm.f
        public final int c(I i12) {
            return i12.f343479p != null ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.drm.f
        public final void d(Looper looper, com.google.android.exoplayer2.analytics.p pVar) {
        }
    }
}
