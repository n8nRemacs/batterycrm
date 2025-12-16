package com.avito.android.early_access;

import Mx.InterfaceC14538a;
import com.avito.android.early_access.EarlyAccessDialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMx/a;", "it", "Lkotlin/G0;", "invoke", "(LMx/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i extends N implements Y41.l<InterfaceC14538a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessDialog f145387l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(EarlyAccessDialog earlyAccessDialog) {
        super(1);
        this.f145387l = earlyAccessDialog;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC14538a interfaceC14538a) {
        EarlyAccessDialog.a aVar = EarlyAccessDialog.f145055q0;
        this.f145387l.f5().accept(interfaceC14538a);
        return G0.f406611a;
    }
}
