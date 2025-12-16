package com.avito.android.oauth.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import j40.C42193c;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l40.InterfaceC43542a;
import l40.c;

/* compiled from: OAuthReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/H;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Ll40/c;", "<init>", "()V", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class H implements com.avito.android.arch.mvi.u<OAuthInternalAction, l40.c> {
    @Inject
    public H() {
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final l40.c a(OAuthInternalAction oAuthInternalAction, l40.c cVar) {
        C42193c c42193c;
        Object next;
        OAuthInternalAction oAuthInternalAction2 = oAuthInternalAction;
        l40.c cVar2 = cVar;
        if (oAuthInternalAction2 instanceof OAuthInternalAction.ShowShortForm) {
            OAuthInternalAction.ShowShortForm showShortForm = (OAuthInternalAction.ShowShortForm) oAuthInternalAction2;
            return new c.g(showShortForm.f208318b, showShortForm.f208319c, showShortForm.f208320d, false, false, false, 56, null);
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.ShowExtendedForm) {
            OAuthInternalAction.ShowExtendedForm showExtendedForm = (OAuthInternalAction.ShowExtendedForm) oAuthInternalAction2;
            List<C42193c> list = showExtendedForm.f208306e;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C42193c) next).getId() != null) {
                        break;
                    }
                }
                c42193c = (C42193c) next;
            } else {
                c42193c = null;
            }
            String str = showExtendedForm.f208307f;
            String str2 = str == null ? "" : str;
            String str3 = showExtendedForm.f208308g;
            return new c.b(showExtendedForm.f208303b, new c.C11772c(str2, false, str3 == null, str3 == null ? "" : str3, c42193c != null ? c42193c.getId() : null), showExtendedForm.f208304c, showExtendedForm.f208305d, false, showExtendedForm.f208306e, null, false, false, null, null, 2000, null);
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.ShowErrorAccessDeclined) {
            return new c.d(R.string.oauth_improve_account_error_title, R.string.oauth_improve_account_error_subtitle, R.string.oauth_improve_account_error_button_text, InterfaceC43542a.f.f413454a, false, R.drawable.placeholders_img_unknown_error);
        }
        if (oAuthInternalAction2.equals(OAuthInternalAction.ShowScopeDialog.f208317b)) {
            return cVar2 instanceof c.g ? c.g.a((c.g) cVar2, true, false, 55) : cVar2;
        }
        if (oAuthInternalAction2.equals(OAuthInternalAction.CloseScopeDialog.f208294b)) {
            return cVar2 instanceof c.g ? c.g.a((c.g) cVar2, false, false, 55) : cVar2;
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.ChoosePermissionType) {
            if (!(cVar2 instanceof c.b)) {
                return cVar2;
            }
            c.b bVar = (c.b) cVar2;
            return c.b.a(bVar, c.C11772c.a(bVar.f413476e, null, null, Long.valueOf(((OAuthInternalAction.ChoosePermissionType) oAuthInternalAction2).f208292b), 15), null, false, null, null, 2045);
        }
        if (oAuthInternalAction2.equals(OAuthInternalAction.Close.f208293b) || oAuthInternalAction2.equals(OAuthInternalAction.Restart.f208297b)) {
            return cVar2;
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.SaveFio) {
            if (!(cVar2 instanceof c.b)) {
                return cVar2;
            }
            c.b bVar2 = (c.b) cVar2;
            c.C11772c c11772c = bVar2.f413476e;
            String str4 = ((OAuthInternalAction.SaveFio) oAuthInternalAction2).f208298b;
            return c.b.a(bVar2, c.C11772c.a(c11772c, str4, null, null, 30), null, false, str4.length() <= 0 ? bVar2.f413484m : null, null, 1533);
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.SavePhone) {
            if (!(cVar2 instanceof c.b)) {
                return cVar2;
            }
            c.b bVar3 = (c.b) cVar2;
            return c.b.a(bVar3, c.C11772c.a(bVar3.f413476e, null, "7".concat(C43066x.a0(((OAuthInternalAction.SavePhone) oAuthInternalAction2).f208299b, " ", "", false)), null, 27), null, false, null, null, 1021);
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.ShowNetworkError) {
            return new c.d(R.string.oauth_unknown_error_title, R.string.oauth_unknown_error_subtitle, R.string.oauth_unknown_error_button_text, ((OAuthInternalAction.ShowNetworkError) oAuthInternalAction2).f208311b, false, 0, 32, null);
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.ShowUnexpectedError) {
            return new c.d(R.string.oauth_unknown_error_title, R.string.oauth_unknown_error_subtitle, R.string.oauth_unknown_error_button_text, ((OAuthInternalAction.ShowUnexpectedError) oAuthInternalAction2).f208322b, false, 0, 32, null);
        }
        if (oAuthInternalAction2.equals(OAuthInternalAction.HidePermissionTypeHint.f208295b)) {
            return cVar2 instanceof c.b ? c.b.a((c.b) cVar2, null, null, false, null, null, 1983) : cVar2;
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.ShowPermissionTypeHint) {
            if (!(cVar2 instanceof c.b)) {
                return cVar2;
            }
            OAuthInternalAction.ShowPermissionTypeHint showPermissionTypeHint = (OAuthInternalAction.ShowPermissionTypeHint) oAuthInternalAction2;
            return c.b.a((c.b) cVar2, null, new c.f(showPermissionTypeHint.f208314b, showPermissionTypeHint.f208315c), false, null, null, 1983);
        }
        if (oAuthInternalAction2.equals(OAuthInternalAction.Unauthorized.f208325b) || (oAuthInternalAction2 instanceof OAuthInternalAction.ShowAgreementPage)) {
            return cVar2;
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.Redirect) {
            return cVar2 instanceof c.b ? c.b.a((c.b) cVar2, null, null, false, null, null, 1919) : cVar2 instanceof c.g ? c.g.a((c.g) cVar2, false, false, 47) : cVar2;
        }
        if (oAuthInternalAction2.equals(OAuthInternalAction.ShowPrivacyPolicyPage.f208316b) || oAuthInternalAction2.equals(OAuthInternalAction.ShowTermsOfUsePage.f208321b)) {
            return cVar2;
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.ShowFormErrors) {
            if (!(cVar2 instanceof c.b)) {
                return cVar2;
            }
            OAuthInternalAction.ShowFormErrors showFormErrors = (OAuthInternalAction.ShowFormErrors) oAuthInternalAction2;
            return c.b.a((c.b) cVar2, null, null, false, showFormErrors.f208309b ? Integer.valueOf(R.string.oauth_extended_form_empty_fio_error) : null, showFormErrors.f208310c ? Integer.valueOf(R.string.oauth_extended_form_wrong_phone_error) : null, 511);
        }
        if (oAuthInternalAction2 instanceof OAuthInternalAction.SetSubmitButtonLoading) {
            return cVar2 instanceof c.g ? c.g.a((c.g) cVar2, false, ((OAuthInternalAction.SetSubmitButtonLoading) oAuthInternalAction2).f208301b, 47) : cVar2 instanceof c.b ? c.b.a((c.b) cVar2, null, null, ((OAuthInternalAction.SetSubmitButtonLoading) oAuthInternalAction2).f208301b, null, null, 1919) : cVar2;
        }
        if (!(oAuthInternalAction2 instanceof OAuthInternalAction.SetRetryButtonLoading)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(cVar2 instanceof c.d)) {
            return cVar2;
        }
        c.d dVar = (c.d) cVar2;
        return new c.d(dVar.f413491d, dVar.f413492e, dVar.f413493f, dVar.f413494g, ((OAuthInternalAction.SetRetryButtonLoading) oAuthInternalAction2).f208300b, dVar.f413496i);
    }
}
