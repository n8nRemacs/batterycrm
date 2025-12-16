package com.avito.android.email.email_update.mvi;

import Fy.C13855c;
import android.text.Html;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.email.email_update.mvi.entity.EmailUpdateInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EmailUpdateReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/email/email_update/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "LFy/c;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements u<EmailUpdateInternalAction, C13855c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.email.email_update.c f147250b;

    @Inject
    public m(@Y61.k com.avito.android.email.email_update.c cVar) {
        this.f147250b = cVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C13855c a(EmailUpdateInternalAction emailUpdateInternalAction, C13855c c13855c) {
        EmailUpdateInternalAction emailUpdateInternalAction2 = emailUpdateInternalAction;
        C13855c c13855c2 = c13855c;
        boolean z12 = emailUpdateInternalAction2 instanceof EmailUpdateInternalAction.ProfileLoaded;
        com.avito.android.email.email_update.c cVar = this.f147250b;
        if (z12) {
            String email = ((EmailUpdateInternalAction.ProfileLoaded) emailUpdateInternalAction2).f147228b.getEmail();
            return new C13855c(new C13855c.b.a(email, email == null ? cVar.f147168a.getString(R.string.email_enter_message) : cVar.f147168a.getString(R.string.email_enter_new_mail), cVar.f147168a.getString(R.string.email_save_button_title), false));
        }
        if (emailUpdateInternalAction2 instanceof EmailUpdateInternalAction.ErrorLoadingProfile) {
            return new C13855c(C13855c.b.C0315b.f6102a);
        }
        boolean z13 = emailUpdateInternalAction2 instanceof EmailUpdateInternalAction.EmailUpdateFailed;
        C13855c.b bVar = c13855c2.f6097b;
        if (z13) {
            return bVar instanceof C13855c.b.a ? new C13855c(C13855c.b.a.a((C13855c.b.a) bVar, false)) : c13855c2;
        }
        if (emailUpdateInternalAction2 instanceof EmailUpdateInternalAction.EmailUpdated) {
            return new C13855c(new C13855c.b.d(Html.fromHtml(cVar.f147168a.getString(R.string.email_check_mail_for_verification_text, ((EmailUpdateInternalAction.EmailUpdated) emailUpdateInternalAction2).f147226b), 63), cVar.f147168a.getString(R.string.email_finish_flow_button_title)));
        }
        if (emailUpdateInternalAction2 instanceof EmailUpdateInternalAction.StartUpdating) {
            return bVar instanceof C13855c.b.a ? new C13855c(C13855c.b.a.a((C13855c.b.a) bVar, true)) : c13855c2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
