package com.avito.android.developments_agency_search.screen.shared;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.H0;
import kotlin.collections.I0;
import kotlin.collections.J0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentsAgencySearchConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/shared/b;", "Lcom/avito/android/developments_agency_search/screen/shared/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SearchParamsConverter f139040a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f139041b;

    @Inject
    public b(@k SearchParamsConverter searchParamsConverter, @k e eVar) {
        this.f139040a = searchParamsConverter;
        this.f139041b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.developments_agency_search.screen.shared.a
    @k
    public final LinkedHashMap a(@k List list) {
        I0 i0S0 = C42745f0.S0(list);
        int iF2 = P0.f(C42745f0.q(i0S0, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = i0S0.iterator();
        while (true) {
            J0 j02 = (J0) it;
            if (!j02.f406646b.hasNext()) {
                return linkedHashMap;
            }
            H0 h02 = (H0) j02.next();
            linkedHashMap.put(r.t(new StringBuilder("district["), h02.f406643a, ']'), (String) h02.f406644b);
        }
    }

    @Override // com.avito.android.developments_agency_search.screen.shared.a
    @k
    public final Map<String, String> b(@k SearchParams searchParams) {
        return SearchParamsConverter.DefaultImpls.convertToMap$default(this.f139040a, searchParams, this.f139041b, false, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.developments_agency_search.screen.shared.a
    @k
    public final LinkedHashMap c(@k List list) {
        I0 i0S0 = C42745f0.S0(list);
        int iF2 = P0.f(C42745f0.q(i0S0, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator it = i0S0.iterator();
        while (true) {
            J0 j02 = (J0) it;
            if (!j02.f406646b.hasNext()) {
                return linkedHashMap;
            }
            H0 h02 = (H0) j02.next();
            linkedHashMap.put(r.t(new StringBuilder("metro["), h02.f406643a, ']'), (String) h02.f406644b);
        }
    }
}
