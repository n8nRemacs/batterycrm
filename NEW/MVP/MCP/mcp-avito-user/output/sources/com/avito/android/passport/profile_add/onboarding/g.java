package com.avito.android.passport.profile_add.onboarding;

import android.content.Intent;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.profile_add.onboarding.PassportOnboardingActivity;
import h60.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: PassportOnboardingActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class g extends H implements Y41.l<h60.b, G0> {
    @Override // Y41.l
    public final G0 invoke(h60.b bVar) {
        h60.b bVar2 = bVar;
        PassportOnboardingActivity passportOnboardingActivity = (PassportOnboardingActivity) this.receiver;
        PassportOnboardingActivity.a aVar = PassportOnboardingActivity.f213545v;
        passportOnboardingActivity.getClass();
        if (L.f(bVar2, b.C11243b.f397001a)) {
            InterfaceC28373a interfaceC28373a = passportOnboardingActivity.f213549p;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            String strA2 = passportOnboardingActivity.a2();
            NoMatchLink noMatchLink = new NoMatchLink();
            r60.d dVar = passportOnboardingActivity.f213553t;
            interfaceC28373a.c(new H50.b(strA2, noMatchLink, "close", (dVar != null ? dVar : null).getHash()));
            passportOnboardingActivity.finish();
        } else if (L.f(bVar2, b.c.f397002a)) {
            PassportAddProfileLink passportAddProfileLink = new PassportAddProfileLink(false);
            InterfaceC28373a interfaceC28373a2 = passportOnboardingActivity.f213549p;
            if (interfaceC28373a2 == null) {
                interfaceC28373a2 = null;
            }
            String strA22 = passportOnboardingActivity.a2();
            r60.d dVar2 = passportOnboardingActivity.f213553t;
            if (dVar2 == null) {
                dVar2 = null;
            }
            interfaceC28373a2.c(new H50.b(strA22, passportAddProfileLink, "continue", dVar2.getHash()));
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = passportOnboardingActivity.f213548o;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, passportAddProfileLink, null, null, 6);
            com.avito.android.lib.design.bottom_sheet.d dVar3 = passportOnboardingActivity.f213546m;
            if (dVar3 == null) {
                dVar3 = null;
            }
            dVar3.setOnDismissListener(null);
            com.avito.android.lib.design.bottom_sheet.d dVar4 = passportOnboardingActivity.f213546m;
            (dVar4 != null ? dVar4 : null).r();
        } else if (bVar2 instanceof b.a) {
            passportOnboardingActivity.setResult(-1, new Intent().putExtra("PassportAddProfileDialogActivity_addProfileResult", AddProfileResult.f213541c).putExtra("PassportMergeAccountsActivity_mergeSuccessText", ((b.a) bVar2).f397000a));
            passportOnboardingActivity.finish();
        } else if (L.f(bVar2, b.e.f397004a)) {
            passportOnboardingActivity.setResult(-1, new Intent().putExtra("PassportAddProfileDialogActivity_addProfileResult", AddProfileResult.f213540b));
            passportOnboardingActivity.finish();
        } else if (L.f(bVar2, b.d.f397003a)) {
            WebViewLink.OnlyAvitoDomain onlyAvitoDomain = new WebViewLink.OnlyAvitoDomain(com.avito.android.passport.profile_add.merge.a.f212382a, null, null, 6, null);
            InterfaceC28373a interfaceC28373a3 = passportOnboardingActivity.f213549p;
            if (interfaceC28373a3 == null) {
                interfaceC28373a3 = null;
            }
            String strA23 = passportOnboardingActivity.a2();
            r60.d dVar5 = passportOnboardingActivity.f213553t;
            if (dVar5 == null) {
                dVar5 = null;
            }
            interfaceC28373a3.c(new H50.b(strA23, onlyAvitoDomain, "landing", dVar5.getHash()));
            com.avito.android.deeplink_handler.handler.composite.a aVar3 = passportOnboardingActivity.f213548o;
            if (aVar3 == null) {
                aVar3 = null;
            }
            b.a.a(aVar3, onlyAvitoDomain, null, null, 6);
        }
        return G0.f406611a;
    }
}
