package androidx.media3.session;

import android.app.Notification;
import android.media.session.MediaSession;
import android.os.Bundle;
import androidx.core.app.z;
import j.InterfaceC42164u;

/* compiled from: MediaStyleNotificationHelper.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public class B1 {

    /* compiled from: MediaStyleNotificationHelper.java */
    @j.X
    public static class a {
        @InterfaceC42164u
        public static Notification.MediaStyle a() {
            return new Notification.MediaStyle();
        }

        @InterfaceC42164u
        public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, @j.P int[] iArr, O0 o02) {
            mediaStyle.getClass();
            o02.getClass();
            if (iArr != null) {
                d(mediaStyle, iArr);
            }
            mediaStyle.setMediaSession((MediaSession.Token) o02.f52204a.f52293g.f52362g.getSessionToken().getToken());
            return mediaStyle;
        }

        @InterfaceC42164u
        public static void c(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        @InterfaceC42164u
        public static void d(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    /* compiled from: MediaStyleNotificationHelper.java */
    @j.X
    public static class b {
        @InterfaceC42164u
        public static Notification.DecoratedMediaCustomViewStyle a() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    /* compiled from: MediaStyleNotificationHelper.java */
    public static class c extends d {
        @Override // androidx.media3.session.B1.d, androidx.core.app.z.y
        public final void b(androidx.core.app.w wVar) {
            a.c(wVar.a(), a.b(b.a(), null, null));
            new Bundle();
            throw null;
        }
    }

    /* compiled from: MediaStyleNotificationHelper.java */
    public static class d extends z.y {
        @Override // androidx.core.app.z.y
        public void b(androidx.core.app.w wVar) {
            a.c(wVar.a(), a.b(a.a(), null, null));
            new Bundle();
            throw null;
        }
    }
}
