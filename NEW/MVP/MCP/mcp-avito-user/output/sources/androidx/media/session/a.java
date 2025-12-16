package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;
import androidx.appcompat.app.r;
import androidx.core.content.d;
import java.util.List;
import java.util.Objects;

/* compiled from: MediaButtonReceiver.java */
/* loaded from: classes.dex */
public class a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f47075a = 0;

    /* compiled from: MediaButtonReceiver.java */
    /* renamed from: androidx.media.session.a$a, reason: collision with other inner class name */
    public static class C1813a extends MediaBrowserCompat.ConnectionCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Context f47076a;

        /* renamed from: b, reason: collision with root package name */
        public final Intent f47077b;

        /* renamed from: c, reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f47078c;

        /* renamed from: d, reason: collision with root package name */
        public MediaBrowserCompat f47079d;

        public C1813a(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
            this.f47076a = context;
            this.f47077b = intent;
            this.f47078c = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnected() {
            new MediaControllerCompat(this.f47076a, this.f47079d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f47077b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            this.f47079d.disconnect();
            this.f47078c.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionFailed() {
            this.f47079d.disconnect();
            this.f47078c.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionSuspended() {
            this.f47079d.disconnect();
            this.f47078c.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbA = r.A("Expected 1 service that handles ", str, ", found ");
        sbA.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbA.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA != null) {
            intent.setComponent(componentNameA);
            d.startForegroundService(context, intent);
            return;
        }
        ComponentName componentNameA2 = a(context, "android.media.browse.MediaBrowserService");
        if (componentNameA2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C1813a c1813a = new C1813a(pendingResultGoAsync, applicationContext, intent);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameA2, c1813a, null);
        c1813a.f47079d = mediaBrowserCompat;
        mediaBrowserCompat.connect();
    }
}
