package com.avito.android.advert.item.select.controls;

import Hr.InterfaceC14024a;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.auto_select.AutoSelectControls;
import com.avito.android.remote.model.auto_select.SelectControlsButtonParams;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoSelectControlsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/select/controls/b;", "LTV0/d;", "Lcom/avito/android/advert/item/select/controls/e;", "Lcom/avito/android/advert/item/select/controls/AutoSelectControlsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements TV0.d<e, AutoSelectControlsItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f79398b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f79399c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14024a f79400d;

    @Inject
    public b(@Y61.k @InterfaceC30174s String str, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC14024a interfaceC14024a) {
        this.f79398b = str;
        this.f79399c = aVar;
        this.f79400d = interfaceC14024a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        AutoSelectControlsItem autoSelectControlsItem = (AutoSelectControlsItem) aVar;
        AutoSelectControls autoSelectControls = autoSelectControlsItem.f79394g;
        SelectControlsButtonParams firstButton = autoSelectControls.getFirstButton();
        SelectControlsButtonParams secondButton = autoSelectControls.getSecondButton();
        eVar2.SD(new a(autoSelectControlsItem, this));
        eVar2.bP(firstButton);
        eVar2.BX(secondButton);
    }
}
