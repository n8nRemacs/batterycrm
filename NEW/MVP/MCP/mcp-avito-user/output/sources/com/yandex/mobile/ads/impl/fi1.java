package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes8.dex */
public interface fi1 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private final Handler f385379a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private final fi1 f385380b;

        public a(@j.P Handler handler, @j.P fi1 fi1Var) {
            this.f385379a = (Handler) db.a(handler);
            this.f385380b = fi1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(tn tnVar) {
            fi1 fi1Var = this.f385380b;
            int i12 = pc1.f388768a;
            fi1Var.d(tnVar);
        }

        public final void a(String str, long j12, long j13) {
            Handler handler = this.f385379a;
            if (handler != null) {
                handler.post(new androidx.media3.exoplayer.audio.e(this, str, j12, j13, 5));
            }
        }

        public final void b(tn tnVar) {
            Handler handler = this.f385379a;
            if (handler != null) {
                handler.post(new L(this, tnVar, 0));
            }
        }

        public final void c(int i12, long j12) {
            Handler handler = this.f385379a;
            if (handler != null) {
                handler.post(new K(this, j12, i12));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j12, long j13) {
            fi1 fi1Var = this.f385380b;
            int i12 = pc1.f388768a;
            fi1Var.a(str, j12, j13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(tn tnVar) {
            synchronized (tnVar) {
            }
            fi1 fi1Var = this.f385380b;
            int i12 = pc1.f388768a;
            fi1Var.c(tnVar);
        }

        public final void a(vw vwVar, @j.P xn xnVar) {
            Handler handler = this.f385379a;
            if (handler != null) {
                handler.post(new H0(this, vwVar, xnVar, 2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(vw vwVar, xn xnVar) {
            fi1 fi1Var = this.f385380b;
            int i12 = pc1.f388768a;
            fi1Var.getClass();
            this.f385380b.b(vwVar, xnVar);
        }

        public final void a(int i12, long j12) {
            Handler handler = this.f385379a;
            if (handler != null) {
                handler.post(new K(this, i12, j12));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j12, int i12) {
            fi1 fi1Var = this.f385380b;
            int i13 = pc1.f388768a;
            fi1Var.a(i12, j12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i12, long j12) {
            fi1 fi1Var = this.f385380b;
            int i13 = pc1.f388768a;
            fi1Var.b(i12, j12);
        }

        public final void b(ji1 ji1Var) {
            Handler handler = this.f385379a;
            if (handler != null) {
                handler.post(new H(11, this, ji1Var));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(ji1 ji1Var) {
            fi1 fi1Var = this.f385380b;
            int i12 = pc1.f388768a;
            fi1Var.a(ji1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            fi1 fi1Var = this.f385380b;
            int i12 = pc1.f388768a;
            fi1Var.a(str);
        }

        public final void a(Surface surface) {
            if (this.f385379a != null) {
                this.f385379a.post(new androidx.media3.exoplayer.video.j(6, this, SystemClock.elapsedRealtime(), surface));
            }
        }

        public final void b(Exception exc) {
            Handler handler = this.f385379a;
            if (handler != null) {
                handler.post(new H(12, this, exc));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj, long j12) {
            fi1 fi1Var = this.f385380b;
            int i12 = pc1.f388768a;
            fi1Var.a(obj, j12);
        }

        public final void a(String str) {
            Handler handler = this.f385379a;
            if (handler != null) {
                handler.post(new H(10, this, str));
            }
        }

        public final void a(tn tnVar) {
            synchronized (tnVar) {
            }
            Handler handler = this.f385379a;
            if (handler != null) {
                handler.post(new L(this, tnVar, 1));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Exception exc) {
            fi1 fi1Var = this.f385380b;
            int i12 = pc1.f388768a;
            fi1Var.c(exc);
        }
    }

    default void a(int i12, long j12) {
    }

    default void b(int i12, long j12) {
    }

    default void c(tn tnVar) {
    }

    default void a(ji1 ji1Var) {
    }

    default void b(vw vwVar, @j.P xn xnVar) {
    }

    default void c(Exception exc) {
    }

    default void a(Object obj, long j12) {
    }

    default void a(String str) {
    }

    default void a(String str, long j12, long j13) {
    }

    default void d(tn tnVar) {
    }
}
