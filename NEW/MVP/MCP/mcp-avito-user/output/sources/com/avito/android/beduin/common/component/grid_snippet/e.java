package com.avito.android.beduin.common.component.grid_snippet;

import Cr.InterfaceC13346a;
import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bj.InterfaceC25659b;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItemViewImpl;
import com.avito.android.constructor_advert.ui.serp.constructor.z;
import com.avito.android.favorite.n;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.SerpDisplayType;
import fj.InterfaceC40429a;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: BeduinGridSnippetComponent.kt */
@hw.g
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_snippet/e;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/grid_snippet/BeduinGridSnippetModel;", "Landroid/view/View;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends com.avito.android.beduin.common.component.h<BeduinGridSnippetModel, View> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f101389m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final Class<? extends BeduinModel> f101390n = BeduinGridSnippetModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101391e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinGridSnippetModel f101392f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC13346a f101393g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC25659b f101394h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.constructor_advert.ui.serp.constructor.b f101395i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.component.grid_snippet.c f101396j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final n f101397k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final ConstructorAdvertItem f101398l;

    /* compiled from: BeduinGridSnippetComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_snippet/e$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return e.f101390n;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return Collections.singletonList("gridSnippet");
        }

        public a() {
        }
    }

    /* compiled from: BeduinGridSnippetComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/beduin_models/BeduinModel;", "invoke", "(Lcom/avito/android/beduin_models/BeduinModel;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.l<BeduinModel, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f101399l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(BeduinModel beduinModel) {
            return Boolean.valueOf(beduinModel instanceof InterfaceC40429a);
        }
    }

    /* compiled from: BeduinGridSnippetComponent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ConstructorAdvertItem f101401m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BeduinGridSnippetModel f101402n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ConstructorAdvertItem constructorAdvertItem, BeduinGridSnippetModel beduinGridSnippetModel) {
            super(1);
            this.f101401m = constructorAdvertItem;
            this.f101402n = beduinGridSnippetModel;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            bool.getClass();
            e eVar = e.this;
            eVar.f101397k.Ld(this.f101401m, null);
            com.avito.android.beduin_shared.model.utils.a.a(eVar.f101391e, this.f101402n.getOnFavoriteTapActions());
            return G0.f406611a;
        }
    }

    public e(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinGridSnippetModel beduinGridSnippetModel, @k InterfaceC13346a interfaceC13346a, @k InterfaceC25659b interfaceC25659b, @k com.avito.android.constructor_advert.ui.serp.constructor.b bVar, @k com.avito.android.beduin.common.component.grid_snippet.c cVar, @k n nVar, @k com.avito.android.constructor_advert.ui.serp.constructor.f fVar) {
        this.f101391e = interfaceC15523b;
        this.f101392f = beduinGridSnippetModel;
        this.f101393g = interfaceC13346a;
        this.f101394h = interfaceC25659b;
        this.f101395i = bVar;
        this.f101396j = cVar;
        this.f101397k = nVar;
        ConstructorAdvertItem constructorAdvertItemA = fVar.a(beduinGridSnippetModel.getSnippet(), SerpDisplayType.Grid, false, "", -1, "", null);
        if (constructorAdvertItemA != null) {
            constructorAdvertItemA.setViewed(beduinGridSnippetModel.isViewed());
        } else {
            constructorAdvertItemA = null;
        }
        this.f101398l = constructorAdvertItemA;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101392f;
    }

    @Override // ej.AbstractC40112a
    public final Object l(BeduinModel beduinModel) {
        return (BeduinGridSnippetModel) beduinModel;
    }

    @Override // com.avito.android.beduin.common.component.h
    @k
    public final View p(@k ViewGroup viewGroup, @k ViewGroup.LayoutParams layoutParams) {
        View viewB = C0.b(viewGroup, R.layout.constructor_borderless_advert_item, viewGroup, false);
        FrameLayout frameLayout = viewB instanceof FrameLayout ? (FrameLayout) viewB : null;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        }
        ConstructorAdvertItemViewImpl constructorAdvertItemViewImpl = new ConstructorAdvertItemViewImpl(viewB, this.f101393g, this.f101394h.a(0), this.f101395i, null, AsyncViewportTracker.ViewContext.f430435y, null, null, null, false, 448, null);
        v.b(constructorAdvertItemViewImpl.f125747h, R.dimen.rds_card_corner_radius);
        viewB.setTag(R.id.beduin_gird_snippet_holder, constructorAdvertItemViewImpl);
        return viewB;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(@k View view) {
        u(view, this.f101392f);
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void r(@k View view, @k List<? extends Object> list) {
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof BeduinGridSnippetModel) {
                obj = obj2;
            }
        }
        BeduinGridSnippetModel beduinGridSnippetModel = (BeduinGridSnippetModel) (obj instanceof BeduinGridSnippetModel ? obj : null);
        if (beduinGridSnippetModel == null) {
            q(view);
        } else {
            u(view, beduinGridSnippetModel);
        }
    }

    public final void u(View view, BeduinGridSnippetModel beduinGridSnippetModel) {
        BeduinModel beduinModelB;
        view.setTag(beduinGridSnippetModel.getId());
        com.avito.android.constructor_advert.ui.serp.constructor.n nVar = (com.avito.android.constructor_advert.ui.serp.constructor.n) view.getTag(R.id.beduin_gird_snippet_holder);
        ConstructorAdvertItem constructorAdvertItem = this.f101398l;
        if (constructorAdvertItem != null) {
            com.avito.android.beduin.common.component.grid_snippet.c cVar = this.f101396j;
            cVar.getClass();
            cVar.g2(nVar, constructorAdvertItem, 0, z.f125860a);
            List<BeduinModel> freeForm = constructorAdvertItem.getFreeForm();
            if (freeForm != null && (beduinModelB = com.avito.android.beduin_shared.model.utils.f.b(b.f101399l, freeForm)) != null) {
                InterfaceC40429a interfaceC40429a = beduinModelB instanceof InterfaceC40429a ? (InterfaceC40429a) beduinModelB : null;
                if (interfaceC40429a != null) {
                    interfaceC40429a.setFavorite(constructorAdvertItem.getF107475k());
                }
                if (interfaceC40429a != null) {
                    interfaceC40429a.u0(new c(constructorAdvertItem, beduinGridSnippetModel));
                }
            }
        }
        j.a(view, beduinGridSnippetModel.getOnTapActions(), this.f101391e);
    }
}
