package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.C37028k;
import com.google.firebase.messaging.O;
import j.InterfaceC42153i;
import j.k0;
import java.util.concurrent.ExecutorService;

/* compiled from: EnhancedIntentService.java */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractServiceC37614h extends Service {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f361860g = 0;

    /* renamed from: c, reason: collision with root package name */
    public Binder f361862c;

    /* renamed from: e, reason: collision with root package name */
    public int f361864e;

    /* renamed from: b, reason: collision with root package name */
    @k0
    public final ExecutorService f361861b = com.google.firebase.messaging.threads.b.f361934b.a(new com.google.android.gms.common.util.concurrent.b("Firebase-Messaging-Intent-Handle"));

    /* renamed from: d, reason: collision with root package name */
    public final Object f361863d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public int f361865f = 0;

    /* compiled from: EnhancedIntentService.java */
    /* renamed from: com.google.firebase.messaging.h$a */
    public class a implements O.a {
        public a() {
        }
    }

    public final void a(Intent intent) {
        if (intent != null) {
            N.b(intent);
        }
        synchronized (this.f361863d) {
            try {
                int i12 = this.f361865f - 1;
                this.f361865f = i12;
                if (i12 == 0) {
                    stopSelfResult(this.f361864e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.f361862c == null) {
                this.f361862c = new O(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f361862c;
    }

    @Override // android.app.Service
    @InterfaceC42153i
    public final void onDestroy() {
        this.f361861b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i12, int i13) {
        synchronized (this.f361863d) {
            this.f361864e = i13;
            this.f361865f++;
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            a(intent);
            return 2;
        }
        C37028k c37028k = new C37028k();
        this.f361861b.execute(new RunnableC37613g(this, intentB, c37028k));
        com.google.android.gms.tasks.P p12 = c37028k.f355672a;
        if (p12.q()) {
            a(intent);
            return 2;
        }
        p12.d(new androidx.arch.core.executor.a(1), new B(1, this, intent));
        return 3;
    }

    public Intent b(Intent intent) {
        return intent;
    }
}
