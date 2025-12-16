package com.avito.android.select_districts.items.selected;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.publish.tag.OneLineTagView;
import com.avito.android.publish.tag.lines_layout.LinesLayout;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedDistrictsTagsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select_districts/items/selected/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select_districts/items/selected/l;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f266993b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f266994c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f266995d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinesLayout f266996e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f266997f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f266998g;

    /* renamed from: h, reason: collision with root package name */
    public int f266999h;

    /* compiled from: SelectedDistrictsTagsItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final G0 invoke() {
            m mVar = m.this;
            LinesLayout linesLayout = mVar.f266996e;
            int size = C42745f0.H(linesLayout.getShowedLines()).size();
            int childCount = linesLayout.getChildCount();
            boolean z12 = size < childCount || (mVar.f266998g && linesLayout.getShowedLines().size() > mVar.f266999h);
            int i12 = z12 ? 0 : 8;
            TextView textView = mVar.f266997f;
            textView.setVisibility(i12);
            if (z12) {
                int i13 = childCount - size;
                Context context = mVar.f266994c;
                Q q12 = i13 == 0 ? new Q(context.getText(R.string.select_districts_hide_items_selected_button), Integer.valueOf(R.drawable.common_ic_arrow_expand_more_20)) : new Q(context.getResources().getQuantityString(R.plurals.select_districts_selected_items_plurals, i13, Integer.valueOf(i13)), Integer.valueOf(R.drawable.common_ic_arrow_expand_less_20));
                CharSequence charSequence = (CharSequence) q12.f406619b;
                int iIntValue = ((Number) q12.f406620c).intValue();
                I5.a(textView, charSequence, false);
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, iIntValue, 0);
            }
            int iB2 = y6.b(mVar.f266996e.getChildCount() != 0 ? 24 : 0);
            View view = mVar.f266993b;
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iB2);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectedDistrictsTagsItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ o f267002m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar) {
            super(0);
            this.f267002m = oVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.l<? super String, G0> lVar = m.this.f266995d;
            if (lVar != null) {
                lVar.invoke(this.f267002m.f267003a);
            }
            return G0.f406611a;
        }
    }

    public m(@Y61.k View view) {
        super(view);
        this.f266993b = view;
        this.f266994c = view.getContext();
        View viewFindViewById = view.findViewById(R.id.selected_districts_items);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.tag.lines_layout.LinesLayout");
        }
        LinesLayout linesLayout = (LinesLayout) viewFindViewById;
        this.f266996e = linesLayout;
        View viewFindViewById2 = view.findViewById(R.id.selected_districts_expander_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f266997f = (TextView) viewFindViewById2;
        this.f266999h = 3;
        linesLayout.setDividerSize(y6.b(6));
        linesLayout.setOnMeasureChanged(new a());
    }

    public final View B80(o oVar) {
        View viewInflate = LayoutInflater.from(this.f266994c).inflate(R.layout.selected_districts_tag, (ViewGroup) this.f266996e, false);
        View viewFindViewById = viewInflate.findViewById(R.id.selected_districts_tag);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.tag.OneLineTagView");
        }
        OneLineTagView oneLineTagView = (OneLineTagView) viewFindViewById;
        oneLineTagView.setId(oVar.hashCode());
        I5.a(oneLineTagView, oVar.f267005c, false);
        I5.b(oneLineTagView, new b(oVar));
        return viewInflate;
    }

    @Override // com.avito.android.select_districts.items.selected.l
    public final void D4(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f266997f.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(6, this, lVar));
    }

    @Override // com.avito.android.select_districts.items.selected.l
    public final void Es(@Y61.k Y41.l<? super String, G0> lVar) {
        this.f266995d = lVar;
    }

    @Override // com.avito.android.select_districts.items.selected.l
    public final void N3(@Y61.k List<o> list) {
        LinesLayout linesLayout = this.f266996e;
        linesLayout.removeAllViews();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linesLayout.addView(B80((o) it.next()));
        }
    }

    @Override // com.avito.android.select_districts.items.selected.l
    public final void V70(@Y61.k o oVar) {
        this.f266996e.addView(B80(oVar));
    }

    @Override // com.avito.android.select_districts.items.selected.l
    public final void fL() {
        this.f266996e.removeAllViews();
        n3(false);
    }

    @Override // com.avito.android.select_districts.items.selected.l
    public final void n3(boolean z12) {
        this.f266998g = z12;
        LinesLayout linesLayout = this.f266996e;
        if (z12) {
            linesLayout.setMaxLines(Integer.MAX_VALUE);
        } else {
            linesLayout.setMaxLines(this.f266999h);
        }
    }

    @Override // com.avito.android.select_districts.items.selected.l
    public final void np(int i12) {
        this.f266996e.removeViewAt(i12);
    }

    @Override // com.avito.android.select_districts.items.selected.l
    public final void w5(int i12) {
        this.f266999h = i12;
        boolean z12 = this.f266998g;
        LinesLayout linesLayout = this.f266996e;
        if (z12) {
            linesLayout.setMaxLines(Integer.MAX_VALUE);
        } else {
            linesLayout.setMaxLines(i12);
        }
    }
}
