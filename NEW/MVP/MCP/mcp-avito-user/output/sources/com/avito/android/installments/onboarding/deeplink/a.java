package com.avito.android.installments.onboarding.deeplink;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.ui.universal.h;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InstallmentsFormShowLink;
import com.avito.android.deep_linking.links.InstallmentsOnboardingShowLink;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kv.C43501a;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: InstallmentsOnboardingShowDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments/onboarding/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/InstallmentsOnboardingShowLink;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40161a<InstallmentsOnboardingShowLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f172826f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.b f172827g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f172828h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final h f172829i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f172830j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: InstallmentsOnboardingShowDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.installments.onboarding.deeplink.a$a, reason: collision with other inner class name */
    public static final class C5093a<T> implements r {
        public C5093a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: InstallmentsOnboardingShowDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((C47918a) obj).f437156b == -1) {
                a.this.j(InstallmentsOnboardingShowLink.b.f133396b);
            }
        }
    }

    /* compiled from: InstallmentsOnboardingShowDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((C43501a) obj).f413261b instanceof InstallmentsFormShowLink.c) {
                a aVar = a.this;
                aVar.f172826f.g1(com.avito.android.installments.onboarding.deeplink.b.f172834l);
            }
        }
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k h hVar) {
        this.f172826f = interfaceC4053a;
        this.f172827g = bVar;
        this.f172828h = aVar;
        this.f172829i = hVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        InstallmentsOnboardingShowLink installmentsOnboardingShowLink = (InstallmentsOnboardingShowLink) deepLink;
        String str2 = ScreenStyle.MODAL.f133649b;
        this.f172826f.J(this.f172829i.a(installmentsOnboardingShowLink.f133394b, null, str2, installmentsOnboardingShowLink.f133395c, null, null, null), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f172827g.Q().N(new C5093a()).t0(new b());
        io.reactivex.rxjava3.disposables.c cVar = this.f172830j;
        cVar.b(dVarT0);
        cVar.b(this.f172828h.d9().t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f172830j.e();
    }
}
