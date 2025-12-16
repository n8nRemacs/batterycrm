package com.google.android.gms.common.api.internal;

import android.os.Looper;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.C36729v;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.i1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36648i1<R extends com.google.android.gms.common.api.r> extends com.google.android.gms.common.api.v<R> implements com.google.android.gms.common.api.s<R> {

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f349142f;

    /* renamed from: g, reason: collision with root package name */
    public final HandlerC36642g1 f349143g;

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public com.google.android.gms.common.api.u f349137a = null;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public C36648i1 f349138b = null;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public com.google.android.gms.common.api.m f349139c = null;

    /* renamed from: d, reason: collision with root package name */
    public final Object f349140d = new Object();

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public Status f349141e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f349144h = false;

    public C36648i1(WeakReference weakReference) {
        C36729v.k(weakReference, "GoogleApiClient reference must not be null");
        this.f349142f = weakReference;
        com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) weakReference.get();
        this.f349143g = new HandlerC36642g1(this, iVar != null ? iVar.i() : Looper.getMainLooper());
    }

    public static final void e(com.google.android.gms.common.api.r rVar) {
        if (rVar instanceof com.google.android.gms.common.api.o) {
            try {
                ((com.google.android.gms.common.api.o) rVar).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(rVar));
            }
        }
    }

    @Override // com.google.android.gms.common.api.s
    public final void a(com.google.android.gms.common.api.r rVar) {
        synchronized (this.f349140d) {
            try {
                if (!rVar.getStatus().h()) {
                    b(rVar.getStatus());
                    e(rVar);
                } else if (this.f349137a != null) {
                    V0.f349062a.submit(new RunnableC36639f1(this, rVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Status status) {
        synchronized (this.f349140d) {
            this.f349141e = status;
            d(status);
        }
    }

    @InterfaceC25600a
    public final void c() {
        if (this.f349137a == null) {
            return;
        }
        com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) this.f349142f.get();
        if (!this.f349144h && this.f349137a != null && iVar != null) {
            iVar.l(this);
            this.f349144h = true;
        }
        Status status = this.f349141e;
        if (status != null) {
            d(status);
            return;
        }
        com.google.android.gms.common.api.m mVar = this.f349139c;
        if (mVar != null) {
            mVar.setResultCallback(this);
        }
    }

    public final void d(Status status) {
        synchronized (this.f349140d) {
            try {
                if (this.f349137a != null) {
                    C36729v.k(status, "onFailure must not return null");
                    C36648i1 c36648i1 = this.f349138b;
                    C36729v.j(c36648i1);
                    c36648i1.b(status);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
