package com.avito.android.historical_suggests.suggest;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vI.C49218c;
import vI.InterfaceC49216a;

/* compiled from: HistoricalSuggestsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C49218c f162000l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49216a, G0> f162001m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f162002n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C49218c c49218c, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f162000l = c49218c;
        this.f162001m = lVar;
        this.f162002n = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        v.a aVar = this.f162002n;
        h.d(this.f162000l, this.f162001m, aVar, a12, iA2);
        return G0.f406611a;
    }
}
