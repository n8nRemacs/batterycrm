package com.avito.android.serp.adapter.constructor;

import androidx.compose.runtime.internal.P;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.component.serp.BuyWithDeliveryButtonModel;
import com.avito.android.beduin_shared.model.component.serp.PhoneButtonModel;
import com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.di.module.X2;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.InterfaceC34864v0;
import com.avito.android.serp.adapter.p1;
import com.avito.android.util.Kundle;
import fj.InterfaceC40429a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sN0.InterfaceC48080b;

/* compiled from: ConstructorAdvertItemPresenterImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/o;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/x;", "Lcom/avito/android/serp/adapter/constructor/SerpConstructorAdvertItem;", "Lcom/avito/android/serp/adapter/constructor/A;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o extends com.avito.android.constructor_advert.ui.serp.constructor.x<SerpConstructorAdvertItem> implements A {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34863v> f269516h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final h31.e<q> f269517i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.empty_placeholder.a f269518j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC28616b> f269519k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.async_phone.A f269520l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f269521m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34864v0 f269522n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.buy_with_delivery.a> f269523o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final E f269524p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.video_snippets.g f269525q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48080b f269526r;

    public /* synthetic */ o(h31.e eVar, h31.e eVar2, com.avito.android.serp.adapter.empty_placeholder.a aVar, C36135w2 c36135w2, InterfaceC28373a interfaceC28373a, com.avito.android.constructor_advert.ui.serp.constructor.h hVar, h31.e eVar3, com.avito.android.async_phone.A a12, com.avito.android.deep_linking.x xVar, p1 p1Var, InterfaceC34864v0 interfaceC34864v0, h31.e eVar4, E e12, Kundle kundle, com.avito.android.player_holder.a aVar2, com.avito.android.video_snippets.g gVar, InterfaceC48080b interfaceC48080b, int i12, C42822w c42822w) {
        this(eVar, eVar2, aVar, c36135w2, interfaceC28373a, hVar, eVar3, a12, xVar, (i12 & 512) != 0 ? null : p1Var, interfaceC34864v0, eVar4, e12, kundle, aVar2, gVar, interfaceC48080b);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void O(ConstructorAdvertItem constructorAdvertItem) {
        BeduinModel beduinModelB;
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) constructorAdvertItem;
        List<BeduinModel> freeForm = serpConstructorAdvertItem.getFreeForm();
        if (freeForm == null || (beduinModelB = com.avito.android.beduin_shared.model.utils.f.b(C34709a.f269460l, freeForm)) == null) {
            return;
        }
        InterfaceC40429a interfaceC40429a = beduinModelB instanceof InterfaceC40429a ? (InterfaceC40429a) beduinModelB : null;
        if (interfaceC40429a != null) {
            interfaceC40429a.setFavorite(serpConstructorAdvertItem.getF156394F());
        }
        if (interfaceC40429a != null) {
            interfaceC40429a.v5(serpConstructorAdvertItem.isRedesign());
        }
        if (interfaceC40429a == null) {
            return;
        }
        interfaceC40429a.u0(new C34710b(this, serpConstructorAdvertItem));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void V(com.avito.android.constructor_advert.ui.serp.constructor.n nVar, ConstructorAdvertItem constructorAdvertItem) {
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) constructorAdvertItem;
        h31.e<InterfaceC28616b> eVar = this.f269519k;
        if (eVar.get().N6()) {
            this.f269520l.n(nVar, serpConstructorAdvertItem.getF84108c());
        } else {
            eVar.get().L6(serpConstructorAdvertItem, nVar);
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    /* renamed from: Y */
    public final void g2(com.avito.android.constructor_advert.ui.serp.constructor.n nVar, ConstructorAdvertItem constructorAdvertItem, int i12, List list) {
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) constructorAdvertItem;
        nVar.D1(new C34711c(this, serpConstructorAdvertItem), C34712d.f269465l);
        super.g2(nVar, serpConstructorAdvertItem, i12, list);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x, TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        com.avito.android.constructor_advert.ui.serp.constructor.n nVar = (com.avito.android.constructor_advert.ui.serp.constructor.n) eVar;
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) aVar;
        nVar.D1(new C34711c(this, serpConstructorAdvertItem), C34712d.f269465l);
        super.g2(nVar, serpConstructorAdvertItem, i12, list);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void h0(com.avito.android.constructor_advert.ui.serp.constructor.n nVar, ConstructorAdvertItem constructorAdvertItem, int i12) {
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) constructorAdvertItem;
        AdvertItem advertItemA = this.f269518j.a(serpConstructorAdvertItem);
        if (advertItemA != null) {
            InterfaceC34863v interfaceC34863v = this.f269516h.get();
            List<DimmedImage> imageList = serpConstructorAdvertItem.getImageList();
            interfaceC34863v.k5(advertItemA, ImageKt.toSingleImage(nVar.O(com.avito.android.image_loader.b.a(imageList != null ? (DimmedImage) C42745f0.G(imageList) : null))));
            Y41.l<String, G0> itemClickListener = serpConstructorAdvertItem.getItemClickListener();
            if (itemClickListener != null) {
                itemClickListener.invoke(serpConstructorAdvertItem.getF84108c());
            }
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void i0(com.avito.android.constructor_advert.ui.serp.constructor.n nVar, ConstructorAdvertItem constructorAdvertItem) {
        BeduinModel beduinModelB;
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) constructorAdvertItem;
        com.avito.android.video_snippets.g gVar = this.f269525q;
        if (gVar != null) {
            gVar.c(serpConstructorAdvertItem.getF84108c());
        }
        List<BeduinModel> freeForm = serpConstructorAdvertItem.getFreeForm();
        if (freeForm != null && (beduinModelB = com.avito.android.beduin_shared.model.utils.f.b(C34713e.f269466l, freeForm)) != null) {
            InterfaceC40429a interfaceC40429a = beduinModelB instanceof InterfaceC40429a ? (InterfaceC40429a) beduinModelB : null;
            if (interfaceC40429a != null) {
                interfaceC40429a.u0(null);
            }
        }
        List<BeduinModel> freeForm2 = serpConstructorAdvertItem.getFreeForm();
        if (freeForm2 != null) {
            Iterator it = com.avito.android.beduin_shared.model.utils.f.a(C34714f.f269467l, freeForm2).iterator();
            while (it.hasNext()) {
                BeduinModel beduinModel = (BeduinModel) it.next();
                PhoneButtonModel phoneButtonModel = beduinModel instanceof PhoneButtonModel ? (PhoneButtonModel) beduinModel : null;
                if (phoneButtonModel != null) {
                    phoneButtonModel.setListener(null);
                }
            }
        }
        List<BeduinModel> freeForm3 = serpConstructorAdvertItem.getFreeForm();
        if (freeForm3 != null) {
            Iterator it2 = com.avito.android.beduin_shared.model.utils.f.a(C34715g.f269468l, freeForm3).iterator();
            while (it2.hasNext()) {
                BeduinModel beduinModel2 = (BeduinModel) it2.next();
                BuyWithDeliveryButtonModel buyWithDeliveryButtonModel = beduinModel2 instanceof BuyWithDeliveryButtonModel ? (BuyWithDeliveryButtonModel) beduinModel2 : null;
                if (buyWithDeliveryButtonModel != null) {
                    buyWithDeliveryButtonModel.setListener(null);
                }
            }
        }
        h31.e<InterfaceC28616b> eVar = this.f269519k;
        if (eVar.get().N6()) {
            this.f269520l.p(nVar, serpConstructorAdvertItem.getF84108c());
        } else {
            eVar.get().M6(serpConstructorAdvertItem);
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void k(com.avito.android.constructor_advert.ui.serp.constructor.n nVar, ConstructorAdvertItem constructorAdvertItem) {
        this.f269523o.get().a((SerpConstructorAdvertItem) constructorAdvertItem, nVar);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void n0(com.avito.android.constructor_advert.ui.serp.constructor.n nVar, ConstructorAdvertItem constructorAdvertItem) {
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) constructorAdvertItem;
        List<BeduinModel> freeForm = serpConstructorAdvertItem.getFreeForm();
        ArrayList<BeduinModel> arrayListA = freeForm != null ? com.avito.android.beduin_shared.model.utils.f.a(j.f269491l, freeForm) : null;
        if (arrayListA != null) {
            for (BeduinModel beduinModel : arrayListA) {
                this.f269524p.d(serpConstructorAdvertItem.getDisplayType());
                PhoneButtonModel phoneButtonModel = beduinModel instanceof PhoneButtonModel ? (PhoneButtonModel) beduinModel : null;
                if (phoneButtonModel != null) {
                    phoneButtonModel.setListener(new i(this, serpConstructorAdvertItem, phoneButtonModel, nVar));
                }
            }
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void o0(com.avito.android.constructor_advert.ui.serp.constructor.n nVar, ConstructorAdvertItem constructorAdvertItem) {
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) constructorAdvertItem;
        List<BeduinModel> freeForm = serpConstructorAdvertItem.getFreeForm();
        ArrayList<BeduinModel> arrayListA = freeForm != null ? com.avito.android.beduin_shared.model.utils.f.a(l.f269496l, freeForm) : null;
        if (arrayListA != null) {
            for (BeduinModel beduinModel : arrayListA) {
                this.f269524p.a(serpConstructorAdvertItem.getDisplayType());
                BuyWithDeliveryButtonModel buyWithDeliveryButtonModel = beduinModel instanceof BuyWithDeliveryButtonModel ? (BuyWithDeliveryButtonModel) beduinModel : null;
                if (buyWithDeliveryButtonModel != null) {
                    buyWithDeliveryButtonModel.setListener(new k(this, serpConstructorAdvertItem, buyWithDeliveryButtonModel, nVar));
                }
            }
        }
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void p0(com.avito.android.constructor_advert.ui.serp.constructor.n nVar, ConstructorAdvertItem constructorAdvertItem) {
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) constructorAdvertItem;
        List<BeduinModel> freeForm = serpConstructorAdvertItem.getFreeForm();
        ArrayList<BeduinModel> arrayListA = freeForm != null ? com.avito.android.beduin_shared.model.utils.f.a(n.f269515l, freeForm) : null;
        if (arrayListA != null) {
            for (BeduinModel beduinModel : arrayListA) {
                ServiceOrderButtonModel serviceOrderButtonModel = beduinModel instanceof ServiceOrderButtonModel ? (ServiceOrderButtonModel) beduinModel : null;
                if (serviceOrderButtonModel != null) {
                    serviceOrderButtonModel.setListener(new m(serpConstructorAdvertItem, serviceOrderButtonModel, this, nVar));
                }
            }
        }
    }

    @Inject
    public o(@Y61.k h31.e<InterfaceC34863v> eVar, @Y61.k h31.e<q> eVar2, @Y61.k com.avito.android.serp.adapter.empty_placeholder.a aVar, @Y61.k C36135w2 c36135w2, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.h hVar, @Y61.k h31.e<InterfaceC28616b> eVar3, @Y61.k com.avito.android.async_phone.A a12, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.l p1 p1Var, @Y61.k InterfaceC34864v0 interfaceC34864v0, @Y61.k h31.e<com.avito.android.buy_with_delivery.a> eVar4, @Y61.k E e12, @Y61.l @X2 Kundle kundle, @Y61.k com.avito.android.player_holder.a aVar2, @Y61.l com.avito.android.video_snippets.g gVar, @Y61.k InterfaceC48080b interfaceC48080b) {
        super(c36135w2, interfaceC28373a, hVar, p1Var, kundle, aVar2);
        this.f269516h = eVar;
        this.f269517i = eVar2;
        this.f269518j = aVar;
        this.f269519k = eVar3;
        this.f269520l = a12;
        this.f269521m = xVar;
        this.f269522n = interfaceC34864v0;
        this.f269523o = eVar4;
        this.f269524p = e12;
        this.f269525q = gVar;
        this.f269526r = interfaceC48080b;
    }
}
