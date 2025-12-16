package com.avito.android.authorization.auth.auth_socials;

import be.InterfaceC25636c;
import com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AuthSocialsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/r;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction;", "Lbe/c;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements com.avito.android.arch.mvi.t<AuthSocialsInternalAction, InterfaceC25636c> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC25636c b(AuthSocialsInternalAction authSocialsInternalAction) {
        InterfaceC25636c bVar;
        AuthSocialsInternalAction authSocialsInternalAction2 = authSocialsInternalAction;
        if (authSocialsInternalAction2 instanceof AuthSocialsInternalAction.AuthSocialsLoaded ? true : authSocialsInternalAction2 instanceof AuthSocialsInternalAction.StartAuthSocialsLoading) {
            return null;
        }
        if (authSocialsInternalAction2 instanceof AuthSocialsInternalAction.OpenSocial) {
            bVar = new InterfaceC25636c.a(((AuthSocialsInternalAction.OpenSocial) authSocialsInternalAction2).f92897b);
        } else {
            if (!(authSocialsInternalAction2 instanceof AuthSocialsInternalAction.ShowUserDialog)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new InterfaceC25636c.b(((AuthSocialsInternalAction.ShowUserDialog) authSocialsInternalAction2).f92898b);
        }
        return bVar;
    }
}
