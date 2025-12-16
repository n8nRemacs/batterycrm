package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.media3.common.C23108t;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.analytics.w;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.f;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import j.P;

/* compiled from: DrmSessionManager.java */
@J
/* loaded from: classes.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f49117a = new a();

    /* compiled from: DrmSessionManager.java */
    public interface b {

        /* renamed from: I1, reason: collision with root package name */
        public static final androidx.media3.exoplayer.analytics.m f49118I1 = new androidx.media3.exoplayer.analytics.m(3);

        void release();
    }

    int a(C23108t c23108t);

    @P
    DrmSession b(@P f.a aVar, C23108t c23108t);

    default b c(@P f.a aVar, C23108t c23108t) {
        return b.f49118I1;
    }

    void d(Looper looper, w wVar);

    default void prepare() {
    }

    default void release() {
    }

    /* compiled from: DrmSessionManager.java */
    public class a implements g {
        @Override // androidx.media3.exoplayer.drm.g
        public final int a(C23108t c23108t) {
            return c23108t.f47760p != null ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.drm.g
        @P
        public final DrmSession b(@P f.a aVar, C23108t c23108t) {
            if (c23108t.f47760p == null) {
                return null;
            }
            return new k(new DrmSession.DrmSessionException(new UnsupportedDrmException(), AuthCode.StatusCode.WAITING_CONNECT));
        }

        @Override // androidx.media3.exoplayer.drm.g
        public final void d(Looper looper, w wVar) {
        }
    }
}
