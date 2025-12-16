package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.common.api.internal.InterfaceC36675w;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class f extends androidx.loader.content.a implements InterfaceC36675w {

    /* renamed from: k, reason: collision with root package name */
    public final Semaphore f348785k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f348786l;

    public f(Context context, Set set) {
        this.f46964c = false;
        this.f46965d = false;
        this.f46966e = true;
        this.f46967f = false;
        this.f46968g = false;
        this.f46963b = context.getApplicationContext();
        this.f348785k = new Semaphore(0);
        this.f348786l = set;
    }

    @Override // androidx.loader.content.c
    public final void e() {
        this.f348785k.drainPermits();
        k();
    }

    @Override // androidx.loader.content.a
    public final /* bridge */ /* synthetic */ Object i() throws InterruptedException {
        Iterator it = this.f348786l.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (((com.google.android.gms.common.api.i) it.next()).j(this)) {
                i12++;
            }
        }
        try {
            this.f348785k.tryAcquire(i12, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36675w
    public final void onComplete() {
        this.f348785k.release();
    }
}
