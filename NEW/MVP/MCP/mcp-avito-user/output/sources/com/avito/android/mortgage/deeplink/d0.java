package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PreApprovalFormDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d0 extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PreApprovalFormLink f198806l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e0 f198807m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(PreApprovalFormLink preApprovalFormLink, e0 e0Var) {
        super(0);
        this.f198806l = preApprovalFormLink;
        this.f198807m = e0Var;
    }

    @Override // Y41.a
    public final G0 invoke() {
        PreApprovalFormLink preApprovalFormLink = this.f198806l;
        PreApprovalArguments preApprovalArguments = new PreApprovalArguments(preApprovalFormLink.f198759b, preApprovalFormLink.f198760c, preApprovalFormLink.f198761d, preApprovalFormLink.f198762e, preApprovalFormLink.f198763f, preApprovalFormLink.f198764g, preApprovalFormLink.f198765h, preApprovalFormLink.f198766i, preApprovalFormLink.f198767j, preApprovalFormLink.f198768k, preApprovalFormLink.f198769l, "standart", preApprovalFormLink.f198770m);
        e0 e0Var = this.f198807m;
        e0Var.f198839f.R(e0Var.f198840g.f(preApprovalArguments), com.avito.android.deeplink_handler.view.b.f134588l);
        e0Var.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
