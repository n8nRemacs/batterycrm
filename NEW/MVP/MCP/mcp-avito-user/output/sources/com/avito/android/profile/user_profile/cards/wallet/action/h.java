package com.avito.android.profile.user_profile.cards.wallet.action;

import Y61.k;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import gr.C40723b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionWalletCardItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/action/h;", "Lcom/avito/android/profile/user_profile/cards/wallet/action/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C40723b f225633b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225634c;

    /* compiled from: ActionWalletCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225635l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f225635l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225635l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        Context context = view.getContext();
        C40723b c40723bB = com.avito.android.profile.user_profile.cards.d.b(view, R.id.balance);
        com.avito.android.profile.user_profile.cards.d.c(c40723bB, C35835l0.l(context.getDrawable(R.drawable.ic_pay_24), C35835l0.d(R.attr.gray28, context)));
        this.f225633b = c40723bB;
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.wallet_top_up_button);
        cVarA.a(R.string.payment_wallet_page);
        this.f225634c = cVarA;
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.action.g
    public final void Q(@k Y41.a<G0> aVar) {
        this.f225634c.c(new a(aVar));
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.l
    public final void y60(@k String str) {
        this.f225633b.m6(str);
    }
}
