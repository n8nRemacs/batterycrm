package com.avito.android.mortgage.root.list.items.realty_object;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import f10.InterfaceC40199a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RealtyObjectPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object/e;", "LTV0/d;", "Lcom/avito/android/mortgage/root/list/items/realty_object/g;", "Lcom/avito/android/mortgage/root/list/items/realty_object/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40199a, G0> f202748b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC40199a, G0> lVar) {
        this.f202748b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        gVar.setTitle(cVar.f202742c);
        gVar.IY(cVar.f202743d);
        gVar.B0(cVar.f202744e);
        gVar.EC(cVar.f202745f != null);
        gVar.a(new d(cVar, this));
    }
}
