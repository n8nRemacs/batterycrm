package androidx.media3.exoplayer.video;

import android.os.Handler;
import androidx.media3.common.C23108t;
import androidx.media3.common.X;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.C23139h;
import j.P;

/* compiled from: VideoRendererEventListener.java */
@J
/* loaded from: classes.dex */
public interface l {

    /* compiled from: VideoRendererEventListener.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Handler f50321a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final l f50322b;

        public a(@P Handler handler, @P l lVar) {
            this.f50321a = handler;
            this.f50322b = lVar;
        }

        public final void a(X x12) {
            Handler handler = this.f50321a;
            if (handler != null) {
                handler.post(new J11.c(13, this, x12));
            }
        }
    }

    default void I2(String str) {
    }

    default void b(X x12) {
    }

    default void g3(Exception exc) {
    }

    default void h3(C23138g c23138g) {
    }

    default void j3(C23138g c23138g) {
    }

    default void R2(int i12, long j12) {
    }

    default void a2(long j12, Object obj) {
    }

    default void g2(int i12, long j12) {
    }

    default void i3(C23108t c23108t, @P C23139h c23139h) {
    }

    default void E2(long j12, long j13, String str) {
    }
}
