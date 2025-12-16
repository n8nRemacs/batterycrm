package com.avito.android.beduin.common.component.serp_layout;

import Ui.InterfaceC15523b;
import Y41.l;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.action.BeduinOpenLinkAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.constructor_advert.ui.serp.constructor.n;
import com.avito.android.constructor_advert.ui.serp.constructor.x;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.Kundle;
import fj.InterfaceC40429a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinSerpLayoutConstructorAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/component/serp_layout/b;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/x;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends x<ConstructorAdvertItem> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15523b<BeduinAction> f102583h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.d f102584i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f102585j;

    /* compiled from: BeduinSerpLayoutConstructorAdvertItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<BeduinModel, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f102586l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(BeduinModel beduinModel) {
            return Boolean.valueOf(beduinModel instanceof InterfaceC40429a);
        }
    }

    @Inject
    public b(@Y61.k C36135w2 c36135w2, @Y61.k InterfaceC28373a interfaceC28373a, @com.avito.android.beduin.common.component.serp_layout.a @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.h hVar, @com.avito.android.constructor_advert.ui.serp.constructor.e @Y61.k Kundle kundle, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k com.avito.android.advert.viewed.d dVar, @Y61.k com.avito.android.player_holder.a aVar) {
        super(c36135w2, interfaceC28373a, hVar, null, kundle, aVar);
        this.f102583h = interfaceC15523b;
        this.f102584i = dVar;
        this.f102585j = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void O(@Y61.k ConstructorAdvertItem constructorAdvertItem) {
        BeduinModel beduinModelB;
        List<BeduinModel> freeForm = constructorAdvertItem.getFreeForm();
        if (freeForm == null || (beduinModelB = com.avito.android.beduin_shared.model.utils.f.b(a.f102586l, freeForm)) == null) {
            return;
        }
        InterfaceC40429a interfaceC40429a = beduinModelB instanceof InterfaceC40429a ? (InterfaceC40429a) beduinModelB : null;
        if (interfaceC40429a != null) {
            interfaceC40429a.setFavorite(constructorAdvertItem.getF268380G());
        }
        if (interfaceC40429a == null) {
            return;
        }
        interfaceC40429a.v5(constructorAdvertItem.isRedesign());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void h0(@Y61.k n nVar, @Y61.k ConstructorAdvertItem constructorAdvertItem, int i12) {
        String string;
        DeepLink deepLink = constructorAdvertItem.getDeepLink();
        if (deepLink == null || (string = deepLink.toString()) == null) {
            return;
        }
        this.f102584i.b(constructorAdvertItem.getF83468c());
        this.f102583h.o(new BeduinOpenLinkAction(string, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void i0(@Y61.k n nVar, @Y61.k ConstructorAdvertItem constructorAdvertItem) {
        this.f102585j.dispose();
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void V(@Y61.k n nVar, @Y61.k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void k(@Y61.k n nVar, @Y61.k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void n0(@Y61.k n nVar, @Y61.k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void o0(@Y61.k n nVar, @Y61.k ConstructorAdvertItem constructorAdvertItem) {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.x
    public final void p0(@Y61.k n nVar, @Y61.k ConstructorAdvertItem constructorAdvertItem) {
    }
}
