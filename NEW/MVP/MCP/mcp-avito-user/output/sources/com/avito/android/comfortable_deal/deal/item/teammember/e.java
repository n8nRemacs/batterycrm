package com.avito.android.comfortable_deal.deal.item.teammember;

import Ep.InterfaceC13517a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.TeamMemberPhone;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TeamMemberPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/teammember/e;", "LTV0/d;", "Lcom/avito/android/comfortable_deal/deal/item/teammember/g;", "Lcom/avito/android/comfortable_deal/deal/item/teammember/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements TV0.d<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13517a, G0> f121544b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f121545c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC13517a, G0> lVar, @N3.c @k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f121544b = lVar;
        this.f121545c = interfaceC35945t1;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        gVar.h1(cVar.f121539c);
        gVar.J(cVar.f121540d);
        TeamMemberPhone teamMemberPhone = cVar.f121541e;
        String number = teamMemberPhone.getNumber();
        if (number == null || number.length() == 0) {
            gVar.y50();
        } else {
            gVar.q5(this.f121545c.a(teamMemberPhone.getNumber()));
        }
        gVar.Um(new d(this, cVar));
    }
}
