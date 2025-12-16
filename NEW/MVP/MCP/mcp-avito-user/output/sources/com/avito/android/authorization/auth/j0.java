package com.avito.android.authorization.auth;

import com.avito.android.util.V2;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AuthView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "it", "Lkotlin/G0;", "invoke", "(Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j0 extends kotlin.jvm.internal.N implements Y41.l<VKIDGroupSubscriptionFail, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h0 f93044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h0 h0Var) {
        super(1);
        this.f93044l = h0Var;
    }

    @Override // Y41.l
    public final G0 invoke(VKIDGroupSubscriptionFail vKIDGroupSubscriptionFail) {
        V2.f318762a.b("VKGroup - fail, " + vKIDGroupSubscriptionFail.getDescription() + ')', null);
        com.jakewharton.rxrelay3.c<G0> cVar = this.f93044l.f93035m;
        G0 g02 = G0.f406611a;
        cVar.accept(g02);
        return g02;
    }
}
