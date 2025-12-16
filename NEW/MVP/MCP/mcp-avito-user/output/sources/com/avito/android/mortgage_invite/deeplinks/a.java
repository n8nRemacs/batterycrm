package com.avito.android.mortgage_invite.deeplinks;

import Ju.AbstractC14250d;
import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationClientFormLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageApplicationClientFormDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f205808l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MortgageApplicationClientFormLink f205809m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, MortgageApplicationClientFormLink mortgageApplicationClientFormLink) {
        super(0);
        this.f205808l = bVar;
        this.f205809m = mortgageApplicationClientFormLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f205808l;
        MortgageApplicationClientFormLink mortgageApplicationClientFormLink = this.f205809m;
        bVar.f205810f.R(bVar.f205811g.b(new ApplicationClientFormArguments(mortgageApplicationClientFormLink.f205801b, mortgageApplicationClientFormLink.f205802c, mortgageApplicationClientFormLink.f205803d)), com.avito.android.deeplink_handler.view.b.f134588l);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
