package com.avito.android.authorization.tfa.code_check.interactor;

import To.d;
import com.avito.android.remote.model.TfaSealedCodeResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: TfaCodeCheckPhoneRequestInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/TfaSealedCodeResult;", "requestResult", "LTo/d;", "invoke", "(Lcom/avito/android/remote/model/TfaSealedCodeResult;)LTo/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j extends N implements Y41.l<TfaSealedCodeResult, To.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f94682l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(1);
        this.f94682l = str;
    }

    @Override // Y41.l
    public final To.d invoke(TfaSealedCodeResult tfaSealedCodeResult) {
        TfaSealedCodeResult tfaSealedCodeResult2 = tfaSealedCodeResult;
        if (tfaSealedCodeResult2 instanceof TfaSealedCodeResult.Ok) {
            return new d.a(this.f94682l, ((TfaSealedCodeResult.Ok) tfaSealedCodeResult2).getTimer(), 5, null, 8, null);
        }
        if (tfaSealedCodeResult2 instanceof TfaSealedCodeResult.FailedWithDialog) {
            return new d.f(new com.avito.android.code_check_public.i(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(((TfaSealedCodeResult.FailedWithDialog) tfaSealedCodeResult2).getUserDialog()), null, 2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
