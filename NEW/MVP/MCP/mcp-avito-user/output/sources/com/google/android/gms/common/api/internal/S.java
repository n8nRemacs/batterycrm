package com.google.android.gms.common.api.internal;

import bZ0.InterfaceC25600a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC36699e;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class S extends AbstractC36657m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC36699e.c f349054b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(InterfaceC36655l0 interfaceC36655l0, AbstractC36699e.c cVar) {
        super(interfaceC36655l0);
        this.f349054b = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC36657m0
    @InterfaceC25600a
    public final void a() {
        this.f349054b.a(new ConnectionResult(16, null));
    }
}
