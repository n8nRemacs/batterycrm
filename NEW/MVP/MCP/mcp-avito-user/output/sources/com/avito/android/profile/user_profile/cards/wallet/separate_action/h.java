package com.avito.android.profile.user_profile.cards.wallet.separate_action;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SeparateWalletCardWithActionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/separate_action/h;", "Lcom/avito/android/profile/user_profile/cards/wallet/separate_action/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f225812b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f225813c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f225814d;

    /* compiled from: SeparateWalletCardWithActionItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f225815l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f225815l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f225815l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.balance);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225812b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.bonus);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f225813c = (TextView) viewFindViewById2;
        com.avito.android.lib.deprecated_design.button.c cVarA = com.avito.android.profile.user_profile.cards.d.a(view, R.id.wallet_top_up_button);
        cVarA.a(R.string.payment_wallet_page);
        this.f225814d = cVarA;
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.separate_action.g
    public final void Q(@k Y41.a<G0> aVar) {
        this.f225814d.c(new a(aVar));
    }

    @Override // Ta0.InterfaceC15347a
    public final void W40(@k String str) {
        this.f225812b.setText(str);
    }

    @Override // Ta0.InterfaceC15347a
    public final void bR(@k String str) {
        this.f225813c.setText(str);
    }
}
