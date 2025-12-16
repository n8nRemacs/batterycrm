package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC36645h1 extends G0 {

    /* renamed from: b, reason: collision with root package name */
    public final C37028k f349116b;

    public AbstractC36645h1(int i12, C37028k c37028k) {
        super(i12);
        this.f349116b = c37028k;
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void a(@j.N Status status) {
        this.f349116b.c(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void b(@j.N RuntimeException runtimeException) {
        this.f349116b.c(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void c(C36676w0 c36676w0) throws DeadObjectException {
        try {
            h(c36676w0);
        } catch (DeadObjectException e12) {
            a(p1.e(e12));
            throw e12;
        } catch (RemoteException e13) {
            a(p1.e(e13));
        } catch (RuntimeException e14) {
            this.f349116b.c(e14);
        }
    }

    public abstract void h(C36676w0 c36676w0);

    @Override // com.google.android.gms.common.api.internal.p1
    public void d(@j.N H h12, boolean z12) {
    }
}
