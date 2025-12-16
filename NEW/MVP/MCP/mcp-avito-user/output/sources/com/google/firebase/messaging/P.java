package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes6.dex */
class P implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f361817b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f361818c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f361819d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f361820e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public O f361821f;

    /* renamed from: g, reason: collision with root package name */
    @j.B
    public boolean f361822g;

    /* compiled from: WithinAppServiceConnection.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f361823a;

        /* renamed from: b, reason: collision with root package name */
        public final C37028k<Void> f361824b = new C37028k<>();

        public a(Intent intent) {
            this.f361823a = intent;
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public P(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new com.google.android.gms.common.util.concurrent.b("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f361820e = new ArrayDeque();
        this.f361822g = false;
        Context applicationContext = context.getApplicationContext();
        this.f361817b = applicationContext;
        this.f361818c = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f361819d = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.f361820e.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                O o12 = this.f361821f;
                if (o12 == null || !o12.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.f361822g) {
                        this.f361822g = true;
                        if (!ZX0.a.b().a(this.f361817b, this.f361818c, this, 65)) {
                            this.f361822g = false;
                            while (true) {
                                ArrayDeque arrayDeque = this.f361820e;
                                if (arrayDeque.isEmpty()) {
                                    break;
                                } else {
                                    ((a) arrayDeque.poll()).f361824b.d(null);
                                }
                            }
                        }
                    }
                    return;
                }
                Log.isLoggable("FirebaseMessaging", 3);
                this.f361821f.a((a) this.f361820e.poll());
            }
        } finally {
        }
    }

    public final synchronized Task<Void> b(Intent intent) {
        a aVar;
        Log.isLoggable("FirebaseMessaging", 3);
        aVar = new a(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f361819d;
        aVar.f361824b.f355672a.d(scheduledThreadPoolExecutor, new C37620n(scheduledThreadPoolExecutor.schedule(new E(aVar, 1), (aVar.f361823a.getFlags() & 268435456) != 0 ? N.f361812a : 9000L, TimeUnit.MILLISECONDS), 4));
        this.f361820e.add(aVar);
        a();
        return aVar.f361824b.f355672a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.f361822g = false;
            if (iBinder instanceof O) {
                this.f361821f = (O) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.f361820e;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((a) arrayDeque.poll()).f361824b.d(null);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
