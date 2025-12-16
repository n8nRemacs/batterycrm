package com.avito.android.publish.screen.objects.domain;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.screen.objects.domain.e;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import com.avito.android.publish.view.a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.select.Arguments;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectParams;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ObjectFillFormItemsClicksInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/j;", "Lcom/avito/android/publish/view/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class j implements a.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<ObjectFillFormInternalAction, G0> f240005b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@k l<? super ObjectFillFormInternalAction, G0> lVar) {
        this.f240005b = lVar;
    }

    @Override // com.avito.android.publish.view.a.b
    public final void K2(@k DeepLink deepLink, @Y61.l Bundle bundle) {
        ((e.a) this.f240005b).invoke(new ObjectFillFormInternalAction.OpenDeepLink(deepLink));
    }

    @Override // com.avito.android.details.j.b
    public final void O2(@k AutoEarlyAccessSelectParams autoEarlyAccessSelectParams) {
        ((e.a) this.f240005b).invoke(new ObjectFillFormInternalAction.ShowAutoEarlyAccessSelectScreen(autoEarlyAccessSelectParams));
    }

    @Override // com.avito.android.details.j.b
    public final void R1(@k Arguments arguments) {
        ((e.a) this.f240005b).invoke(new ObjectFillFormInternalAction.ShowSelectScreen(arguments));
    }

    @Override // com.avito.android.publish.view.m.a
    public final void g4(@k AddressParameter addressParameter, boolean z12) {
        ((e.a) this.f240005b).invoke(new ObjectFillFormInternalAction.ShowLocationPicker(addressParameter, z12));
    }

    @Override // com.avito.android.details.j.b
    public final void t3(@k com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar) {
        ((e.a) this.f240005b).invoke(new ObjectFillFormInternalAction.ShowSelectorCardGroupBottomSheet(kVar));
    }
}
