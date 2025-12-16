package com.avito.android.early_access.adapter.short_price;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.early_access.adapter.short_price.element.EarlyAccessShortPriceItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessShortPrice.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessShortPriceItem f145221l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f145222m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f145223n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EarlyAccessShortPriceItem earlyAccessShortPriceItem, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f145221l = earlyAccessShortPriceItem;
        this.f145222m = aVar;
        this.f145223n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(385);
        v vVar = this.f145223n;
        k.a(this.f145221l, this.f145222m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
