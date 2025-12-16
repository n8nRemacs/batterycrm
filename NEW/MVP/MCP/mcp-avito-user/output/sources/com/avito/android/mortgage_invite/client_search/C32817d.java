package com.avito.android.mortgage_invite.client_search;

import androidx.core.os.C22777e;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: MortgageClientSearchFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/model/MortgageClient;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mortgage_invite/client_search/model/MortgageClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_invite.client_search.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32817d extends N implements Y41.l<MortgageClient, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageClientSearchFragment f205364l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32817d(MortgageClientSearchFragment mortgageClientSearchFragment) {
        super(1);
        this.f205364l = mortgageClientSearchFragment;
    }

    @Override // Y41.l
    public final G0 invoke(MortgageClient mortgageClient) {
        MortgageClientSearchFragment mortgageClientSearchFragment = this.f205364l;
        mortgageClientSearchFragment.getParentFragmentManager().o0(C22777e.b(new Q("MORTGAGE_CLIENT_SEARCH_RESULT_KEY", new MortgageClientSearchResult.ClientSelected(mortgageClient))), "MORTGAGE_CLIENT_SEARCH_RESULT_KEY");
        mortgageClientSearchFragment.getParentFragmentManager().Y();
        return G0.f406611a;
    }
}
