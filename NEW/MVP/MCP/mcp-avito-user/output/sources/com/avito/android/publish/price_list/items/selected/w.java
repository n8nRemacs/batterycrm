package com.avito.android.publish.price_list.items.selected;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.publish.tag.OneLineTagView;
import com.avito.android.publish.tag.lines_layout.LinesLayout;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedPriceListItemsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/items/selected/w;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/price_list/items/selected/s;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class w extends com.avito.konveyor.adapter.b implements s {

    /* renamed from: b, reason: collision with root package name */
    public final Context f238752b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f238753c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinesLayout f238754d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f238755e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238756f;

    /* renamed from: g, reason: collision with root package name */
    public int f238757g;

    /* compiled from: SelectedPriceListItemsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.a<G0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final G0 invoke() {
            w wVar = (w) this.receiver;
            LinesLayout linesLayout = wVar.f238754d;
            int size = C42745f0.H(linesLayout.getShowedLines()).size();
            int childCount = linesLayout.getChildCount();
            boolean z12 = size < childCount || (wVar.f238756f && linesLayout.getShowedLines().size() > wVar.f238757g);
            int i12 = z12 ? 0 : 8;
            TextView textView = wVar.f238755e;
            textView.setVisibility(i12);
            if (z12) {
                int i13 = childCount - size;
                Context context = wVar.f238752b;
                Q q12 = i13 == 0 ? new Q(context.getText(R.string.price_list_hide_items_selected_button), Integer.valueOf(R.drawable.common_ic_arrow_expand_more_20)) : new Q(context.getResources().getQuantityString(R.plurals.price_list_selected_items_plurals, i13, Integer.valueOf(i13)), Integer.valueOf(R.drawable.common_ic_arrow_expand_less_20));
                CharSequence charSequence = (CharSequence) q12.f406619b;
                int iIntValue = ((Number) q12.f406620c).intValue();
                I5.a(textView, charSequence, false);
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, iIntValue, 0);
            }
            return G0.f406611a;
        }
    }

    public w(@Y61.k View view) {
        super(view);
        Context context = view.getContext();
        this.f238752b = context;
        View viewFindViewById = view.findViewById(R.id.selected_items);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.tag.lines_layout.LinesLayout");
        }
        LinesLayout linesLayout = (LinesLayout) viewFindViewById;
        this.f238754d = linesLayout;
        View viewFindViewById2 = view.findViewById(R.id.selected_expander_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238755e = (TextView) viewFindViewById2;
        this.f238757g = 3;
        linesLayout.setDividerSize(context.getResources().getDimensionPixelSize(R.dimen.price_list_selected_divider_margin));
        linesLayout.setOnMeasureChanged(new a(0, this, w.class, "updateExpanderTextView", "updateExpanderTextView()V", 0));
    }

    @Override // com.avito.android.publish.price_list.items.selected.s
    public final void D4(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f238755e.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(25, this, lVar));
    }

    @Override // com.avito.android.publish.price_list.items.selected.s
    public final void N3(@Y61.k List<com.avito.android.publish.price_list.items.selected.a> list) {
        int[] iArr;
        LinesLayout linesLayout = this.f238754d;
        linesLayout.removeAllViews();
        for (com.avito.android.publish.price_list.items.selected.a aVar : list) {
            View viewInflate = LayoutInflater.from(this.f238752b).inflate(R.layout.item_selected_price_list_tag, (ViewGroup) linesLayout, false);
            View viewFindViewById = viewInflate.findViewById(R.id.selected_price_list_tag);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.tag.OneLineTagView");
            }
            OneLineTagView oneLineTagView = (OneLineTagView) viewFindViewById;
            if (aVar.f238712c) {
                OneLineTagView.f245495c.getClass();
                iArr = OneLineTagView.f245497e;
            } else {
                OneLineTagView.f245495c.getClass();
                iArr = OneLineTagView.f245496d;
            }
            oneLineTagView.setId(aVar.hashCode());
            I5.a(oneLineTagView, aVar.f238711b, false);
            oneLineTagView.setState(iArr);
            oneLineTagView.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(26, this, aVar));
            linesLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.publish.price_list.items.selected.s
    public final void lc(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f238753c = lVar;
    }

    @Override // com.avito.android.publish.price_list.items.selected.s
    public final void n3(boolean z12) {
        this.f238756f = z12;
        LinesLayout linesLayout = this.f238754d;
        if (z12) {
            linesLayout.setMaxLines(Integer.MAX_VALUE);
        } else {
            linesLayout.setMaxLines(this.f238757g);
        }
    }

    @Override // com.avito.android.publish.price_list.items.selected.s
    public final void w5(int i12) {
        this.f238757g = i12;
        boolean z12 = this.f238756f;
        LinesLayout linesLayout = this.f238754d;
        if (z12) {
            linesLayout.setMaxLines(Integer.MAX_VALUE);
        } else {
            linesLayout.setMaxLines(i12);
        }
    }
}
