package com.avito.android.mortgage_invite.deeplinks;

import Ju.AbstractC14250d;
import com.avito.android.mortgage_invite.contact_info.model.ApplicationContactInfoArguments;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationContactInfoLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageApplicationContactInfoDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f205816l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MortgageApplicationContactInfoLink f205817m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, MortgageApplicationContactInfoLink mortgageApplicationContactInfoLink) {
        super(0);
        this.f205816l = fVar;
        this.f205817m = mortgageApplicationContactInfoLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f fVar = this.f205816l;
        MortgageApplicationContactInfoLink mortgageApplicationContactInfoLink = this.f205817m;
        fVar.f205818f.R(fVar.f205819g.a(new ApplicationContactInfoArguments(mortgageApplicationContactInfoLink.f205804b, mortgageApplicationContactInfoLink.f205805c)), com.avito.android.deeplink_handler.view.b.f134588l);
        fVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
