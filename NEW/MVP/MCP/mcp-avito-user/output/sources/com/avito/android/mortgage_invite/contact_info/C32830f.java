package com.avito.android.mortgage_invite.contact_info;

import com.avito.android.R;
import com.avito.android.mortgage_invite.client_search.MortgageClientSearchFragment;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.mortgage_invite.contact_info.ApplicationContactInfoFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ApplicationContactInfoFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.contact_info.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32830f extends H implements Y41.l<MortgageClientSearchArguments, G0> {
    @Override // Y41.l
    public final G0 invoke(MortgageClientSearchArguments mortgageClientSearchArguments) {
        ApplicationContactInfoFragment applicationContactInfoFragment = (ApplicationContactInfoFragment) this.receiver;
        ApplicationContactInfoFragment.a aVar = ApplicationContactInfoFragment.f205577u0;
        applicationContactInfoFragment.getClass();
        MortgageClientSearchFragment.f205343r0.getClass();
        MortgageClientSearchFragment mortgageClientSearchFragmentA = MortgageClientSearchFragment.a.a(mortgageClientSearchArguments);
        androidx.fragment.app.H hE2 = applicationContactInfoFragment.getParentFragmentManager().e();
        hE2.n(R.id.container, mortgageClientSearchFragmentA, null);
        hE2.c(null);
        hE2.e();
        return G0.f406611a;
    }
}
