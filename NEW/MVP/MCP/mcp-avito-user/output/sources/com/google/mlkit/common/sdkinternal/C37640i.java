package com.google.mlkit.common.sdkinternal;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.mlkit_common.zza;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import j.P;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* renamed from: com.google.mlkit.common.sdkinternal.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37640i {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f362335b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @j.B
    @P
    public static C37640i f362336c;

    /* renamed from: a, reason: collision with root package name */
    public final zza f362337a;

    public C37640i(Looper looper) {
        this.f362337a = new zza(looper);
    }

    @j.N
    @RX0.a
    public static C37640i a() {
        C37640i c37640i;
        synchronized (f362335b) {
            try {
                if (f362336c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f362336c = new C37640i(handlerThread.getLooper());
                }
                c37640i = f362336c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c37640i;
    }

    @j.N
    @RX0.a
    public static Task b(@j.N final Callable callable) {
        final C37028k c37028k = new C37028k();
        y.f362395b.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.w
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                C37028k c37028k2 = c37028k;
                try {
                    c37028k2.b(callable2.call());
                } catch (MlKitException e12) {
                    c37028k2.a(e12);
                } catch (Exception e13) {
                    c37028k2.a(new MlKitException(13, "Internal error has occurred when executing ML Kit tasks", e13));
                }
            }
        });
        return c37028k.f355672a;
    }

    @j.N
    @RX0.a
    public static Executor c() {
        return y.f362395b;
    }
}
