package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36711k {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f349444a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public static J0 f349445b;

    /* renamed from: c, reason: collision with root package name */
    @j.k0
    @j.P
    public static HandlerThread f349446c;

    @j.N
    @RX0.a
    public static AbstractC36711k a(@j.N Context context) {
        synchronized (f349444a) {
            try {
                if (f349445b == null) {
                    f349445b = new J0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f349445b;
    }

    public abstract void b(F0 f02, ServiceConnection serviceConnection);

    public abstract boolean c(F0 f02, w0 w0Var, String str, @j.P Executor executor);
}
