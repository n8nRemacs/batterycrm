package com.avito.android.tariff_cpt.info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CptInfoV2Bootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements com.avito.android.arch.mvi.b<CptInfoV2InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_cpt.info.domain.a f298251a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f298252b;

    @Inject
    public h(@Y61.k com.avito.android.tariff_cpt.info.domain.a aVar, @Y61.l @com.avito.android.tariff_cpt.common.di.c String str) {
        this.f298251a = aVar;
        this.f298252b = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CptInfoV2InternalAction> a() {
        return this.f298251a.a(this.f298252b, false);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
