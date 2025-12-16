package com.avito.android.select.new_metro.compose;

import androidx.compose.runtime.C22066f2;
import com.avito.android.select.new_metro.item.SelectedStationInfo;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MetroSelectedStations.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectedStationInfo f266133l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f266134m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f266135n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SelectedStationInfo selectedStationInfo, Y41.a<G0> aVar, int i12) {
        super(2);
        this.f266133l = selectedStationInfo;
        this.f266134m = aVar;
        this.f266135n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f266135n | 1);
        v.b(this.f266133l, this.f266134m, a12, iA2);
        return G0.f406611a;
    }
}
