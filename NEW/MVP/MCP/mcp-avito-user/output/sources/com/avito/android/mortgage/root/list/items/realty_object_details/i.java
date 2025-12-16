package com.avito.android.mortgage.root.list.items.realty_object_details;

import f10.InterfaceC40199a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RealtyObjectDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isFocused", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f202781l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar) {
        super(1);
        this.f202781l = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        o oVar = this.f202781l;
        if (zBooleanValue) {
            oVar.f202787b.invoke(InterfaceC40199a.C.f395579a);
        } else {
            oVar.f202787b.invoke(InterfaceC40199a.B.f395578a);
        }
        return G0.f406611a;
    }
}
