package com.avito.android.imv_goods_poll.items.check_box;

import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.ImvGoodsPollLinkBodyOption;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxItemsAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/check_box/k;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/avito/android/imv_goods_poll/items/check_box/k$a;", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ImvGoodsPollLinkBodyOption> f170650c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Y41.l<String, G0> f170651d;

    /* compiled from: CheckboxItemsAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/items/check_box/k$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ListItemCheckbox f170652b;

        public a(@Y61.k View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.checkbox_item);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCheckbox");
            }
            this.f170652b = (ListItemCheckbox) viewFindViewById;
        }
    }

    public /* synthetic */ k(List list, Y41.l lVar, int i12, C42822w c42822w) {
        this((i12 & 2) != 0 ? null : lVar, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f170650c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        List<ImvGoodsPollLinkBodyOption> list = this.f170650c;
        String title = list.get(i12).getTitle();
        ListItemCheckbox listItemCheckbox = ((a) c12).f170652b;
        listItemCheckbox.setTitle(title);
        listItemCheckbox.setChecked(list.get(i12).f133363b);
        listItemCheckbox.e(new j(this, i12, 0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        return new a(C0.b(viewGroup, R.layout.imv_goods_poll_checkbox_list_item, viewGroup, false));
    }

    public k(@l Y41.l lVar, @Y61.k List list) {
        this.f170650c = list;
        this.f170651d = lVar;
    }
}
