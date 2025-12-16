package com.avito.android.advert.item.developer.button;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import h5.InterfaceC40772a;
import kotlin.Metadata;

/* compiled from: DeveloperButtonView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/developer/button/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/developer/button/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40772a f75177b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f75178c;

    public g(@k View view, @k InterfaceC40772a interfaceC40772a) {
        super(view);
        this.f75177b = interfaceC40772a;
        this.f75178c = (Button) view;
    }

    @Override // com.avito.android.advert.item.developer.button.f
    public final void MD(@l ButtonAction buttonAction) {
        DeepLink deeplink;
        if (buttonAction == null || (deeplink = buttonAction.getDeeplink()) == null) {
            return;
        }
        String title = buttonAction.getTitle();
        Button button = this.f75178c;
        com.avito.android.lib.design.button.b.a(button, title, false);
        button.setOnClickListener(new com.avito.android.advert.closed.b(22, this, deeplink));
    }
}
