package com.avito.android.authorization.auto_recovery.phone_confirm;

import ae.C19873a;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Y1;

/* compiled from: AutoRecoveryCodeCheckScenarioBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/phone_confirm/c;", "Lcom/avito/android/code_check_public/e;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends com.avito.android.code_check_public.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d.b f93208b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d.b f93209c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c.b f93210d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y1<To.d> f93211e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f93212f;

    /* compiled from: AutoRecoveryCodeCheckScenarioBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/code_check_public/model/Phone;", "phone", "Lkotlin/G0;", "invoke-597-hdM", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Phone, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Phone phone) {
            Phone phone2 = phone;
            String str = phone2 != null ? phone2.f119296b : null;
            if ((str != null ? Phone.a(str) : null) == null) {
                throw new IllegalArgumentException("Phone must be set for AutoRecoveryCodeCheckScenarioBuilder!");
            }
            c.this.f93212f.c(new C19873a(Phone.b(str), CodeConfirmationSource.f92762j));
            return G0.f406611a;
        }
    }

    @Inject
    public c(@s @Y61.k d.b bVar, @s @Y61.k d.b bVar2, @com.avito.android.code_check_public.g @Y61.k c.b bVar3, @com.avito.android.code_check_public.g @Y61.k Y1<To.d> y12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f93208b = bVar;
        this.f93209c = bVar2;
        this.f93210d = bVar3;
        this.f93211e = y12;
        this.f93212f = interfaceC28373a;
    }

    @Override // com.avito.android.code_check_public.e
    @Y61.k
    public final com.avito.android.code_check_public.d a() {
        com.avito.android.code_check_public.screen.i iVar = new com.avito.android.code_check_public.screen.i(new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.c("AutoRecoveryConfirm", new com.avito.android.code_check_public.screen.i(new a.b.C3497b(null, null, null, null, null, 31, null), new a.InterfaceC3494a.C3495a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.InterfaceC3494a.C3495a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), null, 8, null), new a(), new c.a(com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_code_title, new Serializable[0]), null, new c.d.b(com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_code_subtitle, new Serializable[0]), new com.avito.android.advert.item.delivery_suggests.l(27)), com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_code_hint, new Serializable[0]), new com.avito.android.advert.item.delivery_suggests.l(24), com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_code_resend, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_code_resend_timer, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_code_action, new Serializable[0]), 2, null), this.f93210d, this.f93209c, null, null, 192, null), false, null, 6, null), new a.b.C3497b(null, null, null, null, null, 31, null), new com.avito.android.code_check_public.screen.b(new a.b.C3497b(null, null, null, null, null, 31, null), AppbarNavigationIcon.f119298c, null, 4, null), null, 8, null);
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_phone_title, new Serializable[0]);
        PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_phone_input_hint, new Serializable[0]);
        PrintableText printableTextC3 = com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_phone_primary_action, new Serializable[0]);
        com.avito.android.code_check_public.screen.j jVar = new com.avito.android.code_check_public.screen.j(new b(0), new com.avito.android.advert.item.delivery_suggests.l(29));
        return new com.avito.android.code_check_public.d(new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.d("AutoRecoveryRequest", iVar, null, this.f93208b, new d.a(printableTextC, new com.avito.android.code_check_public.screen.j(new com.avito.android.advert.item.delivery_suggests.l(26), new com.avito.android.advert.item.delivery_suggests.l(25)), printableTextC2, printableTextC3, jVar, null, new com.avito.android.advert.item.delivery_suggests.l(28), null, com.avito.android.printable_text.b.c(R.string.auto_recovery_code_check_phone_second_action, new Serializable[0]), false, 160, null), C43175k.a(this.f93211e), null, 68, null), false, null, 6, null));
    }
}
