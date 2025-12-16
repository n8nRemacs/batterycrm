package com.avito.android.inline_filters.dialog.location_group;

import PV.b;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.spinner.overlay.SpinnerOverlay;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: LocationGroupFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/H;", "Lcom/avito/android/inline_filters/dialog/B;", "Lcom/avito/android/inline_filters/dialog/location_group/D;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class H implements com.avito.android.inline_filters.dialog.B, D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f171672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.inline_filters.dialog.D f171673b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f171674c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public PV.b f171675d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f171676e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f171677f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SpinnerOverlay f171678g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f171679h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f171680i;

    /* renamed from: j, reason: collision with root package name */
    public final float f171681j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public Object f171682k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f171683l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f171684m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f171685n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<GroupFilterItem, InlineFilterValue>> f171686o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<GroupFilterItem> f171687p;

    public H(@Y61.k View view, @Y61.l com.avito.android.util.text.a aVar) throws BlueprintCollisionException {
        this.f171672a = view;
        this.f171673b = new com.avito.android.inline_filters.dialog.D(view);
        View viewFindViewById = view.findViewById(R.id.search_edit_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f171674c = (Input) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.apply_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById2;
        this.f171676e = button;
        View viewFindViewById3 = view.findViewById(R.id.apply_button_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f171677f = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.spinner_overlay);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.overlay.SpinnerOverlay");
        }
        this.f171678g = (SpinnerOverlay) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.content_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171679h = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.filter_options_recycler_view);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
        this.f171680i = recyclerView;
        this.f171681j = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.inline_filters_apply_btn_container_height);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f171682k = C42784z0.f406748b;
        this.f171686o = new com.jakewharton.rxrelay3.c<>();
        this.f171687p = new com.jakewharton.rxrelay3.c<>();
        recyclerView.setLayoutManager(linearLayoutManager);
        F f12 = new F(2, this, H.class, "onItemClicked", "onItemClicked(ILcom/avito/android/remote/model/search/InlineFilterValue;)V", 0);
        G g12 = new G(1, this, H.class, "onClearClicked", "onClearClicked(I)V", 0);
        com.avito.android.inline_filters.dialog.location_group.adapter.a aVar2 = new com.avito.android.inline_filters.dialog.location_group.adapter.a(new com.avito.android.inline_filters.dialog.location_group.adapter.e(new L(f12), new M(g12)));
        com.avito.android.inline_filters.dialog.location_group.adapter.checkbox.a aVar3 = new com.avito.android.inline_filters.dialog.location_group.adapter.checkbox.a(new com.avito.android.inline_filters.dialog.location_group.adapter.checkbox.e(new I(f12)));
        com.avito.android.inline_filters.dialog.location_group.adapter.chips.b bVar = new com.avito.android.inline_filters.dialog.location_group.adapter.chips.b(new com.avito.android.inline_filters.dialog.location_group.adapter.chips.g(new J(f12)));
        com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.a aVar4 = new com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.a(new com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.e(new N(f12), new O(g12)));
        com.avito.android.inline_filters.dialog.location_group.adapter.local_priority.a aVar5 = new com.avito.android.inline_filters.dialog.location_group.adapter.local_priority.a(new com.avito.android.inline_filters.dialog.location_group.adapter.local_priority.d(new K(f12)), aVar);
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(bVar);
        c10493a.b(aVar4);
        c10493a.b(aVar5);
        com.avito.konveyor.a aVarA = c10493a.a();
        this.f171683l = aVarA;
        this.f171684m = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        recyclerView.l(new C31012a(), -1);
        D6.G(viewFindViewById3, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) button.getLayoutParams();
        marginLayoutParams.setMargins(y6.b(10), marginLayoutParams.topMargin, y6.b(10), marginLayoutParams.bottomMargin);
        button.setLayoutParams(marginLayoutParams);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Qd(@Y61.k Y41.a<G0> aVar) {
        this.f171673b.Qd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Sd(@Y61.k Y41.a<G0> aVar) {
        this.f171673b.Sd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Td(@Y61.k String str) {
        this.f171673b.Td(str);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Ud(boolean z12) {
        this.f171673b.Ud(true);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.inline_filters.dialog.location_group.D
    public final void b(@Y61.k List<GroupFilterItem> list) {
        this.f171682k = list;
        k(list);
        PV.b bVar = this.f171675d;
        RecyclerView recyclerView = this.f171680i;
        if (bVar != null) {
            recyclerView.r0(bVar);
        }
        int i12 = (int) this.f171681j;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicHeight(i12);
        shapeDrawable.setTint(C35835l0.d(R.attr.transparentWhite, recyclerView.getContext()));
        b.a aVar = new b.a(null, 1, null);
        aVar.f13092e = true;
        aVar.b(shapeDrawable, C42745f0.J(this.f171682k));
        PV.b bVarA = aVar.a();
        this.f171675d = bVarA;
        recyclerView.l(bVarA, -1);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.D
    public final void d() {
        this.f171685n = true;
        this.f171676e.setLoading(true);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.D
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF171686o() {
        return this.f171686o;
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @Y61.l
    /* renamed from: getState */
    public final Parcelable getF171936c() {
        return null;
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.D
    public final void h(@Y61.k final Y41.a<G0> aVar) {
        this.f171676e.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.inline_filters.dialog.location_group.E
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (this.f171670b.f171685n) {
                    return;
                }
                ((A) aVar).invoke();
            }
        });
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.D
    @Y61.k
    /* renamed from: i, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF171687p() {
        return this.f171687p;
    }

    public final void k(List<GroupFilterItem> list) {
        UV0.c cVar = new UV0.c(list);
        com.avito.konveyor.adapter.h hVar = this.f171684m;
        hVar.f338510e = cVar;
        RecyclerView recyclerView = this.f171680i;
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new com.avito.konveyor.adapter.j(hVar, this.f171683l));
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.D
    public final void l(int i12) {
        this.f171674c.setVisibility(8);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.D
    public final void m(@Y61.l String str) {
        I5.a(this.f171679h, str, false);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.D
    public final void n(@Y61.k String str) {
        this.f171685n = false;
        Button button = this.f171676e;
        button.setLoading(false);
        button.setText(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.inline_filters.dialog.location_group.D
    public final void r(@Y61.l Filter filter, boolean z12) {
        for (GroupFilterItem groupFilterItem : (Iterable) this.f171682k) {
            if (filter != null && kotlin.jvm.internal.L.f(filter.getId(), groupFilterItem.f171704c.getId())) {
                groupFilterItem.f171704c = filter;
            }
            groupFilterItem.f171706e = !z12;
        }
        k(this.f171682k);
        Button button = this.f171676e;
        button.setEnabled(!z12);
        button.setLoading(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void setTitle(@Y61.k String str) {
        this.f171673b.setTitle(str);
    }

    @Override // com.avito.android.inline_filters.dialog.location_group.D
    public final void v(boolean z12) {
        this.f171678g.setVisibility(z12 ? 0 : 8);
    }
}
