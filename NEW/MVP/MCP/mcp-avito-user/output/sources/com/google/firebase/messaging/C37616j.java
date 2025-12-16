package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* compiled from: FcmBroadcastProcessor.java */
@RX0.a
/* renamed from: com.google.firebase.messaging.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37616j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f361869c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public static P f361870d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f361871a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.arch.core.executor.a f361872b = new androidx.arch.core.executor.a(1);

    public C37616j(Context context) {
        this.f361871a = context;
    }

    public static Task<Integer> a(Context context, Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        if (D.a().c(context)) {
            P pB2 = b(context);
            synchronized (N.f361813b) {
                try {
                    N.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        N.f361814c.a(N.f361812a);
                    }
                    pB2.b(intent).c(new C37620n(intent, 2));
                } finally {
                }
            }
        } else {
            b(context).b(intent);
        }
        return C37030m.f(-1);
    }

    public static P b(Context context) {
        P p12;
        synchronized (f361869c) {
            try {
                if (f361870d == null) {
                    f361870d = new P(context);
                }
                p12 = f361870d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p12;
    }

    @RX0.a
    public final Task<Integer> c(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.f361871a;
        boolean z12 = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z13 = (intent.getFlags() & 268435456) != 0;
        if (z12 && !z13) {
            return a(context, intent);
        }
        androidx.arch.core.executor.a aVar = this.f361872b;
        return C37030m.c(new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i12;
                Context context2 = context;
                Intent intent2 = intent;
                D dA2 = D.a();
                dA2.getClass();
                Log.isLoggable("FirebaseMessaging", 3);
                dA2.f361740d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (dA2) {
                    try {
                        str = dA2.f361737a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null && context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    dA2.f361737a = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    dA2.f361737a = serviceInfo.name;
                                }
                                str = dA2.f361737a;
                            }
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    i12 = (dA2.c(context2) ? N.c(context2, intent3) : context2.startService(intent3)) == null ? 404 : -1;
                } catch (IllegalStateException e12) {
                    e12.toString();
                    i12 = 402;
                } catch (SecurityException unused) {
                    i12 = 401;
                }
                return Integer.valueOf(i12);
            }
        }, aVar).l(aVar, new B(2, context, intent));
    }
}
