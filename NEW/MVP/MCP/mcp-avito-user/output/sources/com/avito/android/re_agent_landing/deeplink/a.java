package com.avito.android.re_agent_landing.deeplink;

import Ju.AbstractC14250d;
import android.content.Intent;
import com.avito.android.re_agent_landing.landing.ReAgentProfileCreateLandingActivity;
import com.avito.android.re_agent_landing.landing.ReAgentProfileCreateLandingArgs;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReAgentProfileCreateLandingDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f250534l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ReAgentProfileCreateLandingDeeplink f250535m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ReAgentProfileCreateLandingDeeplink reAgentProfileCreateLandingDeeplink) {
        super(0);
        this.f250534l = bVar;
        this.f250535m = reAgentProfileCreateLandingDeeplink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f250534l;
        ReAgentProfileCreateLandingActivity.a aVar = ReAgentProfileCreateLandingActivity.f250554m;
        ReAgentProfileCreateLandingArgs reAgentProfileCreateLandingArgs = new ReAgentProfileCreateLandingArgs(this.f250535m.f250533b);
        aVar.getClass();
        bVar.f250537g.R(new Intent(bVar.f250539i, (Class<?>) ReAgentProfileCreateLandingActivity.class).putExtra("re_agent_profile_create_landing_arg", reAgentProfileCreateLandingArgs), com.avito.android.deeplink_handler.view.b.f134588l);
        bVar.j(AbstractC14250d.c.f9171c);
        return G0.f406611a;
    }
}
