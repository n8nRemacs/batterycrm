package com.avito.android.passport.profile_add.create.business_vrf_duplication.deeplink_handling;

import Ju.AbstractC14250d;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.deeplinks.PassportCreationBusinessVrfLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PassportCreationBusinessVrfLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create/business_vrf_duplication/deeplink_handling/a;", "Lev/a;", "Lcom/avito/android/passport/deeplinks/PassportCreationBusinessVrfLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends AbstractC40161a<PassportCreationBusinessVrfLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final E50.a f211222f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f211223g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f211224h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f211225i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PassportCreationBusinessVrfLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.passport.profile_add.create.business_vrf_duplication.deeplink_handling.a$a, reason: collision with other inner class name */
    public static final class C6311a<T> implements r {
        public C6311a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: PassportCreationBusinessVrfLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            a aVar = a.this;
            Bundle bundleB = aVar.b();
            if (L.f(bundleB != null ? Boolean.valueOf(bundleB.getBoolean("passport_creation_business_vrf_result_after_screen_close_args")) : null, Boolean.TRUE)) {
                aVar.j(c47918a.f437156b == -1 ? PassportCreationBusinessVrfLink.b.C6309b.f211121b : PassportCreationBusinessVrfLink.b.a.f211120b);
            }
        }
    }

    @Inject
    public a(@k E50.a aVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f211222f = aVar;
        this.f211223g = interfaceC4053a;
        this.f211224h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PassportCreationBusinessVrfLink passportCreationBusinessVrfLink = (PassportCreationBusinessVrfLink) deepLink;
        Boolean boolValueOf = bundle != null ? Boolean.valueOf(bundle.getBoolean("passport_creation_business_vrf_result_after_screen_close_args")) : null;
        this.f211223g.J(this.f211222f.b(passportCreationBusinessVrfLink.f211119b), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
        if (L.f(boolValueOf, Boolean.TRUE)) {
            return;
        }
        j(AbstractC14250d.c.f9171c);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f211225i.b(this.f211224h.Q().N(new C6311a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f211225i.e();
    }
}
