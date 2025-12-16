package com.avito.android.advert.item.service_app_filling.button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.SimpleAdvertAction;
import kotlin.Metadata;

/* compiled from: AdvertServiceAppFillingButtonView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/service_app_filling/button/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/service_app_filling/button/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f79793c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f79794b;

    public g(@k Button button) {
        super(button);
        this.f79794b = button;
    }

    @Override // com.avito.android.advert.item.service_app_filling.button.f
    public final void UE(@k SimpleAdvertAction simpleAdvertAction, @k com.avito.android.advert.item.service_app_filling.a aVar) {
        String title = simpleAdvertAction.getTitle();
        DeepLink deepLink = simpleAdvertAction.getDeepLink();
        Button button = this.f79794b;
        com.avito.android.lib.design.button.b.a(button, title, false);
        if (deepLink != null) {
            button.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(8, aVar, deepLink));
        }
    }
}
