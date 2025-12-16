package com.avito.android.mortgage_invite.client_form;

import com.avito.android.R;
import com.avito.android.mortgage_invite.client_form.ApplicationClientFormFragment;
import com.avito.android.mortgage_invite.client_search.MortgageClientSearchFragment;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ApplicationClientFormFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.client_form.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32791c extends kotlin.jvm.internal.H implements Y41.l<MortgageClientSearchArguments, G0> {
    @Override // Y41.l
    public final G0 invoke(MortgageClientSearchArguments mortgageClientSearchArguments) {
        ApplicationClientFormFragment applicationClientFormFragment = (ApplicationClientFormFragment) this.receiver;
        ApplicationClientFormFragment.a aVar = ApplicationClientFormFragment.f205015t0;
        applicationClientFormFragment.getClass();
        MortgageClientSearchFragment.f205343r0.getClass();
        MortgageClientSearchFragment mortgageClientSearchFragmentA = MortgageClientSearchFragment.a.a(mortgageClientSearchArguments);
        androidx.fragment.app.H hE2 = applicationClientFormFragment.getParentFragmentManager().e();
        hE2.n(R.id.container, mortgageClientSearchFragmentA, null);
        hE2.c(null);
        hE2.e();
        return G0.f406611a;
    }
}
