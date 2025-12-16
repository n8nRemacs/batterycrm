package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import bZ0.InterfaceC25600a;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class J0 extends AbstractC36711k {

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC25600a
    public final HashMap f349343d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f349344e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzi f349345f;

    /* renamed from: g, reason: collision with root package name */
    public final ZX0.a f349346g;

    /* renamed from: h, reason: collision with root package name */
    public final long f349347h;

    /* renamed from: i, reason: collision with root package name */
    public final long f349348i;

    public J0(Context context, Looper looper) {
        I0 i02 = new I0(this, null);
        this.f349344e = context.getApplicationContext();
        this.f349345f = new zzi(looper, i02);
        this.f349346g = ZX0.a.b();
        this.f349347h = 5000L;
        this.f349348i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36711k
    public final void b(F0 f02, ServiceConnection serviceConnection) {
        C36729v.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f349343d) {
            try {
                G0 g02 = (G0) this.f349343d.get(f02);
                if (g02 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(f02.toString()));
                }
                if (!g02.f349319b.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(f02.toString()));
                }
                g02.f349319b.remove(serviceConnection);
                if (g02.f349319b.isEmpty()) {
                    this.f349345f.sendMessageDelayed(this.f349345f.obtainMessage(0, f02), this.f349347h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC36711k
    public final boolean c(F0 f02, w0 w0Var, String str, @j.P Executor executor) {
        boolean z12;
        synchronized (this.f349343d) {
            try {
                G0 g02 = (G0) this.f349343d.get(f02);
                if (executor == null) {
                    executor = null;
                }
                if (g02 == null) {
                    g02 = new G0(this, f02);
                    g02.f349319b.put(w0Var, w0Var);
                    g02.a(str, executor);
                    this.f349343d.put(f02, g02);
                } else {
                    this.f349345f.removeMessages(0, f02);
                    if (g02.f349319b.containsKey(w0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(f02.toString()));
                    }
                    g02.f349319b.put(w0Var, w0Var);
                    int i12 = g02.f349320c;
                    if (i12 == 1) {
                        w0Var.onServiceConnected(g02.f349324g, g02.f349322e);
                    } else if (i12 == 2) {
                        g02.a(str, executor);
                    }
                }
                z12 = g02.f349321d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12;
    }
}
