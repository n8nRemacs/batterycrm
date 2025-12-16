package com.avito.android.mortgage_invite.deeplinks;

import Ju.AbstractC14250d;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationLeadLink;
import com.avito.android.mortgage_invite.lead.model.ApplicationLeadArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: MortgageApplicationLeadDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f205824l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MortgageApplicationLeadLink f205825m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, MortgageApplicationLeadLink mortgageApplicationLeadLink) {
        super(0);
        this.f205824l = jVar;
        this.f205825m = mortgageApplicationLeadLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        j jVar = this.f205824l;
        MortgageApplicationLeadLink mortgageApplicationLeadLink = this.f205825m;
        jVar.f205826f.R(jVar.f205827g.c(new ApplicationLeadArguments(mortgageApplicationLeadLink.f205806b, mortgageApplicationLeadLink.f205807c)), com.avito.android.deeplink_handler.view.b.f134588l);
        if (!L.f(mortgageApplicationLeadLink.f205806b, "virtual_deal_room")) {
            jVar.j(AbstractC14250d.c.f9171c);
        }
        return G0.f406611a;
    }
}
