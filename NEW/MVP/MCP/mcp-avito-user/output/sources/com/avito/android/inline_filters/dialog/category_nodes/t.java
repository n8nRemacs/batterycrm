package com.avito.android.inline_filters.dialog.category_nodes;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.category_nodes.adapter.NodeItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryNodesView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/t;", "Lcom/avito/android/inline_filters/dialog/B;", "Lcom/avito/android/inline_filters/dialog/category_nodes/q;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements com.avito.android.inline_filters.dialog.B, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.inline_filters.dialog.D f171501a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f171502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f171503c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f171504d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f171505e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f171506f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C f171507g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f171508h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<NodeItem> f171509i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<NodeItem> f171510j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f171511k;

    /* compiled from: CategoryNodesView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f171512l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f171512l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f171512l.invoke();
            return G0.f406611a;
        }
    }

    public t(@Y61.k View view) throws BlueprintCollisionException {
        this.f171501a = new com.avito.android.inline_filters.dialog.D(view);
        View viewFindViewById = view.findViewById(R.id.apply_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f171502b = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.apply_button_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f171503c = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.filter_options_recycler_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f171504d = recyclerView;
        View viewFindViewById4 = view.findViewById(R.id.search_edit_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f171505e = (Input) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.empty_search_hint);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171506f = (TextView) viewFindViewById5;
        this.f171507g = new C(view);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.f171509i = new com.jakewharton.rxrelay3.c<>();
        this.f171510j = new com.jakewharton.rxrelay3.c<>();
        this.f171511k = new com.jakewharton.rxrelay3.c<>();
        recyclerView.setLayoutManager(linearLayoutManager);
        com.avito.android.inline_filters.dialog.category_nodes.adapter.j jVar = new com.avito.android.inline_filters.dialog.category_nodes.adapter.j(this);
        com.avito.android.inline_filters.dialog.category_nodes.adapter.f fVar = new com.avito.android.inline_filters.dialog.category_nodes.adapter.f(jVar);
        com.avito.android.inline_filters.dialog.category_nodes.adapter.a aVar = new com.avito.android.inline_filters.dialog.category_nodes.adapter.a(jVar);
        com.avito.android.inline_filters.dialog.category_nodes.adapter.d dVar = new com.avito.android.inline_filters.dialog.category_nodes.adapter.d(jVar);
        com.avito.android.inline_filters.dialog.category_nodes.adapter.p pVar = new com.avito.android.inline_filters.dialog.category_nodes.adapter.p(new com.avito.android.inline_filters.dialog.category_nodes.adapter.s(this));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(fVar);
        c10493a.b(aVar);
        c10493a.b(dVar);
        c10493a.b(pVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.d dVar2 = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, null, 4, null);
        this.f171508h = dVar2;
        recyclerView.setAdapter(dVar2);
        recyclerView.setItemAnimator(null);
        while (true) {
            RecyclerView recyclerView2 = this.f171504d;
            if (recyclerView2.getItemDecorationCount() <= 0) {
                break;
            } else {
                recyclerView2.s0(0);
            }
        }
        this.f171504d.l(new com.avito.android.inline_filters.dialog.category_nodes.adapter.c(D6.j(view, 11)), -1);
        Input input = this.f171505e;
        input.setLeftIcon(C35835l0.h(R.attr.ic_search20, input.getContext()));
        Input input2 = this.f171505e;
        input2.setLeftIconColor(ColorStateList.valueOf(C35835l0.d(R.attr.gray54, input2.getContext())));
        com.avito.android.lib.design.input.n.c(this.f171505e, new s(this));
        View viewFindViewById6 = view.findViewById(R.id.design_input_left_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        D6.f(viewFindViewById6, y6.b(16), 0, y6.b(6), 0, 10);
        View viewFindViewById7 = view.findViewById(R.id.inline_filter_dialog_title);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById7;
        textView.setMaxLines(1);
        D6.c(textView, 0, null, 0, null, 10);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void C0() {
        C c12 = this.f171507g;
        D6.w(c12.f171386d);
        D6.w(c12.f171384b);
        D6.H(c12.f171385c);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Qd(@Y61.k Y41.a<G0> aVar) {
        this.f171501a.Qd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Rd(boolean z12) {
        this.f171501a.Rd(false);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void W() {
        K2.f(this.f171505e, 3);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void a() {
        C c12 = this.f171507g;
        D6.H(c12.f171386d);
        D6.w(c12.f171384b);
        D6.w(c12.f171385c);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void b(@Y61.k List<NodeItem> list) {
        this.f171508h.l(list, null);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void c() {
        D6.H(this.f171505e);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void e() {
        D6.H(this.f171503c);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void g() {
        C c12 = this.f171507g;
        D6.H(c12.f171384b);
        D6.w(c12.f171385c);
        D6.w(c12.f171386d);
        ImageView imageView = c12.f171387e;
        imageView.setImageDrawable(C35835l0.h(R.attr.img_noInternet, imageView.getContext()));
        c12.f171388f.setText(R.string.inline_filters_unknown_error);
        c12.f171389g.setText(R.string.inline_filters_unknown_error_subtitle);
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @Y61.l
    public final Parcelable getState() {
        return null;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    @Y61.k
    /* renamed from: j, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF171511k() {
        return this.f171511k;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    @Y61.k
    /* renamed from: o, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF171509i() {
        return this.f171509i;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void p(@Y61.k Y41.a<G0> aVar) {
        this.f171502b.setOnClickListener(new r(0, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    @Y61.k
    /* renamed from: q, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF171510j() {
        return this.f171510j;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void qd(@Y61.k Y41.a<G0> aVar) {
        a aVar2 = new a(aVar);
        C c12 = this.f171507g;
        c12.getClass();
        c12.f171390h.setOnClickListener(new r(1, aVar2));
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void s() {
        D6.w(this.f171506f);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void s4(int i12) {
        this.f171504d.A0(i12);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void setQuery(@Y61.k String str) {
        Input.t(this.f171505e, str, false, 6);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void setTitle(@Y61.k String str) {
        this.f171501a.setTitle(str);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void t() {
        D6.w(this.f171505e);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.q
    public final void u() {
        D6.H(this.f171506f);
    }
}
