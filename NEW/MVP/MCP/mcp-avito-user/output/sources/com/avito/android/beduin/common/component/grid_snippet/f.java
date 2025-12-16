package com.avito.android.beduin.common.component.grid_snippet;

import Cr.InterfaceC13346a;
import Ui.InterfaceC15523b;
import Y61.k;
import bj.InterfaceC25659b;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.favorite.n;
import ej.AbstractC40112a;
import ej.InterfaceC40113b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinGridSnippetComponentFactory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_snippet/f;", "Lej/b;", "Lcom/avito/android/beduin/common/component/grid_snippet/BeduinGridSnippetModel;", "Lcom/avito/android/beduin/common/component/grid_snippet/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements InterfaceC40113b<BeduinGridSnippetModel, e> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC13346a f101403a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f101404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.constructor_advert.ui.serp.constructor.b f101405c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c f101406d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final n f101407e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.constructor_advert.ui.serp.constructor.f f101408f;

    @Inject
    public f(@com.avito.android.constructor_advert.ui.serp.constructor.e @k InterfaceC13346a interfaceC13346a, @k InterfaceC25659b interfaceC25659b, @com.avito.android.constructor_advert.ui.serp.constructor.e @k com.avito.android.constructor_advert.ui.serp.constructor.b bVar, @k c cVar, @k n nVar, @com.avito.android.constructor_advert.ui.serp.constructor.e @k com.avito.android.constructor_advert.ui.serp.constructor.f fVar) {
        this.f101403a = interfaceC13346a;
        this.f101404b = interfaceC25659b;
        this.f101405c = bVar;
        this.f101406d = cVar;
        this.f101407e = nVar;
        this.f101408f = fVar;
    }

    @Override // ej.InterfaceC40113b
    public final AbstractC40112a a(BeduinModel beduinModel, lj.e eVar, InterfaceC15523b interfaceC15523b) {
        return new e(interfaceC15523b, (BeduinGridSnippetModel) beduinModel, this.f101403a, this.f101404b, this.f101405c, this.f101406d, this.f101407e, this.f101408f);
    }
}
