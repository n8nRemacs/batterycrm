package com.avito.android.services_portfolio.project.seller.ui;

import android.content.Intent;
import com.avito.android.remote.model.Image;
import gF.InterfaceC40577a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PortfolioProjectSellerFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/Image;", "images", "", "i", "Lkotlin/G0;", "invoke", "(Ljava/util/List;Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.services_portfolio.project.seller.ui.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34938b extends N implements Y41.p<List<? extends Image>, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PortfolioProjectSellerFragment f280314l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34938b(PortfolioProjectSellerFragment portfolioProjectSellerFragment) {
        super(2);
        this.f280314l = portfolioProjectSellerFragment;
    }

    @Override // Y41.p
    public final G0 invoke(List<? extends Image> list, Integer num) {
        List<? extends Image> list2 = list;
        Integer num2 = num;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        PortfolioProjectSellerFragment portfolioProjectSellerFragment = this.f280314l;
        InterfaceC40577a interfaceC40577a = portfolioProjectSellerFragment.f280300q0;
        if (interfaceC40577a == null) {
            interfaceC40577a = null;
        }
        Intent intentA = interfaceC40577a.a(iIntValue, list2);
        intentA.setFlags(603979776);
        portfolioProjectSellerFragment.startActivity(intentA);
        return G0.f406611a;
    }
}
