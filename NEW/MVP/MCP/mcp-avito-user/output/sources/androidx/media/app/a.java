package androidx.media.app;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.annotation.RestrictTo;
import androidx.core.app.w;
import androidx.core.app.z;
import j.InterfaceC42164u;
import j.X;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: NotificationCompat.java */
    @X
    /* renamed from: androidx.media.app.a$a, reason: collision with other inner class name */
    public static class C1810a {
        @InterfaceC42164u
        public static void a(RemoteViews remoteViews, int i12, CharSequence charSequence) {
            remoteViews.setContentDescription(i12, charSequence);
        }
    }

    /* compiled from: NotificationCompat.java */
    @X
    public static class b {
        @InterfaceC42164u
        public static Notification.MediaStyle a() {
            return new Notification.MediaStyle();
        }

        @InterfaceC42164u
        public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat.Token token) {
            if (iArr != null) {
                e(mediaStyle, iArr);
            }
            if (token != null) {
                c(mediaStyle, (MediaSession.Token) token.getToken());
            }
            return mediaStyle;
        }

        @InterfaceC42164u
        public static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
            mediaStyle.setMediaSession(token);
        }

        @InterfaceC42164u
        public static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
            builder.setStyle(mediaStyle);
        }

        @InterfaceC42164u
        public static void e(Notification.MediaStyle mediaStyle, int... iArr) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
    }

    /* compiled from: NotificationCompat.java */
    @X
    public static class c {
        @InterfaceC42164u
        public static Notification.DecoratedMediaCustomViewStyle a() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class d extends e {
        @Override // androidx.media.app.a.e, androidx.core.app.z.y
        @RestrictTo
        public final void b(w wVar) {
            b.d(wVar.a(), b.b(c.a(), this.f47022d, null));
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class e extends z.y {

        /* renamed from: d, reason: collision with root package name */
        public int[] f47022d = null;

        @Override // androidx.core.app.z.y
        @RestrictTo
        public void b(w wVar) {
            b.d(wVar.a(), b.b(b.a(), this.f47022d, null));
        }
    }
}
