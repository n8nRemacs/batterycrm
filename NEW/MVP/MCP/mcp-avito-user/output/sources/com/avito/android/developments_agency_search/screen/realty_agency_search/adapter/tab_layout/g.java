package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout;

import Lw.InterfaceC14443a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TabLayoutItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/tab_layout/g;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/tab_layout/i;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/tab_layout/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements TV0.d<i, b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14443a, G0> f138465b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super InterfaceC14443a, G0> lVar) {
        this.f138465b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        List<a> list = bVar.f138458c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (a aVar2 : list) {
            PrintableText printableText = aVar2.f138455a.f138454b;
            Long l12 = aVar2.f138456b;
            arrayList.add(new com.avito.android.lib.design.tab_group.b(printableText, l12 != null ? new b.a.c((int) l12.longValue(), null, null, 2, null) : null, false, 4, null));
        }
        iVar.Ye(new com.avito.android.lib.design.tab_group.d(arrayList, bVar.f138459d.ordinal(), new f(this)));
    }
}
