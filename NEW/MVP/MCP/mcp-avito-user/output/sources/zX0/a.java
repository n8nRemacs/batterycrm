package ZX0;

import I41.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.K0;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.N;
import j.k0;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f20201b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @h
    public static volatile a f20202c;

    /* renamed from: a, reason: collision with root package name */
    @N
    @k0
    public final ConcurrentHashMap f20203a = new ConcurrentHashMap();

    @N
    @RX0.a
    public static a b() {
        if (f20202c == null) {
            synchronized (f20201b) {
                try {
                    if (f20202c == null) {
                        f20202c = new a();
                    }
                } finally {
                }
            }
        }
        a aVar = f20202c;
        C36729v.j(aVar);
        return aVar;
    }

    @ResultIgnorabilityUnspecified
    @RX0.a
    public final boolean a(@N Context context, @N Intent intent, @N ServiceConnection serviceConnection, int i12) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i12, null);
    }

    @RX0.a
    public final void c(@N Context context, @N ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof K0)) {
            ConcurrentHashMap concurrentHashMap = this.f20203a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i12, @h Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((aY0.c.a(context).a(0, packageName).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof K0) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i12) : context.bindService(intent, i12, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.f20203a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i12) : context.bindService(intent, i12, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
