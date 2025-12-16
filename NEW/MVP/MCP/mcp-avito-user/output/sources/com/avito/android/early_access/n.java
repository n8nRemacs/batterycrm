package com.avito.android.early_access;

import Lx.InterfaceC14447b;
import Mx.InterfaceC14538a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class n extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessDialog f145567l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(EarlyAccessDialog earlyAccessDialog) {
        super(0);
        this.f145567l = earlyAccessDialog;
    }

    @Override // Y41.a
    public final G0 invoke() {
        EarlyAccessDialog earlyAccessDialog = this.f145567l;
        InterfaceC14447b interfaceC14447b = earlyAccessDialog.f145060l0;
        if (interfaceC14447b == null) {
            interfaceC14447b = null;
        }
        interfaceC14447b.h();
        earlyAccessDialog.f5().accept(InterfaceC14538a.c.f11107a);
        return G0.f406611a;
    }
}
