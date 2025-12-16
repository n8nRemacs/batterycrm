package com.avito.android.mortgage.sign.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage.sign.mvi.entity.SignInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import o10.InterfaceC44505c;

/* compiled from: SignOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/sign/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage/sign/mvi/entity/SignInternalAction;", "Lo10/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements t<SignInternalAction, InterfaceC44505c> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44505c b(SignInternalAction signInternalAction) {
        SignInternalAction signInternalAction2 = signInternalAction;
        if (signInternalAction2.equals(SignInternalAction.SignCleared.f203781b)) {
            return InterfaceC44505c.a.f419301a;
        }
        if (signInternalAction2.equals(SignInternalAction.SvgFileCreationFailure.f203782b)) {
            return new InterfaceC44505c.b(com.avito.android.printable_text.b.c(R.string.file_creation_error, new Serializable[0]));
        }
        if (signInternalAction2.equals(SignInternalAction.EmptySvgCreated.f203776b)) {
            return new InterfaceC44505c.b(com.avito.android.printable_text.b.c(R.string.svg_creation_error, new Serializable[0]));
        }
        if (signInternalAction2 instanceof SignInternalAction.SvgFileUploadingError) {
            return new InterfaceC44505c.b(com.avito.android.printable_text.b.f(((SignInternalAction.SvgFileUploadingError) signInternalAction2).f203784b.getMessage()));
        }
        if (signInternalAction2 instanceof SignInternalAction.SvgFileUploadingEnded) {
            return InterfaceC44505c.C12157c.f419303a;
        }
        return null;
    }
}
