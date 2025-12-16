package com.avito.android.mortgage_invite.client_search;

import W10.a;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageClientSearchFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/model/MortgageClient;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mortgage_invite/client_search/model/MortgageClient;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_invite.client_search.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32823j extends N implements Y41.l<MortgageClient, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageClientSearchFragment f205389l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32823j(MortgageClientSearchFragment mortgageClientSearchFragment) {
        super(1);
        this.f205389l = mortgageClientSearchFragment;
    }

    @Override // Y41.l
    public final G0 invoke(MortgageClient mortgageClient) {
        ((J) this.f205389l.f205347q0.getValue()).accept(new a.e(mortgageClient));
        return G0.f406611a;
    }
}
