package com.avito.android.authorization.reset_password;

import Ju.InterfaceC14249c;
import android.os.Parcelable;
import com.avito.android.authorization.reset_password.code_check.ResetPasswordCodeCheckResult;
import com.avito.android.authorization.reset_password.k;
import com.avito.android.code_check_public.CodeCheckLink;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: ResetPasswordPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f94208b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f94209c;

    public u(B b12, s sVar) {
        this.f94208b = b12;
        this.f94209c = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ResetPasswordActivity resetPasswordActivity;
        this.f94208b.a();
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
        s sVar = this.f94209c;
        if (zEquals) {
            ResetPasswordActivity resetPasswordActivity2 = sVar.f94200i;
            if (resetPasswordActivity2 != null) {
                k.a.C2792a.a(resetPasswordActivity2, null, 1);
                return;
            }
            return;
        }
        if (resetPasswordCodeCheckResult instanceof ResetPasswordCodeCheckResult.Confirmed) {
            ResetPasswordActivity resetPasswordActivity3 = sVar.f94200i;
            if (resetPasswordActivity3 != null) {
                ResetPasswordCodeCheckResult.Confirmed confirmed = (ResetPasswordCodeCheckResult.Confirmed) resetPasswordCodeCheckResult;
                resetPasswordActivity3.b2(confirmed.f94110b, confirmed.f94111c);
                return;
            }
            return;
        }
        if (!(resetPasswordCodeCheckResult instanceof ResetPasswordCodeCheckResult.NeedConfirmEmailList) || (resetPasswordActivity = sVar.f94200i) == null) {
            return;
        }
        ResetPasswordCodeCheckResult.NeedConfirmEmailList needConfirmEmailList = (ResetPasswordCodeCheckResult.NeedConfirmEmailList) resetPasswordCodeCheckResult;
        resetPasswordActivity.a2(resetPasswordActivity.f94108q, true);
        Zd.i iVar = resetPasswordActivity.f94105n;
        resetPasswordActivity.startActivity((iVar != null ? iVar : null).h(needConfirmEmailList.f94113b));
    }
}
