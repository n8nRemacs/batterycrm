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
import zp0.C50607b;
import zp0.C50608c;

/* compiled from: GlobalCategoryGroupItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/D;", "Lcom/avito/android/search/filter/adapter/category_group/s;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D extends com.avito.konveyor.adapter.b implements s {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f262042i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f262043b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f262044c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f262045d;

    /* renamed from: e, reason: collision with root package name */
    public final View f262046e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C34541e f262047f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f262048g;

    /* renamed from: h, reason: collision with root package name */
    public final LayoutInflater f262049h;

    /* compiled from: GlobalCategoryGroupItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            D d12 = D.this;
            K2.d(d12.f262047f.f262057b, true);
            K2.f(d12.f262044c, 3);
            return G0.f406611a;
        }
    }

    public D(@Y61.k View view) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.back_navigation_recycler);
        this.f262043b = recyclerView;
        this.f262044c = (TextView) view.findViewById(R.id.title);
        this.f262045d = (FlexboxLayout) view.findViewById(R.id.category_chips_container);
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.category_group_element_dialog, (ViewGroup) null);
        this.f262046e = viewInflate;
        this.f262047f = new C34541e(viewInflate);
        this.f262048g = new com.avito.android.lib.design.bottom_sheet.d(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        this.f262049h = LayoutInflater.from(view.getContext());
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
        FlexboxLayout flexboxLayout = this.f262045d;
        if (!zIsEmpty && pVar != null) {
            flexboxLayout.removeAllViews();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f262044c.getMeasuredWidth(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            Iterator<C> it = list.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C next = it.next();
                LayoutInflater layoutInflater = this.f262049h;
                if (z12) {
                    Button button = (Button) layoutInflater.inflate(R.layout.global_category_group_tag, (ViewGroup) flexboxLayout, false);
                    button.setText(next.f262040d);
                    button.setOnClickListener(new t(pVar, next, 1));
                    flexboxLayout.addView(button);
                } else {
                    Button button2 = (Button) layoutInflater.inflate(R.layout.global_category_group_tag, (ViewGroup) flexboxLayout, false);
                    button2.setText(next.f262040d);
                    button2.setOnClickListener(new t(pVar, next, 1));
                    flexboxLayout.addView(button2);
                    flexboxLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    if (flexboxLayout.getFlexLines().size() == 4) {
                        flexboxLayout.removeViews(i13, 1);
                        int size = list.size() - i13;
                        Button button3 = (Button) layoutInflater.inflate(R.layout.global_category_group_tag, (ViewGroup) flexboxLayout, false);
                        button3.setText(this.itemView.getContext().getResources().getString(R.string.search_filter_more_with_counter, String.valueOf(size)));
                        button3.setOnClickListener(new u(pVar, this, 1));
                        flexboxLayout.addView(button3);
                        flexboxLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        if (flexboxLayout.getFlexLines().size() == 4 && (i12 = i13 - 1) > 0) {
                            flexboxLayout.removeViews(i12, 1);
                            int i14 = size + 1;
                            View childAt = flexboxLayout.getChildAt(flexboxLayout.getChildCount() - 1);
                            TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
                            if (textView != null) {
                                textView.setText(this.itemView.getContext().getResources().getString(R.string.search_filter_more_with_counter, String.valueOf(i14)));
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
        this.f262044c.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void Y3() {
        this.f262048g.dismiss();
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void ZC(@Y61.k Y41.a<G0> aVar) {
        View view = this.f262046e;
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f262048g;
        dVar.G(view, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, this.f262044c.getText(), true, true, 2);
        dVar.setOnDismissListener(new v(this, aVar, 1));
        dVar.R(new a());
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.K(true);
        com.avito.android.lib.util.g.a(dVar);
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    @Y61.k
    /* renamed from: jT, reason: from getter */
    public final C34541e getF262103f() {
        return this.f262047f;
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void pW(@Y61.k Y41.l lVar, @Y61.l List list) {
        int size = list != null ? list.size() : 0;
        RecyclerView recyclerView = this.f262043b;
        if (recyclerView.getAdapter() != null) {
            C50607b c50607b = (C50607b) recyclerView.getAdapter();
            if (list == null) {
                list = C42784z0.f406748b;
            }
            c50607b.f444256c = list;
            c50607b.f444257d = lVar;
            c50607b.notifyDataSetChanged();
        } else {
            C50607b c50607b2 = new C50607b();
            if (list == null) {
                list = C42784z0.f406748b;
            }
            c50607b2.f444256c = list;
            c50607b2.f444257d = lVar;
            recyclerView.setAdapter(c50607b2);
            c50607b2.notifyDataSetChanged();
        }
        if (size > 0) {
            recyclerView.A0(size - 1);
        }
    }

    @Override // com.avito.android.search.filter.adapter.category_group.s
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f262044c, str, false);
    }
}
