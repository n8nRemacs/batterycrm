package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.collapsed_bottom_sheet_content;

import Lw.InterfaceC14443a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.collapsed_bottom_sheet_content.c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CollapsedBottomSheetContentPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/e;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/g;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/collapsed_bottom_sheet_content/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14443a, G0> f138295b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC14443a, G0> lVar) {
        this.f138295b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c.a aVar2 = ((c) aVar).f138291b;
        if (aVar2 instanceof c.a.C4172a) {
            gVar.lj(false);
            gVar.zV(true);
            gVar.pC(((c.a.C4172a) aVar2).f138292a);
            gVar.a(new d(this));
            return;
        }
        if (aVar2 instanceof c.a.b) {
            gVar.lj(true);
            gVar.zV(false);
            gVar.pC("");
        }
    }
}
