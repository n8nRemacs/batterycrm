package com.avito.android.authorization.tfa.code_check.screen_builder;

import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.AppbarNavigationIcon;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.deep_linking.links.auth.PhoneUnavailableReasonLink;
import com.avito.android.remote.model.TfaFlow;
import com.avito.android.remote.model.TfaSource;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import re.C47640a;
import re.C47642c;

/* compiled from: TfaCodeCheckScreenBuilderForAntihack.kt */
@C11.a
@s
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/screen_builder/h;", "Lcom/avito/android/authorization/tfa/code_check/screen_builder/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.android.authorization.tfa.code_check.screen_builder.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.tfa.code_check.interactor.c f94722a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.tfa.code_check.interactor.m f94723b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.tfa.code_check.interactor.g f94724c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f94725d;

    /* compiled from: TfaCodeCheckScreenBuilderForAntihack.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.android.code_check_public.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            h.this.f94725d.c(new C47640a(TfaSource.ANTIHACK));
            return null;
        }
    }

    /* compiled from: TfaCodeCheckScreenBuilderForAntihack.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/code_check_public/a;", "invoke", "()Lcom/avito/android/code_check_public/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.code_check_public.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.code_check_public.a invoke() {
            h hVar = h.this;
            InterfaceC28373a interfaceC28373a = hVar.f94725d;
            TfaSource tfaSource = TfaSource.ANTIHACK;
            interfaceC28373a.c(new C47642c(tfaSource));
            hVar.f94725d.c(new C47640a(tfaSource));
            return null;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.authorization.tfa.code_check.interactor.c cVar, @Y61.k com.avito.android.authorization.tfa.code_check.interactor.m mVar, @Y61.k com.avito.android.authorization.tfa.code_check.interactor.g gVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f94722a = cVar;
        this.f94723b = mVar;
        this.f94724c = gVar;
        this.f94725d = interfaceC28373a;
    }

    @Override // com.avito.android.authorization.tfa.code_check.screen_builder.a
    @Y61.k
    public final a.InterfaceC3494a.d c(@Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo) {
        return a("AntihackPushConfirm", com.avito.android.printable_text.b.c(R.string.tfa_code_check_title_ah, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_push_subtitle_ah, new Serializable[0]), this.f94722a.a(TfaFlow.PUSH, loginInfo), loginInfo, this.f94725d);
    }

    @Override // com.avito.android.authorization.tfa.code_check.screen_builder.a
    @Y61.k
    public final a.InterfaceC3494a.d d(@Y61.k CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo) {
        a.InterfaceC3494a.d dVarE = e(true, new a.InterfaceC3494a.C3495a(new f(this)), new a.InterfaceC3494a.C3495a(new g(this)), loginInfo);
        l0.a aVar = new l0.a();
        a.InterfaceC3494a.d dVar = new a.InterfaceC3494a.d(new PhoneList("AntihackSmsPhonesList", new com.avito.android.code_check_public.screen.i(a.InterfaceC3494a.d.b(dVarE, new d(this, aVar), 3), new a.b.C3496a(null, 1, null), new com.avito.android.code_check_public.screen.b(new a.b.C3496a(null, 1, null), AppbarNavigationIcon.f119297b, null, 4, null), null, 8, null), null, new PhoneList.b(com.avito.android.printable_text.b.c(R.string.tfa_code_check_title_ah, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.tfa_code_check_list_empty_search_text, new Serializable[0]), new PhoneList.c.b.C3501b(8, new e(aVar)), new com.avito.android.authorization.auto_recovery.phone_confirm.b(10), com.avito.android.printable_text.b.c(R.string.tfa_code_check_list_search_hint, new Serializable[0]), null, null, null, false, 128, null), this.f94724c, null, null, 100, null), false, null, 6, null);
        a.InterfaceC3494a.d dVarB = a.InterfaceC3494a.d.b(dVar, new a(), 3);
        a.InterfaceC3494a.d dVarB2 = a.InterfaceC3494a.d.b(dVar, new b(), 3);
        a.InterfaceC3494a.d dVarE2 = e(false, new a.InterfaceC3494a.b(new PhoneUnavailableReasonLink(AutoRecoveryLink.Source.f133907d), null, 2, null), new a.InterfaceC3494a.C3495a(null, 1, null), loginInfo);
        a.InterfaceC3494a.d dVarB3 = a.InterfaceC3494a.d.b(e(true, dVarB2, new a.InterfaceC3494a.C3495a(null, 1, null), loginInfo), null, 5);
        return new a.InterfaceC3494a.d(new com.avito.android.code_check_public.screen.g("AntihackSmsPreRequest", new com.avito.android.code_check_public.screen.i(null, new a.b.C3496a(null, 1, null), null, C42756l.l0(new a.InterfaceC3494a.d[]{dVar, dVarE2, dVarB3}), 1, null), null, this.f94723b.a(dVarB, dVarE2, dVarB3), null, 20, null), false, null, 6, null);
    }

    public final a.InterfaceC3494a.d e(boolean z12, com.avito.android.code_check_public.a aVar, a.InterfaceC3494a.C3495a c3495a, CodeCheckLink.Flow.TfaCheck.LoginInfo loginInfo) {
        return com.avito.android.authorization.tfa.code_check.screen_builder.a.b(z12 ? "AntihackSmsConfirmManyPhones" : "AntihackSmsConfirm", com.avito.android.printable_text.b.c(R.string.tfa_code_check_title_ah, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_sms_subtitle_ah, new Serializable[0]), this.f94722a.a(TfaFlow.SMS, loginInfo), z12 ? new com.avito.android.code_check_public.screen.a(com.avito.android.printable_text.b.c(R.string.tfa_code_check_confirm_sms_action_another_number, new Serializable[0]), aVar) : null, c3495a, this.f94724c, this.f94725d);
    }
}
