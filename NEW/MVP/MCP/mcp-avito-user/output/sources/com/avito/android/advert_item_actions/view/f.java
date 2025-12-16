package com.avito.android.advert_item_actions.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.util.t;
import com.avito.android.remote.model.HideAction;
import com.avito.android.remote.model.ItemAction;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ActionsBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_item_actions/view/f;", "Lcom/avito/android/lib/util/t;", "Lcom/avito/android/remote/model/ItemAction;", "Lcom/avito/android/lib/design/list_item/ListItem;", "_avito_advert-item-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends t<ItemAction, ListItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f85865a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f85866b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.l<? super ItemAction, G0> f85867c;

    public f(@k ViewGroup viewGroup) {
        this.f85865a = viewGroup;
        this.f85866b = viewGroup.getContext();
    }

    @Override // com.avito.android.lib.util.t
    public final void a(View view, Object obj) {
        ListItem listItem = (ListItem) view;
        ItemAction itemAction = (ItemAction) obj;
        if (!(itemAction instanceof HideAction)) {
            throw new NoWhenBranchMatchedException();
        }
        HideAction hideAction = (HideAction) itemAction;
        Drawable drawableU = hideAction.getUseIcon() ? D6.u(listItem, R.drawable.ic_clear_24) : null;
        listItem.setTitle(hideAction.getTitle());
        ListItem.i(listItem, drawableU);
        listItem.setOnClickListener(new g(25, this, itemAction));
    }

    @Override // com.avito.android.lib.util.t
    public final View b() {
        ListItem listItem = new ListItem(this.f85866b, null);
        D6.f(listItem, D6.j(listItem, 16), 0, 0, 0, 14);
        return listItem;
    }
}
