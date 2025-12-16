package com.avito.android.oauth.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import l40.b;
import wN.InterfaceC49541a;

/* compiled from: OAuthOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/F;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Ll40/b;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class F implements com.avito.android.arch.mvi.t<OAuthInternalAction, l40.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49541a f208271b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30751h f208272c;

    @Inject
    public F(@Y61.k InterfaceC49541a interfaceC49541a, @Y61.k InterfaceC30751h interfaceC30751h) {
        this.f208271b = interfaceC49541a;
        this.f208272c = interfaceC30751h;
    }

    @Override // com.avito.android.arch.mvi.t
    public final l40.b b(OAuthInternalAction oAuthInternalAction) {
        l40.b c11771b;
        OAuthInternalAction oAuthInternalAction2 = oAuthInternalAction;
        if (oAuthInternalAction2.equals(OAuthInternalAction.Unauthorized.f208325b)) {
            return b.c.f413471a;
        }
        if (oAuthInternalAction2.equals(OAuthInternalAction.Close.f208293b)) {
            return b.a.f413469a;
        }
        boolean zEquals = oAuthInternalAction2.equals(OAuthInternalAction.ShowTermsOfUsePage.f208321b);
        InterfaceC49541a interfaceC49541a = this.f208271b;
        if (zEquals) {
            c11771b = new b.d(interfaceC49541a.e());
        } else if (oAuthInternalAction2.equals(OAuthInternalAction.ShowPrivacyPolicyPage.f208316b)) {
            c11771b = new b.d(interfaceC49541a.a());
        } else if (oAuthInternalAction2 instanceof OAuthInternalAction.ShowAgreementPage) {
            c11771b = new b.d(this.f208272c.c("2333", null, null, null));
        } else {
            if (!(oAuthInternalAction2 instanceof OAuthInternalAction.Redirect)) {
                return null;
            }
            c11771b = new b.C11771b(((OAuthInternalAction.Redirect) oAuthInternalAction2).f208296b);
        }
        return c11771b;
    }
}
