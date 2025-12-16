package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.base.zau;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import r61.InterfaceC47501c;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class U implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC47501c
    public final T f349377b;

    /* renamed from: i, reason: collision with root package name */
    public final zau f349384i;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f349378c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @j.k0
    public final ArrayList f349379d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f349380e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f349381f = false;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f349382g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    public boolean f349383h = false;

    /* renamed from: j, reason: collision with root package name */
    public final Object f349385j = new Object();

    public U(Looper looper, T t12) {
        this.f349377b = t12;
        this.f349384i = new zau(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i12 = message.what;
        if (i12 != 1) {
            Log.wtf("GmsClientEvents", AK.c.g(i12, "Don't know how to handle message: "), new Exception());
            return false;
        }
        i.b bVar = (i.b) message.obj;
        synchronized (this.f349385j) {
            try {
                if (this.f349381f && this.f349377b.isConnected() && this.f349378c.contains(bVar)) {
                    bVar.onConnected(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
