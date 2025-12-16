package androidx.media3.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import j.InterfaceC42164u;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: MediaButtonReceiver.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public class G extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f52047a = {"android.intent.action.MEDIA_BUTTON", "androidx.media3.session.MediaLibraryService", "androidx.media3.session.MediaSessionService"};

    /* compiled from: MediaButtonReceiver.java */
    @j.X
    public static final class a {
        @InterfaceC42164u
        public static ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException) {
            return F.a(illegalStateException);
        }

        @InterfaceC42164u
        public static boolean b(IllegalStateException illegalStateException) {
            return F.c(illegalStateException);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, @j.P Intent intent) {
        ComponentName componentName;
        if (intent == null || !Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        if (androidx.media3.common.util.M.f47887a >= 26) {
            Bundle extras = intent.getExtras();
            extras.getClass();
            KeyEvent keyEvent = (KeyEvent) extras.getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getKeyCode() != 126 && keyEvent.getKeyCode() != 85) {
                return;
            }
        }
        String[] strArr = f52047a;
        for (int i12 = 0; i12 < 3; i12++) {
            String str = strArr[i12];
            PackageManager packageManager = context.getPackageManager();
            Intent intent2 = new Intent(str);
            intent2.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (listQueryIntentServices.size() == 1) {
                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                if (!listQueryIntentServices.isEmpty()) {
                    StringBuilder sbA = androidx.appcompat.app.r.A("Expected 1 service that handles ", str, ", found ");
                    sbA.append(listQueryIntentServices.size());
                    throw new IllegalStateException(sbA.toString());
                }
                componentName = null;
            }
            if (componentName != null) {
                intent.setComponent(componentName);
                try {
                    androidx.core.content.d.startForegroundService(context, intent);
                    return;
                } catch (IllegalStateException e12) {
                    if (Build.VERSION.SDK_INT < 31 || !a.b(e12)) {
                        throw e12;
                    }
                    a.a(e12).getMessage();
                    androidx.media3.common.util.s.c();
                    return;
                }
            }
        }
        throw new IllegalStateException("Could not find any Service that handles any of the actions " + Arrays.toString(strArr));
    }
}
