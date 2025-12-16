package com.avito.android.item_map.view;

import Zd.InterfaceC19542a;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.item_map.ItemMapFragment;
import com.avito.android.job.cv_packages.links.CvPackagesLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.util.InterfaceC35845m2;
import kotlin.Metadata;

/* compiled from: ItemMapRouter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/item_map/view/O;", "Lcom/avito/android/advert_core/advert/b;", "Lcom/avito/android/deal_confirmation/k;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class O implements com.avito.android.advert_core.advert.b, com.avito.android.deal_confirmation.k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ItemMapFragment f173484b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f173485c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19542a f173486d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deal_confirmation.sheet.j f173487e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f173488f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f173489g;

    public O(@Y61.l String str, @Y61.k ItemMapFragment itemMapFragment, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC19542a interfaceC19542a, @Y61.k com.avito.android.deal_confirmation.sheet.j jVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k com.avito.android.autoteka.data.a aVar2) {
        this.f173484b = itemMapFragment;
        this.f173485c = aVar;
        this.f173486d = interfaceC19542a;
        this.f173487e = jVar;
        this.f173488f = interfaceC35845m2;
        this.f173489g = aVar2;
        Bundle bundle = new Bundle();
        bundle.putString("key_advert_id", str);
        aVar.Qb(bundle);
    }

    @Override // com.avito.android.advert_core.advert.b
    public final void g(@Y61.l Bundle bundle, @Y61.k DeepLink deepLink, @Y61.l String str) {
        this.f173485c.r6(bundle, deepLink, str);
    }

    @Override // com.avito.android.deal_confirmation.k
    public final void j(@Y61.k String str) {
        com.avito.android.component.toast.b.c(this.f173484b, str, ToastBarPosition.f181047e, f.a.f125253a, 318);
    }

    @Override // com.avito.android.deal_confirmation.k
    public final void l(@Y61.k DealConfirmationSheet dealConfirmationSheet) {
        this.f173484b.startActivityForResult(this.f173487e.a(dealConfirmationSheet), 20);
    }

    @Override // com.avito.android.advert_core.advert.a
    public final void m(@Y61.l Parcelable parcelable, @Y61.l String str) {
        this.f173484b.startActivityForResult(this.f173486d.b(parcelable, str), 1);
    }

    @Override // com.avito.android.advert_core.advert.b
    public final void r(@Y61.k CvPackagesLink cvPackagesLink) {
        b.a.a(this.f173485c, cvPackagesLink, null, null, 6);
    }
}
