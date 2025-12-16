package com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content;

import Dw.InterfaceC13445a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MainContentPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/main_content/f;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/main_content/h;", "Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/main_content/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements TV0.d<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13445a, G0> f137885b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC13445a, G0> lVar) {
        this.f137885b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.setTitle(cVar.f137879b);
        hVar.T5(cVar.f137880c);
        hVar.D2(cVar.f137882e);
        hVar.C(cVar.f137881d);
        hVar.rT(cVar.f137883f);
        hVar.zM(new e(this));
    }
}
