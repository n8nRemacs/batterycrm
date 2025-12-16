package com.avito.android.serp.adapter.witcher;

import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.witcher.WitcherItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.I5;
import com.avito.android.util.L0;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WitcherItemView.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/J;", "Lcom/avito/android/serp/adapter/witcher/D;", "Lcom/avito/konveyor/adapter/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class J extends com.avito.konveyor.adapter.b implements D {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.p f273761b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.g f273762c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f273763d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L0 f273764e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final M f273765f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f273766g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final r f273767h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f273768i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f273769j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f273770k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f273771l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f273772m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Button f273773n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f273774o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f273775p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f273776q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public SV.c f273777r;

    /* renamed from: s, reason: collision with root package name */
    public int f273778s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f273779t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f273780u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f273781v;

    public J(@Y61.k com.avito.android.favorite.p pVar, @Y61.k com.avito.android.advert.viewed.g gVar, @Y61.k com.avito.konveyor.adapter.h hVar, @Y61.k L0 l02, @Y61.k com.avito.konveyor.a aVar, @Y61.k M m12, @Y61.k View view, @Y61.k r rVar) {
        super(view);
        this.f273761b = pVar;
        this.f273762c = gVar;
        this.f273763d = hVar;
        this.f273764e = l02;
        this.f273765f = m12;
        this.f273766g = view;
        this.f273767h = rVar;
        View viewFindViewById = view.findViewById(R.id.witcher_external_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f273768i = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.witcher_inner_root);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f273769j = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.witcher_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        this.f273770k = textView;
        View viewFindViewById4 = view.findViewById(R.id.witcher_subtitle);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById4;
        this.f273771l = textView2;
        View viewFindViewById5 = view.findViewById(R.id.witcher_recycler);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f273772m = recyclerView;
        Button button = (Button) view.findViewById(R.id.witcher_button);
        this.f273773n = button;
        this.f273774o = io.reactivex.rxjava3.core.z.g0(C37722i.a(textView), C37722i.a(textView2));
        this.f273775p = button != null ? C37722i.a(button) : U.f403867b;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        this.f273776q = jVar;
        this.f273780u = C42727D.c(new H(this));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new I(this));
        this.f273781v = interfaceC42726CC;
        jVar.setHasStableIds(true);
        recyclerView.setLayoutManager((GridLayoutManager) interfaceC42726CC.getValue());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setScrollingTouchSlop(1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
    }

    public static final void B80(J j12) {
        RecyclerView.m layoutManager = j12.f273772m.getLayoutManager();
        j12.f273767h.I0(layoutManager != null ? layoutManager.Y0() : null, j12.f273778s);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> A1() {
        return this.f273775p;
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        C35976x4.c(i12, this.f273772m);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void CZ(@Y61.k Appearance appearance) {
        appearance.a(this.f273770k);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void ET(@Y61.k Appearance appearance) {
        appearance.a(this.f273768i);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void Fe(@Y61.k Appearance appearance) {
        appearance.a(this.f273772m);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void GB(@Y61.k Appearance appearance) {
        Button button = this.f273773n;
        if (button == null) {
            return;
        }
        appearance.a(button);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void Hu(@Y61.l WitcherItem.Action action, boolean z12) throws Resources.NotFoundException {
        String str;
        Button button = this.f273773n;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, action != null ? action.f273828b : null, false);
        }
        if (action != null && (str = action.f273830d) != null) {
            int iJ2 = str.equals("marketplace_style") ? R.style.ButtonPrimaryLargeViolet : C35835l0.j(com.avito.android.lib.util.f.d(str), this.f273766g.getContext());
            if (button != null) {
                button.setAppearance(iJ2);
            }
        }
        if (z12) {
            ((FrameLayout.LayoutParams) (button != null ? button.getLayoutParams() : null)).width = -2;
        }
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void L4() {
        RecyclerView recyclerView = this.f273772m;
        recyclerView.setOnFlingListener(null);
        recyclerView.s();
        recyclerView.m(new E(this));
        recyclerView.n(new F(this));
        recyclerView.o(new G(this));
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void Qj(@Y61.k Appearance appearance) {
        appearance.a(this.f273769j);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void SK() {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f273780u.getValue();
        RecyclerView recyclerView = this.f273772m;
        recyclerView.setLayoutManager(gridLayoutManager);
        Resources resources = recyclerView.getResources();
        M m12 = this.f273765f;
        recyclerView.l(new C34889h(m12.getF273784b(), resources, this.f273764e), -1);
        SV.c cVar = new SV.c(8388611, m12.getF273786d());
        SV.c cVar2 = this.f273777r;
        if (cVar2 != null) {
            cVar2.b(null);
        }
        recyclerView.setOnFlingListener(null);
        recyclerView.s();
        recyclerView.m(new E(this));
        recyclerView.n(new F(this));
        recyclerView.o(new G(this));
        cVar.b(recyclerView);
        this.f273777r = cVar;
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final boolean T70() {
        return kotlin.jvm.internal.L.f(this.f273772m.getLayoutManager(), (GridLayoutManager) this.f273780u.getValue());
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void W4(@Y61.l Parcelable parcelable) {
        RecyclerView.m layoutManager = this.f273772m.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.X0(parcelable);
        }
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> Y9() {
        return this.f273774o;
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void Z5(int i12) {
        this.f273769j.setBackgroundColor(C35835l0.d(i12, this.f273766g.getContext()));
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void ce(@Y61.k UV0.c cVar) {
        com.avito.android.favorite.p pVar = this.f273761b;
        pVar.f155231e = cVar;
        pVar.s4(this);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void f(@Y61.l String str) {
        I5.a(this.f273771l, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f273779t;
        if (aVar != null) {
            ((v) aVar).invoke();
        }
        this.f273779t = null;
        this.f273772m.setAdapter(null);
        this.f273761b.I();
        this.f273762c.e0();
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void k30(@Y61.k Appearance appearance) {
        appearance.a(this.f273771l);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void s(@Y61.l String str) {
        this.f273768i.setTag("indents_from_backend_tag");
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f273770k, str, false);
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f273779t = aVar;
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void xc(@Y61.k UV0.c cVar, int i12, @Y61.l SerpDisplayType serpDisplayType) {
        this.f273763d.f338510e = cVar;
        RecyclerView recyclerView = this.f273772m;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        com.avito.konveyor.adapter.j jVar = this.f273776q;
        if (adapter == null) {
            recyclerView.setAdapter(jVar);
        } else {
            jVar.notifyDataSetChanged();
        }
        this.f273778s = i12;
    }

    @Override // com.avito.android.serp.adapter.witcher.D
    public final void zb(@Y61.k UV0.c cVar) {
        com.avito.android.advert.viewed.g gVar = this.f273762c;
        gVar.c(cVar);
        gVar.d(this);
    }
}
