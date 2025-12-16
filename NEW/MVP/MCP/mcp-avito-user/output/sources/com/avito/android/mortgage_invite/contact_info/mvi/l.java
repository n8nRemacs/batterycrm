package com.avito.android.mortgage_invite.contact_info.mvi;

import androidx.compose.runtime.internal.P;
import b20.c;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage_invite.contact_info.mvi.entity.ApplicationContactInfoInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ApplicationContactInfoOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/contact_info/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage_invite/contact_info/mvi/entity/ApplicationContactInfoInternalAction;", "Lb20/c;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l implements t<ApplicationContactInfoInternalAction, b20.c> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final b20.c b(ApplicationContactInfoInternalAction applicationContactInfoInternalAction) {
        ApplicationContactInfoInternalAction applicationContactInfoInternalAction2 = applicationContactInfoInternalAction;
        if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.Back) {
            return c.b.f56838a;
        }
        if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.CreateApplicationLoadingFailed) {
            return new c.d(com.avito.android.printable_text.b.c(R.string.contact_info_create_application_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.contact_info_create_application_error_action, new Serializable[0]));
        }
        if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.CreateApplicationLoadingCompleted) {
            ApplicationContactInfoInternalAction.CreateApplicationLoadingCompleted createApplicationLoadingCompleted = (ApplicationContactInfoInternalAction.CreateApplicationLoadingCompleted) applicationContactInfoInternalAction2;
            String str = createApplicationLoadingCompleted.f205703b;
            return str == null ? new c.d(com.avito.android.printable_text.b.c(R.string.contact_info_create_application_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.contact_info_create_application_error_action, new Serializable[0])) : new c.a(str, createApplicationLoadingCompleted.f205704c);
        }
        if (applicationContactInfoInternalAction2 instanceof ApplicationContactInfoInternalAction.OpenClientSearch) {
            return new c.C1987c(((ApplicationContactInfoInternalAction.OpenClientSearch) applicationContactInfoInternalAction2).f205714b);
        }
        return null;
    }
}
