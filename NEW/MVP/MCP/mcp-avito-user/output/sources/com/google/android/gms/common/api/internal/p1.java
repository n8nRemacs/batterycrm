package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f349204a;

    public p1(int i12) {
        this.f349204a = i12;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void a(@j.N Status status);

    public abstract void b(@j.N RuntimeException runtimeException);

    public abstract void c(C36676w0 c36676w0);

    public abstract void d(@j.N H h12, boolean z12);
}
