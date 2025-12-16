package com.avito.android.developments_agency_search.adapter.horizontal_list;

import Y61.l;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HorizontalListItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/horizontal_list/g;", "Lcom/avito/android/developments_agency_search/adapter/horizontal_list/e;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f136305b;

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.E5(aVar2.f136293c);
        iVar.wB(aVar2.f136294d, aVar2.f136295e);
        iVar.lX(aVar2.f136296f);
        iVar.hm(aVar2.f136297g);
        iVar.qc(new f(aVar2, this));
    }

    @Override // com.avito.android.developments_agency_search.adapter.horizontal_list.e
    public final void qc(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f136305b = lVar;
    }
}
