package com.avito.android.tariff_lf_publication.count.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_lf_publication.count.mvi.entity.TariffLfPublicationCountInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffLfPublicationCountBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.b<TariffLfPublicationCountInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_publication.count.domain.c f300822a;

    @Inject
    public d(@Y61.k com.avito.android.tariff_lf_publication.count.domain.c cVar) {
        this.f300822a = cVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TariffLfPublicationCountInternalAction> a() {
        return this.f300822a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
