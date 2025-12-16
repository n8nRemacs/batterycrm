package com.avito.android.auto_loans_composite_broker.v2;

import com.avito.android.lib.design.chips.Chips;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsCompositeBrokerV2View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/y;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class y implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.p<com.avito.android.lib.design.chips.h, Integer, G0> f95653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f95654b;

    /* JADX WARN: Multi-variable type inference failed */
    public y(Y41.p<? super com.avito.android.lib.design.chips.h, ? super Integer, G0> pVar, z zVar) {
        this.f95653a = pVar;
        this.f95654b = zVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        Integer numY0 = C43066x.y0(this.f95654b.f95660f.getDeformattedText());
        ((m) this.f95653a).invoke(hVar, Integer.valueOf(numY0 != null ? numY0.intValue() : 0));
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
    }
}
