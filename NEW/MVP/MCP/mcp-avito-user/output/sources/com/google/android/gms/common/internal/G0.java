package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class G0 implements ServiceConnection, K0 {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f349319b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public int f349320c = 2;

    /* renamed from: d, reason: collision with root package name */
    public boolean f349321d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public IBinder f349322e;

    /* renamed from: f, reason: collision with root package name */
    public final F0 f349323f;

    /* renamed from: g, reason: collision with root package name */
    public ComponentName f349324g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ J0 f349325h;

    public G0(J0 j02, F0 f02) {
        this.f349325h = j02;
        this.f349323f = f02;
    }

    public final void a(String str, @j.P Executor executor) {
        this.f349320c = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            J0 j02 = this.f349325h;
            ZX0.a aVar = j02.f349346g;
            Context context = j02.f349344e;
            boolean zD2 = aVar.d(context, str, this.f349323f.a(context), this, 4225, executor);
            this.f349321d = zD2;
            if (zD2) {
                this.f349325h.f349345f.sendMessageDelayed(this.f349325h.f349345f.obtainMessage(1, this.f349323f), this.f349325h.f349348i);
            } else {
                this.f349320c = 2;
                try {
                    J0 j03 = this.f349325h;
                    j03.f349346g.c(j03.f349344e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f349325h.f349343d) {
            try {
                this.f349325h.f349345f.removeMessages(1, this.f349323f);
                this.f349322e = iBinder;
                this.f349324g = componentName;
                Iterator it = this.f349319b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f349320c = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f349325h.f349343d) {
            try {
                this.f349325h.f349345f.removeMessages(1, this.f349323f);
                this.f349322e = null;
                this.f349324g = componentName;
                Iterator it = this.f349319b.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f349320c = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
