package com.avito.android.advertising.kebab;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.kebab.q;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.util.t;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdActionsBottomSheet.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/kebab/r;", "Lcom/avito/android/lib/util/t;", "Lcom/avito/android/advertising/kebab/q;", "Lcom/avito/android/lib/design/list_item/ListItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r extends t<q, ListItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f87859a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f87860b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super q, G0> f87861c;

    public r(@Y61.k ViewGroup viewGroup) {
        this.f87859a = viewGroup;
        this.f87860b = viewGroup.getContext();
    }

    @Override // com.avito.android.lib.util.t
    public final void a(View view, Object obj) {
        String string;
        ListItem listItem = (ListItem) view;
        q qVar = (q) obj;
        if (qVar instanceof q.a) {
            ((q.a) qVar).getClass();
            string = this.f87860b.getString(R.string.buzzoola_profile_promo_not_interesting);
        } else {
            if (!(qVar instanceof q.b)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((q.b) qVar).f87858c;
        }
        listItem.setTitle(string);
        listItem.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(1, this, qVar));
    }

    @Override // com.avito.android.lib.util.t
    public final View b() {
        ListItem listItem = new ListItem(this.f87860b, null);
        D6.f(listItem, (int) listItem.getContext().getResources().getDimension(R.dimen.kebab_horizontal_padding), 0, 0, 0, 14);
        listItem.setAppearance(C35835l0.j(R.attr.listItemDefaultMedium, listItem.getContext()));
        return listItem;
    }
}
