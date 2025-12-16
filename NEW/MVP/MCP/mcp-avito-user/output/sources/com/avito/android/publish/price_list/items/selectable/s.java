package com.avito.android.publish.price_list.items.selectable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.publish.price_list.items.selectable.t;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectablePriceListItemRe23View.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/price_list/items/selectable/s;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/price_list/items/selectable/q;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes16.dex */
public final class s extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f238697e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f238698b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ListItem f238699c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f238700d;

    public s(@Y61.k View view) {
        super(view);
        this.f238698b = view;
        ListItem listItem = (ListItem) view.findViewById(R.id.root_selectable_price_list);
        this.f238699c = listItem;
        Button button = (Button) view.findViewById(R.id.item_button_icon);
        this.f238700d = button;
        button.setOnTouchListener(new a(listItem));
        listItem.setMessageColor(C35835l0.e(R.attr.red600, view.getContext()));
    }

    @Override // com.avito.android.publish.price_list.items.selectable.q
    public final void Zd(@Y61.k t tVar) {
        int i12;
        if (tVar instanceof t.b) {
            i12 = R.attr.textIconEdit;
        } else {
            if (!(tVar instanceof t.a)) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.attr.textIconAdd;
        }
        FV.a aVar = FV.a.f4720a;
        Context context = this.f238698b.getContext();
        aVar.getClass();
        this.f238700d.setText(FV.a.b(i12, context));
    }

    @Override // com.avito.android.publish.price_list.items.selectable.q
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f238698b.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(6, aVar));
    }

    @Override // com.avito.android.publish.price_list.items.selectable.q
    public final void f(@Y61.l String str) {
        this.f238699c.setSubtitle(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f238698b.setOnClickListener(null);
    }

    @Override // com.avito.android.publish.price_list.items.selectable.q
    public final void setError(@Y61.l String str) {
        this.f238699c.setMessage(str);
    }

    @Override // com.avito.android.publish.price_list.items.selectable.q
    public final void setTitle(@Y61.k String str) {
        this.f238699c.setTitle(str);
    }
}
