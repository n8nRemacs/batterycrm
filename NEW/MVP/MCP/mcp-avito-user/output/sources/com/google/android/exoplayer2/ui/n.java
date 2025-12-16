package com.google.android.exoplayer2.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.d0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: PlayerNotificationManager.java */
/* loaded from: classes6.dex */
public class n {

    /* compiled from: PlayerNotificationManager.java */
    public final class b {
        public b(n nVar, int i12, a aVar) {
        }
    }

    /* compiled from: PlayerNotificationManager.java */
    public static class c {
    }

    /* compiled from: PlayerNotificationManager.java */
    public interface d {
    }

    /* compiled from: PlayerNotificationManager.java */
    public interface e {
    }

    /* compiled from: PlayerNotificationManager.java */
    public class f extends BroadcastReceiver {
        public f(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            n.this.getClass();
        }
    }

    /* compiled from: PlayerNotificationManager.java */
    public interface g {
    }

    /* compiled from: PlayerNotificationManager.java */
    public class h implements d0.g {
        public h(a aVar) {
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onEvents(d0 d0Var, d0.f fVar) {
            if (fVar.b(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                n.this.getClass();
                throw null;
            }
        }
    }

    /* compiled from: PlayerNotificationManager.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    /* compiled from: PlayerNotificationManager.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }
}
