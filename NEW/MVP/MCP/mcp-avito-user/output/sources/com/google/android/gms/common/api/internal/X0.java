package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class X0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinderC36624a1 f349064b;

    public X0(BinderC36624a1 binderC36624a1) {
        this.f349064b = binderC36624a1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f349064b.f349076t.b(new ConnectionResult(4));
    }
}
