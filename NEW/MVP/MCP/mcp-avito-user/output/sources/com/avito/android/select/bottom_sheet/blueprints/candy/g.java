package com.avito.android.select.bottom_sheet.blueprints.candy;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import dq0.InterfaceC39781c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableCandyItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/candy/g;", "Lcom/avito/android/select/bottom_sheet/blueprints/candy/e;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.l<InterfaceC39781c, G0> f265056b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.select.variant.a> f265057c = new com.jakewharton.rxrelay3.c<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@l Y41.l<? super InterfaceC39781c, G0> lVar) {
        this.f265056b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        com.avito.android.select.variant.a aVar2 = (com.avito.android.select.variant.a) aVar;
        iVar.f114858d.setText(aVar2.f266835c);
        iVar.f114860f.setEnabled(aVar2.f266847o);
        iVar.D80(aVar2.f266842j);
        iVar.E80(aVar2.f266852t, aVar2.f266839g);
        iVar.itemView.setOnClickListener(new com.avito.android.body_condition.h(iVar, new f(this, aVar2)));
    }
}
