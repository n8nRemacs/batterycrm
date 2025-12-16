package com.avito.android.historical_suggests.suggest;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vI.InterfaceC49216a;

/* compiled from: HistoricalSuggestsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LvI/a;", "it", "Lkotlin/G0;", "invoke", "(LvI/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i extends N implements Y41.l<InterfaceC49216a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f162003l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(1);
        this.f162003l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC49216a interfaceC49216a) {
        this.f162003l.getViewModel().accept(interfaceC49216a);
        return G0.f406611a;
    }
}
