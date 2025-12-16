package com.avito.android.select.new_metro.compose;

import androidx.compose.runtime.C22066f2;
import com.avito.android.select.new_metro.item.MetroStationItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MetroStation.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MetroStationItem f266140l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MetroStationItem, G0> f266141m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f266142n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(MetroStationItem metroStationItem, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f266140l = metroStationItem;
        this.f266141m = lVar;
        this.f266142n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        Y41.l<MetroStationItem, G0> lVar = this.f266141m;
        z.a(this.f266140l, lVar, a12, iA2);
        return G0.f406611a;
    }
}
