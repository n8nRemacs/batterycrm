package com.avito.android.service_booking_common.link.onboarding;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_booking_common.link.onboarding.ServicesSteppedOnboardingLink;
import com.avito.android.service_booking_persistence.f;
import com.avito.android.services_onboarding.ServicesOnboardingTarget;
import com.avito.android.services_onboarding.i;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.disposables.c;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServicesSteppedOnboardingLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/link/onboarding/a;", "Lev/a;", "Lcom/avito/android/service_booking_common/link/onboarding/ServicesSteppedOnboardingLink;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<ServicesSteppedOnboardingLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f276643f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final i f276644g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f276645h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final f f276646i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final c f276647j = new c();

    /* compiled from: ServicesSteppedOnboardingLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.service_booking_common.link.onboarding.a$a, reason: collision with other inner class name */
    public static final class C8220a<T> implements r {
        public C8220a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k i iVar, @k a.b bVar, @k f fVar) {
        this.f276643f = interfaceC4053a;
        this.f276644g = iVar;
        this.f276645h = bVar;
        this.f276646i = fVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String str2 = ((ServicesSteppedOnboardingLink) deepLink).f276640b;
        int iA2 = this.f276646i.a(str2);
        this.f276643f.J(this.f276644g.a(new ServicesOnboardingTarget.Stepped(str2), Integer.valueOf(iA2)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f276647j.b(this.f276645h.Q().N(new C8220a()).t0(new g() { // from class: com.avito.android.service_booking_common.link.onboarding.a.b
            @Override // l41.g
            public final void accept(Object obj) {
                a.this.j(((C47918a) obj).f437156b == -1 ? ServicesSteppedOnboardingLink.c.b.f276642b : ServicesSteppedOnboardingLink.c.a.f276641b);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f276647j.e();
    }
}
