package com.avito.android.comfortable_deal.deal.item.responsibleagent.has_agent;

import Ap.C13065a;
import Ep.InterfaceC13517a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ResponsibleAgentPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/responsibleagent/has_agent/d;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/deal/item/responsibleagent/has_agent/f;", "LAp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<f, Ap.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13517a, G0> f121456b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f121457c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC13517a, G0> lVar, @N3.c @k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f121456b = lVar;
        this.f121457c = interfaceC35945t1;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        Ap.b bVar = (Ap.b) aVar;
        C13065a c13065a = bVar.f629b;
        if (c13065a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        fVar.h1(c13065a.f626b);
        fVar.J(c13065a.f627c);
        fVar.q5(this.f121457c.a(c13065a.f628d));
        fVar.JJ(bVar.f630c);
        fVar.oA(new c(this, bVar));
    }
}
