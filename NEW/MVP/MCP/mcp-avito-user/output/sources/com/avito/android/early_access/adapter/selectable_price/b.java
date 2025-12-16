package com.avito.android.early_access.adapter.selectable_price;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessLongPrice.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessSelectablePriceItem f145167l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f145168m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f145169n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EarlyAccessSelectablePriceItem earlyAccessSelectablePriceItem, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f145167l = earlyAccessSelectablePriceItem;
        this.f145168m = aVar;
        this.f145169n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(385);
        v vVar = this.f145169n;
        e.a(this.f145167l, this.f145168m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
