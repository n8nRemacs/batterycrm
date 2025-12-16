package com.avito.android.comfortable_deal.deal.item.actions;

import Ep.InterfaceC13517a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ActionsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/actions/f;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/deal/item/actions/h;", "Lcom/avito/android/comfortable_deal/deal/item/actions/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements TV0.d<h, d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13517a, G0> f121149b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC13517a, G0> lVar) {
        this.f121149b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        hVar.h2(((d) aVar).f121147b);
        hVar.O2(new e(this));
    }
}
