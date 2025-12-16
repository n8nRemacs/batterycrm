package com.avito.android.mortgage_invite.client_search;

import androidx.core.os.C22777e;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: MortgageClientSearchFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_invite.client_search.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32816c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageClientSearchFragment f205363l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32816c(MortgageClientSearchFragment mortgageClientSearchFragment) {
        super(0);
        this.f205363l = mortgageClientSearchFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MortgageClientSearchFragment mortgageClientSearchFragment = this.f205363l;
        mortgageClientSearchFragment.getParentFragmentManager().o0(C22777e.b(new Q("MORTGAGE_CLIENT_SEARCH_RESULT_KEY", MortgageClientSearchResult.NewClientSelected.f205408b)), "MORTGAGE_CLIENT_SEARCH_RESULT_KEY");
        mortgageClientSearchFragment.getParentFragmentManager().Y();
        return G0.f406611a;
    }
}
