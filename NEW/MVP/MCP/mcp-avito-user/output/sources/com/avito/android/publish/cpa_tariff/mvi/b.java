package com.avito.android.publish.cpa_tariff.mvi;

import Kd0.AbstractC14304b;
import Kd0.InterfaceC14303a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CpaTariffActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/cpa_tariff/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LKd0/a;", "LKd0/b;", "LKd0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC14303a, AbstractC14304b, Kd0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.cpa_tariff.mvi.domain.e f232455a;

    @Inject
    public b(@Y61.k com.avito.android.publish.cpa_tariff.mvi.domain.e eVar) {
        this.f232455a = eVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AbstractC14304b> b(InterfaceC14303a interfaceC14303a, Kd0.d dVar) {
        return C43175k.G(new a(interfaceC14303a, this, null));
    }
}
