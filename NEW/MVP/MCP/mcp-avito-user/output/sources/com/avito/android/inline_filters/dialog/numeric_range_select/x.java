package com.avito.android.inline_filters.dialog.numeric_range_select;

import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.B;
import com.avito.android.inline_filters.dialog.D;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.select.Select;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: NumericRangeSelectFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/numeric_range_select/x;", "Lcom/avito/android/inline_filters/dialog/B;", "Lcom/avito/android/inline_filters/dialog/E;", "Lcom/avito/android/inline_filters/dialog/range/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x implements B, E, com.avito.android.inline_filters.dialog.range.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f171934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f171935b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Parcelable f171936c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public N f171937d = a.f171944l;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Select f171938e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Select f171939f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f171940g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f171941h;

    /* renamed from: i, reason: collision with root package name */
    public final int f171942i;

    /* renamed from: j, reason: collision with root package name */
    public final int f171943j;

    /* compiled from: NumericRangeSelectFilterView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<List<? extends String>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f171944l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(List<? extends String> list) {
            return G0.f406611a;
        }
    }

    public x(@Y61.k View view) {
        this.f171934a = view;
        this.f171935b = new D(view);
        View viewFindViewById = view.findViewById(R.id.inline_filter_from_select);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.select.Select");
        }
        this.f171938e = (Select) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.inline_filter_to_select);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.select.Select");
        }
        this.f171939f = (Select) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.apply_btn);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f171940g = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.reset_action_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f171941h = (TextView) viewFindViewById4;
        this.f171942i = C35835l0.d(R.attr.blue, view.getContext());
        this.f171943j = C35835l0.d(R.attr.gray28, view.getContext());
    }

    @Y61.k
    public static String k(@Y61.k String str, @Y61.k ArrayList arrayList) {
        Object next;
        String id2;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((Filter.InnerOptions.Options) next).getTitle(), str)) {
                break;
            }
        }
        Filter.InnerOptions.Options options = (Filter.InnerOptions.Options) next;
        return (options == null || (id2 = options.getId()) == null) ? "" : id2;
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Qd(@Y61.k Y41.a<G0> aVar) {
        this.f171935b.Qd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Sd(@Y61.k Y41.a<G0> aVar) {
        this.f171935b.Sd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Ud(boolean z12) {
        this.f171935b.Ud(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @Y61.l
    /* renamed from: getState, reason: from getter */
    public final Parcelable getF171936c() {
        return this.f171936c;
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void setTitle(@Y61.k String str) {
        this.f171935b.setTitle(str);
    }

    @Y61.k
    public final String w() {
        return String.valueOf(this.f171938e.m53getText());
    }

    @Y61.k
    public final String x() {
        return String.valueOf(this.f171939f.m53getText());
    }
}
