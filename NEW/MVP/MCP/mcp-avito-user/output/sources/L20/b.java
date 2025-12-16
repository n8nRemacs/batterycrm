package l20;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.MortgageInviteActivity;
import com.avito.android.mortgage_invite.MortgageInviteFragmentParams;
import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import com.avito.android.mortgage_invite.contact_info.model.ApplicationContactInfoArguments;
import com.avito.android.mortgage_invite.lead.model.ApplicationLeadArguments;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageInviteIntentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll20/b;", "Ll20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements InterfaceC43530a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f413410a;

    @Inject
    public b(@k Context context) {
        this.f413410a = context;
    }

    @Override // l20.InterfaceC43530a
    @k
    public final Intent a(@k ApplicationContactInfoArguments applicationContactInfoArguments) {
        MortgageInviteFragmentParams.ContactInfo contactInfo = new MortgageInviteFragmentParams.ContactInfo(applicationContactInfoArguments);
        MortgageInviteActivity.f205009m.getClass();
        Intent intent = new Intent(this.f413410a, (Class<?>) MortgageInviteActivity.class);
        intent.putExtra("FRAGMENT_PARAMS", contactInfo);
        return intent;
    }

    @Override // l20.InterfaceC43530a
    @k
    public final Intent b(@k ApplicationClientFormArguments applicationClientFormArguments) {
        MortgageInviteFragmentParams.ClientForm clientForm = new MortgageInviteFragmentParams.ClientForm(applicationClientFormArguments);
        MortgageInviteActivity.f205009m.getClass();
        Intent intent = new Intent(this.f413410a, (Class<?>) MortgageInviteActivity.class);
        intent.putExtra("FRAGMENT_PARAMS", clientForm);
        return intent;
    }

    @Override // l20.InterfaceC43530a
    @k
    public final Intent c(@k ApplicationLeadArguments applicationLeadArguments) {
        MortgageInviteFragmentParams.ApplicationLead applicationLead = new MortgageInviteFragmentParams.ApplicationLead(applicationLeadArguments);
        MortgageInviteActivity.f205009m.getClass();
        Intent intent = new Intent(this.f413410a, (Class<?>) MortgageInviteActivity.class);
        intent.putExtra("FRAGMENT_PARAMS", applicationLead);
        return intent;
    }
}
