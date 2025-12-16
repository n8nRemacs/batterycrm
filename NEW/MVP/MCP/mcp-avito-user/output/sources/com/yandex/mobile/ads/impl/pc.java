package com.yandex.mobile.ads.impl;

import android.os.Handler;

/* loaded from: classes8.dex */
public interface pc {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private final Handler f388766a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private final pc f388767b;

        public a(@j.P Handler handler, @j.P pc pcVar) {
            this.f388766a = (Handler) db.a(handler);
            this.f388767b = pcVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(tn tnVar) {
            synchronized (tnVar) {
            }
            pc pcVar = this.f388767b;
            int i12 = pc1.f388768a;
            pcVar.a(tnVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(tn tnVar) {
            pc pcVar = this.f388767b;
            int i12 = pc1.f388768a;
            pcVar.b(tnVar);
        }

        public final void a(String str, long j12, long j13) {
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.e(this, str, j12, j13, 6));
            }
        }

        public final void b(tn tnVar) {
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new H1(this, tnVar, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Exception exc) {
            pc pcVar = this.f388767b;
            int i12 = pc1.f388768a;
            pcVar.a(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j12, long j13) {
            pc pcVar = this.f388767b;
            int i12 = pc1.f388768a;
            pcVar.b(str, j12, j13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Exception exc) {
            pc pcVar = this.f388767b;
            int i12 = pc1.f388768a;
            pcVar.b(exc);
        }

        public final void a(vw vwVar, @j.P xn xnVar) {
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new H0(this, vwVar, xnVar, 7));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j12) {
            pc pcVar = this.f388767b;
            int i12 = pc1.f388768a;
            pcVar.a(j12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(vw vwVar, xn xnVar) {
            pc pcVar = this.f388767b;
            int i12 = pc1.f388768a;
            pcVar.getClass();
            this.f388767b.a(vwVar, xnVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i12, long j12, long j13) {
            pc pcVar = this.f388767b;
            int i13 = pc1.f388768a;
            pcVar.a(i12, j12, j13);
        }

        public final void b(long j12) {
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.f(5, j12, this));
            }
        }

        public final void a(String str) {
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new H(19, this, str));
            }
        }

        public final void b(int i12, long j12, long j13) {
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new J1(this, i12, j12, j13, 1));
            }
        }

        public final void a(tn tnVar) {
            synchronized (tnVar) {
            }
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new H1(this, tnVar, 0));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            pc pcVar = this.f388767b;
            int i12 = pc1.f388768a;
            pcVar.b(str);
        }

        public final void b(boolean z12) {
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new D.b(16, this, z12));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z12) {
            pc pcVar = this.f388767b;
            int i12 = pc1.f388768a;
            pcVar.onSkipSilenceEnabledChanged(z12);
        }

        public final void a(Exception exc) {
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new G1(this, exc, 1));
            }
        }

        public final void b(Exception exc) {
            Handler handler = this.f388766a;
            if (handler != null) {
                handler.post(new G1(this, exc, 0));
            }
        }
    }

    default void a(int i12, long j12, long j13) {
    }

    default void b(tn tnVar) {
    }

    default void a(long j12) {
    }

    default void b(Exception exc) {
    }

    default void a(tn tnVar) {
    }

    default void b(String str) {
    }

    default void a(vw vwVar, @j.P xn xnVar) {
    }

    default void b(String str, long j12, long j13) {
    }

    default void a(Exception exc) {
    }

    default void onSkipSilenceEnabledChanged(boolean z12) {
    }
}
