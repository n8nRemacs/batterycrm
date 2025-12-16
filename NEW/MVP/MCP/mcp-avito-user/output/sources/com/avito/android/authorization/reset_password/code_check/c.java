package com.avito.android.authorization.reset_password.code_check;

import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ResetPasswordCodeCheckScenarioBuilder.kt */
@C11.a
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/code_check/c;", "Lcom/avito/android/code_check_public/e;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@com.avito.android.code_check_public.f
/* loaded from: classes11.dex */
public final class c extends com.avito.android.code_check_public.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d.b f94115b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c.b f94116c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f94117d;

    @Inject
    public c(@com.avito.android.code_check_public.g @Y61.k d.b bVar, @com.avito.android.code_check_public.g @Y61.k c.b bVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f94115b = bVar;
        this.f94116c = bVar2;
        this.f94117d = interfaceC28373a;
    }

    @Override // com.avito.android.code_check_public.e
    @Y61.k
    public final com.avito.android.code_check_public.d a() {
        return new com.avito.android.code_check_public.d(new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.c("ResetPasswordConfirm", new com.avito.android.code_check_public.screen.i(new a.b.C3497b(null, null, null, null, null, 31, null), new a.b.C3496a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.b.C3496a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), null, 8, null), new b(this), new c.a(com.avito.android.printable_text.b.c(R.string.reset_password_code_check_title, new Serializable[0]), null, new c.d.b(com.avito.android.printable_text.b.c(R.string.reset_password_code_check_subtitle, new Serializable[0]), null, 2, null), com.avito.android.printable_text.b.c(R.string.reset_password_code_check_hint, new Serializable[0]), null, null, null, com.avito.android.printable_text.b.c(R.string.reset_password_code_check_action, new Serializable[0]), 114, null), this.f94116c, this.f94115b, null, new a(2, this, c.class, "mapDeeplinkResult", "mapDeeplinkResult(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)Lcom/avito/android/code_check_public/model/CodeConfirmResult;", 4), 64, null), false, null, 6, null));
    }
}
