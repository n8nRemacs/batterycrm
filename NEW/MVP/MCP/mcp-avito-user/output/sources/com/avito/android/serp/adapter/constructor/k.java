package com.avito.android.serp.adapter.constructor;

import android.net.Uri;
import com.avito.android.beduin_shared.model.component.serp.BuyWithDeliveryButtonModel;
import com.avito.android.constructor_advert.ui.serp.constructor.BuyWithDeliveryLoadingState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorAdvertItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f269492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BuyWithDeliveryButtonModel f269494n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.constructor_advert.ui.serp.constructor.n f269495o;

    /* compiled from: ConstructorAdvertItemPresenterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BuyWithDeliveryLoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BuyWithDeliveryLoadingState buyWithDeliveryLoadingState = BuyWithDeliveryLoadingState.f125735b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, SerpConstructorAdvertItem serpConstructorAdvertItem, BuyWithDeliveryButtonModel buyWithDeliveryButtonModel, com.avito.android.constructor_advert.ui.serp.constructor.n nVar) {
        super(0);
        this.f269492l = oVar;
        this.f269493m = serpConstructorAdvertItem;
        this.f269494n = buyWithDeliveryButtonModel;
        this.f269495o = nVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        o oVar = this.f269492l;
        E e12 = oVar.f269524p;
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269493m;
        e12.c(serpConstructorAdvertItem.getDisplayType());
        if (serpConstructorAdvertItem.getBuyWithDeliveryLoadingState().ordinal() == 0) {
            String strFindDeeplinkAsString = this.f269494n.findDeeplinkAsString();
            if (strFindDeeplinkAsString == null) {
                strFindDeeplinkAsString = "";
            }
            oVar.f269523o.get().b(oVar.f269521m.e(Uri.parse(strFindDeeplinkAsString)), serpConstructorAdvertItem, this.f269495o);
        }
        return G0.f406611a;
    }
}
