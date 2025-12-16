package com.avito.android.beduin.common.component.serp_layout;

import Cr.InterfaceC13346a;
import Ui.InterfaceC15523b;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.constructor_advert.ui.serp.constructor.m;
import com.avito.android.constructor_advert.ui.serp.constructor.q;
import com.avito.android.favorite.n;
import com.avito.android.serp.adapter.n1;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SerpLayoutFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/serp_layout/i;", "Lej/b;", "Lcom/avito/android/beduin/common/component/serp_layout/SerpLayoutModel;", "Lcom/avito/android/beduin/common/component/serp_layout/d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements InterfaceC40113b<SerpLayoutModel, d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f102611a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n1 f102612b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13346a f102613c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.b f102614d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.f f102615e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final m f102616f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f102617g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f102618h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final q f102619i;

    @Inject
    public i(@Y61.k C36135w2 c36135w2, @Y61.k InterfaceC25659b interfaceC25659b, @Y61.k b bVar, @Y61.k n nVar, @Y61.k n1 n1Var, @com.avito.android.constructor_advert.ui.serp.constructor.e @Y61.k InterfaceC13346a interfaceC13346a, @com.avito.android.constructor_advert.ui.serp.constructor.e @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.b bVar2, @com.avito.android.constructor_advert.ui.serp.constructor.e @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.f fVar, @a @Y61.k m mVar) throws BlueprintCollisionException {
        this.f102611a = nVar;
        this.f102612b = n1Var;
        this.f102613c = interfaceC13346a;
        this.f102614d = bVar2;
        this.f102615e = fVar;
        this.f102616f = mVar;
        com.avito.android.constructor_advert.ui.serp.constructor.blueprint.b bVar3 = new com.avito.android.constructor_advert.ui.serp.constructor.blueprint.b(bVar, interfaceC13346a, interfaceC25659b, bVar2, null, c36135w2, null);
        com.avito.android.constructor_advert.ui.serp.constructor.blueprint.d dVar = new com.avito.android.constructor_advert.ui.serp.constructor.blueprint.d(bVar, interfaceC13346a, interfaceC25659b, bVar2, c36135w2);
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar3);
        c10493a.b(dVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f102617g = hVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVarA);
        jVar.setHasStableIds(true);
        this.f102618h = jVar;
        this.f102619i = new q(mVar);
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        com.avito.konveyor.adapter.j jVar = this.f102618h;
        return new d((SerpLayoutModel) beduinModel, this.f102615e, this.f102616f, this.f102611a, this.f102612b, this.f102617g, this.f102619i, jVar);
    }
}
