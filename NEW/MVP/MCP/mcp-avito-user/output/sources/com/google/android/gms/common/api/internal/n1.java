package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C37028k;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class n1 extends G0 {

    /* renamed from: b, reason: collision with root package name */
    public final A f349184b;

    /* renamed from: c, reason: collision with root package name */
    public final C37028k f349185c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC36679y f349186d;

    public n1(int i12, A a12, C37028k c37028k, InterfaceC36679y interfaceC36679y) {
        super(i12);
        this.f349185c = c37028k;
        this.f349184b = a12;
        this.f349186d = interfaceC36679y;
        if (i12 == 2 && a12.f348950b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void a(@j.N Status status) {
        this.f349185c.c(this.f349186d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void b(@j.N RuntimeException runtimeException) {
        this.f349185c.c(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void c(C36676w0 c36676w0) throws DeadObjectException {
        C37028k c37028k = this.f349185c;
        try {
            this.f349184b.b(c36676w0.f349233b, c37028k);
        } catch (DeadObjectException e12) {
            throw e12;
        } catch (RemoteException e13) {
            a(p1.e(e13));
        } catch (RuntimeException e14) {
            c37028k.c(e14);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void d(@j.N H h12, boolean z12) {
        Boolean boolValueOf = Boolean.valueOf(z12);
        Map map = h12.f349007b;
        C37028k c37028k = this.f349185c;
        map.put(c37028k, boolValueOf);
        c37028k.f355672a.c(new G(h12, c37028k));
    }

    @Override // com.google.android.gms.common.api.internal.G0
    public final boolean f(C36676w0 c36676w0) {
        return this.f349184b.f348950b;
    }

    @Override // com.google.android.gms.common.api.internal.G0
    @j.P
    public final Feature[] g(C36676w0 c36676w0) {
        return this.f349184b.f348949a;
    }
}
