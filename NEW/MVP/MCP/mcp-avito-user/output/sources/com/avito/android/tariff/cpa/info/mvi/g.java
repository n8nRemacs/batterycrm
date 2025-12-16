package com.avito.android.tariff.cpa.info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpaInfoBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.arch.mvi.b<CpaInfoInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpa.info.domain.a f294766a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f294767b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f294768c;

    @Inject
    public g(@Y61.k com.avito.android.tariff.cpa.info.domain.a aVar, @com.avito.android.tariff.cpa.info.di.n boolean z12, @com.avito.android.tariff.cpa.info.di.m boolean z13) {
        this.f294766a = aVar;
        this.f294767b = z12;
        this.f294768c = z13;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CpaInfoInternalAction> a() {
        return this.f294766a.b(this.f294767b || this.f294768c);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
