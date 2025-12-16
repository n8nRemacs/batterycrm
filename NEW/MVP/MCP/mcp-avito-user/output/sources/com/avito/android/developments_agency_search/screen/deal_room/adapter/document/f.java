package com.avito.android.developments_agency_search.screen.deal_room.adapter.document;

import Cw.InterfaceC13362a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.developments_agency_search.screen.deal_room.adapter.document.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: DocumentItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/document/f;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/document/h;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/document/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13362a, G0> f137366b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC13362a, G0> lVar) {
        this.f137366b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer numValueOf;
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setOpacity(aVar2.f137350i);
        hVar.setTitle(aVar2.f137345d);
        hVar.h(aVar2.f137346e);
        hVar.a(new d(this, aVar2));
        a.b bVar = aVar2.f137349h;
        if (bVar instanceof a.b.d) {
            numValueOf = Integer.valueOf(R.attr.ic_share20);
        } else if (bVar instanceof a.b.C4147b) {
            numValueOf = null;
        } else if (bVar instanceof a.b.c) {
            numValueOf = Integer.valueOf(R.attr.ic_deleteOutline20);
        } else {
            if (!(bVar instanceof a.b.C4146a)) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(R.attr.ic_arrowRight20);
        }
        hVar.ib(numValueOf);
        hVar.uu(L.f(bVar, a.b.C4147b.f137355a));
        hVar.JO(new e(this, aVar2));
    }
}
