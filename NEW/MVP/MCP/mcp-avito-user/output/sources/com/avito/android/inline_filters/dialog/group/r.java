package com.avito.android.inline_filters.dialog.group;

import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.B;
import com.avito.android.inline_filters.dialog.D;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.inline_filters.dialog.s;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.C35835l0;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: GroupFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/r;", "Lcom/avito/android/inline_filters/dialog/E;", "Lcom/avito/android/inline_filters/dialog/B;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r implements E, B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f171629a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f171630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f171631c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f171632d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f171633e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f171634f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f171635g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public PV.b f171636h;

    /* renamed from: i, reason: collision with root package name */
    public final float f171637i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f171638j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public N f171639k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public N f171640l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<Filter, InlineFilterValue>> f171641m;

    /* renamed from: n, reason: collision with root package name */
    public final int f171642n;

    /* renamed from: o, reason: collision with root package name */
    public final int f171643o;

    public r(@Y61.k View view, @Y61.k s sVar) throws BlueprintCollisionException {
        this.f171629a = view;
        this.f171630b = sVar;
        this.f171631c = new D(view);
        View viewFindViewById = view.findViewById(R.id.filter_options_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f171632d = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.search_edit_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.apply_button_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f171633e = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.apply_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f171634f = button;
        View viewFindViewById5 = view.findViewById(R.id.reset_action_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171635g = (TextView) viewFindViewById5;
        this.f171637i = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.inline_filters_apply_btn_container_height);
        this.f171639k = l.f171623l;
        this.f171640l = m.f171624l;
        this.f171641m = new com.jakewharton.rxrelay3.c<>();
        this.f171642n = C35835l0.d(R.attr.blue, view.getContext());
        this.f171643o = C35835l0.d(R.attr.gray28, view.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(true);
        viewFindViewById3.setVisibility(0);
        input.setVisibility(8);
        com.avito.android.inline_filters.dialog.group.item.double_input.a aVar = new com.avito.android.inline_filters.dialog.group.item.double_input.a(new com.avito.android.inline_filters.dialog.group.item.double_input.b(new n(this), new o(this)));
        com.avito.android.inline_filters.dialog.group.item.multiselect.a aVar2 = new com.avito.android.inline_filters.dialog.group.item.multiselect.a(new com.avito.android.inline_filters.dialog.group.item.multiselect.b(sVar, new p(this), new q(this)));
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar2);
        c10493a.b(aVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null);
        this.f171638j = hVar;
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(hVar, aVarA));
        button.setOnClickListener(new com.avito.android.imv_similiar_adverts.h(this, 2));
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Qd(@Y61.k Y41.a<G0> aVar) {
        this.f171631c.Qd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Sd(@Y61.k Y41.a<G0> aVar) {
        this.f171631c.Sd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @Y61.l
    public final Parcelable getState() {
        return null;
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void setTitle(@Y61.k String str) {
        this.f171631c.setTitle(str);
    }
}
