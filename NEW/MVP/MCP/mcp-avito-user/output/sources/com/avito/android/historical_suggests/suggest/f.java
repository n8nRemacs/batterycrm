package com.avito.android.historical_suggests.suggest;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HistoricalSuggestsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f161997l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f161998m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f161999n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, Y41.a aVar, v.a aVar2, int i12) {
        super(2);
        this.f161997l = str;
        this.f161998m = aVar;
        this.f161999n = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        h.c(this.f161997l, this.f161998m, this.f161999n, a12, iA2);
        return G0.f406611a;
    }
}
