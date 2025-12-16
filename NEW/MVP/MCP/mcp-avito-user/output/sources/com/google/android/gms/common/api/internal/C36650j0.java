package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36650j0 extends C0 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f349145a;

    public C36650j0(C36653k0 c36653k0) {
        this.f349145a = new WeakReference(c36653k0);
    }

    @Override // com.google.android.gms.common.api.internal.C0
    public final void a() {
        C36653k0 c36653k0 = (C36653k0) this.f349145a.get();
        if (c36653k0 == null) {
            return;
        }
        C36653k0.o(c36653k0);
    }
}
