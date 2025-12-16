package com.avito.android.search.filter.adapter.bottom_sheet_group;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.point.Point;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BottomSheetGroupItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/bottom_sheet_group/k;", "Lcom/avito/android/search/filter/adapter/bottom_sheet_group/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f262023g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f262024b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f262025c;

    /* renamed from: d, reason: collision with root package name */
    public final Point f262026d;

    /* renamed from: e, reason: collision with root package name */
    public final Input f262027e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f262028f;

    /* compiled from: BottomSheetGroupItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", BeduinCartItemModel.CHECKED_STRING, "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, G0> f262029l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Boolean, G0> lVar) {
            super(1);
            this.f262029l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f262029l.invoke(bool2);
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        super(view);
        this.f262024b = view;
        this.f262025c = (TextView) view.findViewById(R.id.title);
        this.f262026d = (Point) view.findViewById(R.id.red_point_badge);
        this.f262027e = (Input) view.findViewById(R.id.select_filter_input);
        this.f262028f = (LinearLayout) view.findViewById(R.id.container);
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.j
    public final void JP(boolean z12) {
        D6.G(this.f262026d, z12);
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.j
    public final void Mz(int i12, @Y61.l Y41.a<G0> aVar) {
        Input input = this.f262027e;
        input.setRightIcon(C35835l0.h(i12, input.getContext()));
        input.setRightIconListener(new com.avito.android.profile_settings_extended.adapter.phones.l(12, aVar));
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.j
    public final void T9() {
        this.f262028f.removeAllViews();
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.j
    public final void WV(@Y61.k String str, boolean z12, @Y61.k Y41.l<? super Boolean, G0> lVar) {
        View viewInflate = LayoutInflater.from(this.f262024b.getContext()).inflate(R.layout.filters_checkbox, (ViewGroup) null);
        com.avito.android.search.filter.adapter.checkbox.j jVar = new com.avito.android.search.filter.adapter.checkbox.j(viewInflate);
        jVar.setText(str);
        jVar.setChecked(z12);
        jVar.S1(new a(lVar));
        this.f262028f.addView(viewInflate);
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.j
    public final void a(@Y61.l Y41.a<G0> aVar) {
        this.f262027e.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(9, aVar));
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.j
    public final void m(@Y61.k String str) {
        Input.t(this.f262027e, str, false, 6);
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.j
    public final void o(@Y61.k String str) {
        this.f262027e.setHint(str);
    }

    @Override // com.avito.android.search.filter.adapter.bottom_sheet_group.j
    public final void setTitle(@Y61.k String str) {
        this.f262025c.setText(str);
    }
}
