package com.avito.android.select.new_metro.compose;

import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.SelectedStationInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MetroSelectedStations.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.select.new_metro.compose.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34650q extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MetroSelectedStationsItem f266123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<MetroSelectedStationsItem, String, G0> f266124m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C34650q(MetroSelectedStationsItem metroSelectedStationsItem, Y41.p<? super MetroSelectedStationsItem, ? super String, G0> pVar) {
        super(2);
        this.f266123l = metroSelectedStationsItem;
        this.f266124m = pVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            MetroSelectedStationsItem metroSelectedStationsItem = this.f266123l;
            for (SelectedStationInfo selectedStationInfo : metroSelectedStationsItem.f266196e) {
                v.b(selectedStationInfo, new C34649p(this.f266124m, metroSelectedStationsItem, selectedStationInfo), a13, 8);
            }
        }
        return G0.f406611a;
    }
}
