package com.avito.android.developments_agency_search.adapter.checkable_item;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/checkable_item/f;", "Lcom/avito/android/developments_agency_search/adapter/checkable_item/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f136224b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super String, G0> lVar) {
        this.f136224b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f136216c);
        hVar.setChecked(aVar2.f136217d);
        hVar.a(new e(this, aVar2));
    }
}
