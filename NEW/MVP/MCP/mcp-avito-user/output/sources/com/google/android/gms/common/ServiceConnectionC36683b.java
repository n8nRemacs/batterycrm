package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C36729v;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class ServiceConnectionC36683b implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public boolean f349262b = false;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f349263c = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    @j.N
    @RX0.a
    public final IBinder a(@j.N TimeUnit timeUnit) throws TimeoutException {
        C36729v.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f349262b) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f349262b = true;
        IBinder iBinder = (IBinder) this.f349263c.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@j.N ComponentName componentName, @j.N IBinder iBinder) {
        this.f349263c.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@j.N ComponentName componentName) {
    }
}
