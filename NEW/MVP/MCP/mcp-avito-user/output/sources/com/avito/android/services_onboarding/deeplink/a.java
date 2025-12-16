package com.avito.android.services_onboarding.deeplink;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ServicesCpxOnboardingLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.services_onboarding.ServicesOnboardingActivity;
import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.disposables.c;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServicesCpxOnboardingLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_onboarding/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/ServicesCpxOnboardingLink;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<ServicesCpxOnboardingLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f279811f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Context f279812g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f279813h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final c f279814i = new c();

    /* compiled from: ServicesCpxOnboardingLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.services_onboarding.deeplink.a$a, reason: collision with other inner class name */
    public static final class C8321a<T> implements r {
        public C8321a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    @Inject
    public a(@k Context context, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f279811f = interfaceC4053a;
        this.f279812g = context;
        this.f279813h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServicesOnboardingActivity.a aVar = ServicesOnboardingActivity.f279768m;
        ServicesOnboardingTarget.Cpx cpx = new ServicesOnboardingTarget.Cpx(((ServicesCpxOnboardingLink) deepLink).getCpxContext());
        aVar.getClass();
        this.f279811f.J(new Intent(this.f279812g, (Class<?>) ServicesOnboardingActivity.class).putExtra("services_onboarding_target_extra_key", cpx).putExtra("services_onboarding_step_extra_key", (Serializable) null), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f279814i.b(this.f279813h.Q().N(new C8321a()).t0(new g() { // from class: com.avito.android.services_onboarding.deeplink.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                a.this.j(((C47918a) obj).f437156b == -1 ? ServicesCpxOnboardingLink.c.b.f133655b : ServicesCpxOnboardingLink.c.a.f133654b);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f279814i.e();
    }
}
