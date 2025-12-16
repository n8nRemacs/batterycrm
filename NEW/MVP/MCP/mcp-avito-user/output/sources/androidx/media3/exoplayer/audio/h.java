package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.C23108t;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.C23139h;
import j.P;

/* compiled from: AudioRendererEventListener.java */
@J
/* loaded from: classes.dex */
public interface h {

    /* compiled from: AudioRendererEventListener.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @P
        public final Handler f48895a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public final h f48896b;

        public a(@P Handler handler, @P h hVar) {
            if (hVar != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f48895a = handler;
            this.f48896b = hVar;
        }

        public final void a(C23138g c23138g) {
            synchronized (c23138g) {
            }
            Handler handler = this.f48895a;
            if (handler != null) {
                handler.post(new c(this, c23138g, 1));
            }
        }
    }

    default void L2(String str) {
    }

    default void b1(Exception exc) {
    }

    default void f3(long j12) {
    }

    default void k3(C23138g c23138g) {
    }

    default void l2(Exception exc) {
    }

    default void m3(C23138g c23138g) {
    }

    default void onSkipSilenceEnabledChanged(boolean z12) {
    }

    default void l3(C23108t c23108t, @P C23139h c23139h) {
    }

    default void F2(int i12, long j12, long j13) {
    }

    default void d2(long j12, long j13, String str) {
    }
}
