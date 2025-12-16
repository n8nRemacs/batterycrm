package com.avito.android.search.filter.adapter.category_group;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import com.google.android.flexbox.FlexboxLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import zp0.C50606a;
import zp0.C50608c;

/* compiled from: CategoryGroupItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/w;", "Lcom/avito/android/search/filter/adapter/category_group/s;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w extends com.avito.konveyor.adapter.b implements s {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f262098i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f262099b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f262100c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f262101d;

    /* renamed from: e, reason: collision with root package name */
    public final View f262102e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C34541e f262103f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f262104g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f262105h;

    /* compiled from: CategoryGroupItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            w wVar = w.this;
            K2.d(wVar.f262103f.f262057b, true);
            K2.f(wVar.f262100c, 3);
            return G0.f406611a;
        }
    }

    public w(@Y61.k View view) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.back_navigation_recycler);
        this.f262099b = recyclerView;
        this.f262100c = (TextView) view.findViewById(R.id.title);
        this.f262101d = (FlexboxLayout) view.findViewById(R.id.category_chips_container);
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.category_group_element_dialog, (ViewGroup) null);
        this.f262102e = viewInflate;
        this.f262103f = new C34541e(viewInflate);
        this.f262104g = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        this.f262105h = LayoutInflater.from(view.getContext());
        Drawable drawable = recyclerView.getContext().getDrawable(R.drawable.ic_breadcrumbs_arrow);
        if (drawable != null) {
            recyclerView.l(new C50608c(drawable), -1);
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void Gr(@Y61.k List<C> list, boolean z12, @Y61.l Y41.p<? super Integer, ? super C, G0> pVar) {
        int i12;
        boolean zIsEmpty = list.isEmpty();
        FlexboxLayout flexboxLayout = this.f262101d;
        if (!zIsEmpty && pVar != null) {
            flexboxLayout.removeAllViews();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f262100c.getMeasuredWidth(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            Iterator<C> it = list.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C next = it.next();
                LayoutInflater layoutInflater = this.f262105h;
                if (z12) {
                    Button button = (Button) layoutInflater.inflate(R.layout.category_group_tag, (ViewGroup) flexboxLayout, false);
                    button.setText(next.f262040d);
                    button.setOnClickListener(new t(pVar, next, 0));
                    flexboxLayout.addView(button);
                } else {
                    Button button2 = (Button) layoutInflater.inflate(R.layout.category_group_tag, (ViewGroup) flexboxLayout, false);
                    button2.setText(next.f262040d);
                    button2.setOnClickListener(new t(pVar, next, 0));
                    flexboxLayout.addView(button2);
                    flexboxLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    if (flexboxLayout.getFlexLines().size() == 4) {
                        flexboxLayout.removeViews(i13, 1);
                        int size = list.size() - i13;
                        View viewInflate = layoutInflater.inflate(R.layout.category_group_link, (ViewGroup) flexboxLayout, false);
                        View viewFindViewById = viewInflate.findViewById(R.id.category_action_button_link);
                        if (viewFindViewById == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        TextView textView = (TextView) viewFindViewById;
                        textView.setText(this.itemView.getContext().getResources().getString(R.string.search_filter_more_with_counter, String.valueOf(size)));
                        textView.setOnClickListener(new u(pVar, this, 0));
                        flexboxLayout.addView(viewInflate);
                        flexboxLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        if (flexboxLayout.getFlexLines().size() == 4 && (i12 = i13 - 1) > 0) {
                            flexboxLayout.removeViews(i12, 1);
                            int i14 = size + 1;
                            View childAt = flexboxLayout.getChildAt(flexboxLayout.getChildCount() - 1);
                            TextView textView2 = childAt instanceof TextView ? (TextView) childAt : null;
                            if (textView2 != null) {
                                textView2.setText(this.itemView.getContext().getResources().getString(R.string.search_filter_more_with_counter, String.valueOf(i14)));
                            }
                        }
                    } else {
                        i13++;
                    }
                }
            }
        }
        flexboxLayout.setVisibility(list.isEmpty() ? 8 : 0);
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void X5(int i12) {
        this.f262100c.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void Y3() {
        this.f262104g.dismiss();
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void ZC(@Y61.k Y41.a<G0> aVar) {
        View view = this.f262102e;
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f262104g;
        dVar.G(view, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, this.f262100c.getText(), true, true, 2);
        dVar.setOnDismissListener(new v(this, aVar, 0));
        dVar.R(new a());
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.K(true);
        com.avito.android.lib.util.g.a(dVar);
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    @Y61.k
    /* renamed from: jT, reason: from getter */
    public final C34541e getF262103f() {
        return this.f262103f;
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void pW(@Y61.k Y41.l lVar, @Y61.l List list) {
        int size = list != null ? list.size() : 0;
        RecyclerView recyclerView = this.f262099b;
        if (recyclerView.getAdapter() != null) {
            C50606a c50606a = (C50606a) recyclerView.getAdapter();
            if (list == null) {
                list = C42784z0.f406748b;
            }
            c50606a.f444253c = list;
            c50606a.f444254d = lVar;
            c50606a.notifyDataSetChanged();
        } else {
            C50606a c50606a2 = new C50606a();
            if (list == null) {
                list = C42784z0.f406748b;
            }
            c50606a2.f444253c = list;
            c50606a2.f444254d = lVar;
            recyclerView.setAdapter(c50606a2);
            c50606a2.notifyDataSetChanged();
        }
        if (size > 0) {
            recyclerView.A0(size - 1);
        }
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f262100c, str, false);
    }
}
