package com.avito.android.beduin.common.component.serp_layout;

import Y61.l;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.constructor_advert.ui.serp.constructor.m;
import com.avito.android.constructor_advert.ui.serp.constructor.q;
import com.avito.android.favorite.n;
import com.avito.android.favorite.s;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.n1;
import com.avito.android.util.C35835l0;
import fj.InterfaceC40429a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SerpLayoutComponent.kt */
@hw.g
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/serp_layout/d;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/serp_layout/SerpLayoutModel;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/avito/android/favorite/s;", "Lcom/avito/android/beduin_shared/common/component/adapter/g;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends com.avito.android.beduin.common.component.h<SerpLayoutModel, RecyclerView> implements s, com.avito.android.beduin_shared.common.component.adapter.g {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f102594p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final Class<? extends BeduinModel> f102595q = SerpLayoutModel.class;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SerpLayoutModel f102596e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.f f102597f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final m f102598g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final n f102599h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final n1 f102600i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f102601j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final q f102602k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f102603l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f102604m = true;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ArrayList f102605n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    @l
    public RecyclerView f102606o;

    /* compiled from: SerpLayoutComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/serp_layout/d$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final Class<? extends BeduinModel> S() {
            return d.f102595q;
        }

        @Override // com.avito.android.beduin.common.component.b
        @Y61.k
        public final List<String> a() {
            return Collections.singletonList("SERPLayout");
        }

        public a() {
        }
    }

    public d(@Y61.k SerpLayoutModel serpLayoutModel, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.f fVar, @Y61.k m mVar, @Y61.k n nVar, @Y61.k n1 n1Var, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k q qVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f102596e = serpLayoutModel;
        this.f102597f = fVar;
        this.f102598g = mVar;
        this.f102599h = nVar;
        this.f102600i = n1Var;
        this.f102601j = hVar;
        this.f102602k = qVar;
        this.f102603l = jVar;
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        this.f102603l.notifyItemChanged(i12);
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102596e;
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void c(@Y61.k RecyclerView.C c12) {
        this.f102599h.I();
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void d(@Y61.k RecyclerView.C c12) {
        this.f102599h.I();
        this.f102606o = null;
    }

    @Override // com.avito.android.beduin_shared.common.component.adapter.g
    public final void e(@Y61.k RecyclerView.C c12) {
        this.f102599h.s4(this);
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF101847n() {
        return this.f102604m;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        BeduinModel beduinModelB;
        Lifecycle lifecycle;
        int integer = viewGroup.getContext().getResources().getInteger(R.integer.serp_columns);
        viewGroup.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(integer, 1);
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext(), null);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.f102603l);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        SerpLayoutModel serpLayoutModel = this.f102596e;
        Integer interItemSpacing = serpLayoutModel.getInterItemSpacing();
        recyclerView.l(new k(integer, interItemSpacing != null ? interItemSpacing.intValue() : 8), -1);
        this.f102606o = recyclerView;
        androidx.appcompat.app.m mVarC = C35835l0.c(viewGroup.getContext());
        if (mVarC != null && (lifecycle = mVarC.getLifecycle()) != null) {
            lifecycle.a(new g(this));
        }
        ArrayList arrayList = this.f102605n;
        arrayList.clear();
        for (SerpElement serpElement : serpLayoutModel.getChildren()) {
            ConstructorAdvertNetworkModel constructorAdvertNetworkModel = serpElement instanceof ConstructorAdvertNetworkModel ? (ConstructorAdvertNetworkModel) serpElement : null;
            if (constructorAdvertNetworkModel != null) {
                ConstructorAdvertItem constructorAdvertItemA = this.f102597f.a(constructorAdvertNetworkModel, serpLayoutModel.getSerpDisplayType(), false, "", -1, "", null);
                if (constructorAdvertItemA != null) {
                    List<BeduinModel> freeForm = constructorAdvertItemA.getFreeForm();
                    if (freeForm != null && (beduinModelB = com.avito.android.beduin_shared.model.utils.f.b(e.f102607l, freeForm)) != null) {
                        InterfaceC40429a interfaceC40429a = beduinModelB instanceof InterfaceC40429a ? (InterfaceC40429a) beduinModelB : null;
                        if (interfaceC40429a != null) {
                            interfaceC40429a.u0(new f(this, constructorAdvertItemA));
                        }
                    }
                    arrayList.add(constructorAdvertItemA);
                }
            }
        }
        this.f102600i.b(arrayList);
        u();
        return this.f102606o;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        RecyclerView recyclerView = (RecyclerView) view;
        this.f102606o = recyclerView;
        SerpLayoutModel serpLayoutModel = this.f102596e;
        recyclerView.setTag(serpLayoutModel.getF102944b());
        J.b(recyclerView, serpLayoutModel.getMargin());
    }

    public final void u() {
        UV0.c cVar = new UV0.c(this.f102605n);
        this.f102601j.f338510e = cVar;
        this.f102599h.c(cVar);
        this.f102598g.f125825b = cVar;
        q qVar = this.f102602k;
        qVar.h();
        qVar.g();
        this.f102603l.notifyDataSetChanged();
    }
}
