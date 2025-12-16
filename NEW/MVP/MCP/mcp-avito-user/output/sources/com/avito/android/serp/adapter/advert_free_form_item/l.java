package com.avito.android.serp.adapter.advert_free_form_item;

import androidx.compose.runtime.internal.P;
import com.avito.android.async_phone.A;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.component.serp.PhoneButtonModel;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.deep_linking.x;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.constructor.q;
import fj.InterfaceC40429a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertFreeFormItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/advert_free_form_item/l;", "Lcom/avito/android/serp/adapter/advert_free_form_item/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34863v> f268729b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.empty_placeholder.a f268730c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC28616b> f268731d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A f268732e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f268733f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final x f268734g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h31.e<q> f268735h;

    @Inject
    public l(@Y61.k h31.e<InterfaceC34863v> eVar, @Y61.k com.avito.android.serp.adapter.empty_placeholder.a aVar, @Y61.k h31.e<InterfaceC28616b> eVar2, @Y61.k A a12, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.k x xVar, @Y61.k h31.e<q> eVar3) {
        this.f268729b = eVar;
        this.f268730c = aVar;
        this.f268731d = eVar2;
        this.f268732e = a12;
        this.f268733f = interfaceC34864v0;
        this.f268734g = xVar;
        this.f268735h = eVar3;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        BeduinModel beduinModelB;
        n nVar = (n) eVar;
        ConstructorAdvertItem constructorAdvertItem = (ConstructorAdvertItem) aVar;
        List<BeduinModel> freeForm = constructorAdvertItem.getFreeForm();
        if (freeForm != null && (beduinModelB = com.avito.android.beduin_shared.model.utils.f.b(f.f268717l, freeForm)) != null) {
            InterfaceC40429a interfaceC40429a = beduinModelB instanceof InterfaceC40429a ? (InterfaceC40429a) beduinModelB : null;
            if (interfaceC40429a != null) {
                interfaceC40429a.setFavorite(constructorAdvertItem.getF268783f());
            }
            if (interfaceC40429a != null) {
                interfaceC40429a.u0(new g(this, constructorAdvertItem));
            }
        }
        nVar.c(new h(constructorAdvertItem, this, i12));
        nVar.Co(constructorAdvertItem);
        SerpConstructorAdvertItem serpConstructorAdvertItem = constructorAdvertItem instanceof SerpConstructorAdvertItem ? (SerpConstructorAdvertItem) constructorAdvertItem : null;
        if (serpConstructorAdvertItem == null) {
            return;
        }
        h31.e<InterfaceC28616b> eVar2 = this.f268731d;
        if (eVar2.get().N6()) {
            this.f268732e.n(nVar, serpConstructorAdvertItem.getF162850b());
        } else {
            eVar2.get().L6(serpConstructorAdvertItem, nVar);
        }
        List<BeduinModel> freeForm2 = serpConstructorAdvertItem.getFreeForm();
        ArrayList<BeduinModel> arrayListA = freeForm2 != null ? com.avito.android.beduin_shared.model.utils.f.a(k.f268728l, freeForm2) : null;
        if (arrayListA != null) {
            for (BeduinModel beduinModel : arrayListA) {
                PhoneButtonModel phoneButtonModel = beduinModel instanceof PhoneButtonModel ? (PhoneButtonModel) beduinModel : null;
                if (phoneButtonModel != null) {
                    phoneButtonModel.setListener(new j(serpConstructorAdvertItem, this, phoneButtonModel, nVar));
                }
            }
        }
    }
}
