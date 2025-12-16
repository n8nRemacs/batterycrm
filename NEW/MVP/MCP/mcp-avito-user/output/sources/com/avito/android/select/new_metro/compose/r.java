package com.avito.android.select.new_metro.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MetroSelectedStations.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.p<MetroSelectedStationsItem, Boolean, G0> f266125l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MetroSelectedStationsItem f266126m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Boolean> f266127n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(Y41.p<? super MetroSelectedStationsItem, ? super Boolean, G0> pVar, MetroSelectedStationsItem metroSelectedStationsItem, InterfaceC22204y1<Boolean> interfaceC22204y1) {
        super(0);
        this.f266125l = pVar;
        this.f266126m = metroSelectedStationsItem;
        this.f266127n = interfaceC22204y1;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f266127n;
        this.f266125l.invoke(this.f266126m, Boolean.valueOf(!interfaceC22204y1.getF42167b().booleanValue()));
        interfaceC22204y1.setValue(Boolean.valueOf(!interfaceC22204y1.getF42167b().booleanValue()));
        return G0.f406611a;
    }
}
