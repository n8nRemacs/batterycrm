package com.avito.android.authorization.login;

import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.authorization.AuthSource;
import com.avito.android.authorization.reset_password.code_check.ResetPasswordCodeCheckResult;
import com.avito.android.code_check_public.CodeCheckLink;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: LoginPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class G<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f93961b;

    public G(u uVar) {
        this.f93961b = uVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LoginActivity loginActivity;
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        CodeCheckLink.b.C3493b c3493b = interfaceC14249c instanceof CodeCheckLink.b.C3493b ? (CodeCheckLink.b.C3493b) interfaceC14249c : null;
        if (c3493b == null) {
            return;
        }
        Parcelable parcelable = c3493b.f119267b;
        ResetPasswordCodeCheckResult resetPasswordCodeCheckResult = parcelable instanceof ResetPasswordCodeCheckResult ? (ResetPasswordCodeCheckResult) parcelable : null;
        if (resetPasswordCodeCheckResult == null) {
            return;
        }
        boolean zEquals = resetPasswordCodeCheckResult.equals(ResetPasswordCodeCheckResult.CancelByAutoRecovery.f94109b);
        u uVar = this.f93961b;
        if (zEquals) {
            LoginActivity loginActivity2 = uVar.f94061A;
            if (loginActivity2 != null) {
                loginActivity2.b2(false);
                return;
            }
            return;
        }
        if (!(resetPasswordCodeCheckResult instanceof ResetPasswordCodeCheckResult.Confirmed)) {
            if (!(resetPasswordCodeCheckResult instanceof ResetPasswordCodeCheckResult.NeedConfirmEmailList) || (loginActivity = uVar.f94061A) == null) {
                return;
            }
            ResetPasswordCodeCheckResult.NeedConfirmEmailList needConfirmEmailList = (ResetPasswordCodeCheckResult.NeedConfirmEmailList) resetPasswordCodeCheckResult;
            loginActivity.b2(true);
            Zd.i iVar = loginActivity.f93983r;
            loginActivity.startActivity((iVar != null ? iVar : null).h(needConfirmEmailList.f94113b));
            return;
        }
        LoginActivity loginActivity3 = uVar.f94061A;
        if (loginActivity3 != null) {
            ResetPasswordCodeCheckResult.Confirmed confirmed = (ResetPasswordCodeCheckResult.Confirmed) resetPasswordCodeCheckResult;
            Zd.i iVar2 = loginActivity3.f93983r;
            Zd.i iVar3 = iVar2 != null ? iVar2 : null;
            AuthSource authSource = AuthSource.f92694c;
            Intent intentB = iVar3.b(confirmed.f94110b, confirmed.f94111c, "restore_auth");
            intentB.setFlags(603979776);
            loginActivity3.startActivity(intentB);
        }
    }
}
