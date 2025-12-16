package com.avito.android.autoteka.items.purchaseViaPackage;

import Hf.InterfaceC13983a;
import Y41.l;
import com.adjust.sdk.Constants;
import com.avito.android.autoteka.items.choosingProduct.ChoosingTypePurchaseState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.autoteka.model.AutotekaAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PurchaseViaPackagePresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChoosingTypePurchaseState.PurchaseViaPackageState f96925l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f96926m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ChoosingTypePurchaseState.PurchaseViaPackageState purchaseViaPackageState, e eVar) {
        super(1);
        this.f96925l = purchaseViaPackageState;
        this.f96926m = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        AutotekaAction autotekaAction = this.f96925l.f96700f;
        e eVar = this.f96926m;
        if (autotekaAction == null) {
            eVar.f96928b.invoke(InterfaceC13983a.C0429a.f7567a);
        } else if (deepLink2 != null) {
            eVar.f96928b.invoke(new InterfaceC13983a.f(deepLink2));
        }
        return G0.f406611a;
    }
}
