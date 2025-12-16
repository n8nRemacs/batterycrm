package com.avito.android.profile.pro.impl.screen.item.walletandprepayment;

import D90.a;
import Y41.l;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.screen.item.walletandprepayment.ProfileProWalletAndPrepaymentItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f223560b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProfileProWalletAndPrepaymentItem f223561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f223562d;

    public /* synthetic */ g(l lVar, ProfileProWalletAndPrepaymentItem profileProWalletAndPrepaymentItem) {
        this.f223562d = lVar;
        this.f223561c = profileProWalletAndPrepaymentItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DeepLink deepLink;
        l lVar = this.f223562d;
        ProfileProWalletAndPrepaymentItem profileProWalletAndPrepaymentItem = this.f223561c;
        switch (this.f223560b) {
            case 0:
                int i12 = h.f223563j;
                ProfileProWalletAndPrepaymentItem.Wallet wallet = profileProWalletAndPrepaymentItem.f223544c;
                lVar.invoke(new a.z(wallet != null ? wallet.f223553e : null));
                break;
            default:
                int i13 = h.f223563j;
                ProfileProWalletAndPrepaymentItem.Prepayment prepayment = profileProWalletAndPrepaymentItem.f223545d;
                if (prepayment != null && (deepLink = prepayment.f223549e) != null) {
                    lVar.invoke(new a.h(deepLink));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g(ProfileProWalletAndPrepaymentItem profileProWalletAndPrepaymentItem, l lVar) {
        this.f223561c = profileProWalletAndPrepaymentItem;
        this.f223562d = lVar;
    }
}
