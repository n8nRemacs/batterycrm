package androidx.media3.session;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.z;
import androidx.media3.common.util.C23110a;
import androidx.media3.session.H0;
import com.avito.android.R;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.common.util.concurrent.InterfaceC37564s0;
import j.InterfaceC42164u;
import j.InterfaceC42165v;

/* compiled from: DefaultMediaNotificationProvider.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.session.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23240m implements H0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f52572a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f52573b;

    /* renamed from: c, reason: collision with root package name */
    public e f52574c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC42165v
    public final int f52575d;

    /* compiled from: DefaultMediaNotificationProvider.java */
    @j.X
    /* renamed from: androidx.media3.session.m$b */
    public static class b {
        @InterfaceC42164u
        public static void a(NotificationManager notificationManager, String str, String str2) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 2);
            if (androidx.media3.common.util.M.f47887a <= 27) {
                notificationChannel.setShowBadge(false);
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* compiled from: DefaultMediaNotificationProvider.java */
    /* renamed from: androidx.media3.session.m$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Context f52576a;

        /* renamed from: b, reason: collision with root package name */
        public final M1 f52577b = new M1(4);

        /* renamed from: c, reason: collision with root package name */
        public boolean f52578c;

        public c(Context context) {
            this.f52576a = context;
        }
    }

    /* compiled from: DefaultMediaNotificationProvider.java */
    /* renamed from: androidx.media3.session.m$d */
    public interface d {
    }

    /* compiled from: DefaultMediaNotificationProvider.java */
    /* renamed from: androidx.media3.session.m$e */
    public static class e implements InterfaceC37564s0<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        public final int f52579a;

        /* renamed from: b, reason: collision with root package name */
        public final z.n f52580b;

        /* renamed from: c, reason: collision with root package name */
        public final C23214d0 f52581c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f52582d;

        public e(int i12, z.n nVar, C23214d0 c23214d0) {
            this.f52579a = i12;
            this.f52580b = nVar;
            this.f52581c = c23214d0;
        }

        @Override // com.google.common.util.concurrent.InterfaceC37564s0
        public final void a(Throwable th2) {
            if (this.f52582d) {
                return;
            }
            th2.getMessage();
            androidx.media3.common.util.s.g();
        }

        @Override // com.google.common.util.concurrent.InterfaceC37564s0
        public final void onSuccess(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (this.f52582d) {
                return;
            }
            z.n nVar = this.f52580b;
            nVar.h(bitmap2);
            H0 h02 = new H0(this.f52579a, nVar.b());
            C23214d0 c23214d0 = this.f52581c;
            M0 m02 = (M0) c23214d0.f52436c;
            m02.f52135e.execute(new J0(c23214d0.f52435b, m02, 0, (O0) c23214d0.f52437d, h02));
        }
    }

    public C23240m(c cVar, a aVar) {
        Context context = cVar.f52576a;
        this.f52572a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationsSettings.Section.SECTION_PAID_SERVICES);
        C23110a.h(notificationManager);
        this.f52573b = notificationManager;
        this.f52575d = R.drawable.media3_notification_small_icon;
    }
}
