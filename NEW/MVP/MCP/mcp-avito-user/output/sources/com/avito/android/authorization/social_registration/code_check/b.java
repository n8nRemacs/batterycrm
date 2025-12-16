package com.avito.android.authorization.social_registration.code_check;

import Zd.p;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SocRegCodeCheckScenarioBuilder.kt */
@C11.a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/social_registration/code_check/b;", "Lcom/avito/android/code_check_public/e;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@com.avito.android.code_check_public.f
/* loaded from: classes11.dex */
public final class b extends com.avito.android.code_check_public.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d.b f94586b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c.b f94587c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final p f94588d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f94589e;

    @Inject
    public b(@com.avito.android.code_check_public.g @Y61.k d.b bVar, @com.avito.android.code_check_public.g @Y61.k c.b bVar2, @Y61.k p pVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f94586b = bVar;
        this.f94587c = bVar2;
        this.f94588d = pVar;
        this.f94589e = interfaceC28373a;
    }

    @Override // com.avito.android.code_check_public.e
    @Y61.k
    public final com.avito.android.code_check_public.d a() {
        CodeCheckLink.Flow.SocReg socReg = (CodeCheckLink.Flow.SocReg) b();
        return new com.avito.android.code_check_public.d(new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.d("SocRegRequest", new com.avito.android.code_check_public.screen.i(new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.c("SocRegConfirm", new com.avito.android.code_check_public.screen.i(new a.b.C3497b(null, null, null, null, null, 31, null), new a.b.C3496a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.InterfaceC3494a.C3495a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), null, 8, null), new a(this), new c.a(com.avito.android.printable_text.b.c(R.string.social_reg_code_check_code_title, new Serializable[0]), null, new c.d.b(com.avito.android.printable_text.b.c(R.string.social_reg_code_check_code_subtitle, new Serializable[0]), new com.avito.android.code_check_public.j(R.dimen.social_reg_code_check_code_subtitle_margin_top)), com.avito.android.printable_text.b.c(R.string.social_reg_code_check_code_hint, new Serializable[0]), new com.avito.android.authorization.auto_recovery.phone_confirm.b(2), com.avito.android.printable_text.b.c(R.string.social_reg_code_check_code_resend, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.social_reg_code_check_code_resend_timer, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.social_reg_code_check_code_action, new Serializable[0]), 2, null), this.f94587c, this.f94586b, null, null, 192, null), false, null, 6, null), new a.b.C3496a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.b.C3496a(null, 1, null), AppbarNavigationIcon.f119298c, null, 4, null), null, 8, null), null, this.f94586b, new d.a(com.avito.android.printable_text.b.c(R.string.social_reg_code_check_phone_number, new Serializable[0]), null, com.avito.android.printable_text.b.c(R.string.social_reg_code_check_phone_number_hint, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.social_reg_code_check_phone_number_action, new Serializable[0]), new com.avito.android.code_check_public.screen.j(new com.avito.android.advert.item.service_app_filling.info.g(socReg.f119257b, this), new com.avito.android.authorization.auto_recovery.phone_confirm.b(3)), null, null, new Ae0.c(this, 23), null, true, 354, null), null, null, 100, null), false, null, 6, null));
    }
}
