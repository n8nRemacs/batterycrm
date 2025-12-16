package com.avito.android.publish.cpa_tariff.mvi;

import Kd0.AbstractC14304b;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpaTariffBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/cpa_tariff/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "LKd0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.arch.mvi.b<AbstractC14304b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.cpa_tariff.mvi.domain.a f232457a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f232458b;

    @Inject
    public d(@Y61.k com.avito.android.publish.cpa_tariff.mvi.domain.a aVar) {
        this.f232457a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AbstractC14304b> a() {
        if (this.f232458b) {
            return C43175k.w();
        }
        this.f232458b = true;
        return this.f232457a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
