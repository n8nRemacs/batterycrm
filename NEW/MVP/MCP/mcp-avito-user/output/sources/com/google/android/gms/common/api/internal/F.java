package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class F implements m.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f349001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f349002b;

    public F(H h12, BasePendingResult basePendingResult) {
        this.f349002b = h12;
        this.f349001a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.m.a
    public final void a(Status status) {
        this.f349002b.f349006a.remove(this.f349001a);
    }
}
