package com.avito.android.authorization.tfa.code_check.screen_builder;

import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.code_confirmation.code_confirmation.Z;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.deep_linking.links.auth.PhoneUnavailableReasonLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.TfaFlow;
import com.avito.android.remote.model.TfaSource;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import re.C47640a;
import re.C47642c;

/* compiled from: TfaCodeCheckScreenBuilderForTfa.kt */
@C11.a
@s
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/screen_builder/p;", "Lcom/avito/android/authorization/tfa/code_check/screen_builder/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p extends com.avito.android.authorization.tfa.code_check.screen_builder.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.tfa.code_check.interactor.c f94739a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.tfa.code_check.interactor.m f94740b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.tfa.code_check.interactor.g f94741c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f94742d;

    /* compiled from: TfaCodeCheckScreenBuilderForTfa.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.code_check_public.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            p.this.f94742d.c(new C47640a(TfaSource.TFA));
            return null;
        }
    }

    /* compiled from: TfaCodeCheckScreenBuilderForTfa.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.code_check_public.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            p pVar = p.this;
            InterfaceC28373a interfaceC28373a = pVar.f94742d;
            TfaSource tfaSource = TfaSource.TFA;
            interfaceC28373a.c(new C47642c(tfaSource));
            pVar.f94742d.c(new C47640a(tfaSource));
            return null;
        }
    }

    @Inject
    public p(@Y61.k com.avito.android.authorization.tfa.code_check.interactor.c cVar, @Y61.k com.avito.android.authorization.tfa.code_check.interactor.m mVar, @Y61.k com.avito.android.authorization.tfa.code_check.interactor.g gVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f94739a = cVar;
        this.f94740b = mVar;
        this.f94741c = gVar;
        this.f94742d = interfaceC28373a;
    }

    @Override // com.avito.android.authorization.tfa.code_check.screen_builder.a
    @Y61.k
    public final a.InterfaceC3494a.d c(@Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo) {
        return a("TfaPushConfirm", com.avito.android.printable_text.b.c(R.string.tfa_code_check_title_tfa, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_push_subtitle_tfa, new Serializable[0]), this.f94739a.a(TfaFlow.PUSH, loginInfo), loginInfo, this.f94742d);
    }

    @Override // com.avito.android.authorization.tfa.code_check.screen_builder.a
    @Y61.k
    public final a.InterfaceC3494a.d d(@Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo) {
        AutoRecoveryLink.Source source;
        a.InterfaceC3494a.d dVarE = e(true, new a.InterfaceC3494a.C3495a(new n(this)), new a.InterfaceC3494a.C3495a(new o(this)), loginInfo);
        l0.a aVar = new l0.a();
        com.avito.android.code_check_public.screen.i iVar = new com.avito.android.code_check_public.screen.i(a.InterfaceC3494a.d.b(dVarE, new k(this, aVar), 3), new a.b.C3496a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.b.C3496a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), null, 8, null);
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.tfa_code_check_title_tfa, new Serializable[0]);
        PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.tfa_code_check_list_empty_search_text, new Serializable[0]);
        com.avito.android.authorization.auto_recovery.phone_confirm.b bVar = new com.avito.android.authorization.auto_recovery.phone_confirm.b(11);
        PhoneList.c.b.C3501b c3501b = new PhoneList.c.b.C3501b(8, new l(aVar));
        PrintableText printableTextC3 = com.avito.android.printable_text.b.c(R.string.tfa_code_check_list_search_hint, new Serializable[0]);
        PrintableText printableTextC4 = com.avito.android.printable_text.b.c(R.string.tfa_code_check_list_no_phone, new Serializable[0]);
        int i12 = Z.a.f119484a[TfaSource.TFA.ordinal()];
        if (i12 == 1) {
            source = AutoRecoveryLink.Source.f133907d;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source = AutoRecoveryLink.Source.f133906c;
        }
        a.InterfaceC3494a.d dVar = new a.InterfaceC3494a.d(new PhoneList("TfaSmsPhonesList", iVar, null, new PhoneList.b(printableTextC, printableTextC2, c3501b, bVar, printableTextC3, null, new PhoneList.a(printableTextC4, new a.b.C3497b(null, null, null, new AutoRecoveryLink(source.f133910b, AutoRecoveryLink.Scenario.f133899c, false, 4, null), new m(this, aVar), 7, null), null), null, false, 128, null), this.f94741c, null, null, 100, null), false, null, 6, null);
        a.InterfaceC3494a.d dVarB = a.InterfaceC3494a.d.b(dVar, new a(), 3);
        a.InterfaceC3494a.d dVarB2 = a.InterfaceC3494a.d.b(dVar, new b(), 3);
        a.InterfaceC3494a.d dVarE2 = e(false, new a.InterfaceC3494a.b(new PhoneUnavailableReasonLink(AutoRecoveryLink.Source.f133906c), null, 2, null), new a.InterfaceC3494a.C3495a(null, 1, null), loginInfo);
        a.InterfaceC3494a.d dVarB3 = a.InterfaceC3494a.d.b(e(true, dVarB2, new a.InterfaceC3494a.C3495a(null, 1, null), loginInfo), null, 5);
        return new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.g("TfaSmsPreRequest", new com.avito.android.code_check_public.screen.i(null, new a.b.C3496a(null, 1, null), null, C42756l.l0(new a.InterfaceC3494a.d[]{dVar, dVarE2, dVarB3}), 1, null), null, this.f94740b.a(dVarB, dVarE2, dVarB3), null, 20, null), false, null, 6, null);
    }

    public final a.InterfaceC3494a.d e(boolean z12, com.avito.android.code_check_public.a aVar, a.InterfaceC3494a.C3495a c3495a, CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo) {
        return com.avito.android.authorization.tfa.code_check.screen_builder.a.b(z12 ? "TfaSmsConfirmManyPhones" : "TfaSmsConfirm", com.avito.android.printable_text.b.c(R.string.tfa_code_check_title_tfa, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_sms_subtitle_tfa, new Serializable[0]), this.f94739a.a(TfaFlow.SMS, loginInfo), new com.avito.android.code_check_public.screen.a(z12 ? com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_sms_action_another_number, new Serializable[0]) : com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_sms_action_phone_unavailable, new Serializable[0]), aVar), c3495a, this.f94741c, this.f94742d);
    }
}
