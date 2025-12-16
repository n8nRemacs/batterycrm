package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.internal.C36729v;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class l1 extends p1 {

    /* renamed from: b, reason: collision with root package name */
    public final C36634e.a f349175b;

    public l1(int i12, C36634e.a aVar) {
        super(i12);
        C36729v.k(aVar, "Null methods are not runnable.");
        this.f349175b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void a(@j.N Status status) {
        try {
            this.f349175b.setFailedResult(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void b(@j.N RuntimeException runtimeException) {
        try {
            this.f349175b.setFailedResult(new Status(10, androidx.appcompat.app.r.r(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void c(C36676w0 c36676w0) throws DeadObjectException {
        try {
            this.f349175b.run(c36676w0.f349233b);
        } catch (RuntimeException e12) {
            b(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.p1
    public final void d(@j.N H h12, boolean z12) {
        Boolean boolValueOf = Boolean.valueOf(z12);
        Map map = h12.f349006a;
        C36634e.a aVar = this.f349175b;
        map.put(aVar, boolValueOf);
        aVar.addStatusListener(new F(h12, aVar));
    }
}
