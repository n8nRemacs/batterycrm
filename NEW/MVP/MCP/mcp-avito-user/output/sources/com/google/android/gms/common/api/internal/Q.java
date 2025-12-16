package com.google.android.gms.common.api.internal;

import bZ0.InterfaceC25600a;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class Q extends AbstractC36657m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f349050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T f349051c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(T t12, InterfaceC36655l0 interfaceC36655l0, ConnectionResult connectionResult) {
        super(interfaceC36655l0);
        this.f349051c = t12;
        this.f349050b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC36657m0
    @InterfaceC25600a
    public final void a() {
        this.f349051c.f349057d.l(this.f349050b);
    }
}
