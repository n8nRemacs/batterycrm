package com.avito.android.suggest_addresses.domain.adapter.error;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import oA0.InterfaceC44610a;

/* compiled from: SuggestAddressesErrorPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/adapter/error/e;", "LTV0/d;", "Lcom/avito/android/suggest_addresses/domain/adapter/error/g;", "Lcom/avito/android/suggest_addresses/domain/adapter/error/c;", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC44610a, G0> f291868b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC44610a, G0> lVar) {
        this.f291868b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        gVar.TR(((c) aVar).f291865b);
        gVar.qM(new d(this));
    }
}
