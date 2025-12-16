package com.avito.android.authorization.start_registration.code_check;

import Y41.l;
import Y61.k;
import Zd.p;
import ae.C19873a;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.code_check_public.screen.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.V2;
import he.n;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RegistrationCodeCheckScenarioBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/start_registration/code_check/a;", "Lcom/avito/android/code_check_public/e;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends com.avito.android.code_check_public.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d.b f94611b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c.b f94612c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f94613d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f94614e;

    /* compiled from: RegistrationCodeCheckScenarioBuilder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.authorization.start_registration.code_check.a$a, reason: collision with other inner class name */
    public static final class C2807a extends N implements Y41.a<com.avito.android.code_check_public.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2807a f94615l = new C2807a();

        public C2807a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            V2.f318762a.b("back logged", null);
            return null;
        }
    }

    /* compiled from: RegistrationCodeCheckScenarioBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/code_check_public/model/Phone;", "it", "Lkotlin/G0;", "invoke-597-hdM", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Phone, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Phone phone) {
            Phone phone2 = phone;
            String str = phone2 != null ? phone2.f119296b : null;
            if ((str != null ? Phone.a(str) : null) == null) {
                throw new IllegalArgumentException("Phone must be set for RegistrationCodeCheckScenarioBuilder!");
            }
            a.this.f94614e.c(new C19873a(str, CodeConfirmationSource.f92758f));
            return G0.f406611a;
        }
    }

    /* compiled from: RegistrationCodeCheckScenarioBuilder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/code_check_public/model/Phone;", "it", "Lkotlin/G0;", "invoke-597-hdM", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Phone, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Phone phone) {
            a.this.f94614e.c(new n());
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k d.b bVar, @k c.b bVar2, @k p pVar, @k InterfaceC28373a interfaceC28373a) {
        this.f94611b = bVar;
        this.f94612c = bVar2;
        this.f94613d = pVar;
        this.f94614e = interfaceC28373a;
    }

    @Override // com.avito.android.code_check_public.e
    @k
    public final com.avito.android.code_check_public.d a() {
        i iVar = new i(new a.b.C3497b(null, null, null, null, null, 31, null), new a.InterfaceC3494a.C3495a(C2807a.f94615l), new com.avito.android.code_check_public.screen.b(new a.InterfaceC3494a.C3495a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), null, 8, null);
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.registration_code_resend_timer, new Serializable[0]);
        return new com.avito.android.code_check_public.d(new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.d("RegRequest", new i(new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.c("RegConfirm", iVar, new b(), new c.a(com.avito.android.printable_text.b.c(R.string.registration_code_title, new Serializable[0]), null, null, com.avito.android.printable_text.b.c(R.string.registration_code_input_hint, new Serializable[0]), new com.avito.android.authorization.auto_recovery.phone_confirm.b(4), null, printableTextC, com.avito.android.printable_text.b.c(R.string.registration_code_action, new Serializable[0]), 38, null), this.f94612c, this.f94611b, null, null, 192, null), false, null, 6, null), new a.b.C3496a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.b.C3496a(null, 1, null), AppbarNavigationIcon.f119298c, null, 4, null), null, 8, null), new c(), this.f94611b, new d.a(com.avito.android.printable_text.b.c(R.string.registration_code_request, new Serializable[0]), null, com.avito.android.printable_text.b.c(R.string.registration_phone_hint, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.registration_phone_action, new Serializable[0]), null, com.avito.android.printable_text.b.c(R.string.registration_phone_subtitle, new Serializable[0]), new com.avito.android.authorization.auto_recovery.phone_confirm.b(5), new Ae0.c(this, 24), null, false, 786, null), null, null, 96, null), false, null, 6, null));
    }
}
