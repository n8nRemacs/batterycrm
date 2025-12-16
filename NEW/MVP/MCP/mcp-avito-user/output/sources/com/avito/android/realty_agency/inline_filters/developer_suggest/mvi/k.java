package com.avito.android.realty_agency.inline_filters.developer_suggest.mvi;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import gi0.C40689d;
import gi0.InterfaceC40687b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import pi0.C47094a;

/* compiled from: DeveloperSuggestFilterReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/developer_suggest/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lgi0/b;", "Lgi0/d;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements u<InterfaceC40687b, C40689d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.inline_filters.developer_suggest.b f251557b;

    @Inject
    public k(@Y61.k com.avito.android.realty_agency.inline_filters.developer_suggest.b bVar) {
        this.f251557b = bVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40689d a(InterfaceC40687b interfaceC40687b, C40689d c40689d) throws Resources.NotFoundException {
        InterfaceC40687b interfaceC40687b2 = interfaceC40687b;
        C40689d c40689dA = c40689d;
        if (interfaceC40687b2 instanceof InterfaceC40687b.a) {
            InterfaceC40687b.a aVar = (InterfaceC40687b.a) interfaceC40687b2;
            c40689dA = C40689d.a(c40689dA, aVar.f396738a, aVar.f396739b, null, null, null, 28);
        } else if (interfaceC40687b2 instanceof InterfaceC40687b.c) {
            InterfaceC40687b.c cVar = (InterfaceC40687b.c) interfaceC40687b2;
            C47094a c47094a = cVar.f396742b;
            List<DevelopmentSuggestV1Suggest> listA = c47094a.a();
            DevelopmentSuggestV1Suggest developmentSuggestV1Suggest = c40689dA.f396746a;
            com.avito.android.realty_agency.inline_filters.developer_suggest.b bVar = this.f251557b;
            List<DevelopmentSuggestV1Suggest> list = listA;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                String string = null;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                DevelopmentSuggestV1Suggest developmentSuggestV1Suggest2 = (DevelopmentSuggestV1Suggest) obj;
                boolean z12 = developmentSuggestV1Suggest != null && L.f(developmentSuggestV1Suggest2, developmentSuggestV1Suggest);
                if (developmentSuggestV1Suggest2.getType() == DevelopmentSuggestV1Suggest.Type.Developer) {
                    string = bVar.f251516a.getString(R.string.realty_agency_inline_filters_developer_suggest_filter_developer_secondary_text);
                }
                arrayList.add(new com.avito.android.inline_filters.dialog.select.adapter.i(String.valueOf(i12), String.valueOf(developmentSuggestV1Suggest2.getId()), developmentSuggestV1Suggest2.getName(), z12, InlineItemType.f172063j, string, false, null, null, null, null, null, null, null, null, null, null, null, 262080, null));
                i12 = i13;
            }
            return C40689d.a(c40689dA, null, null, arrayList, cVar.f396741a, c47094a, 3);
        }
        return c40689dA;
    }
}
