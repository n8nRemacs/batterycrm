package com.yandex.metrica.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class d implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final Intent f377715b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public IBinder f377716c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f377717d = new Object();

    public d(@N Intent intent) {
        this.f377715b = intent;
    }

    public final void a(@N Context context) {
        synchronized (this.f377717d) {
            this.f377716c = null;
            this.f377717d.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        synchronized (this.f377717d) {
            this.f377716c = null;
            this.f377717d.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        synchronized (this.f377717d) {
            this.f377717d.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f377717d) {
            this.f377716c = iBinder;
            this.f377717d.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f377717d) {
            this.f377716c = null;
            this.f377717d.notifyAll();
        }
    }
}
