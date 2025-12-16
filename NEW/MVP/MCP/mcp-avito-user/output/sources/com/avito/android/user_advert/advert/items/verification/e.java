package com.avito.android.user_advert.advert.items.verification;

import com.avito.android.remote.model.SupportButton;
import com.avito.android.remote.model.VerificationButton;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VerificationBlockItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/verification/e;", "Lcom/avito/android/user_advert/advert/items/verification/b;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f310387b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f310388c;

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f310387b = aVar;
    }

    @Override // com.avito.android.user_advert.advert.items.verification.b
    public final void I1(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310388c = myAdvertDetailsActivity;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        k kVar = (k) eVar;
        a aVar2 = (a) aVar;
        kVar.setVisible(true);
        kVar.R1(aVar2.f310374c);
        kVar.r2(aVar2.f310375d);
        G0 g03 = null;
        VerificationButton verificationButton = aVar2.f310377f;
        if (verificationButton != null) {
            kVar.LA(verificationButton.getText(), new c(this, aVar2));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            kVar.L1();
        }
        SupportButton supportButton = aVar2.f310378g;
        if (supportButton != null) {
            kVar.Hj(supportButton.getText(), new d(this, aVar2));
            g03 = G0.f406611a;
        }
        if (g03 == null) {
            kVar.P30();
        }
        kVar.Op(aVar2.f310376e);
        kVar.lN(aVar2.f310379h);
    }

    @Override // com.avito.android.user_advert.advert.items.verification.b
    public final void c0() {
        this.f310388c = null;
    }
}
