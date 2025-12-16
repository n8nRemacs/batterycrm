package com.avito.android.mortgage_invite.client_search.di;

import Y61.k;
import c20.InterfaceC26928e;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.mortgage_invite.client_search.MortgageClientSearchFragment;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import h31.d;
import kotlin.Metadata;

/* compiled from: MortgageClientSearchComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/di/b;", "", "a", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: MortgageClientSearchComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/di/b$a;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@k InterfaceC26928e interfaceC26928e, @h31.b @k MortgageClientSearchArguments mortgageClientSearchArguments, @h31.b @k C28478k c28478k);
    }

    void a(@k MortgageClientSearchFragment mortgageClientSearchFragment);
}
